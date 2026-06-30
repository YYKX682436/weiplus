package te2;

/* loaded from: classes10.dex */
public final class m9 extends te2.jc {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f418234m;

    /* renamed from: n, reason: collision with root package name */
    public kotlinx.coroutines.r2 f418235n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9(android.content.Context context, gk2.e liveData, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        super(context, liveData, statusMonitor, basePlugin);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f418234m = "FinderLiveVisitorSingSongNewPanelPresenter";
    }

    @Override // te2.jc
    public java.lang.String c() {
        return this.f418234m;
    }

    @Override // te2.jc
    public void f(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i(this.f418234m, "loadSongListData - call new version CGI");
        dk2.xf W0 = this.f418152g.W0();
        if (W0 != null) {
            gk2.e eVar = this.f418150e;
            ((dk2.r4) W0).P(((mm2.c1) eVar.a(mm2.c1.class)).f328852o, ((mm2.e1) eVar.a(mm2.e1.class)).f328983m, ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) eVar.a(mm2.e1.class)).f328985o, ((mm2.m6) eVar.a(mm2.m6.class)).f329249q.f234086b, new te2.e9(this, callback));
        }
    }

    @Override // te2.jc, fs2.a
    /* renamed from: g */
    public void onAttach(te2.lc callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        super.onAttach(callback);
        kotlinx.coroutines.r2 r2Var = this.f418235n;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f418235n = com.tencent.mm.plugin.finder.live.util.y.e(this.f418152g, null, null, new te2.l9(this, null), 3, null);
        com.tencent.mars.xlog.Log.i(this.f418234m, "onAttach: started observing normalRoomSingState");
    }

    @Override // te2.jc
    public void h() {
        java.lang.String str = this.f418234m;
        com.tencent.mars.xlog.Log.i(str, "setupAdapter - create new version adapter");
        bm2.p8 p8Var = new bm2.p8(this.f418150e);
        te2.lc lcVar = this.f418153h;
        te2.t9 t9Var = lcVar instanceof te2.t9 ? (te2.t9) lcVar : null;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = t9Var != null ? t9Var.f418454r : null;
        p8Var.f22233f = new te2.i9(this);
        p8Var.f22234g = new te2.j9(this, wxRecyclerView, p8Var);
        p8Var.f22236i = wxRecyclerView;
        this.f418154i = p8Var;
        if (wxRecyclerView != null) {
            wxRecyclerView.setAdapter(p8Var);
        }
        com.tencent.mars.xlog.Log.i(str, "setupAdapter - complete");
    }

    @Override // te2.jc, fs2.a
    public void onDetach() {
        kotlinx.coroutines.r2 r2Var = this.f418235n;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f418235n = null;
        com.tencent.mars.xlog.Log.i(this.f418234m, "onDetach: stopped observing normalRoomSingState");
        super.onDetach();
    }
}
