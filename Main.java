/*
 *Main
 *
 * 20.0.2
 *
 * Noa Kang
 *
 * Project 4 - Trigrams
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static String englishText1 = "Dennis Nicolaas Maria Bergkamp (Dutch pronunciation: [ˈdɛnəz ˈbɛr(ə)xkɑmp] ⓘ; born 10 May 1969) is a " +
            "Dutch professional football coach and former player who was most recently the Assistant manager of Ajax. Originally a " +
            "wide midfielder, Bergkamp was moved to main striker and then to second striker, where he remained throughout his playing " +
            "career. He is widely regarded as one of the greatest players of his generation, one of the greatest forwards in Premier " +
            "League history and amongst Ajax's and Arsenal's greatest ever players." +
            "The son of an electrician, Bergkamp was born in Amsterdam and played as an amateur in the lower leagues. He was spotted by Ajax " +
            "at age 11 and made his professional debut in 1986. Prolific form led to an international call-up with the Netherlands in 1990, " +
            "attracting the attention of several European clubs. Bergkamp signed for Italian club Inter Milan in 1993, where he had two " +
            "underwhelming seasons. After joining Arsenal in 1995, he rejuvenated his career, helping the club to win three Premier League " +
            "titles (one unbeaten), four FA Cup trophies, and reach the 2006 UEFA Champions League Final. Despite noting a desire to not go " +
            "into coaching, Bergkamp served as an assistant at Ajax between 2011 and 2017." +
            "With the Netherlands national team, Bergkamp was selected for Euro 1992, where he impressed, scoring three goals as his country " +
            "reached the semi-finals. At the 1998 FIFA World Cup, he scored a memorable winning goal in the final minute of the quarterfinal " +
            "against Argentina which has been regarded as one of the greatest FIFA World Cup goals. Bergkamp surpassed Faas Wilkes's record " +
            "to become the country's top scorer of all time in 1998, a record later eclipsed by Patrick Kluivert, Klaas-Jan Huntelaar, and " +
            "Robin van Persie." +
            "Bergkamp has been described by Jan Mulder as having \"the finest technique\" of any Dutch international and a \"dream for a " +
            "striker\" by teammate Thierry Henry. Bergkamp finished third twice in the FIFA World Player of the Year award and was selected by " +
            "Pelé as one of the FIFA 100 greatest living players. In 2007, he was inducted into the English Football Hall of Fame, the first " +
            "and only Dutch player ever to receive the honour. Bergkamp was inducted into the Premier League Hall of Fame in 2021. In 2017, " +
            "Bergkamp's goal against Newcastle United in 2002 was voted as the best Premier League goal of all time in the league's 25-year " +
            "history, involving a flick around Newcastle defender Nikos Dabizas before calmly tapping the ball into the net.";
    static String englishText2 = "Michael Jeffrey Jordan (born February 17, 1963), also known by his initials MJ, is an American businessman " +
            "and former professional basketball player. He played fifteen seasons in the National Basketball Association (NBA) between 1984 and 2003, " +
            "winning six NBA championships with the Chicago Bulls. He was integral in popularizing basketball and the NBA around the world in the 1980s " +
            "and 1990s, becoming a global cultural icon. His profile on the NBA website states that \"by acclamation, Michael Jordan is the " +
            "greatest basketball player of all time. Jordan played college basketball for three seasons under coach Dean Smith with the North " +
            "Carolina Tar Heels. As a freshman, he was a member of the Tar Heels' national championship team in 1982. Jordan joined the Bulls " +
            "in 1984 as the third overall draft pick and quickly emerged as a league star, entertaining crowds with his prolific scoring " +
            "while gaining a reputation as one of the game's best defensive players. His leaping ability, demonstrated by performing slam dunks " +
            "from the free-throw line in Slam Dunk Contests, earned him the nicknames \"Air Jordan\" and \"His Airness\". Jordan won his " +
            "first NBA title with the Bulls in 1991 and followed that achievement with titles in 1992 and 1993, securing a three-peat. Jordan abruptly " +
            "retired from basketball before the 1993–94 NBA season to play Minor League Baseball but returned to the Bulls in March 1995 and led " +
            "them to three more championships in 1996, 1997, and 1998, as well as a then-record 72 regular season wins in the 1995–96 NBA season. " +
            "He retired for the second time in January 1999, returning for two more NBA seasons from 2001 to 2003 as a member of the Washington Wizards." +
            " During his professional career, he was selected to play for the United States national team, winning four gold medals—at the 1983 Pan " +
            "American Games, 1984 Summer Olympics, 1992 Tournament of the Americas and 1992 Summer Olympics—while also being undefeated." +
            "Jordan's individual accolades and accomplishments include six NBA Finals Most Valuable Player (MVP) awards, ten NBA scoring titles " +
            "(both all-time records), five NBA MVP awards, ten All-NBA First Team designations, nine All-Defensive First Team honors, fourteen NBA " +
            "All-Star Game selections, three NBA All-Star Game MVP awards, three NBA steals titles, and the 1988 NBA Defensive Player of the Year " +
            "Award. He holds the NBA records for career regular season scoring average (30.1 points per game) and career playoff scoring " +
            "average (33.4 points per game). In 1999, he was named the 20th century's greatest North American athlete by ESPN and was second " +
            "to Babe Ruth on the Associated Press' list of athletes of the century. Jordan was twice inducted into the Naismith Memorial " +
            "Basketball Hall of Fame, once in 2009 for his individual career, and again in 2010 as part of the 1992 United States men's " +
            "Olympic basketball team (\"The Dream Team\"). He became a member of the United States Olympic Hall of Fame in 2009, a member " +
            "of the North Carolina Sports Hall of Fame in 2010, and an individual member of the FIBA Hall of Fame in 2015 and a \"Dream Team\" " +
            "member in 2017. Jordan was named to the NBA 50th Anniversary Team in 1996 and to the NBA 75th Anniversary Team in 2021.";
    static String spanishText1 = "La Selección de Estados Unidos extrañó a Cade Cowell, el nuevo refuerzo de Chivas, y cayó este sábado 0-1 ante " +
            "Eslovenia en un partido amistoso que se disputó en el Toyota Field de San Antonio, Texas." +
            "El único gol del compromiso lo marcó el delantero Nejc Gradisar, a los 26 minutos de la primera parte. El atacante aprovechó un " +
            "pase a la espalda de la defensa y tras ganar en velocidad definió muy bien con un suave toque por encima del portero Patrick Schulte." +
            "Aunque en el conjunto dirigido por Gregg Berhalter lo intentó, el equipo europeo mostró mucha solidez en defensa y mantuvo el resultado a su favor." +
            "Vale la pena recordar dos jugadores abandonaron el campo de entrenamiento de una semana previo a este duelo y uno de ellos fue Cade " +
            "Cowell, quien recibió permiso para salir de la concentración para completar su paso de los San Jose Earthquakes a las Chivas de " +
            "Guadalajara de la Liga MX." +
            "También se fue el defensor Jackson Ragen, de los Seattle Sounders, tras resentirse de una lesión en la rodilla y regresó a Seattle " +
            "para una evaluación y tratamiento adicionales." +
            "La selección de las ‘barras y las estrellas’ comienza así su preparación con miras a su primer torneo oficial en marzo, el Final " +
            "Four de la Liga de Naciones de la Concacaf." +
            "Después de haber ganado las dos primeras ediciones del torneo, Estados Unidos se enfrentará a Jamaica en la primera semifinal el 21 de " +
            "marzo en el estadio AT&T de Arlington, Texas.";
    static String spanishText2 = "Javier se unió a las categorías inferiores del Guadalajara a los nueve años de edad. En la temporada 2005-2006, " +
            "Javier jugó con el Chivas Coras, un equipo filial de Tepic, Nayarit. El Chicharito sobresalió de tal forma que en el Torneo Apertura 2006 " +
            "debutó con el primer equipo el 9 de septiembre de 2006 con la victoria de su equipo por 4-0 sobre el Club Necaxa, en donde Javier anotó " +
            "el último gol al minuto 83.14 Ese fue su único gol en ocho partidos disputados entre 2006 y 2007. También jugó 6 partidos entre " +
            "2007 y 2008 con el Guadalajara, aunque sin ninguna anotación. En el Torneo Apertura 2008 disputó 7 partidos aunque no tuvo ninguna " +
            "anotación, y en el Clausura 2009 anotó 4 goles en 15 partidos con el Guadalajara. No fue sino hasta el Torneo Apertura 2009 cuando Javier " +
            "comenzó a sobresalir en su equipo, terminando como el tercer máximo goleador del torneo, al haber anotado 11 goles en 17 partidos, convirtiéndose " +
            "en un jugador titular del Guadalajara." +
            "En el Torneo Bicentenario 2010 llegó a ser el goleador del Guadalajara. Javier empezó el torneo anotando 2 goles en cada uno de los 3 " +
            "primeros partidos del torneo, ante Toluca,15 ante Tigres,16 y ante Estudiantes.17 Este último fue visto como uno de los mejores partidos de " +
            "Javier con el Guadalajara, ya que, además de haber dado una asistencia y de haber anotado 2 goles, dirigió una voltereta cuando Chivas " +
            "iba perdiendo por 0-2.17 Luego de haber anotado goles ante Querétaro18 y ante Atlante,19 Debido a una lesión, Javier no anotó un solo gol " +
            "durante 5 jornadas, razón por la que no figuraba dentro de la alineación de su equipo. No obstante, seguía siendo el goleador del torneo, " +
            "con 8 anotaciones. En la jornada 11 Javier volvió a meter goles, al haber anotado un gol en la derrota de su equipo por 2-1 ante el Monterrey.20";
    static String sloveneText1 = "Ajdovščina je 5. septembra 2010 toplo pozdravila novo infrastrukturno pridobitev, prenovljeni štadion Primorja. Z njim se " +
            "je dokončno poslovila znamenita ''Mussolinijeva tribuna''." +
            "Zdaj že nekdanji štadion Primorja je bil zgrajen leta 1929, ko so hoteli Italijani pridobiti na svojo stran čim več mladih, med katerimi " +
            "bi lahko širili duh fašizma. Iz tistega časa je bila tudi pokrita ''Mussolinijeva'' tribuna. Ker je bilo igrišče ob Goriški cesti po " +
            "vojni zapuščeno in neprimerno, se je aktivnost odvijala na Policah. Leta 1948 se je začela obnova igrišča, ekipa pa je medtem trenirala " +
            "na travnati površini na letališču. Veliko je prispeval SGP Primorje in takratni predsednik Friderik Pavlič. Štadion je bila leta 1995 in " +
            "1998 zaradi nastopov v evropskih pokalih posodobljen. Skupaj z na novo postavljenimi sedeži nasproti pokrite tribune je ponujal 3000 mest." +
            "Objekt pa se je z letom 2009 dokončno poslovil. Nogometaši Primorja so takrat zaradi gradnje domače tekme v drugi ligi odigrali v Vipavi, " +
            "prvoligaški uvod v sezoni 2010/11 pa v Domžalah. Na prenovljenem štadionu, ki ga je odprl prijateljski nogometni turnir med Primorjem, " +
            "Hitom Gorico in Luko Koper, lahko nogometne predstave spremlja 1.600 gledalcev, od tega 1.300 na novi zahodni tribuni s streho. Osrednja " +
            "tribuna se lahko pohvali z udobnimi sedeži, novimi delovnimi prostori za novinarje ter VIP tribuno.";
    static String sloveneText2 = "Namíbija (uradno Repúblika Namíbija) je južnoafriška država, ki leži ob obali Atlantskega oceana. Na severu meji na " +
            "Angolo in Zambijo, na vzhodu na Bocvano in na jugu na Republiko Južno Afriko. Neodvisna je postala leta 1990, glavno mesto je Windhoek " +
            "(nemško Windhuk). Namibija ima 2,1 milijona prebivalcev in je zaradi velike puščave Namib ena najredkeje poseljenih držav na svetu." +
            "Sušna ozemlja današnje Namibije so že zelo zgodaj naselila ljudstva Sani, Damari in Nami, od približno 14. stoletja pa so se s severa " +
            "priseljevali Bantujci. Večina ozemlja je leta 1884 postala protektorat Nemškega cesarstva in ostala nemška kolonija do konca prve svetovne " +
            "vojne oziroma leta 1920, ko ga je Društvo narodov dodelilo Združenemu kraljestvu oz. Južnoafriški uniji, ki je uvedla svoje zakone in " +
            "leta 1948 politiko apartheida. Zaliv kitov in Pingvinski otoki so bili priključeni Kapski koloniji pod britansko krono leta 1878 in " +
            "vključeni v Južnoafriško unijo ob njeni ustanovitvi leta 1910. V drugi polovici 20. stoletja so zaradi vrste vstaj in zahtev po političnem " +
            "predstavništvu Združeni narodi prevzeli neposredno skrbništvo nad ozemljem. Leta 1973 je bila kot uradna predstavnica namibijskih ljudi " +
            "priznana Organizacija ljudstev jugozahodne Afrike (South West Africa People's Organisation, SWAPO). Namibija je ostala pod južnoafriško " +
            "upravo kot del jugozahodne Afrike. Po notranjem nasilju je Južna Afrika leta 1985 v Namibiji uvedla začasno upravo. Namibija je postala " +
            "neodvisna leta 1990, razen Zaliva kitov in Pingvinskih otokov, ki so ostali pod južnoafriškim nadzorom do leta 1994.";
    static String hausaText1 = "Bayan zaɓukan shekarar 1993, inda aka zaɓi shugaban CDS Mahamane Ousmane a matsayin Shugaban Nijar kuma kawancen da suka hada " +
            "da CDS sun sami rinjaye a majalisar, an nada Labo a matsayin Sakataren Jihakin Sadarwa, yana aiki a ƙarƙashin Ministan Sadarwa, Al'adu, Matasa " +
            "da Wasanni, Hassoumi Massoudou, a ranar 23 ga watan Afrilu shekarar 1993.  Ya yi aiki a wannan matsayin har zuwa lokacin da aka nada shi " +
            "Ministan Tsaro na kasa a gwamnatin Firayim Minista Souley Abdoulaye a ranar 5 ga watan Oktoba shekarar 1994; waccan gwamnatin ta yi aiki ne na " +
            "dan lokaci, duk da haka, kuma Labo ya bar gwamnati bayan CDS ta fadi a zaɓen majalisar dokoki na watan Janairu shekarar 1995." +
            "Zaɓen majalisar dokoki na shekarar 1999 ya kasance wanda ya samu nasarar kawancen National Movement for the Development of Society (MNSD) da CDS, " +
            "sannan aka nada Labo a matsayin Ministan Kayan aiki da Sufuri a ranar 5 ga watan Janairun shekarar 2000. An gyara muƙaminsa na minista a " +
            "ranar 17 ga watan Satumbar shekarar 2001, lokacin da aka nada shi a matsayin Ministan Kayan aiki, Gidaje, da Gudanar da Yankin, kuma a ranar " +
            "8 ga watan Nuwamba shekarar 2002 aka ba shi mukamin karamin Ministan Wasanni, Al'adu, da Wasannin Faransanci . Bayan zaben majalisar dokoki " +
            "na watan Disambar shekarar 2004, wanda aka zabi Labo a matsayin dan takarar CDS ga Majalisar Kasa daga mazabar Maradi, Labo ya ci gaba da " +
            "kasancewa a cikin gwamnati kuma an nada shi Ƙaramin Ministan Hydraulics, Muhalli, da Yaki da Hamada. a ranar 30 ga watan Disamba shekarar 2004.";
    static String hausaText2 = "An kafa ta a cikin shekara ta 1961, Muryar Najeriya ta fara rayuwa ne a Matsayin Waje na Kamfanin Watsa Labarai na Najeriya na " +
            "wancan lokacin (yanzu Gidan Rediyon Tarayyar Najeriya ). Sannan Firayim Minista Sir Abubakar Tafawa Balewa ya ba da aikin." +
            "Ci gaban da al'umma take da shi ya sanar da buƙatar samar da wata hanya ta waje wacce za a isar da bayanan iko game da yanayin Afirka zuwa ga duk " +
            "duniya. Har ma a wannan lokacin, watsa shi, ta amfani da 10WW HF mai watsawa, an iyakance shi ne zuwa Yammacin Afirka na awanni biyu a kowace rana " +
            "cikin Ingilishi da Faransanci. Awannin watsa shirye-shirye sun ƙaru zuwa shida a cikin shekara ta 1963 tare da ƙaddamar da samfura masu ɗaukar " +
            "hoto RCA 100 kW guda biyar." +
            "A cikin shekarar 1989, an sami masu watsa Brown Boveri guda biyar tare da tsarin antena . A ranar 5 ga Janairun 1990, VON ta zama mai cin gashin " +
            "kanta, kuma a cikin shekarar 1996, an ba da izinin daukar hoto na zamani guda 250 kW Thomcast AG. Wannan ya inganta watsa VON ga duk duniya. " +
            "Tashar watsa labaran tana kan hekta 40 ne a Ipokodo, Ikorodu a jihar Legas. Yayin da hedkwatar mulki take a Abuja, Babban Birnin Tarayya, Labarai " +
            "da Shirye-shirye sun fito ne daga duka sitoyon Lagos da Abuja . A cikin shekara ta 2012, VON ta ba da wata sabuwar fasahar watsa shirye-shiryen " +
            "biliyoyin nairori a Lugbe, Abuja.";


    public static void main(String[] args) {
        //declaring scanner , receive input
        Scanner scrn = new Scanner(System.in);
        String input;

        //printing out the output. result shows the language of an input text
        System.out.print("Paste/Write text: ");
        input = scrn.nextLine();
        System.out.println("Language is: " + returnLanguageOf(input));

    }//end main

    /*
     *Parses the parameter text for trigrams and stores all Trigrams found and their
     * frequency in the parameter trigrams ArrayList
     */
    public static void createTrigramsList(ArrayList<Trigram> trigrams, String text) {
        //for loop that collects trigrams from every 3 letters in the input text
        for (int i = 0; i < text.length()-3; i++) {

            String currentSequence = text.substring(i,i+3);
            int index = getTrigram(trigrams,currentSequence);

            //if index already exist in the ArrayList, increment its frequency
            if (index > -1) {
                trigrams.get(index).incrementCount();
            }//end if

            //else, add the new sequence found into ArrayList with frequency of 1
            else {
                trigrams.add(new Trigram(currentSequence , 1));
            }//end else

        }//end for loop

    }//end createTrigramsList

    /*
     * return the index of a Trigram in the given trigrams ArrayList that
     * matches the parameter text. If no matching trigram is found, return -1
     */
    public static int getTrigram(ArrayList<Trigram> trigrams, String text) {
        //for loop that checks each class object in ArrayList
        for (int i = 0; i < trigrams.size(); i++) {

            //returns the index of ArrayList where it has sequence that is identical to parameter text
            if (trigrams.get(i).equals(text)) {
                return i;

            }//end if

        }//end for loop

        return -1; //if none of class objects in ArrayList has parameter text as a sequence, returns -1

    }//end getTrigram

    /*
     * sort the parameter ArrayList in order of sequence with the highest frequency to lowest
     */
    public static void reverseSort(ArrayList<Trigram> trigrams) {
        //for loop scans through each component in ArrayList
        for(int i=0; i < trigrams.size(); i++) {
            for(int j=0; j < trigrams.size()-1-i; j++) {

                //if current trigram's frequency is less than that of next trigram, swap the position of current and next trigram
                if(trigrams.get(j).getFrequency() < trigrams.get(j+1).getFrequency()) {
                    Trigram temp = trigrams.get(j);
                    trigrams.set(j, trigrams.get(j+1));
                    trigrams.set(j+1, temp);
                }//end if

            }//end for loop

        }//end for loop

    }//end reverseSort

    /*
     * print from element 0 to count of the ArrayList trigrams
     */
    public static void printTrigrams(ArrayList<Trigram> trigrams, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(trigrams.get(i));
        }//end for loop

    }//end printTrigrams

    /*
     *Iterate over the elements of ArrayList trigrams and compute/return
     *the normalization denominator as defined by:
     *      -Add up the squares of all the frequencies in the ArrayList.
     *      -Square root this value.
     */
    public static double computeNormalizedDenominator(ArrayList<Trigram> trigrams) {
        double ans = 0; //variable that stores answer

        //solves normalizing formula:√(Σ(frequency)^2) and stores into variable 'ans'
        for (int i = 0; i < trigrams.size(); i++) {
            ans += Math.pow(trigrams.get(i).getFrequency() , 2);

        }//end for loop

        return Math.sqrt(ans); //square roots the result to finalize normalizing.

    }//end computeNormalizedDenominator

    /*
     * replace current frequency in Arraylist to itself divided by denominator found by computeNormalizedDenominator
     */
    public static void normalizeTrigrams(ArrayList<Trigram> trigrams) {
        double denominator = computeNormalizedDenominator(trigrams); // divisor variable

        //for loop divides each frequency by denominator variable
        for (int i = 0; i < trigrams.size(); i++) {
            trigrams.get(i).setFrequency(trigrams.get(i).getFrequency()/denominator);

        }//end for loop

    }//end normalizeTrigrams

    /*
     * find cosine similarity of two parameter texts' sequences' frequency
     */
    public static double cosineSimilarity (String text1, String text2) {
        double ans = 0; //variable that stores answer

        //two ArrayLists that stores sequence, normalized frequency of first and second parameter texts
        ArrayList<Trigram> firstText = new ArrayList<>();
        ArrayList<Trigram> secondText = new ArrayList<>();

        createTrigramsList(firstText, text1);
        createTrigramsList(secondText, text2);

        normalizeTrigrams(secondText);
        normalizeTrigrams(firstText);

        //for loop that finds cosine similarity of two texts using formula Σ(Frequency1 * Frequency2) *uses frequency of matching sequence
        for (int i = 0; i < firstText.size(); i++) {

            //if one sequence in first text exists in second text, calculates cosine similarity
            if (getTrigram(secondText , firstText.get(i).getSequence()) > -1) {
                ans += firstText.get(i).getFrequency()*
                        (secondText.get(getTrigram(secondText, firstText.get(i).getSequence())).getFrequency());
            }//end if

        }//end for loop

        return ans;

    }//end cosineSimilarity

    /*
     * returns language the parameter text was written
     * by comparing cosine similarity of parameter text and sample text of each language
     */
    public static String returnLanguageOf(String text) {

        //variables that store cosine similarity of parameter text and sample texts for convenience
        double cosineEnglish = cosineSimilarity(englishText1,text);
        double cosineSpanish = cosineSimilarity(spanishText1,text);
        double cosineSlovene = cosineSimilarity(sloveneText1,text);
        double cosineHausa = cosineSimilarity(hausaText1,text);

        //if the cosine similarity between parameter text and sample text of certain language is over 0.4, it is considered as that language
        if ((cosineEnglish > 0.4)) {
            return "English";
        }
        else if (cosineSimilarity(spanishText1, text) > 0.4) {
            return "Spanish";
        }
        else if (cosineSimilarity(sloveneText1, text) > 0.4) {
            return "Slovene";
        }
        else if (cosineSimilarity(hausaText1, text) > 0.4) {
            return "Hausa";
        }

        //if code cannot find matching language, it guesses with the language that most matches(highest cosine similarity) the parameter text
        else {
            double highestCosine = Math.max(Math.max(cosineEnglish,cosineSpanish),Math.max(cosineSlovene,cosineHausa));

            if (highestCosine == cosineEnglish) {
                return "Unknown. Best guess: English";
            }
            else if (highestCosine == cosineSpanish) {
                return "Unknown. Best guess: Spanish";
            }
            else if (highestCosine == cosineSlovene) {
                return "Unknown. Best guess: Slovene";
            }
            else{
                return "Unknown. Best guess: Hausa";

            }//end if - else if - else

        }//end if - else if - else

    }//end ReturnLanguageOf

}//end class Main