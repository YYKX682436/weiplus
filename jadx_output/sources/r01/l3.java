package r01;

/* loaded from: classes2.dex */
public class l3 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f368150d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f368151e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f368152f;

    public l3(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.u34();
        lVar.f70665b = new r45.v34();
        lVar.f70666c = "/cgi-bin/mmkf-bin/kfgetbindlist";
        lVar.f70667d = 674;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f368151e = a17;
        r45.u34 u34Var = (r45.u34) a17.f70710a.f70684a;
        u34Var.f386985d = str;
        u34Var.f386986e = str2;
        this.f368152f = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f368150d = u0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneKFGetBindList", "do scene");
        return dispatch(sVar, this.f368151e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 674;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneKFGetBindList", "onGYNetEnd code(%d, %d)", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        com.tencent.mm.modelbase.u0 u0Var = this.f368150d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
