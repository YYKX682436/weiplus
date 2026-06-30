package p4;

/* loaded from: classes13.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f351745a;

    public c(int i17) {
        this.f351745a = i17;
    }

    public final void a(java.lang.String str) {
        if (!str.equalsIgnoreCase(com.tencent.wcdb.database.SQLiteDatabaseConfiguration.MEMORY_DB_PATH) && str.trim().length() != 0) {
            try {
                android.database.sqlite.SQLiteDatabase.deleteDatabase(new java.io.File(str));
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public abstract void b(p4.b bVar, int i17, int i18);
}
