package li2;

/* loaded from: classes10.dex */
public abstract class b extends wj2.w implements android.view.View.OnClickListener {

    /* renamed from: J, reason: collision with root package name */
    public boolean f318758J;
    public android.widget.FrameLayout K;
    public com.tencent.mm.ui.widget.imageview.WeImageView L;
    public pj2.c M;
    public android.view.ViewGroup N;
    public android.view.ViewGroup P;
    public android.widget.TextView Q;
    public android.widget.ImageView R;
    public android.widget.TextView S;
    public android.widget.TextView T;
    public android.view.ViewGroup U;
    public android.view.ViewGroup V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service, 1);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
        Z();
        setClipChildren(false);
        setClipToPadding(false);
        addView(getRoot());
        if (pluginAbility.f() == lj2.w0.f318958d) {
            getRoot().setOnClickListener(this);
            getFinderLiveMicMuteIcon().setOnClickListener(this);
        }
    }

    @Override // wj2.w
    public void I(boolean z17) {
        if (this.f318758J == z17) {
            pj2.c micAudioWaveViewCallback = getMicAudioWaveViewCallback();
            boolean z18 = false;
            if (micAudioWaveViewCallback != null && micAudioWaveViewCallback.c() == z17) {
                z18 = true;
            }
            if (!z18) {
                return;
            }
        }
        com.tencent.mars.xlog.Log.i(getTAG(), "notifyUserVolumeChange notTalking:" + z17 + " lastNotTalking: " + this.f318758J);
        this.f318758J = z17;
        pm0.v.X(new li2.a(z17, this));
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

    @Override // wj2.w
    public void R() {
        km2.q bindLinkMicUser = getBindLinkMicUser();
        if (bindLinkMicUser != null) {
            u(getNickTextView());
            t(getAvatarView());
            f(bindLinkMicUser.f309183n, bindLinkMicUser.f309191v, false);
            S(getMicHeartTextView());
            r(getFinderLiveMicUserAvatar(), getMicTagTextView(), getMicTagLayout());
        }
        if (A()) {
            getMicHeartTextView().setOnClickListener(this);
            setTouchDelegate(getMicHeartTextView());
        }
    }

    @Override // wj2.w
    public void S(android.widget.TextView textView) {
        if (textView != null) {
            textView.setText("0");
        }
        super.S(textView);
    }

    public abstract void Z();

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
        S(getMicHeartTextView());
    }

    @Override // wj2.w, lj2.u0
    public void f(boolean z17, int i17, boolean z18) {
        super.f(z17, i17, z18);
        if (B() || (G() && getPluginAbility().a0().F())) {
            getMicAudioWaveViewCallback().a();
            getMicMuteIcon().setVisibility(0);
            return;
        }
        getMicMuteIcon().setVisibility(8);
        if (this.f318758J != z17 || getMicAudioWaveViewCallback().c() == z17) {
            com.tencent.mars.xlog.Log.i(getTAG(), "notifyMicUserTalkingState notTalking:" + z17 + " lastNotTalking: " + this.f318758J + " animating: " + getMicAudioWaveViewCallback().c());
            this.f318758J = z17;
            if (z17) {
                getMicAudioWaveViewCallback().a();
            } else {
                getMicAudioWaveViewCallback().b();
            }
        }
    }

    @Override // lj2.u0
    public void g() {
        r(getFinderLiveMicUserAvatar(), getMicTagTextView(), getMicTagLayout());
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
        android.view.ViewGroup viewGroup = this.V;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("finderLiveLuckyMoneyBubbleUiRoot");
        throw null;
    }

    public final android.view.ViewGroup getFinderLiveMicGiftItemLayout() {
        android.view.ViewGroup viewGroup = this.U;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("finderLiveMicGiftItemLayout");
        throw null;
    }

    public final android.widget.TextView getFinderLiveMicHeartText() {
        android.widget.TextView textView = this.T;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("finderLiveMicHeartText");
        throw null;
    }

    public final android.widget.FrameLayout getFinderLiveMicMuteIcon() {
        android.widget.FrameLayout frameLayout = this.K;
        if (frameLayout != null) {
            return frameLayout;
        }
        kotlin.jvm.internal.o.o("finderLiveMicMuteIcon");
        throw null;
    }

    public final com.tencent.mm.ui.widget.imageview.WeImageView getFinderLiveMicMuteIconWe() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.L;
        if (weImageView != null) {
            return weImageView;
        }
        kotlin.jvm.internal.o.o("finderLiveMicMuteIconWe");
        throw null;
    }

    public final android.widget.ImageView getFinderLiveMicUserAvatar() {
        android.widget.ImageView imageView = this.R;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.o.o("finderLiveMicUserAvatar");
        throw null;
    }

    public final android.widget.TextView getFinderLiveMicUserNickText() {
        android.widget.TextView textView = this.S;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("finderLiveMicUserNickText");
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

    public android.widget.TextView getMicHeartTextView() {
        return getFinderLiveMicHeartText();
    }

    public android.widget.FrameLayout getMicMuteIcon() {
        return getFinderLiveMicMuteIcon();
    }

    public final android.view.ViewGroup getMicTagLayout() {
        android.view.ViewGroup viewGroup = this.P;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("micTagLayout");
        throw null;
    }

    public final android.widget.TextView getMicTagTextView() {
        android.widget.TextView textView = this.Q;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("micTagTextView");
        throw null;
    }

    public android.widget.TextView getNickTextView() {
        return getFinderLiveMicUserNickText();
    }

    public final android.view.ViewGroup getRoot() {
        android.view.ViewGroup viewGroup = this.N;
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
        pj2.c cVar = this.M;
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
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/ktv/widget/FinderLiveBaseKTVRoomCoverWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int id6 = getRoot().getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            J();
        } else {
            int id7 = getFinderLiveMicMuteIcon().getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                L();
            } else {
                int id8 = getMicHeartTextView().getId();
                if (valueOf != null && valueOf.intValue() == id8) {
                    if (getMicHeartTextView().getVisibility() == 0) {
                        H();
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/ktv/widget/FinderLiveBaseKTVRoomCoverWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // wj2.w, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getMicAudioWaveViewCallback().a();
    }

    public final void setFinderLiveLuckyMoneyBubbleUiRoot(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        this.V = viewGroup;
    }

    public final void setFinderLiveMicGiftItemLayout(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        this.U = viewGroup;
    }

    public final void setFinderLiveMicHeartText(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<set-?>");
        this.T = textView;
    }

    public final void setFinderLiveMicMuteIcon(android.widget.FrameLayout frameLayout) {
        kotlin.jvm.internal.o.g(frameLayout, "<set-?>");
        this.K = frameLayout;
    }

    public final void setFinderLiveMicMuteIconWe(com.tencent.mm.ui.widget.imageview.WeImageView weImageView) {
        kotlin.jvm.internal.o.g(weImageView, "<set-?>");
        this.L = weImageView;
    }

    public final void setFinderLiveMicUserAvatar(android.widget.ImageView imageView) {
        kotlin.jvm.internal.o.g(imageView, "<set-?>");
        this.R = imageView;
    }

    public final void setFinderLiveMicUserNickText(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<set-?>");
        this.S = textView;
    }

    public final void setMicTagLayout(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        this.P = viewGroup;
    }

    public final void setMicTagTextView(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<set-?>");
        this.Q = textView;
    }

    public final void setRoot(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        this.N = viewGroup;
    }

    public final void setWaveViewCallback(pj2.c cVar) {
        kotlin.jvm.internal.o.g(cVar, "<set-?>");
        this.M = cVar;
    }
}
