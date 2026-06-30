package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes7.dex */
public final class sd {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.core.e3 f186876a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f186877b;

    public sd(com.tencent.mm.plugin.webview.core.e3 webViewController) {
        kotlin.jvm.internal.o.g(webViewController, "webViewController");
        this.f186876a = webViewController;
        int d17 = ((kz5.b) com.tencent.mm.plugin.webview.ui.tools.qd.f186786h).d();
        byte[] bArr = new byte[d17];
        for (int i17 = 0; i17 < d17; i17++) {
            bArr[i17] = 0;
        }
        this.f186877b = bArr;
    }

    public final void a(dy4.l lVar) {
        android.view.Window window;
        com.tencent.mm.plugin.webview.core.e3 e3Var = this.f186876a;
        android.app.Dialog dialog = e3Var.f181944o;
        if (dialog != null) {
            kotlin.jvm.internal.o.d(dialog);
            window = dialog.getWindow();
            if (window == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewWindowSecureHandler", "resetSecureFlagToWindow get null window from dialog:" + e3Var.f181944o);
            }
        } else {
            android.app.Activity a17 = q75.a.a(lVar != null ? lVar.f244681d : null);
            if (a17 == null) {
                android.content.Context activityContextIfHas = e3Var.f181916a.getActivityContextIfHas();
                a17 = activityContextIfHas instanceof android.app.Activity ? (android.app.Activity) activityContextIfHas : null;
            }
            android.view.Window window2 = a17 != null ? a17.getWindow() : null;
            if (window2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewWindowSecureHandler", "resetSecureFlagToWindow get null window from activity:" + a17);
            }
            window = window2;
        }
        if (window == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.utils.d5.b(new com.tencent.mm.plugin.webview.ui.tools.rd(this, window));
    }

    public final void b(boolean z17, com.tencent.mm.plugin.webview.ui.tools.qd reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewWindowSecureHandler", "setVisualEffect hidden:" + z17 + ", reason:" + reason + ", webviewId:" + this.f186876a.U());
        synchronized (this.f186877b) {
            this.f186877b[reason.ordinal()] = z17 ? (byte) 1 : (byte) 0;
        }
        a(this.f186876a.X0);
    }
}
