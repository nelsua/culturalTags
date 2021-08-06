package com.company;

import java.util.ArrayList;
import java.util.Collections;


public class DealCards {
    //These are supposed to be the cards
   final String a = "# WW2";String b = "# MMA";String c = "# LALALAND"; String d = "# RT";String f = "# WTH";String g = "# FTP";
           String h="# NASA"; String i="# ASAP"; String j="# DOB"; String k="# IDK"; String l="# BFF"; String m="# MIA";

            //Cards are stored in this arrayList
            ArrayList<String> cards = new ArrayList<String>();

            // Here Cards are shuffle so user dont sam ecards everytime.
            ArrayList<String> cards(){
                cards.add(a);
                cards.add(b);
                cards.add(c);
                cards.add(d);
                cards.add(f);
                cards.add(g);
                cards.add(h);
                cards.add(i);
                cards.add(j);
                cards.add(k);
                cards.add(l);
                cards.add(m);
                Collections.shuffle(cards);
                return cards;
        }
}
