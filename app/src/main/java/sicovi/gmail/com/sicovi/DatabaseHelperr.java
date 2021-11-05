package sicovi.gmail.com.sicovi;

import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;

import java.util.ArrayList;

public interface DatabaseHelperr {
    void onCreate(SQLiteDatabase SQLiteDatabase);

    void onUpgrade(SQLiteDatabase SQLiteDatabase, int i, int i1);

    void addScreening(Screening screening);

    void addMenu(Menu m);

    ArrayList<Screening> getMenuArrayList();
}
