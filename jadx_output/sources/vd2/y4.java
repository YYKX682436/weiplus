package vd2;

/* loaded from: classes3.dex */
public final class y4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vd2.z4 f436032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f436033e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f436034f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ km2.m f436035g;

    public y4(vd2.z4 z4Var, int i17, int i18, km2.m mVar) {
        this.f436032d = z4Var;
        this.f436033e = i17;
        this.f436034f = i18;
        this.f436035g = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        gk2.e eVar;
        r45.nw1 nw1Var;
        gk2.e eVar2;
        vd2.z4 z4Var = this.f436032d;
        z4Var.getClass();
        int i17 = this.f436033e;
        if (i17 == -1 || i17 == this.f436034f) {
            return;
        }
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = z4Var.f436054e;
        android.content.Context context = finderLiveVisitorPluginLayout != null ? finderLiveVisitorPluginLayout.getContext() : null;
        r0Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        km2.m mVar = this.f436035g;
        if (mVar == null || (eVar2 = mVar.f309130e) == null || (str = ((mm2.c1) eVar2.a(mm2.c1.class)).f328852o) == null) {
            str = "";
        }
        jSONObject.put(dm.i4.COL_USERNAME, str);
        long j17 = (mVar == null || (eVar = mVar.f309130e) == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r) == null) ? 0L : nw1Var.getLong(0);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        jSONObject.put("liveId", b52.b.q(j17));
        ml2.r0.hj(r0Var, ml2.b4.f327262r, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        ml2.e4 e4Var = ml2.e4.f327380i;
        km2.n nVar = dk2.ef.H;
        ml2.r0.Ck(r0Var, context, e4Var, nVar != null ? nVar.f309160l : null, false, null, 24, null);
    }
}
