package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public final class i0 implements com.tencent.mm.plugin.finder.webview.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.webview.l0 f136873a;

    public i0(com.tencent.mm.plugin.finder.webview.l0 l0Var) {
        this.f136873a = l0Var;
    }

    @Override // com.tencent.mm.plugin.finder.webview.o0
    public void a() {
        com.tencent.mars.xlog.Log.i("Finder.AdCenterDialog", "onError");
        com.tencent.mm.plugin.finder.webview.l0 l0Var = this.f136873a;
        l0Var.f136889i = true;
        oy2.a0 a0Var = l0Var.f136891k;
        a0Var.getClass();
        com.tencent.mars.xlog.Log.i("Finder.DialogScrollViewHelper", "showRetry");
        com.tencent.mm.plugin.finder.webview.RelativeInterceptScrollLayout relativeInterceptScrollLayout = a0Var.f349938c;
        if (relativeInterceptScrollLayout == null) {
            kotlin.jvm.internal.o.o("mWebViewContainer");
            throw null;
        }
        relativeInterceptScrollLayout.setVisibility(4);
        android.view.View view = a0Var.f349941f;
        if (view == null) {
            kotlin.jvm.internal.o.o("mRetryContainer");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/webview/ad/ScrollWebViewDialogHelper", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/webview/ad/ScrollWebViewDialogHelper", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = a0Var.f349940e;
        if (mMProcessBar != null) {
            mMProcessBar.e();
        }
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar2 = a0Var.f349940e;
        if (mMProcessBar2 != null) {
            mMProcessBar2.setVisibility(8);
        }
        a0Var.f349947l.setForceHandleEvent(true);
    }

    @Override // com.tencent.mm.plugin.finder.webview.o0
    public void b(boolean z17, boolean z18, boolean z19) {
        com.tencent.mars.xlog.Log.i("Finder.AdCenterDialog", "onCreateBoxWebViewEnd");
    }

    @Override // com.tencent.mm.plugin.finder.webview.o0
    public void c() {
        com.tencent.mars.xlog.Log.i("Finder.AdCenterDialog", "onInitWebViewStart");
    }

    @Override // com.tencent.mm.plugin.finder.webview.o0
    public void d() {
        com.tencent.mars.xlog.Log.i("Finder.AdCenterDialog", "onInitWebViewEnd");
    }

    @Override // com.tencent.mm.plugin.finder.webview.o0
    public void e() {
        com.tencent.mars.xlog.Log.i("Finder.AdCenterDialog", "onCreateBoxWebViewStart");
    }

    @Override // com.tencent.mm.plugin.finder.webview.o0
    public void f(int i17, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("Finder.AdCenterDialog", "onExecuteActionCode : actionCode:" + i17);
    }

    @Override // com.tencent.mm.plugin.finder.webview.o0
    public void g() {
        com.tencent.mm.plugin.finder.webview.l0 l0Var = this.f136873a;
        if (l0Var.f136885e || l0Var.f136889i) {
            return;
        }
        boolean z17 = true;
        l0Var.f136885e = true;
        com.tencent.mars.xlog.Log.i("Finder.AdCenterDialog", "onWebViewReady showAfterWebViewReady: %b, pendingShow: %b", java.lang.Boolean.valueOf(l0Var.f136887g), java.lang.Boolean.valueOf(l0Var.f136886f));
        if (!l0Var.f136887g) {
            oy2.a0 a0Var = l0Var.f136891k;
            a0Var.getClass();
            com.tencent.mars.xlog.Log.i("Finder.DialogScrollViewHelper", "showWebView");
            com.tencent.mm.plugin.finder.webview.RelativeInterceptScrollLayout relativeInterceptScrollLayout = a0Var.f349938c;
            if (relativeInterceptScrollLayout == null) {
                kotlin.jvm.internal.o.o("mWebViewContainer");
                throw null;
            }
            relativeInterceptScrollLayout.setVisibility(0);
            android.view.View view = a0Var.f349941f;
            if (view == null) {
                kotlin.jvm.internal.o.o("mRetryContainer");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/webview/ad/ScrollWebViewDialogHelper", "showWebView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/webview/ad/ScrollWebViewDialogHelper", "showWebView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = a0Var.f349940e;
            if (mMProcessBar != null) {
                mMProcessBar.e();
            }
            com.tencent.mm.ui.widget.MMProcessBar mMProcessBar2 = a0Var.f349940e;
            if (mMProcessBar2 != null) {
                mMProcessBar2.setVisibility(8);
            }
            a0Var.f349947l.setForceHandleEvent(false);
        } else if (l0Var.f136886f) {
            l0Var.f136886f = false;
            l0Var.c();
        }
        java.lang.String str = l0Var.f136883c.f349995d;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        android.content.Context context = l0Var.f136881a;
        oy2.p pVar = l0Var.f136883c;
        db5.e1.y(context, pVar.f349995d, pVar.f349996e, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.cix), com.tencent.mm.plugin.finder.webview.h0.f136871d);
    }
}
