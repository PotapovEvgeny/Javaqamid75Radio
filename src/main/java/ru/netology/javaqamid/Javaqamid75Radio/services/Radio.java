package ru.netology.javaqamid.Javaqamid75Radio.services;

public class Radio {

    private int currentRadio;
    private int currentVolume;

    public int getCurrentRadio() {
        return currentRadio;
    }

    public void setCurrentRadio(int newCurrentRadio) {
        if (newCurrentRadio < 0) {
            return;
        }
        if (newCurrentRadio > 9) {
            return;
        }
        currentRadio = newCurrentRadio;

    }

    public void setToMaxStation() {
        currentRadio = 9;
    }

    public void setToMinStation() {
        currentRadio = 0;
    }

    public void setNextStation() {
        if (currentRadio < 9) {
            setCurrentRadio(currentRadio + 1);
        } else {
            setToMinStation();
        }
    }

    public void setPrevStation() {
        if (currentRadio > 0) {
            setCurrentRadio(currentRadio - 1);
        } else {
            setToMaxStation();
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setToMaxVolume() {
        currentVolume = 100;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public void setIncreaseVolume() {
        if (currentVolume < 100) {
            setCurrentVolume(currentVolume + 1);
        } else {
            setToMaxVolume();
        }
    }

    public void setDecreaseVolume() {
        if (currentVolume > 0) {
            setCurrentVolume(currentVolume - 1);
        } else {
            setToMinVolume();
        }
    }


}
