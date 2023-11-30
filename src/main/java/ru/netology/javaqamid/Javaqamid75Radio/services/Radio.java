package ru.netology.javaqamid.Javaqamid75Radio.services;

public class Radio {


    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation = getCurrentStation();
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = getCurrentVolume();

    public Radio() {

    }

    public Radio(int numberStation) {
        this.currentStation = numberStation;
        maxStation = numberStation - 1;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;

    }

    public void setToMaxStation() {
        currentStation = maxStation;
    }

    public void setToMinStation() {

        currentStation = minStation;
    }

    public void setNextStation() {
        if (currentStation < maxStation) {
            setCurrentStation(currentStation + 1);
        } else {
            setToMinStation();
        }
    }

    public void setPrevStation() {
        if (currentStation > minStation) {
            setCurrentStation(currentStation - 1);
        } else {
            setToMaxStation();
        }
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setToMaxVolume() {
        currentVolume = maxVolume;
    }

    public void setToMinVolume() {
        currentVolume = minVolume;
    }

    public void setIncreaseVolume() {
        if (currentVolume < maxVolume) {
            setCurrentVolume(currentVolume + 1);
        } else {
            setToMaxVolume();
        }
    }

    public void setDecreaseVolume() {
        if (currentVolume > minVolume) {
            setCurrentVolume(currentVolume - 1);
        } else {
            setToMinVolume();
        }
    }


}
