package ym5;

/* loaded from: classes10.dex */
public final class y5 extends ym5.h implements com.tencent.mm.ui.tools.c5 {
    public final int A;
    public int B;
    public final long C;
    public final boolean D;
    public yz5.a E;
    public yz5.l F;
    public c01.r2 G;
    public ym5.n5 H;
    public android.view.View I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f463580J;
    public android.widget.TextView K;
    public android.widget.TextView L;
    public final com.tencent.mm.ui.tools.f5 M;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f463581x;

    /* renamed from: y, reason: collision with root package name */
    public float f463582y;

    /* renamed from: z, reason: collision with root package name */
    public final int f463583z;

    public y5(android.content.Context context) {
        super(context);
        this.f463581x = "MicroMsg.StickerEditor.DrawingView[" + hashCode() + ']';
        this.f463583z = 30;
        this.A = -2130706433;
        this.B = 3;
        this.C = 350L;
        this.D = true;
        this.H = ym5.n5.f463445d;
        if ((context instanceof android.app.Activity ? (android.app.Activity) context : null) != null) {
            com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5((android.app.Activity) context);
            this.M = f5Var;
            f5Var.f210400e = this;
        }
    }

    public static void e(ym5.y5 y5Var, c01.s2 status, boolean z17, int i17, java.lang.Object obj) {
        l45.p pVar;
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        y5Var.getClass();
        kotlin.jvm.internal.o.g(status, "status");
        xk0.f fVar = null;
        if (z17) {
            l45.q presenter = y5Var.getPresenter();
            dl.f0 f0Var = presenter != null ? (dl.f0) ((l45.n) presenter).d(y5Var.getTargetFeatureType()) : null;
            um.g gVar = f0Var != null ? (um.g) f0Var.d() : null;
            if (gVar != null) {
                fVar = gVar.g();
            }
        }
        l45.q presenter2 = y5Var.getPresenter();
        if (presenter2 == null || (pVar = ((l45.n) presenter2).f316475p) == null) {
            return;
        }
        ((aw3.e) pVar).a(status, fVar);
    }

    private final int getInputLineMaxLimitCount() {
        return this.B;
    }

    @Override // ym5.h
    public bn5.f a() {
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        l45.q presenter = getPresenter();
        kotlin.jvm.internal.o.f(presenter, "getPresenter(...)");
        return new bn5.m(context, presenter);
    }

    @Override // ym5.h
    public dn5.c b() {
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        l45.q presenter = getPresenter();
        kotlin.jvm.internal.o.f(presenter, "getPresenter(...)");
        return new dn5.g(context, presenter);
    }

