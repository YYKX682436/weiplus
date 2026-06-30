package n44;

/* loaded from: classes4.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f335048e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335049f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n44.u0 f335050g;

    public t0(java.lang.String str, boolean z17, java.lang.String str2, n44.u0 u0Var) {
        this.f335047d = str;
        this.f335048e = z17;
        this.f335049f = str2;
        this.f335050g = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.jj4 e17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper$setThumb$1");
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(this.f335047d, options);
        ((ku5.t0) ku5.t0.f312615d).B(new n44.s0(this.f335050g, J2));
        java.lang.String str = this.f335048e ? "halfScreenVideoThumbDownload" : "halfScreenVideoThumbCache";
        m44.a.c(this.f335049f, J2, options);
        m44.d.b(J2 != null);
        boolean z17 = J2 != null;
        n44.u0 u0Var = this.f335050g;
        u0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPageParam", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPageParam", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper");
        i64.z zVar = u0Var.f335062e;
        m44.d.c(z17, (zVar == null || (e17 = zVar.e()) == null) ? null : e17.f377860i, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper$setThumb$1");
    }
}
