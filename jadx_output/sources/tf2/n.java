package tf2;

/* loaded from: classes3.dex */
public final class n extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public boolean f418938m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    public final void Z6(boolean z17) {
        dk2.xf P6;
        if (this.f418938m == z17) {
            return;
        }
        this.f418938m = z17;
        com.tencent.mars.xlog.Log.i("FinderLivePkGiftPkStatusCallerController", "#refreshGift isPkMode=" + z17);
        tf2.k kVar = (tf2.k) controller(tf2.k.class);
        if (kVar != null) {
            kVar.c7();
            kVar.b7();
        }
        tf2.m mVar = (tf2.m) controller(tf2.m.class);
        if (mVar != null && (P6 = mVar.P6()) != null) {
            dk2.xf.g(P6, ((mm2.e1) mVar.business(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) mVar.business(mm2.e1.class)).f328983m, ((mm2.e1) mVar.business(mm2.e1.class)).f328992v, 1, null, 16, null);
        }
        tf2.o oVar = (tf2.o) controller(tf2.o.class);
        if (oVar != null) {
            oVar.Z6(z17);
        }
        uf2.f fVar = (uf2.f) controller(uf2.f.class);
        if (fVar != null) {
            com.tencent.mars.xlog.Log.i("Finder.PkGiftForegroundPagController", "#onPkStatusChange " + z17);
            java.util.Map map = fVar.f427179n;
            if (!z17) {
                fVar.a7();
                ((java.util.LinkedHashMap) map).clear();
            } else {
                for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) map).entrySet()) {
                    fVar.e7((java.lang.String) entry.getKey(), (java.lang.String) ((jz5.o) entry.getValue()).f302841d, ((java.lang.Number) ((jz5.o) entry.getValue()).f302842e).intValue());
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }
}
