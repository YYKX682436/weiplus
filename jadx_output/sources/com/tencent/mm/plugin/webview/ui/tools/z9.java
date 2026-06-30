package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class z9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187723e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.u7 f187724f;

    public z9(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, java.lang.String str, java.lang.String str2) {
        this.f187724f = u7Var;
        this.f187722d = str;
        this.f187723e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.u7 u7Var = this.f187724f;
        if (u7Var.f186929e.get() != null) {
            java.lang.ref.WeakReference weakReference = u7Var.f186929e;
            if (((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).isFinishing()) {
                return;
            }
            java.lang.String str = this.f187722d;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return;
            }
            java.lang.String str2 = this.f187723e;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                u7Var.j().putExtra("view_port_code", str2);
            }
            ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).p8(str, null, false);
        }
    }
}
