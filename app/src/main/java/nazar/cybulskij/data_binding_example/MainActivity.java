package nazar.cybulskij.data_binding_example;

import android.databinding.DataBindingUtil;
import android.databinding.layouts.DataBindingInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import nazar.cybulskij.data_binding_example.databinding.ActivityMainBinding;
import nazar.cybulskij.data_binding_example.model.User;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        user = new User(23,"Nazarko","Zipolino");
        binding.setUser(user);
    }



    public  void onClick(View v){
        //1 ###
//        user.setAge(45);
//        user.setName("Pokemon");
//        user.setSurname("Pikachu");

        //2 ####
        user.age.set(45);
        user.name.set("Pokemon");
        user.surname.set("Pikachu");
    }
}
