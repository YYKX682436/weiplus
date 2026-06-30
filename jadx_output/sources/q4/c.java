package q4;

/* loaded from: classes13.dex */
public class c implements p4.b {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f360006e = new java.lang.String[0];

    /* renamed from: d, reason: collision with root package name */
    public final android.database.sqlite.SQLiteDatabase f360007d;

    public c(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        this.f360007d = sQLiteDatabase;
    }

    public void a() {
        this.f360007d.beginTransaction();
    }

    public void b() {
        this.f360007d.endTransaction();
    }

    public void c(java.lang.String str) {
        this.f360007d.execSQL(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f360007d.close();
    }

    public android.database.Cursor f(java.lang.String str) {
        return i(new p4.a(str));
    }

    public android.database.Cursor i(p4.h hVar) {
        return this.f360007d.rawQueryWithFactory(new q4.a(this, hVar), hVar.a(), f360006e, null);
    }

    public void j() {
        this.f360007d.setTransactionSuccessful();
    }
}
