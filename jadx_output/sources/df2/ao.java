package df2;

/* loaded from: classes3.dex */
public final class ao extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public bl2.c f229732m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        com.tencent.mm.plugin.finder.live.view.ub ubVar;
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        dk2.ef efVar = dk2.ef.f233372a;
        em2.u uVar = dk2.ef.f233386h;
        if (uVar.f255170c) {
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_FLOAT_WINDOW_GUIDE_SHOWN_BOOLEAN_SYNC;
            if (!c17.o(u3Var, false) && (ubVar = this.f291099e) != null) {
                gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
                bl2.c cVar = new bl2.c(O6(), ubVar);
                this.f229732m = cVar;
                cVar.w();
                i95.m c18 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                ml2.r0.Oj((ml2.r0) c18, 1, null, null, null, null, 30, null);
            }
        }
        uVar.f255170c = false;
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        bl2.c cVar = this.f229732m;
        if (cVar != null) {
            cVar.a();
        }
        this.f229732m = null;
    }
}
