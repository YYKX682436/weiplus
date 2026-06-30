package vf2;

/* loaded from: classes3.dex */
public final class w extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public boolean f436363m;

    /* renamed from: n, reason: collision with root package name */
    public final yz5.l f436364n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f436364n = new vf2.v(this);
    }

    public static final android.view.ViewGroup Z6(vf2.w wVar) {
        return (android.view.ViewGroup) wVar.T6(com.tencent.mm.R.id.rof, com.tencent.mm.R.id.roe);
    }

    public final android.view.ViewGroup a7() {
        return (android.view.ViewGroup) T6(com.tencent.mm.R.id.rog, com.tencent.mm.R.id.rod);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveEnd() {
        tn0.w0 w0Var = dk2.ef.f233378d;
        if (w0Var != null) {
            yz5.l l17 = this.f436364n;
            kotlin.jvm.internal.o.g(l17, "l");
            ((java.util.ArrayList) w0Var.D1).remove(l17);
        }
        android.view.ViewGroup a76 = a7();
        if (a76 == null) {
            return;
        }
        a76.setVisibility(8);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        android.view.ViewGroup a76 = a7();
        if (a76 != null) {
            a76.setVisibility(8);
        }
        dk2.ef efVar = dk2.ef.f233372a;
        tn0.w0 w0Var = dk2.ef.f233378d;
        if (w0Var != null) {
            yz5.l l17 = this.f436364n;
            kotlin.jvm.internal.o.g(l17, "l");
            ((java.util.ArrayList) w0Var.D1).add(l17);
        }
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        tn0.w0 w0Var = dk2.ef.f233378d;
        if (w0Var != null) {
            yz5.l l17 = this.f436364n;
            kotlin.jvm.internal.o.g(l17, "l");
            ((java.util.ArrayList) w0Var.D1).remove(l17);
        }
    }
}
