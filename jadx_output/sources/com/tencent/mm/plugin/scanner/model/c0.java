package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes4.dex */
public class c0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f158834d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f158835e;

    public c0(java.lang.String str, java.util.LinkedList linkedList, int i17, java.lang.String str2, double d17, double d18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.rk();
        lVar.f70665b = new r45.sk();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/usrmsg/bizscangetactioninfo";
        lVar.f70667d = 1068;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f158835e = a17;
        r45.rk rkVar = (r45.rk) a17.f70710a.f70684a;
        rkVar.f384954d = str;
        rkVar.f384956f = i17;
        rkVar.f384957g = str2;
        rkVar.f384955e = linkedList;
        rkVar.f384959i = d18;
        rkVar.f384958h = d17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f158834d = u0Var;
        return dispatch(sVar, this.f158835e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1068;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetActionInfo", "onGYNetEnd errtype:" + i18 + " errcode:" + i19 + " errMsg:" + str);
        this.f158834d.onSceneEnd(i18, i19, str, this);
    }
}
