package v33;

/* loaded from: classes4.dex */
public final class y extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f433159d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f433160e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Long f433161f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f433162g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Integer f433163h;

    public y(java.lang.String chatRoomName, long j17, boolean z17, java.lang.String userName, int i17) {
        kotlin.jvm.internal.o.g(chatRoomName, "chatRoomName");
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new com.tencent.mm.plugin.game.autogen.chatroom.VoteMsgRequest();
        lVar.f70665b = new com.tencent.mm.plugin.game.autogen.chatroom.VoteMsgResponse();
        lVar.f70666c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/votemsg";
        lVar.f70667d = 4569;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f433160e = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.VoteMsgRequest");
        com.tencent.mm.plugin.game.autogen.chatroom.VoteMsgRequest voteMsgRequest = (com.tencent.mm.plugin.game.autogen.chatroom.VoteMsgRequest) fVar;
        voteMsgRequest.chatroom_name = chatRoomName;
        voteMsgRequest.seq = j17;
        voteMsgRequest.is_vote = z17;
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_GAME_CHAT_ROOM_VOTE_EDUCATION_INT, 0);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
        voteMsgRequest.need_education = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) m17) == 0;
        com.tencent.mars.xlog.Log.i("GameChatRoom.CgiVoteMsg", "seq:" + j17 + ", isVote:" + z17);
        this.f433161f = java.lang.Long.valueOf(j17);
        this.f433162g = userName;
        this.f433163h = java.lang.Integer.valueOf(i17);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f433159d = u0Var;
        return dispatch(sVar, this.f433160e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4569;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("GameChatRoom.CgiVoteMsg", "errType = " + i18 + ", errCode = " + i19 + ", errMsg = " + str);
        com.tencent.mm.modelbase.u0 u0Var = this.f433159d;
        kotlin.jvm.internal.o.d(u0Var);
        u0Var.onSceneEnd(i18, i19, str, this);
    }
}
