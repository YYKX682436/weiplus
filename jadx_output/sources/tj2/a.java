package tj2;

/* loaded from: classes10.dex */
public final class a extends wj2.y {
    public android.view.View F1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
    }

    @Override // wj2.y, oj2.l, wj2.w
    public void R() {
        super.R();
        android.view.View view = this.F1;
        if (view == null) {
            kotlin.jvm.internal.o.o("clickContainView");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int C0 = zl2.r4.C0(zl2.r4.f473950a, 0, 0, 3, null);
            df2.nv nvVar = (df2.nv) getPluginAbility().o(df2.nv.class);
            marginLayoutParams.topMargin = C0 + (nvVar != null ? nvVar.f230890q : 0);
        }
    }

    @Override // wj2.y, oj2.l
    public void a0() {
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.dnl, (android.view.ViewGroup) this, false);
        int i17 = com.tencent.mm.R.id.g9c;
        if (((android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.g9c)) != null) {
            i17 = com.tencent.mm.R.id.f1j;
            if (((androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(inflate, com.tencent.mm.R.id.f1j)) != null) {
                i17 = com.tencent.mm.R.id.afh;
                if (((android.widget.Space) x4.b.a(inflate, com.tencent.mm.R.id.afh)) != null) {
                    i17 = com.tencent.mm.R.id.fxv;
                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(inflate, com.tencent.mm.R.id.fxv);
                    if (constraintLayout != null) {
                        i17 = com.tencent.mm.R.id.ejn;
                        if (((com.tencent.mm.ui.widget.RoundCornerFrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.ejn)) != null) {
                            i17 = com.tencent.mm.R.id.eop;
                            android.view.View a17 = x4.b.a(inflate, com.tencent.mm.R.id.eop);
                            if (a17 != null) {
                                fg2.j1.a(a17);
                                i17 = com.tencent.mm.R.id.f484566ep0;
                                android.view.View a18 = x4.b.a(inflate, com.tencent.mm.R.id.f484566ep0);
                                if (a18 != null) {
                                    fg2.k1.a(a18);
                                    i17 = com.tencent.mm.R.id.f484572er0;
                                    if (((androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(inflate, com.tencent.mm.R.id.f484572er0)) != null) {
                                        i17 = com.tencent.mm.R.id.ewh;
                                        if (((android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.ewh)) != null) {
                                            i17 = com.tencent.mm.R.id.f484711f85;
                                            android.view.View a19 = x4.b.a(inflate, com.tencent.mm.R.id.f484711f85);
                                            if (a19 != null) {
                                                fg2.u.a(a19);
                                                i17 = com.tencent.mm.R.id.f8q;
                                                android.view.View a27 = x4.b.a(inflate, com.tencent.mm.R.id.f8q);
                                                if (a27 != null) {
                                                    fg2.y.a(a27);
                                                    i17 = com.tencent.mm.R.id.f_i;
                                                    if (((android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.f_i)) != null) {
                                                        i17 = com.tencent.mm.R.id.fa_;
                                                        if (((com.tencent.mm.plugin.finder.live.mic.widget.VisibilityTextView) x4.b.a(inflate, com.tencent.mm.R.id.fa_)) != null) {
                                                            i17 = com.tencent.mm.R.id.fak;
                                                            android.view.View a28 = x4.b.a(inflate, com.tencent.mm.R.id.fak);
                                                            if (a28 != null) {
                                                                fg2.r0.a(a28);
                                                                i17 = com.tencent.mm.R.id.fal;
                                                                android.view.View a29 = x4.b.a(inflate, com.tencent.mm.R.id.fal);
                                                                if (a29 != null) {
                                                                    fg2.x0.a(a29);
                                                                    com.tencent.mm.ui.widget.RoundCornerConstraintLayout roundCornerConstraintLayout = (com.tencent.mm.ui.widget.RoundCornerConstraintLayout) inflate;
                                                                    int i18 = com.tencent.mm.R.id.fqg;
                                                                    android.view.View a37 = x4.b.a(inflate, com.tencent.mm.R.id.fqg);
                                                                    if (a37 != null) {
                                                                        fg2.v1.a(a37);
                                                                        i18 = com.tencent.mm.R.id.f486317qn3;
                                                                        if (((android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.f486317qn3)) != null) {
                                                                            kotlin.jvm.internal.o.f(roundCornerConstraintLayout, "getRoot(...)");
                                                                            d0(roundCornerConstraintLayout);
                                                                            this.F1 = constraintLayout;
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
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // oj2.l
    public android.view.View getClickView() {
        android.view.View view = this.F1;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("clickContainView");
        throw null;
    }

    @Override // wj2.y, oj2.l, wj2.w, sj2.m
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator getGiftInAnimator() {
        return null;
    }

    @Override // wj2.y, oj2.l, wj2.w, lj2.u0
    public sj2.m getMicGiftCallback() {
        return this;
    }

    @Override // wj2.y, lj2.j
    public java.lang.String getTagString() {
        return "FullCoverPkAnchorSelfWidget";
    }
}
