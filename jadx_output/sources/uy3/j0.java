package uy3;

/* loaded from: classes8.dex */
public final class j0 extends androidx.appcompat.app.i0 implements wq1.d, uy3.t {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public final com.tencent.mm.plugin.scanner.box.ScanBoxDialog$onDestroyObserver$1 E;
    public final jz5.g F;

    /* renamed from: f, reason: collision with root package name */
    public r45.sn f431948f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.Context f431949g;

    /* renamed from: h, reason: collision with root package name */
    public zg0.q2 f431950h;

    /* renamed from: i, reason: collision with root package name */
    public final uy3.g0 f431951i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.box.webview.BoxWebView f431952m;

    /* renamed from: n, reason: collision with root package name */
    public uy3.s0 f431953n;

    /* renamed from: o, reason: collision with root package name */
    public uy3.u0 f431954o;

    /* renamed from: p, reason: collision with root package name */
    public uy3.k0 f431955p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.scanner.box.BaseBoxDialogView f431956q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f431957r;

    /* renamed from: s, reason: collision with root package name */
    public int f431958s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f431959t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f431960u;

    /* renamed from: v, reason: collision with root package name */
    public int f431961v;

    /* renamed from: w, reason: collision with root package name */
    public float f431962w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f431963x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f431964y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f431965z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.lifecycle.x, com.tencent.mm.plugin.scanner.box.ScanBoxDialog$onDestroyObserver$1] */
    public j0(android.content.Context context, r45.sn homeContext, com.tencent.mm.plugin.scanner.box.BaseBoxDialogView baseBoxDialogView, uy3.k0 k0Var) {
        super(context, com.tencent.mm.R.style.f494076dr);
        int i17;
        androidx.lifecycle.o mo133getLifecycle;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(homeContext, "homeContext");
        uy3.i0 i0Var = new uy3.i0(this);
        uy3.h0 h0Var = new uy3.h0(this);
        this.f431951i = new uy3.g0(this);
        this.f431959t = true;
        this.f431963x = true;
        this.f431964y = true;
        this.f431965z = true;
        ?? r66 = new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.scanner.box.ScanBoxDialog$onDestroyObserver$1
            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
            public final void onDestroy() {
                androidx.lifecycle.o mo133getLifecycle2;
                uy3.j0 j0Var = uy3.j0.this;
                java.lang.Object obj = j0Var.f431949g;
                if (obj == null) {
                    kotlin.jvm.internal.o.o("mContext");
                    throw null;
                }
                androidx.lifecycle.y yVar = obj instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) obj : null;
                if (yVar != null && (mo133getLifecycle2 = yVar.mo133getLifecycle()) != null) {
                    mo133getLifecycle2.c(this);
                }
                ((jz5.n) j0Var.F).getValue();
            }
        };
        this.E = r66;
        this.F = jz5.h.b(new uy3.a0(this));
        this.f431956q = baseBoxDialogView;
        this.f431955p = k0Var;
        zg0.i3 i3Var = (zg0.i3) i95.n0.c(zg0.i3.class);
        vy3.x xVar = vy3.x.f441492b;
        ((yg0.i4) i3Var).getClass();
        java.util.ArrayList arrayList = (java.util.ArrayList) nw4.d3.f340822b;
        if (!arrayList.contains(xVar)) {
            arrayList.add(xVar);
            arrayList.size();
        }
        this.f431949g = context;
        this.f431948f = homeContext;
        this.f431954o = new uy3.u0(this);
        uy3.k0 k0Var2 = this.f431955p;
        if (k0Var2 != null) {
            ((uy3.m0) k0Var2).f431981d = java.lang.System.currentTimeMillis();
        }
        kd0.e2 e2Var = (kd0.e2) i95.n0.c(kd0.e2.class);
        android.content.Context context2 = this.f431949g;
        if (context2 == null) {
            kotlin.jvm.internal.o.o("mContext");
            throw null;
        }
        context2 = context2 instanceof com.tencent.mm.ui.vas.VASActivity ? ((com.tencent.mm.ui.vas.VASActivity) context2).getContainerActivity() : context2;
        java.lang.Object obj = this.f431949g;
        if (obj == null) {
            kotlin.jvm.internal.o.o("mContext");
            throw null;
        }
        this.f431952m = (com.tencent.mm.plugin.box.webview.BoxWebView) ((jd0.c) e2Var).wi(context2, obj instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) obj : null, new uy3.b0(this));
        this.C = false;
        zg0.g3 g3Var = (zg0.g3) i95.n0.c(zg0.g3.class);
        com.tencent.mm.plugin.box.webview.BoxWebView boxWebView = this.f431952m;
        kotlin.jvm.internal.o.d(boxWebView);
        zg0.q2 Ai = ((yg0.e4) g3Var).Ai(boxWebView, new zg0.k2(null, true, false, false, true, 0, false, 105, null), xVar);
        this.f431950h = Ai;
        ((com.tencent.mm.plugin.webview.core.r0) Ai).D(i0Var);
        zg0.q2 q2Var = this.f431950h;
        if (q2Var != null) {
            ((com.tencent.mm.plugin.webview.core.r0) q2Var).C(h0Var);
        }
        zg0.q2 q2Var2 = this.f431950h;
        if (q2Var2 != null) {
            ((com.tencent.mm.plugin.webview.core.r0) q2Var2).q0();
        }
        uy3.k0 k0Var3 = this.f431955p;
        if (k0Var3 != null) {
            ((uy3.m0) k0Var3).f431982e = java.lang.System.currentTimeMillis();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanBoxDialog", "initWebView");
        this.f431953n = new uy3.s0(this);
        com.tencent.mm.plugin.box.webview.BoxWebView boxWebView2 = this.f431952m;
        if (boxWebView2 != null) {
            boxWebView2.J0(null, null);
        }
        com.tencent.mm.plugin.box.webview.BoxWebView boxWebView3 = this.f431952m;
        if (boxWebView3 != null) {
            boxWebView3.setWebChromeClient(null);
            boxWebView3.setWebViewClient(null);
            boxWebView3.setVerticalScrollBarEnabled(true);
            i17 = 0;
            boxWebView3.setHorizontalScrollBarEnabled(false);
            boxWebView3.setBackgroundColor(boxWebView3.getContext().getResources().getColor(com.tencent.mm.R.color.f478494f));
            boxWebView3.G0();
        } else {
            i17 = 0;
        }
        getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), i17);
        float b17 = j65.c.b(getContext());
        if (b17 >= i65.a.v(getContext())) {
            com.tencent.mm.plugin.box.webview.BoxWebView boxWebView4 = this.f431952m;
            com.tencent.xweb.z0 settings = boxWebView4 != null ? boxWebView4.getSettings() : null;
            if (settings != null) {
                settings.O(148);
            }
        } else if (b17 >= i65.a.u(getContext())) {
            com.tencent.mm.plugin.box.webview.BoxWebView boxWebView5 = this.f431952m;
            com.tencent.xweb.z0 settings2 = boxWebView5 != null ? boxWebView5.getSettings() : null;
            if (settings2 != null) {
                settings2.O(140);
            }
        } else if (b17 >= i65.a.t(getContext())) {
            com.tencent.mm.plugin.box.webview.BoxWebView boxWebView6 = this.f431952m;
            com.tencent.xweb.z0 settings3 = boxWebView6 != null ? boxWebView6.getSettings() : null;
            if (settings3 != null) {
                settings3.O(132);
            }
        } else if (b17 >= i65.a.s(getContext())) {
            com.tencent.mm.plugin.box.webview.BoxWebView boxWebView7 = this.f431952m;
            com.tencent.xweb.z0 settings4 = boxWebView7 != null ? boxWebView7.getSettings() : null;
            if (settings4 != null) {
                settings4.O(124);
            }
        } else if (b17 >= i65.a.z(getContext())) {
            com.tencent.mm.plugin.box.webview.BoxWebView boxWebView8 = this.f431952m;
            com.tencent.xweb.z0 settings5 = boxWebView8 != null ? boxWebView8.getSettings() : null;
            if (settings5 != null) {
                settings5.O(116);
            }
        } else if (b17 >= i65.a.w(getContext())) {
            com.tencent.mm.plugin.box.webview.BoxWebView boxWebView9 = this.f431952m;
            com.tencent.xweb.z0 settings6 = boxWebView9 != null ? boxWebView9.getSettings() : null;
            if (settings6 != null) {
                settings6.O(108);
            }
        } else {
            i65.a.x(getContext());
            if (b17 >= 1.0f) {
                com.tencent.mm.plugin.box.webview.BoxWebView boxWebView10 = this.f431952m;
                com.tencent.xweb.z0 settings7 = boxWebView10 != null ? boxWebView10.getSettings() : null;
                if (settings7 != null) {
                    settings7.O(100);
                }
            } else if (b17 >= i65.a.y(getContext())) {
                com.tencent.mm.plugin.box.webview.BoxWebView boxWebView11 = this.f431952m;
                com.tencent.xweb.z0 settings8 = boxWebView11 != null ? boxWebView11.getSettings() : null;
                if (settings8 != null) {
                    settings8.O(92);
                }
            } else {
                com.tencent.mm.plugin.box.webview.BoxWebView boxWebView12 = this.f431952m;
                com.tencent.xweb.z0 settings9 = boxWebView12 != null ? boxWebView12.getSettings() : null;
                if (settings9 != null) {
                    settings9.O(80);
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanBoxDialog", "initFontSize, fontSize = %f", java.lang.Float.valueOf(b17));
        com.tencent.mm.plugin.box.webview.BoxWebView boxWebView13 = this.f431952m;
        if (boxWebView13 != null) {
            boxWebView13.addJavascriptInterface(this.f431954o, "boxJSApi");
        }
        ((ku5.t0) ku5.t0.f312615d).B(new uy3.f0(this));
        uy3.k0 k0Var4 = this.f431955p;
        if (k0Var4 != null) {
            uy3.m0 m0Var = (uy3.m0) k0Var4;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            uy3.l0 l0Var = m0Var.f431983f;
            if (l0Var != null) {
                l0Var.f431972e = currentTimeMillis - m0Var.f431982e;
            }
            if (l0Var != null) {
                l0Var.a();
            }
        }
        java.lang.Object obj2 = this.f431949g;
        if (obj2 == null) {
            kotlin.jvm.internal.o.o("mContext");
            throw null;
        }
        androidx.lifecycle.y yVar = obj2 instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) obj2 : null;
        if (yVar == null || (mo133getLifecycle = yVar.mo133getLifecycle()) == 0) {
            return;
        }
        mo133getLifecycle.a(r66);
    }

    public boolean D() {
        return isShowing() || this.D;
    }

    public final void E() {
        try {
            if (getContext() instanceof android.app.Activity) {
                android.content.Context context = getContext();
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                if (((android.app.Activity) context).isFinishing()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ScanBoxDialog", "realShowDialog ui is finishing and ignore");
                    return;
                }
            }
            super.show();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanBoxDialog", e17, "realShowDialog exception", new java.lang.Object[0]);
        }
    }

    @Override // androidx.appcompat.app.i0, wq1.d
    public android.content.Context H() {
        android.content.Context context = this.f431949g;
        if (context != null) {
            return context;
        }
        kotlin.jvm.internal.o.o("mContext");
        throw null;
    }

    @Override // wq1.d
    public com.tencent.mm.plugin.box.webview.BoxWebView c() {
        return this.f431952m;
    }

    @Override // android.app.Dialog, android.content.DialogInterface, wq1.d
    public void dismiss() {
        com.tencent.mm.plugin.scanner.box.BaseBoxDialogView baseBoxDialogView;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanBoxDialog", "dismissDialog isShowing: %s", java.lang.Boolean.valueOf(isShowing()));
        this.D = false;
        if (!isShowing() || (baseBoxDialogView = this.f431956q) == null || baseBoxDialogView.U) {
            return;
        }
        baseBoxDialogView.c(5);
    }

    public void dismissDialog(int i17) {
        isShowing();
        this.f431958s = i17;
        this.D = false;
        if (isShowing() && this.f431957r) {
            super.dismiss();
        }
    }

    @Override // wq1.d
    public void h() {
    }

    @Override // wq1.d
    public xq1.g o() {
        return this.f431953n;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f431957r = true;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        boolean z17;
        if (!isShowing()) {
            super.onBackPressed();
            return;
        }
        com.tencent.mm.plugin.scanner.box.BaseBoxDialogView baseBoxDialogView = this.f431956q;
        if (baseBoxDialogView != null) {
            if (!baseBoxDialogView.U) {
                baseBoxDialogView.c(5);
            }
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            return;
        }
        super.onBackPressed();
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        android.view.WindowManager.LayoutParams attributes;
        android.view.View decorView;
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanBoxDialog", "onCreate");
        if (this.f431959t) {
            android.view.Window window = getWindow();
            if (window != null) {
                window.addFlags(100729856);
            }
        } else {
            android.view.Window window2 = getWindow();
            if (window2 != null) {
                window2.addFlags(67108864);
            }
        }
        C(1);
        android.view.Window window3 = getWindow();
        if (window3 != null) {
            window3.setLayout(-1, -1);
        }
        android.view.Window window4 = getWindow();
        if (window4 != null) {
            window4.setDimAmount(0.0f);
        }
        android.view.Window window5 = getWindow();
        if (window5 != null) {
            window5.setWindowAnimations(com.tencent.mm.R.style.f494077ds);
        }
        android.view.Window window6 = getWindow();
        if (window6 != null && (decorView = window6.getDecorView()) != null) {
            android.content.Context context = decorView.getContext();
            decorView.setMinimumWidth((context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? i65.a.B(decorView.getContext()) : displayMetrics.widthPixels);
            decorView.setPadding(0, 0, 0, 0);
        }
        android.view.Window window7 = getWindow();
        if (window7 != null && (attributes = window7.getAttributes()) != null) {
            attributes.width = -1;
            attributes.height = -1;
            attributes.gravity = 80;
        }
        com.tencent.mm.plugin.scanner.box.BaseBoxDialogView baseBoxDialogView = this.f431956q;
        if (baseBoxDialogView != null) {
            com.tencent.mm.plugin.box.webview.BoxWebView boxWebView = this.f431952m;
            kotlin.jvm.internal.o.d(boxWebView);
            baseBoxDialogView.f158696r = boxWebView;
            boxWebView.D0(new uy3.f(baseBoxDialogView));
            com.tencent.mm.plugin.scanner.box.BoxWebViewContainer boxWebViewContainer = baseBoxDialogView.f158691o;
            if (boxWebViewContainer == null) {
                kotlin.jvm.internal.o.o("webViewContainer");
                throw null;
            }
            boxWebViewContainer.addView(baseBoxDialogView.f158696r, new android.widget.RelativeLayout.LayoutParams(-1, -2));
        }
        if (baseBoxDialogView != null) {
            baseBoxDialogView.f158687i = this;
        }
        if (baseBoxDialogView != null) {
            baseBoxDialogView.setIsFixDialogHeight(this.f431960u);
        }
        if (baseBoxDialogView != null) {
            baseBoxDialogView.setFixDialogHeight(this.f431961v);
        }
        if (baseBoxDialogView != null) {
            baseBoxDialogView.setFixDialogHeightRate(this.f431962w);
        }
        if (baseBoxDialogView != null) {
            baseBoxDialogView.setEnableDialogScroll(this.f431964y);
        }
        if (baseBoxDialogView != null) {
            baseBoxDialogView.setEnableWebViewScroll(this.f431963x);
        }
        if (baseBoxDialogView != null) {
            baseBoxDialogView.setCanceledOnTouchOutside(this.f431965z);
        }
        if (baseBoxDialogView != null) {
            baseBoxDialogView.setEnableScrollRightClose(this.A);
        }
        kotlin.jvm.internal.o.d(baseBoxDialogView);
        setContentView(baseBoxDialogView, new android.view.ViewGroup.LayoutParams(-1, -1));
        setOnShowListener(new uy3.c0(this));
        setOnDismissListener(new uy3.d0(this));
        setOnCancelListener(new uy3.e0(this));
        setCancelable(true);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f431957r = false;
    }

    @Override // android.app.Dialog
    public void show() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanBoxDialog", "showDialog showAfterWebViewReady: %b, webViewReady: %b", java.lang.Boolean.valueOf(this.B), java.lang.Boolean.valueOf(this.C));
        if (!this.B) {
            E();
        } else if (this.C) {
            E();
        } else {
            this.D = true;
        }
    }

    @Override // wq1.d
    public xq1.f u() {
        return this.f431954o;
    }
}
