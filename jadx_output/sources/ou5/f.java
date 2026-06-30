package ou5;

/* loaded from: classes12.dex */
public class f extends android.database.sqlite.SQLiteOpenHelper implements ou5.h {

    /* renamed from: d, reason: collision with root package name */
    public final android.database.sqlite.SQLiteDatabase f349062d;

    public f(android.content.Context context) {
        super(context, "Scheduler.db", (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 1);
        try {
            this.f349062d = getWritableDatabase();
        } catch (java.lang.Exception e17) {
            ku5.o.f312599c.e("ExperienceStorage", "%s", e17.toString());
        }
    }

    public static android.content.ContentValues a(ou5.c cVar) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("taskName", cVar.f349052a);
        contentValues.put("threadTime", java.lang.Long.valueOf(cVar.f349053b));
        contentValues.put("time", java.lang.Long.valueOf(cVar.f349054c));
        contentValues.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.Long.valueOf(cVar.f349056e));
        contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_MEDIA_RATE, java.lang.Float.valueOf(cVar.f349057f));
        contentValues.put("scheduler", cVar.f349055d);
        return contentValues;
    }

    public void b(java.util.Collection collection) {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = this.f349062d;
        if (sQLiteDatabase != null) {
            try {
                if (collection.size() <= 0) {
                    return;
                }
                try {
                    sQLiteDatabase.beginTransaction();
                    java.util.Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ou5.b bVar = (ou5.b) it.next();
                        ou5.c cVar = new ou5.c(bVar.f349042a, bVar.f349045d, bVar.f349046e, "");
                        cVar.f349056e = java.lang.System.currentTimeMillis();
                        sQLiteDatabase.insert("DisposedTask", null, a(cVar));
                    }
                } catch (java.lang.Exception e17) {
                    ku5.o.f312599c.e("ExperienceStorage", "%s", e17.toString());
                }
            } finally {
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null) {
            return;
        }
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS DisposedTask(_ID INTEGER PRIMARY KEY AUTOINCREMENT  NOT NULL, taskName TEXT NOT NULL, threadTime LONG NOT NULL, time LONG NOT NULL, rate REAL NOT NULL, timestamp LONG NOT NULL, scheduler TEXT NOT NULL )");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS timestampIndex ON DisposedTask(timestamp)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS taskNameIndex ON DisposedTask(taskName)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i17, int i18) {
    }
}
