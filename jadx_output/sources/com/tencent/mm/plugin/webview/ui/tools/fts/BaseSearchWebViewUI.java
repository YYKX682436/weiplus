package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public abstract class BaseSearchWebViewUI extends com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI implements lw4.f {
    public static final /* synthetic */ int E4 = 0;
    public final com.tencent.mm.sdk.event.IListener A4;
    public final com.tencent.mm.sdk.event.IListener B4;
    public final com.tencent.mm.sdk.event.IListener C4;
    public final com.tencent.mm.sdk.platformtools.f7 D4;
    public boolean R3;
    public boolean S3;
    public lw4.g T3;
    public android.view.View V3;
    public android.widget.RelativeLayout W3;
    public com.tencent.mm.api.SmileyPanel X3;
    public int Y3;
    public int Z3;

    /* renamed from: a4, reason: collision with root package name */
    public int f184244a4;

    /* renamed from: b4, reason: collision with root package name */
    public int f184245b4;

    /* renamed from: c4, reason: collision with root package name */
    public java.lang.String f184246c4;

    /* renamed from: e4, reason: collision with root package name */
    public java.lang.String f184248e4;

    /* renamed from: f4, reason: collision with root package name */
    public java.lang.String f184249f4;

    /* renamed from: g4, reason: collision with root package name */
    public java.lang.String f184250g4;

    /* renamed from: h4, reason: collision with root package name */
    public int f184251h4;

    /* renamed from: i4, reason: collision with root package name */
    public long f184252i4;

    /* renamed from: j4, reason: collision with root package name */
    public int f184253j4;

    /* renamed from: k4, reason: collision with root package name */
    public java.lang.String f184254k4;

    /* renamed from: l4, reason: collision with root package name */
    public boolean f184255l4;

    /* renamed from: o4, reason: collision with root package name */
    public java.util.HashMap f184257o4;

    /* renamed from: p4, reason: collision with root package name */
    public java.lang.String f184258p4;

    /* renamed from: q4, reason: collision with root package name */
    public android.view.View f184259q4;

    /* renamed from: r4, reason: collision with root package name */
    public java.lang.Runnable f184260r4;

    /* renamed from: y4, reason: collision with root package name */
    public vx4.c f184267y4;

    /* renamed from: z4, reason: collision with root package name */
    public com.tencent.mm.plugin.ball.service.s4 f184268z4;
    public final java.util.Set U3 = new java.util.HashSet();

    /* renamed from: d4, reason: collision with root package name */
    public boolean f184247d4 = false;

    /* renamed from: m4, reason: collision with root package name */
    public boolean f184256m4 = false;

    /* renamed from: s4, reason: collision with root package name */
    public final java.util.HashMap f184261s4 = new java.util.HashMap();

    /* renamed from: t4, reason: collision with root package name */
    public boolean f184262t4 = false;

    /* renamed from: u4, reason: collision with root package name */
    public java.lang.String f184263u4 = "";

    /* renamed from: v4, reason: collision with root package name */
    public int f184264v4 = 0;

    /* renamed from: w4, reason: collision with root package name */
    public boolean f184265w4 = false;

    /* renamed from: x4, reason: collision with root package name */
    public int f184266x4 = 0;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$1, reason: invalid class name */
    /* loaded from: classes8.dex */
    public class AnonymousClass1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OnSearchFinderViewEvent> {
        public AnonymousClass1(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = 1755379160;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.OnSearchFinderViewEvent onSearchFinderViewEvent) {
            final com.tencent.mm.autogen.events.OnSearchFinderViewEvent onSearchFinderViewEvent2 = onSearchFinderViewEvent;
            int i17 = com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.E4;
            com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.this.Q2.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$1$$a
                @Override // java.lang.Runnable
                public final void run() {
                    final com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.AnonymousClass1 anonymousClass1 = com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.AnonymousClass1.this;
                    com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI = com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.this;
                    if (baseSearchWebViewUI.s9() != null) {
                        final com.tencent.mm.autogen.events.OnSearchFinderViewEvent onSearchFinderViewEvent3 = onSearchFinderViewEvent2;
                        baseSearchWebViewUI.o9(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$1$$b
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.AnonymousClass1 anonymousClass12 = com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.AnonymousClass1.this;
                                anonymousClass12.getClass();
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("OnSearchFinderViewEvent js api run");
                                com.tencent.mm.autogen.events.OnSearchFinderViewEvent onSearchFinderViewEvent4 = onSearchFinderViewEvent3;
                                sb6.append(onSearchFinderViewEvent4.f54582g.f6264b);
                                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", sb6.toString());
                                final nw4.n s96 = com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.this.s9();
                                am.bn bnVar = onSearchFinderViewEvent4.f54582g;
                                java.lang.String str = bnVar.f6263a;
                                java.lang.String str2 = bnVar.f6264b;
                                if (!s96.f340895i) {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "not ready");
                                    return;
                                }
                                java.util.HashMap hashMap = new java.util.HashMap();
                                hashMap.put("action", str);
                                hashMap.put("params", str2);
                                final java.lang.String c17 = nw4.x2.c("onFinderViewEvent", hashMap, s96.f340903q, s96.f340904r);
                                com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: nw4.n$$f
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        java.lang.String str3 = c17;
                                        nw4.n nVar = nw4.n.this;
                                        nVar.getClass();
                                        try {
                                            nVar.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + str3 + ")", null);
                                        } catch (java.lang.Exception e17) {
                                            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onFinderViewEvent fail, ex = %s", e17.getMessage());
                                        }
                                    }
                                });
                            }
                        });
                    }
                }
            });
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WebSearchHalfScreenEnterFullScreenEvent> {
        public AnonymousClass2(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = 1712514994;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.WebSearchHalfScreenEnterFullScreenEvent webSearchHalfScreenEnterFullScreenEvent) {
            int i17 = webSearchHalfScreenEnterFullScreenEvent.f54981g.f6896a;
            com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI = com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.this;
            if (i17 != baseSearchWebViewUI.f184266x4) {
                return false;
            }
            rx4.r2 r2Var = (rx4.r2) pf5.z.f353948a.a(baseSearchWebViewUI).a(rx4.r2.class);
            android.view.View findViewById = r2Var.findViewById(com.tencent.mm.R.id.gxy);
            if (findViewById != null) {
                android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                layoutParams.height = com.tencent.mm.ui.bl.h(r2Var.getContext());
                findViewById.setLayoutParams(layoutParams);
            }
            android.view.View findViewById2 = r2Var.findViewById(com.tencent.mm.R.id.f485216gy1);
            if (findViewById2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/uic/HalfScreenFTSDragBarUIC", "onFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/HalfScreenFTSDragBarUIC", "onFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            baseSearchWebViewUI.Q2.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$2$$a
                @Override // java.lang.Runnable
                public final void run() {
                    final com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.AnonymousClass2 anonymousClass2 = com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.AnonymousClass2.this;
                    com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI2 = com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.this;
                    if (baseSearchWebViewUI2.s9() != null) {
                        baseSearchWebViewUI2.o9(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$2$$b
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.AnonymousClass2 anonymousClass22 = com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.AnonymousClass2.this;
                                anonymousClass22.getClass();
                                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "recv WebSearchHalfScreenEnterFullScreenEvent");
                                final nw4.n s96 = com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.this.s9();
                                if (!s96.f340895i) {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "not ready");
                                } else {
                                    final java.lang.String c17 = nw4.x2.c("onUserToggleFullScreen", new java.util.HashMap(), s96.f340903q, s96.f340904r);
                                    com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: nw4.n$$d
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            java.lang.String str = c17;
                                            nw4.n nVar = nw4.n.this;
                                            nVar.getClass();
                                            try {
                                                nVar.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + str + ")", null);
                                            } catch (java.lang.Exception e17) {
                                                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onUserToggleFullScreen fail, ex = %s", e17.getMessage());
                                            }
                                        }
                                    });
                                }
                            }
                        });
                    }
                    baseSearchWebViewUI2.ba();
                }
            });
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$3, reason: invalid class name */
    /* loaded from: classes8.dex */
    public class AnonymousClass3 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WebSearchHalfScreenStatusChangeEvent> {
        public AnonymousClass3(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = 753974061;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.WebSearchHalfScreenStatusChangeEvent webSearchHalfScreenStatusChangeEvent) {
            final com.tencent.mm.autogen.events.WebSearchHalfScreenStatusChangeEvent webSearchHalfScreenStatusChangeEvent2 = webSearchHalfScreenStatusChangeEvent;
            am.j20 j20Var = webSearchHalfScreenStatusChangeEvent2.f54982g;
            if (j20Var != null) {
                int i17 = j20Var.f7005a;
                com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI = com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.this;
                if (i17 == baseSearchWebViewUI.f184266x4 && !android.text.TextUtils.isEmpty(j20Var.f7006b) && !android.text.TextUtils.isEmpty(webSearchHalfScreenStatusChangeEvent2.f54982g.f7007c)) {
                    baseSearchWebViewUI.Q2.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$3$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            final com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.AnonymousClass3 anonymousClass3 = com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.AnonymousClass3.this;
                            com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI2 = com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.this;
                            if (baseSearchWebViewUI2.s9() != null) {
                                final com.tencent.mm.autogen.events.WebSearchHalfScreenStatusChangeEvent webSearchHalfScreenStatusChangeEvent3 = webSearchHalfScreenStatusChangeEvent2;
                                baseSearchWebViewUI2.o9(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$3$$b
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.AnonymousClass3 anonymousClass32 = com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.AnonymousClass3.this;
                                        anonymousClass32.getClass();
                                        am.j20 j20Var2 = webSearchHalfScreenStatusChangeEvent3.f54982g;
                                        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "call %s:%s", j20Var2.f7006b, j20Var2.f7007c);
                                        try {
                                            final nw4.n s96 = com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.this.s9();
                                            java.lang.String str = j20Var2.f7006b;
                                            org.json.JSONObject jSONObject = new org.json.JSONObject(j20Var2.f7007c);
                                            if (s96.f340895i) {
                                                final java.lang.String d17 = nw4.x2.d(str, jSONObject, s96.f340903q, s96.f340904r);
                                                com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: nw4.n$$b
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        java.lang.String str2 = d17;
                                                        nw4.n nVar = nw4.n.this;
                                                        nVar.getClass();
                                                        try {
                                                            nVar.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + str2 + ")", null);
                                                        } catch (java.lang.Exception e17) {
                                                            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onHalfScreenHeightEvent fail, ex = %s", e17.getMessage());
                                                        }
                                                    }
                                                });
                                            } else {
                                                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "not ready");
                                            }
                                        } catch (java.lang.Exception unused) {
                                        }
                                    }
                                });
                            }
                        }
                    });
                    return true;
                }
            }
            return false;
        }
    }

    public BaseSearchWebViewUI() {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.A4 = new com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.AnonymousClass1(a0Var);
        this.B4 = new com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.AnonymousClass2(a0Var);
        this.C4 = new com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.AnonymousClass3(a0Var);
        this.D4 = new com.tencent.mm.plugin.webview.ui.tools.fts.l0(this);
    }

    public static void D9(android.content.Context context, int i17, int i18, java.lang.String str, int i19) {
        if (!((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ni(i17, 0)) {
            if (!(i17 == 17 || i17 == 18 || i17 == 19)) {
                su4.i1 i1Var = new su4.i1();
                i1Var.f412923b = context;
                i1Var.f412928g = str;
                i1Var.f412930i = 100;
                i1Var.f412925d = i19;
                ((com.tencent.mm.plugin.websearch.w1) ((su4.x0) i95.n0.c(su4.x0.class))).fj(i1Var);
                return;
            }
        }
        ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).wi(context, i17, i18, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S9() {
        android.view.View view = this.f184259q4;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSearchWebViewUI", "hideLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSearchWebViewUI", "hideLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.Runnable runnable = this.f184260r4;
            if (runnable != null) {
                this.Q2.removeCallbacks(runnable);
                this.f184260r4 = null;
            }
        }
    }

    public static void y9(com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI, java.lang.String str, java.lang.String str2, int i17, boolean z17) {
        if (baseSearchWebViewUI.f184259q4 == null) {
            return;
        }
        baseSearchWebViewUI.S9();
        android.widget.ImageView imageView = (android.widget.ImageView) baseSearchWebViewUI.f184259q4.findViewById(com.tencent.mm.R.id.hlr);
        android.view.View findViewById = baseSearchWebViewUI.f184259q4.findViewById(com.tencent.mm.R.id.lbi);
        if (str2.equals("loading")) {
            imageView.setVisibility(8);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSearchWebViewUI", "showLoadingView", "(Ljava/lang/String;Ljava/lang/String;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSearchWebViewUI", "showLoadingView", "(Ljava/lang/String;Ljava/lang/String;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            imageView.setVisibility(0);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSearchWebViewUI", "showLoadingView", "(Ljava/lang/String;Ljava/lang/String;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSearchWebViewUI", "showLoadingView", "(Ljava/lang/String;Ljava/lang/String;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (str2.equals(ya.b.SUCCESS)) {
                imageView.setImageResource(com.tencent.mm.R.drawable.bvp);
            } else if (str2.equals("fail")) {
                imageView.setImageResource(com.tencent.mm.R.drawable.cez);
            } else {
                imageView.setVisibility(8);
            }
        }
        android.widget.TextView textView = (android.widget.TextView) baseSearchWebViewUI.f184259q4.findViewById(com.tencent.mm.R.id.obc);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) baseSearchWebViewUI.f184259q4.findViewById(com.tencent.mm.R.id.mvs);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) textView.getLayoutParams();
        if (imageView.getVisibility() == 8 && findViewById.getVisibility() == 8) {
            layoutParams.bottomMargin = baseSearchWebViewUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479573p);
            linearLayout.setMinimumHeight(0);
        } else {
            layoutParams.bottomMargin = 0;
            linearLayout.setMinimumHeight(i65.a.b(baseSearchWebViewUI, 120));
        }
        textView.setLayoutParams(layoutParams);
        textView.setText(str);
        baseSearchWebViewUI.f184259q4.setOnTouchListener(new com.tencent.mm.plugin.webview.ui.tools.fts.f0(baseSearchWebViewUI, z17));
        android.view.View view = baseSearchWebViewUI.f184259q4;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSearchWebViewUI", "showLoadingView", "(Ljava/lang/String;Ljava/lang/String;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSearchWebViewUI", "showLoadingView", "(Ljava/lang/String;Ljava/lang/String;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (i17 > 0) {
            com.tencent.mm.plugin.webview.ui.tools.fts.g0 g0Var = new com.tencent.mm.plugin.webview.ui.tools.fts.g0(baseSearchWebViewUI);
            baseSearchWebViewUI.f184260r4 = g0Var;
            baseSearchWebViewUI.Q2.postDelayed(g0Var, i17);
        }
    }

    public static java.lang.String z9(com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI, com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        baseSearchWebViewUI.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("md5", iEmojiInfo.H0());
        bundle.putString("designerId", iEmojiInfo.X0());
        bundle.putString("aeskey", iEmojiInfo.getAesKey());
        bundle.putString("encryptUrl", iEmojiInfo.J1());
        bundle.putString("productId", iEmojiInfo.getGroupId());
        bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, iEmojiInfo.getName());
        bundle.putString("thumbUrl", iEmojiInfo.l());
        try {
            bundle = baseSearchWebViewUI.K1.U6(7, bundle);
        } catch (java.lang.Exception unused) {
        }
        java.lang.String string = bundle.getString("emojiPath");
        if (!iEmojiInfo.k() && iEmojiInfo.getGroup() != 18) {
            return string;
        }
        return string + "_fts";
    }

    @Override // qx4.b
    public com.tencent.mm.ui.MMActivity B() {
        return this;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public void B8() {
        super.B8();
        if (this.T3 == null) {
            this.T3 = new lw4.g(getContext(), this.f183815f, this);
        }
        this.T3.f321653b = s9();
        V9();
        vx4.c cVar = this.f184267y4;
        if (cVar != null) {
            cVar.z();
        }
    }

    public void B9(int i17, java.lang.String str, java.util.Map map) {
    }

    public void C9(int i17) {
        int i18 = this.H3;
        if (i18 == 1) {
            Q8(getResources().getColor(com.tencent.mm.R.color.anl), false);
        } else if (i18 == 2) {
            Q8(getResources().getColor(com.tencent.mm.R.color.anm), true);
        } else {
            Q8(i17, !com.tencent.mm.ui.bk.C());
        }
    }

    public void E9() {
    }

    public boolean F9(java.util.HashMap hashMap, android.content.Context context) {
        if (iq.b.v(context) || iq.b.e(context)) {
            return false;
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (!j35.u.a((android.app.Activity) context, "android.permission.CAMERA", 18, "", "")) {
            return false;
        }
        this.f184257o4 = hashMap;
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = new com.tencent.mm.modelcontrol.VideoTransPara();
        videoTransPara.f71195h = 10000;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider g17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.g("", "", videoTransPara, 10000 * 1000, 16);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        g17.f155681s = bool;
        g17.f155682t = java.lang.Boolean.FALSE;
        g17.f155684v = bool;
        g17.f155677o.f64783o = getResources().getString(com.tencent.mm.R.string.hku);
        ut3.f.f431176c.f431177a = new com.tencent.mm.plugin.webview.ui.tools.fts.h0(this, hashMap);
        ((pc0.e2) ((qc0.c1) i95.n0.c(qc0.c1.class))).wi(this, g17, new com.tencent.mm.plugin.webview.ui.tools.fts.i0(this));
        return true;
    }

    public void G9(vu4.a aVar, vu4.b bVar) {
        H9(aVar, bVar, "");
    }

    public void H9(vu4.a aVar, vu4.b bVar, java.lang.String str) {
        ea();
        java.lang.String str2 = !com.tencent.mm.sdk.platformtools.t8.K0(this.B3) ? this.B3 : "";
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.t8.K0(this.f184250g4) ? "" : this.f184250g4;
        java.lang.String str4 = str2;
        java.lang.String str5 = str3;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "doReport26897, scene: %d, curScene: %d, businessType: %d, sessionID: %s, searchID: %s, actionId: %d, actionType: %d", java.lang.Integer.valueOf(this.Y3), java.lang.Integer.valueOf(this.f184251h4), java.lang.Long.valueOf(this.f184252i4), str4, str5, java.lang.Integer.valueOf(aVar.f440257d), java.lang.Integer.valueOf(bVar.f440277d));
        vu4.c cVar = new vu4.c(aVar, bVar, str4, str5, str3, (int) this.f184252i4, "", str, "", "", false);
        cVar.f440289l = this.f184251h4;
        cVar.f440290m = 2;
        ((com.tencent.mm.plugin.websearch.w1) ((su4.x0) i95.n0.c(su4.x0.class))).aj().k(cVar.a());
    }

    public void I9() {
    }

    public void J9() {
        if (this.V3 == null) {
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) getWindow().getDecorView();
        viewGroup.setSystemUiVisibility(0);
        viewGroup.removeView(this.V3);
        getWindow().clearFlags(1024);
        if (getRequestedOrientation() == 0) {
            setRequestedOrientation(1);
        }
        this.V3 = null;
        java.util.Iterator it = ((java.util.HashSet) this.U3).iterator();
        while (it.hasNext()) {
            ((lw4.e) it.next()).a();
        }
    }

    public java.lang.String K9() {
        return "";
    }

    public int L9() {
        return 0;
    }

    public android.graphics.drawable.Drawable M9(int i17) {
        int i18;
        if (i17 == 1) {
            i18 = com.tencent.mm.R.raw.websearch_icon_acount;
        } else if (i17 != 2) {
            switch (i17) {
                case 8:
                    i18 = com.tencent.mm.R.raw.websearch_icon_moment;
                    break;
                case 64:
                case 262208:
                    i18 = com.tencent.mm.R.raw.websearch_icon_weapp;
                    break;
                case 256:
                case 384:
                    i18 = com.tencent.mm.R.raw.websearch_icon_emoji;
                    break;
                case 512:
                    i18 = com.tencent.mm.R.raw.websearch_icon_music;
                    break;
                case 1024:
                    i18 = com.tencent.mm.R.raw.websearch_icon_novel;
                    break;
                case 12582912:
                    i18 = com.tencent.mm.R.raw.websearch_icon_movie;
                    break;
                case 16777220:
                    i18 = com.tencent.mm.R.raw.websearch_icon_webpage;
                    break;
                case 16777248:
                    i18 = com.tencent.mm.R.raw.websearch_icon_question;
                    break;
                case 16777728:
                    i18 = com.tencent.mm.R.raw.websearch_icon_baike;
                    break;
                case 16793600:
                    i18 = com.tencent.mm.R.raw.websearch_icon_product;
                    break;
                default:
                    i18 = com.tencent.mm.R.raw.icons_outlined_search;
                    break;
            }
        } else {
            i18 = com.tencent.mm.R.raw.websearch_icon_article;
        }
        return getResources().getDrawable(i18);
    }

    public java.lang.String N9() {
        return "";
    }

    public org.json.JSONArray O9() {
        return new org.json.JSONArray();
    }

    public java.lang.String P9() {
        return "";
    }

    public void Q9() {
        android.widget.RelativeLayout relativeLayout = this.W3;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        com.tencent.mm.api.SmileyPanel smileyPanel = this.X3;
        if (smileyPanel != null) {
            smileyPanel.n();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v2, types: [int] */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1, types: [int] */
    /* JADX WARN: Type inference failed for: r28v2 */
    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public void R7(int i17, android.os.Bundle bundle) {
        char c17;
        if (i17 == 128) {
            this.Q2.post(new com.tencent.mm.plugin.webview.ui.tools.fts.d0(this, bundle.getString("fts_key_json_data", "")));
            return;
        }
        if (i17 == 137) {
            java.lang.String string = bundle.getString("fts_key_json_data");
            if (s9() != null) {
                try {
                    nw4.n s96 = s9();
                    org.json.JSONObject jSONObject = new org.json.JSONObject(string);
                    if (s96.f340895i) {
                        com.tencent.mm.sdk.platformtools.u3.h(new nw4.x0(s96, nw4.x2.d("onGetMatchContactList", jSONObject, s96.f340903q, s96.f340904r)));
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "not ready");
                    }
                    return;
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.BaseSearchWebViewUI", e17, "", new java.lang.Object[0]);
                    return;
                }
            }
            return;
        }
        if (i17 == 145) {
            nw4.n s97 = s9();
            if (!s97.f340895i) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onGetPoiInfo fail, not ready");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onGetPoiInfo success, ready");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("json", bundle.getString("json"));
            hashMap.put("searchId", bundle.getString("searchId"));
            hashMap.put("poiId", bundle.getString("poiId"));
            com.tencent.mm.sdk.platformtools.u3.h(new nw4.g1(s97, nw4.x2.c("onGetPoiInfoReturn", hashMap, s97.f340903q, s97.f340904r)));
            return;
        }
        if (i17 == 100002) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.BaseSearchWebViewUI", "can not find FTSSearchWidgetMgr to handle tapSearchWAWidgetView");
            nw4.n s98 = s9();
            java.lang.String string2 = bundle.getString("");
            java.lang.String string3 = bundle.getString("widgetId");
            if (!s98.f340895i) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onSearchWAWidgetOnTapCallback fail, not ready");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onSearchWAWidgetOnTapCallback success, ready");
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("eventId", string2);
            hashMap2.put("widgetId", string3);
            hashMap2.put("hitTest", java.lang.Boolean.FALSE);
            hashMap2.put("err_msg", "can not find FTSSearchWidgetMgr to handle tapSearchWAWidgetView");
            com.tencent.mm.sdk.platformtools.u3.h(new nw4.i1(s98, nw4.x2.c("onSearchWAWidgetOnTapCallback", hashMap2, s98.f340903q, s98.f340904r)));
            return;
        }
        switch (i17) {
            case 133:
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.String string4 = bundle.getString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                java.lang.String string5 = bundle.getString("desc");
                try {
                    org.json.JSONArray jSONArray = new org.json.JSONArray(bundle.getString("items"));
                    for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                        org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i18);
                        if (optJSONObject != null) {
                            su4.i2 i2Var = new su4.i2();
                            i2Var.f412931a = optJSONObject.optString("icon");
                            i2Var.f412932b = optJSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                            i2Var.f412934d = optJSONObject.optInt("selected") == 1;
                            i2Var.f412933c = optJSONObject.optString("desc");
                            arrayList.add(i2Var);
                        }
                    }
                } catch (org.json.JSONException e18) {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.BaseSearchWebViewUI", com.tencent.mm.sdk.platformtools.z3.c(e18));
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                com.tencent.mm.plugin.webview.ui.tools.fts.v2 v2Var = com.tencent.mm.plugin.webview.ui.tools.fts.v2.f184667c;
                com.tencent.mm.plugin.webview.ui.tools.fts.e0 e0Var = new com.tencent.mm.plugin.webview.ui.tools.fts.e0(this);
                v2Var.getClass();
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this, 2, true);
                int hashCode = k0Var.hashCode();
                k0Var.D = new com.tencent.mm.plugin.webview.ui.tools.fts.r2(v2Var, arrayList);
                k0Var.f211872n = new com.tencent.mm.plugin.webview.ui.tools.fts.s2(v2Var, arrayList, k0Var);
                k0Var.f211881s = new com.tencent.mm.plugin.webview.ui.tools.fts.t2(v2Var, e0Var, hashCode);
                k0Var.f211854d = new com.tencent.mm.plugin.webview.ui.tools.fts.u2(v2Var, e0Var, hashCode);
                android.view.View inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.cir, null);
                if (android.text.TextUtils.isEmpty(string4)) {
                    android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.obc);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSearchActionSheetMgr", "showActionSheet", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/plugin/websearch/api/OnChooseWidgetItemClickLsn;)I", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSearchActionSheetMgr", "showActionSheet", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/plugin/websearch/api/OnChooseWidgetItemClickLsn;)I", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.obc)).setText(string4);
                }
                if (android.text.TextUtils.isEmpty(string5)) {
                    android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.nqr);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSearchActionSheetMgr", "showActionSheet", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/plugin/websearch/api/OnChooseWidgetItemClickLsn;)I", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSearchActionSheetMgr", "showActionSheet", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/plugin/websearch/api/OnChooseWidgetItemClickLsn;)I", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.nqr)).setText(string5);
                }
                k0Var.Y1 = true;
                k0Var.s(inflate, false);
                k0Var.v();
                ((java.util.HashMap) v2Var.f184668a).put(java.lang.Integer.valueOf(hashCode), k0Var);
                bundle.putInt("actionSheetId", hashCode);
                return;
            case 134:
                com.tencent.mm.ui.widget.dialog.k0 k0Var2 = (com.tencent.mm.ui.widget.dialog.k0) ((java.util.HashMap) com.tencent.mm.plugin.webview.ui.tools.fts.v2.f184667c.f184668a).remove(java.lang.Integer.valueOf(bundle.getInt("actionSheetId")));
                if (k0Var2 != null) {
                    k0Var2.u();
                    return;
                }
                return;
            case 135:
                if (bundle.getBoolean("FTS_KEY_onStartWebSearch_isBack", false)) {
                    aa(bundle.getInt("FTS_KEY_onStartWebSearch_type", 0), bundle.getString("FTS_KEY_onStartWebSearch_query"), (java.util.Map) bundle.getSerializable("FTS_KEY_onStartWebSearch_params"));
                    return;
                } else {
                    B9(bundle.getInt("FTS_KEY_onStartWebSearch_type", 0), bundle.getString("FTS_KEY_onStartWebSearch_query"), (java.util.Map) bundle.getSerializable("FTS_KEY_onStartWebSearch_params"));
                    return;
                }
            default:
                switch (i17) {
                    case 148:
                        this.Q2.post(new com.tencent.mm.plugin.webview.ui.tools.fts.m0(this, bundle.getString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, ""), bundle.getString("icon", ""), bundle.getInt("duration", 500), bundle.getInt("mask", 0) > 0));
                        return;
                    case com.tencent.mm.plugin.appbrand.jsapi.pay.a2.CTRL_INDEX /* 149 */:
                        this.Q2.post(new com.tencent.mm.plugin.webview.ui.tools.fts.n0(this, bundle.getString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, ""), bundle.getInt("mask", 0) > 0));
                        return;
                    case 150:
                        S9();
                        return;
                    case 151:
                        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "GOTO_EMOTICON");
                        hideVKB();
                        java.lang.String string6 = bundle.getString("requestId");
                        if (this.X3 == null) {
                            com.tencent.mm.api.SmileyPanel b17 = qk.w9.b(this);
                            this.X3 = b17;
                            int i19 = com.tencent.mm.pluginsdk.ui.ChatFooterPanel.f189765e;
                            b17.setEntranceScene(107);
                            this.X3.setVisibility(0);
                            this.X3.setShowSmiley(false);
                            this.X3.i();
                            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, qk.w9.a(this));
                            layoutParams.addRule(12);
                            this.W3.addView(this.X3, layoutParams);
                            android.widget.TextView textView = new android.widget.TextView(getApplicationContext());
                            textView.setBackgroundColor(i65.a.d(this, com.tencent.mm.R.color.BW_93));
                            textView.setPadding(0, i65.a.f(this, com.tencent.mm.R.dimen.f479688cn), 0, i65.a.f(this, com.tencent.mm.R.dimen.f479688cn));
                            textView.setTextColor(i65.a.d(this, com.tencent.mm.R.color.f479232tk));
                            textView.setTextSize(15.0f);
                            textView.setText(com.tencent.mm.R.string.id_);
                            textView.setGravity(17);
                            android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
                            layoutParams2.addRule(12);
                            layoutParams2.bottomMargin = qk.w9.a(this);
                            this.W3.addView(textView, layoutParams2);
                            qk.v9 d17 = qk.w9.d();
                            d17.f364351a = new com.tencent.mm.plugin.webview.ui.tools.fts.p0(this, string6);
                            this.X3.setCallback(d17);
                        }
                        this.W3.setVisibility(0);
                        return;
                    case 152:
                        this.Q2.post(new com.tencent.mm.plugin.webview.ui.tools.fts.q0(this, bundle.getInt("fts_key_ret_code"), bundle.getString("fts_key_err_msg"), bundle.getString("fts_key_json_data", "")));
                        return;
                    case com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS /* 153 */:
                        this.Q2.post(new com.tencent.mm.plugin.webview.ui.tools.fts.c0(this, bundle.getInt("fts_key_ret_code"), bundle.getString("fts_key_err_msg"), bundle.getString("fts_key_json_data", ""), bundle.getString("fts_key_id", "")));
                        return;
                    default:
                        switch (i17) {
                            case 200000:
                                lw4.g gVar = this.T3;
                                if (gVar != null) {
                                    int D1 = com.tencent.mm.sdk.platformtools.t8.D1(bundle.getString("playerId"), 0);
                                    java.lang.String string7 = bundle.getString("viewProps");
                                    java.lang.String string8 = bundle.getString("videoProps");
                                    lw4.f fVar = gVar.f321656e;
                                    com.tencent.mars.xlog.Log.i("FtsVideoPlayerMgr", "insert player id %d,viewProps %s,videoProps %s", java.lang.Integer.valueOf(D1), string7, string8);
                                    try {
                                        if (!android.text.TextUtils.isEmpty(string7) && !android.text.TextUtils.isEmpty(string8)) {
                                            org.json.JSONObject jSONObject2 = new org.json.JSONObject(string7);
                                            org.json.JSONObject jSONObject3 = new org.json.JSONObject(string8);
                                            com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView ftsWebVideoView = (com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView) gVar.f321655d.a();
                                            android.content.Context context = gVar.f321652a;
                                            if (ftsWebVideoView == null) {
                                                ftsWebVideoView = new com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView(context, jSONObject3.optBoolean("autoPlay"));
                                            } else {
                                                ftsWebVideoView.q();
                                            }
                                            ftsWebVideoView.setIsShowBasicControls(true);
                                            ftsWebVideoView.setVideoSizeByte(jSONObject3.optInt("fileSize"));
                                            ftsWebVideoView.setMute(jSONObject3.optBoolean("isMute"));
                                            ftsWebVideoView.k(jSONObject3.optString("coverUrl"), "");
                                            ftsWebVideoView.setVideoPlayerId(D1);
                                            ftsWebVideoView.setAutoPlay(jSONObject3.optBoolean("autoPlay"));
                                            ftsWebVideoView.n(lw4.h.c(jSONObject3), false, jSONObject3.optInt("durationSec"));
                                            ftsWebVideoView.setFullScreenDelegate(new lw4.c(gVar, D1, new lw4.b(gVar, ftsWebVideoView)));
                                            lw4.d dVar = new lw4.d(gVar, ftsWebVideoView);
                                            ftsWebVideoView.setUiLifecycleListener(dVar);
                                            ((java.util.HashSet) ((com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI) fVar).U3).add(dVar);
                                            ftsWebVideoView.setCallback(new lw4.j(ftsWebVideoView, fVar, gVar.f321653b));
                                            kw4.c0 c0Var = gVar.f321654c;
                                            float[] d18 = lw4.h.d(jSONObject2, context);
                                            ?? r28 = jSONObject2.has("visible") ? !jSONObject2.optBoolean("visible") : 2147483647;
                                            c0Var.getClass();
                                            kw4.w wVar = new kw4.w(c0Var, 1000L, java.lang.Boolean.FALSE, ftsWebVideoView, D1, 0, d18, r28);
                                            if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
                                                ((java.lang.Boolean) wVar.a(null)).booleanValue();
                                                return;
                                            } else {
                                                ((java.lang.Boolean) wVar.a(c0Var.f313156b)).booleanValue();
                                                return;
                                            }
                                        }
                                        com.tencent.mars.xlog.Log.e("FtsVideoPlayerMgr", "insert args invalid");
                                        return;
                                    } catch (org.json.JSONException e19) {
                                        com.tencent.mars.xlog.Log.e("FtsVideoPlayerMgr", "", e19);
                                        return;
                                    }
                                }
                                return;
                            case 200001:
                                lw4.g gVar2 = this.T3;
                                if (gVar2 != null) {
                                    int D12 = com.tencent.mm.sdk.platformtools.t8.D1(bundle.getString("playerId"), 0);
                                    java.lang.String string9 = bundle.getString("viewProps");
                                    java.lang.String string10 = bundle.getString("videoProps");
                                    com.tencent.mars.xlog.Log.i("FtsVideoPlayerMgr", "update player id %d,viewProps %s,videoProps %s", java.lang.Integer.valueOf(D12), string9, string10);
                                    try {
                                        boolean isEmpty = android.text.TextUtils.isEmpty(string9);
                                        kw4.c0 c0Var2 = gVar2.f321654c;
                                        if (!isEmpty) {
                                            org.json.JSONObject jSONObject4 = new org.json.JSONObject(string9);
                                            float[] d19 = lw4.h.d(jSONObject4, gVar2.f321652a);
                                            ?? r262 = jSONObject4.has("visible") ? !jSONObject4.optBoolean("visible") : 2147483647;
                                            c0Var2.getClass();
                                            kw4.y yVar = new kw4.y(c0Var2, 1000L, java.lang.Boolean.FALSE, D12, d19, r262);
                                            if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
                                                ((java.lang.Boolean) yVar.a(null)).booleanValue();
                                            } else {
                                                ((java.lang.Boolean) yVar.a(c0Var2.f313156b)).booleanValue();
                                            }
                                        }
                                        if (android.text.TextUtils.isEmpty(string10)) {
                                            return;
                                        }
                                        org.json.JSONObject jSONObject5 = new org.json.JSONObject(string10);
                                        com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView ftsWebVideoView2 = (com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView) c0Var2.d(D12);
                                        if (ftsWebVideoView2 == null) {
                                            com.tencent.mars.xlog.Log.i("FtsVideoPlayerMgr", "can not find video View by id %d", java.lang.Integer.valueOf(D12));
                                            return;
                                        }
                                        if (jSONObject5.has("autoPlay")) {
                                            ftsWebVideoView2.setAutoPlay(jSONObject5.optBoolean("autoPlay"));
                                        }
                                        if (jSONObject5.has("coverUrl")) {
                                            ftsWebVideoView2.k(jSONObject5.optString("coverUrl"), "");
                                        }
                                        if (jSONObject5.has("durationSec")) {
                                            ftsWebVideoView2.setDuration(jSONObject5.optInt("durationSec"));
                                        }
                                        if (jSONObject5.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_PLAY_URL)) {
                                            ftsWebVideoView2.n(lw4.h.c(jSONObject5), false, jSONObject5.optInt("durationSec"));
                                        }
                                        if (jSONObject5.has("isMute")) {
                                            ftsWebVideoView2.setMute(jSONObject5.optBoolean("isMute"));
                                            return;
                                        }
                                        return;
                                    } catch (org.json.JSONException e27) {
                                        com.tencent.mars.xlog.Log.e("FtsVideoPlayerMgr", "", e27);
                                        return;
                                    }
                                }
                                return;
                            case 200002:
                                lw4.g gVar3 = this.T3;
                                if (gVar3 != null) {
                                    int D13 = com.tencent.mm.sdk.platformtools.t8.D1(bundle.getString("playerId"), 0);
                                    com.tencent.mars.xlog.Log.i("FtsVideoPlayerMgr", "remove palyer id %d", java.lang.Integer.valueOf(D13));
                                    kw4.c0 c0Var3 = gVar3.f321654c;
                                    com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView ftsWebVideoView3 = (com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView) c0Var3.d(D13);
                                    if (ftsWebVideoView3 != null) {
                                        ftsWebVideoView3.getUiLifecycleListener();
                                        gVar3.f321656e.getClass();
                                    } else {
                                        com.tencent.mars.xlog.Log.w("FtsVideoPlayerMgr", "can not find player by id %d", java.lang.Integer.valueOf(D13));
                                    }
                                    kw4.x xVar = new kw4.x(c0Var3, 1000L, java.lang.Boolean.FALSE, D13);
                                    if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
                                        ((java.lang.Boolean) xVar.a(null)).booleanValue();
                                    } else {
                                        ((java.lang.Boolean) xVar.a(c0Var3.f313156b)).booleanValue();
                                    }
                                    if (ftsWebVideoView3 != null) {
                                        ftsWebVideoView3.q();
                                        ftsWebVideoView3.getCallback().f();
                                        ftsWebVideoView3.setCallback(null);
                                        ftsWebVideoView3.setVisibility(0);
                                        ftsWebVideoView3.setAllowMobileNetPlay(false);
                                        gVar3.f321655d.b(ftsWebVideoView3);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 200003:
                                lw4.g gVar4 = this.T3;
                                if (gVar4 != null) {
                                    int D14 = com.tencent.mm.sdk.platformtools.t8.D1(bundle.getString("playerId"), 0);
                                    java.lang.String string11 = bundle.getString("type");
                                    com.tencent.mars.xlog.Log.i("FtsVideoPlayerMgr", "op player id %d,type %s", java.lang.Integer.valueOf(D14), string11);
                                    com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView ftsWebVideoView4 = (com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView) gVar4.f321654c.d(D14);
                                    if (ftsWebVideoView4 == null) {
                                        com.tencent.mars.xlog.Log.i("FtsVideoPlayerMgr", "can not find player by id %d", java.lang.Integer.valueOf(D14));
                                        return;
                                    }
                                    string11.getClass();
                                    switch (string11.hashCode()) {
                                        case 3443508:
                                            if (string11.equals(com.tencent.tav.core.AssetExtension.SCENE_PLAY)) {
                                                c17 = 0;
                                                break;
                                            }
                                            c17 = 65535;
                                            break;
                                        case 3540994:
                                            if (string11.equals("stop")) {
                                                c17 = 1;
                                                break;
                                            }
                                            c17 = 65535;
                                            break;
                                        case 106440182:
                                            if (string11.equals("pause")) {
                                                c17 = 2;
                                                break;
                                            }
                                            c17 = 65535;
                                            break;
                                        case 640038740:
                                            if (string11.equals("setUnMute")) {
                                                c17 = 3;
                                                break;
                                            }
                                            c17 = 65535;
                                            break;
                                        case 1984790939:
                                            if (string11.equals("setMute")) {
                                                c17 = 4;
                                                break;
                                            }
                                            c17 = 65535;
                                            break;
                                        default:
                                            c17 = 65535;
                                            break;
                                    }
                                    switch (c17) {
                                        case 0:
                                            ftsWebVideoView4.p(false);
                                            return;
                                        case 1:
                                            ftsWebVideoView4.q();
                                            return;
                                        case 2:
                                            ftsWebVideoView4.i();
                                            return;
                                        case 3:
                                            ftsWebVideoView4.setMute(false);
                                            return;
                                        case 4:
                                            ftsWebVideoView4.setMute(true);
                                            return;
                                        default:
                                            com.tencent.mars.xlog.Log.i("FtsVideoPlayerMgr", "unknown op type %s", string11);
                                            return;
                                    }
                                }
                                return;
                            default:
                                super.R7(i17, bundle);
                                return;
                        }
                }
        }
    }

    public void R9() {
    }

    public void T9(java.lang.Boolean bool) {
        if (this.A1 || !this.R3 || bool.booleanValue()) {
            super.hideVKB();
        }
    }

    public final void U9() {
        if (this.f184268z4 != null) {
            return;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("fts_float_ball_key");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            return;
        }
        com.tencent.mm.plugin.ball.service.s4 s4Var = new com.tencent.mm.plugin.ball.service.s4(new dp1.a(this));
        this.f184268z4 = s4Var;
        s4Var.b(57, stringExtra);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.tencent.mm.plugin.multitask.ui.base.MultiTaskViewPager] */
    public final void V9() {
        ?? r17;
        if (this.f184267y4 == null && ((com.tencent.mm.plugin.multitask.model.MultiTaskInfo) getIntent().getParcelableExtra("fts_multi_task_info")) != null) {
            com.tencent.mm.plugin.webview.ui.tools.ia iaVar = new com.tencent.mm.plugin.webview.ui.tools.ia(this, this);
            vx4.c cVar = new vx4.c(iaVar, this);
            this.f184267y4 = cVar;
            jz5.g gVar = cVar.f441316y;
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = (com.tencent.mm.plugin.multitask.model.MultiTaskInfo) ((jz5.n) gVar).getValue();
            cVar.y(30, multiTaskInfo != null ? multiTaskInfo.field_id : null);
            cVar.f441315x = true;
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo2 = (com.tencent.mm.plugin.multitask.model.MultiTaskInfo) ((jz5.n) gVar).getValue();
            if (multiTaskInfo2 != null) {
                cVar.f300077a = multiTaskInfo2;
            }
            ak3.d dVar = iaVar.f5584f;
            if (dVar != null && (r17 = ((rk3.i) dVar).f396522b) != 0) {
                iaVar = r17;
            }
            this.f183856s3 = iaVar;
        }
    }

    public java.lang.Boolean W9() {
        return null;
    }

    public boolean X9() {
        return this instanceof com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public void Y7() {
        int i17 = this.H3;
        if (i17 == 1) {
            if (getContentView() == null) {
                this.f183815f.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.anj));
                return;
            }
            setBackGroundColorResource(com.tencent.mm.R.color.anj);
            getContentView().setBackgroundResource(com.tencent.mm.R.color.anj);
            this.f183815f.setBackgroundColor(0);
            this.f183865w.setBackgroundResource(android.R.color.transparent);
            this.f183867x.setBackgroundResource(android.R.color.transparent);
            return;
        }
        if (i17 != 2) {
            super.Y7();
            return;
        }
        if (getContentView() == null) {
            this.f183815f.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.ank));
            return;
        }
        setBackGroundColorResource(com.tencent.mm.R.color.ank);
        getContentView().setBackgroundResource(com.tencent.mm.R.color.ank);
        this.f183815f.setBackgroundColor(0);
        this.f183865w.setBackgroundResource(android.R.color.transparent);
        this.f183867x.setBackgroundResource(android.R.color.transparent);
    }

    public void Y9(int i17, int i18) {
        Z9(i17, i18, false, null);
    }

    public void Z9(int i17, int i18, boolean z17, com.tencent.mm.plugin.webview.ui.tools.fts.r0 r0Var) {
        java.lang.String P9 = P9();
        java.lang.String N9 = N9();
        org.json.JSONArray O9 = O9();
        boolean z18 = this.f184247d4;
        java.lang.Boolean W9 = W9();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("totalQuery: ");
        sb6.append(P9);
        sb6.append(", inEditTextQuery: ");
        sb6.append(N9);
        sb6.append(", lastFromVoice: ");
        sb6.append(z18 ? "yes" : "no");
        sb6.append(", isCancelButtonClick: ");
        sb6.append(i17 > 0 ? "yes" : "no");
        sb6.append(", isInputChange: ");
        sb6.append(i18 > 0 ? "yes" : "no");
        sb6.append(", highPriority: ");
        sb6.append(z17 ? "yes" : "no");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", sb6.toString());
        this.Q2.post(new com.tencent.mm.plugin.webview.ui.tools.fts.k0(this, i17, P9, N9, O9, z18, i18, W9, z17, r0Var));
    }

    public void aa(int i17, java.lang.String str, java.util.Map map) {
    }

    public void ba() {
        C9(getResources().getColor(com.tencent.mm.R.color.aaw));
    }

    public void ca(java.lang.String str, int i17, java.util.HashMap hashMap) {
        int i18 = 0;
        int parseInt = (hashMap == null || !hashMap.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) ? 0 : java.lang.Integer.parseInt((java.lang.String) hashMap.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE));
        if (!((s50.u0) ((u50.z) i95.n0.c(u50.z.class))).Ai(parseInt) || !com.tencent.mm.sdk.platformtools.w9.f193053a.equals(com.tencent.mm.ipcinvoker.y.a())) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("key_image_path", str);
            bundle.putInt("key_img_source", i17);
            if (hashMap != null && hashMap.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
                bundle.putInt("key_scene", parseInt);
            }
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$$d.class, null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "openSearchImgIpc, direct enterCircleToSearchUI for finder scene " + parseInt + ", imgPath = " + str + ", source = " + i17);
        switch (i17) {
            case 18:
            case 20:
                i18 = 6;
                break;
            case 19:
            case 21:
                i18 = 7;
                break;
        }
        D9(this, 19, i18, str, i17);
    }

    public void da(java.lang.String str) {
    }

    public void ea() {
        try {
            java.lang.String string = com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).getString("sos_fts_search_data_tmp", "");
            new org.json.JSONObject();
            if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                return;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(string);
            this.f184263u4 = jSONObject.optString("requestId");
            this.f184251h4 = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            this.f184252i4 = jSONObject.optInt("type");
            this.f184250g4 = jSONObject.optString("searchId");
            jSONObject.optString("url");
            this.f184254k4 = jSONObject.optString("parentSearchID");
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "tryLoadSearchData, searchData: %s", string);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebSearch.BaseSearchWebViewUI", "SOS_FTS_SEARCH_DATA_TMP Exception: %s", e17.getMessage());
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public boolean f7() {
        return true;
    }

    public void fa(float f17, float f18, int i17, boolean z17) {
        if (this.f184266x4 != 0) {
            com.tencent.mm.autogen.events.SetMPHalfScreenHeightEvent setMPHalfScreenHeightEvent = new com.tencent.mm.autogen.events.SetMPHalfScreenHeightEvent();
            int i18 = this.f184266x4;
            am.bu buVar = setMPHalfScreenHeightEvent.f54767g;
            buVar.f6285a = i18;
            buVar.f6288d = f17;
            buVar.f6286b = f18;
            buVar.f6287c = i17 / 1000.0f;
            buVar.f6289e = z17;
            setMPHalfScreenHeightEvent.e();
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        java.lang.String str;
        boolean booleanExtra = getIntent().getBooleanExtra("isExitForReport", false);
        java.lang.String stringExtra = getIntent().getStringExtra("docInfoForReport");
        if (booleanExtra && stringExtra != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "finish exitByRemoveWebviewPage, %s", stringExtra);
            H9(vu4.a.K, vu4.b.f440276z, stringExtra);
        }
        com.tencent.mm.plugin.ball.service.s4 s4Var = this.f184268z4;
        if (s4Var != null) {
            if (s4Var.s0()) {
                ep1.m.e(this);
                this.f184268z4.g0(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        super/*com.tencent.mm.plugin.webview.ui.tools.WebViewUI*/.finish();
                    }
                });
            } else {
                super.finish();
            }
            this.f184268z4.p();
        } else {
            super.finish();
        }
        vx4.c cVar = this.f184267y4;
        boolean z17 = cVar != null && cVar.a();
        if (com.tencent.mm.ui.bk.v0() && com.tencent.mm.ui.bk.y() && !z17) {
            overridePendingTransition(0, com.tencent.mm.ui.uc.f211085h);
        }
        if (this.f184262t4) {
            return;
        }
        this.f184262t4 = true;
        java.util.HashMap hashMap = this.f184261s4;
        hashMap.put("finishtime", java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("exittype", hashMap.get("exittype"));
            str = jSONObject.toString().replace(",", "_");
        } catch (java.lang.Exception unused) {
            str = "";
        }
        ea();
        if ((this instanceof com.tencent.mm.plugin.webview.ui.tools.fts.FTSSearchTabWebViewUI) || (this instanceof com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI)) {
            this.f184253j4 = 4;
        }
        ((s50.r0) ((u50.y) i95.n0.c(u50.y.class))).wi((java.lang.String) hashMap.get("query"), this.B3, this.f184250g4, this.f184263u4, this.Y3, str, this.f184252i4, this.f184253j4, this.f184254k4, 2);
        com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putString("sos_fts_search_data_tmp", "");
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.MMFragmentActivity
    public void initActivityCloseAnimation() {
        vx4.c cVar = this.f184267y4;
        boolean z17 = cVar != null && cVar.a();
        if (com.tencent.mm.ui.bk.v0() && com.tencent.mm.ui.bk.y() && !z17) {
            overridePendingTransition(0, com.tencent.mm.ui.uc.f211085h);
        } else {
            super.initActivityCloseAnimation();
        }
    }

    @Override // qx4.b
    public void l1() {
        ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).wi(this, this.D4);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI
    public void m9() {
        int i17 = this.Y3;
        java.lang.String str = this.B3;
        java.lang.String str2 = this.C3;
        int i18 = this.f184244a4;
        su4.k2.i(12, i17, str, str2, "", 0, i18 == 0, "", true, this.f184246c4, this.f184249f4, i18, this.A3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 101) {
            super.onActivityResult(i17, i18, intent);
            return;
        }
        if (i18 == -1) {
            if (intent == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "onActivityResult, data = null.");
                return;
            }
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel = (com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel) intent.getParcelableExtra("KSEGMENTMEDIAINFO");
            if (captureDataManager$CaptureVideoNormalModel == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "onActivityResult, model = null.");
                return;
            }
            boolean X9 = X9();
            int i19 = 0;
            boolean z17 = 1;
            if (captureDataManager$CaptureVideoNormalModel.a() != null) {
                int intValue = ((java.lang.Integer) captureDataManager$CaptureVideoNormalModel.a().b("KEY_MEDIA_SOURCE_INT", -1)).intValue();
                if (intValue != 1 && intValue != 2) {
                    i19 = 1;
                }
                z17 = i19;
                i19 = intValue;
            }
            int i27 = X9 ? z17 != 0 ? 21 : 20 : z17 != 0 ? 19 : 18;
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "isSearchState = %b, source = %d, isFromAlbum = %b, model.getReportInfo() = %s, type = %d.", java.lang.Boolean.valueOf(X9), java.lang.Integer.valueOf(i27), java.lang.Boolean.valueOf(z17), captureDataManager$CaptureVideoNormalModel.a(), java.lang.Integer.valueOf(i19));
            ca(captureDataManager$CaptureVideoNormalModel.f155662f, i27, this.f184257o4);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Q9();
        java.util.Iterator it = ((java.util.HashSet) this.U3).iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            z17 |= ((lw4.e) it.next()).onBackPressed();
        }
        if (z17) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onCancel() {
        super.onCancel();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "onCancel");
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() != null) {
            this.S3 = getIntent().getBooleanExtra("jumpto_sns_contact_page", false);
        }
        if (this.T3 == null) {
            this.T3 = new lw4.g(getContext(), this.f183815f, this);
        }
        this.R3 = getIntent().getBooleanExtra("ftsneedkeyboard", false);
        this.Y3 = getIntent().getIntExtra("ftsbizscene", 0);
        this.f184256m4 = ((s50.u0) ((u50.z) i95.n0.c(u50.z.class))).Ai(this.Y3);
        u50.z zVar = (u50.z) i95.n0.c(u50.z.class);
        int i17 = this.Y3;
        s50.u0 u0Var = (s50.u0) zVar;
        ((k23.b3) ((jz5.n) u0Var.f403123d).getValue()).getClass();
        if (j62.e.g().i("clicfg_fts_search_finder_webview_new_style_android", 0, true, true) > 0) {
            u0Var.Bi(i17);
        }
        int i18 = this.Y3;
        this.Z3 = i18;
        this.f184251h4 = i18;
        this.f184255l4 = getIntent().getBooleanExtra("key_search_icon_and_hint_fix_default", false);
        this.f184258p4 = getIntent().getStringExtra("searchPlaceHolder");
        this.f184265w4 = getIntent().getBooleanExtra("ftsisfinderhalfscreen", false);
        this.f184266x4 = getIntent().getIntExtra("key_halfscreen_id", 0);
        this.f184244a4 = getIntent().getIntExtra("ftsType", 0);
        this.f184246c4 = getIntent().getStringExtra("ftsQuery");
        this.f184247d4 = getIntent().getBooleanExtra("isFromVoice", false);
        this.f184249f4 = getIntent().getStringExtra("tabId");
        java.lang.String stringExtra = getIntent().getStringExtra("searchId");
        this.f184250g4 = stringExtra;
        int i19 = this.f184244a4;
        this.f184245b4 = i19;
        this.f184252i4 = i19;
        su4.k2.i(1, this.Y3, this.B3, this.C3, stringExtra, 0, i19 == 0, "", true, this.f184246c4, this.f184249f4, i19, this.A3);
        if (this.f184247d4) {
            this.f184248e4 = this.f184246c4;
        }
        if (this.f184266x4 != 0) {
            this.f183815f.setInputOutOfKeyboardEnable(false);
        }
        android.view.View inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.cix, null);
        inflate.setBackgroundResource(com.tencent.mm.R.color.a9e);
        inflate.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f184259q4 = inflate;
        if (getContentView() instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) getContentView()).addView(this.f184259q4);
        }
        S9();
        this.W3 = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.dcu);
        this.A4.alive();
        this.B4.alive();
        this.C4.alive();
        this.f184264v4 = 0;
        U9();
        com.tencent.mm.plugin.ball.service.s4 s4Var = this.f184268z4;
        if (s4Var != null) {
            s4Var.x();
        }
        observe(new e75.a() { // from class: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$$b
            @Override // e75.a
            public final void onChanged(java.lang.Object obj) {
                int i27 = com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.E4;
                final com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI = com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.this;
                baseSearchWebViewUI.getClass();
                ((wu4.b) obj).b(wu4.a.class, new j75.l() { // from class: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$$c
                    @Override // j75.l
                    public final void a(j75.d dVar) {
                        int i28 = com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.E4;
                        com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI2 = com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.this;
                        qx4.d0 d0Var = baseSearchWebViewUI2.E3;
                        if (d0Var != null) {
                            d0Var.e((com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView) baseSearchWebViewUI2.f183815f, baseSearchWebViewUI2.z2());
                        }
                    }
                });
            }
        });
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.NewLifeCommonApiEvent>(this, this) { // from class: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.5
            {
                this.__eventId = 1090607959;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.NewLifeCommonApiEvent newLifeCommonApiEvent) {
                if (newLifeCommonApiEvent.f54533g == null) {
                    return false;
                }
                throw null;
            }
        }.alive();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A4.dead();
        this.B4.dead();
        this.C4.dead();
        java.util.Set set = this.U3;
        java.util.Iterator it = ((java.util.HashSet) set).iterator();
        while (it.hasNext()) {
            ((lw4.e) it.next()).onDestroy();
        }
        ((java.util.HashSet) set).clear();
        int i17 = this.Y3;
        java.lang.String str = this.B3;
        java.lang.String str2 = this.C3;
        int i18 = this.f184244a4;
        boolean z17 = i18 == 0;
        java.lang.String str3 = this.f184246c4;
        boolean z18 = this.A3;
        su4.k2.i(14, i17, str, str2, "", 0, z17, "", true, str3, "", i18, z18);
        if (i17 == 20) {
            su4.k2.i(214, i17, str, str2, "", 0, z17, "", true, str3, "", i18, z18);
        }
        vx4.c cVar = this.f184267y4;
        if (cVar != null) {
            cVar.getClass();
        }
        com.tencent.mm.plugin.ball.service.s4 s4Var = this.f184268z4;
        if (s4Var != null) {
            s4Var.o0();
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        java.util.Set set = this.U3;
        if (i17 == 25) {
            java.util.Iterator it = ((java.util.HashSet) set).iterator();
            while (it.hasNext()) {
                ((lw4.e) it.next()).e();
            }
        } else if (i17 == 24) {
            java.util.Iterator it6 = ((java.util.HashSet) set).iterator();
            while (it6.hasNext()) {
                ((lw4.e) it6.next()).d();
            }
        }
        vx4.c cVar = this.f184267y4;
        if (cVar == null || !cVar.U(2, false)) {
            return super.onKeyDown(i17, keyEvent);
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.ui.widget.MMWebView mMWebView;
        super.onPause();
        ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).Bi(this, this.D4);
        java.util.Iterator it = ((java.util.HashSet) this.U3).iterator();
        while (it.hasNext()) {
            ((lw4.e) it.next()).c();
        }
        if (this.f184264v4 == 1 && (mMWebView = this.f183815f) != null) {
            mMWebView.onResume();
        }
        vx4.c cVar = this.f184267y4;
        if (cVar != null) {
            cVar.A();
        }
        com.tencent.mm.plugin.ball.service.s4 s4Var = this.f184268z4;
        if (s4Var != null) {
            s4Var.z();
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.String str = "";
        if (iArr.length > 0) {
            str = iArr[0] + "";
        }
        objArr[0] = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "onRequestPermissionsResult, granted ? %s", objArr);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        java.util.Iterator it = ((java.util.HashSet) this.U3).iterator();
        while (it.hasNext()) {
            ((lw4.e) it.next()).b();
        }
        vx4.c cVar = this.f184267y4;
        if (cVar != null) {
            cVar.z();
        }
        com.tencent.mm.plugin.ball.service.s4 s4Var = this.f184268z4;
        if (s4Var != null) {
            s4Var.x();
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onSwipeBack() {
        super.onSwipeBack();
        G9(vu4.a.K, vu4.b.f440274x);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public boolean r8() {
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI
    public void u9() {
        super.u9();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "jsapi ready");
        int i17 = su4.k2.f412978a;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI
    public void v9() {
        V9();
        vx4.c cVar = this.f184267y4;
        if (cVar != null) {
            cVar.z();
        }
        U9();
        com.tencent.mm.plugin.ball.service.s4 s4Var = this.f184268z4;
        if (s4Var != null) {
            s4Var.x();
        }
    }

    @Override // av4.j
    public int z2() {
        wu4.b bVar;
        rx4.n2 n2Var = (rx4.n2) pf5.z.f353948a.a(this).a(rx4.n2.class);
        j75.f Q6 = n2Var.Q6();
        return a06.d.b(((Q6 == null || (bVar = (wu4.b) Q6.getState()) == null) ? 0 : bVar.f449840e) / i65.a.g(n2Var.getActivity()));
    }
}
