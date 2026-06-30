package uh1;

/* loaded from: classes7.dex */
public class k extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uh1.r f427811e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uh1.n f427812f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ uh1.q f427813g;

    public k(uh1.q qVar, uh1.r rVar, uh1.n nVar) {
        this.f427813g = qVar;
        this.f427811e = rVar;
        this.f427812f = nVar;
    }

    @Override // wu5.g
    public java.lang.String getKey() {
        return "AppBrandNetworkRequest@" + this.f427811e.f427881j;
    }

    @Override // java.lang.Runnable
    public void run() {
        uh1.r rVar = this.f427811e;
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetworkRequest", "call cronet time out taskid:%s,timeout:%d,url:%s", rVar.f427881j, java.lang.Integer.valueOf(rVar.f427872a), rVar.f427874c);
        if (rVar.f427887p) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetworkRequest", "call cronet time out already callback");
        } else {
            rVar.f427887p = true;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("requestURL", rVar.f427874c);
            this.f427813g.c(this.f427812f, "fail", "fail:time out", rVar.f427881j, null, 5, hashMap);
        }
        uh1.j0.E(1095L, 6L, 1L);
        if (com.tencent.mm.sdk.platformtools.t8.K0(rVar.f427883l)) {
            return;
        }
        com.tencent.mars.cdn.CronetLogic.cancelCronetTask(rVar.f427883l);
    }
}
