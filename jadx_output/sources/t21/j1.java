package t21;

/* loaded from: classes12.dex */
public class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.k1 f414798d;

    public j1(t21.k1 k1Var) {
        this.f414798d = k1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        t21.k1 k1Var = this.f414798d;
        k1Var.f414813b.f414831a.f415041q = false;
        t21.v2 v2Var = k1Var.f414812a;
        v2Var.f415011i = 104;
        v2Var.f415012j = com.tencent.mm.sdk.platformtools.t8.i1();
        k1Var.f414812a.f415013k = com.tencent.mm.sdk.platformtools.t8.i1();
        t21.v2 v2Var2 = k1Var.f414812a;
        v2Var2.f415006d = 0;
        v2Var2.U = 1800;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideo", "%s summersafecdn MM_ERR_GET_AESKEY_FAILED doScene again enableHitcheck[%b], ret[%b] new createtime:%d", k1Var.f414813b.f414831a.N(), java.lang.Boolean.valueOf(k1Var.f414813b.f414831a.f415041q), java.lang.Boolean.valueOf(t21.d3.Q(v2Var2)), java.lang.Long.valueOf(k1Var.f414812a.f415012j));
        t21.w0 w0Var = k1Var.f414813b.f414831a;
        w0Var.doScene(w0Var.dispatcher(), k1Var.f414813b.f414831a.f415031d);
    }
}
