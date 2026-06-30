package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public final class f0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.webview.l0 f136866d;

    public f0(com.tencent.mm.plugin.finder.webview.l0 l0Var) {
        this.f136866d = l0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        androidx.lifecycle.o mo133getLifecycle;
        com.tencent.mm.plugin.finder.webview.l0 l0Var = this.f136866d;
        l0Var.getClass();
        com.tencent.mars.xlog.Log.i("Finder.AdCenterDialog", "onDismiss");
        com.tencent.mm.plugin.finder.webview.l0.f136880n = false;
        android.content.DialogInterface.OnDismissListener onDismissListener = l0Var.f136890j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(l0Var.f136882b);
        }
        com.tencent.mm.ui.widget.MMWebView mMWebView = l0Var.f136891k.f349939d;
        if (mMWebView != null) {
            mMWebView.setWebViewCallbackClient(null);
        }
        com.tencent.mm.ui.MMActivity mMActivity = l0Var.f136888h;
        if (mMActivity != null && (mo133getLifecycle = mMActivity.mo133getLifecycle()) != null) {
            mo133getLifecycle.c(l0Var.f136893m);
        }
        l0Var.f136886f = false;
        com.tencent.mm.plugin.finder.webview.p0 p0Var = l0Var.f136892l;
        if (p0Var != null) {
            p0Var.release();
        }
    }
}
