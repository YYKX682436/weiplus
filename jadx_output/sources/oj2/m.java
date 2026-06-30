package oj2;

/* loaded from: classes10.dex */
public abstract class m extends wj2.w implements android.view.View.OnClickListener {

    /* renamed from: J, reason: collision with root package name */
    public boolean f345777J;
    public com.tencent.mm.view.MMPAGView K;
    public android.widget.FrameLayout L;
    public com.tencent.mm.ui.widget.imageview.WeImageView M;
    public android.view.ViewGroup N;
    public android.view.ViewGroup P;
    public android.widget.ImageView Q;
    public android.widget.TextView R;
    public android.widget.ImageView S;
    public android.widget.TextView T;
    public android.view.ViewGroup U;
    public android.widget.TextView V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service, 1);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
        Z();
        setClipChildren(false);
        setClipToPadding(false);
        ym5.l2 l2Var = ym5.l2.f463424a;
        getFinderLiveMicStateAudioWaveIcon();
        ym5.j2[] j2VarArr = ym5.j2.f463392d;
        getFinderLiveMicStateAudioWaveIcon().o(ae2.in.f3688a.a(ym5.f6.X));
        com.tencent.mm.view.MMPAGView finderLiveMicStateAudioWaveIcon = getFinderLiveMicStateAudioWaveIcon();
        android.content.res.AssetManager assets = context.getAssets();
        kotlin.jvm.internal.o.f(assets, "getAssets(...)");
        finderLiveMicStateAudioWaveIcon.k(assets, "finder_live_link_mic_wave.pag");
        getFinderLiveMicStateAudioWaveIcon().setRepeatCount(-1);
        addView(getRoot());
        if (pluginAbility.f() == lj2.w0.f318958d) {
            getRoot().setOnClickListener(this);
            getFinderLiveMicMuteIcon().setOnClickListener(this);
        }
    }

    private final android.widget.TextView getMicTagTextView() {
        return this.V;
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
            q(getAudioBgView());
            f(bindLinkMicUser.f309183n, bindLinkMicUser.f309191v, false);
            S(getMicHeartTextView());
            s(getMicTagTextView());
        }
        if (A()) {
            getMicHeartTextView().setOnClickListener(this);
            setTouchDelegate(getMicHeartTextView());
        }
    }

    public abstract void Z();

    @Override // sj2.m
    public void a() {
        com.tencent.mars.xlog.Log.i(getTAG(), "onGiftgiAnimationStart");
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
            getMicAudioWaveIcon().setVisibility(8);
            getMicAudioWaveIcon().n();
            getMicMuteIcon().setVisibility(0);
            return;
        }
        getMicMuteIcon().setVisibility(8);
        if (this.f345777J != z17) {
            com.tencent.mars.xlog.Log.i(getTAG(), "notifyMicUserTalkingState notTalking:" + z17 + " lastNotTalking: " + this.f345777J);
            this.f345777J = z17;
            if (z17) {
                getMicAudioWaveIcon().n();
                getMicAudioWaveIcon().setVisibility(8);
            } else {
                getMicAudioWaveIcon().setVisibility(0);
                getMicAudioWaveIcon().g();
            }
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

    public android.widget.ImageView getAudioBgView() {
        return getFinderLiveMicStateAudioBg();
    }

    public android.widget.ImageView getAvatarView() {
        return getFinderLiveMicStateAudioAvatar();
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
        android.view.ViewGroup viewGroup = this.U;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("finderLiveLuckyMoneyBubbleUiRoot");
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
        android.widget.FrameLayout frameLayout = this.L;
        if (frameLayout != null) {
            return frameLayout;
        }
        kotlin.jvm.internal.o.o("finderLiveMicMuteIcon");
        throw null;
    }

    public final com.tencent.mm.ui.widget.imageview.WeImageView getFinderLiveMicMuteIconWe() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.M;
        if (weImageView != null) {
            return weImageView;
        }
        kotlin.jvm.internal.o.o("finderLiveMicMuteIconWe");
        throw null;
    }

    public final android.view.ViewGroup getFinderLiveMicNewNormalMicGiftItemLayout() {
        android.view.ViewGroup viewGroup = this.P;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("finderLiveMicNewNormalMicGiftItemLayout");
        throw null;
    }

    public final android.widget.ImageView getFinderLiveMicStateAudioAvatar() {
        android.widget.ImageView imageView = this.Q;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.o.o("finderLiveMicStateAudioAvatar");
        throw null;
    }

    public final android.widget.ImageView getFinderLiveMicStateAudioBg() {
        android.widget.ImageView imageView = this.S;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.o.o("finderLiveMicStateAudioBg");
        throw null;
    }

    public final android.widget.TextView getFinderLiveMicStateAudioName() {
        android.widget.TextView textView = this.R;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("finderLiveMicStateAudioName");
        throw null;
    }

    public final com.tencent.mm.view.MMPAGView getFinderLiveMicStateAudioWaveIcon() {
        com.tencent.mm.view.MMPAGView mMPAGView = this.K;
        if (mMPAGView != null) {
            return mMPAGView;
        }
        kotlin.jvm.internal.o.o("finderLiveMicStateAudioWaveIcon");
        throw null;
    }

    public final android.widget.TextView getFinderLiveMicTagText() {
        return this.V;
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

    public com.tencent.mm.view.MMPAGView getMicAudioWaveIcon() {
        return getFinderLiveMicStateAudioWaveIcon();
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

    public android.widget.TextView getNickTextView() {
        return getFinderLiveMicStateAudioName();
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
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/base/FinderLiveMicBaseCoverAudioWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
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
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/base/FinderLiveMicBaseCoverAudioWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // wj2.w, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getMicAudioWaveIcon().setVisibility(8);
        getMicAudioWaveIcon().n();
    }

    public final void setFinderLiveLuckyMoneyBubbleUiRoot(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        this.U = viewGroup;
    }

    public final void setFinderLiveMicHeartText(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<set-?>");
        this.T = textView;
    }

    public final void setFinderLiveMicMuteIcon(android.widget.FrameLayout frameLayout) {
        kotlin.jvm.internal.o.g(frameLayout, "<set-?>");
        this.L = frameLayout;
    }

    public final void setFinderLiveMicMuteIconWe(com.tencent.mm.ui.widget.imageview.WeImageView weImageView) {
        kotlin.jvm.internal.o.g(weImageView, "<set-?>");
        this.M = weImageView;
    }

    public final void setFinderLiveMicNewNormalMicGiftItemLayout(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        this.P = viewGroup;
    }

    public final void setFinderLiveMicStateAudioAvatar(android.widget.ImageView imageView) {
        kotlin.jvm.internal.o.g(imageView, "<set-?>");
        this.Q = imageView;
    }

    public final void setFinderLiveMicStateAudioBg(android.widget.ImageView imageView) {
        kotlin.jvm.internal.o.g(imageView, "<set-?>");
        this.S = imageView;
    }

    public final void setFinderLiveMicStateAudioName(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<set-?>");
        this.R = textView;
    }

    public final void setFinderLiveMicStateAudioWaveIcon(com.tencent.mm.view.MMPAGView mMPAGView) {
        kotlin.jvm.internal.o.g(mMPAGView, "<set-?>");
        this.K = mMPAGView;
    }

    public final void setFinderLiveMicTagText(android.widget.TextView textView) {
        this.V = textView;
    }

    public final void setRoot(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        this.N = viewGroup;
    }
}
