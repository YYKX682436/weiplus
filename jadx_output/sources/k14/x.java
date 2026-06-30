package k14;

/* loaded from: classes4.dex */
public class x extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f303400d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f303401e;

    public x(int i17, int i18, long j17, long j18, boolean z17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.dn0();
        lVar.f70665b = new r45.en0();
        lVar.f70666c = "/cgi-bin/micromsg-bin/extfunctionswitch";
        lVar.f70667d = 4071;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f303401e = a17;
        r45.dn0 dn0Var = (r45.dn0) a17.f70710a.f70684a;
        dn0Var.f372589e = i17;
        dn0Var.f372588d = i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneExtFunctionSwitch", "control2 = " + z17 + "， WhichExtFunctionSwitch = " + j17 + "， ExtFunctionSwitchValue = " + j18);
        if (z17) {
            dn0Var.f372592h = j17;
            dn0Var.f372593i = j18;
        } else {
            dn0Var.f372590f = j17;
            dn0Var.f372591g = j18;
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f303400d = u0Var;
        return dispatch(sVar, this.f303401e, this);
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
        this.f303400d.onSceneEnd(i18, i19, str, this);
    }
}
