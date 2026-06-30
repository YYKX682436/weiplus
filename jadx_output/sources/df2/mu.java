package df2;

/* loaded from: classes3.dex */
public final class mu extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f230806m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f230807n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f230808o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f230806m = "LiveShopWeAppController";
        this.f230807n = "";
        this.f230808o = jz5.h.b(new df2.lu(this));
    }

    public final void Z6(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        if (kotlin.jvm.internal.o.b(this.f230807n, appId)) {
            com.tencent.mars.xlog.Log.i(this.f230806m, "appId:" + appId + " is same, return");
            return;
        }
        boolean z17 = this.f230807n.length() > 0;
        jz5.g gVar = this.f230808o;
        if (z17) {
            ((xc1.t) ((ft.q4) i95.n0.c(ft.q4.class))).Bi(this.f230807n, (df2.ku) ((jz5.n) gVar).getValue());
        }
        this.f230807n = appId;
        if (appId.length() > 0) {
            ((xc1.t) ((ft.q4) i95.n0.c(ft.q4.class))).wi(appId, (df2.ku) ((jz5.n) gVar).getValue());
        }
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        com.tencent.mars.xlog.Log.i(this.f230806m, "onViewUnmount, resetListener");
        Z6("");
    }
}
