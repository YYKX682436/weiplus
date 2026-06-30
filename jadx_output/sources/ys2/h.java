package ys2;

/* loaded from: classes3.dex */
public final class h extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f465159m;

    /* renamed from: n, reason: collision with root package name */
    public if2.d0 f465160n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f465161o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f465162p;

    /* renamed from: q, reason: collision with root package name */
    public android.animation.AnimatorSet f465163q;

    /* renamed from: r, reason: collision with root package name */
    public final ys2.f f465164r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f465165s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f465159m = "ReplayLongPressSpeedPlugin";
        this.f465164r = new ys2.f(new java.lang.ref.WeakReference(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) pluginLayout.findViewById(com.tencent.mm.R.id.ipu);
        kotlin.jvm.internal.o.d(viewGroup);
        this.f465160n = new if2.d0(viewGroup, this);
        this.f465161o = viewGroup.findViewById(com.tencent.mm.R.id.kwo);
        this.f465162p = viewGroup.findViewById(com.tencent.mm.R.id.kwp);
        com.tencent.mm.plugin.finder.live.plugin.x80 x80Var = (com.tencent.mm.plugin.finder.live.plugin.x80) R6(com.tencent.mm.plugin.finder.live.plugin.x80.class);
        if (x80Var != null) {
            x80Var.x1(this.f465164r);
        }
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        if2.d0 d0Var = this.f465160n;
        if (d0Var != null) {
            d0Var.d(8);
        }
        this.f465161o = null;
        this.f465162p = null;
        this.f465165s = false;
    }
}
