package t21;

/* loaded from: classes12.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.y0 f415060d;

    public x0(t21.y0 y0Var) {
        this.f415060d = y0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        t21.y0 y0Var = this.f415060d;
        t21.w0 w0Var = y0Var.f415064a;
        w0Var.f415041q = false;
        t21.v2 v2Var = w0Var.f415038n;
        v2Var.f415011i = 104;
        v2Var.f415012j = com.tencent.mm.sdk.platformtools.t8.i1();
        y0Var.f415064a.f415038n.f415013k = com.tencent.mm.sdk.platformtools.t8.i1();
        t21.v2 v2Var2 = y0Var.f415064a.f415038n;
        v2Var2.f415006d = 0;
        v2Var2.U = 1800;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideo", "%s summersafecdn MM_ERR_GET_AESKEY_FAILED doScene again enableHitcheck[%b], ret[%b] new createtime:%d", y0Var.f415064a.N(), java.lang.Boolean.valueOf(y0Var.f415064a.f415041q), java.lang.Boolean.valueOf(t21.d3.Q(v2Var2)), java.lang.Long.valueOf(y0Var.f415064a.f415038n.f415012j));
        t21.w0 w0Var2 = y0Var.f415064a;
        w0Var2.doScene(w0Var2.dispatcher(), y0Var.f415064a.f415031d);
    }
}
