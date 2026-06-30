package v33;

/* loaded from: classes4.dex */
public class e extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f433105d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f433106e;

    /* renamed from: f, reason: collision with root package name */
    public final int f433107f;

    /* renamed from: g, reason: collision with root package name */
    public final long f433108g;

    public e(java.lang.String str, long j17, long j18, int i17, long j19, int i18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomMsgRequest();
        lVar.f70665b = new com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomMsgResponse();
        lVar.f70666c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getchatroommsg";
        lVar.f70667d = 4562;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f433106e = a17;
        com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomMsgRequest getChatroomMsgRequest = (com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomMsgRequest) a17.f70710a.f70684a;
        getChatroomMsgRequest.chatroom_name = str;
        if (j17 > 0) {
            getChatroomMsgRequest.seq_gt = j17;
        } else if (j18 > 0) {
            getChatroomMsgRequest.seq_lt = j18;
        }
        getChatroomMsgRequest.channel_id = i18;
        this.f433107f = i17;
        this.f433108g = j19;
        com.tencent.mars.xlog.Log.i("GameChatRoom.CgiGetChatRoomMsg", "gtSeq:%d, ltSeq:%d, channelId:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i18));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f433105d = u0Var;
        return dispatch(sVar, this.f433106e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4562;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("GameChatRoom.CgiGetChatRoomMsg", "errType = " + i18 + ", errCode = " + i19 + ", errMsg = " + str);
        this.f433105d.onSceneEnd(i18, i19, str, this);
    }
}
