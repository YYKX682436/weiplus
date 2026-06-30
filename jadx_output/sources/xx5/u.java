package xx5;

/* loaded from: classes13.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f458111a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f458112b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f458113c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f458114d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f458115e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f458116f = 1;

    public void a(boolean z17, int i17, java.lang.String str) {
        java.lang.String string;
        java.lang.String str2;
        this.f458111a = str;
        this.f458112b = i17;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f458114d = currentTimeMillis;
        this.f458115e = currentTimeMillis - this.f458113c;
        this.f458116f = z17 ? 1 : 2;
        int d17 = this.f458112b == 3 ? by5.e.d() : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("20260502,");
        sb6.append(org.xwalk.core.XWalkEnvironment.d());
        sb6.append(",");
        sb6.append(this.f458111a);
        sb6.append(",");
        sb6.append(this.f458112b);
        sb6.append(",");
        sb6.append(this.f458113c);
        sb6.append(",");
        sb6.append(this.f458114d);
        sb6.append(",");
        sb6.append(this.f458115e);
        sb6.append(",");
        sb6.append(this.f458116f);
        sb6.append(",");
        sb6.append(org.xwalk.core.XWalkEnvironment.f347970c.getPackageName());
        sb6.append(",");
        sb6.append(android.os.Looper.myLooper() != android.os.Looper.getMainLooper() ? 0 : 1);
        sb6.append(",");
        sb6.append(by5.a4.b());
        sb6.append(",");
        com.tencent.xweb.b.m().getClass();
        sb6.append(com.tencent.xweb.b.f220208b);
        sb6.append(",");
        if (android.text.TextUtils.isEmpty(by5.d.f36428d)) {
            android.os.Bundle bundle = org.xwalk.core.XWalkEnvironment.f347981n;
            synchronized (bundle) {
                string = bundle.getString(com.tencent.soter.core.biometric.FingerprintManagerProxy.FINGERPRINT_SERVICE, "");
            }
            by5.d.f36428d = string;
            if (android.text.TextUtils.isEmpty(string)) {
                by5.d.f36428d = android.os.Build.FINGERPRINT;
            }
            str2 = by5.d.f36428d;
        } else {
            str2 = by5.d.f36428d;
        }
        sb6.append(str2.replaceAll(",", " "));
        sb6.append(",");
        sb6.append(d17);
        java.lang.String sb7 = sb6.toString();
        by5.c4.f("KVReportForWebViewCore", "report:" + sb7);
        by5.s0.t(24761, sb7);
    }
}
