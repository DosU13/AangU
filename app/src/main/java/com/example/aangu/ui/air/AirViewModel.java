package com.example.aangu.ui.air;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AirViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private String str = "Airbending is the bending art used by the Air Nomads; the flying bison were the original airbenders. " +
            "It concentrates on speed and evasion, forgoing a strong offense for a greater defense. Though apparently lacking fatal finishing moves, " +
            "it is the most dynamic of all the bending arts. As the element of freedom, airbenders use their capability to bend unencumbered by the " +
            "ground or any other environmental factors and use their own momentum as a weapon, evading attacks with astounding agility to tire their " +
            "opponents out or building up massive inertia for explosive gusts of wind to make their counterattacks finishing moves. When resorting to " +
            "physical confrontation, airbenders are able to harness the immense, intangible power of wind. Airbenders can use a flight technique by " +
            "operating a glider and using the air to provide thrust and lift. Airbending's opposite is earthbending and the confrontational style that " +
            "serves as its foundation. The sub-skills of airbending are flight and spiritual projection. Flight has only been achieved by two people in " +
            "the entire history of airbending, namely Guru Laghima and Zaheer. Airbending is the element of freedom, and its season is fall";

    public AirViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(str);
    }

    public LiveData<String> getText() {
        return mText;
    }
}