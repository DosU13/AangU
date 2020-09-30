package com.example.aangu.ui.water;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WaterViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private String str = "Waterbending is practiced by some people of the Water Tribe. A versatile element, it is unique in the sense that the original " +
            "bender of the element was not an animal, but rather the Moon. Similar to their element, waterbenders are extremely adaptable and versatile. " +
            "Waterbending concentrates on the flow of energy, focusing less on strength and more on turning the opponent's own energy against them. While " +
            "a bender's victory in battle depends on their skill or ingenuity, waterbenders gain a serious advantage or disadvantage depending on the " +
            "amount of water around them, although highly skilled waterbenders can draw water from anywhere, such as draw humidity from the air and bend " +
            "the water in living things, especially plants. As the element of change, waterbenders can fluidly and quickly alternate from defense to " +
            "offense, from a wall of ice to a jet of water, turning their opponent's strength against them. Due to its lunar sympathy, waterbending is " +
            "stronger at night and ineffective during a lunar eclipse or when the Moon Spirit dies. However, to counter waterbending's ineffectiveness " +
            "during a lunar eclipse, waterbenders gain immense power during the peak of the full moon. The opposite of waterbending is firebending, " +
            "with its relatively stagnant, direct philosophy. The sub-skills for waterbending are healing and bloodbending. Waterbending is the element of " +
            "change, and its season is winter.";

    public WaterViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(str);
    }

    public LiveData<String> getText() {
        return mText;
    }
}