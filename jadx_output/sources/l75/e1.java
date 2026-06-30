package l75;

/* loaded from: classes12.dex */
public class e1 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wcdb.database.SQLiteDatabase f316957a;

    /* renamed from: b, reason: collision with root package name */
    public int f316958b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f316959c;

    /* renamed from: d, reason: collision with root package name */
    public long f316960d;

    public final synchronized l75.e1 a() {
        l75.e1 e1Var;
        e1Var = new l75.e1();
        e1Var.f316957a = this.f316957a;
        e1Var.f316958b = this.f316958b;
        e1Var.f316959c = this.f316959c;
        e1Var.f316960d = this.f316960d;
        return e1Var;
    }

    public final void b(com.tencent.wcdb.compat.SQLiteDatabase sQLiteDatabase, int i17, java.lang.String str) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (this) {
            this.f316957a = null;
            this.f316958b = i17;
            this.f316959c = str;
            this.f316960d = currentTimeMillis;
        }
    }

    public final void c(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, int i17, java.lang.String str) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (this) {
            this.f316957a = sQLiteDatabase;
            this.f316958b = i17;
            this.f316959c = str;
            this.f316960d = currentTimeMillis;
        }
    }
}
