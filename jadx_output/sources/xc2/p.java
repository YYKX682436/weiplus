package xc2;

/* loaded from: classes2.dex */
public abstract class p extends xc2.o0 {

    /* renamed from: f, reason: collision with root package name */
    public final cl0.g f453227f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f453228g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f453229h;

    /* renamed from: i, reason: collision with root package name */
    public final long f453230i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f453231j;

    /* renamed from: k, reason: collision with root package name */
    public long f453232k;

    public p(cl0.g data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f453227f = data;
        this.f453228g = data.optString("url");
        this.f453229h = "";
        this.f453231j = "";
        java.lang.String optString = data.optString("uxinfo");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        this.f453229h = optString;
        this.f453230i = data.optLong("aid");
        java.lang.String optString2 = data.optString("ad_posid");
        kotlin.jvm.internal.o.f(optString2, "optString(...)");
        this.f453231j = optString2;
        this.f453232k = pm0.v.Z(data.optString("canvas_id"));
    }
}
