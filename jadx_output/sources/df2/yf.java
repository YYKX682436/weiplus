package df2;

/* loaded from: classes3.dex */
public final class yf implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f231859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f231860e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f231861f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.ug f231862g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f231863h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f231864i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f231865m;

    public yf(yz5.l lVar, dk2.zf zfVar, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore, df2.ug ugVar, android.view.View view, com.tencent.mm.plugin.finder.live.plugin.mg mgVar, android.view.View view2) {
        this.f231859d = lVar;
        this.f231860e = zfVar;
        this.f231861f = liveRoomControllerStore;
        this.f231862g = ugVar;
        this.f231863h = view;
        this.f231864i = mgVar;
        this.f231865m = view2;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        dk2.zf zfVar = this.f231860e;
        yz5.l lVar = this.f231859d;
        if (itemId == 165) {
            lVar.invoke(java.lang.Integer.valueOf(menuItem.getItemId()));
            int a17 = mm2.j2.F.a(zfVar.p());
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.F1;
            cl0.g gVar = new cl0.g();
            gVar.o("type", 2);
            gVar.o("barrage_type", a17);
            zy2.zb.y6(zbVar, z4Var, gVar.toString(), null, 4, null);
        } else if (itemId != 166) {
            com.tencent.mm.plugin.finder.view.zq zqVar = com.tencent.mm.plugin.finder.view.zq.f133490a;
            gk2.e liveRoomData = this.f231861f.getLiveRoomData();
            com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f231862g.f291099e;
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = ubVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) ubVar : null;
            zqVar.b(2, liveRoomData, k0Var != null ? k0Var.getViewScope() : null, this.f231863h, this.f231864i, this.f231865m, menuItem, i17, this.f231860e);
        } else {
            lVar.invoke(java.lang.Integer.valueOf(menuItem.getItemId()));
            int a18 = mm2.j2.F.a(zfVar.p());
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb zbVar2 = (zy2.zb) c18;
            ml2.z4 z4Var2 = ml2.z4.F1;
            cl0.g gVar2 = new cl0.g();
            gVar2.o("type", 8);
            gVar2.o("barrage_type", a18);
            zy2.zb.y6(zbVar2, z4Var2, gVar2.toString(), null, 4, null);
        }
        com.tencent.mm.plugin.finder.view.oc.f132781a.a();
    }
}
