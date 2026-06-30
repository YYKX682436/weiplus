package ni2;

/* loaded from: classes10.dex */
public final class x extends com.tencent.mm.plugin.finder.live.widget.e0 implements android.view.View.OnClickListener {
    public final zh2.c H;
    public final yz5.l I;

    /* renamed from: J, reason: collision with root package name */
    public fg2.b1 f337501J;
    public bj2.c K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.content.Context context, zh2.c pluginAbility, yz5.l notifyViewClick) {
        super(context, false, null, 0.6f, 6, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(notifyViewClick, "notifyViewClick");
        this.H = pluginAbility;
        this.I = notifyViewClick;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.df7;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public java.lang.String L() {
        java.lang.String string = this.f118183e.getResources().getString(com.tencent.mm.R.string.ezb);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        int i17 = com.tencent.mm.R.id.f_r;
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) x4.b.a(rootView, com.tencent.mm.R.id.f_r);
        if (roundCornerRelativeLayout != null) {
            i17 = com.tencent.mm.R.id.fam;
            com.tencent.mm.view.ratio.RatioLayout ratioLayout = (com.tencent.mm.view.ratio.RatioLayout) x4.b.a(rootView, com.tencent.mm.R.id.fam);
            if (ratioLayout != null) {
                i17 = com.tencent.mm.R.id.rfv;
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(rootView, com.tencent.mm.R.id.rfv);
                if (constraintLayout != null) {
                    i17 = com.tencent.mm.R.id.rfw;
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.rfw);
                    if (weImageView != null) {
                        i17 = com.tencent.mm.R.id.rfx;
                        android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.rfx);
                        if (textView != null) {
                            i17 = com.tencent.mm.R.id.rkl;
                            android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.rkl);
                            if (textView2 != null) {
                                i17 = com.tencent.mm.R.id.rkm;
                                androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(rootView, com.tencent.mm.R.id.rkm);
                                if (constraintLayout2 != null) {
                                    i17 = com.tencent.mm.R.id.rqo;
                                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.rqo);
                                    if (weImageView2 != null) {
                                        i17 = com.tencent.mm.R.id.rqp;
                                        android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.rqp);
                                        if (textView3 != null) {
                                            i17 = com.tencent.mm.R.id.f485916rr3;
                                            android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.f485916rr3);
                                            if (textView4 != null) {
                                                i17 = com.tencent.mm.R.id.rrj;
                                                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.rrj);
                                                if (linearLayout != null) {
                                                    i17 = com.tencent.mm.R.id.mce;
                                                    androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) x4.b.a(rootView, com.tencent.mm.R.id.mce);
                                                    if (nestedScrollView != null) {
                                                        this.f337501J = new fg2.b1((android.widget.LinearLayout) rootView, roundCornerRelativeLayout, ratioLayout, constraintLayout, weImageView, textView, textView2, constraintLayout2, weImageView2, textView3, textView4, linearLayout, nestedScrollView);
                                                        constraintLayout.setOnClickListener(this);
                                                        fg2.b1 b1Var = this.f337501J;
                                                        if (b1Var == null) {
                                                            kotlin.jvm.internal.o.o("uiBinding");
                                                            throw null;
                                                        }
                                                        b1Var.f261950e.setOnClickListener(this);
                                                        zh2.c cVar = this.H;
                                                        com.tencent.mm.live.core.view.LivePreviewView j17 = cVar.j();
                                                        android.content.Context context = this.f118183e;
                                                        bj2.c cVar2 = new bj2.c(context, cVar, j17);
                                                        this.K = cVar2;
                                                        fg2.b1 b1Var2 = this.f337501J;
                                                        if (b1Var2 == null) {
                                                            kotlin.jvm.internal.o.o("uiBinding");
                                                            throw null;
                                                        }
                                                        b1Var2.f261947b.setAdapter(cVar2);
                                                        fg2.b1 b1Var3 = this.f337501J;
                                                        if (b1Var3 == null) {
                                                            kotlin.jvm.internal.o.o("uiBinding");
                                                            throw null;
                                                        }
                                                        b1Var3.f261947b.setLayoutManager(new com.tencent.mm.view.ratio.a());
                                                        a0(context.getDrawable(com.tencent.mm.R.drawable.clh));
                                                        return;
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
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void S() {
        super.S();
        fg2.b1 b1Var = this.f337501J;
        if (b1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        int childCount = b1Var.f261947b.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            fg2.b1 b1Var2 = this.f337501J;
            if (b1Var2 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            android.view.View childAt = b1Var2.f261947b.getChildAt(i17);
            if (childAt != null && (childAt instanceof cj2.h)) {
                ((cj2.h) childAt).c();
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void U() {
        super.U();
        this.I.invoke(java.lang.Integer.valueOf(this.L));
    }

    public final void e0() {
        fg2.b1 b1Var = this.f337501J;
        if (b1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        b1Var.f261949d.setVisibility(0);
        fg2.b1 b1Var2 = this.f337501J;
        if (b1Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        b1Var2.f261951f.setVisibility(8);
        this.L = 0;
        fg2.b1 b1Var3 = this.f337501J;
        if (b1Var3 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = b1Var3.f261947b.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i65.a.b(this.f118183e, 96);
        }
        fg2.b1 b1Var4 = this.f337501J;
        if (b1Var4 != null) {
            b1Var4.f261947b.requestLayout();
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }

    public final void f0() {
        fg2.b1 b1Var = this.f337501J;
        if (b1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        b1Var.f261949d.setVisibility(8);
        fg2.b1 b1Var2 = this.f337501J;
        if (b1Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        b1Var2.f261951f.setVisibility(0);
        this.L = 1;
        fg2.b1 b1Var3 = this.f337501J;
        if (b1Var3 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = b1Var3.f261947b.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -1;
        }
        fg2.b1 b1Var4 = this.f337501J;
        if (b1Var4 != null) {
            b1Var4.f261947b.requestLayout();
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }

    public final void g0(int i17) {
        com.tencent.mm.plugin.finder.live.widget.e0.W(this, null, false, 0, 7, null);
        if (i17 == 1) {
            f0();
        } else {
            e0();
        }
        zh2.c cVar = this.H;
        xh2.c cVar2 = (xh2.c) ((mm2.o4) cVar.g().a(mm2.o4.class)).A.getValue();
        if (cVar2 != null) {
            bj2.c cVar3 = this.K;
            if (cVar3 == null) {
                kotlin.jvm.internal.o.o("ratioAdapter");
                throw null;
            }
            cVar3.f21155h = cVar.c();
            bj2.c cVar4 = this.K;
            if (cVar4 != null) {
                cVar4.h(cVar2.f454533c, cVar2.f454531a);
            } else {
                kotlin.jvm.internal.o.o("ratioAdapter");
                throw null;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicLayoutSelectWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.b1 b1Var = this.f337501J;
        if (b1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        int id6 = b1Var.f261948c.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            e0();
        } else {
            fg2.b1 b1Var2 = this.f337501J;
            if (b1Var2 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            int id7 = b1Var2.f261950e.getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                f0();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicLayoutSelectWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public android.view.View v() {
        android.widget.TextView x17 = x();
        x17.setEnabled(true);
        return x17;
    }
}
