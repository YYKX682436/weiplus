package tj2;

/* loaded from: classes10.dex */
public final class b extends wj2.c0 {
    public android.view.ViewGroup D1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
    }

    @Override // wj2.c0, oj2.o, wj2.w
    public void R() {
        super.R();
        android.view.ViewGroup viewGroup = this.D1;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("clickContainView");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int C0 = zl2.r4.C0(zl2.r4.f473950a, 0, 0, 3, null);
            df2.nv nvVar = (df2.nv) getPluginAbility().o(df2.nv.class);
            marginLayoutParams.topMargin = C0 + (nvVar != null ? nvVar.f230890q : 0);
        }
    }

    @Override // wj2.c0, oj2.o
    public void a0() {
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.df6, (android.view.ViewGroup) this, false);
        int i17 = com.tencent.mm.R.id.afh;
        if (((android.widget.Space) x4.b.a(inflate, com.tencent.mm.R.id.afh)) != null) {
            i17 = com.tencent.mm.R.id.fxv;
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(inflate, com.tencent.mm.R.id.fxv);
            if (constraintLayout != null) {
                i17 = com.tencent.mm.R.id.che;
                if (((androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(inflate, com.tencent.mm.R.id.che)) != null) {
                    i17 = com.tencent.mm.R.id.eop;
                    android.view.View a17 = x4.b.a(inflate, com.tencent.mm.R.id.eop);
                    if (a17 != null) {
                        fg2.j1.a(a17);
                        i17 = com.tencent.mm.R.id.f484566ep0;
                        android.view.View a18 = x4.b.a(inflate, com.tencent.mm.R.id.f484566ep0);
                        if (a18 != null) {
                            fg2.k1.a(a18);
                            i17 = com.tencent.mm.R.id.evg;
                            android.view.View a19 = x4.b.a(inflate, com.tencent.mm.R.id.evg);
                            if (a19 != null) {
                                fg2.v0.a(a19);
                                i17 = com.tencent.mm.R.id.fa_;
                                if (((com.tencent.mm.plugin.finder.live.mic.widget.VisibilityTextView) x4.b.a(inflate, com.tencent.mm.R.id.fa_)) != null) {
                                    i17 = com.tencent.mm.R.id.fag;
                                    if (((android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.fag)) != null) {
                                        i17 = com.tencent.mm.R.id.fah;
                                        if (((com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(inflate, com.tencent.mm.R.id.fah)) != null) {
                                            i17 = com.tencent.mm.R.id.fak;
                                            android.view.View a27 = x4.b.a(inflate, com.tencent.mm.R.id.fak);
                                            if (a27 != null) {
                                                fg2.r0.a(a27);
                                                i17 = com.tencent.mm.R.id.fal;
                                                android.view.View a28 = x4.b.a(inflate, com.tencent.mm.R.id.fal);
                                                if (a28 != null) {
                                                    fg2.x0.a(a28);
                                                    i17 = com.tencent.mm.R.id.fnz;
                                                    if (((android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.fnz)) != null) {
                                                        i17 = com.tencent.mm.R.id.f484836fo0;
                                                        if (((com.tencent.mm.plugin.finder.live.view.FinderFixedTextView) x4.b.a(inflate, com.tencent.mm.R.id.f484836fo0)) != null) {
                                                            androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = (androidx.constraintlayout.widget.ConstraintLayout) inflate;
                                                            int i18 = com.tencent.mm.R.id.f484838fo3;
                                                            if (((android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.f484838fo3)) != null) {
                                                                i18 = com.tencent.mm.R.id.f486680m42;
                                                                if (((android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.f486680m42)) != null) {
                                                                    kotlin.jvm.internal.o.f(constraintLayout2, "getRoot(...)");
                                                                    f0(constraintLayout2);
                                                                    this.D1 = constraintLayout;
                                                                    android.view.ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                                                                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                                                                    if (marginLayoutParams != null) {
                                                                        marginLayoutParams.topMargin = zl2.r4.C0(zl2.r4.f473950a, 0, 0, 3, null);
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                            }
                                                            i17 = i18;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // wj2.c0, oj2.o, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getAnchorAudioModeLayout() {
        return null;
    }

    @Override // wj2.c0, oj2.o, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getAnchorCriticalLayout() {
        return null;
    }

    @Override // oj2.o
    public android.view.ViewGroup getClickRoot() {
        android.view.ViewGroup viewGroup = this.D1;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("clickContainView");
        throw null;
    }

    @Override // wj2.c0, oj2.o, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getCriticalGiftLayout() {
        return null;
    }

    @Override // wj2.c0, oj2.o, wj2.w, sj2.m
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator getGiftInAnimator() {
        return null;
    }

    @Override // wj2.c0, oj2.o, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getLotteryBubbleRootView() {
        return null;
    }

    @Override // wj2.c0, oj2.o, wj2.w, lj2.u0
    public sj2.m getMicGiftCallback() {
        return this;
    }

    @Override // wj2.c0, lj2.j
    public java.lang.String getTagString() {
        return "FullCoverPkOtherAnchorWidget";
    }

    @Override // wj2.c0, oj2.o, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getVoteBubbleRootView() {
        return null;
    }

    @Override // wj2.c0, wj2.w
    public void x() {
    }
}
