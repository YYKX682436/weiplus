package com.tencent.xweb.sys;

/* loaded from: classes13.dex */
public class w extends com.tencent.xweb.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.webkit.WebSettings f220588a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f220589b = "";

    public w(android.webkit.WebView webView) {
        this.f220588a = webView.getSettings();
        g();
    }

    @Override // com.tencent.xweb.z0
    public void A(int i17) {
    }

    @Override // com.tencent.xweb.z0
    public void B(int i17) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            this.f220588a.setForceDark(i17);
        }
    }

    @Override // com.tencent.xweb.z0
    public void C(boolean z17) {
        this.f220588a.setGeolocationEnabled(z17);
    }

    @Override // com.tencent.xweb.z0
    public void D(boolean z17) {
        this.f220588a.setJavaScriptCanOpenWindowsAutomatically(z17);
    }

    @Override // com.tencent.xweb.z0
    public void E(boolean z17) {
        this.f220588a.setJavaScriptEnabled(z17);
    }

    @Override // com.tencent.xweb.z0
    public void F(android.webkit.WebSettings.LayoutAlgorithm layoutAlgorithm) {
        this.f220588a.setLayoutAlgorithm(layoutAlgorithm);
    }

    @Override // com.tencent.xweb.z0
    public void G(boolean z17) {
        this.f220588a.setLoadWithOverviewMode(z17);
    }

    @Override // com.tencent.xweb.z0
    public void H(boolean z17) {
        this.f220588a.setLoadsImagesAutomatically(z17);
    }

    @Override // com.tencent.xweb.z0
    public void I(boolean z17) {
        this.f220588a.setMediaPlaybackRequiresUserGesture(z17);
    }

    @Override // com.tencent.xweb.z0
    public void J(int i17) {
        this.f220588a.setMixedContentMode(i17);
    }

    @Override // com.tencent.xweb.z0
    public void K(android.webkit.WebSettings.RenderPriority renderPriority) {
        this.f220588a.setRenderPriority(renderPriority);
    }

    @Override // com.tencent.xweb.z0
    public void L(boolean z17) {
        this.f220588a.setSaveFormData(z17);
    }

    @Override // com.tencent.xweb.z0
    public void M(boolean z17) {
        this.f220588a.setSavePassword(z17);
    }

    @Override // com.tencent.xweb.z0
    public void N(boolean z17) {
        this.f220588a.setSupportZoom(z17);
    }

    @Override // com.tencent.xweb.z0
    public void O(int i17) {
        this.f220588a.setTextZoom(i17);
    }

    @Override // com.tencent.xweb.z0
    public void P(boolean z17) {
        this.f220588a.setUseWideViewPort(z17);
    }

    @Override // com.tencent.xweb.z0
    public void Q(java.lang.String str) {
        this.f220589b = str;
        this.f220588a.setUserAgentString(str);
    }

    @Override // com.tencent.xweb.z0
    public void R(int i17) {
    }

    @Override // com.tencent.xweb.z0
    public void S(boolean z17) {
    }

    @Override // com.tencent.xweb.z0
    public void a(int i17) {
    }

    @Override // com.tencent.xweb.z0
    public boolean b() {
        return this.f220588a.getAllowFileAccess();
    }

    @Override // com.tencent.xweb.z0
    public boolean c() {
        return this.f220588a.getBlockNetworkImage();
    }

    @Override // com.tencent.xweb.z0
    public int d() {
        return 0;
    }

    @Override // com.tencent.xweb.z0
    public int e() {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return this.f220588a.getForceDark();
        }
        return 0;
    }

    @Override // com.tencent.xweb.z0
    public int f() {
        return this.f220588a.getTextZoom();
    }

    @Override // com.tencent.xweb.z0
    public java.lang.String g() {
        java.lang.String str = this.f220589b;
        if (str == null || str.isEmpty()) {
            try {
                this.f220589b = this.f220588a.getUserAgentString();
            } catch (java.lang.Throwable th6) {
                by5.c4.d("SysWebViewSettings", "getUserAgentString error", th6);
            }
        }
        return this.f220589b;
    }

    @Override // com.tencent.xweb.z0
    public void h(boolean z17) {
        this.f220588a.setAllowFileAccess(z17);
    }

    @Override // com.tencent.xweb.z0
    public void i(boolean z17) {
        this.f220588a.setAllowFileAccessFromFileURLs(z17);
    }

    @Override // com.tencent.xweb.z0
    public void j(java.util.Map map) {
    }

    @Override // com.tencent.xweb.z0
    public void k(boolean z17) {
    }

    @Override // com.tencent.xweb.z0
    public void l(long j17) {
    }

    @Override // com.tencent.xweb.z0
    public void m(java.lang.String str) {
    }

    @Override // com.tencent.xweb.z0
    public void n(boolean z17) {
    }

    @Override // com.tencent.xweb.z0
    public void o(boolean z17) {
    }

    @Override // com.tencent.xweb.z0
    public void p(boolean z17) {
    }

    @Override // com.tencent.xweb.z0
    public void q(boolean z17) {
        this.f220588a.setBlockNetworkImage(z17);
    }

    @Override // com.tencent.xweb.z0
    public void r(boolean z17) {
        this.f220588a.setBuiltInZoomControls(z17);
    }

    @Override // com.tencent.xweb.z0
    public void s(int i17) {
        this.f220588a.setCacheMode(i17);
    }

    @Override // com.tencent.xweb.z0
    public void t(boolean z17) {
        this.f220588a.setDatabaseEnabled(z17);
    }

    @Override // com.tencent.xweb.z0
    public void u(java.lang.String str) {
        this.f220588a.setDatabasePath(str);
    }

    @Override // com.tencent.xweb.z0
    public void v(int i17) {
        this.f220588a.setDefaultFontSize(i17);
    }

    @Override // com.tencent.xweb.z0
    public void w(java.lang.String str) {
        this.f220588a.setDefaultTextEncodingName(str);
    }

    @Override // com.tencent.xweb.z0
    public void x(int i17) {
        this.f220588a.setDisabledActionModeMenuItems(i17);
    }

    @Override // com.tencent.xweb.z0
    public void y(boolean z17) {
        this.f220588a.setDisplayZoomControls(z17);
    }

    @Override // com.tencent.xweb.z0
    public void z(boolean z17) {
        this.f220588a.setDomStorageEnabled(z17);
    }
}
