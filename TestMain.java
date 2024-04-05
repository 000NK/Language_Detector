import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestMain {

    @Test
    @DisplayName("Class Trigram:getFrequency() Test Cases")
    public void test1() {
        Trigram t1 = new Trigram("the", 5);
        Trigram t2 = new Trigram("af ", 10);
        Trigram t3 = new Trigram("ion", 59);
        Assertions.assertEquals(5, t1.getFrequency(), 0.0001, "Trigram Class: getFrequency() method failing test 1");
        Assertions.assertEquals(10, t2.getFrequency(), 0.0001,  "Trigram Class: getFrequency() method failing test 2");
        Assertions.assertEquals(59, t3.getFrequency(), 0.0001, "Trigram Class: getFrequency() method failing test 3");
    }

    @Test
    @DisplayName("Class Trigram:toString() Test Cases")
    public void test2() {
        Trigram t1 = new Trigram("the", 5);
        Trigram t2 = new Trigram("af ", 10);
        Trigram t3 = new Trigram("ion", 59);
        Assertions.assertEquals("\"the\": 5.0", t1.toString(), "Trigram Class: toString() method failing test 1");
        Assertions.assertEquals("\"af \": 10.0", t2.toString(), "Trigram Class: toString() method failing test2");
        Assertions.assertEquals("\"ion\": 59.0", t3.toString(), "Trigram Class: toString() method failing test3");
    }

    @Test
    @DisplayName("Class Trigram:incrementCount() Test Cases")
    public void test3() {
        Trigram t1 = new Trigram("the", 5);
        Trigram t2 = new Trigram("af ", 10);
        Trigram t3 = new Trigram("ion", 59);
        t1.incrementCount();
        t2.incrementCount();
        t2.incrementCount();
        t3.incrementCount();
        t3.incrementCount();
        t3.incrementCount();
        Assertions.assertEquals("\"the\": 6.0", t1.toString(), "Trigram Class: incrementCount() method failing to add correctly test 1");
        Assertions.assertEquals("\"af \": 12.0", t2.toString(), "Trigram Class: incrementCount() method failing to add correctly test 2");
        Assertions.assertEquals("\"ion\": 62.0", t3.toString(), "Trigram Class: incrementCount() method failing to add correctly test 3");
    }

    @Test
    @DisplayName("Class Trigram:equals(String) Test Cases")
    public void test4() {
        Trigram t1 = new Trigram("the", 5);
        Trigram t2 = new Trigram("af ", 10);
        Trigram t3 = new Trigram("ion", 59);
        Trigram t4 = new Trigram(" th", 59);
        Assertions.assertEquals(true, t1.equals("the"), "Trigram Class: equals() method failing test 1");
        Assertions.assertEquals(true, t2.equals("af "), "Trigram Class: equals() method failing test 2");
        Assertions.assertEquals(true, t3.equals("ion"), "Trigram Class: equals() method failing test 3");
        Assertions.assertEquals(true, t4.equals(" th"), "Trigram Class: equals() method failing test 4");
        Assertions.assertEquals(false, t1.equals("The"), "Trigram Class: equals() method failing test 5");
        Assertions.assertEquals(false, t2.equals("af"), "Trigram Class: equals() method failing test 6");
    }

    @Test
    @DisplayName("Class Main:getTrigam Tests")
    public void test5() {
        ArrayList<Trigram> trigrams = new ArrayList<>();
        trigrams.add(new Trigram("aaa", 3));  //0
        trigrams.add(new Trigram("bbb", 6));  //1
        trigrams.add(new Trigram(" aa", 2));  //2
        trigrams.add(new Trigram("aa ", 32)); //3
        trigrams.add(new Trigram("  a", 12)); //4
        trigrams.add(new Trigram("xyz", 22)); //5
        trigrams.add(new Trigram("   ", 8));  //6
        Assertions.assertEquals(0, Main.getTrigram(trigrams, "aaa"), "Main Class: getTrigam(ArrayList<Trigram>, String) test 1");
        Assertions.assertEquals(1, Main.getTrigram(trigrams, "bbb"), "Main Class: getTrigam(ArrayList<Trigram>, String) test 2");
        Assertions.assertEquals(2, Main.getTrigram(trigrams, " aa"), "Main Class: getTrigam(ArrayList<Trigram>, String) test 3");
        Assertions.assertEquals(3, Main.getTrigram(trigrams, "aa "), "Main Class: getTrigam(ArrayList<Trigram>, String) test 4");
        Assertions.assertEquals(4, Main.getTrigram(trigrams, "  a"), "Main Class: getTrigam(ArrayList<Trigram>, String) test 5");
        Assertions.assertEquals(5, Main.getTrigram(trigrams, "xyz"), "Main Class: getTrigam(ArrayList<Trigram>, String) test 6");
        Assertions.assertEquals(6, Main.getTrigram(trigrams, "   "), "Main Class: getTrigam(ArrayList<Trigram>, String) test 7");
        Assertions.assertEquals(-1, Main.getTrigram(trigrams, "a a"), "Main Class: getTrigam(ArrayList<Trigram>, String) test 8");
        Assertions.assertEquals(-1, Main.getTrigram(trigrams, "x  "), "Main Class: getTrigam(ArrayList<Trigram>, String) test 9");
    }

    @Test
    @DisplayName("Class Main:createTrigrams Tests")
    public void test6() {
        ArrayList<Trigram> trigrams = new ArrayList<>();
        Main.createTrigramsList(trigrams, Main.englishText1);
        Main.reverseSort(trigrams);
        Assertions.assertEquals("\"he \": 34.0", trigrams.get(0).toString(), "Method main: English create and sort Trigams test 1");
        Assertions.assertEquals("\" th\": 31.0", trigrams.get(1).toString(), "Method main: English create and sort Trigams test 2");
        trigrams.clear();
        Main.createTrigramsList(trigrams, Main.spanishText1);
        Main.reverseSort(trigrams);
        Assertions.assertEquals("\" de\": 29.0", trigrams.get(0).toString(), "Method main: Spanish create and sort Trigams test 1");
        Assertions.assertEquals("\"de \": 23.0", trigrams.get(1).toString(), "Method main: Spanish create and sort Trigams test 2");
        trigrams.clear();
        Main.createTrigramsList(trigrams, Main.sloveneText1);
        Main.reverseSort(trigrams);
        Assertions.assertEquals("\"je \": 16.0", trigrams.get(0).toString(), "Method main: Slovene create and sort Trigams test 1");
        Assertions.assertEquals("\" je\": 13.0", trigrams.get(1).toString(), "Method main: Slovene create and sort Trigams test 2");
        trigrams.clear();
        Main.createTrigramsList(trigrams, Main.hausaText1);
        Main.reverseSort(trigrams);
        Assertions.assertEquals("\"an \": 29.0", trigrams.get(0).toString(), "Method main: Hausu create and sort Trigams test 1");
        Assertions.assertEquals("\"ar \": 29.0", trigrams.get(1).toString(), "Method main: Hausu create and sort Trigams test 2");
    }

    @Test
    @DisplayName("Class Main:computeNormalizedDenominator Tests")
    public void test7() {
        ArrayList<Trigram> trigrams = new ArrayList<>();
        trigrams.add(new Trigram("aaa", 3));  //0
        trigrams.add(new Trigram("bbb", 6));  //1
        trigrams.add(new Trigram(" aa", 2));  //2
        trigrams.add(new Trigram("aa ", 32)); //3
        trigrams.add(new Trigram("  a", 12)); //4
        trigrams.add(new Trigram("xyz", 22)); //5
        trigrams.add(new Trigram("   ", 8));  //6
        Assertions.assertEquals(42.0119, Main.computeNormalizedDenominator(trigrams), 0.001, "Main Class: computeNormalizedDenominator test 1");
        trigrams.clear();
        trigrams.add(new Trigram("aaa", 2));  //0
        trigrams.add(new Trigram("bbb", 1));  //1
        trigrams.add(new Trigram(" aa", 23));  //2
        trigrams.add(new Trigram("aa ", 6)); //3
        trigrams.add(new Trigram("  a", 6)); //4
        trigrams.add(new Trigram("xyz", 9)); //5
        trigrams.add(new Trigram("   ", 1));  //6
        Assertions.assertEquals(26.2297, Main.computeNormalizedDenominator(trigrams), 0.001, "Main Class: computeNormalizedDenominator test 2");
    }

    @Test
    @DisplayName("Class Main:normalizeTrigrams Tests")
    public void test8() {
        ArrayList<Trigram> trigrams = new ArrayList<>();
        trigrams.add(new Trigram("aaa", 3));  //0
        trigrams.add(new Trigram("bbb", 6));  //1
        trigrams.add(new Trigram(" aa", 2));  //2
        trigrams.add(new Trigram("aa ", 32)); //3
        trigrams.add(new Trigram("  a", 12)); //4
        trigrams.add(new Trigram("xyz", 22)); //5
        trigrams.add(new Trigram("   ", 8));  //6
        Main.normalizeTrigrams(trigrams);
        Main.reverseSort(trigrams);
        Assertions.assertEquals(0.7616, trigrams.get(0).getFrequency(), 0.001, "Main Class: normalizeTrigrams test 1");
        Assertions.assertEquals(0.5236, trigrams.get(1).getFrequency(), 0.001, "Main Class: normalizeTrigrams test 2");
        Assertions.assertEquals(0.2856, trigrams.get(2).getFrequency(), 0.001, "Main Class: normalizeTrigrams test 3");
        Assertions.assertEquals(0.1904, trigrams.get(3).getFrequency(), 0.001, "Main Class: normalizeTrigrams test 4");
    }

    @Test
    @DisplayName("Class Main:cosineSimilarity Tests")
    public void test9() {
        Assertions.assertEquals(0.7413, Main.cosineSimilarity(Main.englishText1, Main.englishText2), 0.001, "Main Class: cosineSimilarity test 1");
        Assertions.assertEquals(0.6312, Main.cosineSimilarity(Main.spanishText1, Main.spanishText2), 0.001, "Main Class: cosineSimilarity test 2");
        Assertions.assertEquals(0.5375, Main.cosineSimilarity(Main.sloveneText1, Main.sloveneText2), 0.001, "Main Class: cosineSimilarity test 3");
        Assertions.assertEquals(0.7013, Main.cosineSimilarity(Main.hausaText1, Main.hausaText2), 0.001, "Main Class: cosineSimilarity test 4");
        Assertions.assertEquals(0.2094, Main.cosineSimilarity(Main.englishText1, Main.spanishText2), 0.001, "Main Class: cosineSimilarity test 5");
        Assertions.assertEquals(0.1728, Main.cosineSimilarity(Main.spanishText1, Main.sloveneText2), 0.001, "Main Class: cosineSimilarity test 6");
        Assertions.assertEquals(0.1351, Main.cosineSimilarity(Main.sloveneText1, Main.hausaText1), 0.001, "Main Class: cosineSimilarity test 7");
        Assertions.assertEquals(0.1378, Main.cosineSimilarity(Main.englishText1, Main.hausaText2), 0.001, "Main Class: cosineSimilarity test 8");
    }

    @Test
    @DisplayName("Class Main:returnLanguageOf Tests")
    public void test10() {
        Assertions.assertEquals("Hausa", Main.returnLanguageOf("Ƙaramar hukuma ce fitaccen ɗan siyasar nan Malam Aminu Kano wanda haifaffen ƙaramar hukumar Sudawa Gwale ne, amma yana da gidansa na ƙashin kansa a ƙaramar Hukumar Dala, gidan nasa ne gwamnatin tarayya ta mayar da shi cibiyar bincike da horas da dimokaradiyya domin girmamawa gareshi da kuma dawwamar da sunansa, adana koyarwarsa da ra'ayoyinsa ga al'ummai masu zuwa."), "Main Class: returnLanguageOf test 1");
        Assertions.assertEquals("Spanish", Main.returnLanguageOf("El Comité de Seguridad Nacional de la Cámara de Representantes consideró su resolución afirmando que Mayorkas ha cometido graves delitos y faltas por su manejo de la frontera sur, a pesar de que varios expertos constitucionales han dicho que la evidencia no alcanza ese alto nivel."), "Main Class: returnLanguageOf test 2");
        Assertions.assertEquals("Slovene", Main.returnLanguageOf("Pohlep po zlatu je pripeljal do postopkov za njegovo rafiniranje. Zaradi pomanjkljivega znanja so bili ljudje prepričani, da je rafiniranje pretvarjanje snovi in ne povečevanje njene čistoče. Mnogi učenjaki tistega časa so bili zato prepričani, da obstoja način, s katerim bi cenene kovine pretvorili v plemenite. Rodila se je alkimija in iskanje kamna modrosti, za katerega so menili, da takšno pretvorbo opravi s preprostim dotikom.[11] Večino takrat znanih metod rafiniranja je v svojem delu Naturalis Historia (Prirodopis) opisal Plinij Starejši."), "Main Class: returnLanguageOf test 3");
    }
}
