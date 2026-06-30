package li2;

/* loaded from: classes10.dex */
public final class j extends wj2.w {

    /* renamed from: J, reason: collision with root package name */
    public final fg2.m0 f318766J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service, 4);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
        fg2.m0 a17 = fg2.m0.a(com.tencent.mm.ui.id.b(context), this, false);
        this.f318766J = a17;
        addView(a17.f262134a);
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
        return "KTVRoomPrepareGrabWidget";
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getVoteBubbleRootView() {
        return null;
    }

    @Override // wj2.w, lj2.j
    public void l(pm2.a widgetMode, xh2.a data) {
        kotlin.jvm.internal.o.g(widgetMode, "widgetMode");
        kotlin.jvm.internal.o.g(data, "data");
        super.l(widgetMode, data);
        fg2.m0 m0Var = this.f318766J;
        m0Var.f262138e.setVisibility(4);
        m0Var.f262135b.f262063a.setVisibility(4);
        m0Var.f262136c.s(com.tencent.mm.R.raw.icons_filled_me, com.tencent.mm.R.color.f479102q1);
        m0Var.f262137d.setBackgroundResource(com.tencent.mm.R.drawable.cuk);
    }
}
