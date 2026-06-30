package l41;

/* loaded from: classes4.dex */
public class r extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f315909d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f315910e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f315911f;

    public r(java.lang.String str, java.util.LinkedList linkedList) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.lc0();
        lVar.f70665b = new r45.mc0();
        lVar.f70666c = "/cgi-bin/micromsg-bin/delopenimchatroommember";
        lVar.f70667d = 943;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f315910e = a17;
        this.f315911f = str;
        r45.lc0 lc0Var = (r45.lc0) a17.f70710a.f70684a;
        lc0Var.f379298d = str;
        lc0Var.f379299e = linkedList;
        com.tencent.mars.xlog.Log.i("MicroMsg.Openim.NetSceneDelOpenIMChatRoomMember", "roomname: %s, size:%d", str, java.lang.Integer.valueOf(linkedList.size()));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f315909d = u0Var;
        return dispatch(sVar, this.f315910e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 943;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i19);
        java.lang.String str2 = this.f315911f;
        com.tencent.mars.xlog.Log.i("MicroMsg.Openim.NetSceneDelOpenIMChatRoomMember", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, roomname: %s", valueOf, valueOf2, str, str2);
        if (v0Var.getRespObj().getRetCode() == 0) {
            r45.mc0 mc0Var = (r45.mc0) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
            if (!str2.toLowerCase().endsWith("@im.chatroom") || mc0Var.f380360d.isEmpty()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Openim.NetSceneDelOpenIMChatRoomMember", "DelChatroomMember: room:[" + str2 + "] listCnt:" + mc0Var.f380360d.size());
            } else {
                com.tencent.mm.storage.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
                com.tencent.mm.storage.a3 z07 = a17.z0(str2);
                java.util.List a18 = com.tencent.mm.storage.a3.a1(z07.field_memberlist);
                java.util.LinkedList linkedList = (java.util.LinkedList) a18;
                linkedList.size();
                java.util.Iterator it = mc0Var.f380360d.iterator();
                while (it.hasNext()) {
                    linkedList.remove(((r45.yz4) it.next()).f391535d);
                }
                linkedList.size();
                ((c01.w1) ((rv1.e) i95.n0.c(rv1.e.class))).getClass();
                java.lang.String i27 = c01.v1.i(a18, -1, str2);
                z07.U0(a18);
                z07.field_displayname = i27;
                a17.replace(z07);
            }
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f315909d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
