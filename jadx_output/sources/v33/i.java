package v33;

/* loaded from: classes2.dex */
public class i extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f433117d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f433118e;

    public i(com.tencent.mm.plugin.game.autogen.chatroom.Lbs lbs) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new com.tencent.mm.plugin.game.autogen.chatroom.GetCanJoinChatroomRequest();
        lVar.f70665b = new com.tencent.mm.plugin.game.autogen.chatroom.GetCanJoinChatroomResponse();
        lVar.f70666c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getcanjoinchatroom";
        lVar.f70667d = 4631;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f433118e = a17;
        com.tencent.mm.plugin.game.autogen.chatroom.GetCanJoinChatroomRequest getCanJoinChatroomRequest = (com.tencent.mm.plugin.game.autogen.chatroom.GetCanJoinChatroomRequest) a17.f70710a.f70684a;
        if (lbs != null) {
            getCanJoinChatroomRequest.lbs_info = lbs;
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f433117d = u0Var;
        return dispatch(sVar, this.f433118e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4631;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("GameChatRoom.CgiGetRecommendChatRoom", "errType = " + i18 + ", errCode = " + i19 + ", errMsg = " + str);
        this.f433117d.onSceneEnd(i18, i19, str, this);
    }
}
