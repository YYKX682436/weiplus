package oj2;

/* loaded from: classes10.dex */
public abstract class c extends wj2.w implements android.view.View.OnClickListener {

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f345759J;
    public android.widget.ImageView K;
    public com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView L;
    public java.lang.Boolean M;
    public android.view.ViewGroup N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service, 3);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
        Z();
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = this.L;
        if (ripperAnimateView != null) {
            ripperAnimateView.b(service.a());
        }
        if (pluginAbility.f() == lj2.w0.f318958d) {
            getRoot().setOnClickListener(new oj2.a(this, pluginAbility));
        }
        addView(getRoot());
        setClipChildren(false);
    }

    @Override // wj2.w
    public void R() {
        android.widget.TextView micHeartText;
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = this.L;
        if (ripperAnimateView != null) {
            ripperAnimateView.b(getService().a());
        }
        t(getAvatarView());
        S(getMicHeartText());
        if (A() && (micHeartText = getMicHeartText()) != null) {
            setTouchDelegate(micHeartText);
            micHeartText.setOnClickListener(this);
        }
        km2.q bindLinkMicUser = getBindLinkMicUser();
        if (bindLinkMicUser != null) {
            if (com.tencent.mm.storage.z3.S3(bindLinkMicUser.f309172c)) {
                com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView2 = this.L;
                if (ripperAnimateView2 != null) {
                    ripperAnimateView2.setAnimateMode(jj2.e.f299979d);
                    return;
                }
                return;
            }
            com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView3 = this.L;
            if (ripperAnimateView3 != null) {
                ripperAnimateView3.setAnimateMode(jj2.e.f299980e);
            }
        }
    }

    public abstract void Z();

    @Override // sj2.m
    public void a() {
    }

    public final void a0(boolean z17) {
        if (kotlin.jvm.internal.o.b(this.M, java.lang.Boolean.valueOf(z17))) {
            com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = this.L;
            boolean z18 = false;
            if (ripperAnimateView != null && ripperAnimateView.c() == z17) {
                z18 = true;
            }
            if (z18) {
                return;
            }
        }
        this.M = java.lang.Boolean.valueOf(z17);
        pm0.v.X(new oj2.b(z17, this));
    }

    @Override // sj2.m
    public void d() {
    }

    public void e() {
        S(getMicHeartText());
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
        return this.K;
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

    public final android.widget.TextView getFinderLiveMicHeartText() {
        return this.f345759J;
    }

    public final android.widget.ImageView getFinderLiveMicUserAvatar() {
        return this.K;
    }

    @Override // wj2.w, sj2.m
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator getGiftInAnimator() {
        return null;
    }

    @Override // wj2.w, sj2.m
    public android.view.ViewGroup getGiftRootView() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getLotteryBubbleRootView() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    public android.view.ViewGroup getLuckyMoneyRootView() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    public sj2.m getMicGiftCallback() {
        return this;
    }

    public android.widget.TextView getMicHeartText() {
        return this.f345759J;
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

    public final com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView getWaveView() {
        return this.L;
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
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/base/FinderLiveBaseAudioRoomAnchorWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        android.widget.TextView micHeartText = getMicHeartText();
        if (kotlin.jvm.internal.o.b(valueOf, micHeartText != null ? java.lang.Integer.valueOf(micHeartText.getId()) : null)) {
            android.widget.TextView micHeartText2 = getMicHeartText();
            boolean z17 = false;
            if (micHeartText2 != null) {
                if (micHeartText2.getVisibility() == 0) {
                    z17 = true;
                }
            }
            if (z17) {
                H();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/base/FinderLiveBaseAudioRoomAnchorWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public final void setFinderLiveMicHeartText(android.widget.TextView textView) {
        this.f345759J = textView;
    }

    public final void setFinderLiveMicUserAvatar(android.widget.ImageView imageView) {
        this.K = imageView;
    }

    public final void setRoot(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        this.N = viewGroup;
    }

    public final void setWaveView(com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView) {
        this.L = ripperAnimateView;
    }
}
