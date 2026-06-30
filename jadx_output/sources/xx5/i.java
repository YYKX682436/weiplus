package xx5;

/* loaded from: classes13.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public boolean f458041a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f458042b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f458043c = -1;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f458044d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f458045e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f458046f = 1;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f458047g = null;

    /* renamed from: h, reason: collision with root package name */
    public long f458048h = -1;

    /* renamed from: i, reason: collision with root package name */
    public long f458049i = -1;

    /* renamed from: j, reason: collision with root package name */
    public long f458050j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f458051k = 0;

    public void a(int i17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f458049i = currentTimeMillis;
        this.f458050j = currentTimeMillis - this.f458048h;
        this.f458051k = i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("20260502,");
        sb6.append(this.f458041a ? "1" : "0");
        sb6.append(",");
        sb6.append(this.f458042b);
        sb6.append(",");
        sb6.append(this.f458043c);
        sb6.append(",");
        sb6.append(this.f458048h);
        sb6.append(",");
        sb6.append(this.f458049i);
        sb6.append(",");
        sb6.append(this.f458050j);
        sb6.append(",");
        sb6.append(this.f458051k);
        sb6.append(",");
        sb6.append(this.f458044d);
        sb6.append(",");
        sb6.append(this.f458045e);
        sb6.append(",");
        sb6.append(org.xwalk.core.XWalkEnvironment.dumpAppInfo());
        sb6.append(",");
        sb6.append(org.xwalk.core.XWalkEnvironment.f347970c.getPackageName());
        sb6.append(",");
        sb6.append(by5.a4.b());
        sb6.append(",");
        sb6.append(this.f458046f != 1 ? "2" : "1");
        sb6.append(",");
        com.tencent.xweb.b.m().getClass();
        sb6.append(com.tencent.xweb.b.f220208b);
        sb6.append(",");
        sb6.append(this.f458047g);
        java.lang.String sb7 = sb6.toString();
        by5.c4.f("KVReportForInstallRuntime", "report:" + sb7);
        by5.s0.t(24763, sb7);
    }

    public void b(zx5.f fVar) {
        java.lang.String str;
        this.f458041a = fVar.f477231d;
        this.f458042b = fVar.f477232e;
        this.f458043c = fVar.f477235h;
        this.f458044d = fVar.f477234g;
        this.f458046f = fVar.f477239l;
        try {
            str = fVar.b();
        } catch (java.lang.Exception unused) {
            str = "";
        }
        this.f458047g = str;
    }
}
