package zn0;

/* loaded from: classes3.dex */
public class v implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f474406d;

    /* renamed from: e, reason: collision with root package name */
    public int f474407e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f474408f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f474409g;

    /* renamed from: h, reason: collision with root package name */
    public int f474410h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f474411i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f474412m;

    /* renamed from: n, reason: collision with root package name */
    public int f474413n;

    public v(java.lang.String str) {
        this.f474407e = 0;
        this.f474408f = false;
        this.f474409g = true;
        this.f474410h = 50;
        this.f474411i = "";
        this.f474412m = false;
        this.f474406d = str;
    }

    public java.lang.String a() {
        return this.f474406d;
    }

    public void b(int i17) {
        this.f474413n = i17;
    }

    public java.lang.String toString() {
        return "RemoteUserConfig{mUserName='" + this.f474406d + "', mSeatPosition=" + this.f474413n + '}';
    }

    public v(java.lang.String str, int i17) {
        this.f474408f = false;
        this.f474409g = true;
        this.f474410h = 50;
        this.f474411i = "";
        this.f474412m = false;
        this.f474406d = str;
        this.f474407e = i17;
    }
}
