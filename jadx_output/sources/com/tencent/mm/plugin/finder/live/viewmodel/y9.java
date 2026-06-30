package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes8.dex */
public final class y9 extends com.tencent.mm.plugin.finder.live.widget.e0 {
    public final java.lang.String H;
    public com.tencent.mm.ui.widget.MMWebView I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.FrameLayout f117552J;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y9(android.content.Context r1, java.lang.String r2, zl2.u4 r3, float r4, int r5, kotlin.jvm.internal.i r6) {
        /*
            r0 = this;
            r6 = r5 & 4
            if (r6 == 0) goto L6
            zl2.u4 r3 = zl2.u4.f473988d
        L6:
            r5 = r5 & 8
            if (r5 == 0) goto Lc
            r4 = 1061158912(0x3f400000, float:0.75)
        Lc:
            java.lang.String r5 = "context"
            kotlin.jvm.internal.o.g(r1, r5)
            java.lang.String r5 = "url"
            kotlin.jvm.internal.o.g(r2, r5)
            java.lang.String r5 = "uiMode"
            kotlin.jvm.internal.o.g(r3, r5)
            android.content.res.Resources r5 = r1.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            int r5 = r5.orientation
            r6 = 2
            if (r5 != r6) goto L2c
            r5 = 1
            goto L2d
        L2c:
            r5 = 0
        L2d:
            r0.<init>(r1, r5, r3, r4)
            r0.H = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.viewmodel.y9.<init>(android.content.Context, java.lang.String, zl2.u4, float, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.ecf;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int D() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int J() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initContentView url=");
        java.lang.String str = this.H;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("FinderLiveWebViewBottomSheet", sb6.toString());
        this.f117552J = (android.widget.FrameLayout) rootView.findViewById(com.tencent.mm.R.id.f487699pi0);
        com.tencent.mm.ui.widget.MMWebView a17 = al5.l2.a(this.f118183e);
        a17.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.tencent.xweb.z0 settings = a17.getSettings();
        boolean z17 = true;
        settings.E(true);
        settings.z(true);
        settings.N(false);
        settings.r(false);
        settings.G(true);
        settings.P(true);
        settings.s(-1);
        settings.t(true);
        settings.k(true);
        settings.K(android.webkit.WebSettings.RenderPriority.HIGH);
        a17.setLayerType(2, null);
        a17.setBackgroundColor(-1);
        a17.setWebViewClient(new com.tencent.mm.plugin.finder.live.viewmodel.w9());
        a17.setWebChromeClient(new com.tencent.mm.plugin.finder.live.viewmodel.x9());
        this.I = a17;
        android.widget.FrameLayout frameLayout = this.f117552J;
        if (frameLayout != null) {
            frameLayout.addView(a17);
        }
        com.tencent.mars.xlog.Log.i("FinderLiveWebViewBottomSheet", "WebView added to container");
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.e("FinderLiveWebViewBottomSheet", "url is null or empty!");
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveWebViewBottomSheet", "loadUrl: " + str);
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.I;
        if (mMWebView != null) {
            mMWebView.loadUrl(str);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public boolean Q() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void S() {
        super.S();
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.I;
        if (mMWebView != null) {
            mMWebView.stopLoading();
            mMWebView.loadUrl("about:blank");
            android.widget.FrameLayout frameLayout = this.f117552J;
            if (frameLayout != null) {
                frameLayout.removeView(mMWebView);
            }
            mMWebView.destroy();
        }
        this.I = null;
    }
}
