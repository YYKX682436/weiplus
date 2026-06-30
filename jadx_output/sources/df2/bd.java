package df2;

/* loaded from: classes3.dex */
public final class bd extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f229796m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f229796m = "LiveAnchorShopMsgDataController";
    }

    public final void Z6(java.lang.String str, java.lang.Long l17) {
        zl2.r4 r4Var = zl2.r4.f473950a;
        if (r4Var.y1(getStore().getLiveRoomData())) {
            boolean z17 = ((mm2.c1) business(mm2.c1.class)).P;
            if (l17 != null) {
                long longValue = l17.longValue();
                mm2.c1 c1Var = (mm2.c1) business(mm2.c1.class);
                qs5.h[] hVarArr = qs5.h.f366433d;
                c1Var.P = pm0.v.A(longValue, 2);
                com.tencent.mars.xlog.Log.i(this.f229796m, "[checkEnableAndInsertRedDot] scene = " + str + ", flag = " + l17 + ", enableAnchorAskProduction = " + ((mm2.c1) business(mm2.c1.class)).P);
            }
            if (z17 || !r4Var.o(getStore().getLiveRoomData())) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            r45.f03 f03Var = new r45.f03();
            f03Var.f373887d = 1;
            f03Var.f373891h = 1;
            f03Var.f373892i = "anchorlive.more.commentmanage";
            f03Var.f373893m = "anchorlive.bottom.tools";
            f03Var.f373900t = 1;
            arrayList.add(f03Var);
            r45.f03 f03Var2 = new r45.f03();
            f03Var2.f373891h = 2;
            f03Var2.f373892i = "anchorlive.bottom.tools";
            arrayList.add(f03Var2);
            ll2.e.f319133a.i(24005, arrayList, "live_more_comment_management");
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveMsg(r45.r71 r71Var) {
        r45.up1 up1Var;
        super.onLiveMsg(r71Var);
        Z6("onLiveMsg", (r71Var == null || (up1Var = (r45.up1) r71Var.getCustom(32)) == null) ? null : java.lang.Long.valueOf(up1Var.getLong(5)));
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        r45.up1 up1Var;
        super.onLiveStart(hc1Var);
        Z6("onLiveStart", (hc1Var == null || (up1Var = (r45.up1) hc1Var.getCustom(68)) == null) ? null : java.lang.Long.valueOf(up1Var.getLong(5)));
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
    }
}
