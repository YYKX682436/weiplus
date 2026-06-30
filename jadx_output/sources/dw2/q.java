package dw2;

/* loaded from: classes2.dex */
public final class q implements cw2.ea {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.autoplay.FinderMultiFlowVideoAutoPlayManager f244157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f244158e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoLayout f244159f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f244160g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f244161h;

    public q(com.tencent.mm.plugin.finder.video.autoplay.FinderMultiFlowVideoAutoPlayManager finderMultiFlowVideoAutoPlayManager, long j17, com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout, androidx.recyclerview.widget.k3 k3Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f244157d = finderMultiFlowVideoAutoPlayManager;
        this.f244158e = j17;
        this.f244159f = finderVideoLayout;
        this.f244160g = k3Var;
        this.f244161h = baseFinderFeed;
    }

    public boolean equals(java.lang.Object obj) {
        return true;
    }

    public int hashCode() {
        return hashCode();
    }

    @Override // cw2.ea
    public void onVideoPause() {
        com.tencent.mm.plugin.finder.report.r0 a76;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.Long l17 = (java.lang.Long) this.f244157d.f130765o.remove(java.lang.Long.valueOf(this.f244158e));
        if (l17 == null) {
            l17 = 0L;
        }
        long longValue = l17.longValue();
        if (longValue == 0) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onVideoPause] autoplay_duration=");
        long j17 = currentTimeMillis - longValue;
        sb6.append(j17);
        sb6.append("ms ");
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f244159f;
        sb6.append(finderVideoLayout.getFTPPTag());
        com.tencent.mars.xlog.Log.i("Finder.MultiFlowVideoAutoPlayManager", sb6.toString());
        android.content.Context context = finderVideoLayout.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 qt2Var = (nyVar == null || (a76 = nyVar.a7(-1)) == null) ? null : a76.f125284h;
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view = this.f244160g.itemView;
        jz5.l[] lVarArr = new jz5.l[7];
        lVarArr[0] = new jz5.l("view_id", "care_feed_card");
        lVarArr[1] = new jz5.l("finder_tab_context_id", qt2Var != null ? qt2Var.getString(2) : null);
        lVarArr[2] = new jz5.l("finder_context_id", qt2Var != null ? qt2Var.getString(1) : null);
        lVarArr[3] = new jz5.l("behaviour_session_id", qt2Var != null ? qt2Var.getString(0) : null);
        lVarArr[4] = new jz5.l("comment_scene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)) : null);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f244161h;
        lVarArr[5] = new jz5.l("feed_id", pm0.v.u(baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L));
        lVarArr[6] = new jz5.l("autoplay_duration", java.lang.Long.valueOf(j17));
        ((cy1.a) rVar).Cj("exit_autoplay", view, kz5.c1.k(lVarArr), 25496);
    }

    @Override // cw2.ea
    public void onVideoPlay() {
        com.tencent.mm.plugin.finder.video.autoplay.FinderMultiFlowVideoAutoPlayManager finderMultiFlowVideoAutoPlayManager = this.f244157d;
        java.util.HashMap hashMap = finderMultiFlowVideoAutoPlayManager.f130765o;
        long j17 = this.f244158e;
        if (hashMap.containsKey(java.lang.Long.valueOf(j17))) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.MultiFlowVideoAutoPlayManager", "[onVideoPlay] " + this.f244159f.getFTPPTag());
        finderMultiFlowVideoAutoPlayManager.f130765o.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    @Override // cw2.ea
    public void p4(long j17, long j18) {
    }
}
