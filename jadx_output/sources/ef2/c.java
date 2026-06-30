package ef2;

/* loaded from: classes10.dex */
public final class c extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public android.widget.RelativeLayout f252402m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView f252403n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    public final void Z6() {
        com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView anchorMilestoneShareView = this.f252403n;
        if (anchorMilestoneShareView != null) {
            android.view.ViewParent parent = anchorMilestoneShareView.getParent();
            if (parent != null && (parent instanceof android.view.ViewGroup)) {
                ((android.view.ViewGroup) parent).removeView(anchorMilestoneShareView);
            }
            this.f252403n = null;
        }
        android.widget.RelativeLayout relativeLayout = this.f252402m;
        if (relativeLayout == null) {
            return;
        }
        relativeLayout.setVisibility(8);
    }

    @Override // if2.b, if2.m0
    public boolean k() {
        if (zl2.r4.f473950a.w1()) {
            return true;
        }
        mm2.n0 n0Var = (mm2.n0) business(mm2.n0.class);
        return n0Var != null && n0Var.f329273r;
    }

    @Override // if2.e
    public boolean onBackPress() {
        android.widget.RelativeLayout relativeLayout = this.f252402m;
        if (!(relativeLayout != null && relativeLayout.getVisibility() == 0)) {
            return false;
        }
        Z6();
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) T6(com.tencent.mm.R.id.f484538tg5, com.tencent.mm.R.id.f484537tg4);
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
            relativeLayout.setOnClickListener(new ef2.a(this));
        } else {
            relativeLayout = null;
        }
        this.f252402m = relativeLayout;
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        Z6();
        this.f252402m = null;
    }
}
