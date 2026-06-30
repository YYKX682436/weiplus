package df2;

/* loaded from: classes3.dex */
public final class ag implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f229714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f229715e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f229716f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f229717g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f229718h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ df2.ug f229719i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f229720m;

    public ag(yz5.l lVar, dk2.zf zfVar, com.tencent.mm.plugin.finder.live.plugin.mg mgVar, android.view.View view, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore, df2.ug ugVar, android.view.View view2) {
        this.f229714d = lVar;
        this.f229715e = zfVar;
        this.f229716f = mgVar;
        this.f229717g = view;
        this.f229718h = liveRoomControllerStore;
        this.f229719i = ugVar;
        this.f229720m = view2;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        dk2.zf msg = this.f229715e;
        if (itemId != 163) {
            yz5.l lVar = this.f229714d;
            if (itemId == 165) {
                lVar.invoke(java.lang.Integer.valueOf(menuItem.getItemId()));
                kotlin.jvm.internal.o.g(msg, "msg");
                ((ml2.r0) i95.n0.c(ml2.r0.class)).Ij(3, mm2.j2.F.a(msg.p()));
            } else if (itemId != 166) {
                com.tencent.mm.plugin.finder.view.zq zqVar = com.tencent.mm.plugin.finder.view.zq.f133490a;
                android.content.Context context = this.f229717g.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                gk2.e liveRoomData = this.f229718h.getLiveRoomData();
                com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f229719i.f291099e;
                com.tencent.mm.plugin.finder.live.view.k0 k0Var = ubVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) ubVar : null;
                zqVar.d(2, context, liveRoomData, k0Var != null ? k0Var.getViewScope() : null, this.f229720m, this.f229716f, menuItem, i17, this.f229715e);
            } else {
                lVar.invoke(java.lang.Integer.valueOf(menuItem.getItemId()));
                kotlin.jvm.internal.o.g(msg, "msg");
                ((ml2.r0) i95.n0.c(ml2.r0.class)).Ij(7, mm2.j2.F.a(msg.p()));
            }
        } else {
            com.tencent.mm.plugin.finder.live.plugin.mg commentPlugin = this.f229716f;
            kotlin.jvm.internal.o.g(commentPlugin, "commentPlugin");
            kotlin.jvm.internal.o.g(msg, "msg");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("PARAM_MEMBERS_PROFILE_USERNAME", msg.a());
            bundle.putInt("PARAM_MEMBERS_PROFILE_SOURCE_TYPE", 2);
            bundle.putString("PARAM_MEMBERS_PROFILE_MESSAGE_ID", msg.v());
            bundle.putLong("PARAM_MEMBERS_PROFILE_MESSAGE_SEQ", msg.m());
            commentPlugin.f113503p.statusChange(qo0.b.f365376l1, bundle);
        }
        com.tencent.mm.plugin.finder.view.oc.f132781a.a();
    }
}
