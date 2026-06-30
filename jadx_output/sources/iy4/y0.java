package iy4;

/* loaded from: classes4.dex */
public class y0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f296033d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f296034e;

    public y0(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.wm0 wm0Var = new r45.wm0();
        r45.xm0 xm0Var = new r45.xm0();
        lVar.f70664a = wm0Var;
        lVar.f70665b = xm0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/extdeviceloginconfirmget";
        lVar.f70667d = 971;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f296034e = lVar.a();
        wm0Var.f389268d = str;
        try {
            byte[] h17 = fo3.s.INSTANCE.h();
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(h17);
            k57Var.f378396f = cu5Var;
            wm0Var.f389270f = new com.tencent.mm.protobuf.g(k57Var.toByteArray());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneExtDeviceLoginConfirmGet", th6, "cc throws exception.", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f296033d = u0Var;
        return dispatch(sVar, this.f296034e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 971;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f296033d.onSceneEnd(i18, i19, str, this);
    }
}
