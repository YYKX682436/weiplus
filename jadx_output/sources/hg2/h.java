package hg2;

/* loaded from: classes3.dex */
public final class h extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f281352m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewGroup f281353n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f281354o;

    /* renamed from: p, reason: collision with root package name */
    public int f281355p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f281356q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f281357r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f281358s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f281352m = "FlashSaleBubbleController";
        this.f281356q = new com.tencent.mm.sdk.platformtools.b4("FlashSaleBubble::Timer", (com.tencent.mm.sdk.platformtools.a4) new hg2.g(this), true);
    }

    public final void Z6() {
        dk2.vf vfVar = ((mm2.f6) business(mm2.f6.class)).X;
        if (vfVar != null) {
            com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new hg2.c(this, vfVar, null), 3, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        android.view.View S6 = S6(com.tencent.mm.R.id.exy);
        android.view.ViewGroup viewGroup = S6 instanceof android.view.ViewGroup ? (android.view.ViewGroup) S6 : null;
        this.f281353n = viewGroup;
        this.f281354o = viewGroup != null ? (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.f485012g85) : null;
        android.view.ViewGroup viewGroup2 = this.f281353n;
        this.f281358s = viewGroup2 != null ? viewGroup2.findViewById(com.tencent.mm.R.id.f485010g83) : null;
        android.view.ViewGroup viewGroup3 = this.f281353n;
        this.f281357r = viewGroup3 != null ? (android.widget.TextView) viewGroup3.findViewById(com.tencent.mm.R.id.cjn) : null;
        android.view.View view = this.f281358s;
        if (view != null) {
            view.setOnClickListener(new hg2.a(this));
        }
        android.view.ViewGroup viewGroup4 = this.f281353n;
        boolean z17 = false;
        if (viewGroup4 != null && viewGroup4.getVisibility() == 0) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        Z6();
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f281356q.d();
        this.f281353n = null;
        this.f281354o = null;
        this.f281358s = null;
        this.f281357r = null;
    }
}
