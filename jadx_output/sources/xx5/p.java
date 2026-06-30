package xx5;

/* loaded from: classes13.dex */
public class p {

    /* renamed from: b, reason: collision with root package name */
    public int f458072b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f458073c;

    /* renamed from: a, reason: collision with root package name */
    public int f458071a = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f458074d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f458075e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f458076f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f458077g = 1;

    /* renamed from: h, reason: collision with root package name */
    public long f458078h = -1;

    /* renamed from: i, reason: collision with root package name */
    public long f458079i = -1;

    /* renamed from: j, reason: collision with root package name */
    public long f458080j = -1;

    /* renamed from: k, reason: collision with root package name */
    public long f458081k = -1;

    /* renamed from: l, reason: collision with root package name */
    public long f458082l = -1;

    /* renamed from: m, reason: collision with root package name */
    public long f458083m = -1;

    /* renamed from: n, reason: collision with root package name */
    public long f458084n = -1;

    /* renamed from: o, reason: collision with root package name */
    public long f458085o = -1;

    public void a(int i17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f458075e = currentTimeMillis;
        this.f458076f = currentTimeMillis - this.f458074d;
        this.f458077g = i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("20260502,");
        sb6.append(this.f458072b);
        sb6.append(",");
        sb6.append(com.tencent.xweb.WebView.getModuleName());
        sb6.append(",");
        sb6.append(this.f458071a);
        sb6.append(",");
        sb6.append(this.f458073c ? 1 : 2);
        sb6.append(",");
        sb6.append(this.f458074d);
        sb6.append(",");
        sb6.append(this.f458075e);
        sb6.append(",");
        sb6.append(this.f458076f);
        sb6.append(",");
        sb6.append(this.f458077g);
        sb6.append(",");
        sb6.append(this.f458078h);
        sb6.append(",");
        sb6.append(this.f458079i);
        sb6.append(",");
        sb6.append(this.f458080j);
        sb6.append(",");
        sb6.append(this.f458081k);
        sb6.append(",");
        sb6.append(this.f458082l);
        sb6.append(",");
        sb6.append(this.f458083m);
        sb6.append(",");
        sb6.append(this.f458084n);
        sb6.append(",");
        sb6.append(org.xwalk.core.XWalkEnvironment.f347970c.getPackageName());
        sb6.append(",");
        sb6.append(this.f458085o);
        java.lang.String sb7 = sb6.toString();
        by5.c4.f("KVReportForStandAloneChannel", "report:" + sb7);
        by5.s0.t(26318, sb7);
    }
}
