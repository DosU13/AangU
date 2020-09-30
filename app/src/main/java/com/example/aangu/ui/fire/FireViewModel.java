package com.example.aangu.ui.fire;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FireViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private String str = "Firebending is used by the people of the Fire Nation and is the most aggressive bending art. Dragons were the first firebenders; " +
            "they subsequently taught the Sun Warriors. For a long time, disciplines of firebending were taught to be fueled by hatred, as opposed to the " +
            "original source. As the element of power, firebenders have to be able to maintain a constant source of energy and balance in battle, " +
            "unleashing a volley of direct, successive attacks. Unlike other benders who depend on external sources of their elements to bend, firebenders " +
            "can create fire using their internal heat source in addition to controlling already existent flames. Skilled firebenders are able to fly using " +
            "powerful jets of flames. Due to its solar affinity, firebending is stronger during the day and at its full power at noon, but completely " +
            "ineffective during a solar eclipse. When a comet passes close to the planet, the power of a firebender is greatly increased. Firebending's " +
            "relatively simple and direct style contrasts with the changing style of waterbending. A notable feature of special firebenders is the " +
            "ability to create a hotter, blue fire; Azula was the only known firebender who demonstrated this extra-powerful flame. The sub-skills for " +
            "firebending are combustionbending, generating and redirecting lightning. Firebending is the element of power, and its season is summer.";

    public FireViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(str);
    }

    public LiveData<String> getText() {
        return mText;
    }
}