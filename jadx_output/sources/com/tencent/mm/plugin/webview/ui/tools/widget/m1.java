package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class m1 extends hg5.d implements com.tencent.mm.plugin.webview.ui.tools.widget.p1, com.tencent.mm.ui.fa, com.tencent.mm.plugin.webview.ui.tools.widget.q1, com.tencent.mm.plugin.webview.ui.tools.widget.r1 {
    public static final /* synthetic */ int R = 0;
    public android.view.View A;
    public com.tencent.mm.ui.widget.imageview.WeImageView B;
    public android.view.View C;
    public com.tencent.mm.plugin.webview.ui.tools.widget.PullDownWebViewLayout D;
    public com.tencent.mm.ui.widget.imageview.WeImageView E;
    public boolean F;
    public final jz5.g G;
    public final float H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.Integer f187395J;
    public final com.tencent.mm.plugin.webview.ui.tools.widget.z1 K;
    public final java.lang.String L;
    public org.json.JSONObject M;
    public final java.util.Set N;
    public final com.tencent.mm.sdk.event.IListener P;
    public final java.util.ArrayList Q;

    /* renamed from: r, reason: collision with root package name */
    public final android.content.Context f187396r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.widget.n1 f187397s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f187398t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f187399u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f187400v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f187401w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f187402x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f187403y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.LinearLayout f187404z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(android.content.Context activityContext, java.lang.String url, com.tencent.mm.ui.widget.MMWebView mMWebView, com.tencent.mm.plugin.webview.ui.tools.widget.n1 option) {
        super(activityContext);
        kotlin.jvm.internal.o.g(activityContext, "activityContext");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(option, "option");
        this.f187396r = activityContext;
        this.f187397s = option;
        this.f187398t = url;
        this.G = jz5.h.b(new com.tencent.mm.plugin.webview.ui.tools.widget.c1(this));
        this.H = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8);
        this.K = ((yg0.a) ((zg0.r2) i95.n0.c(zg0.r2.class))).wi((android.app.Activity) activityContext, url, mMWebView, new com.tencent.mm.plugin.webview.ui.tools.widget.e0(option.f187418a, option.f187420c, option.f187421d, option.f187429l, null, option.f187430m, this, null, this, false, com.tencent.mm.plugin.appbrand.jsapi.appdownload.i0.CTRL_INDEX, null));
        this.L = "";
        this.N = new java.util.HashSet();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.P = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.HalfScreenWebViewCloseEvent>(a0Var) { // from class: com.tencent.mm.plugin.webview.ui.tools.widget.HalfScreenWebView$halfScreenWebViewCloseEventListener$1
            {
                this.__eventId = -1858943092;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.HalfScreenWebViewCloseEvent halfScreenWebViewCloseEvent) {
                com.tencent.mm.autogen.events.HalfScreenWebViewCloseEvent event = halfScreenWebViewCloseEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("HalfScreenWebViewCloseEvent isShowing=");
                com.tencent.mm.plugin.webview.ui.tools.widget.m1 m1Var = com.tencent.mm.plugin.webview.ui.tools.widget.m1.this;
                sb6.append(m1Var.isShowing());
                sb6.append(", sameContext=");
                am.eh ehVar = event.f54429g;
                android.content.Context context = ehVar.f6556a;
                android.content.Context context2 = m1Var.f187396r;
                sb6.append(kotlin.jvm.internal.o.b(context2, context));
                sb6.append(", touchOuter true");
                com.tencent.mars.xlog.Log.i("MicroMsg.HalfScreenWebView", sb6.toString());
                if (!kotlin.jvm.internal.o.b(context2, ehVar.f6556a) || !m1Var.isShowing()) {
                    return false;
                }
                m1Var.cancel();
                return false;
            }
        };
        this.Q = new java.util.ArrayList();
    }

    @Override // androidx.appcompat.app.i0
    public void A() {
        if (!this.f187397s.f187428k) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HalfScreenWebView", "onOuterViewClick closeWhenClickEmptyArea is false");
            return;
        }
        this.P.dead();
        com.tencent.mm.autogen.events.HalfScreenWebViewCloseEvent halfScreenWebViewCloseEvent = new com.tencent.mm.autogen.events.HalfScreenWebViewCloseEvent();
        halfScreenWebViewCloseEvent.f54429g.f6556a = this.f187396r;
        if (halfScreenWebViewCloseEvent.e()) {
            com.tencent.mm.sdk.platformtools.u3.i(new nf.d(new com.tencent.mm.plugin.webview.ui.tools.widget.k1(this)), 200L);
        } else {
            cancel();
        }
    }

    @Override // hg5.d
    public int E() {
        com.tencent.mm.plugin.webview.ui.tools.widget.n1 n1Var = this.f187397s;
        if (!(n1Var.f187418a == 1.0f)) {
            return (int) ((com.tencent.mm.ui.bh.a(getContext()).f197136b - com.tencent.mm.ui.bl.c(getContext())) * (1 - n1Var.f187418a));
        }
        if (getContext().getResources().getConfiguration().orientation == 2) {
            return 0;
        }
        return com.tencent.mm.ui.bl.h(getContext());
    }

    @Override // hg5.d
    public android.view.View F() {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.d9u, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return inflate;
    }

    @Override // hg5.d
    public void G() {
        int i17;
        android.view.View findViewById;
        android.view.ViewGroup.LayoutParams layoutParams;
        int i18;
        int i19;
        int i27;
        android.view.View view;
        android.view.Window window;
        android.widget.LinearLayout linearLayout;
        android.widget.TextView textView;
        android.view.View view2;
        android.view.WindowManager.LayoutParams attributes;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initContentView url= ");
        java.lang.String str = this.f187398t;
        sb6.append(str);
        sb6.append(" heightPercent=");
        com.tencent.mm.plugin.webview.ui.tools.widget.n1 n1Var = this.f187397s;
        sb6.append(n1Var.f187418a);
        sb6.append(" reuse=");
        sb6.append(n1Var.f187421d);
        sb6.append(" immersiveUIStyle=");
        sb6.append(n1Var.f187425h);
        com.tencent.mars.xlog.Log.i("MicroMsg.HalfScreenWebView", sb6.toString());
        C(1);
        super.G();
        setCanceledOnTouchOutside(true);
        if (n1Var.f187427j) {
            android.view.Window window2 = getWindow();
            if (window2 != null) {
                window2.setDimAmount(0.3f);
            }
            android.view.Window window3 = getWindow();
            if (window3 != null) {
                window3.addFlags(Integer.MIN_VALUE);
            }
        } else {
            android.view.Window window4 = getWindow();
            if (window4 != null) {
                window4.setDimAmount(0.0f);
            }
        }
        if (1 == n1Var.f187426i) {
            android.view.Window window5 = getWindow();
            if (window5 != null) {
                window5.setWindowAnimations(com.tencent.mm.R.style.f494504ot);
            }
        } else {
            android.view.Window window6 = getWindow();
            if (window6 != null) {
                window6.setWindowAnimations(com.tencent.mm.R.style.f494075dq);
            }
        }
        K();
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            android.view.Window window7 = getWindow();
            android.view.WindowManager.LayoutParams attributes2 = window7 != null ? window7.getAttributes() : null;
            if (attributes2 != null) {
                attributes2.layoutInDisplayCutoutMode = 1;
            }
            android.view.Window window8 = getWindow();
            if (window8 != null) {
                window8.setAttributes(attributes2);
            }
            int i28 = n1Var.f187440w ? 5890 : 1792;
            android.view.Window window9 = getWindow();
            android.view.View decorView = window9 != null ? window9.getDecorView() : null;
            if (decorView != null) {
                decorView.setSystemUiVisibility(i28);
            }
        }
        android.view.Window window10 = getWindow();
        if (window10 != null && (attributes = window10.getAttributes()) != null) {
            attributes.width = -1;
            attributes.height = -1;
            attributes.gravity = 80;
        }
        android.content.Context context = this.f187396r;
        boolean z17 = context instanceof com.tencent.mm.ui.MMActivity;
        if (z17) {
            if (n1Var.f187434q) {
                com.tencent.mm.ui.MMActivity mMActivity = z17 ? (com.tencent.mm.ui.MMActivity) context : null;
                if (mMActivity != null) {
                    mMActivity.setRequestedOrientation(1);
                }
            }
            com.tencent.mm.ui.MMActivity mMActivity2 = z17 ? (com.tencent.mm.ui.MMActivity) context : null;
            if (mMActivity2 != null) {
                mMActivity2.addOnConfigurationChangedListener(this);
            }
        }
        android.view.View view3 = this.f281404m;
        if (view3 == null) {
            i17 = 0;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            i17 = 0;
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/HalfScreenWebView", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/webview/ui/tools/widget/HalfScreenWebView", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if ((n1Var.f187435r == 1 ? 1 : i17) != 0 && n1Var.f187426i == 1) {
            android.view.View view4 = this.f281403i;
            if (view4 != null) {
                findViewById = view4.findViewById(com.tencent.mm.R.id.f487706qy0);
            }
            findViewById = null;
        } else if (n1Var.f187439v) {
            android.view.View view5 = this.f281403i;
            if (view5 != null) {
                findViewById = view5.findViewById(com.tencent.mm.R.id.f487705vp1);
            }
            findViewById = null;
        } else {
            android.view.View view6 = this.f281403i;
            if (view6 != null) {
                findViewById = view6.findViewById(com.tencent.mm.R.id.qxz);
            }
            findViewById = null;
        }
        this.f187402x = findViewById;
        android.view.View view7 = this.f281403i;
        this.f187400v = view7 != null ? view7.findViewById(com.tencent.mm.R.id.f487702pi3) : null;
        android.view.View view8 = this.f281403i;
        this.f187399u = view8 != null ? view8.findViewById(com.tencent.mm.R.id.f487704pi5) : null;
        android.view.View view9 = this.f281403i;
        this.A = view9 != null ? view9.findViewById(com.tencent.mm.R.id.f487700pi1) : null;
        android.view.View view10 = this.f281403i;
        this.B = view10 != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) view10.findViewById(com.tencent.mm.R.id.f487701pi2) : null;
        android.view.View view11 = this.f281403i;
        this.C = view11 != null ? view11.findViewById(com.tencent.mm.R.id.pi7) : null;
        android.view.View view12 = this.f281403i;
        this.D = view12 != null ? (com.tencent.mm.plugin.webview.ui.tools.widget.PullDownWebViewLayout) view12.findViewById(com.tencent.mm.R.id.pi8) : null;
        android.view.View view13 = this.f281403i;
        this.E = view13 != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) view13.findViewById(com.tencent.mm.R.id.f487703pi4) : null;
        android.view.View view14 = this.f281403i;
        this.f187401w = view14 != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) view14.findViewById(com.tencent.mm.R.id.pi6) : null;
        if (j62.e.g().c(new com.tencent.mm.repairer.config.webview.RepairerConfigThirdPartyDisclaimer()) == 1) {
            android.view.View view15 = this.f281403i;
            this.f187403y = view15 != null ? (android.widget.TextView) view15.findViewById(com.tencent.mm.R.id.ryk) : null;
            android.view.View view16 = this.f281403i;
            android.widget.LinearLayout linearLayout2 = view16 != null ? (android.widget.LinearLayout) view16.findViewById(com.tencent.mm.R.id.ryj) : null;
            this.f187404z = linearLayout2;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(i17);
            }
        } else {
            android.view.View view17 = this.f281403i;
            this.f187403y = view17 != null ? (android.widget.TextView) view17.findViewById(com.tencent.mm.R.id.odf) : null;
            android.view.View view18 = this.f281403i;
            this.f187404z = view18 != null ? (android.widget.LinearLayout) view18.findViewById(com.tencent.mm.R.id.ocp) : null;
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.z1.B6(this.K, null, 1, null);
        if (n1Var.f187425h) {
            this.I = true;
        } else {
            try {
                java.lang.String queryParameter = android.net.Uri.parse(str).getQueryParameter("immersiveUIStyle");
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (queryParameter == null) {
                    queryParameter = "";
                }
                this.I = kotlin.jvm.internal.o.b(queryParameter, "1");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.HalfScreenWebView", "initImmersiveStyle ex " + e17.getMessage());
            }
        }
        java.lang.String str2 = n1Var.f187433p;
        if (((str2 == null || r26.n0.N(str2)) ? 1 : i17) == 0) {
            this.f187395J = java.lang.Integer.valueOf(com.tencent.mm.plugin.webview.ui.tools.a1.c(n1Var.f187433p, i65.a.d(getContext(), com.tencent.mm.R.color.aaw)));
        }
        if (n1Var.f187424g) {
            com.tencent.mm.plugin.webview.ui.tools.widget.PullDownWebViewLayout pullDownWebViewLayout = this.D;
            layoutParams = pullDownWebViewLayout != null ? pullDownWebViewLayout.getLayoutParams() : null;
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            if (this.I) {
                layoutParams2.addRule(1, com.tencent.mm.R.id.f487706qy0);
                layoutParams2.addRule(6, com.tencent.mm.R.id.pi7);
            }
        } else if (this.I) {
            com.tencent.mm.plugin.webview.ui.tools.widget.PullDownWebViewLayout pullDownWebViewLayout2 = this.D;
            layoutParams = pullDownWebViewLayout2 != null ? pullDownWebViewLayout2.getLayoutParams() : null;
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ((android.widget.RelativeLayout.LayoutParams) layoutParams).removeRule(3);
        } else {
            com.tencent.mm.plugin.webview.ui.tools.widget.PullDownWebViewLayout pullDownWebViewLayout3 = this.D;
            layoutParams = pullDownWebViewLayout3 != null ? pullDownWebViewLayout3.getLayoutParams() : null;
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ((android.widget.RelativeLayout.LayoutParams) layoutParams).addRule(3, com.tencent.mm.R.id.pi7);
        }
        U();
        android.view.View view19 = this.f281403i;
        if (view19 != null) {
            view19.setOnTouchListener(new com.tencent.mm.plugin.webview.ui.tools.widget.i1(this));
        }
        boolean z19 = n1Var.f187422e;
        float f17 = this.H;
        if (!z19 || n1Var.f187423f == -1) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.E;
            i18 = 8;
            if (weImageView != null) {
                weImageView.setVisibility(8);
            }
            i19 = i17;
        } else {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.E;
            if (weImageView2 != null) {
                weImageView2.setVisibility(i17);
            }
            com.tencent.mm.ui.tools.d8.b(this.E, 0.5f);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.E;
            if (weImageView3 != null) {
                weImageView3.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.widget.d1(this));
            }
            i19 = ((int) (3 * f17)) + 0;
            i18 = 8;
        }
        int i29 = n1Var.f187423f;
        if (i29 != -1) {
            if (i29 == 1) {
                if ((n1Var.f187435r == 1 ? 1 : i17) == 0 || n1Var.f187426i != 1) {
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.B;
                    if (weImageView4 != null) {
                        weImageView4.setRotation(180.0f);
                    }
                } else {
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView5 = this.B;
                    if (weImageView5 != null) {
                        weImageView5.setRotation(0.0f);
                    }
                }
            } else {
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView6 = this.B;
                if (weImageView6 != null) {
                    weImageView6.setRotation(90.0f);
                }
            }
            if (n1Var.f187424g && (view2 = this.f187402x) != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/HalfScreenWebView", "initActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(i17)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/widget/HalfScreenWebView", "initActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            i27 = ((int) (3 * f17)) + i17;
        } else {
            android.view.View view20 = this.C;
            if (view20 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view20, arrayList3.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/HalfScreenWebView", "initActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view20.setVisibility(((java.lang.Integer) arrayList3.get(i17)).intValue());
                yj0.a.f(view20, "com/tencent/mm/plugin/webview/ui/tools/widget/HalfScreenWebView", "initActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (n1Var.f187424g && n1Var.f187439v && (view = this.f187402x) != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/HalfScreenWebView", "initActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList4.get(i17)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/widget/HalfScreenWebView", "initActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            i27 = i17;
        }
        if (n1Var.f187431n) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView7 = this.f187401w;
            if (weImageView7 != null) {
                weImageView7.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.widget.e1(this));
            }
            com.tencent.mm.ui.tools.d8.b(this.f187401w, 0.5f);
            i19 += (int) (f17 * (i19 > 0 ? 5 : 3));
        } else {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView8 = this.f187401w;
            if (weImageView8 != null) {
                weImageView8.setVisibility(i18);
            }
        }
        int i37 = i27 - i19;
        if (n1Var.f187432o) {
            if (i37 > 0) {
                android.widget.LinearLayout linearLayout3 = this.f187404z;
                if (linearLayout3 != null) {
                    linearLayout3.setPadding(i17, i17, i37, i17);
                }
            } else if (i37 < 0 && (linearLayout = this.f187404z) != null) {
                linearLayout.setPadding(0 - i37, i17, i17, i17);
            }
            if (com.tencent.mm.ui.f.a()) {
                com.tencent.mm.ui.f.b(this.f187403y, com.tencent.mm.R.dimen.f479559b);
            } else if (i65.a.D(getContext()) && (textView = this.f187403y) != null) {
                textView.setTextSize(i17, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479559b) * i65.a.m(getContext()));
            }
        } else {
            android.widget.LinearLayout linearLayout4 = this.f187404z;
            if (linearLayout4 != null) {
                linearLayout4.setVisibility(i18);
            }
        }
        android.view.View view21 = this.f187400v;
        if (view21 != null) {
            view21.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.widget.f1(this));
        }
        P(L());
        f(i65.a.d(getContext(), com.tencent.mm.R.color.aaw));
        this.P.alive();
        if (n1Var.f187436s && (window = getWindow()) != null) {
            window.setFlags(1024, 1024);
        }
        if (j62.e.g().c(new com.tencent.mm.repairer.config.webview.RepairerConfigThirdPartyDisclaimer()) == 1) {
            com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui("ilinkres_aea21419", "WebViewHostShowRuleJson");
            if (Ui != null) {
                T(Ui);
                return;
            }
            com.tencent.mm.plugin.webview.ui.tools.widget.g1 g1Var = new com.tencent.mm.plugin.webview.ui.tools.widget.g1(this);
            com.tencent.wechat.aff.udr.q qVar = new com.tencent.wechat.aff.udr.q();
            qVar.c("ilinkres_aea21419");
            java.util.LinkedList linkedList = qVar.f217548e;
            if (linkedList != null) {
                linkedList.add("WebViewHostShowRuleJson");
            }
            ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Di(qVar, g1Var);
        }
    }

    @Override // hg5.d
    public void J() {
        super.J();
        this.P.dead();
        android.content.Context context = this.f187396r;
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            ((com.tencent.mm.ui.MMActivity) context).removeOnConfigurationChangedListener(this);
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.PullDownWebViewLayout pullDownWebViewLayout = this.D;
        if (pullDownWebViewLayout != null && pullDownWebViewLayout.f187077r) {
            com.tencent.mm.ui.widget.MMWebView mMWebView = pullDownWebViewLayout.f187074o;
            if (mMWebView == null) {
                kotlin.jvm.internal.o.o("webView");
                throw null;
            }
            mMWebView.C.remove(pullDownWebViewLayout.f187081v);
            pullDownWebViewLayout.f187077r = false;
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.PullDownWebViewLayout pullDownWebViewLayout2 = this.D;
        if (pullDownWebViewLayout2 != null) {
            pullDownWebViewLayout2.removeAllViews();
        }
        ((com.tencent.mm.plugin.webview.ui.tools.widget.o4) this.K).l();
        com.tencent.mars.xlog.Log.i("MicroMsg.HalfScreenWebView", "onDismiss url= " + this.f187398t + " cacheController=false");
    }

    public final void K() {
        android.view.View decorView;
        android.view.Window window = getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.setMinimumWidth(com.tencent.mm.ui.bh.a(decorView.getContext()).f197135a);
        decorView.setPadding(getContext().getResources().getConfiguration().orientation == 2 ? com.tencent.mm.ui.bl.h(decorView.getContext()) : 0, 0, 0, 0);
    }

    public final int L() {
        android.content.Context context;
        int i17;
        if (this.I) {
            context = getContext();
            i17 = com.tencent.mm.R.color.f479553ab4;
        } else {
            context = getContext();
            i17 = com.tencent.mm.R.color.aaw;
        }
        return i65.a.d(context, i17);
    }

    public final com.tencent.mm.ui.widget.MMWebView M() {
        return ((com.tencent.mm.plugin.webview.ui.tools.widget.o4) this.K).d();
    }

    public final boolean N() {
        org.json.JSONObject jSONObject;
        if (j62.e.g().c(new com.tencent.mm.repairer.config.webview.RepairerConfigThirdPartyDisclaimer()) != 1 || (jSONObject = this.M) == null) {
            return false;
        }
        return jSONObject != null ? jSONObject.optBoolean("EnableWebHostShow", false) : false;
    }

    public void O(java.lang.String result) {
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i("MicroMsg.HalfScreenWebView", "onJsApiConfirmDialogDismiss result=".concat(result));
        if (this.F) {
            this.F = false;
            android.view.View view = this.f281402h;
            if (view != null) {
                view.setBackgroundColor(0);
            }
            android.view.View view2 = this.f281401g;
            if (view2 != null) {
                view2.setBackgroundColor(0);
            }
        }
    }

    public void P(int i17) {
        int d17;
        android.view.View view = this.C;
        if (view != null) {
            view.setBackgroundColor(i17);
        }
        android.view.View view2 = this.f187399u;
        if (view2 != null) {
            view2.setOutlineProvider(new com.tencent.mm.plugin.webview.ui.tools.widget.l1(this, this.H));
        }
        if (view2 != null) {
            view2.setClipToOutline(true);
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.n1 n1Var = this.f187397s;
        if (n1Var.f187437t == 1) {
            android.view.View view3 = this.A;
            if (view3 != null) {
                view3.setBackgroundResource(com.tencent.mm.R.drawable.bat);
            }
            d17 = i65.a.d(getContext(), com.tencent.mm.R.color.BW_100_Alpha_0_9);
        } else {
            android.view.ViewGroup.LayoutParams layoutParams = null;
            if (android.graphics.Color.red(i17) > 200 && android.graphics.Color.blue(i17) > 200 && android.graphics.Color.green(i17) > 200) {
                if (n1Var.f187437t == 2) {
                    android.view.View view4 = this.A;
                    if (view4 != null) {
                        view4.setBackgroundResource(com.tencent.mm.R.color.a9e);
                    }
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.B;
                    if (weImageView != null) {
                        android.view.ViewGroup.LayoutParams layoutParams2 = weImageView.getLayoutParams();
                        if (layoutParams2 != null) {
                            layoutParams2.height = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479704cz);
                            layoutParams2.width = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479672c9);
                            layoutParams = layoutParams2;
                        }
                        weImageView.setLayoutParams(layoutParams);
                    }
                } else if (n1Var.f187422e) {
                    android.view.View view5 = this.A;
                    if (view5 != null) {
                        view5.setBackgroundResource(com.tencent.mm.R.drawable.bau);
                    }
                } else {
                    android.view.View view6 = this.A;
                    if (view6 != null) {
                        view6.setBackgroundResource(com.tencent.mm.R.drawable.bas);
                    }
                }
                d17 = i65.a.d(getContext(), com.tencent.mm.R.color.UN_BW_0_Alpha_0_9);
            } else {
                if (n1Var.f187437t == 2) {
                    android.view.View view7 = this.A;
                    if (view7 != null) {
                        view7.setBackgroundResource(com.tencent.mm.R.color.a9e);
                    }
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.B;
                    if (weImageView2 != null) {
                        android.view.ViewGroup.LayoutParams layoutParams3 = weImageView2.getLayoutParams();
                        if (layoutParams3 != null) {
                            layoutParams3.height = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479704cz);
                            layoutParams3.width = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479672c9);
                            layoutParams = layoutParams3;
                        }
                        weImageView2.setLayoutParams(layoutParams);
                    }
                } else if (n1Var.f187422e) {
                    android.view.View view8 = this.A;
                    if (view8 != null) {
                        view8.setBackgroundResource(com.tencent.mm.R.drawable.bat);
                    }
                } else {
                    android.view.View view9 = this.A;
                    if (view9 != null) {
                        view9.setBackgroundResource(com.tencent.mm.R.drawable.bar);
                    }
                }
                d17 = i65.a.d(getContext(), com.tencent.mm.R.color.BW_100_Alpha_0_9);
            }
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.B;
        if (weImageView3 != null) {
            weImageView3.setIconColor(d17);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.E;
        if (weImageView4 != null) {
            weImageView4.setIconColor(d17);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView5 = this.f187401w;
        if (weImageView5 != null) {
            weImageView5.setIconColor(d17);
        }
        android.widget.TextView textView = this.f187403y;
        if (textView != null) {
            if (N()) {
                d17 = -1;
            }
            textView.setTextColor(d17);
        }
    }

    public void R(com.tencent.mm.plugin.webview.ui.tools.widget.n callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.webview.ui.tools.widget.o4 o4Var = (com.tencent.mm.plugin.webview.ui.tools.widget.o4) this.K;
        o4Var.getClass();
        o4Var.f187477v = callback;
    }

    public final void S(com.tencent.xweb.WebView webView) {
        if (this.f187397s.f187423f == 0) {
            boolean z17 = false;
            if (webView != null && webView.canGoBack()) {
                z17 = true;
            }
            if (z17) {
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.B;
                if (weImageView == null) {
                    return;
                }
                weImageView.setRotation(180.0f);
                return;
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.B;
            if (weImageView2 == null) {
                return;
            }
            weImageView2.setRotation(90.0f);
        }
    }

    public final void T(com.tencent.wechat.aff.udr.x xVar) {
        if (xVar == null) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(com.tencent.mm.vfs.w6.M(new com.tencent.mm.vfs.r6(xVar.getPath()).o()));
            this.M = jSONObject;
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("WeiXinHostList");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    java.lang.String optString = optJSONArray.optString(i17);
                    if (optString != null) {
                        ((java.util.HashSet) this.N).add(optString);
                    }
                }
            }
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.HalfScreenWebView", "read file error", e17);
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.HalfScreenWebView", "read file error", e18);
        }
    }

    public final void U() {
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(getContext());
        int i17 = a17.f197135a;
        int i18 = a17.f197136b;
        if (i17 <= i18) {
            i18 = i17;
        }
        android.view.View view = this.f187399u;
        android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        com.tencent.mm.plugin.webview.ui.tools.widget.n1 n1Var = this.f187397s;
        float f17 = n1Var.f187419b;
        if (f17 > 0.0f) {
            if (layoutParams != null) {
                layoutParams.width = (int) (i17 * f17);
            }
        } else if (layoutParams != null) {
            layoutParams.width = i18;
        }
        android.view.View view2 = this.f187399u;
        if (view2 != null) {
            view2.setLayoutParams(layoutParams);
        }
        if (n1Var.f187435r == 1) {
            android.view.View view3 = this.f187399u;
            java.lang.Object layoutParams2 = view3 != null ? view3.getLayoutParams() : null;
            android.widget.RelativeLayout.LayoutParams layoutParams3 = layoutParams2 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams2 : null;
            if (layoutParams3 != null) {
                layoutParams3.removeRule(14);
                layoutParams3.addRule(11);
                com.tencent.mars.xlog.Log.i("MicroMsg.HalfScreenWebView", "updateView set contentLayout align parent right!");
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        java.util.Iterator it = this.Q.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.webview.ui.tools.widget.a1) it.next()).a(false);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p1
    public void e(android.os.Bundle bundle) {
        int i17;
        int i18;
        if (bundle == null) {
            return;
        }
        if (bundle.getBoolean("set_navigation_bar_color_reset", false)) {
            i18 = L();
            i17 = 255;
        } else {
            int i19 = bundle.getInt("set_navigation_bar_color_color");
            i17 = bundle.getInt("set_navigation_bar_color_alpha");
            i18 = i19;
        }
        P((i18 & 16777215) | (i17 << 24));
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p1
    public void f(int i17) {
        android.view.View view = this.f187399u;
        if (view != null) {
            view.setBackgroundColor(i17);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p1
    public void i(com.tencent.xweb.WebView webView, java.lang.String str, boolean z17) {
        S(webView);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p1
    public void k() {
        com.tencent.mm.plugin.webview.ui.tools.widget.PullDownWebViewLayout pullDownWebViewLayout;
        com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout webViewKeyboardLinearLayout = ((com.tencent.mm.plugin.webview.ui.tools.widget.o4) this.K).f187467i;
        android.view.ViewParent parent = webViewKeyboardLinearLayout != null ? webViewKeyboardLinearLayout.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        if (this.f187395J != null) {
            com.tencent.mm.ui.widget.MMWebView M = M();
            java.lang.Integer num = this.f187395J;
            kotlin.jvm.internal.o.d(num);
            M.setBackgroundColor(num.intValue());
            if (!this.I) {
                java.lang.Integer num2 = this.f187395J;
                kotlin.jvm.internal.o.d(num2);
                P(num2.intValue());
            }
        } else {
            M().setBackgroundColor(i65.a.d(getContext(), com.tencent.mm.R.color.aaw));
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.PullDownWebViewLayout pullDownWebViewLayout2 = this.D;
        if (pullDownWebViewLayout2 != null) {
            pullDownWebViewLayout2.addView(webViewKeyboardLinearLayout, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        }
        S(M());
        com.tencent.mm.plugin.webview.ui.tools.widget.n1 n1Var = this.f187397s;
        boolean z17 = false;
        if (n1Var.f187438u) {
            if ((n1Var.f187435r == 1) && n1Var.f187426i == 1) {
                z17 = true;
            }
        }
        int i17 = (int) (com.tencent.mm.ui.bh.a(getContext()).f197136b * n1Var.f187418a * 0.3f);
        jz5.g gVar = this.G;
        hg5.j.a((hg5.j) ((jz5.n) gVar).getValue(), this.f187402x, this.f281401g, i17, 0.0f, !z17, null, 40, null);
        hg5.j.a((hg5.j) ((jz5.n) gVar).getValue(), this.f187400v, this.f281401g, i17, 0.5f, false, null, 48, null);
        hg5.j.a((hg5.j) ((jz5.n) gVar).getValue(), this.C, this.f281401g, i17, 0.0f, false, this.I ? M() : null, 24, null);
        com.tencent.mm.plugin.webview.core.x3 x3Var = com.tencent.mm.plugin.webview.core.x3.f182012a;
        if (((java.lang.Boolean) ((jz5.n) com.tencent.mm.plugin.webview.core.x3.f182020i).getValue()).booleanValue() && (pullDownWebViewLayout = this.D) != null) {
            java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
            com.tencent.mm.ui.widget.MMWebView M2 = M();
            android.view.View view = this.f281401g;
            if (view != null) {
                pullDownWebViewLayout.f187073n = view;
                pullDownWebViewLayout.f187075p = new hg5.j(weakReference);
                pullDownWebViewLayout.f187076q = i17;
                pullDownWebViewLayout.f187074o = M2;
                M2.D0(pullDownWebViewLayout.f187081v);
                pullDownWebViewLayout.f187077r = true;
            }
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.PullDownWebViewLayout pullDownWebViewLayout3 = this.D;
        if (pullDownWebViewLayout3 != null) {
            pullDownWebViewLayout3.setSupportHorizontalDrag(z17);
        }
        android.view.View view2 = this.f281401g;
        com.tencent.mm.view.RelativeLayoutEx relativeLayoutEx = view2 instanceof com.tencent.mm.view.RelativeLayoutEx ? (com.tencent.mm.view.RelativeLayoutEx) view2 : null;
        if (relativeLayoutEx == null) {
            return;
        }
        relativeLayoutEx.setTranslationCallback(new com.tencent.mm.plugin.webview.ui.tools.widget.h1(z17, this));
    }

    @Override // com.tencent.mm.ui.fa
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        android.view.ViewTreeObserver viewTreeObserver;
        android.view.View view = this.f281401g;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new com.tencent.mm.plugin.webview.ui.tools.widget.j1(this, configuration));
        }
        K();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        com.tencent.mm.plugin.webview.core.r0 r0Var;
        nw4.n g07;
        super.onWindowFocusChanged(z17);
        com.tencent.mm.plugin.webview.ui.tools.widget.z1 z1Var = this.K;
        if (z1Var != null) {
            com.tencent.mm.plugin.webview.ui.tools.widget.o4 o4Var = (com.tencent.mm.plugin.webview.ui.tools.widget.o4) z1Var;
            com.tencent.mm.plugin.webview.core.r0 r0Var2 = o4Var.G;
            if ((r0Var2 != null ? r0Var2.g0() : null) == null || (r0Var = o4Var.G) == null || (g07 = r0Var.g0()) == null) {
                return;
            }
            g07.u0(z17, true);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p1
    public boolean p() {
        return this.I;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p1
    public void r(com.tencent.xweb.WebView webView, java.lang.String str) {
        android.widget.TextView textView;
        java.lang.String str2;
        int i17;
        if (!this.f187397s.f187432o) {
            android.widget.TextView textView2 = this.f187403y;
            if (textView2 == null) {
                return;
            }
            textView2.setText("");
            return;
        }
        com.tencent.mm.plugin.webview.core.r0 r0Var = ((com.tencent.mm.plugin.webview.ui.tools.widget.o4) this.K).G;
        java.lang.String str3 = null;
        java.lang.String str4 = r0Var != null ? r0Var.f181964y : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.HalfScreenWebView", "onReceivedTitle# title = " + str + " loadUrl=" + str4);
        boolean z17 = true;
        boolean z18 = false;
        if (!N()) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                android.widget.TextView textView3 = this.f187403y;
                if (textView3 == null) {
                    return;
                }
                textView3.setText("");
                return;
            }
            if (str4 == null) {
                str4 = "";
            }
            kotlin.jvm.internal.o.d(str);
            if (r26.i0.n(str4, str, false)) {
                android.widget.TextView textView4 = this.f187403y;
                if (textView4 == null) {
                    return;
                }
                textView4.setText("");
                return;
            }
            com.tencent.mm.sdk.platformtools.i6 i6Var = com.tencent.mm.pluginsdk.ui.tools.e9.f191608a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (!android.webkit.URLUtil.isHttpsUrl(str) && !android.webkit.URLUtil.isHttpUrl(str))) {
                z17 = false;
            }
            if (z17 || r26.i0.y(str, "about:blank", false) || (textView = this.f187403y) == null) {
                return;
            }
            textView.setText(str);
            return;
        }
        java.lang.String str5 = this.f187398t;
        java.lang.String host = android.net.Uri.parse(str5).getHost();
        if (host != null && ((java.util.HashSet) this.N).contains(host)) {
            z18 = true;
        }
        if (z18) {
            str2 = "";
            i17 = 1;
        } else {
            org.json.JSONObject jSONObject = this.M;
            org.json.JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject("TencentHostList") : null;
            java.lang.String optString = optJSONObject != null ? optJSONObject.optString(host, "") : "";
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                str3 = host == null ? "" : host;
                i17 = 3;
            } else {
                str3 = getContext().getString(com.tencent.mm.R.string.n3d, optString);
                i17 = 2;
            }
            str2 = !com.tencent.mm.sdk.platformtools.t8.K0(str3) ? str3 : this.L;
        }
        android.widget.TextView textView5 = this.f187403y;
        if (textView5 != null) {
            textView5.setText(str2);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("webview_display_type", 1);
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put("webview_statement", str3);
        hashMap.put("webview_url_type", java.lang.Integer.valueOf(i17));
        hashMap.put("webview_url_domain", host != null ? host : "");
        hashMap.put("webview_url", str5);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("chat_webview_display_statement", hashMap, 32337);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p1
    public void s(android.os.Bundle bundle) {
        android.widget.TextView textView;
        if (bundle == null || !this.f187397s.f187432o || (textView = this.f187403y) == null) {
            return;
        }
        java.lang.String string = bundle.getString("set_page_title_text");
        if (string != null) {
            textView.setText(string);
        }
        float f17 = bundle.getFloat("set_page_title_alpha", 1.0f);
        textView.setTextColor(com.tencent.mm.plugin.webview.ui.tools.a1.c(bundle.getString("set_page_title_color"), textView.getCurrentTextColor()));
        double d17 = f17;
        boolean z17 = false;
        if (0.0d <= d17 && d17 <= 1.0d) {
            z17 = true;
        }
        if (z17) {
            textView.setAlpha(f17);
        }
    }

    @Override // android.app.Dialog
    public void setOnShowListener(android.content.DialogInterface.OnShowListener onShowListener) {
        super.setOnShowListener(onShowListener);
    }

    @Override // hg5.d, android.app.Dialog
    public void show() {
        super.show();
        java.util.Iterator it = this.Q.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.webview.ui.tools.widget.a1) it.next()).a(true);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p1
    public void t(com.tencent.xweb.WebView webView, java.lang.String str) {
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p1
    public void w(com.tencent.xweb.WebView webView, java.lang.String str) {
        S(webView);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p1
    public void x(com.tencent.xweb.WebView webView, java.lang.String str) {
        if (webView != null) {
            webView.getUrl();
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.o4 o4Var = (com.tencent.mm.plugin.webview.ui.tools.widget.o4) this.K;
        com.tencent.mm.plugin.webview.core.r0 r0Var = o4Var.G;
        if (r0Var != null) {
            r0Var.Z();
        }
        com.tencent.mm.plugin.webview.core.r0 r0Var2 = o4Var.G;
        java.lang.String Z = r0Var2 != null ? r0Var2.Z() : null;
        if (Z == null || Z.length() == 0) {
            return;
        }
        java.lang.String url = webView != null ? webView.getUrl() : null;
        com.tencent.mm.plugin.webview.core.r0 r0Var3 = o4Var.G;
        if (com.tencent.mm.sdk.platformtools.t8.D0(url, r0Var3 != null ? r0Var3.Z() : null)) {
            return;
        }
        P(L());
        f(i65.a.d(getContext(), com.tencent.mm.R.color.aaw));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ m1(android.content.Context r29, java.lang.String r30, com.tencent.mm.ui.widget.MMWebView r31, com.tencent.mm.plugin.webview.ui.tools.widget.n1 r32, int r33, kotlin.jvm.internal.i r34) {
        /*
            r28 = this;
            r0 = r33 & 4
            if (r0 == 0) goto L6
            r0 = 0
            goto L8
        L6:
            r0 = r31
        L8:
            r1 = r33 & 8
            if (r1 == 0) goto L3f
            com.tencent.mm.plugin.webview.ui.tools.widget.n1 r1 = new com.tencent.mm.plugin.webview.ui.tools.widget.n1
            r2 = r1
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 8388607(0x7fffff, float:1.1754942E-38)
            r27 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r2 = r28
            r3 = r29
            r4 = r30
            goto L47
        L3f:
            r2 = r28
            r3 = r29
            r4 = r30
            r1 = r32
        L47:
            r2.<init>(r3, r4, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.widget.m1.<init>(android.content.Context, java.lang.String, com.tencent.mm.ui.widget.MMWebView, com.tencent.mm.plugin.webview.ui.tools.widget.n1, int, kotlin.jvm.internal.i):void");
    }
}
