package km0;

/* loaded from: classes7.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f308987a;

    /* renamed from: c, reason: collision with root package name */
    public android.app.Application f308989c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Boolean f308990d;

    /* renamed from: e, reason: collision with root package name */
    public final km0.a f308991e = new km0.a();

    /* renamed from: b, reason: collision with root package name */
    public final im0.a f308988b = new im0.a();

    public b(java.lang.String str, android.app.Application application) {
        this.f308987a = str;
        this.f308989c = application;
    }

    public boolean a() {
        if (this.f308990d == null) {
            this.f308990d = java.lang.Boolean.valueOf(b(""));
        }
        return this.f308990d.booleanValue();
    }

    public boolean b(java.lang.String str) {
        java.lang.String str2 = this.f308987a;
        if (str2 != null) {
            if (str2.equals(com.tencent.mm.sdk.platformtools.x2.f193072b + str)) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String toString() {
        java.lang.String str = this.f308987a;
        return str != null ? str : super.toString();
    }
}
