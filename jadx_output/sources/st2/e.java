package st2;

/* loaded from: classes3.dex */
public final class e implements pq.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f412267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.ce0 f412268b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k0 f412269c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk2.e f412270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.y23 f412271e;

    public e(java.lang.ref.WeakReference weakReference, r45.ce0 ce0Var, com.tencent.mm.plugin.finder.live.view.k0 k0Var, gk2.e eVar, r45.y23 y23Var) {
        this.f412267a = weakReference;
        this.f412268b = ce0Var;
        this.f412269c = k0Var;
        this.f412270d = eVar;
        this.f412271e = y23Var;
    }

    @Override // pq.b
    public void a(java.lang.Object appBundle) {
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig;
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig shareActionConfig;
        kotlin.jvm.internal.o.g(appBundle, "appBundle");
        if (appBundle instanceof l81.b1) {
            android.content.Context context = (android.content.Context) this.f412267a.get();
            gk2.e eVar = this.f412270d;
            if (context != null) {
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((com.tencent.mm.plugin.finder.live.viewmodel.aa) ((zy2.v9) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.v9.class))).U6(((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0), (l81.b1) appBundle);
            }
            zl2.q4 q4Var = zl2.q4.f473933a;
            l81.b1 b1Var = (l81.b1) appBundle;
            r45.ce0 i17 = q4Var.i(b1Var);
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig2 = b1Var.G;
            st2.c2 c2Var = st2.c2.f412249a;
            r45.y23 y23Var = this.f412271e;
            java.lang.String str2 = null;
            if (halfScreenConfig2 != null) {
                com.tencent.mm.plugin.appbrand.config.l e17 = halfScreenConfig2.e();
                e17.f77530j = true;
                com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo customSubjectInfo = q4Var.h(this.f412268b);
                kotlin.jvm.internal.o.g(customSubjectInfo, "customSubjectInfo");
                e17.A = customSubjectInfo;
                e17.H = true;
                if (y23Var != null) {
                    e17.f77541u = c2Var.b(eVar, y23Var, i17);
                }
                halfScreenConfig = e17.a();
            } else {
                halfScreenConfig = null;
            }
            b1Var.G = halfScreenConfig;
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            l81.p0 p0Var = b1Var.f317028i;
            java.lang.String a17 = p0Var != null ? p0Var.a() : null;
            h0Var.f310123d = a17;
            try {
                org.json.JSONObject jSONObject = a17 != null ? new org.json.JSONObject(a17) : new org.json.JSONObject();
                com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig3 = ((l81.b1) appBundle).G;
                if (halfScreenConfig3 != null && (shareActionConfig = halfScreenConfig3.f77373w) != null) {
                    str2 = shareActionConfig.f77391e;
                }
                jSONObject.put("finderLiveToken", str2);
                h0Var.f310123d = jSONObject.toString();
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.i("FinderLiveECRouter", "add finderLiveToken fail " + e18);
            }
            b1Var.f317028i = new st2.d(h0Var);
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig4 = b1Var.G;
            if (halfScreenConfig4 != null) {
                halfScreenConfig4.f77366p = new com.tencent.mm.plugin.finder.shopping.LivePanelHalfScreenListener(this.f412269c);
            }
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            if (y23Var == null || (str = y23Var.getString(26)) == null) {
                str = "";
            }
            jSONObject2.put("cookies", str);
            appBrandLaunchReferrer.f77322d = 1;
            appBrandLaunchReferrer.f77325g = jSONObject2.toString();
            b1Var.f317041s = appBrandLaunchReferrer;
            c2Var.k(b1Var);
        }
    }
}
