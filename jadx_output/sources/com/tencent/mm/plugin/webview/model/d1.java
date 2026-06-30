package com.tencent.mm.plugin.webview.model;

/* loaded from: classes.dex */
public class d1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f182832d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f182833e;

    public d1(java.lang.String str, java.lang.String str2, java.util.Map map) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.hb3();
        lVar.f70665b = new r45.ib3();
        lVar.f70666c = "/cgi-bin/mmocbiz-bin/getbizjsapiredirecturl";
        lVar.f70667d = 1393;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f182833e = a17;
        r45.hb3 hb3Var = (r45.hb3) a17.f70710a.f70684a;
        hb3Var.f375997d = str;
        hb3Var.f376002i = str2;
        hb3Var.f375998e = (java.lang.String) map.get("groupId");
        hb3Var.f375999f = (java.lang.String) map.get(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP);
        hb3Var.f376000g = (java.lang.String) map.get("nonceStr");
        hb3Var.f376001h = (java.lang.String) map.get("signature");
        hb3Var.f376003m = map.get("params").toString();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f182832d = u0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetBizJsApiRedirectUrl", "do scene");
        return dispatch(sVar, this.f182833e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1393;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.u0 u0Var = this.f182832d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
