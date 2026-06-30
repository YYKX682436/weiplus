package kj2;

/* loaded from: classes10.dex */
public final class y extends kj2.j0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
    }

    @Override // kj2.j0, oj2.f, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getAnchorAudioModeLayout() {
        return null;
    }

    @Override // kj2.j0, oj2.f, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getAnchorCriticalLayout() {
        return null;
    }

    @Override // kj2.j0, oj2.f, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ qi2.s1 getBattleTipsWidget() {
        return null;
    }

    @Override // kj2.j0, oj2.f, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getCriticalGiftLayout() {
        return null;
    }

    @Override // kj2.j0, oj2.f, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getLotteryBubbleRootView() {
        return null;
    }

    @Override // kj2.j0, oj2.f, wj2.w, lj2.u0
    public sj2.m getMicGiftCallback() {
        return this;
    }

    @Override // kj2.j0, wj2.w
    public int getProfileSourceType() {
        return 3;
    }

    @Override // kj2.j0, oj2.f, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getVoteBubbleRootView() {
        return null;
    }

    @Override // lj2.j
    public void r(android.view.View view, android.widget.TextView textView, android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
    }
}
