package l41;

/* loaded from: classes5.dex */
public class u extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f315931d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f315932e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f315933f;

    public u(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.vj3();
        lVar.f70665b = new r45.wj3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getopenimchatroomcontact";
        lVar.f70667d = 407;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f315932e = a17;
        this.f315933f = str;
        ((r45.vj3) a17.f70710a.f70684a).f388309d = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.Openim.NetSceneGetOpenIMChatRoomContact", "get roomname:%s", str);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f315931d = u0Var;
        return dispatch(sVar, this.f315932e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 407;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.uz4 uz4Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.Openim.NetSceneGetOpenIMChatRoomContact", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, roomname:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, this.f315933f);
        if (i18 == 0 && i19 == 0 && (uz4Var = ((r45.wj3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a).f389221d) != null) {
            int i27 = uz4Var.f387757e;
            t41.c.c(uz4Var, i27, i27);
            try {
                boolean z17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(uz4Var.f387756d) != null;
                rv1.e eVar = (rv1.e) i95.n0.c(rv1.e.class);
                java.lang.String str2 = uz4Var.f387756d;
                ((c01.w1) eVar).getClass();
                boolean A = c01.v1.A(str2);
                com.tencent.mars.xlog.Log.i("OpenIMChatRoomContactLogic", "updateChatroomContactByGetRoomContact chatroom:%s isExistConversation:%s isNeedUpdateChatRoomInfo:%s", uz4Var.f387756d, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(A));
                if (z17 && A) {
                    com.tencent.mm.autogen.events.GetChatRoomInfoDetailEvent getChatRoomInfoDetailEvent = new com.tencent.mm.autogen.events.GetChatRoomInfoDetailEvent();
                    getChatRoomInfoDetailEvent.f54383g.f7147a = uz4Var.f387756d;
                    getChatRoomInfoDetailEvent.e();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("OpenIMChatRoomContactLogic", "updateChatroomContactByGetRoomContact chatroom:%s, exception:%s %s", uz4Var.f387756d, e17.getClass().getSimpleName(), e17.getMessage());
            }
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f315931d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
