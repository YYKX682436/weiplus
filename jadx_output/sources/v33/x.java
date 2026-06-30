package v33;

/* loaded from: classes2.dex */
public class x extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f433157d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f433158e;

    public x(java.lang.String str, int i17, long j17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new com.tencent.mm.plugin.game.autogen.chatroom.UserConfirmStatusRequest();
        lVar.f70665b = new com.tencent.mm.plugin.game.autogen.chatroom.UserConfirmStatusResponse();
        lVar.f70666c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/userconfirmstatus";
        lVar.f70667d = 4530;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f433158e = a17;
        com.tencent.mm.plugin.game.autogen.chatroom.UserConfirmStatusRequest userConfirmStatusRequest = (com.tencent.mm.plugin.game.autogen.chatroom.UserConfirmStatusRequest) a17.f70710a.f70684a;
        userConfirmStatusRequest.chatroom_name = str;
        userConfirmStatusRequest.confirm_status = i17;
        userConfirmStatusRequest.notification_id = j17;
        com.tencent.mars.xlog.Log.i("GameChatRoom.CgiUserConfirmStatus", "chatRoomName:%s, status:%d, id:%d", str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f433157d = u0Var;
        return dispatch(sVar, this.f433158e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4530;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("GameChatRoom.CgiUserConfirmStatus", "errType = " + i18 + ", errCode = " + i19 + ", errMsg = " + str);
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.plugin.game.autogen.chatroom.UserConfirmStatusRequest userConfirmStatusRequest = (com.tencent.mm.plugin.game.autogen.chatroom.UserConfirmStatusRequest) this.f433158e.f70710a.f70684a;
            if (userConfirmStatusRequest.confirm_status == 1) {
                com.tencent.mm.autogen.events.ChatRoomJoinOrQuitEvent chatRoomJoinOrQuitEvent = new com.tencent.mm.autogen.events.ChatRoomJoinOrQuitEvent();
                am.c2 c2Var = chatRoomJoinOrQuitEvent.f54038g;
                c2Var.f6302a = 2;
                c2Var.f6303b = userConfirmStatusRequest.chatroom_name;
                chatRoomJoinOrQuitEvent.e();
            }
        }
        this.f433157d.onSceneEnd(i18, i19, str, this);
    }
}
