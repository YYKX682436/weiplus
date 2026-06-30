package kn;

/* loaded from: classes8.dex */
public class r extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f309448d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f309449e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ca3 f309450f;

    public r(java.lang.String str) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[0] = str == null ? "" : str;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetAssociateChatRoomManageInfo", "NetSceneGetAssociateChatRoomManageInfo roomname:%s", objArr);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getassociatechatroommanageinfo";
        lVar.f70667d = 3553;
        lVar.f70664a = new r45.ba3();
        lVar.f70665b = new r45.ca3();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f309449e = a17;
        r45.ba3 ba3Var = (r45.ba3) a17.f70710a.f70684a;
        ba3Var.f370647d = str == null ? "" : str;
        ba3Var.f370649f = 0;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f309448d = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f309449e;
        this.f309450f = (r45.ca3) oVar.f70711b.f70700a;
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 3553;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f309448d.onSceneEnd(i18, i19, str, this);
    }

    public r(java.lang.String str, boolean z17) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[0] = str == null ? "" : str;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetAssociateChatRoomManageInfo", "NetSceneGetAssociateChatRoomManageInfo ticket:%s", objArr);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getassociatechatroommanageinfo";
        lVar.f70667d = 3553;
        lVar.f70664a = new r45.ba3();
        lVar.f70665b = new r45.ca3();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f309449e = a17;
        r45.ba3 ba3Var = (r45.ba3) a17.f70710a.f70684a;
        ba3Var.f370648e = str == null ? "" : str;
        ba3Var.f370649f = 1;
    }
}
