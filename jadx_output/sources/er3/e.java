package er3;

/* loaded from: classes4.dex */
public class e extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f256028d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f256029e;

    public e(java.lang.String str, int i17, int i18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.t16();
        lVar.f70665b = new r45.u16();
        lVar.f70666c = "/cgi-bin/mmocbiz-bin/setbrandflag";
        lVar.f70667d = td1.t.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f256029e = a17;
        r45.t16 t16Var = (r45.t16) a17.f70710a.f70684a;
        t16Var.f386067d = str;
        t16Var.f386068e = i17;
        t16Var.f386069f = i18;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f256028d = u0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.brandservice.NetSceneSetBrandFlag", "do scene");
        return dispatch(sVar, this.f256029e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return td1.t.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.u0 u0Var = this.f256028d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
