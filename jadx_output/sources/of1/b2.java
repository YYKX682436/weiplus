package of1;

/* loaded from: classes8.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f344893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ of1.m2 f344894e;

    public b2(of1.m2 m2Var, android.os.Bundle bundle) {
        this.f344894e = m2Var;
        this.f344893d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.permission.w wVar;
        android.os.Bundle bundle = this.f344893d;
        boolean containsKey = bundle.containsKey("jsapi_preverify_fun_list");
        of1.m2 m2Var = this.f344894e;
        if (!containsKey || (wVar = m2Var.f344976f) == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(m2Var.f344976f != null);
            com.tencent.mars.xlog.Log.e("MicroMsg.MMDefaultWebViewStubCallback", "has JSAPI_CONTROL_BYTES wvPerm %b", objArr);
        } else {
            wVar.i(bundle);
        }
        nw4.n nVar = m2Var.f344975e;
        if (nVar != null) {
            nVar.q();
        }
    }
}
