package w91;

/* loaded from: classes13.dex */
public abstract class f implements w91.d {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f444065c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f444066d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f444067e = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f444064b = b();

    /* renamed from: a, reason: collision with root package name */
    public w91.e f444063a = w91.e.POST;

    public f(java.lang.String str, java.lang.String str2) {
        this.f444065c = str;
        this.f444066d = str2;
    }

    public abstract java.lang.String b();

    public void c(java.lang.String str, java.lang.String str2) {
        ((java.util.HashMap) this.f444067e).put(str, str2);
    }

    public void d() {
        c("Content-Type", "text/xml;charset=\"utf-8\"");
        c("Connection", "close");
    }
}
