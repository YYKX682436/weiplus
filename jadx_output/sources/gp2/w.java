package gp2;

/* loaded from: classes2.dex */
public final class w implements zy2.ub {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.g5 f274335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f274336e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f274337f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f274338g;

    public w(zy2.g5 g5Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, gp2.l0 l0Var, int i17) {
        this.f274335d = g5Var;
        this.f274336e = baseFinderFeed;
        this.f274337f = l0Var;
        this.f274338g = i17;
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
    }

    @Override // zy2.ub
    public void e3(int i17, int i18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
        zy2.g5 g5Var = this.f274335d;
        g5Var.getVideoView().setTag(com.tencent.mm.R.id.f486100k62, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f274336e;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = baseFinderFeed instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? baseFinderFeed : null;
        gp2.l0 l0Var = this.f274337f;
        int i17 = this.f274338g;
        if (baseFinderFeed2 != null) {
            sp2.i iVar = sp2.i.f411047a;
            long j17 = i17;
            ml2.x1 x1Var = ml2.x1.f328215v;
            java.lang.String str3 = l0Var.f274253l;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            c50.n0 n0Var = l0Var.G;
            if (n0Var != null) {
                n0Var.a(baseFinderFeed2, jSONObject, i17);
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            iVar.a(baseFinderFeed2, j17, x1Var, str3, jSONObject2);
        }
        boolean z17 = gp2.l0.N;
        com.tencent.mars.xlog.Log.i(l0Var.t(), "checkAutoPlayVideo: onFirstFrameRendStartCallback pos=" + i17 + ", feed=" + baseFinderFeed + " view=" + g5Var);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
    }
}
