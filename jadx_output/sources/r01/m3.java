package r01;

/* loaded from: classes2.dex */
public class m3 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f368158d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f368159e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f368160f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f368161g;

    public m3(java.lang.String str, java.util.LinkedList linkedList, java.util.LinkedList linkedList2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.w34();
        lVar.f70665b = new r45.x34();
        lVar.f70666c = "/cgi-bin/mmkf-bin/kfgetinfolist";
        lVar.f70667d = 675;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f368159e = a17;
        r45.w34 w34Var = (r45.w34) a17.f70710a.f70684a;
        w34Var.f388839d = str;
        w34Var.f388840e = linkedList;
        w34Var.f388841f = linkedList2;
        this.f368160f = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f368158d = u0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneKFGetInfoList", "do scene");
        return dispatch(sVar, this.f368159e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 675;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneKFGetInfoList", "onGYNetEnd code(%d, %d)", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        com.tencent.mm.modelbase.u0 u0Var = this.f368158d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
