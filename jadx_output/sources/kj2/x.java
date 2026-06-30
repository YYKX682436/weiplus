package kj2;

/* loaded from: classes10.dex */
public final class x extends oj2.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
    }

    @Override // oj2.c, wj2.w
    public void R() {
        super.R();
        getRoot().getViewTreeObserver().addOnPreDrawListener(new kj2.w(this));
    }

    @Override // oj2.c
    public void Z() {
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.d6h, (android.view.ViewGroup) this, false);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) inflate;
        int i17 = com.tencent.mm.R.id.qrn;
        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.qrn);
        if (imageView != null) {
            i17 = com.tencent.mm.R.id.qxy;
            com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = (com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView) x4.b.a(inflate, com.tencent.mm.R.id.qxy);
            if (ripperAnimateView != null) {
                setWaveView(ripperAnimateView);
                getPluginAbility().a0().b(new kj2.v(this));
                setFinderLiveMicUserAvatar(imageView);
                kotlin.jvm.internal.o.f(constraintLayout, "getRoot(...)");
                setRoot(constraintLayout);
                return;
            }
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

    @Override // oj2.c, wj2.w, sj2.m
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator getGiftInAnimator() {
        return null;
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
        return "BroadcastAnchorWidget";
    }

    @Override // oj2.c, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getVoteBubbleRootView() {
        return null;
    }

    @Override // lj2.j
    public void t(android.widget.ImageView imageView) {
        km2.q bindLinkMicUser = getBindLinkMicUser();
        if (bindLinkMicUser == null || imageView == null) {
            return;
        }
        imageView.setVisibility(0);
        boolean S3 = com.tencent.mm.storage.z3.S3(bindLinkMicUser.f309172c);
        mn2.g1 g1Var = mn2.g1.f329975a;
        if (S3) {
            g1Var.a().c(new mn2.q3(bindLinkMicUser.f309171b, com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView, g1Var.h(mn2.f1.f329965s));
        } else {
            g1Var.l().c(new mn2.n(bindLinkMicUser.f309171b, null, 2, null), imageView, g1Var.h(mn2.f1.f329965s));
        }
    }
}
