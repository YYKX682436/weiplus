package kn;

/* loaded from: classes8.dex */
public class a0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f309376d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f309377e;

    public a0(java.lang.String str, java.util.LinkedList linkedList) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[0] = str == null ? "" : str;
        objArr[1] = linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : "null";
        com.tencent.mars.xlog.Log.i("MicroMsg.roomtools.NetSceneRoomToolsAlterWxApp", "NetSceneRoomToolsAlterWxApp chatRoomName:%s roomToolsWxApps%s", objArr);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70666c = "/cgi-bin/micromsg-bin/roomtoolsalterwxapp";
        lVar.f70667d = 3546;
        lVar.f70664a = new r45.rt5();
        lVar.f70665b = new r45.st5();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f309377e = a17;
        r45.rt5 rt5Var = (r45.rt5) a17.f70710a.f70684a;
        rt5Var.f385207d = str == null ? "" : str;
        r45.ot5 ot5Var = new r45.ot5();
        rt5Var.f385208e = ot5Var;
        ot5Var.f382510d = linkedList.size();
        rt5Var.f385208e.f382511e = linkedList;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f309376d = u0Var;
        return dispatch(sVar, this.f309377e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 3546;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f309376d.onSceneEnd(i18, i19, str, this);
    }
}
