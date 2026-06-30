package la3;

/* loaded from: classes8.dex */
public class h extends com.tencent.mm.plugin.webview.stub.b {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f317534e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.ref.WeakReference f317535f;

    public h(android.content.Context context, zg0.q2 q2Var) {
        this.f317534e = new java.lang.ref.WeakReference(context);
        this.f317535f = new java.lang.ref.WeakReference(q2Var);
    }

    @Override // com.tencent.mm.plugin.webview.stub.b, com.tencent.mm.plugin.webview.stub.z0
    public java.lang.String Ni() {
        try {
            zg0.q2 q2Var = (zg0.q2) this.f317535f.get();
            if (q2Var != null) {
                return ((com.tencent.mm.plugin.webview.core.r0) q2Var).E;
            }
            com.tencent.mars.xlog.Log.e("LiteAppWebViewStubCallback", "getCommitUrl, controller==null");
            return "";
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("LiteAppWebViewStubCallback", "callback: getCommitUrl failed");
            return "";
        }
    }

    @Override // com.tencent.mm.plugin.webview.stub.b, com.tencent.mm.plugin.webview.stub.z0
    public boolean aj(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z17) {
        zg0.q2 q2Var = (zg0.q2) this.f317535f.get();
        if (q2Var == null) {
            com.tencent.mars.xlog.Log.e("LiteAppWebViewStubCallback", "onHandleEnd, controller==null");
            return false;
        }
        try {
            nw4.n g07 = ((com.tencent.mm.plugin.webview.core.r0) q2Var).g0();
            ((ku5.t0) ku5.t0.f312615d).B(new la3.f(this, g07, str, str2, bundle, z17));
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("LiteAppWebViewStubCallback", "In onHandleEnd method, it happens something unwanted!");
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.stub.b, com.tencent.mm.plugin.webview.stub.z0
    public boolean callback(int i17, android.os.Bundle bundle) {
        zg0.q2 q2Var;
        try {
            q2Var = (zg0.q2) this.f317535f.get();
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("LiteAppWebViewStubCallback", "In callback method, it happens something unwanted!");
        }
        if (q2Var == null) {
            com.tencent.mars.xlog.Log.e("LiteAppWebViewStubCallback", "callback, controller==null");
            return true;
        }
        com.tencent.mm.plugin.webview.core.r0 r0Var = (com.tencent.mm.plugin.webview.core.r0) q2Var;
        nw4.n g07 = r0Var.g0();
        com.tencent.mm.plugin.webview.permission.w wVar = r0Var.R;
        if (i17 == 1006) {
            ((ku5.t0) ku5.t0.f312615d).B(new la3.g(this, bundle, wVar, g07));
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.webview.stub.b, com.tencent.mm.plugin.webview.stub.z0
    public java.lang.String getCurrentUrl() {
        try {
            zg0.q2 q2Var = (zg0.q2) this.f317535f.get();
            if (q2Var != null) {
                return ((com.tencent.mm.plugin.webview.core.r0) q2Var).Z();
            }
            com.tencent.mars.xlog.Log.e("LiteAppWebViewStubCallback", "getCurrentUrl, controller==null");
            return "";
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("LiteAppWebViewStubCallback", "callback: getCurrentUrl failed");
            return "";
        }
    }

    @Override // com.tencent.mm.plugin.webview.stub.b, com.tencent.mm.plugin.webview.stub.z0
    public android.os.Bundle i(int i17, android.os.Bundle bundle) {
        android.os.Bundle bundle2 = new android.os.Bundle();
        android.content.Context context = (android.content.Context) this.f317534e.get();
        java.util.Objects.toString(context);
        if (i17 == 101 && context != null && bundle != null) {
            try {
                bundle.setClassLoader(context.getClassLoader());
                android.os.Bundle bundle3 = bundle.getBundle("open_ui_with_webview_ui_extras");
                java.lang.String k17 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "open_ui_with_webview_ui_plugin_name");
                java.lang.String k18 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "open_ui_with_webview_ui_plugin_entry");
                android.content.Intent intent = new android.content.Intent();
                if (bundle3 == null) {
                    bundle3 = new android.os.Bundle();
                }
                j45.l.j(context, k17, k18, intent.putExtras(bundle3), null);
            } catch (java.lang.Throwable unused) {
                com.tencent.mars.xlog.Log.e("LiteAppWebViewStubCallback", "In invokeAsResult method, it happens something unwanted!");
            }
        }
        return bundle2;
    }
}
