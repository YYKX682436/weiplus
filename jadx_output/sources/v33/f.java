package v33;

/* loaded from: classes2.dex */
public final class f extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f433109d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f433110e;

    public f(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomPanelRequest();
        lVar.f70665b = new com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomPanelResponse();
        lVar.f70666c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getchatroompanel";
        lVar.f70667d = 5072;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f433110e = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomPanelRequest");
        ((com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomPanelRequest) fVar).chatroom_name = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f433109d = u0Var;
        return dispatch(sVar, this.f433110e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 5072;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("GameChatRoom.CgiVoteMsg", "errType = " + i18 + ", errCode = " + i19 + ", errMsg = " + str);
        com.tencent.mm.modelbase.u0 u0Var = this.f433109d;
        kotlin.jvm.internal.o.d(u0Var);
        u0Var.onSceneEnd(i18, i19, str, this);
    }
}
