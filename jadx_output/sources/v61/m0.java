package v61;

/* loaded from: classes4.dex */
public class m0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f433459d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f433460e;

    public m0(int i17, int i18, java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ul6();
        lVar.f70665b = new r45.vl6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/thirdappverify";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.qc.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f433460e = a17;
        com.tencent.mm.modelbase.m mVar = a17.f70710a;
        com.tencent.mm.protobuf.f fVar = mVar.f70684a;
        ((r45.ul6) fVar).f387469d = str;
        ((r45.ul6) fVar).f387470e = i18;
        ((r45.ul6) fVar).f387471f = com.tencent.mm.sdk.platformtools.m2.d();
        byte[] s07 = com.tencent.mm.sdk.platformtools.t8.s0();
        ((r45.ul6) mVar.f70684a).f387472g = x51.j1.a(s07);
        a17.setRsaInfo(o45.pi.a());
        a17.f70714e = 1;
        a17.getReqObj().setPassKey(s07);
        a17.getReqObj().setSceneStatus(i17);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f433459d = u0Var;
        return dispatch(sVar, this.f433460e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.qc.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneVerifyThirdApp", "errType %d,errCode %d,errMsg %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f433459d.onSceneEnd(i18, i19, str, this);
    }
}
