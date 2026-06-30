package xx5;

/* loaded from: classes13.dex */
public class t {

    /* renamed from: y, reason: collision with root package name */
    public static boolean f458086y;

    /* renamed from: a, reason: collision with root package name */
    public boolean f458087a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f458088b = true;

    /* renamed from: c, reason: collision with root package name */
    public boolean f458089c = false;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f458090d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f458091e = "others";

    /* renamed from: f, reason: collision with root package name */
    public long f458092f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f458093g = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f458094h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f458095i = 1;

    /* renamed from: j, reason: collision with root package name */
    public long f458096j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f458097k = -1;

    /* renamed from: l, reason: collision with root package name */
    public long f458098l = -1;

    /* renamed from: m, reason: collision with root package name */
    public long f458099m = -1;

    /* renamed from: n, reason: collision with root package name */
    public long f458100n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f458101o = 1;

    /* renamed from: p, reason: collision with root package name */
    public int f458102p = -1;

    /* renamed from: q, reason: collision with root package name */
    public long f458103q = -1;

    /* renamed from: r, reason: collision with root package name */
    public long f458104r = -1;

    /* renamed from: s, reason: collision with root package name */
    public long f458105s = -1;

    /* renamed from: t, reason: collision with root package name */
    public int f458106t = 1;

    /* renamed from: u, reason: collision with root package name */
    public int f458107u = -1;

    /* renamed from: v, reason: collision with root package name */
    public long f458108v = -1;

    /* renamed from: w, reason: collision with root package name */
    public long f458109w = -1;

    /* renamed from: x, reason: collision with root package name */
    public long f458110x = -1;

    public void a(int i17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f458093g = currentTimeMillis;
        this.f458094h = currentTimeMillis - this.f458092f;
        this.f458095i = i17;
        if (i17 == 1 && !f458086y) {
            f458086y = true;
            this.f458089c = true;
        }
        by5.c4.f("KVReportForWebView", "finishCreateWebView, isFirstCreatedWebView:" + this.f458089c);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("20260502,");
        sb6.append(org.xwalk.core.XWalkEnvironment.d());
        sb6.append(",");
        sb6.append(this.f458087a ? "1" : "0");
        sb6.append(",");
        sb6.append(this.f458088b ? "1" : "0");
        sb6.append(",");
        sb6.append(this.f458090d);
        sb6.append(",");
        sb6.append(this.f458092f);
        sb6.append(",");
        sb6.append(this.f458093g);
        sb6.append(",");
        sb6.append(this.f458094h);
        sb6.append(",");
        sb6.append(this.f458095i);
        sb6.append(",");
        sb6.append(this.f458096j);
        sb6.append(",");
        sb6.append(this.f458097k);
        sb6.append(",");
        sb6.append(this.f458098l);
        sb6.append(",");
        sb6.append(this.f458099m);
        sb6.append(",");
        sb6.append(this.f458100n);
        sb6.append(",");
        sb6.append(this.f458101o);
        sb6.append(",");
        sb6.append(this.f458102p);
        sb6.append(",");
        sb6.append(this.f458103q);
        sb6.append(",");
        sb6.append(this.f458104r);
        sb6.append(",");
        sb6.append(this.f458105s);
        sb6.append(",");
        sb6.append(this.f458106t);
        sb6.append(",");
        sb6.append(this.f458107u);
        sb6.append(",");
        sb6.append(this.f458108v);
        sb6.append(",");
        sb6.append(this.f458109w);
        sb6.append(",");
        sb6.append(this.f458110x);
        sb6.append(",");
        sb6.append(this.f458089c ? "1" : "0");
        sb6.append(",");
        sb6.append(org.xwalk.core.XWalkEnvironment.f347970c.getPackageName());
        sb6.append(",");
        sb6.append(android.os.Looper.myLooper() != android.os.Looper.getMainLooper() ? 0 : 1);
        sb6.append(",");
        sb6.append(by5.a4.b());
        sb6.append(",");
        sb6.append(this.f458091e);
        sb6.append(",");
        com.tencent.xweb.b.m().getClass();
        sb6.append(com.tencent.xweb.b.f220208b);
        java.lang.String sb7 = sb6.toString();
        by5.c4.f("KVReportForWebView", "report:" + sb7);
        by5.s0.t(24340, sb7);
    }
}
