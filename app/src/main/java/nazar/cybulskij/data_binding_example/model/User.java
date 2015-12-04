package nazar.cybulskij.data_binding_example.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.support.v4.app.Fragment;

import nazar.cybulskij.data_binding_example.BR;

/**
 * Created by nazar on 04.12.15.
 */
public  class User  extends BaseObservable{

    // 1 ####
//    private String name;
//    private String surname;
//    private int age;
//
//
//    public User(int age, String name, String surname) {
//        this.age = age;
//        this.name = name;
//        this.surname = surname;
//    }
//    @Bindable
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//        notifyPropertyChanged(BR.age);
//    }
//
//    @Bindable
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//        notifyPropertyChanged(BR.name);
//    }
//
//    @Bindable
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//        notifyPropertyChanged(BR.surname);
//    }

    //2 #####

    public  final ObservableField<String> name = new ObservableField<>();
    public  final ObservableField<String> surname  = new ObservableField<>();
    public  final ObservableInt age = new ObservableInt();

    public User(int age, String name, String surname) {
        this.age.set(age);
        this.name.set(name);
        this.surname.set(surname);
    }
}


