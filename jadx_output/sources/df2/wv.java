package df2;

/* loaded from: classes3.dex */
public final class wv implements jk2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.yv f231723a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f231724b;

    public wv(df2.yv yvVar, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore) {
        this.f231723a = yvVar;
        this.f231724b = liveRoomControllerStore;
    }

    public void a() {
        com.tencent.mm.plugin.finder.live.plugin.wg0 wg0Var = (com.tencent.mm.plugin.finder.live.plugin.wg0) this.f231723a.R6(com.tencent.mm.plugin.finder.live.plugin.wg0.class);
        if (wg0Var != null) {
            wg0Var.u1(true);
        }
    }

    public gk2.e b() {
        return this.f231724b.getLiveRoomData();
    }

    public r45.qt2 c() {
        com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f231723a.f291099e;
        com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = ubVar instanceof com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout ? (com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) ubVar : null;
        if (finderLiveVisitorPluginLayout != null) {
            return finderLiveVisitorPluginLayout.getReportObj();
        }
        return null;
    }
}
