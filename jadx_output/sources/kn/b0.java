package kn;

/* loaded from: classes8.dex */
public class b0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f309378d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f309379e;

    public b0(java.lang.String str, java.lang.String str2, java.lang.String str3, r45.vt5 vt5Var) {
        java.lang.Object[] objArr = new java.lang.Object[4];
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[0] = str == null ? "" : str;
        objArr[1] = str2 == null ? "" : str2;
        objArr[2] = str3 == null ? "" : str3;
        objArr[3] = kn.j0.f(vt5Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.roomTodo.NetSceneRoomToolsReplyTodo", "NetSceneRoomToolsReplyTodo chatRoomName:%s creator:%s", objArr);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70666c = "/cgi-bin/micromsg-bin/roomtoolsreplytodo";
        lVar.f70667d = 3854;
        lVar.f70664a = new r45.tt5();
        lVar.f70665b = new r45.ut5();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f309379e = a17;
        r45.tt5 tt5Var = (r45.tt5) a17.f70710a.f70684a;
        tt5Var.f386787d = str == null ? "" : str;
        tt5Var.f386788e = str2;
        tt5Var.f386789f = str3;
        tt5Var.f386790g = vt5Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f309378d = u0Var;
        return dispatch(sVar, this.f309379e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 3854;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f309378d.onSceneEnd(i18, i19, str, this);
    }
}
