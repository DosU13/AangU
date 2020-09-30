package com.example.aangu.ui.earth;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EarthViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private String str = "Earthbending originates in the Earth Kingdom and the first earthbenders were badgermoles. It demands a special connection with " +
            "the earth that is achievable with neutral jing, listening, though seemingly doing nothing and waiting for the right moment to strike. " +
            "Like waterbenders, earthbenders gain an advantage or disadvantage in battle based on the amount of earth around them, though the conditions " +
            "are not as extreme. Because of their element's stability and its stress on neutral jing, earthbenders stand their ground, absorbing or " +
            "intercepting attacks until they completely overwhelm their opponents. Unlike the other bending arts, earthbending's strength equally lies in " +
            "both offense and defense. Earthbending is in stark contrast to airbending as airbending's emphasis is on evasion and mobility while " +
            "earthbending's emphasis is on fortitude and strength. The sub-skills for earthbending are seismic sense, metalbending, and lavabending. " +
            "Earthbending is the element of substance, and its season is spring.";

    public EarthViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(str);
    }

    public LiveData<String> getText() {
        return mText;
    }
}