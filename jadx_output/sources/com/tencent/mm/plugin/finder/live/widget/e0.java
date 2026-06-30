package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public abstract class e0 extends com.tencent.mm.ui.widget.dialog.g2 {
    public final jz5.g A;
    public com.tencent.mm.ui.widget.dialog.y1 B;
    public com.tencent.mm.plugin.finder.live.widget.e0 C;
    public yz5.a D;
    public kotlinx.coroutines.y0 E;
    public boolean F;
    public boolean G;

    /* renamed from: e */
    public final android.content.Context f118183e;

    /* renamed from: f */
    public final boolean f118184f;

    /* renamed from: g */
    public final zl2.u4 f118185g;

    /* renamed from: h */
    public final float f118186h;

    /* renamed from: i */
    public final jz5.g f118187i;

    /* renamed from: m */
    public final jz5.g f118188m;

    /* renamed from: n */
    public final jz5.g f118189n;

    /* renamed from: o */
    public final jz5.g f118190o;

    /* renamed from: p */
    public final jz5.g f118191p;

    /* renamed from: q */
    public final jz5.g f118192q;

    /* renamed from: r */
    public final jz5.g f118193r;

    /* renamed from: s */
    public final jz5.g f118194s;

    /* renamed from: t */
    public final jz5.g f118195t;

    /* renamed from: u */
    public final jz5.g f118196u;

    /* renamed from: v */
    public final jz5.g f118197v;

    /* renamed from: w */
    public final jz5.g f118198w;

    /* renamed from: x */
    public final jz5.g f118199x;

    /* renamed from: y */
    public final jz5.g f118200y;

    /* renamed from: z */
    public final jz5.g f118201z;

    public /* synthetic */ e0(android.content.Context context, boolean z17, zl2.u4 u4Var, float f17, int i17, kotlin.jvm.internal.i iVar) {
        this(context, (i17 & 2) != 0 ? true : z17, (i17 & 4) != 0 ? zl2.u4.f473988d : u4Var, (i17 & 8) != 0 ? -1.0f : f17);
    }

    public final android.view.View I() {
        java.lang.Object value = ((jz5.n) this.f118190o).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    private final android.widget.TextView M() {
        java.lang.Object value = ((jz5.n) this.f118195t).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    public static /* synthetic */ void W(com.tencent.mm.plugin.finder.live.widget.e0 e0Var, com.tencent.mm.plugin.finder.live.widget.e0 e0Var2, boolean z17, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openPanel");
        }
        if ((i18 & 1) != 0) {
            e0Var2 = null;
        }
        if ((i18 & 2) != 0) {
            z17 = false;
        }
        if ((i18 & 4) != 0) {
            i17 = 0;
        }
        e0Var.V(e0Var2, z17, i17);
    }

    public static /* synthetic */ void t(com.tencent.mm.plugin.finder.live.widget.e0 e0Var, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: closePanel");
        }
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        e0Var.s(z17);
    }

    public abstract int A();

    public jz5.l B() {
        return new jz5.l("", "");
    }

    public final android.widget.RelativeLayout C() {
        java.lang.Object value = ((jz5.n) this.f118191p).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.RelativeLayout) value;
    }

    public int D() {
        return 0;
    }

    public android.view.View E(zl2.u4 uiMode) {
        kotlin.jvm.internal.o.g(uiMode, "uiMode");
        return null;
    }

    public final com.tencent.mm.plugin.finder.live.widget.e0 F(com.tencent.mm.plugin.finder.live.widget.e0 e0Var) {
        return (e0Var != null ? e0Var.C : null) == null ? e0Var : F(e0Var.C);
    }

    public final android.view.View G() {
        return (android.view.View) ((jz5.n) this.f118188m).getValue();
    }

    public final android.view.View H() {
        return I();
    }

    public int J() {
        return 8;
    }

    public int K() {
        return 48;
    }

    public java.lang.String L() {
        return "";
    }

    public abstract void N(android.view.View view);

    public boolean O() {
        return this instanceof el2.i0;
    }

    public boolean P() {
        com.tencent.mm.ui.widget.dialog.y1 y1Var;
        com.tencent.mm.ui.widget.dialog.y1 y1Var2 = this.B;
        if (y1Var2 != null && y1Var2.f()) {
            return true;
        }
        com.tencent.mm.plugin.finder.live.widget.e0 e0Var = this.C;
        return e0Var != null && (y1Var = e0Var.B) != null && y1Var.f();
    }

    public boolean Q() {
        return this instanceof w.h;
    }

    public void R() {
        kotlinx.coroutines.y0 y0Var = this.E;
        if (y0Var != null) {
            kotlinx.coroutines.z0.d(y0Var, "onCancel", null, 2, null);
        }
    }

    public void S() {
        java.util.LinkedList<com.tencent.mm.ui.widget.dialog.g2> linkedList;
        if (O()) {
            this.F = false;
        }
        com.tencent.mm.ui.widget.dialog.y1 y1Var = this.B;
        if (y1Var != null && (linkedList = y1Var.D) != null) {
            for (com.tencent.mm.ui.widget.dialog.g2 g2Var : linkedList) {
                com.tencent.mm.plugin.finder.live.widget.e0 e0Var = g2Var instanceof com.tencent.mm.plugin.finder.live.widget.e0 ? (com.tencent.mm.plugin.finder.live.widget.e0) g2Var : null;
                if (e0Var != null) {
                    e0Var.S();
                }
            }
        }
        yz5.a aVar = this.D;
        if (aVar != null) {
            aVar.invoke();
        }
        kotlinx.coroutines.y0 y0Var = this.E;
        if (y0Var != null) {
            kotlinx.coroutines.z0.d(y0Var, "onDismiss", null, 2, null);
        }
    }

    public void T() {
        t(this, false, 1, null);
    }

    public void U() {
        t(this, false, 1, null);
    }

    public void V(com.tencent.mm.plugin.finder.live.widget.e0 e0Var, boolean z17, int i17) {
        android.app.Dialog dialog;
        android.view.Window b17;
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior;
        android.view.ViewGroup.LayoutParams layoutParams;
        com.tencent.mm.plugin.finder.live.widget.e0 F;
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.E = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) a17).plus(kotlinx.coroutines.internal.b0.f310484a));
        if (!this.G) {
            this.G = true;
            jz5.g gVar = this.f118189n;
            java.lang.Object value = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            N((android.view.View) value);
            jz5.g gVar2 = this.f118187i;
            android.view.View view = (android.view.View) ((jz5.n) gVar2).getValue();
            if (view != null) {
                view.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.p(this));
            }
            android.view.View G = G();
            if (G != null) {
                G.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.q(this));
            }
            android.view.View view2 = (android.view.View) ((jz5.n) gVar2).getValue();
            jz5.g gVar3 = this.f118193r;
            jz5.g gVar4 = this.f118194s;
            if (view2 != null) {
                java.lang.Object value2 = ((jz5.n) gVar4).getValue();
                kotlin.jvm.internal.o.f(value2, "getValue(...)");
                ((android.widget.FrameLayout) value2).addView(view2);
                java.lang.Object value3 = ((jz5.n) gVar3).getValue();
                kotlin.jvm.internal.o.f(value3, "getValue(...)");
                android.view.View view3 = (android.view.View) value3;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage", "setLeftView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage", "setLeftView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View G2 = G();
            if (G2 != null) {
                java.lang.Object value4 = ((jz5.n) this.f118198w).getValue();
                kotlin.jvm.internal.o.f(value4, "getValue(...)");
                ((android.widget.FrameLayout) value4).addView(G2);
                java.lang.Object value5 = ((jz5.n) this.f118199x).getValue();
                kotlin.jvm.internal.o.f(value5, "getValue(...)");
                ((android.widget.TextView) value5).setVisibility(8);
            }
            java.lang.Object value6 = ((jz5.n) gVar3).getValue();
            kotlin.jvm.internal.o.f(value6, "getValue(...)");
            ((android.view.View) value6).setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.r(this));
            zl2.r4 r4Var = zl2.r4.f473950a;
            java.lang.Object value7 = ((jz5.n) gVar4).getValue();
            kotlin.jvm.internal.o.f(value7, "getValue(...)");
            zl2.r4.c3(r4Var, (android.widget.FrameLayout) value7, 0, 0, 6, null);
            Z(D());
            b0(J());
            c0(L());
            jz5.l B = B();
            java.lang.String mainTitle = (java.lang.String) B.f302833d;
            java.lang.String secondTitle = (java.lang.String) B.f302834e;
            kotlin.jvm.internal.o.g(mainTitle, "mainTitle");
            kotlin.jvm.internal.o.g(secondTitle, "secondTitle");
            boolean z18 = mainTitle.length() == 0;
            jz5.g gVar5 = this.f118197v;
            jz5.g gVar6 = this.f118196u;
            if (!z18) {
                if (!(secondTitle.length() == 0)) {
                    java.lang.Object value8 = ((jz5.n) gVar6).getValue();
                    kotlin.jvm.internal.o.f(value8, "getValue(...)");
                    ((android.widget.TextView) value8).setText(mainTitle);
                    java.lang.Object value9 = ((jz5.n) gVar6).getValue();
                    kotlin.jvm.internal.o.f(value9, "getValue(...)");
                    ((android.widget.TextView) value9).setVisibility(0);
                    java.lang.Object value10 = ((jz5.n) gVar5).getValue();
                    kotlin.jvm.internal.o.f(value10, "getValue(...)");
                    ((android.widget.TextView) value10).setText(secondTitle);
                    java.lang.Object value11 = ((jz5.n) gVar5).getValue();
                    kotlin.jvm.internal.o.f(value11, "getValue(...)");
                    ((android.widget.TextView) value11).setVisibility(0);
                    M().setVisibility(8);
                    java.lang.Object value12 = ((jz5.n) gVar).getValue();
                    kotlin.jvm.internal.o.f(value12, "getValue(...)");
                    z().addView((android.view.View) value12);
                }
            }
            java.lang.Object value13 = ((jz5.n) gVar6).getValue();
            kotlin.jvm.internal.o.f(value13, "getValue(...)");
            ((android.widget.TextView) value13).setVisibility(8);
            java.lang.Object value14 = ((jz5.n) gVar5).getValue();
            kotlin.jvm.internal.o.f(value14, "getValue(...)");
            ((android.widget.TextView) value14).setVisibility(8);
            java.lang.Object value122 = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value122, "getValue(...)");
            z().addView((android.view.View) value122);
        }
        r();
        if (!z17 && (F = F(e0Var)) != null && F.P()) {
            this.C = F(F);
            zl2.r4.f473950a.Q2(I());
            com.tencent.mm.ui.widget.dialog.y1 y1Var = F.B;
            if (y1Var != null) {
                y1Var.h(this);
                return;
            }
            return;
        }
        boolean z19 = this.F;
        float f17 = this.f118186h;
        android.content.Context context = this.f118183e;
        if (!z19) {
            this.F = true;
            zl2.r4 r4Var2 = zl2.r4.f473950a;
            r4Var2.Q2(I());
            boolean w17 = w();
            boolean z27 = this.f118184f;
            com.tencent.mm.ui.widget.dialog.y1 y1Var2 = new com.tencent.mm.ui.widget.dialog.y1(context, 0, w17, z27);
            this.B = y1Var2;
            y1Var2.k(I());
            y1Var2.p(true);
            y1Var2.f212033o = !O();
            if (r4Var2.Y1(context)) {
                y1Var2.m(java.lang.Boolean.TRUE);
                y1Var2.G = true;
            }
            y1Var2.i(true);
            y1Var2.F = !w();
            y1Var2.f212044z = Q();
            y1Var2.n(new com.tencent.mm.plugin.finder.live.widget.n(this));
            y1Var2.f212037s = new com.tencent.mm.plugin.finder.live.widget.o(this);
            android.view.Window b18 = y1Var2.b();
            if (b18 != null) {
                b18.setSoftInputMode(K());
            }
            android.view.View view4 = y1Var2.f212027f;
            if (view4 != null && (layoutParams = view4.getLayoutParams()) != null) {
                if (!(f17 == -1.0f)) {
                    layoutParams.height = (int) ((com.tencent.mm.ui.bl.b(context).y - com.tencent.mm.ui.bl.c(context)) * f17);
                }
            }
            if (context.getResources().getConfiguration().orientation == 2) {
                int b19 = com.tencent.mm.plugin.finder.view.x7.b(context);
                android.view.ViewGroup.LayoutParams layoutParams2 = y1Var2.f212027f.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = b19;
                    layoutParams2.height = b19 - com.tencent.mm.ui.bl.h(context);
                }
                y1Var2.A = b19;
                if (z27) {
                    android.view.ViewGroup.LayoutParams layoutParams3 = y1Var2.f212027f.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (marginLayoutParams != null) {
                        marginLayoutParams.topMargin = com.tencent.mm.ui.bl.h(context);
                    }
                }
            }
        }
        int i18 = C().getVisibility() == 0 ? C().getLayoutParams().height : ((android.view.View) ((jz5.n) this.f118200y).getValue()).getLayoutParams().height;
        com.tencent.mm.ui.widget.dialog.y1 y1Var3 = this.B;
        if (y1Var3 != null && (bottomSheetBehavior = y1Var3.f212036r) != null) {
            if (i17 > 0) {
                bottomSheetBehavior.C(i17 + i18);
            } else {
                if (!(f17 == -1.0f)) {
                    bottomSheetBehavior.C(((int) (com.tencent.mm.ui.bl.b(context).y * f17)) + i18);
                }
            }
            bottomSheetBehavior.D(3);
        }
        com.tencent.mm.ui.widget.dialog.y1 y1Var4 = this.B;
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior2 = y1Var4 != null ? y1Var4.f212036r : null;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.f44444q = true;
        }
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior3 = y1Var4 != null ? y1Var4.f212036r : null;
        if (bottomSheetBehavior3 != null) {
            bottomSheetBehavior3.D(3);
        }
        com.tencent.mm.ui.widget.dialog.y1 y1Var5 = this.B;
        if ((y1Var5 == null || y1Var5.f()) ? false : true) {
            com.tencent.mm.ui.widget.dialog.y1 y1Var6 = this.B;
            if (y1Var6 != null && (b17 = y1Var6.b()) != null) {
                b17.setWindowAnimations(com.tencent.mm.R.style.f494147ff);
            }
            com.tencent.mm.ui.widget.dialog.y1 y1Var7 = this.B;
            if (y1Var7 != null) {
                y1Var7.s();
            }
            com.tencent.mm.ui.widget.dialog.y1 y1Var8 = this.B;
            if (y1Var8 == null || (dialog = y1Var8.f212025d) == null) {
                return;
            }
            com.tencent.mm.plugin.finder.view.x7.a(dialog, context);
        }
    }

    public final void X(android.graphics.drawable.Drawable drawable) {
        kotlin.jvm.internal.o.g(drawable, "drawable");
        I().setBackgroundDrawable(drawable);
    }

    public final void Y(int i17) {
        android.graphics.drawable.Drawable background = I().getBackground();
        android.graphics.drawable.GradientDrawable gradientDrawable = background instanceof android.graphics.drawable.GradientDrawable ? (android.graphics.drawable.GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(this.f118183e.getResources().getColor(i17));
        }
    }

    public final void Z(int i17) {
        android.view.View view;
        C().setVisibility(i17);
        if (i17 != 0 || (view = (android.view.View) ((jz5.n) this.f118200y).getValue()) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage", "setHeaderVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage", "setHeaderVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.widget.dialog.g2
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return I();
    }

    public final void a0(android.graphics.drawable.Drawable drawable) {
        I().setBackground(drawable);
    }

    public final void b0(int i17) {
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior;
        jz5.g gVar = this.f118200y;
        if (i17 != 0) {
            android.view.View view = (android.view.View) ((jz5.n) gVar).getValue();
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage", "setScrollHeaderVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage", "setScrollHeaderVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        float dimension = I().getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479727dj);
        float dimension2 = I().getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
        float dimension3 = I().getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479646bl);
        com.tencent.mm.ui.widget.dialog.y1 y1Var = this.B;
        if (y1Var != null && (bottomSheetBehavior = y1Var.f212036r) != null) {
            bottomSheetBehavior.f44453z = new com.tencent.mm.plugin.finder.live.widget.l(this, dimension, dimension3, dimension2);
        }
        android.view.View view2 = (android.view.View) ((jz5.n) gVar).getValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage", "setScrollHeaderVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage", "setScrollHeaderVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C().setVisibility(8);
    }

    public final void c0(java.lang.String title) {
        kotlin.jvm.internal.o.g(title, "title");
        if (title.length() == 0) {
            M().setVisibility(8);
        } else {
            M().setText(title);
            M().setVisibility(0);
        }
    }

    public final void d0() {
        com.tencent.mm.ui.fk.a(M());
    }

    public boolean l() {
        return P();
    }

    public void r() {
    }

    public void s(boolean z17) {
        com.tencent.mm.ui.widget.dialog.y1 y1Var;
        com.tencent.mm.ui.widget.dialog.y1 y1Var2;
        com.tencent.mm.ui.widget.dialog.y1 y1Var3;
        com.tencent.mm.plugin.finder.live.widget.e0 e0Var = this.C;
        if (e0Var != null) {
            if (e0Var != null && e0Var.P()) {
                if (z17) {
                    com.tencent.mm.plugin.finder.live.widget.e0 e0Var2 = this.C;
                    if (e0Var2 != null && (y1Var3 = e0Var2.B) != null) {
                        y1Var3.g(this);
                    }
                } else {
                    com.tencent.mm.plugin.finder.live.widget.e0 e0Var3 = this.C;
                    if (e0Var3 != null && (y1Var2 = e0Var3.B) != null) {
                        y1Var2.c(this, false);
                    }
                }
                this.C = null;
                return;
            }
        }
        this.C = null;
        com.tencent.mm.ui.widget.dialog.y1 y1Var4 = this.B;
        if (!(y1Var4 != null && y1Var4.f()) || (y1Var = this.B) == null) {
            return;
        }
        y1Var.q();
    }

    public android.view.View u() {
        return null;
    }

    public android.view.View v() {
        return null;
    }

    public boolean w() {
        return this instanceof com.tencent.mm.plugin.finder.feed.ui.kd;
    }

    public android.widget.TextView x() {
        android.widget.TextView textView = new android.widget.TextView(this.f118183e);
        textView.setTextSize(0, textView.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479688cn));
        textView.setBackground(textView.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.a0s));
        int b17 = i65.a.b(textView.getContext(), 12);
        int b18 = i65.a.b(textView.getContext(), 4);
        textView.setPadding(b17, b18, b17, b18);
        textView.setEnabled(false);
        textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.f478494f));
        textView.setText(textView.getContext().getResources().getString(com.tencent.mm.R.string.f490441v5));
        return textView;
    }

    public com.tencent.mm.ui.widget.imageview.WeImageView y() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(this.f118183e);
        weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_close);
        weImageView.setIconColor(weImageView.getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
        weImageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(i65.a.b(weImageView.getContext(), 24), i65.a.b(weImageView.getContext(), 24)));
        return weImageView;
    }

    public final android.widget.FrameLayout z() {
        java.lang.Object value = ((jz5.n) this.f118192q).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.FrameLayout) value;
    }

    public e0(android.content.Context context, boolean z17, zl2.u4 uiMode, float f17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(uiMode, "uiMode");
        this.f118183e = context;
        this.f118184f = z17;
        this.f118185g = uiMode;
        this.f118186h = f17;
        this.f118187i = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.t(this));
        this.f118188m = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.w(this));
        this.f118189n = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.i(this));
        this.f118190o = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.x(this));
        this.f118191p = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.m(this));
        this.f118192q = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.h(this));
        this.f118193r = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.j(this));
        jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.k(this));
        this.f118194s = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.s(this));
        this.f118195t = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.d0(this));
        this.f118196u = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.b0(this));
        this.f118197v = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.c0(this));
        this.f118198w = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.u(this));
        this.f118199x = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.v(this));
        this.f118200y = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.z(this));
        this.f118201z = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.a0(this));
        this.A = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.y(this));
    }
}
