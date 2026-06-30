package s01;

/* loaded from: classes4.dex */
public class f0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f401866d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f401867e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f401868f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f401869g;

    public f0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.g90();
        lVar.f70665b = new r45.h90();
        lVar.f70666c = "/cgi-bin/mmocbiz-bin/convertbizchat";
        lVar.f70667d = cc1.u.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f401867e = a17;
        r45.g90 g90Var = (r45.g90) a17.f70710a.f70684a;
        g90Var.f375006d = str;
        g90Var.f375008f = str2;
        g90Var.f375007e = str3;
        this.f401869g = obj;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f401866d = u0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneConvertBizChat", "do scene");
        return dispatch(sVar, this.f401867e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return cc1.u.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.u0 u0Var = this.f401866d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
