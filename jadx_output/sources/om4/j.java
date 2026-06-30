package om4;

/* loaded from: classes4.dex */
public class j extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f346425d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f346426e;

    public j(int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.vv6();
        lVar.f70665b = new r45.wv6();
        lVar.f70666c = "/cgi-bin/mmsearch-bin/usercloserecommend";
        lVar.f70667d = 4393;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f346426e = a17;
        ((r45.vv6) a17.f70710a.f70684a).f388614d = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f346425d = u0Var;
        return dispatch(sVar, this.f346426e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4071;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneExtFunctionSwitch", "return is 0.now we parse the json and resetList..");
        }
        this.f346425d.onSceneEnd(i18, i19, str, this);
    }
}
