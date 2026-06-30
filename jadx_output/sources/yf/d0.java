package yf;

/* loaded from: classes7.dex */
public final class d0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yf.e0 f461333a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pd1.i f461334b;

    public d0(yf.e0 e0Var, pd1.i iVar) {
        this.f461333a = e0Var;
        this.f461334b = iVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        pd1.i iVar = this.f461334b;
        yf.e0 e0Var = this.f461333a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.LivePusherOriginVideoContainer", "getVideoPositionAsync, value: " + str);
        try {
            yf.i0 i0Var = e0Var.f461337a;
            cl0.g gVar = new cl0.g(str);
            i0Var.Q = ik1.w.c(gVar.optInt("x", i0Var.Q));
            i0Var.R = ik1.w.c(gVar.optInt("y", i0Var.R));
            i0Var.x();
            yf.i0 i0Var2 = e0Var.f461337a;
            iVar.a(i0Var2.Q, i0Var2.R);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.LivePusherOriginVideoContainer", "getVideoPositionAsync, updatePosition fail since " + e17);
            yf.i0 i0Var3 = e0Var.f461337a;
            iVar.a(i0Var3.Q, i0Var3.R);
        }
    }
}
