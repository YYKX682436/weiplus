package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class w3 implements android.view.ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ScrollView f182006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMWebView f182007b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f182008c;

    public w3(android.widget.ScrollView scrollView, com.tencent.mm.ui.widget.MMWebView mMWebView, float f17) {
        this.f182006a = scrollView;
        this.f182007b = mMWebView;
        this.f182008c = f17;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        android.widget.ScrollView scrollView = this.f182006a;
        int scrollX = scrollView.getScrollX();
        int scrollY = scrollView.getScrollY() + 2;
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f182007b;
        if (mMWebView.isXWalkKernel()) {
            mMWebView.evaluateJavascript(com.tencent.mm.sdk.platformtools.t8.z1("window.document.scrollingElement.scrollTop = %d;", java.lang.Integer.valueOf((int) (scrollY / this.f182008c))), null);
        } else {
            mMWebView.getView().scrollTo(scrollX, scrollY);
        }
    }
}
