package v33;

/* loaded from: classes15.dex */
public class t extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f433148d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f433149e;

    public t(s33.j jVar) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new com.tencent.mm.plugin.game.autogen.chatroom.SendChatroomMsgRequest();
        lVar.f70665b = new com.tencent.mm.plugin.game.autogen.chatroom.SendChatroomMsgResponse();
        lVar.f70666c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/sendchatroommsg";
        lVar.f70667d = 4993;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f433149e = a17;
        com.tencent.mm.plugin.game.autogen.chatroom.SendChatroomMsgRequest sendChatroomMsgRequest = (com.tencent.mm.plugin.game.autogen.chatroom.SendChatroomMsgRequest) a17.f70710a.f70684a;
        sendChatroomMsgRequest.chatroom_name = jVar.f402506b;
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack();
        chatroomMsgPack.msg_type = jVar.f402507c;
        chatroomMsgPack.from_username = jVar.f402505a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(jVar.f402508d)) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            java.lang.String str = jVar.f402505a;
            str = str == null ? "" : str;
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
            objArr[0] = com.tencent.mm.sdk.platformtools.w2.b(str.getBytes());
            objArr[1] = jVar.f402506b;
            objArr[2] = java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.R(10, 0));
            objArr[3] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
            jVar.f402508d = java.lang.String.format("gamelife_chatroom_%s%s%s_%s", objArr);
        }
        com.tencent.mars.xlog.Log.i("GameChatRoom.CgiSendChatRoomMsg", "send chat msg, msgType:%d", java.lang.Integer.valueOf(jVar.f402507c));
        chatroomMsgPack.cli_msg_id = jVar.f402508d;
        chatroomMsgPack.channel_id = jVar.f402509e;
        chatroomMsgPack.send_time = java.lang.System.currentTimeMillis();
        chatroomMsgPack.msg_content = jVar.f402511g;
        chatroomMsgPack.msg_options = jVar.f402510f;
        sendChatroomMsgRequest.msg_pack = chatroomMsgPack;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f433148d = u0Var;
        return dispatch(sVar, this.f433149e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4993;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("GameChatRoom.CgiSendChatRoomMsg", "errType = " + i18 + ", errCode = " + i19 + ", errMsg = " + str);
        this.f433148d.onSceneEnd(i18, i19, str, this);
    }
}
