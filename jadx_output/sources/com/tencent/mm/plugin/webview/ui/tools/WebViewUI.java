package com.tencent.mm.plugin.webview.ui.tools;

@db5.a(dc1.e.CTRL_INDEX)
@pk.b(pk.a.NAVIGATION_BAR)
@ul5.d(0)
/* loaded from: classes8.dex */
public class WebViewUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements com.tencent.mm.plugin.webview.core.w0, bx4.a, android.view.View.OnCreateContextMenuListener, al5.o2, com.tencent.mm.sdk.platformtools.f7, dy4.a, dy4.c, dy4.b, nf.m, ex4.a {

    /* renamed from: v3, reason: collision with root package name */
    public static android.webkit.WebSettings.RenderPriority f183797v3 = android.webkit.WebSettings.RenderPriority.NORMAL;

    /* renamed from: w3, reason: collision with root package name */
    public static int f183798w3 = 0;

    /* renamed from: x3, reason: collision with root package name */
    public static java.lang.Boolean f183799x3 = null;

    /* renamed from: y3, reason: collision with root package name */
    public static final java.util.regex.Pattern f183800y3 = java.util.regex.Pattern.compile("\"\\s*rgba\\(\\s*[0-9]+\\s*,\\s*[0-9]+\\s*,\\s*[0-9]+\\s*,\\s*[0-9]+\\s*\\)\\s*\"");

    /* renamed from: z3, reason: collision with root package name */
    public static final java.util.regex.Pattern f183801z3 = java.util.regex.Pattern.compile("\"\\s*rgb\\(\\s*[0-9]+\\s*,\\s*[0-9]+\\s*,\\s*[0-9]+\\s*\\)\\s*\"");
    public ww4.b A2;
    public com.tencent.mm.plugin.webview.modeltools.l1 B2;
    public fy4.e C2;
    public z41.c D;
    public com.tencent.mm.plugin.webview.modeltools.z0 D2;
    public final com.tencent.mm.plugin.webview.ui.tools.floatball.v E2;
    public com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter F;
    public vx4.d F2;
    public android.view.View G;
    public final hy4.l0 G2;
    public com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter H;
    public android.view.View H2;
    public boolean I;
    public final com.tencent.mm.sdk.event.IListener I1;
    public android.view.View I2;
    public boolean J1;
    public volatile boolean J2;
    public com.tencent.mm.plugin.webview.stub.v0 K1;
    public final zx4.l0 K2;
    public com.tencent.mm.plugin.webview.core.e3 L1;
    public final com.tencent.xweb.g1 L2;
    public boolean M1;
    public boolean M2;
    public java.lang.String N;
    public final java.util.HashMap N1;
    public com.tencent.mm.plugin.webview.stub.z0 N2;
    public final java.util.HashMap O1;
    public final com.tencent.mm.sdk.event.IListener O2;
    public final java.util.HashMap P1;
    public android.view.View P2;
    public final java.util.HashMap Q1;
    public com.tencent.mm.sdk.platformtools.n3 Q2;
    public com.tencent.mm.plugin.webview.ui.tools.jc R1;
    public com.tencent.mm.plugin.webview.ui.tools.widget.z5 R2;
    public com.tencent.mm.ui.widget.dialog.j0 S1;
    public com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView S2;
    public android.view.View T1;
    public com.tencent.mm.ui.widget.dialog.u3 T2;
    public android.view.accessibility.AccessibilityManager U;
    public android.widget.RelativeLayout U1;
    public int U2;
    public android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener V;
    public android.widget.TextView V1;
    public dx4.f V2;
    public boolean W1;
    public android.view.View W2;
    public boolean X1;
    public int X2;
    public int Y;
    public int Y1;
    public final z41.b Y2;
    public java.lang.String Z1;
    public boolean Z2;

    /* renamed from: a2, reason: collision with root package name */
    public volatile boolean f183803a2;

    /* renamed from: a3, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.s7 f183804a3;

    /* renamed from: b2, reason: collision with root package name */
    public boolean f183805b2;

    /* renamed from: b3, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.modeltools.n f183806b3;

    /* renamed from: c2, reason: collision with root package name */
    public java.lang.String f183807c2;

    /* renamed from: c3, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.modeltools.h f183808c3;

    /* renamed from: d2, reason: collision with root package name */
    public int f183810d2;

    /* renamed from: d3, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.media.n0 f183811d3;

    /* renamed from: e2, reason: collision with root package name */
    public final int f183813e2;

    /* renamed from: e3, reason: collision with root package name */
    public boolean f183814e3;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMWebView f183815f;

    /* renamed from: f2, reason: collision with root package name */
    public boolean f183816f2;

    /* renamed from: f3, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f183817f3;

    /* renamed from: g2, reason: collision with root package name */
    public boolean f183819g2;

    /* renamed from: g3, reason: collision with root package name */
    public boolean f183820g3;

    /* renamed from: h2, reason: collision with root package name */
    public boolean f183822h2;

    /* renamed from: h3, reason: collision with root package name */
    public android.view.View.OnLongClickListener f183823h3;

    /* renamed from: i2, reason: collision with root package name */
    public boolean f183825i2;

    /* renamed from: i3, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f183826i3;

    /* renamed from: j2, reason: collision with root package name */
    public int f183827j2;

    /* renamed from: j3, reason: collision with root package name */
    public final java.lang.Runnable f183828j3;

    /* renamed from: k2, reason: collision with root package name */
    public int f183829k2;

    /* renamed from: k3, reason: collision with root package name */
    public java.lang.String f183830k3;

    /* renamed from: l1, reason: collision with root package name */
    public android.view.View f183831l1;

    /* renamed from: l2, reason: collision with root package name */
    public volatile boolean f183832l2;

    /* renamed from: l3, reason: collision with root package name */
    public volatile java.lang.String f183833l3;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMFalseProgressBar f183834m;

    /* renamed from: m2, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.model.b6 f183835m2;

    /* renamed from: m3, reason: collision with root package name */
    public android.webkit.WebChromeClient.CustomViewCallback f183836m3;
    private vj5.k mStatusBarHeightCallback;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.MultiCodeMaskView f183837n;

    /* renamed from: n2, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.model.m f183838n2;

    /* renamed from: n3, reason: collision with root package name */
    public boolean f183839n3;

    /* renamed from: o, reason: collision with root package name */
    public androidx.appcompat.app.b f183840o;

    /* renamed from: o2, reason: collision with root package name */
    public by4.k f183841o2;

    /* renamed from: o3, reason: collision with root package name */
    public int f183842o3;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ProgressBar f183843p;

    /* renamed from: p1, reason: collision with root package name */
    public android.view.View f183845p1;

    /* renamed from: p2, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.b5 f183846p2;

    /* renamed from: p3, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.wc f183847p3;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f183848q;

    /* renamed from: q2, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.c6 f183849q2;

    /* renamed from: q3, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.snackbar.g f183850q3;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.c4 f183851r;

    /* renamed from: r2, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.q4 f183852r2;

    /* renamed from: r3, reason: collision with root package name */
    public int f183853r3;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f183854s;

    /* renamed from: s2, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.pd f183855s2;

    /* renamed from: s3, reason: collision with root package name */
    public al5.m2 f183856s3;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageButton f183857t;

    /* renamed from: t2, reason: collision with root package name */
    public volatile java.lang.String f183858t2;

    /* renamed from: t3, reason: collision with root package name */
    public boolean f183859t3;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ImageButton f183860u;

    /* renamed from: u2, reason: collision with root package name */
    public volatile long f183861u2;

    /* renamed from: u3, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.core.a1 f183862u3;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f183863v;

    /* renamed from: v2, reason: collision with root package name */
    public com.tencent.mm.plugin.handoff.model.HandOffURL f183864v2;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout f183865w;

    /* renamed from: w2, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.ld f183866w2;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.FrameLayout f183867x;

    /* renamed from: x0, reason: collision with root package name */
    public android.view.View f183868x0;

    /* renamed from: x1, reason: collision with root package name */
    public com.tencent.xweb.s0 f183869x1;

    /* renamed from: x2, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.r3 f183870x2;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.FrameLayout f183871y;

    /* renamed from: y0, reason: collision with root package name */
    public android.webkit.WebChromeClient.CustomViewCallback f183872y0;

    /* renamed from: y1, reason: collision with root package name */
    public android.widget.ProgressBar f183873y1;

    /* renamed from: y2, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.floatball.w f183874y2;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.widget.MovingImageButton f183875z;

    /* renamed from: z2, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.floatball.n f183877z2;

    /* renamed from: d, reason: collision with root package name */
    public boolean f183809d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f183812e = false;

    /* renamed from: g, reason: collision with root package name */
    public long f183818g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f183821h = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f183824i = false;
    public int A = -1;
    public boolean B = false;
    public boolean C = false;
    public final ex4.o E = new ex4.o();

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f183802J = null;
    public boolean K = true;
    public boolean L = false;
    public boolean M = false;
    public java.lang.String P = "";
    public int Q = -1;
    public int R = 0;
    public boolean S = true;
    public boolean T = true;
    public boolean W = false;
    public boolean X = false;
    public byte[] Z = new byte[0];

    /* renamed from: p0, reason: collision with root package name */
    public nw4.n f183844p0 = null;

