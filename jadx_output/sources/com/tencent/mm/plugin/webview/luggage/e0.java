package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public abstract class e0 extends sd.u0 {
    public static final java.util.regex.Pattern C1 = java.util.regex.Pattern.compile("\"\\s*rgba\\(\\s*[0-9]+\\s*,\\s*[0-9]+\\s*,\\s*[0-9]+\\s*,\\s*[0-9]+\\s*\\)\\s*\"");
    public static final java.util.regex.Pattern D1 = java.util.regex.Pattern.compile("\"\\s*rgb\\(\\s*[0-9]+\\s*,\\s*[0-9]+\\s*,\\s*[0-9]+\\s*\\)\\s*\"");
    public android.widget.FrameLayout A;
    public final com.tencent.mm.sdk.event.IListener A1;
    public final com.tencent.mm.plugin.webview.luggage.w3 B;
    public final com.tencent.mm.plugin.webview.permission.a B1;
    public com.tencent.mm.plugin.webview.ui.tools.u C;
    public final com.tencent.mm.plugin.webview.luggage.x2 D;
    public final com.tencent.mm.plugin.webview.luggage.x3 E;
    public com.tencent.mm.plugin.handoff.model.HandOffURL F;
    public android.webkit.WebChromeClient.CustomViewCallback G;
    public android.widget.FrameLayout H;
    public android.widget.ProgressBar I;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.permission.d f182178J;
    public final com.tencent.mm.plugin.webview.luggage.c4 K;
    public final com.tencent.mm.plugin.webview.luggage.w2 L;
    public final com.tencent.mm.sdk.platformtools.n3 M;
    public boolean N;
    public java.lang.String P;
    public boolean Q;
    public boolean R;
    public int S;
    public final boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: l1, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.luggage.e4 f182179l1;

    /* renamed from: p, reason: collision with root package name */
    public uw4.n f182180p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f182181p0;

    /* renamed from: p1, reason: collision with root package name */
    public android.view.accessibility.AccessibilityManager f182182p1;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.luggage.x1 f182183q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.FrameLayout f182184r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.luggage.r f182185s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.luggage.y1 f182186t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout f182187u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter f182188v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter f182189w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.FrameLayout f182190x;

    /* renamed from: x0, reason: collision with root package name */
    public int f182191x0;

    /* renamed from: x1, reason: collision with root package name */
    public android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener f182192x1;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.widget.MovingImageButton f182193y;

    /* renamed from: y0, reason: collision with root package name */
    public int f182194y0;

    /* renamed from: y1, reason: collision with root package name */
    public final int f182195y1;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.FrameLayout f182196z;

    /* renamed from: z1, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.luggage.p1 f182197z1;

    public e0(sd.x xVar, sd.o0 o0Var, android.os.Bundle bundle) {
        super(xVar, o0Var, bundle);
        this.N = true;
        this.Q = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f182181p0 = false;
        this.f182191x0 = 0;
        this.f182194y0 = 0;
        this.f182179l1 = new com.tencent.mm.plugin.webview.luggage.e4();
        this.f182195y1 = 32;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.plugin.webview.model.SendDataToH5Event> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.plugin.webview.model.SendDataToH5Event>(a0Var) { // from class: com.tencent.mm.plugin.webview.luggage.LuggageMMWebPage$1
            {
                this.__eventId = -739196989;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.plugin.webview.model.SendDataToH5Event sendDataToH5Event) {
                com.tencent.mm.plugin.webview.model.SendDataToH5Event sendDataToH5Event2 = sendDataToH5Event;
                int i17 = sendDataToH5Event2.f182728g;
                sd.o0 o0Var2 = com.tencent.mm.plugin.webview.luggage.e0.this.f406655i;
                if (i17 != (o0Var2 != null ? o0Var2.f406639r : 0)) {
                    return false;
                }
                o0Var2.b(sendDataToH5Event2.f182729h, sendDataToH5Event2.f182730i);
                return true;
            }
        };
        this.A1 = iListener;
        this.B1 = new com.tencent.mm.plugin.webview.luggage.a1(this);
        com.tencent.mm.plugin.webview.luggage.b1 b1Var = new com.tencent.mm.plugin.webview.luggage.b1(this);
        if (o0Var != null) {
            this.T = true;
            this.f182178J = (com.tencent.mm.plugin.webview.permission.d) com.tencent.mm.plugin.webview.permission.l.f183427a.remove(java.lang.Integer.valueOf(o0Var.hashCode()));
        }
        int i17 = bundle.getInt("geta8key_scene", 32);
        int i18 = 2;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Boolean.valueOf(this.f182178J == null);
        objArr[1] = java.lang.Integer.valueOf(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageMMWebPage", "LuggageMMWebPage create, getA8key == null ? %b  sourceA8keyScene = %d", objArr);
        if (this.f182178J == null) {
            this.f182178J = new com.tencent.mm.plugin.webview.permission.d(null);
        }
        this.f182178J.f183383c = 32;
        this.M = new com.tencent.mm.sdk.platformtools.n3();
        this.K = new com.tencent.mm.plugin.webview.luggage.c4(this);
        com.tencent.mm.plugin.webview.luggage.w2 w2Var = new com.tencent.mm.plugin.webview.luggage.w2(this, this.f182178J);
        this.L = w2Var;
        this.f406655i.f406619e = w2Var;
        this.B = new com.tencent.mm.plugin.webview.luggage.w3(this);
        this.D = new com.tencent.mm.plugin.webview.luggage.x2(new com.tencent.mm.plugin.webview.luggage.u(this), this);
        this.E = new com.tencent.mm.plugin.webview.luggage.x3(this, new com.tencent.mm.plugin.webview.luggage.z3(this));
        synchronized (com.tencent.mm.plugin.webview.luggage.u1.f182626a) {
            java.util.LinkedList linkedList = com.tencent.mm.plugin.webview.luggage.u1.f182628c;
            if (!linkedList.contains(this)) {
                linkedList.addFirst(this);
                com.tencent.mm.plugin.webview.luggage.u1.f182629d.put(com.tencent.mm.plugin.webview.luggage.u1.a(this), this);
            }
        }
        uw4.n nVar = this.f182180p;
        if (nVar != null) {
            nVar.setPage(this);
            this.f182180p.setWebViewClient(new com.tencent.mm.plugin.webview.luggage.r0(this));
            this.f182180p.setWebChromeClient(new com.tencent.mm.plugin.webview.luggage.s0(this));
        }
        this.f406613g = b1Var;
        this.f406611e.f406600a.put(new com.tencent.mm.plugin.webview.luggage.f1(this), java.lang.Boolean.FALSE);
        com.tencent.mm.plugin.game.luggage.page.x0 x0Var = (com.tencent.mm.plugin.game.luggage.page.x0) this;
        int a17 = hy4.b0.a(x0Var.f406610d);
        if (a17 >= 1 && a17 <= 8) {
            i18 = a17;
        }
        x0Var.z(i18);
        x0Var.M.postUI(new com.tencent.mm.plugin.game.luggage.page.f0(x0Var, i18));
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("accessibility");
        this.f182182p1 = accessibilityManager;
        com.tencent.mm.plugin.webview.luggage.h1 h1Var = new com.tencent.mm.plugin.webview.luggage.h1(this);
        this.f182192x1 = h1Var;
        accessibilityManager.addAccessibilityStateChangeListener(h1Var);
        iListener.alive();
    }

    public java.lang.Boolean A() {
        return java.lang.Boolean.FALSE;
    }

    public void B(java.lang.String str) {
        if (str != null) {
            this.f406655i.c(new com.tencent.mm.plugin.webview.luggage.l1(this, str));
        }
    }

    public abstract void C(java.lang.String str);

    public abstract void D(int i17, java.lang.String str, java.lang.String str2);

    public abstract void E(java.lang.String str, java.lang.String str2, java.util.Map map);

    public void F(java.lang.Runnable runnable) {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.M.post(runnable);
        }
    }

    public void G() {
        if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread()) {
            this.M.post(new com.tencent.mm.plugin.webview.luggage.m1(this));
        } else {
            com.tencent.mm.plugin.webview.luggage.y1 y1Var = this.f182186t;
            int i17 = this.S;
            com.tencent.mm.plugin.webview.luggage.p1 p1Var = this.f182197z1;
            y1Var.f(i17, p1Var.f182592a, p1Var.f182593b);
        }
    }

    public void H(java.lang.String str) {
    }

    public void I(java.lang.String str, int i17) {
        if (this.Y) {
            this.D.Z(str);
        }
        this.E.L(str);
        com.tencent.mm.plugin.handoff.model.HandOffURL handOffURL = this.F;
        if (handOffURL != null) {
            handOffURL.setTitle(str);
            ((d73.i) i95.n0.c(d73.i.class)).Jc(this.F);
        }
        this.M.post(new com.tencent.mm.plugin.webview.luggage.o1(this, str, i17));
    }

    public void J(boolean z17) {
        if (!z17) {
            this.f182189w.a();
            return;
        }
        if (this.f182189w.isShown()) {
            return;
        }
        this.f182189w.c();
        this.f182189w.f187084e.setText("");
        com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter webViewSearchContentInputFooter = this.f182189w;
        webViewSearchContentInputFooter.setVisibility(0);
        com.tencent.mm.plugin.webview.ui.tools.widget.p7 p7Var = webViewSearchContentInputFooter.f187089m;
        if (p7Var != null) {
            p7Var.onShow();
        }
        webViewSearchContentInputFooter.f187084e.requestFocus();
        webViewSearchContentInputFooter.postDelayed(new com.tencent.mm.plugin.webview.ui.tools.widget.o7(webViewSearchContentInputFooter), 100L);
    }

    @Override // sd.u0
    public java.lang.String j() {
        return ik1.f.e("luggage_mm_adapter.js");
    }

    @Override // sd.u0
    public android.view.View k() {
        java.lang.String s17 = s();
        this.f182197z1 = new com.tencent.mm.plugin.webview.luggage.p1(null);
        android.net.Uri parse = android.net.Uri.parse(s17);
        java.lang.String queryParameter = parse.getQueryParameter("immersiveUIStyle");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (queryParameter == null) {
            queryParameter = "";
        }
        if (queryParameter.equals("1")) {
            this.f182197z1.f182592a = true;
        }
        java.lang.String queryParameter2 = parse.getQueryParameter("immersivePageBgIsDark");
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        if (queryParameter2.equals("1")) {
            this.f182197z1.f182593b = true;
        } else {
            java.lang.String queryParameter3 = parse.getQueryParameter("immersivePageBgIsDark");
            if (queryParameter3 == null) {
                queryParameter3 = "";
            }
            if (!queryParameter3.equals("2")) {
                this.f182197z1.f182593b = false;
            } else if (com.tencent.mm.ui.bk.C()) {
                this.f182197z1.f182593b = true;
            } else {
                this.f182197z1.f182593b = false;
            }
        }
        java.lang.String queryParameter4 = parse.getQueryParameter("hide_share_option");
        if ((queryParameter4 != null ? queryParameter4 : "").equals("1")) {
            this.f182197z1.f182594c = true;
        }
        this.f182180p = (uw4.n) this.f406655i.h();
        android.content.Context context = this.f406610d;
        this.f182183q = new com.tencent.mm.plugin.webview.luggage.x1(context, super.k());
        this.f182180p.setSource(this.f406657n.getString("KPublisherId"));
        this.f182184r = new android.widget.FrameLayout(context);
        com.tencent.mm.plugin.webview.luggage.r rVar = new com.tencent.mm.plugin.webview.luggage.r(context);
        this.f182185s = rVar;
        rVar.setBackgroundColor(b3.l.getColor(context, com.tencent.mm.R.color.aaw));
        this.f182184r.addView(this.f182185s, new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.bve, (android.view.ViewGroup) this.f182185s, false);
        m();
        if (A().booleanValue()) {
            this.f182185s.addView(inflate);
        } else {
            com.tencent.mm.plugin.webview.luggage.r rVar2 = this.f182185s;
            com.tencent.mm.plugin.webview.luggage.y1 y1Var = this.f182186t;
            boolean z18 = this.f182197z1.f182592a;
            rVar2.getClass();
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(10);
            android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            if (z18) {
                layoutParams2.addRule(10);
                rVar2.addView(inflate, layoutParams2);
                rVar2.addView(y1Var, layoutParams);
            } else {
                rVar2.addView(y1Var, layoutParams);
                layoutParams2.addRule(3, y1Var.getId());
                rVar2.addView(inflate, layoutParams2);
            }
        }
        if (this.f182197z1.f182594c) {
            this.f182186t.a(true);
        }
        this.f182185s.setActionBar(this.f182186t);
        this.f182185s.setWebView(this.f182180p);
        this.f182196z = (android.widget.FrameLayout) inflate.findViewById(com.tencent.mm.R.id.cg7);
        com.tencent.mm.plugin.webview.ui.tools.widget.MovingImageButton movingImageButton = (com.tencent.mm.plugin.webview.ui.tools.widget.MovingImageButton) inflate.findViewById(com.tencent.mm.R.id.gh6);
        this.f182193y = movingImageButton;
        movingImageButton.setOnClickListener(new com.tencent.mm.plugin.webview.luggage.i1(this));
        this.f182187u = (com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout) inflate.findViewById(com.tencent.mm.R.id.gpo);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) inflate.findViewById(com.tencent.mm.R.id.phl);
        this.A = frameLayout;
        frameLayout.addView(this.f182183q, new android.view.ViewGroup.LayoutParams(-1, -1));
        com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter webViewInputFooter = (com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter) inflate.findViewById(com.tencent.mm.R.id.pib);
        this.f182188v = webViewInputFooter;
        webViewInputFooter.a();
        this.f182188v.setOnTextSendListener(new com.tencent.mm.plugin.webview.luggage.f0(this));
        this.f182188v.setOnSmileyChosenListener(new com.tencent.mm.plugin.webview.luggage.h0(this));
        this.f182188v.setOnSmileyPanelVisibilityChangedListener(new com.tencent.mm.plugin.webview.luggage.i0(this));
        com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter webViewSearchContentInputFooter = (com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter) inflate.findViewById(com.tencent.mm.R.id.mdt);
        this.f182189w = webViewSearchContentInputFooter;
        webViewSearchContentInputFooter.setActionDelegate(new com.tencent.mm.plugin.webview.luggage.j0(this));
        this.f182180p.setFindListener(new com.tencent.mm.plugin.webview.luggage.k0(this));
        this.f182190x = (android.widget.FrameLayout) inflate.findViewById(com.tencent.mm.R.id.lr_);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.pir);
        if (textView != null) {
            com.tencent.mm.ui.bk.s0(textView.getPaint());
            textView.setOnClickListener(new com.tencent.mm.plugin.webview.luggage.j1(this));
        }
        this.f182187u.setOnkbdStateListener(new com.tencent.mm.plugin.webview.luggage.l0(this));
        this.f182180p.setOnTouchListener(new com.tencent.mm.plugin.webview.luggage.k1(this));
        return this.f182184r;
    }

    public final void l() {
        int i17 = this.f406657n.getInt("screen_orientation", -1);
        if (((sd.u) this.f406612f).f406653a.f406663d.peek() == this || this.U) {
            ((android.app.Activity) this.f406610d).setRequestedOrientation(i17);
        }
    }

    public abstract android.view.View m();

    public boolean n() {
        boolean z17 = !this.f406657n.getBoolean("disable_minimize", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageMMWebPage", "enableMinimize class:%s enable:%b", getClass(), java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public void o(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        uw4.n nVar = this.f182180p;
        if (nVar != null) {
            nVar.evaluateJavascript(str, valueCallback);
        }
    }

    public void p(boolean z17) {
        com.tencent.mm.plugin.webview.luggage.x2 x2Var = this.D;
        if (x2Var != null) {
            x2Var.p();
        }
        if (x2Var == null || !x2Var.m0(1)) {
            com.tencent.mm.plugin.webview.luggage.x3 x3Var = this.E;
            if (x3Var == null || !x3Var.U(1, true)) {
                if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread()) {
                    com.tencent.mm.ipcinvoker.w0.c(true, new com.tencent.mm.plugin.webview.luggage.e1(this, z17));
                    return;
                }
                sd.x xVar = this.f406612f;
                if (((sd.u) xVar).f406653a.f(z17)) {
                    return;
                }
                ((sd.u) xVar).f406653a.f406665f.e();
            }
        }
    }

    public void q() {
        boolean z17 = true;
        if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread()) {
            com.tencent.mm.ipcinvoker.w0.c(true, new com.tencent.mm.plugin.webview.luggage.d1(this));
            return;
        }
        int indexOf = ((sd.u) this.f406612f).f406653a.f406663d.indexOf(this);
        if (indexOf < 0) {
            return;
        }
        sd.w wVar = ((sd.u) this.f406612f).f406653a;
        if (indexOf < 0) {
            wVar.getClass();
        } else {
            sd.v vVar = wVar.f406663d;
            if (vVar.size() <= 1 || vVar.size() <= indexOf) {
                z17 = false;
            } else if (indexOf == 0) {
                z17 = wVar.f(false);
            } else {
                wVar.j((sd.k) vVar.remove(indexOf));
            }
        }
        if (!z17) {
            ((sd.u) this.f406612f).f406653a.f406665f.e();
            return;
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.webview.luggage.c1 c1Var = new com.tencent.mm.plugin.webview.luggage.c1(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(c1Var, 250L, false);
    }

    public final void r(int i17) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.f182189w.getLayoutParams();
        if (marginLayoutParams.bottomMargin != i17) {
            marginLayoutParams.bottomMargin = i17;
            this.f182189w.setLayoutParams(marginLayoutParams);
        }
        if (this.f182189w.isShown()) {
            i17 += this.f182189w.getHeight();
        }
        com.tencent.mm.plugin.webview.luggage.x1 x1Var = this.f182183q;
        x1Var.setPadding(x1Var.getPaddingLeft(), this.f182183q.getPaddingTop(), this.f182183q.getPaddingRight(), i17);
    }

    public java.lang.String s() {
        return this.f406657n.getString("rawUrl");
    }

    public java.lang.String t() {
        return this.f182186t.getTitle();
    }

    public java.lang.String u() {
        sd.o0 o0Var = this.f406655i;
        return o0Var != null ? o0Var.f406638q : "";
    }

    public abstract boolean v(int i17);

    public abstract void w();

    public boolean x() {
        android.os.Bundle bundle = this.f406657n;
        boolean z17 = bundle.getBoolean("forceHideShare", false);
        boolean z18 = bundle.getBoolean("showShare", true);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageMMWebPage", "forceHideShare:%b showShareBtn:%b enableMinimize:%b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(n()));
        return !z17 && z18 && n();
    }

    public abstract boolean y(java.lang.String str);

    public void z(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageMMWebPage", "localSetFontSize, fontSize = " + i17);
        switch (i17) {
            case 1:
                this.f182180p.getSettings().O(80);
                return;
            case 2:
                this.f182180p.getSettings().O(100);
                return;
            case 3:
                this.f182180p.getSettings().O(110);
                return;
            case 4:
                this.f182180p.getSettings().O(112);
                return;
            case 5:
                this.f182180p.getSettings().O(112);
                return;
            case 6:
                this.f182180p.getSettings().O(140);
                return;
            case 7:
                this.f182180p.getSettings().O(155);
                return;
            case 8:
                this.f182180p.getSettings().O(165);
                return;
            default:
                this.f182180p.getSettings().O(100);
                return;
        }
    }
}
