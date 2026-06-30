package qh2;

/* loaded from: classes10.dex */
public final class i extends qh2.j {
    public com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service, 1);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
        if (pluginAbility.f() == lj2.w0.f318958d) {
            getRoot().setOnClickListener(new qh2.e(service, this));
        }
    }

    @Override // wj2.w
    public void R() {
        t(getAvatarView());
        km2.q bindLinkMicUser = getBindLinkMicUser();
        if (bindLinkMicUser != null) {
            f(bindLinkMicUser.f309183n, bindLinkMicUser.f309191v, false);
        }
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = this.Q;
        if (ripperAnimateView != null) {
            ripperAnimateView.b(getService().a());
        }
        km2.q bindLinkMicUser2 = getBindLinkMicUser();
        if (bindLinkMicUser2 != null) {
            if (com.tencent.mm.storage.z3.S3(bindLinkMicUser2.f309172c)) {
                com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView2 = this.Q;
                if (ripperAnimateView2 != null) {
                    ripperAnimateView2.setAnimateMode(jj2.e.f299979d);
                }
            } else {
                com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView3 = this.Q;
                if (ripperAnimateView3 != null) {
                    ripperAnimateView3.setAnimateMode(jj2.e.f299980e);
                }
            }
        }
        getFinderLiveMicGiftItemLayout().setVisibility(8);
    }

    @Override // qh2.j, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getAnchorAudioModeLayout() {
        return null;
    }

    @Override // qh2.j, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getAnchorCriticalLayout() {
        return null;
    }

    @Override // qh2.j, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ ai2.a getBattleResultWidget() {
        return null;
    }

    @Override // qh2.j, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ qi2.s1 getBattleTipsWidget() {
        return null;
    }

    @Override // qh2.j, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getCriticalGiftLayout() {
        return null;
    }

    @Override // qh2.j, wj2.w, sj2.m
    public android.animation.ValueAnimator getGiftInAnimator() {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new qh2.f(this));
        return ofFloat;
    }

    @Override // qh2.j, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getLotteryBubbleRootView() {
        return null;
    }

    @Override // qh2.j, wj2.w, lj2.u0
    public sj2.m getMicGiftCallback() {
        return this;
    }

    @Override // lj2.j
    public java.lang.String getTagString() {
        return "KTVSingMicAudioCoverWidget";
    }

    @Override // qh2.j, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getVoteBubbleRootView() {
        return null;
    }

    public final com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView getWaveView() {
        return this.Q;
    }

    public final void setWaveView(com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView) {
        this.Q = ripperAnimateView;
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