    @Override // ym5.h
    public void d() {
        ((l45.n) getPresenter()).m(getConfig());
        ((l45.n) getPresenter()).f316467h = false;
        removeAllViews();
        getTextEditView();
        this.f463582y = com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f479714d7);
        addView(getBaseBoardView(), new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        int h17 = i65.a.h(getContext(), com.tencent.mm.R.dimen.f479688cn);
        layoutParams.bottomMargin = h17;
        layoutParams.setMarginStart(h17);
        layoutParams.setMarginEnd(h17);
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.cvt, (android.view.ViewGroup) null);
        this.I = inflate;
        addView(inflate, layoutParams);
        i(false);
        android.view.View view = this.I;
        android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.nig) : null;
        this.f463580J = textView;
        if (textView != null) {
            textView.setOnClickListener(new ym5.t5(this));
        }
        android.view.View view2 = this.I;
        android.widget.TextView textView2 = view2 != null ? (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.nii) : null;
        this.K = textView2;
        if (textView2 != null) {
            textView2.setOnClickListener(new cm5.e(textView2, 300L, null, new ym5.u5(this)));
        }
        android.view.View view3 = this.I;
        android.widget.TextView textView3 = view3 != null ? (android.widget.TextView) view3.findViewById(com.tencent.mm.R.id.nih) : null;
        this.L = textView3;
        if (textView3 != null) {
            textView3.setOnClickListener(new ym5.v5(this));
        }
        addView(getTextEditView(), new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.view.View textEditView = getTextEditView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(textEditView, arrayList.toArray(), "com/tencent/mm/view/StickerDrawingView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textEditView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(textEditView, "com/tencent/mm/view/StickerDrawingView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean a17 = z65.c.a();
        l45.q presenter = getPresenter();
        if (presenter != null) {
            dl.f0 f0Var = (dl.f0) ((l45.n) presenter).d(getTargetFeatureType());
            if (f0Var != null) {
                f0Var.f235153r = true;
                f0Var.C = a17;
                f0Var.E = a17;
                f0Var.G = false;
                f0Var.f235151J = true;
                f0Var.K = true;
                f0Var.L = this.f463583z;
                f0Var.Q = true;
                f0Var.T = this.H == ym5.n5.f463447f;
            }
        }
    }

    public final void f() {
        getTextEditView().clearFocus();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("textEditView: cancel click, visible=");
        sb6.append(getTextEditView().getVisibility() == 0);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f463581x;
        com.tencent.mars.xlog.Log.i(str, sb7);
        if (getTextEditView().getVisibility() != 0) {
            qk.i6 i6Var = ((l45.n) getPresenter()).f316464e;
            if (i6Var != null) {
                i6Var.m5();
                return;
            }
            return;
        }
        ((l45.n) getPresenter()).o();
        if (getContext() instanceof com.tencent.mm.ui.MMActivity) {
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) context).hideVKB();
        }
        if (this.D) {
            com.tencent.mars.xlog.Log.i(str, "restoreCurrentItemOnEditText: ");
            xk0.f g17 = g();
            if (g17 != null) {
                l45.q presenter = getPresenter();
                dl.f0 f0Var = presenter != null ? (dl.f0) ((l45.n) presenter).d(getTargetFeatureType()) : null;
                um.g gVar = f0Var != null ? (um.g) f0Var.d() : null;
                if (gVar != null) {
                    gVar.add(g17);
                }
                if (f0Var != null) {
                    f0Var.r();
                }
            }
        }
        if (g() != null) {
            j();
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "doOnDrawCancel: ");
        yz5.a aVar = this.E;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final xk0.f g() {
        java.lang.Object tag = this.f463357t.getTag();
        if (!(tag instanceof xk0.h) || !(tag instanceof xk0.f)) {
            return null;
        }
        java.util.Objects.toString(tag);
        return (xk0.f) tag;
    }

    public final ym5.n5 getBottomControlBarMode() {
        return this.H;
    }

    public final yz5.a getCancelDrawCallback() {
        return this.E;
    }

    public final yz5.l getConfirmDrawCallback() {
        return this.F;
    }

    @Override // ym5.h
    public qk.g6[] getFeatures() {
        if (this.f463347g == null) {
            this.f463347g = new qk.g6[]{getTargetFeatureType()};
        }
        qk.g6[] mFeaturesTypes = this.f463347g;
        kotlin.jvm.internal.o.f(mFeaturesTypes, "mFeaturesTypes");
        return mFeaturesTypes;
    }

    @Override // ym5.h
    public android.view.View getRubbishView() {
        if (this.f463351n == null) {
            this.f463352o = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.chf, (android.view.ViewGroup) this, false);
        }
        android.view.View mRubbishView = this.f463352o;
        kotlin.jvm.internal.o.f(mRubbishView, "mRubbishView");
        return mRubbishView;
    }

    public final qk.g6 getTargetFeatureType() {
        return qk.g6.STICKER;
    }

    @Override // ym5.h
    public android.view.View getTextEditView() {
        if (this.f463351n == null) {
            com.tencent.mars.xlog.Log.i(this.f463581x, "getTextEditView: init");
            android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.cvu, (android.view.ViewGroup) null);
            this.f463351n = inflate;
            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.o4a);
            kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type com.tencent.mm.view.StickerEditText");
            this.f463357t = (com.tencent.mm.view.StickerEditText) findViewById;
            android.view.View findViewById2 = this.f463351n.findViewById(com.tencent.mm.R.id.d6w);
            kotlin.jvm.internal.o.e(findViewById2, "null cannot be cast to non-null type android.widget.Button");
            this.f463355r = (android.widget.Button) findViewById2;
            android.view.View findViewById3 = this.f463351n.findViewById(com.tencent.mm.R.id.d6s);
            kotlin.jvm.internal.o.e(findViewById3, "null cannot be cast to non-null type android.widget.Button");
            this.f463356s = (android.widget.Button) findViewById3;
            android.view.View findViewById4 = this.f463351n.findViewById(com.tencent.mm.R.id.mii);
            kotlin.jvm.internal.o.e(findViewById4, "null cannot be cast to non-null type com.tencent.mm.view.footer.SelectColorBar");
            com.tencent.mm.view.footer.SelectColorBar selectColorBar = (com.tencent.mm.view.footer.SelectColorBar) findViewById4;
            this.f463357t.setTextColor(-1);
            com.tencent.mm.view.PhotoEditText photoEditText = this.f463357t;
            kotlin.jvm.internal.o.e(photoEditText, "null cannot be cast to non-null type com.tencent.mm.view.StickerEditText");
            ((com.tencent.mm.view.StickerEditText) photoEditText).setBgColorAlpha(this.A);
            jg5.c cVar = jg5.c.f299665a;
            com.tencent.mm.view.PhotoEditText mTextEV = this.f463357t;
            kotlin.jvm.internal.o.f(mTextEV, "mTextEV");
            cVar.b(mTextEV, 1);
            android.view.View findViewById5 = this.f463351n.findViewById(com.tencent.mm.R.id.agw);
            kotlin.jvm.internal.o.e(findViewById5, "null cannot be cast to non-null type com.tencent.mm.view.TextModeSelectView");
            com.tencent.mm.view.TextModeSelectView textModeSelectView = (com.tencent.mm.view.TextModeSelectView) findViewById5;
            this.f463358u = textModeSelectView;
            textModeSelectView.setMode(kz5.c0.i(1, 2, 3));
            this.f463358u.setModeResourceMap(kz5.c1.k(new jz5.l(1, java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_filled_text_style1)), new jz5.l(2, java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_filled_text_style2)), new jz5.l(3, java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_filled_text_style3))));
            this.f463358u.setColorFilter(-1);
            this.f463358u.setModeChangeListener(new ym5.o5(this, selectColorBar));
            selectColorBar.setSelectColor(-1);
            selectColorBar.setSelectColorListener(new ym5.p5(this));
            this.f463355r.setOnClickListener(new ym5.q5(this));
            this.f463356s.setOnClickListener(new ym5.r5(this));
            this.f463351n.setOnClickListener(ym5.s5.f463529d);
        }
        android.view.View mTextEditView = this.f463351n;
        kotlin.jvm.internal.o.f(mTextEditView, "mTextEditView");
        return mTextEditView;
    }

    public final void h(int i17) {
        if (i17 <= 0) {
            return;
        }
        this.B = i17;
        com.tencent.mm.view.PhotoEditText photoEditText = this.f463357t;
        com.tencent.mm.view.StickerEditText stickerEditText = photoEditText instanceof com.tencent.mm.view.StickerEditText ? (com.tencent.mm.view.StickerEditText) photoEditText : null;
        if (stickerEditText != null) {
            stickerEditText.setLineBreakCountLimit(getInputLineMaxLimitCount());
        }
    }

    public final void i(boolean z17) {
        android.view.View view = this.I;
        if (view != null) {
            int visibility = view.getVisibility();
            int i17 = z17 ? 0 : 8;
            if (visibility != i17) {
                com.tencent.mars.xlog.Log.i(this.f463581x, "updateBottomControlBarVisibility: from " + visibility + " to " + i17);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/view/StickerDrawingView", "updateBottomControlBarVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/view/StickerDrawingView", "updateBottomControlBarVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (z17) {
                    android.widget.TextView textView = this.f463580J;
                    if (textView != null && textView.getVisibility() == 0) {
                        e(this, c01.s2.f37438n, false, 2, null);
                    }
                    android.widget.TextView textView2 = this.K;
                    if (textView2 != null && textView2.getVisibility() == 0) {
                        e(this, c01.s2.f37439o, false, 2, null);
                    }
                    android.widget.TextView textView3 = this.L;
                    if (textView3 != null && textView3.getVisibility() == 0) {
                        e(this, c01.s2.f37440p, false, 2, null);
                    }
                }
            }
        }
    }

    public final void j() {
        java.util.Objects.toString(this.H);
        int ordinal = this.H.ordinal();
        if (ordinal == 1) {
            i(true);
        } else if (ordinal != 2) {
            i(false);
        } else {
            if (getRubbishView().getParent() == null) {
                android.view.ViewGroup.LayoutParams layoutParams = getRubbishView().getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 81;
                int c17 = layoutParams2.bottomMargin + com.tencent.mm.ui.bl.c(getContext());
                layoutParams2.bottomMargin = c17;
                layoutParams2.bottomMargin = c17 + i65.a.b(getContext(), 32);
                android.view.View rubbishView = getRubbishView();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(rubbishView, arrayList.toArray(), "com/tencent/mm/view/StickerDrawingView", "updateBottomControlBarWithMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                rubbishView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(rubbishView, "com/tencent/mm/view/StickerDrawingView", "updateBottomControlBarWithMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                addView(getRubbishView(), layoutParams2);
            }
            i(false);
        }
        l45.q presenter = getPresenter();
        if (presenter != null) {
            dl.f0 f0Var = (dl.f0) ((l45.n) presenter).d(getTargetFeatureType());
            if (f0Var != null) {
                f0Var.T = this.H == ym5.n5.f463447f;
            }
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i17) {
        super.onWindowVisibilityChanged(i17);
        com.tencent.mm.ui.tools.f5 f5Var = this.M;
        if (i17 == 0) {
            if (f5Var != null) {
                f5Var.f();
                return;
            } else {
                kotlin.jvm.internal.o.o("keyboardHeightProvider");
                throw null;
            }
        }
        if (f5Var != null) {
            f5Var.d();
        } else {
            kotlin.jvm.internal.o.o("keyboardHeightProvider");
            throw null;
        }
    }

    public final void setBottomControlBarMode(ym5.n5 value) {
        kotlin.jvm.internal.o.g(value, "value");
        this.H = value;
        value.toString();
    }

    public final void setCancelDrawCallback(yz5.a aVar) {
        this.E = aVar;
    }

    public final void setConfirmDrawCallback(yz5.l lVar) {
        this.F = lVar;
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        this.f463357t.postDelayed(new ym5.w5(this, i17), 160L);
    }
}
