package rj2;

/* loaded from: classes10.dex */
public final class a extends wj2.w implements android.view.View.OnClickListener {

    /* renamed from: J, reason: collision with root package name */
    public int f396177J;
    public final fg2.k0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service, 4);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
        fg2.k0 a17 = fg2.k0.a(com.tencent.mm.ui.id.b(context), this, false);
        this.K = a17;
        android.widget.TextView tagTextView = a17.f262112b.f262294b;
        kotlin.jvm.internal.o.f(tagTextView, "tagTextView");
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = a17.f262111a;
        addView(constraintLayout);
        constraintLayout.setOnClickListener(this);
        tagTextView.setVisibility(4);
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
        return "FinderLiveMicDualGrabRequestWidget";
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
        this.f396177J = data.f454521b.f454553e;
        this.K.f262114d.setText(getContext().getResources().getString(com.tencent.mm.R.string.dw8));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/dual/FinderLiveMicDualGrabRequestWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int id6 = this.K.f262111a.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            if (zl2.r4.f473950a.w1()) {
                xh2.a bindMicData = getBindMicData();
                if (bindMicData != null) {
                    getService().c(bindMicData);
                }
            } else {
                getService().S(this.f396177J);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/dual/FinderLiveMicDualGrabRequestWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
