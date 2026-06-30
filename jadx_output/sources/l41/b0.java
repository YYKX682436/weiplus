package l41;

/* loaded from: classes2.dex */
public class b0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f315781d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f315782e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f315783f;

    public b0(java.lang.String str, java.util.LinkedList linkedList) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.u04();
        lVar.f70665b = new r45.v04();
        lVar.f70666c = "/cgi-bin/micromsg-bin/inviteopenimchatroommember";
        lVar.f70667d = 887;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f315782e = a17;
        this.f315783f = str;
        r45.u04 u04Var = (r45.u04) a17.f70710a.f70684a;
        u04Var.f386908d = str;
        u04Var.f386909e = linkedList;
        com.tencent.mars.xlog.Log.i("MicroMsg.Openim.NetSceneInviteOpenIMChatRoomMember", "roomname: %s, size:%d", str, java.lang.Integer.valueOf(linkedList.size()));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f315781d = u0Var;
        return dispatch(sVar, this.f315782e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 887;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Openim.NetSceneInviteOpenIMChatRoomMember", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, roomname = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, this.f315783f);
        com.tencent.mm.modelbase.u0 u0Var = this.f315781d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
