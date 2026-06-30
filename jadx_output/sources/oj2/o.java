package oj2;

/* loaded from: classes10.dex */
public abstract class o extends wj2.w implements android.view.View.OnClickListener {

    /* renamed from: J, reason: collision with root package name */
    public android.widget.FrameLayout f345779J;
    public com.tencent.mm.ui.widget.imageview.WeImageView K;
    public android.view.ViewGroup L;
    public android.view.ViewGroup M;
    public android.widget.TextView N;
    public android.view.View P;
    public android.widget.TextView Q;
    public android.view.ViewGroup R;
    public android.widget.TextView S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service, 2);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
        a0();
        addView(getRoot());
        if (pluginAbility.f() == lj2.w0.f318958d) {
            getFinderLiveVideoLinkBottomBarName().setOnClickListener(this);
            getClickRoot().setOnClickListener(this);
            getFinderLiveMicMuteIcon().setOnClickListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.widget.TextView getMicTagTextView() {
        return this.S;
    }

    @Override // wj2.w
    public boolean C() {
        return true;
    }

    @Override // wj2.w
    public void R() {
        pm0.v.X(new oj2.n(this));
    }

    @Override // sj2.m
    public void a() {
        com.tencent.mars.xlog.Log.i(getTAG(), "onGiftAnimationStart");
    }

    public abstract void a0();

    /* JADX WARN: Code restructure failed: missing block: B:24:0x010b, code lost:
    
        if (r1.X() == true) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b0() {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oj2.o.b0():void");
    }

    @Override // sj2.m
    public void d() {
        com.tencent.mars.xlog.Log.i(getTAG(), "onGiftAnimationEnd");
    }

    @Override // lj2.u0
    public void e() {
        S(this.Q);
    }

    @Override // wj2.w, lj2.u0
    public void f(boolean z17, int i17, boolean z18) {
        super.f(z17, i17, z18);
        if (B() || (G() && getPluginAbility().a0().F())) {
            getFinderLiveMicMuteIcon().setVisibility(0);
        } else {
            getFinderLiveMicMuteIcon().setVisibility(8);
        }
    }

    @Override // lj2.u0
    public void g() {
        s(getMicTagTextView());
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

    public android.view.ViewGroup getClickRoot() {
        return getRoot();
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getCriticalGiftLayout() {
        return null;
    }

    public final android.view.View getFinderLiveFinderLogo() {
        return this.P;
    }

    public final android.view.ViewGroup getFinderLiveLuckyMoneyBubbleUiRoot() {
        android.view.ViewGroup viewGroup = this.R;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("finderLiveLuckyMoneyBubbleUiRoot");
        throw null;
    }

    public final android.widget.TextView getFinderLiveMicHeartText() {
        return this.Q;
    }

    public final android.widget.FrameLayout getFinderLiveMicMuteIcon() {
        android.widget.FrameLayout frameLayout = this.f345779J;
        if (frameLayout != null) {
            return frameLayout;
        }
        kotlin.jvm.internal.o.o("finderLiveMicMuteIcon");
        throw null;
    }

    public final com.tencent.mm.ui.widget.imageview.WeImageView getFinderLiveMicMuteIconWe() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.K;
        if (weImageView != null) {
            return weImageView;
        }
        kotlin.jvm.internal.o.o("finderLiveMicMuteIconWe");
        throw null;
    }

    public final android.view.ViewGroup getFinderLiveMicNewNormalMicGiftItemLayout() {
        android.view.ViewGroup viewGroup = this.M;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("finderLiveMicNewNormalMicGiftItemLayout");
        throw null;
    }

    public final android.widget.TextView getFinderLiveMicTagText() {
        return this.S;
    }

    public final android.widget.TextView getFinderLiveVideoLinkBottomBarName() {
        android.widget.TextView textView = this.N;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("finderLiveVideoLinkBottomBarName");
        throw null;
    }

    @Override // wj2.w, sj2.m
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator getGiftInAnimator() {
        return null;
    }

    @Override // wj2.w, sj2.m
    public android.view.ViewGroup getGiftRootView() {
        return getFinderLiveMicNewNormalMicGiftItemLayout();
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getLotteryBubbleRootView() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    public android.view.ViewGroup getLuckyMoneyRootView() {
        com.tencent.mars.xlog.Log.i(getTAG(), "getLuckyMoneyRootView");
        return getFinderLiveLuckyMoneyBubbleUiRoot();
    }

    @Override // wj2.w, lj2.u0
    public sj2.m getMicGiftCallback() {
        return this;
    }

    public final android.view.ViewGroup getRoot() {
        android.view.ViewGroup viewGroup = this.L;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("root");
        throw null;
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getVoteBubbleRootView() {
        return null;
    }

    @Override // sj2.m
    public void h() {
        android.view.ViewGroup giftRootView = getGiftRootView();
        if (giftRootView == null) {
            return;
        }
        giftRootView.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/base/FinderLiveMicBaseCoverVideoWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int id6 = getFinderLiveVideoLinkBottomBarName().getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            b0();
        } else {
            int id7 = getClickRoot().getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                J();
            } else {
                int id8 = getFinderLiveMicMuteIcon().getId();
                if (valueOf != null && valueOf.intValue() == id8) {
                    L();
                } else {
                    android.widget.TextView textView = this.Q;
                    if (kotlin.jvm.internal.o.b(valueOf, textView != null ? java.lang.Integer.valueOf(textView.getId()) : null)) {
                        android.widget.TextView textView2 = this.Q;
                        boolean z17 = false;
                        if (textView2 != null) {
                            if (textView2.getVisibility() == 0) {
                                z17 = true;
                            }
                        }
                        if (z17) {
                            H();
                        }
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/base/FinderLiveMicBaseCoverVideoWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public final void setFinderLiveFinderLogo(android.view.View view) {
        this.P = view;
    }

    public final void setFinderLiveLuckyMoneyBubbleUiRoot(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        this.R = viewGroup;
    }

    public final void setFinderLiveMicHeartText(android.widget.TextView textView) {
        this.Q = textView;
    }

    public final void setFinderLiveMicMuteIcon(android.widget.FrameLayout frameLayout) {
        kotlin.jvm.internal.o.g(frameLayout, "<set-?>");
        this.f345779J = frameLayout;
    }

    public final void setFinderLiveMicMuteIconWe(com.tencent.mm.ui.widget.imageview.WeImageView weImageView) {
        kotlin.jvm.internal.o.g(weImageView, "<set-?>");
        this.K = weImageView;
    }

    public final void setFinderLiveMicNewNormalMicGiftItemLayout(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        this.M = viewGroup;
    }

    public final void setFinderLiveMicTagText(android.widget.TextView textView) {
        this.S = textView;
    }

    public final void setFinderLiveVideoLinkBottomBarName(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<set-?>");
        this.N = textView;
    }

    public final void setRoot(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        this.L = viewGroup;
    }
}
