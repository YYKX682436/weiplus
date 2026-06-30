package oj2;

/* loaded from: classes10.dex */
public abstract class f extends wj2.w implements android.view.View.OnClickListener {

    /* renamed from: J, reason: collision with root package name */
    public boolean f345763J;
    public android.widget.FrameLayout K;
    public com.tencent.mm.ui.widget.imageview.WeImageView L;
    public pj2.c M;
    public android.view.ViewGroup N;
    public android.view.ViewGroup P;
    public android.widget.TextView Q;
    public oj2.s R;
    public android.widget.ImageView S;
    public android.widget.TextView T;
    public android.widget.TextView U;
    public android.view.ViewGroup V;
    public android.view.ViewGroup W;

    /* renamed from: l1, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f345764l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.graphics.drawable.Drawable f345765p0;

    /* renamed from: x0, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f345766x0;

    /* renamed from: y0, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f345767y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service, 1);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
        this.f345766x0 = context.getResources().getDrawable(com.tencent.mm.R.color.f479091af4);
        this.f345767y0 = context.getResources().getDrawable(com.tencent.mm.R.color.af6);
        this.f345764l1 = context.getResources().getDrawable(com.tencent.mm.R.color.f479093af5);
        kj2.j0 j0Var = (kj2.j0) this;
        fg2.j a17 = fg2.j.a(com.tencent.mm.ui.id.b(j0Var.getContext()), j0Var, false);
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = a17.f262097k;
        j0Var.f308409p1 = ripperAnimateView;
        if (ripperAnimateView != null) {
            ripperAnimateView.b(j0Var.getService().a());
        }
        j0Var.setWaveViewCallback(new kj2.i0(j0Var));
        android.widget.FrameLayout finderLiveMicMuteIcon = a17.f262091e;
        kotlin.jvm.internal.o.f(finderLiveMicMuteIcon, "finderLiveMicMuteIcon");
        j0Var.setFinderLiveMicMuteIcon(finderLiveMicMuteIcon);
        com.tencent.mm.ui.widget.imageview.WeImageView finderLiveMicMuteIconWe = a17.f262092f;
        kotlin.jvm.internal.o.f(finderLiveMicMuteIconWe, "finderLiveMicMuteIconWe");
        j0Var.setFinderLiveMicMuteIconWe(finderLiveMicMuteIconWe);
        android.widget.ImageView finderLiveMicUserAvatar = a17.f262096j;
        kotlin.jvm.internal.o.f(finderLiveMicUserAvatar, "finderLiveMicUserAvatar");
        j0Var.setFinderLiveMicUserAvatar(finderLiveMicUserAvatar);
        com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderLiveMicNickName = a17.f262094h;
        kotlin.jvm.internal.o.f(finderLiveMicNickName, "finderLiveMicNickName");
        j0Var.setFinderLiveMicUserNickText(finderLiveMicNickName);
        com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderLiveMicHeartText = a17.f262090d;
        kotlin.jvm.internal.o.f(finderLiveMicHeartText, "finderLiveMicHeartText");
        j0Var.setFinderLiveMicHeartText(finderLiveMicHeartText);
        android.widget.RelativeLayout relativeLayout = a17.f262093g.f262062a;
        kotlin.jvm.internal.o.f(relativeLayout, "getRoot(...)");
        j0Var.setFinderLiveMicGiftItemLayout(relativeLayout);
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = a17.f262089c.f261957a;
        kotlin.jvm.internal.o.f(roundCornerRelativeLayout, "getRoot(...)");
        j0Var.setFinderLiveLuckyMoneyBubbleUiRoot(roundCornerRelativeLayout);
        fg2.h1 h1Var = a17.f262095i;
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout2 = h1Var.f262063a;
        kotlin.jvm.internal.o.f(roundCornerRelativeLayout2, "getRoot(...)");
        j0Var.setMicTagLayout(roundCornerRelativeLayout2);
        android.widget.TextView tagTextView = h1Var.f262064b;
        kotlin.jvm.internal.o.f(tagTextView, "tagTextView");
        j0Var.setMicTagTextView(tagTextView);
        j0Var.setMicTagLocationWidget(new oj2.s(j0Var.getMicTagLayout(), j0Var.getPluginAbility()));
        fg2.r1 r1Var = a17.f262088b;
        android.widget.RelativeLayout relativeLayout2 = r1Var.f262284a;
        kotlin.jvm.internal.o.f(relativeLayout2, "getRoot(...)");
        j0Var.f308410x1 = new lj2.s0(relativeLayout2);
        float b17 = i65.a.b(j0Var.getContext(), 14);
        android.widget.RelativeLayout relativeLayout3 = r1Var.f262284a;
        relativeLayout3.setTranslationY(b17);
        relativeLayout3.setTranslationX(i65.a.b(j0Var.getContext(), -3));
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = a17.f262087a;
        kotlin.jvm.internal.o.f(constraintLayout, "getRoot(...)");
        j0Var.setRoot(constraintLayout);
        setClipChildren(false);
        setClipToPadding(false);
        addView(getRoot());
        if (pluginAbility.f() == lj2.w0.f318958d) {
            getRoot().setOnClickListener(this);
            getFinderLiveMicMuteIcon().setOnClickListener(this);
        }
        pluginAbility.a0().b(new oj2.d(this));
    }

    private final android.graphics.drawable.Drawable getTeamTagDrawable() {
        xh2.i iVar;
        lj2.t0 a07 = getPluginAbility().a0();
        xh2.a bindMicData = getBindMicData();
        if (a07.d((bindMicData == null || (iVar = bindMicData.f454521b) == null) ? 0 : iVar.f454553e)) {
            android.graphics.drawable.Drawable drawable = this.f345767y0;
            kotlin.jvm.internal.o.d(drawable);
            return drawable;
        }
        android.graphics.drawable.Drawable drawable2 = this.f345764l1;
        kotlin.jvm.internal.o.d(drawable2);
        return drawable2;
    }

    @Override // wj2.w
    public void I(boolean z17) {
        if (this.f345763J == z17) {
            pj2.c micAudioWaveViewCallback = getMicAudioWaveViewCallback();
            boolean z18 = false;
            if (micAudioWaveViewCallback != null && micAudioWaveViewCallback.c() == z17) {
                z18 = true;
            }
            if (!z18) {
                return;
            }
        }
        com.tencent.mars.xlog.Log.i(getTAG(), "notifyUserVolumeChange notTalking:" + z17 + " lastNotTalking: " + this.f345763J);
        this.f345763J = z17;
        pm0.v.X(new oj2.e(z17, this));
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
    public void S(android.widget.TextView textView) {
        if (textView != null) {
            textView.setText("0");
        }
        super.S(textView);
    }

    @Override // sj2.m
    public void a() {
        com.tencent.mars.xlog.Log.i(getTAG(), "onGiftAnimationStart");
    }

    @Override // sj2.m
    public void d() {
        com.tencent.mars.xlog.Log.i(getTAG(), "onGiftAnimationEnd");
    }

    @Override // wj2.w, lj2.u0
    public void f(boolean z17, int i17, boolean z18) {
        super.f(z17, i17, z18);
        boolean z19 = false;
        if (B() || (G() && getPluginAbility().a0().F())) {
            getMicAudioWaveViewCallback().a();
            getMicMuteIcon().setVisibility(0);
            return;
        }
        getMicMuteIcon().setVisibility(8);
        if (this.f345763J == z17) {
            pj2.c micAudioWaveViewCallback = getMicAudioWaveViewCallback();
            if (micAudioWaveViewCallback != null && micAudioWaveViewCallback.c() == z17) {
                z19 = true;
            }
            if (!z19) {
                return;
            }
        }
        com.tencent.mars.xlog.Log.i(getTAG(), "notifyMicUserTalkingState notTalking:" + z17 + " lastNotTalking: " + this.f345763J);
        this.f345763J = z17;
        if (z17) {
            getMicAudioWaveViewCallback().a();
        } else {
            getMicAudioWaveViewCallback().b();
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
        android.view.ViewGroup viewGroup = this.W;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("finderLiveLuckyMoneyBubbleUiRoot");
        throw null;
    }

    public final android.view.ViewGroup getFinderLiveMicGiftItemLayout() {
        android.view.ViewGroup viewGroup = this.V;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("finderLiveMicGiftItemLayout");
        throw null;
    }

    public final android.widget.TextView getFinderLiveMicHeartText() {
        android.widget.TextView textView = this.U;
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
        android.widget.ImageView imageView = this.S;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.o.o("finderLiveMicUserAvatar");
        throw null;
    }

    public final android.widget.TextView getFinderLiveMicUserNickText() {
        android.widget.TextView textView = this.T;
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

    public final oj2.s getMicTagLocationWidget() {
        return this.R;
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

    @Override // lj2.j
    public android.graphics.drawable.Drawable getTagLayoutBackgroundDrawable() {
        dk2.u4 K = getPluginAbility().a0().K();
        lj2.w0 f17 = getPluginAbility().f();
        lj2.w0 w0Var = lj2.w0.f318958d;
        android.graphics.drawable.Drawable drawable = this.f345766x0;
        if (f17 != w0Var && getPluginAbility().f() != lj2.w0.f318959e) {
            int a17 = getPluginAbility().a0().a();
            if ((a17 == 5 || a17 == 4) && getCurWidgetMode() == pm2.a.f356862r) {
                if (a17 == 5) {
                    return getTeamTagDrawable();
                }
                kotlin.jvm.internal.o.d(drawable);
                return drawable;
            }
        } else if (K != null && getCurWidgetMode() == pm2.a.f356862r) {
            if (K.f234160g == 2) {
                return getTeamTagDrawable();
            }
            kotlin.jvm.internal.o.d(drawable);
            return drawable;
        }
        android.graphics.drawable.Drawable drawable2 = this.f345765p0;
        if (drawable2 != null) {
            return drawable2;
        }
        android.graphics.drawable.Drawable tagLayoutBackgroundDrawable = super.getTagLayoutBackgroundDrawable();
        kotlin.jvm.internal.o.f(tagLayoutBackgroundDrawable, "getTagLayoutBackgroundDrawable(...)");
        return tagLayoutBackgroundDrawable;
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
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/base/FinderLiveBaseAudioRoomCoverWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
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
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/base/FinderLiveBaseAudioRoomCoverWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // wj2.w, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getMicAudioWaveViewCallback().a();
    }

    public final void setFinderLiveLuckyMoneyBubbleUiRoot(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        this.W = viewGroup;
    }

    public final void setFinderLiveMicGiftItemLayout(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        this.V = viewGroup;
    }

    public final void setFinderLiveMicHeartText(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<set-?>");
        this.U = textView;
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
        this.S = imageView;
    }

    public final void setFinderLiveMicUserNickText(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<set-?>");
        this.T = textView;
    }

    public final void setMicTagLayout(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        this.P = viewGroup;
    }

    public final void setMicTagLocationWidget(oj2.s sVar) {
        this.R = sVar;
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
