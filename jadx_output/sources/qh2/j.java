package qh2;

/* loaded from: classes10.dex */
public abstract class j extends wj2.w implements android.view.View.OnClickListener {

    /* renamed from: J, reason: collision with root package name */
    public boolean f363444J;
    public pj2.c K;
    public android.view.ViewGroup L;
    public android.widget.ImageView M;
    public android.view.ViewGroup N;
    public android.view.ViewGroup P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service, int i17) {
        super(context, pluginAbility, service, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
        qh2.i iVar = (qh2.i) this;
        android.view.View inflate = com.tencent.mm.ui.id.b(iVar.getContext()).inflate(com.tencent.mm.R.layout.drm, (android.view.ViewGroup) iVar, false);
        int i18 = com.tencent.mm.R.id.auj;
        if (((android.widget.LinearLayout) x4.b.a(inflate, com.tencent.mm.R.id.auj)) != null) {
            i18 = com.tencent.mm.R.id.f8q;
            android.view.View a17 = x4.b.a(inflate, com.tencent.mm.R.id.f8q);
            if (a17 != null) {
                fg2.c0 a18 = fg2.c0.a(a17);
                android.view.View a19 = x4.b.a(inflate, com.tencent.mm.R.id.fak);
                if (a19 != null) {
                    fg2.h0 a27 = fg2.h0.a(a19);
                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) inflate;
                    int i19 = com.tencent.mm.R.id.qrn;
                    android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.qrn);
                    if (imageView != null) {
                        i19 = com.tencent.mm.R.id.qxy;
                        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = (com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView) x4.b.a(inflate, com.tencent.mm.R.id.qxy);
                        if (ripperAnimateView != null) {
                            iVar.Q = ripperAnimateView;
                            ripperAnimateView.b(iVar.getService().a());
                            iVar.setWaveViewCallback(new qh2.g(iVar));
                            iVar.getPluginAbility().a0().b(new qh2.h(iVar));
                            iVar.setFinderLiveMicUserAvatar(imageView);
                            android.widget.RelativeLayout relativeLayout = a27.f262062a;
                            kotlin.jvm.internal.o.f(relativeLayout, "getRoot(...)");
                            iVar.setFinderLiveMicGiftItemLayout(relativeLayout);
                            com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = a18.f261957a;
                            kotlin.jvm.internal.o.f(roundCornerRelativeLayout, "getRoot(...)");
                            iVar.setFinderLiveLuckyMoneyBubbleUiRoot(roundCornerRelativeLayout);
                            iVar.getFinderLiveMicGiftItemLayout().setTranslationY(-i65.a.b(iVar.getContext(), 10));
                            iVar.getFinderLiveMicGiftItemLayout().setTranslationX(i65.a.b(iVar.getContext(), 32));
                            kotlin.jvm.internal.o.f(constraintLayout, "getRoot(...)");
                            iVar.setRoot(constraintLayout);
                            setClipChildren(false);
                            setClipToPadding(false);
                            addView(getRoot());
                            if (pluginAbility.f() == lj2.w0.f318958d) {
                                getRoot().setOnClickListener(this);
                                return;
                            }
                            return;
                        }
                    }
                    i18 = i19;
                } else {
                    i18 = com.tencent.mm.R.id.fak;
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i18)));
    }

    @Override // wj2.w
    public void J() {
        java.lang.String str;
        super.J();
        if (zl2.r4.f473950a.x1()) {
            fj2.s sVar = fj2.s.f263183a;
            ml2.w4 w4Var = ml2.w4.f328187e;
            km2.q bindLinkMicUser = getBindLinkMicUser();
            if (bindLinkMicUser == null || (str = bindLinkMicUser.f309172c) == null) {
                str = "";
            }
            fj2.s.h(sVar, w4Var, str, 0, 0, 12, null);
        }
    }

    @Override // wj2.w
    public void K() {
        if (B()) {
            return;
        }
        super.K();
    }

    @Override // sj2.m
    public void a() {
        com.tencent.mars.xlog.Log.i(getTAG(), "onGiftAnimationStart");
    }

    @Override // sj2.m
    public void d() {
        com.tencent.mars.xlog.Log.i(getTAG(), "onGiftAnimationEnd");
    }

    @Override // lj2.u0
    public void e() {
    }

    @Override // wj2.w, lj2.u0
    public void f(boolean z17, int i17, boolean z18) {
        super.f(z17, i17, z18);
        if (B() || (G() && getPluginAbility().a0().F())) {
            getMicAudioWaveViewCallback().a();
            return;
        }
        if (this.f363444J != z17 || getMicAudioWaveViewCallback().c() == z17) {
            com.tencent.mars.xlog.Log.i(getTAG(), "notifyMicUserTalkingState notTalking:" + z17 + " lastNotTalking: " + this.f363444J);
            this.f363444J = z17;
            if (z17) {
                getMicAudioWaveViewCallback().a();
            } else {
                getMicAudioWaveViewCallback().b();
            }
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

    public android.widget.ImageView getAvatarView() {
        return getFinderLiveMicUserAvatar();
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

    public final android.view.ViewGroup getFinderLiveLuckyMoneyBubbleUiRoot() {
        android.view.ViewGroup viewGroup = this.P;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("finderLiveLuckyMoneyBubbleUiRoot");
        throw null;
    }

    public final android.view.ViewGroup getFinderLiveMicGiftItemLayout() {
        android.view.ViewGroup viewGroup = this.N;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("finderLiveMicGiftItemLayout");
        throw null;
    }

    public final android.widget.ImageView getFinderLiveMicUserAvatar() {
        android.widget.ImageView imageView = this.M;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.o.o("finderLiveMicUserAvatar");
        throw null;
    }

    @Override // wj2.w, sj2.m
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator getGiftInAnimator() {
        return null;
    }

    @Override // wj2.w, sj2.m
    public android.view.ViewGroup getGiftRootView() {
        return getFinderLiveMicGiftItemLayout();
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

    public pj2.c getMicAudioWaveViewCallback() {
        return getWaveViewCallback();
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

    public final pj2.c getWaveViewCallback() {
        pj2.c cVar = this.K;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.o.o("waveViewCallback");
        throw null;
    }

    @Override // sj2.m
    public void h() {
        android.view.ViewGroup giftRootView = getGiftRootView();
        if (giftRootView != null) {
            giftRootView.setVisibility(8);
        }
        android.view.ViewGroup giftRootView2 = getGiftRootView();
        if (giftRootView2 == null) {
            return;
        }
        giftRootView2.setTranslationX(0.0f);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/ktv/widget/KTVSingMicBaseCoverWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int id6 = getRoot().getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            J();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/ktv/widget/KTVSingMicBaseCoverWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // wj2.w, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getMicAudioWaveViewCallback().a();
    }

    public final void setFinderLiveLuckyMoneyBubbleUiRoot(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        this.P = viewGroup;
    }

    public final void setFinderLiveMicGiftItemLayout(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        this.N = viewGroup;
    }

    public final void setFinderLiveMicUserAvatar(android.widget.ImageView imageView) {
        kotlin.jvm.internal.o.g(imageView, "<set-?>");
        this.M = imageView;
    }

    public final void setRoot(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        this.L = viewGroup;
    }

    public final void setWaveViewCallback(pj2.c cVar) {
        kotlin.jvm.internal.o.g(cVar, "<set-?>");
        this.K = cVar;
    }
}
