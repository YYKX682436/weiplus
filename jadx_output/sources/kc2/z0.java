package kc2;

/* loaded from: classes8.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kc2.g1 f306546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f306547e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kc2.w1 f306548f;

    public z0(kc2.g1 g1Var, java.lang.String str, kc2.w1 w1Var) {
        this.f306546d = g1Var;
        this.f306547e = str;
        this.f306548f = w1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kc2.g1 g1Var = this.f306546d;
        com.tencent.mm.autogen.mmdata.rpt.RedDotFeatureLogStruct redDotFeatureLogStruct = g1Var.f306400x;
        if (redDotFeatureLogStruct != null) {
            java.lang.String str = this.f306547e;
            kc2.w1 w1Var = this.f306548f;
            kc2.q f17 = g1Var.f();
            kc2.g a17 = kc2.g.f306363e.a(str);
            int i17 = w1Var.f306517d;
            f17.getClass();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.util.List<kc2.g> labelBusiness = f17.f306477h;
            kotlin.jvm.internal.o.f(labelBusiness, "labelBusiness");
            synchronized (labelBusiness) {
                for (kc2.g gVar : labelBusiness) {
                    jSONObject.put(java.lang.String.valueOf(gVar.f306375d), gVar == a17 ? i17 : 0);
                }
            }
            redDotFeatureLogStruct.f59900d = redDotFeatureLogStruct.b("label_info", kc2.l1.e(jSONObject), true);
            redDotFeatureLogStruct.k();
        } else {
            com.tencent.mars.xlog.Log.e("FinderKaraInfoManager", "report but pendingReportData is null!");
        }
        this.f306546d.f306400x = null;
    }
}
