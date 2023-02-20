package org.mmu.tinkoffkinolab;


import android.text.TextWatcher;

public class Constants
{
    public static final String ADAPTER_FILM_ID = "ID";
    public static final String ADAPTER_TITLE = "Title";
    public static final String ADAPTER_CONTENT = "Content";
    public static final String ADAPTER_IMAGE_PREVIEW_FILE_PATH = "preview_file_path";
    public static final String FAVOURITES_CASH_DIR_NAME = "favourites_image_cache";
    public static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String FAVOURITES_LIST_FILENAME = "favourites.txt";
    /**
     * Демо-ключ неофициального API Кинопоиска
     *
     * @see <a href="https://kinopoiskapiunofficial.tech/">Kinopoisk Api Unofficial</a>
     *
     * @apiNote Этот ключ не имеет ограничений по количеству запросов в сутки, но имеет ограничение
     *      20 запросов в секунду.
     *
     * @implSpec В качестве альтернативы вы можете зарегистрироваться самостоятельно и получить
     *      собственный ключ, но тогда будет действовать ограничение в 500 запросов в день.
     */
    static final String KINO_DEMO_API_KEY = "e30ffed0-76ab-4dd6-b41f-4c9da2b2735b";
    static final String ADAPTER_POSTER_PREVIEW_URL = "ImageUrl";
    static final String UNKNOWN_WEB_ERROR_MES = "Ошибка загрузки данных по сети:";
    static final String KINO_API_ERROR_MES = "Ошибка API KinoPoisk";
    
    enum TopFilmsType
    {
        /**
         * Почему-то загружает ТОП-700 (а не 100 фильмов?!)
         */
        TOP_100_POPULAR_FILMS,
        TOP_250_BEST_FILMS,
        TOP_AWAIT_FILMS
    }
}
