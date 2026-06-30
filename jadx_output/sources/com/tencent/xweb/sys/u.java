package com.tencent.xweb.sys;

/* loaded from: classes13.dex */
public class u extends android.webkit.WebView {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.sys.v f220573d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.xweb.sys.v vVar, android.content.Context context) {
        super(context);
        this.f220573d = vVar;
    }

    public int a() {
        return computeVerticalScrollRange();
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 4) {
            com.tencent.xweb.sys.v vVar = this.f220573d;
            if (vVar.f220587s) {
                vVar.m();
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        int contentHeight = getContentHeight();
        com.tencent.xweb.sys.v vVar = this.f220573d;
        if (contentHeight != vVar.f220584p) {
            vVar.f220584p = contentHeight;
            if (vVar.f220579h != null) {
                by5.c4.f("SysWebView", "onContentHeightChanged, height:" + contentHeight);
                vVar.f220579h.b(contentHeight);
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onOverScrolled(int i17, int i18, boolean z17, boolean z18) {
        super.onOverScrolled(i17, i18, z17, z18);
        com.tencent.xweb.g1 g1Var = this.f220573d.f220579h;
        if (g1Var != null) {
            g1Var.e(i17, i18, z17, z18, this);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i17, int i18, int i19, int i27) {
        super.onScrollChanged(i17, i18, i19, i27);
        com.tencent.xweb.sys.v vVar = this.f220573d;
        com.tencent.xweb.WebView webView = vVar.f220575d;
        if (webView != null) {
            webView.A0(i17, i18, i19, i27);
        }
        com.tencent.xweb.g1 g1Var = vVar.f220579h;
        if (g1Var != null) {
            g1Var.d(i17, i18, i19, i27, this);
        }
    }

    @Override // android.view.View
    public boolean overScrollBy(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, boolean z17) {
        com.tencent.xweb.g1 g1Var = this.f220573d.f220579h;
        if (g1Var != null) {
            g1Var.a(i17, i18, i19, i27, i28, i29, i37, i38, z17, this);
        }
        return super.overScrollBy(i17, i18, i19, i27, i28, i29, i37, i38, z17);
    }
}
