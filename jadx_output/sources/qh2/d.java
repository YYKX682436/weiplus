package qh2;

/* loaded from: classes10.dex */
public final class d extends oj2.c {
    public android.view.ViewGroup P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
        if (pluginAbility.f() == lj2.w0.f318958d) {
            getRoot().setOnClickListener(new qh2.a(this, service, pluginAbility));
        }
    }

    @Override // oj2.c, wj2.w
    public void R() {
        lf2.a aVar;
        super.R();
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView waveView = getWaveView();
        if (waveView != null) {
            waveView.b(getService().a());
        }
        km2.q bindLinkMicUser = getBindLinkMicUser();
        if (bindLinkMicUser != null) {
            if (com.tencent.mm.storage.z3.S3(bindLinkMicUser.f309172c)) {
                com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView waveView2 = getWaveView();
                if (waveView2 != null) {
                    waveView2.setAnimateMode(jj2.e.f299979d);
                }
            } else {
                com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView waveView3 = getWaveView();
                if (waveView3 != null) {
                    waveView3.setAnimateMode(jj2.e.f299980e);
                }
            }
        }
        getFinderLiveMicGiftItemLayout().setVisibility(8);
        if (!G() || (aVar = (lf2.a) getPluginAbility().o(lf2.a.class)) == null) {
            return;
        }
        aVar.Z6(1, 4);
    }

    @Override // oj2.c
    public void Z() {
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.drc, (android.view.ViewGroup) this, false);
        int i17 = com.tencent.mm.R.id.fak;
        android.view.View a17 = x4.b.a(inflate, com.tencent.mm.R.id.fak);
        if (a17 != null) {
            fg2.h0 a18 = fg2.h0.a(a17);
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) inflate;
            int i18 = com.tencent.mm.R.id.qrn;
            android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.qrn);
            if (imageView != null) {
                i18 = com.tencent.mm.R.id.qxy;
                com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = (com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView) x4.b.a(inflate, com.tencent.mm.R.id.qxy);
                if (ripperAnimateView != null) {
                    setWaveView(ripperAnimateView);
                    getPluginAbility().a0().b(new qh2.c(this));
                    setFinderLiveMicUserAvatar(imageView);
                    android.widget.RelativeLayout relativeLayout = a18.f262062a;
                    kotlin.jvm.internal.o.f(relativeLayout, "getRoot(...)");
                    setFinderLiveMicGiftItemLayout(relativeLayout);
                    getFinderLiveMicGiftItemLayout().setTranslationY(-i65.a.b(getContext(), 10));
                    getFinderLiveMicGiftItemLayout().setTranslationX(i65.a.b(getContext(), 32));
                    kotlin.jvm.internal.o.f(constraintLayout, "getRoot(...)");
                    setRoot(constraintLayout);
                    return;
                }
            }
            i17 = i18;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // oj2.c, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getAnchorAudioModeLayout() {
        return null;
    }

    @Override // oj2.c, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getAnchorCriticalLayout() {
        return null;
    }

    @Override // oj2.c, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ ai2.a getBattleResultWidget() {
        return null;
    }

    @Override // oj2.c, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ qi2.s1 getBattleTipsWidget() {
        return null;
    }

    @Override // oj2.c, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getCriticalGiftLayout() {
        return null;
    }

    public final android.view.ViewGroup getFinderLiveMicGiftItemLayout() {
        android.view.ViewGroup viewGroup = this.P;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("finderLiveMicGiftItemLayout");
        throw null;
    }

    @Override // oj2.c, wj2.w, sj2.m
    public android.animation.ValueAnimator getGiftInAnimator() {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new qh2.b(this));
        return ofFloat;
    }

    @Override // oj2.c, wj2.w, sj2.m
    public android.view.ViewGroup getGiftRootView() {
        return getFinderLiveMicGiftItemLayout();
    }

    @Override // oj2.c, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getLotteryBubbleRootView() {
        return null;
    }

    @Override // oj2.c, wj2.w, lj2.u0
    public sj2.m getMicGiftCallback() {
        return this;
    }

    @Override // lj2.j
    public java.lang.String getTagString() {
        return "KTVSingMicAnchorCoverWidget";
    }

    @Override // oj2.c, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getVoteBubbleRootView() {
        return null;
    }

    public final void setFinderLiveMicGiftItemLayout(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        this.P = viewGroup;
    }

    @Override // lj2.j
    public void t(android.widget.ImageView imageView) {
        jz5.f0 f0Var;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        km2.q bindLinkMicUser = getBindLinkMicUser();
        mn2.g1 g1Var = mn2.g1.f329975a;
        if (bindLinkMicUser == null || imageView == null) {
            f0Var = null;
        } else {
            if (com.tencent.mm.storage.z3.S3(bindLinkMicUser.f309172c)) {
                g1Var.a().c(new mn2.q3(bindLinkMicUser.f309171b, com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView, g1Var.h(mn2.f1.f329965s));
            } else {
                g1Var.l().c(new mn2.q3(bindLinkMicUser.f309171b, com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView, g1Var.h(mn2.f1.f329965s));
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var != null || imageView == null) {
            return;
        }
        vo0.d a17 = g1Var.a();
        km2.q bindLinkMicUser2 = getBindLinkMicUser();
        a17.c(new mn2.q3(bindLinkMicUser2 != null ? bindLinkMicUser2.f309171b : null, com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView, g1Var.h(mn2.f1.f329961o));
    }
}
