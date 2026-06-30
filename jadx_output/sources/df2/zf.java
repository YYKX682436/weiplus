package df2;

/* loaded from: classes3.dex */
public final class zf implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f231959d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f231960e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.ug f231961f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f231962g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f231963h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f231964i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f231965m;

    public zf(yz5.l lVar, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore, df2.ug ugVar, android.view.View view, com.tencent.mm.plugin.finder.live.plugin.mg mgVar, android.view.View view2, dk2.zf zfVar) {
        this.f231959d = lVar;
        this.f231960e = liveRoomControllerStore;
        this.f231961f = ugVar;
        this.f231962g = view;
        this.f231963h = mgVar;
        this.f231964i = view2;
        this.f231965m = zfVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 165 || menuItem.getItemId() == 166) {
            this.f231959d.invoke(java.lang.Integer.valueOf(menuItem.getItemId()));
        } else {
            com.tencent.mm.plugin.finder.view.zq zqVar = com.tencent.mm.plugin.finder.view.zq.f133490a;
            gk2.e liveRoomData = this.f231960e.getLiveRoomData();
            com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f231961f.f291099e;
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = ubVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) ubVar : null;
            zqVar.c(2, liveRoomData, k0Var != null ? k0Var.getViewScope() : null, this.f231962g, this.f231963h, this.f231964i, menuItem, i17, this.f231965m);
        }
        com.tencent.mm.plugin.finder.view.oc.f132781a.a();
    }
}
