package s01;

/* loaded from: classes4.dex */
public class q0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f401921d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f401922e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f401923f;

    public q0(java.lang.String str, java.lang.String str2, r45.tj tjVar, r45.tj tjVar2, java.lang.Object obj) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.as6();
        lVar.f70665b = new r45.bs6();
        lVar.f70666c = "/cgi-bin/mmocbiz-bin/updatebizchatmemberlist";
        lVar.f70667d = 1357;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f401922e = a17;
        r45.as6 as6Var = (r45.as6) a17.f70710a.f70684a;
        as6Var.f370245d = str;
        as6Var.f370246e = str2;
        as6Var.f370247f = tjVar;
        as6Var.f370248g = tjVar2;
        this.f401923f = obj;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f401921d = u0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.brandservice.NetSceneUpdateBizChatMemberList", "do scene");
        return dispatch(sVar, this.f401922e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1357;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.u0 u0Var = this.f401921d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
