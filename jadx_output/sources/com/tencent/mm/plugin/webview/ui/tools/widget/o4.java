package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class o4 implements com.tencent.mm.plugin.webview.ui.tools.widget.z1, com.tencent.mm.plugin.webview.core.u0, com.tencent.mm.plugin.webview.ui.tools.widget.o1 {
    public int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public final com.tencent.mm.plugin.webview.ui.tools.widget.m4 E;
    public dx4.g F;
    public com.tencent.mm.plugin.webview.core.r0 G;
    public final jz5.g H;
    public final com.tencent.mm.plugin.webview.ui.tools.widget.k4 I;

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f187461J;
    public android.widget.FrameLayout K;
    public android.widget.ScrollView L;
    public android.view.View M;
    public final com.tencent.xweb.g1 N;

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f187462d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMWebView f187463e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.widget.e0 f187464f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMWebView f187465g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f187466h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout f187467i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.pulldown.NestedBounceView f187468m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ProgressBar f187469n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f187470o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.RelativeLayout f187471p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.MultiCodeMaskView f187472q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f187473r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.widget.d0 f187474s;

    /* renamed from: t, reason: collision with root package name */
    public int f187475t;

    /* renamed from: u, reason: collision with root package name */
    public int f187476u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.widget.n f187477v;

    /* renamed from: w, reason: collision with root package name */
    public final android.app.Dialog f187478w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.widget.p1 f187479x;

    /* renamed from: y, reason: collision with root package name */
    public long f187480y;

    /* renamed from: z, reason: collision with root package name */
    public final long f187481z;

    public o4(android.app.Activity context, java.lang.String url, com.tencent.mm.ui.widget.MMWebView mMWebView, com.tencent.mm.plugin.webview.ui.tools.widget.e0 option) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(option, "option");
        this.f187462d = context;
        this.f187463e = mMWebView;
        this.f187464f = option;
        this.f187466h = url;
        this.f187474s = new com.tencent.mm.plugin.webview.ui.tools.widget.d0();
        this.f187478w = option.f187181g;
        this.f187479x = option.f187183i;
        this.f187481z = java.lang.System.currentTimeMillis();
        this.E = new com.tencent.mm.plugin.webview.ui.tools.widget.m4(this);
        this.H = jz5.h.b(new com.tencent.mm.plugin.webview.ui.tools.widget.l4(this));
        this.I = new com.tencent.mm.plugin.webview.ui.tools.widget.k4(this);
        this.f187461J = jz5.h.b(new com.tencent.mm.plugin.webview.ui.tools.widget.j4(url, this));
        this.N = new com.tencent.mm.plugin.webview.ui.tools.widget.n4(this);
    }

    public final void a(int i17) {
        if (this.f187465g != null) {
            d().setPadding(d().getPaddingLeft(), d().getPaddingTop(), d().getPaddingRight(), i17);
            d().post(new com.tencent.mm.plugin.webview.ui.tools.widget.y3(this));
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p1
    public void b(android.os.Bundle bundle) {
        com.tencent.mm.plugin.webview.ui.tools.widget.p1 p1Var = this.f187479x;
        if (p1Var != null) {
            p1Var.b(bundle);
        }
    }

    public int c() {
        android.app.Activity activity = this.f187462d;
        return (activity.getWindow().getDecorView().getMeasuredHeight() - d().getMeasuredHeight()) - com.tencent.mm.ui.bl.c(activity);
    }

    public final com.tencent.mm.ui.widget.MMWebView d() {
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f187465g;
        if (mMWebView != null) {
            return mMWebView;
        }
        kotlin.jvm.internal.o.o("webView");
        throw null;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p1
    public void e(android.os.Bundle bundle) {
        com.tencent.mm.plugin.webview.ui.tools.widget.p1 p1Var = this.f187479x;
        if (p1Var != null) {
            p1Var.e(bundle);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p1
    public void f(int i17) {
        com.tencent.mm.plugin.webview.ui.tools.widget.p1 p1Var = this.f187479x;
        if (p1Var != null) {
            p1Var.f(i17);
        }
    }

    public final com.tencent.mm.plugin.webview.ui.tools.widget.m6 g() {
        return (com.tencent.mm.plugin.webview.ui.tools.widget.m6) ((jz5.n) this.f187461J).getValue();
    }

    public void h() {
        android.widget.ProgressBar progressBar;
        android.widget.ProgressBar progressBar2 = this.f187469n;
        boolean z17 = false;
        if (progressBar2 != null && progressBar2.getVisibility() == 0) {
            z17 = true;
        }
        if (!z17 || (progressBar = this.f187469n) == null) {
            return;
        }
        progressBar.setVisibility(8);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p1
    public void i(com.tencent.xweb.WebView webView, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.webview.ui.tools.widget.p1 p1Var = this.f187479x;
        if (p1Var != null) {
            p1Var.i(webView, str, z17);
        }
    }

    public void j(java.lang.Runnable runnable) {
        this.f187480y = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewWithController", "initContentView url= " + this.f187466h + ", reuseWebView=" + this.f187464f.f187177c + ", createUITimestampe: " + this.f187480y);
        if (com.tencent.xweb.WebView.x0()) {
            this.f187464f.f187177c = false;
            com.tencent.mars.xlog.Log.w("MicroMsg.MMWebViewWithController", "initContentView SysWebView can not reuseWebView");
        }
        com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout webViewKeyboardLinearLayout = (com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout) android.view.LayoutInflater.from(this.f187462d).inflate(com.tencent.mm.R.layout.d_6, (android.view.ViewGroup) null, false);
        this.f187467i = webViewKeyboardLinearLayout;
        this.f187468m = webViewKeyboardLinearLayout != null ? (com.tencent.mm.ui.widget.pulldown.NestedBounceView) webViewKeyboardLinearLayout.findViewById(com.tencent.mm.R.id.f487709pj0) : null;
        com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout webViewKeyboardLinearLayout2 = this.f187467i;
        this.f187469n = webViewKeyboardLinearLayout2 != null ? (android.widget.ProgressBar) webViewKeyboardLinearLayout2.findViewById(com.tencent.mm.R.id.f487711pj2) : null;
        com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout webViewKeyboardLinearLayout3 = this.f187467i;
        this.f187470o = webViewKeyboardLinearLayout3 != null ? webViewKeyboardLinearLayout3.findViewById(com.tencent.mm.R.id.lr_) : null;
        com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout webViewKeyboardLinearLayout4 = this.f187467i;
        this.f187471p = webViewKeyboardLinearLayout4 != null ? (android.widget.RelativeLayout) webViewKeyboardLinearLayout4.findViewById(com.tencent.mm.R.id.lra) : null;
        com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout webViewKeyboardLinearLayout5 = this.f187467i;
        this.f187472q = webViewKeyboardLinearLayout5 != null ? (com.tencent.mm.plugin.scanner.MultiCodeMaskView) webViewKeyboardLinearLayout5.findViewById(com.tencent.mm.R.id.jun) : null;
        com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout webViewKeyboardLinearLayout6 = this.f187467i;
        android.widget.TextView textView = webViewKeyboardLinearLayout6 != null ? (android.widget.TextView) webViewKeyboardLinearLayout6.findViewById(com.tencent.mm.R.id.pir) : null;
        com.tencent.mm.ui.bk.s0(textView != null ? textView.getPaint() : null);
        if (textView != null) {
            textView.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.widget.z3(this));
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.ui.tools.widget.a4(this, runnable));
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x033c, code lost:
    
        if (r4 == null) goto L122;
     */
    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k() {
        /*
            Method dump skipped, instructions count: 1126
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.widget.o4.k():void");
    }

    public void l() {
        nw4.n g07;
        com.tencent.mm.plugin.webview.core.r0 r0Var = this.G;
        com.tencent.mm.plugin.webview.ui.tools.widget.e0 e0Var = this.f187464f;
        if (r0Var != null && (g07 = r0Var.g0()) != null) {
            g07.A("onDestroy", e0Var.f187176b);
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.m mVar = (com.tencent.mm.plugin.webview.ui.tools.widget.m) ((jz5.n) this.H).getValue();
        mVar.c().M0(mVar);
        mVar.c().K0(mVar.f187391b);
        this.f187477v = null;
        android.view.ViewParent parent = d().getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        boolean z17 = e0Var.f187177c;
        com.tencent.mm.plugin.webview.ui.tools.widget.d0 d0Var = this.f187474s;
        if (z17 && this.f187473r) {
            d0Var.g();
        } else {
            d().destroy();
            com.tencent.mm.plugin.webview.core.r0 r0Var2 = this.G;
            if (r0Var2 != null) {
                r0Var2.D0();
            }
            for (android.util.SparseBooleanArray sparseBooleanArray : d0Var.f187149g.values()) {
                if (sparseBooleanArray != null) {
                    sparseBooleanArray.clear();
                }
            }
            d0Var.f187149g.clear();
            d0Var.g();
        }
        d().setWebChromeClient(null);
        d().setWebViewCallbackClient(null);
        com.tencent.mm.plugin.webview.core.r0 r0Var3 = this.G;
        if (r0Var3 != null) {
            r0Var3.f181944o = null;
        }
        com.tencent.mm.plugin.scanner.MultiCodeMaskView multiCodeMaskView = this.f187472q;
        if (multiCodeMaskView != null && multiCodeMaskView.getVisibility() == 0) {
            dx4.g gVar = this.F;
            multiCodeMaskView.d(gVar != null ? ((com.tencent.mm.plugin.webview.ui.tools.b5) gVar).f183943k.longValue() : 0L, false);
        }
        dx4.g gVar2 = this.F;
        if (gVar2 != null) {
            ((com.tencent.mm.plugin.webview.ui.tools.b5) gVar2).u();
        }
        com.tencent.mm.plugin.webview.core.r0 r0Var4 = this.G;
        if (r0Var4 != null) {
            r0Var4.M = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewWithController", "onDestroy url= " + this.f187466h + " cacheController=" + this.f187473r);
    }

    public final void m(int i17) {
        if (i17 <= 0) {
            return;
        }
        int scale = (int) (d().getScale() * i17);
        android.widget.FrameLayout frameLayout = this.K;
        int measuredHeight = frameLayout != null ? frameLayout.getMeasuredHeight() : 0;
        if (scale < measuredHeight) {
            scale = measuredHeight;
        }
        android.view.View view = this.M;
        android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        if (layoutParams == null) {
            return;
        }
        layoutParams.height = scale + 2;
        android.view.View view2 = this.M;
        if (view2 == null) {
            return;
        }
        view2.setLayoutParams(layoutParams);
    }

    public void n() {
        com.tencent.mm.plugin.webview.core.r0 r0Var = this.G;
        com.tencent.mm.plugin.webview.ui.tools.widget.d0 d0Var = this.f187474s;
        d0Var.getClass();
        android.app.Activity ui6 = this.f187462d;
        kotlin.jvm.internal.o.g(ui6, "ui");
        if (r0Var == null) {
            return;
        }
        com.tencent.mm.plugin.webview.permission.w wVar = r0Var.R;
        if (wVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.HalfScreenWebViewMenuHelper", "showShareMenu params failed");
            return;
        }
        com.tencent.mm.protocal.JsapiPermissionWrapper c17 = wVar.c();
        kotlin.jvm.internal.o.f(c17, "getJsPerm(...)");
        if (!d0Var.f(c17, 21, 1) && !d0Var.f(c17, 23, 2)) {
            db5.e1.T(ui6, ui6.getString(com.tencent.mm.R.string.lan));
            return;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) ui6, 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.webview.ui.tools.widget.t(d0Var, c17, ui6);
        k0Var.f211881s = new com.tencent.mm.plugin.webview.ui.tools.widget.u(r0Var);
        k0Var.q(" ", 1);
        k0Var.X1 = false;
        k0Var.v();
    }

    public void o() {
        android.view.View view = this.f187470o;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/MMWebViewWithController", "showRefreshMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/widget/MMWebViewWithController", "showRefreshMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        q();
        h();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p1
    public boolean p() {
        com.tencent.mm.plugin.webview.ui.tools.widget.p1 p1Var = this.f187479x;
        if (p1Var != null) {
            return p1Var.p();
        }
        return false;
    }

    public final void q() {
        android.view.View view = this.f187470o;
        if (view != null && view.getVisibility() == 0) {
            android.app.Activity activity = this.f187462d;
            int i17 = activity.getResources().getConfiguration().orientation;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewWithController", "updateRefreshMask orientation: %s", java.lang.Integer.valueOf(i17));
            if (i17 == 1) {
                android.widget.RelativeLayout relativeLayout = this.f187471p;
                if (relativeLayout != null) {
                    relativeLayout.setPadding(0, activity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479723df), 0, activity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479657bu));
                    return;
                }
                return;
            }
            android.widget.RelativeLayout relativeLayout2 = this.f187471p;
            if (relativeLayout2 != null) {
                relativeLayout2.setPadding(0, activity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), 0, activity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479729dl));
            }
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p1
    public void r(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mm.plugin.webview.ui.tools.widget.p1 p1Var = this.f187479x;
        if (p1Var != null) {
            p1Var.r(webView, str);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p1
    public void s(android.os.Bundle bundle) {
        com.tencent.mm.plugin.webview.ui.tools.widget.p1 p1Var = this.f187479x;
        if (p1Var != null) {
            p1Var.s(bundle);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p1
    public void t(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mm.plugin.webview.ui.tools.widget.p1 p1Var = this.f187479x;
        if (p1Var != null) {
            p1Var.t(webView, str);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p1
    public void w(com.tencent.xweb.WebView webView, java.lang.String str) {
        h();
        com.tencent.mm.plugin.webview.ui.tools.widget.p1 p1Var = this.f187479x;
        if (p1Var != null) {
            p1Var.w(webView, str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (r3.B0.contains(java.lang.Integer.valueOf(r3.f181953s0)) == true) goto L8;
     */
    @Override // com.tencent.mm.ui.tools.c5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w2(int r2, boolean r3) {
        /*
            r1 = this;
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "onKeyboardHeightChanged, height:"
            r3.<init>(r0)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "MicroMsg.MMWebViewWithController"
            com.tencent.mars.xlog.Log.i(r0, r3)
            com.tencent.mm.plugin.webview.core.r0 r3 = r1.G
            if (r3 == 0) goto L27
            java.util.concurrent.ConcurrentSkipListSet r0 = r3.B0
            int r3 = r3.f181953s0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r0.contains(r3)
            r0 = 1
            if (r3 != r0) goto L27
            goto L28
        L27:
            r0 = 0
        L28:
            if (r0 == 0) goto L34
            if (r2 <= 0) goto L34
            com.tencent.mm.plugin.webview.ui.tools.widget.i4 r3 = new com.tencent.mm.plugin.webview.ui.tools.widget.i4
            r3.<init>(r1, r2)
            com.tencent.mm.sdk.platformtools.u3.h(r3)
        L34:
            r1.a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.widget.o4.w2(int, boolean):void");
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p1
    public void x(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mm.ui.widget.pulldown.NestedBounceView nestedBounceView = this.f187468m;
        if (nestedBounceView != null) {
            nestedBounceView.setBounce(true);
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.d0 d0Var = this.f187474s;
        if (str == null) {
            d0Var.getClass();
        } else if (((android.util.SparseBooleanArray) d0Var.f187149g.get(str)) == null) {
            d0Var.f187149g.put(str, new android.util.SparseBooleanArray());
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.p1 p1Var = this.f187479x;
        if (p1Var != null) {
            p1Var.x(webView, str);
        }
    }
}
