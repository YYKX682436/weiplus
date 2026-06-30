package k54;

/* loaded from: classes8.dex */
public final class b extends k54.f {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f304412f;

    /* renamed from: g, reason: collision with root package name */
    public final zg0.q2 f304413g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, zg0.q2 webViewController, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.f0 f0Var) {
        super(context, ((com.tencent.mm.plugin.webview.core.r0) webViewController).R, f0Var, webViewController);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(webViewController, "webViewController");
        this.f304412f = context;
        this.f304413g = webViewController;
    }

    @Override // com.tencent.xweb.s0
    public void n(com.tencent.xweb.WebView webView, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onProgressChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.AdWebViewChromeClient");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onProgressChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.AdWebViewChromeClient");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    @Override // com.tencent.xweb.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(com.tencent.xweb.WebView r11, java.lang.String r12) {
        /*
            r10 = this;
            java.lang.String r11 = "onReceivedTitle"
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.AdWebViewChromeClient"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r0)
            zg0.q2 r1 = r10.f304413g
            com.tencent.mm.plugin.webview.core.r0 r1 = (com.tencent.mm.plugin.webview.core.r0) r1
            java.lang.String r1 = r1.f181964y
            java.lang.String r2 = "onReceivedTitle, title: %s, load url: %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r12, r1}
            java.lang.String r4 = "SnsAd.WebViewChromeClient"
            com.tencent.mars.xlog.Log.i(r4, r2, r3)
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.K0(r12)
            r3 = 0
            android.content.Context r5 = r10.f304412f
            java.lang.String r6 = ""
            if (r2 == 0) goto L33
            boolean r12 = r5 instanceof com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI
            if (r12 == 0) goto L2c
            r3 = r5
            com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI r3 = (com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI) r3
        L2c:
            if (r3 == 0) goto Lb8
            r3.setMMTitle(r6)
            goto Lb8
        L33:
            if (r1 != 0) goto L37
            r2 = r6
            goto L38
        L37:
            r2 = r1
        L38:
            kotlin.jvm.internal.o.d(r12)
            r7 = 0
            boolean r2 = r26.i0.n(r2, r12, r7)
            if (r2 == 0) goto L4f
            boolean r12 = r5 instanceof com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI
            if (r12 == 0) goto L49
            r3 = r5
            com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI r3 = (com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI) r3
        L49:
            if (r3 == 0) goto Lb8
            r3.setMMTitle(r6)
            goto Lb8
        L4f:
            java.lang.Class<zg0.b3> r2 = zg0.b3.class
            i95.m r8 = i95.n0.c(r2)
            zg0.b3 r8 = (zg0.b3) r8
            yg0.s3 r8 = (yg0.s3) r8
            r8.getClass()
            java.lang.String r1 = xw4.b.c(r1)
            if (r1 != 0) goto L63
            r1 = r6
        L63:
            java.lang.String r1 = java.net.URLDecoder.decode(r1)
            java.lang.String r8 = "onReceivedTitle urlHost: %s, title: %s"
            java.lang.Object[] r9 = new java.lang.Object[]{r1, r12}
            com.tencent.mars.xlog.Log.i(r4, r8, r9)
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.K0(r1)
            if (r4 != 0) goto L90
            kotlin.jvm.internal.o.d(r1)
            boolean r1 = r26.i0.y(r12, r1, r7)
            if (r1 == 0) goto L90
            boolean r1 = r5 instanceof com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI
            if (r1 == 0) goto L88
            r1 = r5
            com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI r1 = (com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI) r1
            goto L89
        L88:
            r1 = r3
        L89:
            if (r1 == 0) goto L8e
            r1.setMMTitle(r6)
        L8e:
            r1 = 1
            goto L91
        L90:
            r1 = r7
        L91:
            if (r1 != 0) goto Lb8
            i95.m r1 = i95.n0.c(r2)
            zg0.b3 r1 = (zg0.b3) r1
            yg0.s3 r1 = (yg0.s3) r1
            r1.getClass()
            boolean r1 = com.tencent.mm.plugin.webview.luggage.util.g.d(r12)
            if (r1 != 0) goto Lb8
            java.lang.String r1 = "about:blank"
            boolean r1 = r26.i0.y(r12, r1, r7)
            if (r1 != 0) goto Lb8
            boolean r1 = r5 instanceof com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI
            if (r1 == 0) goto Lb3
            r3 = r5
            com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI r3 = (com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI) r3
        Lb3:
            if (r3 == 0) goto Lb8
            r3.setMMTitle(r12)
        Lb8:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k54.b.o(com.tencent.xweb.WebView, java.lang.String):void");
    }
}
