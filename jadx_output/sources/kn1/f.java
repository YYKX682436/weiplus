package kn1;

/* loaded from: classes12.dex */
public abstract class f extends kn1.a {

    /* renamed from: g, reason: collision with root package name */
    public static int f309601g;

    /* renamed from: h, reason: collision with root package name */
    public static byte[] f309602h = "key".getBytes();

    /* renamed from: i, reason: collision with root package name */
    public static android.content.SharedPreferences f309603i;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f309604b = dm.i4.COL_ID;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f309605c = "hello";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f309606d = "ok";

    /* renamed from: e, reason: collision with root package name */
    public kn1.g f309607e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f309608f;

    public static android.content.SharedPreferences d() {
        if (f309603i == null) {
            f309603i = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("BACKUP_CONFIG", 4);
        }
        return f309603i;
    }

    public abstract void c(java.lang.Object... objArr);

    public synchronized kn1.g e() {
        if (this.f309607e == null) {
            this.f309607e = new kn1.g();
        }
        return this.f309607e;
    }

    public abstract void f();

    public abstract void g();
}
