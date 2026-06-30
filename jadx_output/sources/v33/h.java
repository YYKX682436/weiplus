package v33;

/* loaded from: classes4.dex */
public class h extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f433114d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f433115e;

    /* renamed from: f, reason: collision with root package name */
    public final int f433116f;

    public h(java.util.List list, java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomRequest();
        lVar.f70665b = new com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomResponse();
        lVar.f70666c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getmychatroom";
        lVar.f70667d = 4989;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70673j = true;
        lVar.f70674k = 25000;
        this.f433116f = i18;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f433115e = a17;
        com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomRequest getMyChatroomRequest = (com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomRequest) a17.f70710a.f70684a;
        com.tencent.mm.sdk.platformtools.t8.L0(list);
        getMyChatroomRequest.first_chatroom_name = str;
        getMyChatroomRequest.version = str2;
        getMyChatroomRequest.scene_type = i17;
        com.tencent.mars.xlog.Log.i("GameChatRoom.CgiGetMyChatRoom", "request params, version:%s, scene:%d", str2, java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f433114d = u0Var;
        return dispatch(sVar, this.f433115e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4989;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f433114d.onSceneEnd(i18, i19, str, this);
    }
}
