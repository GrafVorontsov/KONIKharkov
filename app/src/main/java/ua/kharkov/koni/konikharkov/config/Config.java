package ua.kharkov.koni.konikharkov.config;

public class Config {
    //JSON URL
    public static final String MARKA_URL = "http://www.koni.kharkov.ua/android/getMarka.php";
    public static final String MODEL_URL = "http://www.koni.kharkov.ua/android/getModel.php";
    public static final String CAR_URL = "http://www.koni.kharkov.ua/android/getCars.php";
    //tatic final String AMORT_URL = "http://www.koni.kharkov.ua/android/getAmort.php";
    public static final String AMORT_URL = "http://www.koni.kharkov.ua/android/getAmortNew.php";
    //static final String SEARCH_URL = "http://www.koni.kharkov.ua/android/getSearch.php?id=";
    public static final String SEARCH_URL = "http://www.koni.kharkov.ua/android/getSearchNew.php?id=";

    //Tags used in the JSON String
    public static final String MARKA_ID = "marka_id";
    public static final String MARKA_NAME = "marka_name";

    public static final String MODEL_ID = "model_id";
    public static final String MODEL_NAME = "model_name";

    public static final String CAR_ID = "car_id";
    public static final String CAR_NAME = "car_name";

}