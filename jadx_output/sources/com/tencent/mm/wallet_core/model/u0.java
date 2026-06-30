package com.tencent.mm.wallet_core.model;

/* loaded from: classes7.dex */
public class u0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f213993d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f213994e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f213995f;

    /* renamed from: g, reason: collision with root package name */
    public final h45.r f213996g;

    public u0(java.util.Map map, java.lang.String str, java.lang.String str2, int i17, h45.r rVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneJSAPISecureTunnel", "new pay sercuretunnel netscene url :" + str + " appid: " + str2);
        this.f213996g = rVar;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.gy5();
        lVar.f70665b = new r45.hy5();
        lVar.f70666c = "/cgi-bin/mmpay-bin/securetunnel";
        lVar.f70678o = 2;
        this.f213993d = 2632;
        lVar.f70667d = 2632;
        if (map.containsKey("timeout")) {
            lVar.f70672i = ((java.lang.Integer) map.get("timeout")).intValue();
        }
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f213995f = a17;
        r45.gy5 gy5Var = (r45.gy5) a17.f70710a.f70684a;
        gy5Var.f375645g = (java.lang.String) map.get("reqbuf");
        gy5Var.f375642d = (java.lang.String) map.get("cmd");
        gy5Var.f375644f = str;
        gy5Var.f375643e = str2;
        gy5Var.f375646h = i17;
        gy5Var.f375647i = 0;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f213994e = u0Var;
        return dispatch(sVar, this.f213995f, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return this.f213993d;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneJSAPISecureTunnel", "onGYNetEnd, netId : " + i17 + " errType :" + i18 + " errCode: " + i19 + " errMsg :" + str);
        h45.r rVar = this.f213996g;
        if (rVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneJSAPISecureTunnel", "secureTunnel callback");
            if (i18 == 0 && i19 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneJSAPISecureTunnel", "secureTunnel callback success");
                rVar.onSuccess(((r45.hy5) this.f213995f.f70711b.f70700a).f376556d);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneJSAPISecureTunnel", "secureTunnel callback fail");
                rVar.a(str);
            }
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f213994e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
