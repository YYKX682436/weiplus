package com.tencent.mm.plugin.finder.view;

/* loaded from: classes8.dex */
public final class k implements com.tencent.mm.plugin.finder.webview.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.m f132471a;

    public k(com.tencent.mm.plugin.finder.view.m mVar) {
        this.f132471a = mVar;
    }

    @Override // com.tencent.mm.plugin.finder.webview.o0
    public void a() {
        com.tencent.mars.xlog.Log.i("Finder.AnnounceWebViewDialogWrapper", "onError");
        com.tencent.mm.plugin.finder.view.m mVar = this.f132471a;
        mVar.f132620e = true;
        com.tencent.mm.plugin.finder.view.h hVar = mVar.f132622g;
        hVar.getClass();
        com.tencent.mars.xlog.Log.i("Finder.AnnounceWebViewDialogHelper", "showRetry");
        com.tencent.mm.plugin.finder.webview.RelativeInterceptScrollLayout relativeInterceptScrollLayout = hVar.f132192b;
        if (relativeInterceptScrollLayout == null) {
            kotlin.jvm.internal.o.o("mWebViewContainer");
            throw null;
        }
        relativeInterceptScrollLayout.setVisibility(4);
        android.view.View view = hVar.f132195e;
        if (view == null) {
            kotlin.jvm.internal.o.o("mRetryContainer");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/AnnounceWebViewDialogHelper", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/AnnounceWebViewDialogHelper", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = hVar.f132194d;
        if (mMProcessBar != null) {
            mMProcessBar.e();
        }
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar2 = hVar.f132194d;
        if (mMProcessBar2 == null) {
            return;
        }
        mMProcessBar2.setVisibility(8);
    }

    @Override // com.tencent.mm.plugin.finder.webview.o0
    public void b(boolean z17, boolean z18, boolean z19) {
        com.tencent.mars.xlog.Log.i("Finder.AnnounceWebViewDialogWrapper", "onCreateBoxWebViewEnd");
    }

    @Override // com.tencent.mm.plugin.finder.webview.o0
    public void c() {
        com.tencent.mars.xlog.Log.i("Finder.AnnounceWebViewDialogWrapper", "onInitWebViewStart");
    }

    @Override // com.tencent.mm.plugin.finder.webview.o0
    public void d() {
        com.tencent.mars.xlog.Log.i("Finder.AnnounceWebViewDialogWrapper", "onInitWebViewEnd");
    }

    @Override // com.tencent.mm.plugin.finder.webview.o0
    public void e() {
        com.tencent.mars.xlog.Log.i("Finder.AnnounceWebViewDialogWrapper", "onCreateBoxWebViewStart");
    }

    @Override // com.tencent.mm.plugin.finder.webview.o0
    public void f(int i17, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("Finder.AnnounceWebViewDialogWrapper", "onExecuteActionCode : actionCode:" + i17);
    }

    @Override // com.tencent.mm.plugin.finder.webview.o0
    public void g() {
        com.tencent.mm.plugin.finder.view.m mVar = this.f132471a;
        if (mVar.f132618c || mVar.f132620e) {
            return;
        }
        mVar.f132618c = true;
        mVar.getClass();
        com.tencent.mars.xlog.Log.i("Finder.AnnounceWebViewDialogWrapper", "onWebViewReady showAfterWebViewReady: %b, pendingShow: %b", java.lang.Boolean.FALSE, java.lang.Boolean.valueOf(mVar.f132619d));
        mVar.getClass();
        com.tencent.mm.plugin.finder.view.h hVar = mVar.f132622g;
        hVar.getClass();
        com.tencent.mars.xlog.Log.i("Finder.AnnounceWebViewDialogHelper", "showWebView");
        com.tencent.mm.plugin.finder.webview.RelativeInterceptScrollLayout relativeInterceptScrollLayout = hVar.f132192b;
        if (relativeInterceptScrollLayout == null) {
            kotlin.jvm.internal.o.o("mWebViewContainer");
            throw null;
        }
        relativeInterceptScrollLayout.setVisibility(0);
        android.view.View view = hVar.f132195e;
        if (view == null) {
            kotlin.jvm.internal.o.o("mRetryContainer");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/AnnounceWebViewDialogHelper", "showWebView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/AnnounceWebViewDialogHelper", "showWebView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = hVar.f132194d;
        if (mMProcessBar != null) {
            mMProcessBar.e();
        }
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar2 = hVar.f132194d;
        if (mMProcessBar2 == null) {
            return;
        }
        mMProcessBar2.setVisibility(8);
    }
}
