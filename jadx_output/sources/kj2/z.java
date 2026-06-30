package kj2;

/* loaded from: classes10.dex */
public final class z extends wj2.w {

    /* renamed from: J, reason: collision with root package name */
    public final fg2.f0 f308438J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service, 4);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
        fg2.f0 a17 = fg2.f0.a(com.tencent.mm.ui.id.b(context), this, false);
        this.f308438J = a17;
        addView(a17.f262025a);
        a17.f262026b.f262063a.setVisibility(4);
        a17.f262029e.setVisibility(4);
    }

    @Override // wj2.w
    public void R() {
        fg2.f0 f0Var = this.f308438J;
        f0Var.f262027c.setImageResource(com.tencent.mm.R.raw.icons_outlined_add);
        f0Var.f262028d.setBackgroundResource(com.tencent.mm.R.drawable.c3m);
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getAnchorAudioModeLayout() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getAnchorCriticalLayout() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ ai2.a getBattleResultWidget() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ qi2.s1 getBattleTipsWidget() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getCriticalGiftLayout() {
        return null;
    }

    @Override // wj2.w, sj2.m
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator getGiftInAnimator() {
        return null;
    }

    @Override // wj2.w, sj2.m
    public /* bridge */ /* synthetic */ android.view.ViewGroup getGiftRootView() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getLotteryBubbleRootView() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getLuckyMoneyRootView() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    public sj2.m getMicGiftCallback() {
        return this;
    }

    @Override // lj2.j
    public java.lang.String getTagString() {
        return "VoiceRoomFloatGrabWidget";
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getVoteBubbleRootView() {
        return null;
    }
}
