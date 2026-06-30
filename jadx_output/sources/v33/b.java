package v33;

/* loaded from: classes2.dex */
public class b extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f433101d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f433102e;

    public b(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new com.tencent.mm.plugin.game.autogen.chatroom.EnterChatroomRequest();
        lVar.f70665b = new com.tencent.mm.plugin.game.autogen.chatroom.EnterChatroomResponse();
        lVar.f70666c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/enterchatroom";
        lVar.f70667d = 4593;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f433102e = a17;
        ((com.tencent.mm.plugin.game.autogen.chatroom.EnterChatroomRequest) a17.f70710a.f70684a).chatroom_name = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f433101d = u0Var;
        return dispatch(sVar, this.f433102e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4593;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("GameChatRoom.CgiEnterChatRoom", "errType = " + i18 + ", errCode = " + i19 + ", errMsg = " + str);
        this.f433101d.onSceneEnd(i18, i19, str, this);
    }
}
