package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class s3 implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.u3 f187533d;

    public s3(com.tencent.mm.plugin.webview.ui.tools.widget.u3 u3Var) {
        this.f187533d = u3Var;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewClient", "onServiceConnected");
        com.tencent.mm.plugin.webview.ui.tools.widget.u3 u3Var = this.f187533d;
        if (u3Var.f187549b == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMWebViewClient", "onServiceConnected, activity destroyed");
            return;
        }
        try {
            u3Var.f187551d = com.tencent.mm.plugin.webview.stub.t0.d(iBinder);
            u3Var.f187551d.rg(new com.tencent.mm.plugin.webview.ui.tools.widget.t3(new java.lang.ref.WeakReference(u3Var.B)), u3Var.f187549b.hashCode());
            android.os.Bundle bundle = u3Var.f187555h;
            if (bundle != null) {
                u3Var.f187551d.pb(bundle, u3Var.f187549b.hashCode());
            }
            u3Var.J();
            u3Var.L();
            u3Var.S(u3Var.f187551d, u3Var.f187552e);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMWebViewClient", "addCallback fail, ex = %s", e17.getMessage());
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewClient", "edw onServiceDisconnected");
        com.tencent.mm.plugin.webview.ui.tools.widget.u3 u3Var = this.f187533d;
        if (u3Var.f187549b.f211376y) {
            u3Var.f187551d = null;
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewClient", "maybe mm process crash, try rebind service");
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewClient", "tryBindService");
        android.content.MutableContextWrapper mutableContextWrapper = u3Var.f187548a;
        mutableContextWrapper.bindService(new android.content.Intent(mutableContextWrapper, (java.lang.Class<?>) com.tencent.mm.plugin.webview.stub.WebViewStubService.class), u3Var.A, 1);
    }
}
