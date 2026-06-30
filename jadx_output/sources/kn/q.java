package kn;

/* loaded from: classes2.dex */
public class q extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f309446d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f309447e;

    public q(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ze0();
        lVar.f70665b = new r45.af0();
        lVar.f70666c = "/cgi-bin/micromsg-bin/dismisschatroom";
        lVar.f70667d = 6217;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f309447e = a17;
        ((r45.ze0) a17.f70710a.f70684a).f391950d = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f309446d = u0Var;
        return dispatch(sVar, this.f309447e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 6217;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneExtFunctionSwitch", "return is 0.now we parse the json and resetList..");
        }
        this.f309446d.onSceneEnd(i18, i19, str, this);
    }
}
