package kn;

/* loaded from: classes8.dex */
public class z extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f309491d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f309492e;

    public z(java.lang.String str, int i17, r45.vt5 vt5Var) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[0] = str == null ? "" : str;
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = kn.j0.f(vt5Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.roomTodo.NetSceneRoomToolsAlterTodo", "NetSceneRoomToolsAlterTodo chatRoomName:%s op:%s roomToolsTodo%s", objArr);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70666c = "/cgi-bin/micromsg-bin/roomtoolsaltertodo";
        lVar.f70667d = 3618;
        lVar.f70664a = new r45.pt5();
        lVar.f70665b = new r45.qt5();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f309492e = a17;
        r45.pt5 pt5Var = (r45.pt5) a17.f70710a.f70684a;
        pt5Var.f383402d = str == null ? "" : str;
        pt5Var.f383403e = i17;
        pt5Var.f383404f = vt5Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f309491d = u0Var;
        return dispatch(sVar, this.f309492e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 3618;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f309491d.onSceneEnd(i18, i19, str, this);
    }
}
