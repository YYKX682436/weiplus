package df2;

/* loaded from: classes3.dex */
public final class zo extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f231979m;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.lifecycle.j0 f231980n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f231981o;

    /* renamed from: p, reason: collision with root package name */
    public kotlinx.coroutines.r2 f231982p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231979m = "LiveOuterGiftAnimController";
        this.f231980n = new androidx.lifecycle.j0();
        this.f231981o = jz5.h.b(new df2.uo(this));
    }

    public final android.widget.FrameLayout Z6() {
        return (android.widget.FrameLayout) T6(com.tencent.mm.R.id.q5q, com.tencent.mm.R.id.q5r);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f231980n.observe((com.tencent.mm.plugin.finder.live.view.k0) pluginLayout, new df2.wo(this));
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        kotlinx.coroutines.r2 r2Var = this.f231982p;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }
}
