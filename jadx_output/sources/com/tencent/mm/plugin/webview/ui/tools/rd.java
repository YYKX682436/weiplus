package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes5.dex */
public final class rd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.sd f186823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.Window f186824e;

    public rd(com.tencent.mm.plugin.webview.ui.tools.sd sdVar, android.view.Window window) {
        this.f186823d = sdVar;
        this.f186824e = window;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        com.tencent.mm.plugin.webview.ui.tools.sd sdVar = this.f186823d;
        synchronized (sdVar.f186877b) {
            byte[] bArr = sdVar.f186877b;
            kotlin.jvm.internal.o.g(bArr, "<this>");
            int i17 = 0;
            for (byte b17 : bArr) {
                i17 += b17;
            }
            z17 = i17 >= 1;
        }
        try {
            if (z17) {
                this.f186824e.addFlags(8192);
            } else {
                this.f186824e.clearFlags(8192);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewWindowSecureHandler", "resetSecureFlagToWindow hidden?:" + z17 + ", exception:" + th6);
        }
    }
}
