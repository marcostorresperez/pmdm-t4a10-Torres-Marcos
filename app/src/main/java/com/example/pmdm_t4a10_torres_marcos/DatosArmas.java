package com.example.pmdm_t4a10_torres_marcos;

import java.util.ArrayList;
import java.util.List;

public class DatosArmas {
    static List ARMAS = new ArrayList<Arma>();

    static {
        ARMAS.add(new Arma("Rifle de asalto", "36", "72", "SCAR", "2.1", R.drawable.scar, "https://fortniteestadisticas.com/armas-rifle-de-asalto-SCAR-legendario"));
        ARMAS.add(new Arma("Rifle de asalto a ráfagas", "33", "66", "FAMAS", "2.3", R.drawable.famas, "https://fortniteestadisticas.com/armas-rifle-de-asalto-a-rafagas-legendario"));
        ARMAS.add(new Arma("Rifle de francotirador de cerrojo", "116", "290", "AWP", "2.7", R.drawable.awp, "https://fortniteestadisticas.com/armas-rifle-de-francotirador-de-cerrojo-legendario"));
        ARMAS.add(new Arma("Subfusil compacto", "21", "42", "P90", "3", R.drawable.p90, "https://fortniteestadisticas.com/armas-sMG-p90-legendario"));
        ARMAS.add(new Arma("Escopeta pesada", "77", "192", "SPASH", "5.6", R.drawable.spash, "https://fortniteestadisticas.com/armas-escopeta-pesada-legendario"));

    }
}
