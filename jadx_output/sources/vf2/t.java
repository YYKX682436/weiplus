package vf2;

/* loaded from: classes3.dex */
public final class t extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final yz5.a f436359m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f436359m = new vf2.r(this);
    }

    public static final boolean Z6(vf2.t tVar) {
        boolean T7 = ((mm2.c1) tVar.business(mm2.c1.class)).T7();
        boolean f76 = ((mm2.e1) tVar.business(mm2.e1.class)).f7();
        boolean z17 = !T7 && f76;
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorScreenCastUnexpectedFixController", "#isNeedBlockCamera isLiveBefore=" + T7 + " isScreenCastGameMode=" + f76 + " isNeedBlock=" + z17);
        return z17;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
        super.onLiveActivate();
        dk2.ef efVar = dk2.ef.f233372a;
        tn0.w0 w0Var = dk2.ef.f233378d;
        if (w0Var != null) {
            yz5.a l17 = this.f436359m;
            kotlin.jvm.internal.o.g(l17, "l");
            ((java.util.ArrayList) w0Var.E1).add(l17);
        }
        com.tencent.mm.plugin.finder.live.util.y.d(this, null, null, new vf2.s(this, null), 3, null);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        dk2.ef efVar = dk2.ef.f233372a;
        tn0.w0 w0Var = dk2.ef.f233378d;
        if (w0Var != null) {
            yz5.a l17 = this.f436359m;
            kotlin.jvm.internal.o.g(l17, "l");
            ((java.util.ArrayList) w0Var.E1).remove(l17);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        super.onLiveStart(hc1Var);
        if (((mm2.e1) business(mm2.e1.class)).f7()) {
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorScreenCastUnexpectedFixController", "#onLiveStart isScreenCastGameMode, stopPreview now");
            dk2.ef efVar = dk2.ef.f233372a;
            tn0.w0 w0Var = dk2.ef.f233378d;
            if (w0Var != null) {
                w0Var.H0();
            }
        }
    }
}
