package t21;

/* loaded from: classes12.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.b1 f414698d;

    public a1(t21.b1 b1Var) {
        this.f414698d = b1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        t21.b1 b1Var = this.f414698d;
        t21.w0 w0Var = b1Var.f414704a.f414719a;
        w0Var.f415041q = false;
        t21.v2 v2Var = w0Var.f415038n;
        v2Var.f415011i = 104;
        v2Var.f415012j = com.tencent.mm.sdk.platformtools.t8.i1();
        b1Var.f414704a.f414719a.f415038n.f415013k = com.tencent.mm.sdk.platformtools.t8.i1();
        t21.v2 v2Var2 = b1Var.f414704a.f414719a.f415038n;
        v2Var2.f415006d = 0;
        v2Var2.U = 1800;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideo", "%s summersafecdn MM_ERR_GET_AESKEY_FAILED doScene again enableHitcheck[%b], ret[%b] new createtime:%d", b1Var.f414704a.f414719a.N(), java.lang.Boolean.valueOf(b1Var.f414704a.f414719a.f415041q), java.lang.Boolean.valueOf(t21.d3.Q(v2Var2)), java.lang.Long.valueOf(b1Var.f414704a.f414719a.f415038n.f415012j));
        t21.w0 w0Var2 = b1Var.f414704a.f414719a;
        w0Var2.doScene(w0Var2.dispatcher(), b1Var.f414704a.f414719a.f415031d);
    }
}
