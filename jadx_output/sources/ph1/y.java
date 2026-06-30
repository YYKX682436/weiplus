package ph1;

/* loaded from: classes7.dex */
public class y implements ph1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f354363a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ph1.c f354364b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f354365c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph1.g0 f354366d;

    public y(ph1.g0 g0Var, ik1.b0 b0Var, ph1.c cVar, ik1.b0 b0Var2) {
        this.f354366d = g0Var;
        this.f354363a = b0Var;
        this.f354364b = cVar;
        this.f354365c = b0Var2;
    }

    @Override // ph1.c
    public void a(com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress wxaPkgLoadProgress) {
        if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
            java.lang.String str = this.f354366d.f354329f.f74803n;
            java.lang.String str2 = ((com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo) this.f354363a.f291824a).name;
        }
        ph1.c cVar = this.f354364b;
        if (cVar != null) {
            cVar.a(wxaPkgLoadProgress);
        }
        ph1.l lVar = (ph1.l) this.f354365c.f291824a;
        if (lVar != null) {
            int i17 = wxaPkgLoadProgress.f75394d;
            lVar.getClass();
            int max = java.lang.Math.max(java.lang.Math.min(i17, 100), 0);
            lVar.f354342i = max;
            fl1.a2 a2Var = lVar.f354339f;
            if (a2Var instanceof fl1.g1) {
                ((fl1.g1) a2Var).setProgress(max);
            }
        }
    }
}
