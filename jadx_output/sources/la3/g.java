package la3;

/* loaded from: classes8.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f317531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.permission.w f317532e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zg0.v2 f317533f;

    public g(la3.h hVar, android.os.Bundle bundle, com.tencent.mm.plugin.webview.permission.w wVar, zg0.v2 v2Var) {
        this.f317531d = bundle;
        this.f317532e = wVar;
        this.f317533f = v2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Bundle bundle = this.f317531d;
        try {
            boolean containsKey = bundle.containsKey("jsapi_preverify_fun_list");
            com.tencent.mm.plugin.webview.permission.w wVar = this.f317532e;
            if (!containsKey || wVar == null) {
                boolean z17 = true;
                java.lang.Object[] objArr = new java.lang.Object[1];
                if (wVar == null) {
                    z17 = false;
                }
                objArr[0] = java.lang.Boolean.valueOf(z17);
                com.tencent.mars.xlog.Log.e("LiteAppWebViewStubCallback", "has JSAPI_CONTROL_BYTES wvPerm %b", objArr);
            } else {
                wVar.i(bundle);
            }
            ((nw4.n) this.f317533f).q();
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("LiteAppWebViewStubCallback", "In onCallback method, it happens something unwanted!");
        }
    }
}
