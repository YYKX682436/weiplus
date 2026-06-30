package te2;

/* loaded from: classes10.dex */
public final class y9 extends te2.jc {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f418549m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(android.content.Context context, gk2.e liveData, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        super(context, liveData, statusMonitor, basePlugin);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f418549m = "FinderLiveVisitorMusicSingSongPresenter";
    }

    @Override // te2.jc
    public java.lang.String c() {
        return this.f418549m;
    }

    @Override // te2.jc
    public void f(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i(this.f418549m, "loadSongListData - call old version CGI");
        dk2.xf W0 = this.f418152g.W0();
        if (W0 != null) {
            gk2.e eVar = this.f418150e;
            ((dk2.r4) W0).S(((mm2.c1) eVar.a(mm2.c1.class)).f328852o, ((mm2.e1) eVar.a(mm2.e1.class)).f328983m, new te2.v9(this, callback));
        }
    }

    @Override // te2.jc
    public void h() {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView;
        java.lang.String str = this.f418549m;
        com.tencent.mars.xlog.Log.i(str, "setupAdapter - create old version adapter");
        bm2.k8 k8Var = new bm2.k8(this.f418150e);
        k8Var.f22051i = new te2.w9(this);
        k8Var.f22052m = new te2.x9(this);
        this.f418154i = k8Var;
        te2.lc lcVar = this.f418153h;
        te2.fa faVar = lcVar instanceof te2.fa ? (te2.fa) lcVar : null;
        if (faVar != null && (wxRecyclerView = faVar.f418021t) != null) {
            wxRecyclerView.setAdapter(k8Var);
        }
        com.tencent.mars.xlog.Log.i(str, "setupAdapter - complete");
    }
}
