//package sicovi.gmail.com.sicovi;
//
//import android.content.ContentValues;
//import android.content.Context;
//import android.database.Cursor;
//import android.database.sqlite.SQLiteDatabase;
//import android.view.Menu;
//
//import java.util.ArrayList;
//
//public class DatabaseHelper implements DatabaseHelperr {
//public ArrayList<Menu>menuArrayList = new ArrayList<>();
//
//    public ArrayList<Screening>screeningArrayList = new ArrayList<>();
//    public static String DATABASENAME="Screening";
//    public static String TBLSCREENING="Screening";
//    public static String TBLMENU="Screening";
//
//    public static String ID="id";
//    public static String NAMA="nama";
//    public static String UMUR="umur";
//    public static String JENISKELAMIN="jeniskelamin";
//    public static String ALAMAT="alamat";
//
//    public static String JUDUL="judul";
//    public static String KETERANGAN="keterangan";
//    public static String ICON="icon";
//
//    Context c;
//    public DatabaseHelper(Context context){
//        super(context, DATABASENAME, null, 1);
//        c = context;
//    }
//@Override
//    public void onCreate(SQLiteDatabase SQLiteDatabase){
//        String tabel = ("CREATE TABLE IF NOT EXISTS "+TBLSCREENING+" " +
//                "("+ID+" INTEGER PRIMARY KEY, "+NAMA+" TEXT, "+UMUR+" TEXT, "+JENISKELAMIN+" TEXT, "+ALAMAT+" TEXT);
//                SQLiteDatabase.execSQL(tabel);
//        String tabelMenu = ("CREATE TABLE IF NOT EXISTS "+TBLMENU+" " +
//                "("+ID+" INTEGER PRIMARY KEY, "+JUDUL+" TEXT, "+KETERANGAN+" TEXT, "+ICON+" INTEGER);
//                SQLiteDatabase.execSQL(tabelMenu);
//        System.out.println("Sukses tabel");
//    }
//    @Override
//    public void onUpgrade(SQLiteDatabase SQLiteDatabase, int i, int i1) {
//        SQLiteDatabase.execSQL("DROP TABLE If EXISTS "+TBLSCREENING);
//        SQLiteDatabase.execSQL("DROP TABLE If EXISTS "+TBLMENU);
//        onCreate(SQLiteDatabase);
//        System.out.println("Update Table");
//
//    }
//    @Override
//    public void addScreening(Screening screening){
//        SQLiteDatabase db = this.getWritableDatabase();
//        ContentValues cv = new ContentValues();
//        cv.put (ID, screening);
//        cv.put(NAMA, screening.nama);
//        cv.put(UMUR, screening.umur);
//        cv.put(JENISKELAMIN, screening.jenis_kelamin);
//        cv.put(ALAMAT, screening.alamat);
//    }
//
//    @Override
//    public void addMenu(Menu m){
//        SQLiteDatabase db = this.getWritableDatabase();
//        ContentValues cv = new ContentValues();
//        cv.put(ID, m.id);
//        cv.put(JUDUL, m.judul);
//        cv.put(KETERANGAN, m.keterangan);
//        cv.put(ICON, m.icon);
//        db.insert(TBLMENU, null,cv);
//        db.close();
//    }
//
//    @Override
//    public ArrayList<Screening> getMenuArrayList() {
//        screeningArrayList.clear();
//        SQLiteDatabase db = this.getWritableDatabase();
//        Cursor c = db.rawQuery("SELECT * FROM "+TBLSCREENING, null);
//        if (c.getCount() != 0){
//            if (c.moveToFirst()){
//                do{
//                    Screening screening = new Screening();
//                    screening.id =
//                            c.getInt(c.getColumnIndex(ID));
//                    screening.nama =
//                            c.getString(c.getColumnIndex(NAMA));
//                    screening.umur =
//                            c.getString(c.getColumnIndex(UMUR));
//                    screening.jenis_kelamin =
//                            c.getString(c.getColumnIndex(JENISKELAMIN));
//                    screening.alamat =
//                            c.getString(c.getColumnIndex(ALAMAT));
//
//                }
//            }
//
//       c.close();
//            db.close();
//            return screeningArrayList;
//
//        }
//        public ArrayList<Menu> getMenus(){
//            menuArrayList.clear();
//            SQLiteDatabase db = this.getWritableDatabase();
//            Cursor c = db.rawQuery("SELECT + FROM"+TBLMENU, null);
//            if(c.getCount() != 0) {
//                if (c.moveToFirst()) {
//                    do {
//                        Menu menu = new Menu() {
//                            menu.id =
//                                    c.getInt(c.getColumnIndex(ID));
//                            menu.judul =
//                                    c.getString(c.getColumnIndex(JUDUL));
//                            menu.ket=
//                                    c.getString(c.getColumnIndex(KETERANGAN));
//                            menu.icon=
//                                    c.getInt(c.getColumnIndex(ICON));
//                            menuList.add(menu);
//                        } while (c.moveToNext()) ;
//
//                    }
//                }
//                c.close();
//                db.close();
//                return menuArrayList;
//            }
//            public void deleteScreening(int ID){
//                SQLiteDatabase db = this.getWritableDatabase();
//                db.delete(TBLSCREENING, ID+ "="+ID,null);
//                }
//            }
//
//
//    private SQLiteDatabase getWritableDatabase() {
//        return null;
//    }
//}
//
//    private SQLiteDatabase getWritableDatabase() {
//        return null;
//    }
