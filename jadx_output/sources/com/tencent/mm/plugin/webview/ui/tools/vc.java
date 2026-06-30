package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public final class vc extends com.tencent.mm.plugin.webview.core.f3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.wc f186973b;

    public vc(com.tencent.mm.plugin.webview.ui.tools.wc wcVar, com.tencent.mm.plugin.webview.ui.tools.WebViewUI.AnonymousClass1 anonymousClass1) {
        this.f186973b = wcVar;
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void a(int i17, java.lang.String str) {
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var = this.f186973b.f187023d.f183849q2;
        if (c6Var.c() == null || c6Var.c().f183815f == null || c6Var.c().f183876z1 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewMenuHelper", "setShareFuncFlag params failed");
            return;
        }
        java.lang.String url = c6Var.c().f183815f.getUrl();
        if (com.tencent.mm.sdk.platformtools.t8.K0(url)) {
            return;
        }
        try {
            if (new java.net.URL(url).getHost().equals(com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9))) {
                int x17 = c6Var.x();
                if (c6Var.c().f183844p0 != null) {
                    c6Var.c().f183844p0.T("setFuncFlag", x17);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewMenuHelper", "create url fail : " + e17.getLocalizedMessage());
        }
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void b(int i17, java.lang.String str, int i18, int i19, java.lang.String str2) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(154L, 12L, 1L, false);
        java.lang.Integer num = (java.lang.Integer) cx4.a.f224582b.get(java.lang.Integer.valueOf(i17));
        if (num == null) {
            num = -1;
        }
        g0Var.idkeyStat(154L, num.intValue(), 1L, false);
        com.tencent.mm.plugin.webview.ui.tools.wc wcVar = this.f186973b;
        wcVar.f187023d.R8(true, true);
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = wcVar.f187023d;
        webViewUI.f183849q2.G = false;
        if (i17 != 0 && i17 != 2) {
            switch (i17) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    return;
            }
        }
        com.tencent.mm.plugin.webview.ui.tools.t7 t7Var = com.tencent.mm.plugin.webview.ui.tools.t7.f186896i;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(t7Var.f186897a)) {
            t7Var.c(3, "", i18);
        }
        if (webViewUI.T1 != null) {
            com.tencent.mm.plugin.webview.core.r0 r0Var = (com.tencent.mm.plugin.webview.core.r0) this.f181833a;
            if (!r0Var.p0(r0Var.f181935j0)) {
                android.view.View view = webViewUI.T1;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "showRefreshMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "showRefreshMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                webViewUI.h9();
                webViewUI.T7();
            }
        }
        webViewUI.f183835m2.b().f183079b = false;
        com.tencent.mm.plugin.webview.model.b6 b6Var = webViewUI.f183835m2;
        if (b6Var.f182799b == null) {
            b6Var.f182799b = new com.tencent.mm.plugin.webview.model.y5(b6Var);
        }
        b6Var.f182799b.a(str, false);
        if (webViewUI.W) {
            webViewUI.finish();
        }
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void c(int i17, java.lang.String reqUrl) {
        kotlin.jvm.internal.o.g(reqUrl, "reqUrl");
        if (i17 != 5) {
            this.f186973b.f187023d.R8(true, false);
        }
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void d() {
        com.tencent.mm.plugin.webview.ui.tools.wc wcVar = this.f186973b;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "WebView-Trace onAuthSucc: url %s", wcVar.f187023d.f183807c2);
        wcVar.f187023d.e9(((com.tencent.mm.plugin.webview.core.r0) this.f181833a).R.c());
        java.util.HashSet hashSet = (java.util.HashSet) wcVar.f187023d.f183849q2.H;
        hashSet.add(6);
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(2);
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var = wcVar.f187023d.f183849q2;
        c6Var.G = true;
        if (c6Var.C()) {
            wcVar.f187023d.X8();
        }
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void e() {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f186973b.f187023d;
        if (webViewUI.f183825i2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUI", "edw postBinded hasDoPostBind");
        } else {
            webViewUI.f183825i2 = true;
            webViewUI.B8();
        }
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void f() {
        this.f186973b.f187023d.finish();
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void g(int i17) {
        com.tencent.mm.plugin.webview.ui.tools.widget.FontChooserView fontChooserView;
        android.view.View view = this.f186973b.f187023d.f183863v;
        if (view == null || (fontChooserView = (com.tencent.mm.plugin.webview.ui.tools.widget.FontChooserView) view.findViewById(com.tencent.mm.R.id.gbf)) == null) {
            return;
        }
        fontChooserView.setSliderIndex(i17 - 1);
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void h() {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f186973b.f187023d;
        webViewUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "forceQuit");
        pm0.v.W(new com.tencent.mm.plugin.webview.ui.tools.ma(webViewUI));
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void i() {
        this.f186973b.f187023d.P7();
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void j() {
        com.tencent.mm.plugin.webview.ui.tools.wc wcVar = this.f186973b;
        wcVar.f187023d.R8(true, true);
        wcVar.f187023d.u8("onCreate");
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void k(int i17, java.lang.String str, r45.s83 s83Var) {
        com.tencent.mm.plugin.webview.ui.tools.wc wcVar = this.f186973b;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = wcVar.f187023d;
        webViewUI.f183807c2 = s83Var.f385545d;
        webViewUI.J1 = webViewUI.f183876z1.c().f(24);
        wcVar.f187023d.f183835m2.b().f183079b = true;
        wcVar.f187023d.Z = x51.j1.d(s83Var.A);
        com.tencent.mm.sdk.platformtools.t8.l(wcVar.f187023d.Z);
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void l(int i17, java.lang.String str, r45.s83 s83Var) {
        if (i17 != 5) {
            this.f186973b.f187023d.f183849q2.f184054k = s83Var.B;
        }
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void m() {
        com.tencent.mm.plugin.webview.ui.tools.wc wcVar = this.f186973b;
        wcVar.f187023d.f183834m.a();
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = wcVar.f187023d;
        by4.k kVar = webViewUI.f183841o2;
        if (kVar != null && kVar.a()) {
            java.lang.String x76 = com.tencent.mm.sdk.platformtools.t8.K0(webViewUI.L1.f181964y) ? webViewUI.x7() : webViewUI.L1.f181964y;
            java.lang.String str = (java.lang.String) ((java.util.HashMap) webViewUI.f183841o2.f36404e).get(x76);
            java.lang.String X6 = com.tencent.mm.plugin.webview.ui.tools.WebViewUI.X6(webViewUI, webViewUI.f183815f.getTitle());
            if (str != null) {
                webViewUI.f183841o2.b(webViewUI, x76, webViewUI.F7(), str);
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(X6) && !((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).p(x76)) {
                webViewUI.f183841o2.b(webViewUI, x76, webViewUI.F7(), X6);
            }
        }
        webViewUI.T7();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    @Override // com.tencent.mm.plugin.webview.core.f3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n() {
        /*
            r5 = this;
            com.tencent.mm.plugin.webview.ui.tools.wc r0 = r5.f186973b
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.f187023d
            r0.W8()
            com.tencent.mm.plugin.webview.ui.tools.wc r0 = r5.f186973b
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.f187023d
            com.tencent.mm.plugin.webview.core.e3 r1 = r0.L1
            java.lang.String r1 = r1.f181964y
            if (r1 == 0) goto L12
            goto L16
        L12:
            java.lang.String r1 = r0.F7()
        L16:
            com.tencent.mm.plugin.webview.ui.tools.wc r0 = r5.f186973b
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.f187023d
            by4.k r0 = r0.f183841o2
            if (r0 == 0) goto L8e
            boolean r0 = r0.a()
            if (r0 == 0) goto L8e
            com.tencent.mm.plugin.webview.ui.tools.wc r0 = r5.f186973b
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.f187023d
            by4.k r0 = r0.f183841o2
            android.net.Uri r2 = android.net.Uri.parse(r1)
            java.lang.String r2 = r2.getHost()
            r3 = 0
            if (r2 == 0) goto L41
            java.util.Set r0 = r0.f36402c
            java.util.HashSet r0 = (java.util.HashSet) r0
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L44
            r0 = 1
            goto L45
        L41:
            r0.getClass()
        L44:
            r0 = r3
        L45:
            if (r0 != 0) goto L8e
            com.tencent.mm.plugin.webview.ui.tools.wc r0 = r5.f186973b
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.f187023d
            by4.k r0 = r0.f183841o2
            r0.f36400a = r3
            boolean r2 = r0.f36403d
            if (r2 == 0) goto L56
            r0.f36403d = r3
            goto L8e
        L56:
            boolean r0 = hy4.i.q(r1)
            java.lang.String r2 = ""
            if (r0 != 0) goto L7f
            com.tencent.mm.plugin.webview.ui.tools.wc r0 = r5.f186973b
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.f187023d
            java.lang.String r1 = xw4.b.c(r1)
            if (r1 != 0) goto L69
            r1 = r2
        L69:
            java.lang.String r1 = java.net.URLDecoder.decode(r1)
            r0.setMMTitle(r1)
            com.tencent.mm.plugin.webview.ui.tools.wc r0 = r5.f186973b
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.f187023d
            by4.k r0 = r0.f183841o2
            r0.getClass()
            long r3 = java.lang.System.currentTimeMillis()
            r0.f36407h = r3
        L7f:
            com.tencent.mm.plugin.webview.ui.tools.wc r0 = r5.f186973b
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.f187023d
            r0.setMMSubTitle(r2)
            com.tencent.mm.plugin.webview.ui.tools.wc r0 = r5.f186973b
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.f187023d
            r1 = 0
            r0.setMMSubTitle(r1)
        L8e:
            com.tencent.mm.plugin.webview.ui.tools.wc r0 = r5.f186973b
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.f187023d
            boolean r0 = r0.f183803a2
            if (r0 != 0) goto La3
            com.tencent.mm.plugin.webview.ui.tools.wc r0 = r5.f186973b
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.f187023d
            boolean r1 = r0.f183805b2
            if (r1 != 0) goto La3
            com.tencent.mm.ui.base.MMFalseProgressBar r0 = r0.f183834m
            r0.c()
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.vc.n():void");
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void o(java.lang.String str) {
        this.f186973b.f187023d.f183849q2.p(str);
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void p(boolean z17) {
        com.tencent.mm.plugin.webview.ui.tools.wc wcVar;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI;
        com.tencent.mm.ui.widget.MMWebView mMWebView;
        if (!z17 || (mMWebView = (webViewUI = (wcVar = this.f186973b).f187023d).f183815f) == null) {
            return;
        }
        mMWebView.setOnLongClickListener(webViewUI.f183817f3);
        wcVar.f187023d.f183814e3 = true;
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void q(int i17, java.lang.String str, r45.s83 s83Var) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(s83Var.f385548g);
        com.tencent.mm.plugin.webview.ui.tools.wc wcVar = this.f186973b;
        if (!K0) {
            wcVar.f187023d.setMMTitle(s83Var.f385548g);
        }
        if (s83Var.f385547f == 6) {
            wcVar.f187023d.a8(false);
        }
    }
}