    /* renamed from: z1, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.permission.w f183876z1 = null;
    public boolean A1 = false;
    public boolean B1 = false;
    public boolean C1 = false;
    public com.tencent.mm.plugin.webview.ui.tools.l3 D1 = null;
    public dy4.l E1 = new dy4.l(this);
    public boolean F1 = false;
    public final bm5.z0 G1 = new bm5.z0(new com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$h());
    public final by4.f H1 = new by4.f(this);

    public WebViewUI() {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.I1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.plugin.appbrand.jsapi.h5_interact.SendDataToH5FromMiniProgramEvent>(a0Var) { // from class: com.tencent.mm.plugin.webview.ui.tools.WebViewUI.1
            {
                this.__eventId = -323543271;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.plugin.appbrand.jsapi.h5_interact.SendDataToH5FromMiniProgramEvent sendDataToH5FromMiniProgramEvent) {
                com.tencent.mm.plugin.appbrand.jsapi.h5_interact.SendDataToH5FromMiniProgramEvent sendDataToH5FromMiniProgramEvent2 = sendDataToH5FromMiniProgramEvent;
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = com.tencent.mm.plugin.webview.ui.tools.WebViewUI.this;
                if (webViewUI.t7() != sendDataToH5FromMiniProgramEvent2.f81270i || webViewUI.f183844p0 == null) {
                    return false;
                }
                java.util.HashMap hashMap = new java.util.HashMap(2);
                hashMap.put("miniprogramAppID", sendDataToH5FromMiniProgramEvent2.f81268g);
                hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, sendDataToH5FromMiniProgramEvent2.f81269h);
                webViewUI.f183844p0.o("onMiniProgramData", hashMap);
                return false;
            }
        };
        this.J1 = false;
        this.K1 = null;
        this.L1 = null;
        this.M1 = false;
        this.N1 = new java.util.HashMap();
        this.O1 = new java.util.HashMap();
        this.P1 = new java.util.HashMap();
        this.Q1 = new java.util.HashMap();
        this.S1 = null;
        this.T1 = null;
        this.U1 = null;
        this.V1 = null;
        this.W1 = false;
        this.X1 = false;
        this.Y1 = 0;
        this.Z1 = null;
        this.f183803a2 = false;
        this.f183805b2 = false;
        this.f183810d2 = 0;
        this.f183813e2 = (int) (java.lang.System.currentTimeMillis() / 1000);
        this.f183816f2 = false;
        this.f183819g2 = false;
        this.f183822h2 = false;
        this.f183825i2 = false;
        this.f183832l2 = false;
        this.f183835m2 = new com.tencent.mm.plugin.webview.model.b6();
        this.f183852r2 = null;
        this.E2 = new com.tencent.mm.plugin.webview.ui.tools.floatball.v();
        this.G2 = new hy4.l0();
        this.J2 = false;
        this.K2 = new zx4.l0();
        this.L2 = new com.tencent.mm.plugin.webview.ui.tools.bb(this);
        this.M2 = true;
        this.O2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ServiceClickEvent>(a0Var) { // from class: com.tencent.mm.plugin.webview.ui.tools.WebViewUI.3
            {
                this.__eventId = 1156034135;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ServiceClickEvent serviceClickEvent) {
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = com.tencent.mm.plugin.webview.ui.tools.WebViewUI.this;
                if (webViewUI.K1 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUI", "Cli Event, invoker is null");
                } else if (webViewUI.f183858t2 == null || com.tencent.mm.plugin.webview.ui.tools.WebViewUI.this.f183858t2.length() == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUI", "Cli Event, tid is null");
                } else {
                    try {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "Cli Event, tid = %s, stime = %d, etime = %d", com.tencent.mm.plugin.webview.ui.tools.WebViewUI.this.f183858t2, java.lang.Long.valueOf(com.tencent.mm.plugin.webview.ui.tools.WebViewUI.this.f183861u2), java.lang.Long.valueOf(currentTimeMillis));
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putString("service_click_tid", new java.lang.String(com.tencent.mm.plugin.webview.ui.tools.WebViewUI.this.f183858t2));
                        bundle.putLong("service_click_stime", com.tencent.mm.plugin.webview.ui.tools.WebViewUI.this.f183861u2);
                        bundle.putLong("service_click_etime", currentTimeMillis);
                        com.tencent.mm.plugin.webview.ui.tools.WebViewUI.this.K1.F4(2836, bundle);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUI", "Cli Event Exception, msg = %s", e17.getMessage());
                    }
                    com.tencent.mm.plugin.webview.ui.tools.WebViewUI.this.f183858t2 = null;
                }
                return false;
            }
        };
        this.U2 = 0;
        this.V2 = new com.tencent.mm.plugin.webview.ui.tools.ga(this);
        this.X2 = 0;
        this.Y2 = new com.tencent.mm.plugin.webview.ui.tools.ka(this);
        this.Z2 = false;
        this.f183804a3 = new com.tencent.mm.plugin.webview.ui.tools.s7();
        this.f183806b3 = new com.tencent.mm.plugin.webview.modeltools.n();
        this.f183808c3 = new com.tencent.mm.plugin.webview.modeltools.h();
        this.f183811d3 = new com.tencent.mm.plugin.webview.ui.tools.media.n0();
        this.f183817f3 = new com.tencent.mm.plugin.webview.ui.tools.fb(this);
        this.f183820g3 = false;
        this.f183826i3 = new com.tencent.mm.plugin.webview.ui.tools.jb(this);
        this.f183828j3 = new com.tencent.mm.plugin.webview.ui.tools.pb(this);
        this.f183830k3 = "";
        this.f183833l3 = "";
        this.f183839n3 = true;
        this.f183842o3 = 0;
        this.f183847p3 = new com.tencent.mm.plugin.webview.ui.tools.wc(this);
        this.f183850q3 = new com.tencent.mm.plugin.webview.ui.tools.bc(this);
        this.f183853r3 = -1;
        this.f183856s3 = null;
        this.f183859t3 = false;
        this.f183862u3 = new com.tencent.mm.plugin.webview.ui.tools.cc(this);
    }

    public static void W6(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, int i17) {
        com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter webViewSearchContentInputFooter = webViewUI.H;
        if (webViewSearchContentInputFooter == null || !webViewUI.X1) {
            return;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) webViewSearchContentInputFooter.getLayoutParams();
        if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i17) {
            marginLayoutParams.bottomMargin = i17;
            webViewUI.H.setLayoutParams(marginLayoutParams);
        }
        if (webViewUI.H.getVisibility() == 0) {
            i17 += webViewUI.H.getHeight();
        }
        com.tencent.mm.ui.widget.MMWebView mMWebView = webViewUI.f183815f;
        if (mMWebView == null) {
            return;
        }
        mMWebView.setPadding(mMWebView.getPaddingLeft(), webViewUI.f183815f.getPaddingTop(), webViewUI.f183815f.getPaddingRight(), i17);
        webViewUI.f183815f.post(new com.tencent.mm.plugin.webview.ui.tools.na(webViewUI));
    }

    public static java.lang.String X6(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, java.lang.String str) {
        webViewUI.getClass();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.lang.String str2 = webViewUI.L1.f181964y;
            if (str2 == null) {
                str2 = "";
            }
            if (!str2.endsWith(str)) {
                java.lang.String a17 = com.tencent.mm.pluginsdk.ui.tools.h9.a(webViewUI.L1.f181964y);
                if (a17 == null) {
                    a17 = "";
                }
                if (!a17.endsWith(com.tencent.mm.pluginsdk.ui.tools.h9.a(str))) {
                    java.lang.String c17 = xw4.b.c(webViewUI.L1.f181964y);
                    if (c17 == null) {
                        c17 = "";
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "processTitleFromKernal: urlHost: %s, title: %s", java.net.URLDecoder.decode(c17), str);
                    if (!com.tencent.mm.plugin.webview.luggage.util.g.d(str) && !str.startsWith("about:blank")) {
                        return str;
                    }
                }
            }
        }
        return "";
    }

    public static void Y6(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, com.tencent.xweb.WebView webView, java.lang.String str) {
        webViewUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "onWeixinReady when page commit");
        webViewUI.f183830k3 = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "onWeixinReady, inject url=%s", str);
        com.tencent.mm.plugin.webview.permission.w wVar = webViewUI.f183876z1;
        if (wVar != null) {
            webViewUI.e9(wVar.c());
        }
        webViewUI.K8(webViewUI.t8());
        webViewUI.a8(webViewUI.N1.containsKey(str) ? ((java.lang.Boolean) webViewUI.N1.get(str)).booleanValue() : webViewUI.T8());
        java.lang.Boolean bool = (java.lang.Boolean) webViewUI.Q1.get(str);
        if (bool == null || !bool.booleanValue()) {
            webViewUI.showOptionMenu(0, true);
        } else {
            webViewUI.showOptionMenu(0, false);
        }
        if (webViewUI.T && com.tencent.mm.sdk.platformtools.t8.K0(webViewUI.f183833l3)) {
            webViewUI.f183833l3 = webViewUI.L1.f181964y;
        }
    }

    public static void Z6(android.view.View view, int i17) {
        if (view == null) {
            return;
        }
        view.setSystemUiVisibility(i17 | view.getSystemUiVisibility());
    }

    private void g9() {
        if (this.K1 != null) {
            try {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("screen_orientation", this.A);
                this.K1.i(83, bundle);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUI", "ac_set_screen_orientation : " + e17.getMessage());
            }
        }
    }

    public int A7() {
        return (!(fp.h.c(21) && d8()) && com.tencent.mm.ui.bk.C()) ? -1 : -16777216;
    }

    public void A8(android.content.pm.ResolveInfo resolveInfo) {
        com.tencent.mm.plugin.webview.stub.v0 v0Var = this.K1;
        this.f183808c3.getClass();
        if (isFinishing()) {
            return;
        }
        java.lang.String x76 = x7();
        if (com.tencent.mm.sdk.platformtools.t8.K0(x76)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrowserChooserHelper", "open in browser fail, url is null");
            return;
        }
        if (v0Var != null) {
            try {
                x76 = v0Var.O3(x76);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BrowserChooserHelper", "showAndOpenInBrowser, getShareUrl, exception = %s", e17);
            }
        }
        if (!x76.startsWith("http://") && !x76.startsWith("https://")) {
            x76 = "http://".concat(x76);
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(x76));
        intent.putExtra("targeturl", x76);
        hx4.r.e(this, intent, resolveInfo);
    }

    public nw4.p2 B7() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x044b, code lost:
    
        r0 = 2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x044d A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r4v55, types: [com.tencent.mm.plugin.multitask.ui.base.MultiTaskViewPager] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void B8() {
        /*
            Method dump skipped, instructions count: 1127
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.WebViewUI.B8():void");
    }

    @Override // dy4.a
    public void C0(android.view.View view, int i17) {
        dy4.l lVar = this.E1;
        if (view == null) {
            view = this.f183815f;
        }
        lVar.C0(view, i17);
    }

    public com.tencent.mm.protocal.JsapiPermissionWrapper C7() {
        com.tencent.mm.plugin.webview.permission.w wVar;
        ex4.o oVar = this.E;
        if (!oVar.f257227c) {
            return this.L1.R.c();
        }
        com.tencent.mm.plugin.webview.core.e3 e3Var = oVar.f257240p;
        if (e3Var == null || (wVar = e3Var.R) == null) {
            return null;
        }
        return wVar.c();
    }

    public void C8(java.util.concurrent.Callable callable) {
        java.lang.String j17 = gm0.j1.a() ? gm0.j1.b().j() : "MMWebViewTransShouldPullHalfScreenNotice";
        if (com.tencent.mm.sdk.platformtools.t8.K0(j17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUI", "kvName is null");
            return;
        }
        com.tencent.mm.sdk.platformtools.o4.R(j17).G("MMWebViewTransHasPullBefore", true);
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(getContext(), 2, 2);
        z2Var.q(getResources().getString(com.tencent.mm.R.string.l6y));
        z2Var.y(getResources().getString(com.tencent.mm.R.string.f490455vj));
        z2Var.x(1);
        android.widget.TextView textView = new android.widget.TextView(getContext());
        textView.setTextColor(getResources().getColor(com.tencent.mm.R.color.FG_0));
        textView.setText(getResources().getString(com.tencent.mm.R.string.l6x));
        z2Var.F = new com.tencent.mm.plugin.webview.ui.tools.wb(this, callable, z2Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "show trans notice");
        z2Var.j(textView);
        z2Var.C();
    }

    public final int D7() {
        if (i8()) {
            return 0;
        }
        int i17 = vj5.n.f437718k ? vj5.n.b(this).f437726e : 0;
        androidx.appcompat.app.b bVar = this.f183840o;
        if (bVar == null || !bVar.q()) {
            return i17;
        }
        int s76 = s7();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "getNewTopMargin mayReturnStatusBarHeight: %d, actionBarHeight: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(s76));
        return i17 + s76;
    }

    public void D8(android.os.Bundle bundle) {
        this.U2 = bundle.getInt("state", 0);
    }

    public java.lang.String E7() {
        return this.L1.f181809k1;
    }

    public void E8(java.lang.String str, android.graphics.drawable.Drawable drawable) {
        addIconOptionMenu(0, str, drawable, new com.tencent.mm.plugin.webview.ui.tools.ib(this, this.L1.t1(), getIntent().getStringExtra("srcUsername")));
    }

    @Override // al5.o2
    public void F3(int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.webview.ui.tools.ld ldVar = this.f183866w2;
        if (ldVar != null && !ldVar.f185650a && ldVar.f185654e != null) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(ldVar.f185657h)) {
                java.lang.String x76 = ldVar.f185654e.x7();
                if (x76 == null) {
                    x76 = "";
                }
                ldVar.f185657h = x76;
            }
            ldVar.f185656g.f181746i.setValue(java.lang.Integer.valueOf(i18));
            ldVar.m();
        }
        com.tencent.mm.plugin.webview.ui.tools.c4 c4Var = this.f183851r;
        if (c4Var == null || !c4Var.f184036g) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (c4Var.f184033d == 0) {
            c4Var.f184033d = currentTimeMillis;
            c4Var.f184034e = i18;
        }
        if (java.lang.Math.abs(currentTimeMillis - c4Var.f184033d) <= 200 || java.lang.Math.abs(i18 - c4Var.f184034e) <= c4Var.f184035f) {
            return;
        }
        int i28 = i18 - c4Var.f184034e;
        android.view.View view = c4Var.f184030a;
        if (i28 > 0 && view.getVisibility() == 0) {
            c4Var.b();
        } else if (i18 - c4Var.f184034e < 0 && view.getVisibility() != 0) {
            c4Var.c();
        }
        c4Var.f184033d = currentTimeMillis;
        c4Var.f184034e = i18;
    }

    public java.lang.String F7() {
        try {
            return com.tencent.mm.plugin.webview.core.r0.Q0.a(getIntent());
        } catch (java.lang.Exception unused) {
            finish();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v24, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v9, types: [android.view.View] */
    public void F8(boolean z17, boolean z18) {
        this.B = z17;
        vj5.h hVar = null;
        if (!z17) {
            this.f183875z.setVisibility(8);
            getWindow().clearFlags(1024);
            android.view.View decorView = getWindow().getDecorView();
            if (decorView != null) {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-5895));
            }
            androidx.appcompat.app.b bVar = this.f183840o;
            if (bVar != null) {
                bVar.L();
                if (this.W2 != null) {
                    L8(D7());
                }
            }
            ?? r66 = this.W2;
            vj5.h hVar2 = r66;
            if (r66 != 0) {
                while (true) {
                    if (!(hVar2 instanceof vj5.h)) {
                        java.lang.Object parent = hVar2.getParent();
                        if (parent == null || !(parent instanceof android.view.ViewGroup)) {
                            break;
                        } else {
                            hVar2 = (android.view.View) parent;
                        }
                    } else {
                        hVar = hVar2;
                        break;
                    }
                }
            }
            if (hVar != null) {
                hVar.s(false);
                return;
            }
            return;
        }
        androidx.appcompat.app.b bVar2 = this.f183840o;
        if (bVar2 != null) {
            bVar2.o();
        }
        if (this.W2 != null) {
            L8(0);
        }
        ?? r67 = this.W2;
        vj5.h hVar3 = r67;
        if (r67 != 0) {
            while (true) {
                if (!(hVar3 instanceof vj5.h)) {
                    java.lang.Object parent2 = hVar3.getParent();
                    if (parent2 == null || !(parent2 instanceof android.view.ViewGroup)) {
                        break;
                    } else {
                        hVar3 = (android.view.View) parent2;
                    }
                } else {
                    hVar = hVar3;
                    break;
                }
            }
        }
        if (hVar != null) {
            hVar.s(true);
        }
        getWindow().addFlags(1024);
        android.view.View decorView2 = getWindow().getDecorView();
        decorView2.setOnSystemUiVisibilityChangeListener(new com.tencent.mm.plugin.webview.ui.tools.ra(this, decorView2));
        Z6(decorView2, 5894);
        if (!z18) {
            this.f183875z.setVisibility(8);
        } else {
            this.f183875z.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.sa(this));
            this.f183875z.setVisibility(0);
        }
    }

    public java.lang.String G7() {
        return this.P;
    }

    public final void G8(java.lang.String str) {
        android.view.ViewGroup viewGroup = this.mWrappingFrame;
        if (viewGroup instanceof com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout) {
            com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout edgeToEdgeWrapperLayout = (com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout) viewGroup;
            al5.q navigationBarStrategy = edgeToEdgeWrapperLayout.getNavigationBarStrategy();
            boolean n76 = n7(str);
            al5.q qVar = n76 ? al5.q.f5988d : al5.q.f5989e;
            if (navigationBarStrategy != qVar) {
                edgeToEdgeWrapperLayout.setNavigationBarStrategy(qVar);
                edgeToEdgeWrapperLayout.M();
            }
            this.H1.a(this.f183815f, n76);
        }
    }

    public java.lang.String H7() {
        return this.L1.f181916a.getSettings().g();
    }

    public void H8(int i17) {
        this.f183844p0.j("sendAppMessage", true);
        this.f183844p0.j0(this.f183849q2.v(), i17);
        this.f183835m2.j("mm_send_friend_count");
    }

    public com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView I7() {
        if (this.S2 == null) {
            com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView = new com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView(this, null);
            this.S2 = mPVideoPlayFullScreenView;
            mPVideoPlayFullScreenView.setVisibility(8);
            android.view.ViewParent viewParent = (android.view.ViewParent) getWindow().getDecorView();
            if (viewParent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) viewParent).addView(this.S2, new android.widget.FrameLayout.LayoutParams(-1, -1));
            }
        }
        return this.S2;
    }

    public void I8(boolean z17) {
        android.widget.TextView textView;
        if (la5.b.f317600a.g(true)) {
            androidx.appcompat.app.b bVar = this.f183840o;
            android.view.View j17 = bVar == null ? null : bVar.j();
            if (z17) {
                this.f183839n3 = isOptionMenuShow(0);
                this.f183842o3 = j17 != null ? j17.getVisibility() : 0;
                showOptionMenu(0, false);
                if (j17 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(4);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(j17, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "setAccessibilityFocusable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    j17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(j17, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "setAccessibilityFocusable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                showOptionMenu(0, this.f183839n3);
                if (j17 != null) {
                    int i17 = this.f183842o3;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(java.lang.Integer.valueOf(i17));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(j17, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "setAccessibilityFocusable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    j17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(j17, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "setAccessibilityFocusable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            com.tencent.mm.plugin.webview.ui.tools.s7 s7Var = this.f183804a3;
            if (s7Var == null || (textView = s7Var.f186861o) == null) {
                return;
            }
            fq1.e eVar = fq1.e.f265507a;
            if (!z17) {
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                n3.u0.s(textView, 1);
            } else {
                java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
                n3.u0.s(textView, 2);
            }
        }
    }

    public int J7() {
        if (com.tencent.mm.ui.b4.c(this)) {
            try {
                int[] iArr = {0, 0};
                this.f183815f.getLocationInWindow(iArr);
                return iArr[1];
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewUI", e17, "getWVTopOffset getLocationInWindow failed", new java.lang.Object[0]);
            }
        }
        if (this.f183815f != null) {
            return (getWindow().getDecorView().getMeasuredHeight() - this.f183815f.getMeasuredHeight()) - com.tencent.mm.ui.bl.c(this);
        }
        return 0;
    }

    public void J8(int i17) {
        android.graphics.drawable.Drawable mutate = getResources().getDrawable(r7()).mutate();
        mutate.setColorFilter(i17, android.graphics.PorterDuff.Mode.SRC_IN);
        updateBackBtn(mutate);
    }

    public android.view.ViewGroup K7() {
        com.tencent.mm.plugin.webview.ui.tools.l3 l3Var = this.D1;
        if (l3Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUI", "getWalletKeyboard error, walletHelper is null");
            return null;
        }
        if (l3Var.f185632f == null) {
            android.view.View findViewById = l3Var.c().findViewById(com.tencent.mm.R.id.f487768ps1);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById;
            viewGroup.setVisibility(0);
            l3Var.f185632f = ((ps4.g) ((o05.l) i95.n0.c(o05.l.class))).wi(l3Var.c(), viewGroup, new com.tencent.mm.plugin.webview.ui.tools.k3(l3Var));
        }
        return l3Var.f185632f;
    }

    public void K8(boolean z17) {
        com.tencent.mm.plugin.webview.ui.tools.c4 c4Var = this.f183851r;
        if (c4Var != null) {
            c4Var.f184036g = z17;
            if (z17) {
                c4Var.c();
            } else {
                c4Var.b();
            }
        }
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f183815f;
        if (mMWebView == null || this.f183854s == null) {
            return;
        }
        this.f183857t.setEnabled(mMWebView.canGoBack());
        android.widget.ImageButton imageButton = this.f183860u;
        com.tencent.mm.ui.widget.MMWebView mMWebView2 = this.f183815f;
        imageButton.setEnabled(mMWebView2 != null && mMWebView2.canGoForward());
    }

    public synchronized com.tencent.xweb.s0 L7() {
        if (this.f183869x1 == null) {
            this.f183869x1 = new al5.n2(new com.tencent.mm.plugin.webview.ui.tools.tc(this));
        }
        return this.f183869x1;
    }

    public final void L8(int i17) {
        if (isFragmentMode() || i17 == this.W2.getPaddingTop()) {
            return;
        }
        this.W2.setPadding(0, i17, 0, 0);
    }

    public vx4.d M7() {
        return this.F2;
    }

    public void M8(boolean z17) {
        this.B1 = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "setForbidResponseKbStateWhenInActive:" + z17);
    }

    public boolean N7() {
        return false;
    }

    public void N8(android.os.Bundle bundle) {
    }

    public com.tencent.mm.plugin.webview.ui.tools.widget.z5 O7() {
        if (this.R2 == null) {
            com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var = new com.tencent.mm.plugin.webview.ui.tools.widget.z5(this, false, new com.tencent.mm.ui.xb(getContext(), com.tencent.mm.R.style.f494131f2), null);
            this.R2 = z5Var;
            z5Var.setVisibility(8);
            android.view.ViewParent viewParent = (android.view.ViewParent) getWindow().getDecorView();
            if (viewParent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) viewParent).addView(this.R2, new android.widget.FrameLayout.LayoutParams(-1, -1));
                com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var2 = this.R2;
                z5Var2.getClass();
                z5Var2.f187630x.setOnkbdStateListener(new com.tencent.mm.plugin.webview.ui.tools.widget.w5(z5Var2));
                int intExtra = getIntent().getIntExtra(com.tencent.mm.ui.w2.f211197j, -1);
                int intExtra2 = getIntent().getIntExtra("KOpenArticleSceneFromScene", -1);
                int intExtra3 = getIntent().getIntExtra(com.tencent.mm.ui.w2.f211194g, -1);
                com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var3 = this.R2;
                java.lang.String F7 = F7();
                java.lang.String charSequence = getTitle().toString();
                z5Var3.R = intExtra2;
                z5Var3.S = intExtra3;
                z5Var3.T = intExtra;
                z5Var3.U = 0;
                z5Var3.P = F7;
                z5Var3.Q = charSequence;
            }
        }
        return this.R2;
    }

    public void O8(android.os.Bundle bundle) {
        if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).p(F7())) {
            bundle.putInt("_DATA_CENTER_ITEM_SHOW_TYPE", this.Q);
        }
    }

    public void P7() {
        if (this.f183815f == null) {
            return;
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(x7());
        if (!this.W1 || K0) {
            if (this.f183815f.canGoBack()) {
                o8();
            } else {
                com.tencent.mm.plugin.webview.ui.tools.t7.f186896i.a();
                finish();
            }
        }
    }

    public void P8(int i17) {
        vj5.a.a(getContentView(), i17, !com.tencent.mm.ui.uk.g(i17));
    }

    @Override // dy4.c
    public void Q3(sf.e eVar) {
        this.E1.Q3(eVar);
    }

    public void Q7(int i17, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "handleEmojiStoreAction");
    }

    public void Q8(int i17, boolean z17) {
        u75.d.g();
        P8(i17);
        android.view.Window window = getWindow();
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        window.getDecorView().setSystemUiVisibility(z17 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
    }

    public void R7(int i17, android.os.Bundle bundle) {
    }

    public final void R8(boolean z17, boolean z18) {
        enableOptionMenu(z17);
        setProgressBarIndeterminateVisibility(false);
        if (!z18) {
            if (this.f183803a2 || this.f183805b2) {
                return;
            }
            this.L1.w0();
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var = this.f183849q2;
        if (c6Var.G) {
            c6Var.F = false;
            c6Var.c().f183820g3 = false;
            c6Var.G = false;
            if (c6Var.C()) {
                c6Var.g0();
            }
        }
    }

    public void S7(android.os.Bundle bundle) {
        int i17;
        int i18;
        boolean z17 = false;
        if (bundle.getBoolean("set_navigation_bar_color_reset", false)) {
            com.tencent.mm.plugin.webview.ui.tools.ld ldVar = this.f183866w2;
            i17 = ldVar == null ? getResources().getColor(com.tencent.mm.R.color.aae) : ldVar.d();
            i18 = 255;
        } else {
            int i19 = bundle.getInt("set_navigation_bar_color_color");
            int i27 = bundle.getInt("set_navigation_bar_color_alpha");
            z17 = bundle.getBoolean("set_navigation_bar_color_titleAlphaAdjustment");
            i17 = i19;
            i18 = i27;
        }
        setActionbarColor((i17 & 16777215) | (i18 << 24));
        if (z17) {
            setTitleAlpha(i18 / 255.0f);
        }
        getController().N0();
    }

    public boolean S8() {
        return false;
    }

    public void T7() {
        android.widget.ProgressBar progressBar = this.f183843p;
        if (progressBar == null || progressBar.getVisibility() != 0) {
            return;
        }
        this.f183843p.setVisibility(8);
    }

    public final boolean T8() {
        boolean booleanExtra = getIntent().getBooleanExtra("forceHideShare", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("showShare", true);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "forceHideShare:%b: showShareBtn:%b", java.lang.Boolean.valueOf(booleanExtra), java.lang.Boolean.valueOf(booleanExtra2));
        return !booleanExtra && booleanExtra2;
    }

    public void U7() {
        if (this.f183865w != null) {
            hideVKB();
            this.f183865w.e(-2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean U8() {
        /*
            r4 = this;
            com.tencent.mm.plugin.webview.ui.tools.jc r0 = r4.R1
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1b
            java.lang.String r0 = r0.f184870a
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r3 == 0) goto L10
            r0 = r2
            goto L17
        L10:
            java.lang.String r3 = "true"
            boolean r0 = r0.equals(r3)
        L17:
            if (r0 == 0) goto L1b
            r0 = r1
            goto L1c
        L1b:
            r0 = r2
        L1c:
            if (r0 != 0) goto L1f
            return r2
        L1f:
            com.tencent.mm.ui.widget.dialog.i0 r0 = new com.tencent.mm.ui.widget.dialog.i0
            r0.<init>(r4)
            com.tencent.mm.ui.widget.dialog.a r2 = r0.f211821b
            r2.A = r1
            r2 = 2131774066(0x7f104a72, float:1.9179537E38)
            r0.g(r2)
            r2 = 2131774064(0x7f104a70, float:1.9179533E38)
            r0.e(r2)
            r2 = 2131774065(0x7f104a71, float:1.9179535E38)
            r0.f(r2)
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$c r2 = new com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$c
            r2.<init>()
            com.tencent.mm.ui.widget.dialog.a r3 = r0.f211821b
            r3.E = r2
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$d r2 = new com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$d
            r2.<init>()
            r3.F = r2
            com.tencent.mm.ui.widget.dialog.j0 r0 = r0.a()
            r4.S1 = r0
            r0.show()
            java.lang.String r0 = r4.F7()
            r2 = 25
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}
            com.tencent.mm.plugin.webview.model.x5.a(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.WebViewUI.U8():boolean");
    }

    @Override // dy4.a
    public boolean V() {
        return this.E1.V();
    }

    public void V7() {
        android.view.View view;
        if (this.f183867x == null || (view = this.f183845p1) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "hideScreenshotCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "hideScreenshotCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f183845p1.setBackground(null);
        this.f183867x.removeView(this.f183845p1);
        this.f183845p1 = null;
    }

    public void V8(java.lang.String str) {
        this.f183844p0.j(com.google.android.gms.common.Scopes.PROFILE, true);
        nw4.n nVar = this.f183844p0;
        if (!nVar.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onGoProfile fail, not ready");
            return;
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = nVar.f340892f;
        if (n3Var != null) {
            n3Var.post(new nw4.m0(nVar, str));
        }
    }

    public void W7() {
        if (this.F == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "keyboard hide hideWebPlusKeyBoard");
        this.F.b();
    }

    public void W8() {
        if (hy4.i.q(x7()) || (this.f183843p != null && i8())) {
            this.f183843p.setVisibility(0);
            this.f183803a2 = true;
        }
    }

    public final java.lang.Boolean X7() {
        if (this.C) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "hold on swipe back");
            this.C = false;
            nw4.n nVar = this.f183844p0;
            if (nVar != null) {
                if (nVar.f340895i) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("userHasGoBack", java.lang.Boolean.TRUE);
                    com.tencent.mm.sdk.platformtools.u3.h(new nw4.o0(nVar, nw4.x2.c("onUserGoBack", hashMap, nVar.f340903q, nVar.f340904r)));
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "not ready");
                }
                return java.lang.Boolean.TRUE;
            }
        }
        return java.lang.Boolean.FALSE;
    }

    public void X8() {
        this.f183849q2.g0();
    }

    public void Y7() {
        int intExtra = getIntent().getIntExtra("webview_bg_color_rsID", -1);
        if (hy4.i.q(x7())) {
            intExtra = com.tencent.mm.R.color.aae;
        }
        com.tencent.mm.plugin.webview.ui.tools.s7 s7Var = this.f183804a3;
        if (intExtra != -1 && getContentView() != null) {
            setBackGroundColorResource(intExtra);
            getContentView().setBackgroundResource(intExtra);
            this.f183815f.setBackgroundColor(0);
            this.f183865w.setBackgroundResource(android.R.color.transparent);
            this.f183867x.setBackgroundResource(android.R.color.transparent);
            android.view.View view = s7Var.f186859m;
            if (view != null) {
                view.setBackgroundColor(0);
            }
        } else if (getIntent().getBooleanExtra(com.tencent.mm.ui.w2.f211205r, false)) {
            this.f183815f.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478553an));
        } else {
            this.f183815f.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        }
        if (i8()) {
            s7Var.getClass();
            java.lang.String str = com.tencent.mm.sdk.platformtools.a9.f192463a;
            yp5.a.f464409a.a();
            s7Var.f186863q = true;
            s7Var.b();
        }
    }

    public int Y8() {
        com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter webViewRedesignInputFooter = this.F;
        if (webViewRedesignInputFooter == null) {
            return 0;
        }
        webViewRedesignInputFooter.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewInputFooter", "showSmileyOnly");
        webViewRedesignInputFooter.setVisibility(0);
        android.view.View view = webViewRedesignInputFooter.f187302q;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter", "showSmileyOnly", "()I", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter", "showSmileyOnly", "()I", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        webViewRedesignInputFooter.f187308w = true;
        webViewRedesignInputFooter.f187295g = 1;
        return webViewRedesignInputFooter.j();
    }

    public void Z7() {
        if (getIntent() != null && getIntent().hasExtra("show_full_screen")) {
            F8(getIntent().getBooleanExtra("show_full_screen", false), true);
        }
    }

    public void Z8(android.os.Bundle bundle) {
        androidx.appcompat.app.AppCompatActivity context = getContext();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.T2;
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String string = bundle != null ? bundle.getString("status") : null;
        if (string != null) {
            int hashCode = string.hashCode();
            if (hashCode != -1867169789) {
                hy4.h hVar = hy4.h.f286106a;
                if (hashCode != 336650556) {
                    if (hashCode == 1940070258 && string.equals("dismissloading")) {
                        if (u3Var != null && u3Var.isShowing()) {
                            u3Var.dismiss();
                        }
                    }
                } else if (string.equals("loading")) {
                    java.lang.String string2 = context.getString(com.tencent.mm.R.string.f490604zq);
                    kotlin.jvm.internal.o.f(string2, "getString(...)");
                    u3Var = hVar.a(string2, context, u3Var);
                }
                this.T2 = u3Var;
            }
            if (string.equals(ya.b.SUCCESS)) {
                db5.t7.h(context, bundle != null ? bundle.getString("wording") : null);
            }
        }
        u3Var = null;
        this.T2 = u3Var;
    }

    public boolean a7() {
        com.tencent.mm.plugin.webview.permission.w wVar = this.f183876z1;
        if (wVar == null || wVar.b() == null) {
            return false;
        }
        return (this.f183876z1.b().f192177d & 65536) > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a8(boolean r18) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.WebViewUI.a8(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a9(java.lang.String r35, java.lang.String r36, int r37, int r38, java.util.Map r39) {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.WebViewUI.a9(java.lang.String, java.lang.String, int, int, java.util.Map):void");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void addIconOptionMenu(int i17, int i18, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        if (!fp.h.c(21)) {
            super.addIconOptionMenu(i17, i18, onMenuItemClickListener);
            return;
        }
        android.graphics.drawable.Drawable drawable = b3.l.getDrawable(this, i18);
        if (drawable == null) {
            return;
        }
        if (d8()) {
            drawable.setColorFilter(-16777216, android.graphics.PorterDuff.Mode.SRC_ATOP);
        } else {
            com.tencent.mm.plugin.webview.ui.tools.ld ldVar = this.f183866w2;
            if (ldVar == null || ldVar.f185650a) {
                drawable.clearColorFilter();
            } else {
                drawable.setColorFilter(getResources().getColor(com.tencent.mm.R.color.FG_0), android.graphics.PorterDuff.Mode.SRC_ATOP);
            }
        }
        addIconOptionMenu(i17, getString(com.tencent.mm.R.string.w_), drawable, onMenuItemClickListener);
    }

    public void b7() {
        java.lang.String x76 = x7();
        r01.h0 h17 = this.f183846p2.h();
        boolean m76 = m7();
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f183815f;
        java.lang.String str = mMWebView == null ? "" : mMWebView.f211374w;
        java.util.Map map = hy4.o0.f286183a;
        if ((x76 == null || x76.length() == 0) || h17 == null) {
            return;
        }
        if (str == null || str.length() == 0) {
            return;
        }
        java.lang.String str2 = h17.f368100h;
        boolean z17 = str2.length() == 0;
        java.lang.String str3 = h17.f368101i;
        if (!z17) {
            if (!(str3.length() == 0)) {
                ((r01.l1) i95.n0.c(r01.l1.class)).getClass();
                if (com.tencent.mm.storage.z3.F3(str2)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WebViewRestorePageHelper", "photo account, ignore");
                    return;
                }
                if (hy4.i.l(x76)) {
                    if (m76) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewRestorePageHelper", "is in float window");
                        return;
                    }
                    java.util.Map map2 = hy4.o0.f286183a;
                    if (kotlin.jvm.internal.o.b(((java.util.LinkedHashMap) map2).get(str), x76)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewRestorePageHelper", "url already exists for key: " + str);
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebViewRestorePageHelper", "append start get service");
                    xs.k1 k1Var = (xs.k1) i95.n0.c(xs.k1.class);
                    if (k1Var == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.WebViewRestorePageHelper", "ISecRecoveryDataService is null, skip");
                        return;
                    }
                    hy4.o0.a(x76, str);
                    map2.put(str, x76);
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebViewRestorePageHelper", "append start register, url: " + x76 + ", key: " + str);
                    ((q04.y) k1Var).wi(str, 1, new hy4.n0(str2, str3, x76, h17));
                    return;
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.WebViewRestorePageHelper", "username or title is empty, username: " + str2 + ", title: " + str3);
    }

    public final void b8() {
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        boolean z17 = Bi != null && Bi.Y();
        if (j62.e.g().c(new com.tencent.mm.repairer.config.webview.RepairerConfigWebViewNewFloatBall()) == 0 || !z17) {
            return;
        }
        if (!((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).p(F7()) && this.f183877z2 == null) {
            this.f183877z2 = new com.tencent.mm.plugin.webview.ui.tools.floatball.n(((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Di() ? new gx4.a0(this) : new dp1.u(this), this.f183815f);
            java.lang.String stringExtra = getIntent().getStringExtra("float_ball_key");
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                this.f183877z2.b(56, com.tencent.mm.sdk.platformtools.w2.a(java.lang.String.format("web-%s", ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).m(F7()))));
            } else {
                this.f183877z2.b(56, stringExtra);
            }
            this.f183877z2.Z(F7());
            this.f183877z2.c0("rawUrl", F7());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        if (r1.startsWith("http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9) + "/") != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b9(java.lang.String r6) {
        /*
            r5 = this;
            com.tencent.mm.plugin.webview.ui.tools.floatball.w r0 = r5.f183874y2
            if (r0 == 0) goto L1b
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r6)
            if (r0 != 0) goto L1b
            com.tencent.mm.plugin.webview.ui.tools.floatball.w r0 = r5.f183874y2
            java.lang.String r1 = r5.F7()
            boolean r0 = r0.v0(r1)
            if (r0 != 0) goto L1b
            com.tencent.mm.plugin.webview.ui.tools.floatball.w r0 = r5.f183874y2
            r0.Z(r6)
        L1b:
            com.tencent.mm.plugin.webview.ui.tools.floatball.n r0 = r5.f183877z2
            if (r0 == 0) goto L3e
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r6)
            if (r0 != 0) goto L3e
            java.lang.Class<zq1.a0> r0 = zq1.a0.class
            lm0.a r0 = gm0.j1.s(r0)
            zq1.a0 r0 = (zq1.a0) r0
            java.lang.String r1 = r5.F7()
            yq1.z r0 = (yq1.z) r0
            boolean r0 = r0.p(r1)
            if (r0 != 0) goto L3e
            com.tencent.mm.plugin.webview.ui.tools.floatball.n r0 = r5.f183877z2
            r0.Z(r6)
        L3e:
            vx4.d r0 = r5.F2
            if (r0 == 0) goto L9c
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r6)
            if (r0 != 0) goto L9c
            vx4.d r0 = r5.F2
            java.lang.String r1 = r5.F7()
            r0.getClass()
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r1)
            if (r0 != 0) goto L94
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "https://"
            r0.<init>(r2)
            r2 = 2131769611(0x7f10390b, float:1.9170502E38)
            java.lang.String r3 = com.tencent.mm.sdk.platformtools.t9.a(r2)
            r0.append(r3)
            java.lang.String r3 = "/"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L92
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "http://"
            r0.<init>(r4)
            java.lang.String r2 = com.tencent.mm.sdk.platformtools.t9.a(r2)
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L94
        L92:
            r0 = 1
            goto L95
        L94:
            r0 = 0
        L95:
            if (r0 != 0) goto L9c
            vx4.d r0 = r5.F2
            r0.L(r6)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.WebViewUI.b9(java.lang.String):void");
    }

    public void c7(android.os.Bundle bundle) {
        com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var = this.R2;
        if (z5Var != null) {
            z5Var.t();
            z5Var.B.setText("");
        }
    }

    public final void c8() {
        if (this.f183874y2 != null) {
            return;
        }
        this.f183874y2 = new com.tencent.mm.plugin.webview.ui.tools.floatball.w(((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Di() ? new gx4.a0(this) : new dp1.u(this), this);
        java.lang.String stringExtra = getIntent().getStringExtra("float_ball_key");
        int i17 = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(F7()) ? 50 : 2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            this.f183874y2.b(i17, com.tencent.mm.sdk.platformtools.w2.a(java.lang.String.format("web-%s", ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).m(F7()))));
        } else {
            this.f183874y2.b(i17, stringExtra);
        }
        this.f183874y2.Z(F7());
        this.f183874y2.c0("rawUrl", F7());
        com.tencent.mm.plugin.webview.ui.tools.floatball.w wVar = this.f183874y2;
        wVar.t().f93087g = F7();
        wVar.g();
    }

    public final void c9(java.lang.String str) {
        if (this.f183864v2 == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        if (this.f183874y2 == null && this.F2 == null) {
            return;
        }
        if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).p(F7()) || this.f183864v2.getTitle().equals(str)) {
            return;
        }
        this.f183864v2.setTitle(str);
        if (m8()) {
            ((d73.i) i95.n0.c(d73.i.class)).Jc(this.f183864v2);
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean convertActivityFromTranslucent() {
        return getIntent().getBooleanExtra("convertActivityFromTranslucent", false);
    }

    public com.tencent.mm.ui.widget.MMWebView d7() {
        com.tencent.mm.plugin.webview.core.e3 c17;
        com.tencent.mm.ui.widget.MMWebView mMWebView;
        if (!com.tencent.mm.plugin.webview.ui.tools.floatball.h0.d()) {
            return !i9() ? al5.l2.a(this) : al5.l2.b(this);
        }
        java.lang.String stringExtra = getIntent().getStringExtra("float_ball_key");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) || (c17 = com.tencent.mm.plugin.webview.ui.tools.floatball.h0.f184201a.c(stringExtra)) == null || (mMWebView = c17.f181916a) == null || mMWebView.f211376y) {
            android.content.MutableContextWrapper mutableContextWrapper = new android.content.MutableContextWrapper(this);
            return !i9() ? al5.l2.a(mutableContextWrapper) : al5.l2.b(mutableContextWrapper);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "createWebView from cache floatBallKey=%s", stringExtra);
        if (mMWebView.getParent() != null) {
            ((android.view.ViewGroup) mMWebView.getParent()).removeView(mMWebView);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1553L, 21L, 1L, false);
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewUI", "createWebView wv has parent");
        }
        mMWebView.i(this);
        mMWebView.onShow();
        return mMWebView;
    }

    public boolean d8() {
        return !com.tencent.mm.sdk.platformtools.t8.K0(this.Z1) && this.Z1.equals("black");
    }

    public final void d9(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || str.startsWith("data:text/html;charset=utf-8")) {
            return;
        }
        com.tencent.mm.plugin.webview.core.e3 e3Var = this.L1;
        java.lang.String l07 = e3Var != null ? e3Var.l0() : "";
        java.lang.String str2 = l07 != null ? l07 : "";
        com.tencent.mm.plugin.webview.ui.tools.floatball.w wVar = this.f183874y2;
        if (wVar != null) {
            wVar.c0(com.tencent.mm.plugin.handoff.model.HandOffURL.KShareUrl, str2);
        }
        vx4.d dVar = this.F2;
        if (dVar != null) {
            dVar.C.set(2, str2);
        }
        if (!str2.isEmpty()) {
            str = str2;
        }
        if (this.f183864v2 == null || com.tencent.mm.sdk.platformtools.t8.K0(str) || this.f183864v2.getUrl().equals(str)) {
            return;
        }
        this.f183864v2.setUrl(str);
        if (m8()) {
            ((d73.i) i95.n0.c(d73.i.class)).Jc(this.f183864v2);
        }
    }

    public com.tencent.mm.plugin.webview.core.e3 e7() {
        com.tencent.mm.ui.widget.MMWebView mMWebView;
        boolean d17 = com.tencent.mm.plugin.webview.ui.tools.floatball.h0.d();
        hy4.l0 l0Var = this.G2;
        if (d17) {
            java.lang.String stringExtra = getIntent().getStringExtra("float_ball_key");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.idkeyStat(1553L, 1L, 1L, false);
                com.tencent.mm.plugin.webview.core.e3 c17 = com.tencent.mm.plugin.webview.ui.tools.floatball.h0.f184201a.c(stringExtra);
                if (c17 != null && (mMWebView = c17.f181916a) != null && !mMWebView.f211376y) {
                    g0Var.idkeyStat(1553L, 2L, 1L, false);
                    this.M1 = true;
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "createWebViewController from cache floatBallKey=%s", stringExtra);
                    c17.f181934j = l0Var;
                    return c17;
                }
                g0Var.idkeyStat(1553L, 3L, 1L, false);
            }
        }
        com.tencent.mm.plugin.webview.core.e3 e3Var = new com.tencent.mm.plugin.webview.core.e3(this.f183815f, this.f183835m2, new zg0.k2(new zg0.p2(getIntent()), getIntent().getBooleanExtra("key_trust_url", false), o7(), (f8() || e8()) ? false : true, getIntent().getBooleanExtra("neverGetA8Key", false), 0, false));
        if (!this.M1) {
            e3Var.E(this.f183847p3);
        }
        e3Var.f181934j = l0Var;
        e3Var.q0();
        return e3Var;
    }

    public boolean e8() {
        return false;
    }

    public final void e9(com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper) {
        if (jsapiPermissionWrapper != null) {
            if (jsapiPermissionWrapper.f(34)) {
                setMMSubTitle(com.tencent.mm.R.string.l8e);
                return;
            }
            if (jsapiPermissionWrapper.f(75)) {
                setMMSubTitle(com.tencent.mm.R.string.l8p);
                return;
            }
            by4.k kVar = this.f183841o2;
            if (kVar == null || !kVar.a()) {
                setMMSubTitle((java.lang.String) null);
            }
        }
    }

    public boolean f7() {
        return false;
    }

    public boolean f8() {
        return false;
    }

    public void f9() {
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var = this.f183849q2;
        if (c6Var.C()) {
            c6Var.g0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0093  */
    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void finish() {
        /*
            r5 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.tencent.mm.plugin.webview.core.e3 r2 = r5.L1
            if (r2 == 0) goto L10
            int r2 = r2.U()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L12
        L10:
            java.lang.String r2 = "null"
        L12:
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "MicroMsg.WebViewUI"
            java.lang.String r4 = "Call finish %s"
            com.tencent.mars.xlog.Log.i(r2, r4, r1)
            r5.hideVKB()
            com.tencent.mm.sdk.platformtools.n3 r1 = r5.Q2
            if (r1 == 0) goto L27
            r2 = 0
            r1.removeCallbacksAndMessages(r2)
        L27:
            r5.f183819g2 = r0
            boolean r1 = com.tencent.mm.plugin.webview.ui.tools.floatball.h0.d()
            if (r1 == 0) goto L50
            com.tencent.mm.plugin.webview.stub.v0 r1 = r5.K1
            if (r1 == 0) goto L50
            vx4.d r1 = r5.F2
            if (r1 == 0) goto L3f
            boolean r1 = r1.s()
            if (r1 == 0) goto L3f
            r1 = r0
            goto L40
        L3f:
            r1 = r3
        L40:
            if (r1 != 0) goto L4b
            boolean r1 = r5.m7()
            if (r1 == 0) goto L49
            goto L4b
        L49:
            r1 = r3
            goto L4c
        L4b:
            r1 = r0
        L4c:
            if (r1 == 0) goto L50
            r1 = r0
            goto L51
        L50:
            r1 = r3
        L51:
            com.tencent.mm.plugin.webview.core.e3 r2 = r5.L1
            if (r2 == 0) goto L5a
            r2.N0(r1)
            r2.L = r0
        L5a:
            com.tencent.mm.plugin.webview.ui.tools.floatball.w r1 = r5.f183874y2
            if (r1 == 0) goto L93
            boolean r1 = r1.s0()
            if (r1 == 0) goto L72
            ep1.m.e(r5)
            com.tencent.mm.plugin.webview.ui.tools.floatball.w r1 = r5.f183874y2
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$e r2 = new com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$e
            r2.<init>()
            r1.g0(r2)
            goto L8d
        L72:
            com.tencent.mm.plugin.webview.ui.tools.floatball.n r1 = r5.f183877z2
            if (r1 == 0) goto L8a
            boolean r1 = r1.k0()
            if (r1 == 0) goto L8a
            ep1.m.e(r5)
            com.tencent.mm.plugin.webview.ui.tools.floatball.n r1 = r5.f183877z2
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$f r2 = new com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$f
            r2.<init>()
            r1.g0(r2)
            goto L8d
        L8a:
            super.finish()
        L8d:
            com.tencent.mm.plugin.webview.ui.tools.floatball.w r1 = r5.f183874y2
            r1.p()
            goto L96
        L93:
            super.finish()
        L96:
            com.tencent.mm.plugin.webview.ui.tools.floatball.n r1 = r5.f183877z2
            if (r1 == 0) goto L9d
            r1.p()
        L9d:
            vx4.d r1 = r5.F2
            if (r1 == 0) goto La8
            boolean r1 = r1.a()
            if (r1 == 0) goto La8
            goto La9
        La8:
            r0 = r3
        La9:
            boolean r1 = com.tencent.mm.ui.bk.v0()
            if (r1 == 0) goto Lbc
            boolean r1 = com.tencent.mm.ui.bk.y()
            if (r1 == 0) goto Lbc
            if (r0 != 0) goto Lbc
            int r0 = com.tencent.mm.ui.uc.f211085h
            r5.overridePendingTransition(r3, r0)
        Lbc:
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "KPopUpTransition"
            boolean r0 = r0.getBooleanExtra(r1, r3)
            if (r0 == 0) goto Ld1
            r0 = 2130771992(0x7f010018, float:1.714709E38)
            r1 = 2130772150(0x7f0100b6, float:1.714741E38)
            r5.overridePendingTransition(r0, r1)
        Ld1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.WebViewUI.finish():void");
    }

    @Override // dy4.b
    public void g0(cy4.f fVar) {
        this.E1.g0(fVar);
    }

    @Override // dy4.c
    public void g6(sf.e eVar) {
        this.E1.g6(eVar);
    }

    public final void g7() {
        android.view.View view = this.f183868x0;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "dismissInputAlertToast", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "dismissInputAlertToast", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final boolean g8() {
        return this.B;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public int getActionBarHeightFromTheme() {
        return s7();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return this.E1.c() ? getRequestedOrientation() : this.A;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d9p;
    }

    public void h7(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "doHideMenuEntry ishide: %s", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f183815f;
        if (mMWebView == null) {
            return;
        }
        java.lang.String url = mMWebView.getUrl();
        java.util.HashMap hashMap = this.Q1;
        if (z17) {
            this.E2.c();
            showOptionMenu(0, false);
            hashMap.put(url, java.lang.Boolean.TRUE);
        } else {
            showOptionMenu(0, true);
            if (hashMap.containsKey(url)) {
                hashMap.remove(url);
            }
        }
    }

    public boolean h8() {
        return this.L1.F0;
    }

    public final void h9() {
        android.view.View view = this.T1;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        if (getResources().getConfiguration().orientation == 1) {
            android.widget.RelativeLayout relativeLayout = this.U1;
            if (relativeLayout != null) {
                relativeLayout.setPadding(0, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479723df), 0, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479657bu));
                return;
            }
            return;
        }
        android.widget.RelativeLayout relativeLayout2 = this.U1;
        if (relativeLayout2 != null) {
            relativeLayout2.setPadding(0, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), 0, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479729dl));
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.plugin.appbrand.widget.input.x4
    public void hideVKB() {
        super.hideVKB();
        this.A1 = true;
        this.f183853r3 = -2;
    }

    public final void i7() {
        if (this.f183822h2) {
            return;
        }
        android.content.Intent intent = getIntent();
        boolean booleanExtra = intent.getBooleanExtra("webview_invoke_launch_app_when_back", false);
        java.lang.String stringExtra = intent.getStringExtra("KAppId");
        java.lang.String stringExtra2 = intent.getStringExtra("webview_invoke_launch_app_ext_info_when_back");
        if (!booleanExtra || stringExtra == null || stringExtra.length() <= 0 || stringExtra2 == null || stringExtra2.length() <= 0) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", stringExtra);
        bundle.putString("extInfo", stringExtra2);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.pluginsdk.model.app.l3.class, null);
    }

    public boolean i8() {
        com.tencent.mm.plugin.webview.ui.tools.r3 r3Var = this.f183870x2;
        if (r3Var == null) {
            return false;
        }
        com.tencent.mm.plugin.webview.ui.tools.j3 j3Var = r3Var.f186806b;
        return j3Var.f184852a || j3Var.f184854c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        if (r2.endsWith("." + r8) != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060 A[Catch: Exception -> 0x006f, LOOP:0: B:7:0x002e->B:19:0x0060, LOOP_END, TryCatch #0 {Exception -> 0x006f, blocks: (B:6:0x000e, B:8:0x0030, B:10:0x0038, B:13:0x003f, B:15:0x0045, B:24:0x0067, B:19:0x0060), top: B:5:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean i9() {
        /*
            r11 = this;
            java.lang.String r0 = "MicroMsg.WebViewUI"
            java.lang.String r1 = r11.F7()
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.K0(r1)
            r3 = 0
            if (r2 == 0) goto Le
            return r3
        Le:
            java.net.URI r2 = java.net.URI.create(r1)     // Catch: java.lang.Exception -> L6f
            java.lang.String r4 = "useSysWebView, rawUrl:%s, host:"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L6f
            r5[r3] = r1     // Catch: java.lang.Exception -> L6f
            java.lang.String r6 = r2.getHost()     // Catch: java.lang.Exception -> L6f
            r7 = 1
            r5[r7] = r6     // Catch: java.lang.Exception -> L6f
            com.tencent.mars.xlog.Log.i(r0, r4, r5)     // Catch: java.lang.Exception -> L6f
            java.lang.String[] r4 = hy4.p0.f286185a     // Catch: java.lang.Exception -> L6f
            java.lang.String r2 = r2.getHost()     // Catch: java.lang.Exception -> L6f
            java.lang.String[] r4 = hy4.p0.f286185a     // Catch: java.lang.Exception -> L6f
            int r5 = r4.length     // Catch: java.lang.Exception -> L6f
            r6 = r3
        L2e:
            if (r6 >= r5) goto L63
            r8 = r4[r6]     // Catch: java.lang.Exception -> L6f
            boolean r9 = com.tencent.mm.sdk.platformtools.t8.K0(r2)     // Catch: java.lang.Exception -> L6f
            if (r9 != 0) goto L5b
            boolean r9 = com.tencent.mm.sdk.platformtools.t8.K0(r8)     // Catch: java.lang.Exception -> L6f
            if (r9 == 0) goto L3f
            goto L5b
        L3f:
            boolean r9 = r2.equals(r8)     // Catch: java.lang.Exception -> L6f
            if (r9 != 0) goto L59
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6f
            java.lang.String r10 = "."
            r9.<init>(r10)     // Catch: java.lang.Exception -> L6f
            r9.append(r8)     // Catch: java.lang.Exception -> L6f
            java.lang.String r8 = r9.toString()     // Catch: java.lang.Exception -> L6f
            boolean r8 = r2.endsWith(r8)     // Catch: java.lang.Exception -> L6f
            if (r8 == 0) goto L5b
        L59:
            r8 = r7
            goto L5c
        L5b:
            r8 = r3
        L5c:
            if (r8 == 0) goto L60
            r2 = r7
            goto L64
        L60:
            int r6 = r6 + 1
            goto L2e
        L63:
            r2 = r3
        L64:
            if (r2 == 0) goto L67
            return r3
        L67:
            boolean r0 = com.tencent.xweb.a3.q(r1)     // Catch: java.lang.Exception -> L6f
            if (r0 != 0) goto L6e
            return r7
        L6e:
            return r3
        L6f:
            r1 = move-exception
            java.lang.String r2 = "useSysWebView exception"
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r1, r2, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.WebViewUI.i9():boolean");
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public void initActivityCloseAnimation() {
        vx4.d dVar = this.F2;
        boolean z17 = dVar != null && dVar.a();
        if (com.tencent.mm.ui.bk.v0() && com.tencent.mm.ui.bk.y() && !z17) {
            overridePendingTransition(0, com.tencent.mm.ui.uc.f211085h);
        } else {
            super.initActivityCloseAnimation();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity
    public void initSwipeBack() {
        super.initSwipeBack();
        if (getSwipeBackLayout() == null) {
            return;
        }
        this.X1 = true;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f183865w = (com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout) findViewById(com.tencent.mm.R.id.pil);
        if (getIntent() != null && this.f183865w != null) {
            this.f183865w.setFixApplyWindow(getIntent().getBooleanExtra("KFixKeyBoardLayoutApplyWindow", false));
        }
        this.f183867x = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.m7j);
        this.W = getIntent().getBooleanExtra("finishviewifloadfailed", false);
        this.T = getIntent().getBooleanExtra("is_favorite_item", false);
        this.S = getIntent().getBooleanExtra("isWebwx", true);
        boolean booleanExtra = getIntent().getBooleanExtra("show_feedback", false);
        getIntent().getStringExtra("sentUsername");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (booleanExtra) {
            addTextOptionMenu(1, getString(com.tencent.mm.R.string.f493040ir4), new com.tencent.mm.plugin.webview.ui.tools.ta(this));
        }
        this.f183843p = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.cma);
        if (i8() && this.f183870x2.f186806b.f184853b) {
            try {
                this.f183843p.setIndeterminateDrawable(getResources().getDrawable(com.tencent.mm.R.drawable.avq));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUI", "%s", e17.getMessage());
            }
        }
        this.T1 = findViewById(com.tencent.mm.R.id.lr_);
        this.V1 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pir);
        this.U1 = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.lra);
        android.widget.TextView textView = this.V1;
        if (textView != null) {
            com.tencent.mm.ui.bk.s0(textView.getPaint());
            this.V1.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.vb(this));
        }
        if (this.S) {
            java.lang.String stringExtra = getIntent().getStringExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            java.lang.String str = stringExtra != null ? stringExtra : "";
            if (str.length() > 0) {
                this.f183809d = true;
            }
            this.f183812e = getIntent().getBooleanExtra("key_show_web_page_title", false);
            setMMTitle((java.lang.CharSequence) str);
        } else {
            setMMTitle("");
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.pho);
        this.f183854s = findViewById;
        if (findViewById != null) {
            this.f183851r = new com.tencent.mm.plugin.webview.ui.tools.c4(findViewById, this.f183865w, this.f183815f);
            android.view.View view = this.f183854s;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "initBottomNavigator", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "initBottomNavigator", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.ImageButton imageButton = (android.widget.ImageButton) findViewById(com.tencent.mm.R.id.phk);
            this.f183857t = imageButton;
            imageButton.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.tb(this));
            android.widget.ImageButton imageButton2 = (android.widget.ImageButton) findViewById(com.tencent.mm.R.id.phn);
            this.f183860u = imageButton2;
            imageButton2.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.ub(this));
        }
        if (this.f183815f == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "initView viewWV is null");
            finish();
            return;
        }
        if (f183797v3 == android.webkit.WebSettings.RenderPriority.NORMAL) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "initView, set render priority to HIGH");
            this.f183815f.getSettings().K(android.webkit.WebSettings.RenderPriority.HIGH);
            f183797v3 = android.webkit.WebSettings.RenderPriority.HIGH;
        }
        android.view.View contentView = getContentView();
        com.tencent.mm.plugin.webview.ui.tools.s7 s7Var = this.f183804a3;
        s7Var.getClass();
        s7Var.f186849c = (com.tencent.mm.plugin.webview.ui.tools.LogoWebViewWrapper) contentView.findViewById(com.tencent.mm.R.id.ipl);
        s7Var.f186848b = (android.widget.ImageView) contentView.findViewById(com.tencent.mm.R.id.pio);
        android.view.View findViewById2 = contentView.findViewById(com.tencent.mm.R.id.pim);
        s7Var.f186859m = findViewById2;
        if (findViewById2 != null) {
            android.view.View findViewById3 = findViewById2.findViewById(com.tencent.mm.R.id.piq);
            s7Var.f186860n = findViewById3;
            s7Var.f186861o = (android.widget.TextView) findViewById3.findViewById(com.tencent.mm.R.id.pip);
        }
        s7Var.f186850d = com.tencent.mm.sdk.platformtools.j.d(s7Var.f186849c.getContext(), 72);
        android.widget.ImageView imageView = s7Var.f186848b;
        if (imageView != null) {
            java.lang.String.valueOf(imageView.getId());
        }
        com.tencent.mm.plugin.webview.ui.tools.LogoWebViewWrapper logoWebViewWrapper = s7Var.f186849c;
        if (logoWebViewWrapper != null) {
            java.lang.String.valueOf(logoWebViewWrapper.getId());
        }
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f183815f;
        s7Var.getClass();
        mMWebView.F0();
        com.tencent.mm.plugin.webview.ui.tools.LogoWebViewWrapper logoWebViewWrapper2 = s7Var.f186849c;
        logoWebViewWrapper2.getWebViewContainer();
        android.widget.FrameLayout frameLayout = logoWebViewWrapper2.f183606e;
        if (frameLayout != null) {
            logoWebViewWrapper2.f183605d = mMWebView;
            frameLayout.addView(mMWebView);
        }
        if (mMWebView.isXWalkKernel()) {
            s7Var.f186862p = true;
        } else {
            s7Var.f186862p = false;
        }
        if (!s7Var.f186862p || s7Var.f186863q) {
            s7Var.e(true);
        } else {
            s7Var.e(false);
            s7Var.g();
        }
        Y7();
        this.f183871y = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.cg7);
        this.f183815f.setWebViewClientExtension(new com.tencent.mm.plugin.webview.ui.tools.l(this));
        this.f183815f.setWebViewCallbackClient(this.L2);
        this.G = findViewById(com.tencent.mm.R.id.pij);
        com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter webViewRedesignInputFooter = (com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter) findViewById(com.tencent.mm.R.id.pib);
        this.F = webViewRedesignInputFooter;
        if (webViewRedesignInputFooter != null) {
            webViewRedesignInputFooter.setInputShadowView(this.G);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "keyboard init hide");
            this.F.b();
            this.F.setOnTextSendListener(new com.tencent.mm.plugin.webview.ui.tools.ua(this));
            this.F.setOnSmileyChosenListener(new com.tencent.mm.plugin.webview.ui.tools.va(this));
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter webViewSearchContentInputFooter = (com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter) findViewById(com.tencent.mm.R.id.mdt);
        this.H = webViewSearchContentInputFooter;
        if (webViewSearchContentInputFooter != null) {
            webViewSearchContentInputFooter.setActionDelegate(new com.tencent.mm.plugin.webview.ui.tools.wa(this));
            this.f183815f.setFindListener(new com.tencent.mm.plugin.webview.ui.tools.xa(this));
        }
        this.f183875z = (com.tencent.mm.plugin.webview.ui.tools.widget.MovingImageButton) findViewById(com.tencent.mm.R.id.gh6);
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.pi9);
        this.f183868x0 = findViewById4;
        if (findViewById4 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById4, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f183815f.setWebChromeClient(L7());
        this.f183815f.setDownloadListener(new com.tencent.mm.plugin.webview.ui.tools.ya(this));
        this.f183815f.requestFocus(130);
        this.f183815f.setOnTouchListener(new com.tencent.mm.plugin.webview.ui.tools.ab(this));
        this.f183815f.G0();
        setBackBtn(new com.tencent.mm.plugin.webview.ui.tools.cb(this), r7());
        if (r8()) {
            this.f183865w.setOnkbdStateListener(new com.tencent.mm.plugin.webview.ui.tools.qb(this));
        }
        this.f183834m = (com.tencent.mm.ui.base.MMFalseProgressBar) findViewById(com.tencent.mm.R.id.phm);
        this.f183837n = new com.tencent.mm.plugin.scanner.MultiCodeMaskView(this);
        this.f183837n.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.f183837n.setVisibility(8);
        ((android.view.ViewGroup) getWindow().getDecorView()).addView(this.f183837n);
        super.setTitleBarDoubleClickListener(new com.tencent.mm.plugin.webview.ui.tools.db(this));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity
    public boolean isContentAtTop() {
        return this.f183815f.getWebScrollY() == 0;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    /* renamed from: isSupportNavigationSwipeBack */
    public boolean getF65848t() {
        if (!getIntent().getBooleanExtra("hide_close_btn", false)) {
            return super.getF65848t();
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.WebViewUI", "Close and return are not allowed");
        return false;
    }

    public final void j7(boolean z17) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.A(1009, z17 ? 230 : com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR);
        android.os.Bundle extras = getIntent().getExtras();
        if (extras.getBoolean("renderRecoverMode", false)) {
            g0Var.A(1009, z17 ? 232 : 235);
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUI", "WebView-Trace RenderProcessGone, will not open new page to recover");
            return;
        }
        g0Var.A(1009, z17 ? 231 : 234);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "WebView-Trace RenderProcessGone do , will not open new page to recover");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtras(extras);
        if (z17) {
            intent.putExtra("renderRecoverMode", true);
        }
        j45.l.j(this, "webview", ".ui.tools.WebViewUI", intent, null);
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.webview.ui.tools.dc dcVar = new com.tencent.mm.plugin.webview.ui.tools.dc(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(dcVar, 100L, false);
    }

    public boolean j8() {
        if (this.B || this.E1.c()) {
            return true;
        }
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.S2;
        if (mPVideoPlayFullScreenView != null) {
            if (mPVideoPlayFullScreenView.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public void j9(android.os.Bundle bundle) {
        if (bundle != null) {
            "black".equals(bundle.getString("style"));
            O7().setCommentTopicId(bundle.getLong("commentTopicId"));
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.z5 O7 = O7();
        java.lang.String x76 = x7();
        O7.getClass();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(x76)) {
            O7.P = x76;
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.z5 O72 = O7();
        O72.s(1);
        O72.p(false);
        O72.x(false);
    }

    public void k7() {
        android.view.View view = this.f183815f.getView();
        view.scrollTo(view.getScrollX(), 0);
        com.tencent.mm.plugin.webview.model.x5.a(F7(), 7);
    }

    public boolean k8() {
        com.tencent.mm.plugin.webview.ui.tools.r3 r3Var = this.f183870x2;
        return r3Var != null && r3Var.f186806b.f184854c;
    }

    public void k9(android.os.Bundle bundle) {
        if (bundle != null) {
            O7().setCommentTopicId(bundle.getLong("commentTopicId"));
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.z5 O7 = O7();
        java.lang.String x76 = x7();
        O7.getClass();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(x76)) {
            O7.P = x76;
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.z5 O72 = O7();
        java.lang.String replyContent = bundle.getString("reply_content");
        int i17 = bundle.getInt("personal_comment_id");
        O72.getClass();
        kotlin.jvm.internal.o.g(replyContent, "replyContent");
        O72.s(2);
        O72.p(false);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(replyContent) && i17 != 0) {
            if (!O72.f187625l1) {
                O72.f187627p1 = true;
                O72.f187625l1 = true;
            }
            if (O72.f187627p1) {
                O72.w(replyContent, i17, false);
                O72.x(false);
                return;
            }
        }
        O72.s(1);
        O72.p(false);
        O72.x(false);
    }

    public boolean l7() {
        boolean z17 = false;
        if (getClass().equals(com.tencent.mm.plugin.webview.ui.tools.WebViewUI.class) && !getIntent().getBooleanExtra("disable_minimize", false)) {
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "enableMinimize class:%s enable:%b", getClass(), java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public boolean l8() {
        java.lang.String j17 = gm0.j1.a() ? gm0.j1.b().j() : "MMWebViewTransShouldPullHalfScreenNotice";
        if (com.tencent.mm.sdk.platformtools.t8.K0(j17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUI", "kvName is null");
            return true;
        }
        boolean i17 = com.tencent.mm.sdk.platformtools.o4.R(j17).i("MMWebViewTransHasPullBefore", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "show trans notice before: %s", java.lang.Boolean.toString(i17));
        return i17;
    }

    public void l9(android.os.Bundle bundle) {
        if (bundle != null) {
            "black".equals(bundle.getString("style"));
            com.tencent.mm.plugin.webview.ui.tools.widget.z5 O7 = O7();
            O7.s(1);
            O7.p(false);
            O7.x(true);
        }
    }

    public final boolean m7() {
        com.tencent.mm.plugin.webview.ui.tools.floatball.w wVar;
        return ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Di() && (wVar = this.f183874y2) != null && wVar.u();
    }

    public boolean m8() {
        boolean booleanExtra = getIntent().getBooleanExtra("KRightBtn", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "enableMinimize:%b, banRightBtn %b", java.lang.Boolean.valueOf(l7()), java.lang.Boolean.valueOf(booleanExtra));
        return !booleanExtra && T8() && l7();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public boolean moveTaskToBack(boolean z17) {
        boolean moveTaskToBack = super.moveTaskToBack(z17);
        initActivityCloseAnimation();
        return moveTaskToBack;
    }

    public boolean n7(java.lang.String str) {
        return com.tencent.mm.ui.b4.c(this) && this.G1.a() && hy4.i.l(str);
    }

    public boolean n8() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public boolean needShowIdcError() {
        return false;
    }

    public boolean o7() {
        return true;
    }

    public void o8() {
        java.lang.System.currentTimeMillis();
        this.f183815f.goBack();
        com.tencent.mm.plugin.webview.ui.tools.t7 t7Var = com.tencent.mm.plugin.webview.ui.tools.t7.f186896i;
        if (com.tencent.mm.sdk.platformtools.t8.K0(t7Var.f186897a)) {
            return;
        }
        t7Var.c(5, "", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.WebViewUI.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mm.plugin.scanner.MultiCodeMaskView multiCodeMaskView = this.f183837n;
        if (multiCodeMaskView == null || multiCodeMaskView.getVisibility() != 0) {
            super.onBackPressed();
        } else {
            com.tencent.mm.plugin.webview.ui.tools.b5 b5Var = this.f183846p2;
            this.f183837n.d(b5Var != null ? b5Var.f183943k.longValue() : 0L, false);
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onCancel() {
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f183815f;
        if (mMWebView != null) {
            if (this.f183814e3) {
                mMWebView.setOnLongClickListener(this.f183817f3);
            } else {
                this.f183846p2.n();
            }
        }
        super.onCancel();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        int i17;
        super.onConfigurationChanged(configuration);
        if (this.X2 != configuration.orientation) {
            h9();
            com.tencent.mm.plugin.webview.ui.tools.floatball.v vVar = this.E2;
            vVar.getClass();
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.webview.ui.tools.floatball.u uVar = new com.tencent.mm.plugin.webview.ui.tools.floatball.u(this, vVar);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(uVar, 200L, false);
            try {
                i17 = android.content.res.Resources.getSystem().getIdentifier("action_bar_container", dm.i4.COL_ID, com.eclipsesource.mmv8.Platform.ANDROID);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUI", "get resId action_bar_container, exp = %s", e17);
                i17 = -1;
            }
            android.view.View findViewById = i17 > 0 ? findViewById(i17) : null;
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "getActionBarContainer, viewResId = %d, get view = %s", java.lang.Integer.valueOf(i17), findViewById);
            android.view.View view = findViewById != null ? (android.view.View) findViewById.getParent() : null;
            if (view == null) {
                return;
            }
            view.dispatchConfigurationChanged(configuration);
            view.requestLayout();
            this.X2 = configuration.orientation;
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra;
        java.lang.String stringExtra2;
        boolean z17 = hy4.l0.f286149q;
        hy4.l0 l0Var = this.G2;
        l0Var.f286166p = z17 ? 1 : 0;
        if (z17) {
            hy4.l0.f286149q = false;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.x2.f193072b + ":xweb_sandboxed_process_ex_0";
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.x2.f193072b + ":xweb_privileged_process_0";
        l0Var.f286163m = com.tencent.mm.sdk.platformtools.x2.o(str);
        l0Var.f286164n = com.tencent.xweb.a3.h() > 0;
        l0Var.f286165o = com.tencent.mm.sdk.platformtools.x2.o(str2);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long longExtra = getIntent().getLongExtra("startTime", 0L);
        l0Var.f286151a = longExtra;
        l0Var.f286154d = currentTimeMillis - longExtra;
        l0Var.f286161k = getIntent().getBooleanExtra("renderRecoverMode", false);
        com.tencent.mm.sdk.platformtools.b.c();
        z8(bundle);
        super.onCreate(bundle);
        this.F1 = j62.e.g().c(new com.tencent.mm.repairer.config.webview.RepairerConfigWebviewSaveScreenshotSide()) == 1;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        y8();
        long currentTimeMillis3 = java.lang.System.currentTimeMillis();
        this.L1.V.a("onUIInitStart", currentTimeMillis2);
        this.L1.V.a("onUIInitEnd", currentTimeMillis3);
        android.content.Intent intent = getIntent();
        if (com.tencent.mm.ui.bk.v0() && com.tencent.mm.ui.bk.y()) {
            overridePendingTransition(com.tencent.mm.ui.uc.f211082e, 0);
        }
        if (intent.hasExtra("nextAnimIn") || intent.hasExtra("currentAnimOut")) {
            overridePendingTransition(intent.getIntExtra("nextAnimIn", com.tencent.mm.R.anim.f477886ea), intent.getIntExtra("currentAnimOut", com.tencent.mm.R.anim.f477882e6));
        }
        if (intent.getBooleanExtra("KPopUpTransition", false)) {
            overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
        }
        if (getIntent() != null && getIntent().getBooleanExtra("key_enter_content_by_red_dot", false)) {
            com.tencent.mars.xlog.Log.i("ENTER_CONTENT_BY_RED_DOT", "Set result ok");
            setResult(-1, new android.content.Intent());
        }
        this.H2 = findViewById(com.tencent.mm.R.id.s3f);
        this.I2 = findViewById(com.tencent.mm.R.id.s3g);
        if (getIntent() == null) {
            stringExtra = null;
            stringExtra2 = null;
        } else {
            stringExtra = getIntent().getStringExtra("ad_ux_info_for_jsapi_pay");
            stringExtra2 = getIntent().getStringExtra("common_ux_info_for_jsapi_pay");
        }
        qp3.a.b("onActivityCreated-%s, adUxInfo=%s, commonUxInfo=%s", getClass(), stringExtra, stringExtra2);
        com.tencent.mm.plugin.webview.model.b6.l(0L);
        ((cy1.a) ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.WebViewUI)).ik(this, 8, 26451)).Ai(this, new com.tencent.mm.plugin.webview.ui.tools.ic(this, intent));
        if (j62.e.g().c(new com.tencent.mm.repairer.config.webview.RepairerConfigThirdPartyDisclaimer()) == 1) {
            by4.k kVar = new by4.k();
            this.f183841o2 = kVar;
            com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui("ilinkres_aea21419", "WebViewHostShowRuleJson");
            if (Ui != null) {
                ((ku5.t0) ku5.t0.f312615d).q(new by4.i(Ui, kVar));
                return;
            }
            com.tencent.wechat.aff.udr.q qVar = new com.tencent.wechat.aff.udr.q();
            qVar.c("ilinkres_aea21419");
            java.util.LinkedList linkedList = qVar.f217548e;
            if (linkedList != null) {
                linkedList.add("WebViewHostShowRuleJson");
            }
            ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Di(qVar, new by4.g(kVar));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onCreateBeforeSetContentView() {
        supportRequestWindowFeature(5);
        supportRequestWindowFeature(9);
        setProgressBarIndeterminateVisibility(false);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, androidx.activity.ComponentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        boolean onCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.Q2;
        java.lang.Runnable runnable = this.f183828j3;
        n3Var.removeCallbacks(runnable);
        this.Q2.postDelayed(runnable, 1000L);
        return onCreateOptionsMenu;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(86:1|(1:3)|4|(1:6)|7|(2:9|(2:11|(2:13|(1:15)(2:16|(1:18)(1:19)))(1:20)))|21|(1:25)|26|(4:28|(1:411)(1:32)|(1:410)(1:36)|(82:40|(1:42)(2:363|(1:409)(10:367|(3:404|(1:406)(1:408)|407)(3:373|(1:375)|376)|377|(1:379)|380|(3:382|(1:384)(1:387)|(1:386))|388|(1:403)(1:392)|(1:394)(2:396|(2:398|(1:402)))|395))|43|(3:45|(1:47)|48)|49|(3:53|(1:55)|56)|57|58|(4:60|(3:65|66|(2:68|(2:70|(1:64))))|62|(0))|73|(1:75)(1:362)|76|(6:78|(4:80|(7:83|(7:85|(1:87)|88|89|(3:91|(2:95|96)|97)|100|101)|127|103|(6:105|106|(1:108)(1:125)|109|(4:112|(3:114|115|(3:117|118|119)(1:121))(1:122)|120|110)|123)(1:126)|124|81)|128|129)|130|(2:133|131)|134|135)|136|(2:138|(1:142))(1:361)|143|(1:145)|146|(1:148)|149|(5:151|(1:155)|156|(1:158)|159)|160|(1:162)|163|(1:165)|166|(1:168)|169|(1:173)|174|(1:176)|177|(1:179)|180|(1:182)|183|(1:185)(1:360)|186|(1:188)|189|(1:191)|192|(3:194|(1:196)|197)|198|(2:202|(3:204|(1:206)|207))|208|(1:210)|211|(3:215|(1:217)|218)|219|(1:221)|222|(1:224)|225|(4:227|(1:229)|230|(1:232))|233|(4:235|236|(2:238|(1:240))(1:243)|241)|246|247|(1:249)|251|(1:253)|254|(3:256|(3:258|(1:260)|261)|262)(3:353|(2:356|354)|357)|263|(1:265)|266|(1:268)|269|(1:273)|274|(2:276|748)|290|291|292|(1:294)|296|(1:298)|299|(3:305|306|(4:312|(8:315|(4:319|320|322|316)|343|(6:324|325|326|(1:330)|(3:332|333|334)(1:336)|335)(1:340)|339|(0)(0)|335|313)|345|346))|349|350))|412|58|(0)|73|(0)(0)|76|(0)|136|(0)(0)|143|(0)|146|(0)|149|(0)|160|(0)|163|(0)|166|(0)|169|(2:171|173)|174|(0)|177|(0)|180|(0)|183|(0)(0)|186|(0)|189|(0)|192|(0)|198|(3:200|202|(0))|208|(0)|211|(4:213|215|(0)|218)|219|(0)|222|(0)|225|(0)|233|(0)|246|247|(0)|251|(0)|254|(0)(0)|263|(0)|266|(0)|269|(2:271|273)|274|(0)|290|291|292|(0)|296|(0)|299|(4:301|305|306|(1:308)(5:309|312|(1:313)|345|346))|349|350) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0339, code lost:
    
        if (r9.isEmpty() != false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x077d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x077e, code lost:
    
        com.tencent.mars.xlog.Log.w("MicroMsg.WebViewUI", "onDestroy contentView removeAllViews %s", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x066b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x066c, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUI", "webview on destroy callback mm exception [%s]", r0.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x060c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0655 A[Catch: Exception -> 0x066b, TRY_LEAVE, TryCatch #4 {Exception -> 0x066b, blocks: (B:247:0x0651, B:249:0x0655), top: B:246:0x0651 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0773 A[Catch: all -> 0x077d, TRY_LEAVE, TryCatch #6 {all -> 0x077d, blocks: (B:292:0x0766, B:294:0x0773), top: B:291:0x0766 }] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0813 A[Catch: Exception -> 0x085e, TryCatch #2 {Exception -> 0x085e, blocks: (B:306:0x07d3, B:309:0x07fe, B:312:0x0805, B:313:0x080d, B:315:0x0813, B:320:0x082a, B:324:0x0837, B:333:0x0853, B:341:0x082f, B:346:0x085b), top: B:305:0x07d3, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0853 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x080d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02c5  */
    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDestroy() {
        /*
            Method dump skipped, instructions count: 2152
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.WebViewUI.onDestroy():void");
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onDrag() {
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f183815f;
        if (mMWebView != null) {
            mMWebView.setOnLongClickListener(new com.tencent.mm.plugin.webview.ui.tools.eb(this));
        }
        super.onDrag();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var;
        boolean z17;
        com.tencent.xweb.s0 s0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "onKeyDown keyCode %d", java.lang.Integer.valueOf(i17));
        if (i17 == 4) {
            com.tencent.mm.ui.widget.MMWebView mMWebView = this.f183815f;
            if (mMWebView != null && mMWebView.s()) {
                this.f183815f.m();
                return true;
            }
            if (this.E1.a(false)) {
                return true;
            }
        }
        if (i17 == 4 && this.f183831l1 != null && this.f183872y0 != null && (s0Var = this.f183869x1) != null) {
            try {
                s0Var.h();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewUI", e17, "onkeydown", new java.lang.Object[0]);
            }
            com.tencent.mm.plugin.webview.model.u5.a(x7(), 7);
            com.tencent.mm.plugin.webview.core.e3 e3Var = this.L1;
            e3Var.f181948q++;
            e3Var.f181950r = java.lang.System.currentTimeMillis();
            return true;
        }
        if (i17 == 4) {
            com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter webViewRedesignInputFooter = this.F;
            if (webViewRedesignInputFooter == null || !webViewRedesignInputFooter.isShown()) {
                z17 = false;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "keyboard shouldHideWebPlusKeyBoard");
                this.F.b();
                g7();
                z17 = true;
            }
            if (z17) {
                return true;
            }
        }
        if (i17 == 4) {
            com.tencent.mm.ui.widget.MMWebView mMWebView2 = this.f183815f;
            if (mMWebView2 != null && mMWebView2.canGoBack() && this.K) {
                o8();
                com.tencent.mm.plugin.webview.model.u5.a(x7(), 7);
                com.tencent.mm.plugin.webview.core.e3 e3Var2 = this.L1;
                e3Var2.f181948q++;
                e3Var2.f181950r = java.lang.System.currentTimeMillis();
                return true;
            }
            com.tencent.mm.plugin.webview.ui.tools.t7.f186896i.a();
            com.tencent.mm.plugin.webview.model.u5.a(x7(), 8);
            com.tencent.mm.plugin.webview.core.e3 e3Var3 = this.L1;
            e3Var3.f181948q++;
            e3Var3.f181950r = java.lang.System.currentTimeMillis();
        }
        if (getIntent().getBooleanExtra("hide_close_btn", false)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewUI", "Close and return are not allowed");
            return true;
        }
        if (i17 == 4 && w8() && U8()) {
            return true;
        }
        if (i17 == 4 && this.F2 != null) {
            if (X7().booleanValue()) {
                return true;
            }
            vx4.d dVar = this.F2;
            if (dVar.U(2, dVar.f441318y)) {
                return true;
            }
        }
        if (i17 == 4 && (z5Var = this.R2) != null) {
            if (z5Var.getVisibility() == 0) {
                this.R2.t();
                return true;
            }
        }
        if (i17 == 4) {
            if (X7().booleanValue()) {
                return true;
            }
            i7();
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 82 || this.Z2) {
            return super.onKeyUp(i17, keyEvent);
        }
        return true;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        java.lang.ref.WeakReference weakReference;
        com.tencent.mm.ui.widget.MMWebView mMWebView;
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "WebViewUI-LifeCycle onPause#%s", java.lang.Integer.valueOf(t7()));
        com.tencent.mm.plugin.webview.ui.tools.floatball.w wVar = this.f183874y2;
        if (wVar != null) {
            wVar.z();
        }
        com.tencent.mm.plugin.webview.ui.tools.floatball.n nVar = this.f183877z2;
        if (nVar != null) {
            if ((ep1.m.h(getIntent()) || nVar.f184215w) && (weakReference = nVar.f184214v) != null && (mMWebView = (com.tencent.mm.ui.widget.MMWebView) weakReference.get()) != null) {
                mMWebView.evaluateJavascript("javascript:(function() {if (window._WXJS && _WXJS.mediaTracker && typeof _WXJS.mediaTracker.isPlaying === 'function') {    return _WXJS.mediaTracker.isPlaying();} else {    return false;}})()", new com.tencent.mm.plugin.webview.ui.tools.floatball.l(new com.tencent.mm.plugin.webview.ui.tools.floatball.m(nVar)));
            }
            nVar.z();
        }
        vx4.d dVar = this.F2;
        if (dVar != null) {
            dVar.A();
        }
        com.tencent.mm.plugin.webview.core.e3 e3Var = this.L1;
        if (e3Var != null && e3Var.g0() != null && this.F != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "keyboard onPause");
            nw4.n jsApiHandler = this.L1.g0();
            java.lang.String text = this.F.getEditText();
            kotlin.jvm.internal.o.g(jsApiHandler, "jsApiHandler");
            kotlin.jvm.internal.o.g(text, "text");
            if (com.tencent.mm.plugin.webview.ui.tools.newjsapi.ed.f186069e == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowKeyBoard", "callbackID == null, return");
            } else {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, text);
                jsApiHandler.e(com.tencent.mm.plugin.webview.ui.tools.newjsapi.ed.f186069e, "showKeyboard:cancel", hashMap);
                com.tencent.mm.plugin.webview.ui.tools.newjsapi.ed.f186069e = null;
            }
        }
        com.tencent.mm.plugin.webview.model.m5 h17 = this.f183835m2.h();
        long j17 = h17.f183037v;
        if (j17 != -1) {
            long j18 = h17.f183022g;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            h17.f183022g = j18 + ((android.os.SystemClock.elapsedRealtime() - j17) / 1000);
        }
        com.tencent.mm.plugin.webview.model.q3 g17 = this.f183835m2.g();
        long j19 = g17.f183077g;
        if (j19 != -1) {
            long j27 = g17.f183073c;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            g17.f183073c = j27 + (android.os.SystemClock.elapsedRealtime() - j19);
        }
        com.tencent.mm.plugin.webview.ui.tools.t7 t7Var = com.tencent.mm.plugin.webview.ui.tools.t7.f186896i;
        java.lang.String str = t7Var.f186897a;
        if (t7Var.f186903g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewReportUtil", "isFinish is true");
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            t7Var.c(6, "", 0);
        }
        zx4.l lVar = this.K2.f477165b;
        zx4.k kVar = lVar.f477162a;
        if (kVar != null) {
            kVar.stopWatching();
        }
        zx4.k kVar2 = lVar.f477163b;
        if (kVar2 != null) {
            kVar2.stopWatching();
        }
        g7();
        zx4.l0 l0Var = this.K2;
        l0Var.getClass();
        ((com.tencent.mm.ui.feature.api.screenshot.j1) ((ct.e3) i95.n0.c(ct.e3.class))).Ni(null);
        ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).Di(this, l0Var.f477164a, java.lang.Boolean.TRUE);
        l0Var.f477164a = null;
        u8("onPause");
        if (this.f183869x1 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "onPause, now try to hide customview");
            try {
                this.f183869x1.h();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewUI", e17, "onPause", new java.lang.Object[0]);
            }
        }
        dy4.l lVar2 = this.E1;
        synchronized (lVar2) {
            java.util.Iterator it = lVar2.f244683f.iterator();
            while (it.hasNext()) {
                ((sf.e) it.next()).a(0);
            }
        }
        zq1.v vVar = this.f183866w2.f185660k;
        if (vVar != null) {
            ((com.tencent.mm.pluginsdk.model.h) vVar).b();
        }
        com.tencent.mm.ui.widget.MMWebView mMWebView2 = this.f183815f;
        if (mMWebView2 != null) {
            mMWebView2.onPause();
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "onRequestPermissionsResult grantResults length 0. requestCode=%d", java.lang.Integer.valueOf(i17));
            return;
        }
        super.onRequestPermissionsResult(i17, strArr, iArr);
        nf.g.a(this).h(i17, strArr, iArr);
        this.f183806b3.g(this, i17, strArr, iArr);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity
    public void onRestoreInstanceState(android.os.Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        com.tencent.mm.plugin.webview.ui.tools.l3 l3Var = this.D1;
        if (!l3Var.f185630d) {
            l3Var.f185629c = 2;
            com.tencent.mars.xlog.Log.i(l3Var.f185628b, "onRestoreInstanceState#" + l3Var.c().hashCode());
        }
        boolean z17 = bundle.getBoolean("isReCreateUI", false);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "WebViewUI-LifeCycle onRestoreInstanceState %s, now: %s", java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(currentTimeMillis));
        if (z17) {
            getIntent().putExtra("startTime", currentTimeMillis);
            com.tencent.mm.plugin.webview.core.e3 e3Var = this.L1;
            if (e3Var != null) {
                e3Var.V.f286137s = currentTimeMillis;
            }
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var;
        super.onResume();
        this.B1 = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "WebViewUI-LifeCycle onResume#%s", java.lang.Integer.valueOf(t7()));
        c8();
        b8();
        com.tencent.mm.plugin.webview.ui.tools.floatball.w wVar = this.f183874y2;
        if (wVar != null) {
            wVar.x();
        }
        com.tencent.mm.plugin.webview.ui.tools.floatball.n nVar = this.f183877z2;
        if (nVar != null) {
            nVar.x();
        }
        vx4.d dVar = this.F2;
        if (dVar != null) {
            dVar.z();
        }
        if (x7() != null) {
            hy4.p0.a(x7());
        } else {
            hy4.p0.a(F7());
        }
        com.tencent.mm.plugin.webview.model.m5 h17 = this.f183835m2.h();
        h17.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        h17.f183037v = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.plugin.webview.model.q3 g17 = this.f183835m2.g();
        g17.getClass();
        g17.f183077g = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.plugin.webview.ui.tools.t7 t7Var = com.tencent.mm.plugin.webview.ui.tools.t7.f186896i;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(t7Var.f186897a)) {
            t7Var.c(7, "", 0);
        }
        if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(F7())) {
            zx4.l0 l0Var = this.K2;
            l0Var.getClass();
            qk.r6 r6Var = (qk.r6) i95.n0.c(qk.r6.class);
            if (r6Var != null && ((qv.s) r6Var).Ai()) {
                zx4.l lVar = l0Var.f477165b;
                zx4.k kVar = lVar.f477162a;
                if (kVar != null) {
                    kVar.startWatching();
                }
                zx4.k kVar2 = lVar.f477163b;
                if (kVar2 != null) {
                    kVar2.startWatching();
                }
            }
        }
        Z7();
        g9();
        b7();
        if (getIntent().getBooleanExtra("disable_swipe_back", false) && getSwipeBackLayout() != null) {
            getSwipeBackLayout().setEnableGesture(false);
        }
        try {
            if (j45.l.f()) {
                this.K2.e(this, false);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewUI", "setScreenShotCallback fail e:%s", e17.getMessage());
        }
        u8("onResume");
        com.tencent.mm.sdk.platformtools.t8.i1();
        if (this.f183832l2) {
            finish();
        }
        com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout webViewKeyboardLinearLayout = this.f183865w;
        if (webViewKeyboardLinearLayout != null && webViewKeyboardLinearLayout.f183774n) {
            hideVKB();
            this.f183865w.e(-2);
        }
        dy4.l lVar2 = this.E1;
        synchronized (lVar2) {
            java.util.Iterator it = lVar2.f244683f.iterator();
            while (it.hasNext()) {
                ((sf.e) it.next()).b();
            }
        }
        com.tencent.mm.plugin.webview.ui.tools.ld ldVar = this.f183866w2;
        if (ldVar.k()) {
            android.os.Bundle bundle = (android.os.Bundle) ((java.util.HashMap) com.tencent.mm.plugin.webview.ui.tools.ld.f185649s).get(ldVar.f(ldVar.f185657h));
            if (bundle != null && ldVar.f185654e != null && bundle.getBoolean("key_show_live_top_bar", true)) {
                java.lang.String string = bundle.getString("key_brand_user_name");
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
                com.tencent.mm.pluginsdk.model.b0 b0Var = com.tencent.mm.pluginsdk.model.b0.f189197a;
                if (com.tencent.mm.pluginsdk.model.b0.f189212p && com.tencent.mm.pluginsdk.model.b0.f189213q != 2) {
                    b0Var.v(9L);
                    b0Var.a(com.tencent.mm.pluginsdk.model.b0.f189201e, true, 5, com.tencent.mm.pluginsdk.model.u.f189467d);
                }
                com.tencent.mm.pluginsdk.model.b0.f189212p = false;
                ldVar.r(string);
            }
        }
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f183815f;
        if (mMWebView != null) {
            mMWebView.onResume();
        }
        if (this.f183852r2 == null && gm0.j1.a()) {
            this.f183852r2 = new com.tencent.mm.plugin.webview.ui.tools.q4();
        }
        if (m8() && (c6Var = this.f183849q2) != null) {
            if (((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Di() && c6Var.n(58)) {
                com.tencent.mm.plugin.webview.ui.tools.floatball.v vVar = this.E2;
                java.lang.String url = x7();
                com.tencent.mm.plugin.webview.ui.tools.gc gcVar = new com.tencent.mm.plugin.webview.ui.tools.gc(this);
                vVar.getClass();
                kotlin.jvm.internal.o.g(url, "url");
                if (((java.lang.Boolean) ((jz5.n) vVar.f184229e).getValue()).booleanValue()) {
                    vVar.f184228d = hy4.i.l(url) ? pv.a0.f358474e : pv.a0.f358475f;
                    pv.c0 c0Var = (pv.c0) i95.n0.c(pv.c0.class);
                    pv.a0 a0Var = vVar.f184228d;
                    kotlin.jvm.internal.o.d(a0Var);
                    boolean Di = ((ov.f0) c0Var).Di(a0Var);
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebViewFloatBallEduHelper", "addFloatBallEduView url: " + url + ", hasShown: " + Di);
                    if (!Di) {
                        if (vVar.f184226b != null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewFloatBallEduHelper", "addFloatBallEduView already added");
                        } else {
                            com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = getSwipeBackLayout();
                            if (swipeBackLayout != null) {
                                swipeBackLayout.setDragListener(new com.tencent.mm.plugin.webview.ui.tools.floatball.s(vVar));
                            }
                            vVar.f184226b = new com.tencent.mm.plugin.ball.view.ContentFloatBallEduView(this);
                            vVar.f184225a = true;
                            ku5.u0 u0Var = ku5.t0.f312615d;
                            com.tencent.mm.plugin.webview.ui.tools.floatball.q qVar = new com.tencent.mm.plugin.webview.ui.tools.floatball.q(vVar, this, gcVar);
                            ku5.t0 t0Var = (ku5.t0) u0Var;
                            t0Var.getClass();
                            t0Var.z(qVar, 600L, false);
                        }
                    }
                }
            }
        }
        if (this.C1) {
            this.C1 = false;
            j7(false);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        try {
            com.tencent.mm.plugin.webview.ui.tools.l3 l3Var = this.D1;
            if (!l3Var.f185630d) {
                l3Var.f185629c = 1;
                com.tencent.mars.xlog.Log.i(l3Var.f185628b, "onSaveInstanceState#" + l3Var.c().hashCode());
            }
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(t7());
            objArr[1] = java.lang.Boolean.valueOf(bundle != null);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "WebViewUI-LifeCycle onSaveInstanceState#%s, outState != null: %s", objArr);
            if (bundle != null) {
                bundle.putBoolean("isReCreateUI", true);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewUI", e17, "onSaveInstanceState exception", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.f183864v2 != null && m8()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "[Handoff] onStart, call onWebViewCreate " + this.f183864v2.toString());
            ((d73.i) i95.n0.c(d73.i.class)).Sb(this.f183864v2);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "edw onStart");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "WebViewUI-LifeCycle onStop#%s, WebViewUI#%s", java.lang.Integer.valueOf(t7()), java.lang.Integer.valueOf(hashCode()));
        if (this.f183864v2 != null && m8()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "[Handoff] onStop, call onWebViewDestroy " + this.f183864v2.toString());
            ((d73.i) i95.n0.c(d73.i.class)).Ef(this.f183864v2);
        }
        this.f183834m.a();
        R8(true, true);
        super.onStop();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onSwipeBack() {
        hideVKB();
        super.onSwipeBack();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public boolean onSwipeBackFinish() {
        this.f183822h2 = true;
        com.tencent.mm.plugin.webview.model.u5.a(x7(), 2);
        return super.onSwipeBackFinish();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        nw4.n nVar = this.f183844p0;
        if (nVar != null) {
            nVar.u0(z17, false);
        }
        if (z17 && j8()) {
            Z6(getWindow().getDecorView(), 5894);
        }
        if (z17 && k8()) {
            Z6(getWindow().getDecorView(), 4866);
        }
    }

    public void p7() {
        if (this.W2 != null) {
            if (this.B) {
                return;
            }
            int D7 = D7();
            this.W2.getPaddingTop();
            L8(D7);
        }
    }

    public void p8(java.lang.String str, java.util.Map map, boolean z17) {
        com.tencent.mm.plugin.webview.core.e3 e3Var = this.L1;
        if (e3Var != null) {
            e3Var.x1(str, map, z17);
        }
    }

    @Override // dy4.b
    public void q3(cy4.f fVar) {
        this.E1.q3(fVar);
    }

    public java.util.Map q7() {
        return this.L1.S;
    }

    public void q8(int i17) {
        this.L1.z0(i17);
    }

    public int r7() {
        return (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_biz_mp_page_nav_back_icon_arrow_enable_android, false) || !hy4.i.m(x7())) ? this.f183805b2 : true ? com.tencent.mm.R.raw.actionbar_icon_dark_back : com.tencent.mm.R.raw.actionbar_icon_dark_close;
    }

    public boolean r8() {
        return true;
    }

    public int s7() {
        int height;
        androidx.appcompat.app.b bVar = this.f183840o;
        return ((bVar != null ? bVar.j() : null) == null || (height = bVar.j().getHeight()) <= 0) ? getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.ael) > i65.a.b(this, 48) ? getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.ael) : com.tencent.mm.sdk.platformtools.d2.j(this) ? getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479623ay) : getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479622ax) : height;
    }

    public boolean s8() {
        return this instanceof com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewMMUI;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity
    public void setActionbarColor(int i17) {
        super.setActionbarColor(i17);
        if (((i17 >> 24) & 255) < 255 && this.W2 != null && !i8()) {
            this.W2.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.BW_93));
        }
        android.view.View view = this.P2;
        if (view != null) {
            view.setBackgroundColor(getStatusBarColor());
            vj5.o.e(getWindow());
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void setBackBtn(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, int i17) {
        super.setBackBtn(onMenuItemClickListener, i17);
        if (fp.h.c(21) && d8()) {
            setBackBtnColorFilter(com.tencent.mm.R.color.BW_0);
        }
        if (getIntent().getBooleanExtra("hide_close_btn", false)) {
            setBackBtnVisible(false);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void setMMOrientation() {
        if (getForceOrientation() != -1) {
            setRequestedOrientation(getForceOrientation());
            return;
        }
        boolean z17 = getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 4).getBoolean("settings_landscape_mode", false);
        this.landscapeMode = z17;
        if (!z17) {
            setRequestedOrientation(1);
            return;
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.biztimeline.RepairerConfigBizOrientation()) == 1) {
            setRequestedOrientation(-1);
        } else {
            setRequestedOrientation(2);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity
    public void setMMTitle(java.lang.String str) {
        super.setMMTitle(str);
        b9(str);
        c9(str);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMFragmentActivity, android.app.Activity
    public void setRequestedOrientation(int i17) {
        this.A = i17;
        g9();
        super.setRequestedOrientation(i17);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void showOptionMenu(boolean z17) {
        if (getIntent().getBooleanExtra("hide_option_menu", false)) {
            super.showOptionMenu(false);
        } else {
            super.showOptionMenu(z17);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.plugin.appbrand.widget.input.x4
    public void showVKB() {
        super.showVKB();
        if (this.f183853r3 == -3) {
            this.f183853r3 = -2;
        } else {
            this.f183853r3 = -3;
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(android.content.Intent intent) {
        if (!com.tencent.mm.sdk.platformtools.t8.D0(intent.getType(), "application/vnd.android.package-archive")) {
            try {
                intent.putExtra("key_appbrand_source_android_task_id", getTaskId());
            } catch (java.lang.Exception unused) {
            }
            super.startActivity(intent);
            return;
        }
        zb0.y yVar = (zb0.y) i95.n0.c(zb0.y.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.net.Uri data = intent.getData();
        ((yb0.c) yVar).getClass();
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.ipcinvoker.wx_extension.service.MainProcessIPCService.f68459e, new com.tencent.mm.pluginsdk.model.app.IPCInstallApp.IPCInstallAppParam(2, "", data, false), com.tencent.mm.pluginsdk.model.app.IPCInstallApp.class, new com.tencent.mm.pluginsdk.model.app.m1(null));
            return;
        }
        android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW");
        com.tencent.mm.sdk.platformtools.i1.d(context, intent2, data, "application/vnd.android.package-archive", false);
        intent2.addFlags(268435456);
        com.tencent.mm.pluginsdk.model.app.n1.c(context, intent2, null, false);
    }

    public int t7() {
        return this.L1.U();
    }

    public boolean t8() {
        com.tencent.mm.plugin.webview.ui.tools.c4 c4Var;
        boolean booleanValue;
        if (this.L) {
            return true;
        }
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f183815f;
        if (mMWebView != null && ((mMWebView.canGoBack() || this.f183815f.canGoForward()) && (c4Var = this.f183851r) != null)) {
            java.lang.Boolean bool = c4Var.f184037h;
            if (bool != null) {
                booleanValue = bool.booleanValue();
            } else {
                com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("WebViewUIShowBottom");
                kotlin.jvm.internal.o.d(M);
                if (M.o("WebViewUIShowBottomNav", 0) == 1) {
                    java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                    c4Var.f184037h = bool2;
                    kotlin.jvm.internal.o.d(bool2);
                    booleanValue = true;
                } else {
                    if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_open_webview_bottom_bar, 0) == 1) {
                        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((java.lang.Boolean) ((jz5.n) c4Var.f184040k).getValue()).booleanValue());
                        c4Var.f184037h = valueOf;
                        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewBottomNavigatorHelper", "needShowBottomNavigator deviceShowBottomNav %b", valueOf);
                        java.lang.Boolean bool3 = c4Var.f184037h;
                        kotlin.jvm.internal.o.d(bool3);
                        if (bool3.booleanValue()) {
                            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                            g0Var.d(18210, 1);
                            g0Var.idkeyStat(1160L, 0L, 1L, false);
                        } else {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1160L, 2L, 1L, false);
                        }
                        java.lang.Boolean bool4 = c4Var.f184037h;
                        kotlin.jvm.internal.o.d(bool4);
                        booleanValue = bool4.booleanValue();
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewBottomNavigatorHelper", "needShowBottomNavigator not open");
                        java.lang.Boolean bool5 = java.lang.Boolean.FALSE;
                        c4Var.f184037h = bool5;
                        kotlin.jvm.internal.o.d(bool5);
                        booleanValue = false;
                    }
                }
            }
            if (booleanValue) {
                this.K = false;
                this.L = true;
                return true;
            }
        }
        return false;
    }

    public java.lang.String u7(java.lang.String str) {
        return this.L1.V(str);
    }

    public final void u8(java.lang.String str) {
        nw4.n nVar = this.f183844p0;
        if (nVar == null || !nVar.f340895i || str == null) {
            return;
        }
        nVar.A(str, null);
        try {
            if (str.equals("onPause")) {
                com.tencent.mm.plugin.webview.stub.v0 v0Var = this.K1;
                if (v0Var != null) {
                    v0Var.M7(t7());
                }
                this.f183844p0.w0(false);
                return;
            }
            if (str.equals("onResume")) {
                com.tencent.mm.plugin.webview.stub.v0 v0Var2 = this.K1;
                if (v0Var2 != null) {
                    v0Var2.pc(t7());
                }
                this.f183844p0.w0(true);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewUI", "onResume, ex = " + e17.getMessage());
        }
    }

    public int v7() {
        com.tencent.mm.plugin.webview.ui.tools.jd w76 = w7();
        int i17 = w76 != null ? w76.f184877g : -1;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "getCurrentMPPageItemShowType  itemShowType:" + i17);
        return i17;
    }

    public void v8() {
        if (w8()) {
            return;
        }
        i7();
        if (U8()) {
            return;
        }
        this.f183816f2 = true;
        com.tencent.mm.plugin.webview.ui.tools.t7.f186896i.a();
        if (!this.f183822h2) {
            com.tencent.mm.plugin.webview.model.u5.a(x7(), 1);
        }
        vx4.d dVar = this.F2;
        if (dVar == null || !dVar.U(1, dVar.f441318y)) {
            finish();
        }
    }

    public com.tencent.mm.plugin.webview.ui.tools.jd w7() {
        com.tencent.mm.plugin.webview.ui.tools.ld ldVar = this.f183866w2;
        if (ldVar == null) {
            return null;
        }
        return ldVar.c(x7());
    }

    public boolean w8() {
        int intExtra = getIntent().getIntExtra("key_close_action", 0);
        android.os.Bundle bundleExtra = getIntent().getBundleExtra("key_close_data");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "close action %s", java.lang.Integer.valueOf(intExtra));
        if (intExtra != 1) {
            if (intExtra == 2 && bundleExtra != null) {
                java.lang.String string = bundleExtra.getString("close_jump_url");
                int i17 = bundleExtra.getInt("close_jump_url_request_code", 0);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                    android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.webview.ui.tools.WebViewUI.class);
                    intent.putExtra("rawUrl", string);
                    intent.putExtra("showShare", false);
                    intent.putExtra("show_bottom", false);
                    intent.putExtra("needRedirect", false);
                    intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
                    intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
                    startActivityForResult(intent, i17);
                    db5.f.h(this);
                    return true;
                }
            }
        } else if (bundleExtra != null) {
            java.lang.String string2 = bundleExtra.getString("close_dialog_title");
            java.lang.String string3 = bundleExtra.getString("close_dialog_msg");
            java.lang.String string4 = bundleExtra.getString("close_dialog_ok");
            java.lang.String string5 = bundleExtra.getString("close_dialog_cancel");
            boolean z17 = bundleExtra.getBoolean("close_dialog_ok_close", true);
            if (!com.tencent.mm.sdk.platformtools.t8.N0(string3, string4, string5)) {
                if (z17) {
                    db5.e1.C(this, string2, string3, string4, string5, false, new com.tencent.mm.plugin.webview.ui.tools.zb(this), null);
                } else {
                    db5.e1.C(this, string2, string3, string4, string5, false, null, new com.tencent.mm.plugin.webview.ui.tools.ac(this));
                }
                return true;
            }
        }
        return false;
    }

    public java.lang.String x7() {
        com.tencent.mm.plugin.webview.core.e3 e3Var = this.L1;
        return (e3Var == null || com.tencent.mm.sdk.platformtools.t8.K0(e3Var.Z())) ? F7() : this.L1.Z();
    }

    public void x8(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mm.plugin.webview.model.b6 b6Var = this.f183835m2;
        android.content.Intent intent = getIntent();
        java.lang.String F7 = F7();
        b6Var.getClass();
        int intExtra = intent.getIntExtra("geta8key_scene", 0);
        int intExtra2 = intent.getIntExtra("bizEnterId", b6Var.f182812o);
        int intExtra3 = intent.getIntExtra("webview_scene_type", 1);
        java.lang.String stringExtra = intent.getStringExtra("webview_scene_note");
        java.lang.String stringExtra2 = intent.getStringExtra("srcUsername");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
            stringExtra2 = intent.getStringExtra("geta8key_username");
        }
        java.lang.String stringExtra3 = intent.getStringExtra("KAppId");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(intExtra2);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(intExtra);
        com.tencent.mm.sdk.platformtools.i6 i6Var = com.tencent.mm.pluginsdk.ui.tools.e9.f191608a;
        g0Var.d(18452, valueOf, valueOf2, com.tencent.mm.sdk.platformtools.y9.a(F7), com.tencent.mm.sdk.platformtools.y9.a(str), java.lang.Integer.valueOf(intExtra3), stringExtra, stringExtra3, stringExtra2);
        T7();
    }

    public pw4.a y7() {
        nw4.n nVar = this.f183844p0;
        if (nVar == null) {
            return new pw4.a();
        }
        if (nVar.E == null) {
            nVar.E = new pw4.a();
        }
        pw4.a aVar = nVar.E;
        aVar.f358709a = nVar.f340887a;
        return aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(90:1|(4:3|(2:5|(1:10)(1:9))|11|(1:15))|16|(1:20)|21|(3:23|(1:25)(1:279)|26)(9:280|(1:282)(1:303)|283|(1:285)(1:302)|286|(2:288|(1:290)(1:299))(1:300)|291|292|(2:294|(1:296)))|27|(1:29)|30|(1:32)|33|(3:35|(3:37|(1:39)|40)(1:277)|(75:42|43|(1:45)|46|(1:48)|49|(5:51|(1:53)(1:275)|54|(1:58)|59)(1:276)|60|(1:62)|63|(1:65)|66|(1:68)(2:271|(1:273)(1:274))|69|(1:71)(1:270)|72|(1:74)(1:269)|75|(1:77)|78|(3:80|(2:81|(2:83|(1:85)(1:260))(4:261|262|(1:264)(1:267)|(1:266)(0)))|86)(1:268)|87|(1:89)|90|(2:92|(3:94|(1:96)|97)(1:98))|99|(1:101)|102|(1:104)(2:(1:(1:256)(1:258))(1:259)|257)|105|(1:107)|108|(1:110)|111|112|113|(3:246|(1:251)|252)(1:117)|118|119|(1:121)|122|123|124|(1:128)|130|(1:132)|133|(1:135)|(1:137)|138|(1:140)|141|(1:143)|144|145|146|147|148|(2:152|(1:157)(1:156))|158|(4:160|(1:162)(1:166)|163|(1:165))|167|(7:171|(1:199)(1:175)|(1:179)|180|(4:182|(1:194)(1:186)|187|(2:191|(1:193)))|195|(1:197)(1:198))|200|(1:202)(1:237)|203|(1:209)|210|(3:212|(4:225|226|(1:228)(1:231)|229)|214)|234|(1:236)|216|(1:218)|219|(2:221|222)(1:224)))|278|43|(0)|46|(0)|49|(0)(0)|60|(0)|63|(0)|66|(0)(0)|69|(0)(0)|72|(0)(0)|75|(0)|78|(0)(0)|87|(0)|90|(0)|99|(0)|102|(0)(0)|105|(0)|108|(0)|111|112|113|(1:115)|246|(40:248|251|118|119|(0)|122|123|124|(2:126|128)|130|(0)|133|(0)|(0)|138|(0)|141|(0)|144|145|146|147|148|(4:150|152|(1:154)|157)|158|(0)|167|(9:169|171|(1:173)|199|(2:177|179)|180|(0)|195|(0)(0))|200|(0)(0)|203|(3:205|207|209)|210|(0)|234|(0)|216|(0)|219|(0)(0))|252|118|119|(0)|122|123|124|(0)|130|(0)|133|(0)|(0)|138|(0)|141|(0)|144|145|146|147|148|(0)|158|(0)|167|(0)|200|(0)(0)|203|(0)|210|(0)|234|(0)|216|(0)|219|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0b21, code lost:
    
        if (com.tencent.mm.plugin.webview.ui.tools.WebViewUI.f183799x3.booleanValue() != false) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x08f7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x08f8, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUI", "tryToExpandToStatusBar error : %s", r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x08c6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x08c7, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUI", "fixContentMargin error : %s", r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x07ff, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0800, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewSecretMsgReporter", r0, "initWebViewSecretMsgReporter exception", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x07c0, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.WebviewReporter.DomainReporter", "parse rawUrl fail, rawUrl = %s", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x01e9, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r0) != false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x07ec A[Catch: Exception -> 0x07ff, TryCatch #2 {Exception -> 0x07ff, blocks: (B:124:0x07e4, B:126:0x07ec, B:128:0x07f4), top: B:123:0x07e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x080f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0851  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0876  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x08da A[Catch: Exception -> 0x08f7, TryCatch #3 {Exception -> 0x08f7, blocks: (B:148:0x08d4, B:150:0x08da, B:152:0x08df, B:154:0x08e7, B:156:0x08eb, B:157:0x08ef), top: B:147:0x08d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0914  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0964  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x09fc  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0a61  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0a67  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0a75  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0ab6  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0ae5  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0b3d  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0b61  */
    /* JADX WARN: Removed duplicated region for block: B:224:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0b27  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0a92  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x06be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void y8() {
        /*
            Method dump skipped, instructions count: 2934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.WebViewUI.y8():void");
    }

    @Override // com.tencent.mm.sdk.platformtools.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var;
        com.tencent.mm.ui.widget.MMWebView mMWebView;
        android.view.View view;
        if (this.f183844p0 != null && this.f183815f != null) {
            w04.l.INSTANCE.Fe(getIntent(), this.f183815f.getUrl());
            this.f183844p0.a0(this.f183815f.getUrl(), getIntent().getBundleExtra("ad_report_bundle"), (this.f183876z1.b().f192177d & 1048576) > 0);
            this.K2.f(this, 0L);
        }
        if (!this.F1 || this.J2 || (c6Var = this.f183849q2) == null || !c6Var.z(C7(), 456) || !this.f183849q2.n(57) || (mMWebView = this.f183815f) == null || !mMWebView.z0() || java.lang.Boolean.TRUE.equals(this.Q1.get(x7()))) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(", canShowLongScreenshot = ");
            sb6.append(this.F1);
            sb6.append(", canShowMenuItem = ");
            sb6.append(this.f183849q2.n(57));
            sb6.append("isXwebKernel = ");
            com.tencent.mm.ui.widget.MMWebView mMWebView2 = this.f183815f;
            sb6.append(mMWebView2 != null && mMWebView2.z0());
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", sb6.toString());
            return;
        }
        this.K2.h(this, str);
        if (this.I2 == null || (view = this.H2) == null) {
            return;
        }
        view.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$g
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                android.webkit.WebSettings.RenderPriority renderPriority = com.tencent.mm.plugin.webview.ui.tools.WebViewUI.f183797v3;
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = com.tencent.mm.plugin.webview.ui.tools.WebViewUI.this;
                webViewUI.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view2);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", webViewUI, array);
                com.tencent.mm.autogen.mmdata.rpt.WebviewFullSnapshotActionReportStruct webviewFullSnapshotActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WebviewFullSnapshotActionReportStruct();
                webviewFullSnapshotActionReportStruct.f62947e = 2L;
                webviewFullSnapshotActionReportStruct.f62949g = 1L;
                webviewFullSnapshotActionReportStruct.p(webViewUI.x7());
                webviewFullSnapshotActionReportStruct.k();
                zx4.l0 l0Var = webViewUI.K2;
                l0Var.getClass();
                l0Var.g(webViewUI, true, false, "", null);
                yj0.a.h(webViewUI, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        android.view.View view2 = this.I2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "onScreenShot", "(Ljava/lang/String;JZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "onScreenShot", "(Ljava/lang/String;JZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.H2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "onScreenShot", "(Ljava/lang/String;JZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "onScreenShot", "(Ljava/lang/String;JZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.autogen.mmdata.rpt.WebviewFullSnapshotActionReportStruct webviewFullSnapshotActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WebviewFullSnapshotActionReportStruct();
        webviewFullSnapshotActionReportStruct.f62947e = 1L;
        webviewFullSnapshotActionReportStruct.f62949g = 1L;
        webviewFullSnapshotActionReportStruct.p(x7());
        webviewFullSnapshotActionReportStruct.k();
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.webview.ui.tools.fc fcVar = new com.tencent.mm.plugin.webview.ui.tools.fc(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(fcVar, 5000L, false);
    }

    public java.util.List z7() {
        if (this.f183852r2 == null) {
            return null;
        }
        if (this.f183815f == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUI", "viewwv is null, maybe has destroyed");
            return null;
        }
        java.lang.String F7 = F7();
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f183815f;
        if (mMWebView != null) {
            java.lang.String url = mMWebView.getUrl();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(url)) {
                F7 = url;
            }
        }
        try {
            java.lang.String host = new java.net.URL(F7).getHost();
            if (com.tencent.mm.sdk.platformtools.t8.K0(host)) {
                return null;
            }
            com.tencent.mm.plugin.webview.ui.tools.q4 q4Var = this.f183852r2;
            q4Var.getClass();
            kotlin.jvm.internal.o.g(host, "host");
            try {
                q4Var.f186769b.await();
            } catch (java.lang.InterruptedException unused) {
            }
            if (java.util.regex.Pattern.compile(".*(\\.wanggou\\.com|\\.jd\\.com)").matcher(!r26.i0.y(host, ".", false) ? ".".concat(host) : host).matches()) {
                for (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig dynamicMenuConfig : q4Var.f186768a) {
                    if (kotlin.jvm.internal.o.b(dynamicMenuConfig.getName(), "JDWebViewMenu")) {
                        java.util.List<com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem> itemsList = dynamicMenuConfig.getItemsList();
                        kotlin.jvm.internal.o.f(itemsList, "getItemsList(...)");
                        return itemsList;
                    }
                }
            }
            for (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig dynamicMenuConfig2 : q4Var.f186768a) {
                if (dynamicMenuConfig2.getDomainsList().contains(host)) {
                    java.util.List<com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem> itemsList2 = dynamicMenuConfig2.getItemsList();
                    kotlin.jvm.internal.o.f(itemsList2, "getItemsList(...)");
                    return itemsList2;
                }
            }
            return kz5.p0.f313996d;
        } catch (java.net.MalformedURLException unused2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUI", "getDynamicMenuItems, url is malformed, url = %s", F7);
            return null;
        }
    }

    public void z8(android.os.Bundle bundle) {
        customfixStatusbar(true);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        getIntent().putExtra("createTime", currentTimeMillis);
        if (bundle != null) {
            boolean z17 = bundle.getBoolean("isReCreateUI", false);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "onRestoreInstanceState %s, now: %s", java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(currentTimeMillis));
            if (z17) {
                getIntent().putExtra("startTime", currentTimeMillis);
                getIntent().putExtra("isReCreateUI", true);
            }
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity
    public void setMMTitle(java.lang.CharSequence charSequence) {
        super.setMMTitle(charSequence);
        b9(charSequence.toString());
        c9(charSequence.toString());
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void showOptionMenu(int i17, boolean z17) {
        ww4.b bVar;
        ww4.b bVar2;
        if (getIntent().getBooleanExtra("hide_option_menu", false)) {
            if (i17 == 0 && (bVar2 = this.A2) != null) {
                bVar2.a(false, x7());
            }
            super.showOptionMenu(i17, false);
            return;
        }
        if (i17 == 0 && (bVar = this.A2) != null) {
            bVar.a(z17, x7());
        }
        super.showOptionMenu(i17, z17);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle, android.os.PersistableBundle persistableBundle) {
        super.onSaveInstanceState(bundle, persistableBundle);
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "WebViewUI-LifeCycle onSaveInstanceStateWithPersistentState#%s", java.lang.Integer.valueOf(t7()));
            bundle.putBoolean("isReCreateUI", true);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewUI", e17, "onSaveInstanceStateWithPersistentState exception", new java.lang.Object[0]);
        }
    }
}
