package di2;

/* loaded from: classes10.dex */
public final class e extends wj2.w implements android.view.View.OnClickListener {

    /* renamed from: J, reason: collision with root package name */
    public final fg2.m0 f232645J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service, boolean z17) {
        super(context, pluginAbility, service, 4);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
        fg2.m0 a17 = fg2.m0.a(com.tencent.mm.ui.id.b(context), this, false);
        this.f232645J = a17;
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = a17.f262135b.f262063a;
        kotlin.jvm.internal.o.f(roundCornerRelativeLayout, "getRoot(...)");
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = a17.f262134a;
        addView(constraintLayout);
        if (pluginAbility.f() == lj2.w0.f318958d) {
            constraintLayout.setOnClickListener(this);
        }
        roundCornerRelativeLayout.setVisibility(4);
        if (z17) {
            a17.f262138e.setVisibility(4);
        }
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
        return "FinderLiveChatVoiceRoomGrabWidget";
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
        this.K = data.f454521b.f454553e;
        fg2.m0 m0Var = this.f232645J;
        m0Var.f262138e.setText(getContext().getResources().getString(com.tencent.mm.R.string.dw8));
        m0Var.f262137d.setBackgroundResource(com.tencent.mm.R.drawable.c3m);
        m0Var.f262136c.setImageResource(com.tencent.mm.R.raw.icons_outlined_add);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/chatvoiceroom/widget/FinderLiveChatVoiceRoomGrabWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int id6 = this.f232645J.f262134a.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            if (zl2.r4.f473950a.w1()) {
                fj2.s.h(fj2.s.f263183a, ml2.w4.f328187e, null, 0, 0, 14, null);
                xh2.a bindMicData = getBindMicData();
                if (bindMicData != null) {
                    getService().e(bindMicData);
                }
            } else {
                getService().S(this.K);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/chatvoiceroom/widget/FinderLiveChatVoiceRoomGrabWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
