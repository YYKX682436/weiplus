package v33;

/* loaded from: classes4.dex */
public class c extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f433103d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f433104e;

    public c(java.lang.String str, com.tencent.mm.plugin.game.autogen.chatroom.Lbs lbs, com.tencent.mm.plugin.game.autogen.chatroom.ExportExternInfo exportExternInfo) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoRequest();
        lVar.f70665b = new com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoResponse();
        lVar.f70666c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getchatroombaseinfo";
        lVar.f70667d = 4391;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f433104e = a17;
        com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoRequest getChatroomBaseInfoRequest = (com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoRequest) a17.f70710a.f70684a;
        getChatroomBaseInfoRequest.chatroom_name = str;
        getChatroomBaseInfoRequest.lbs_info = lbs;
        getChatroomBaseInfoRequest.export_extern_info = exportExternInfo;
        if (x51.o1.U) {
            com.tencent.mm.plugin.game.autogen.chatroom.DebugOption debugOption = new com.tencent.mm.plugin.game.autogen.chatroom.DebugOption();
            debugOption.need_debug = true;
            debugOption.debug_info = "forceShowFirstEnterNotify";
            getChatroomBaseInfoRequest.debug_option = debugOption;
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f433103d = u0Var;
        return dispatch(sVar, this.f433104e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4391;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("GameChatRoom.CgiGetChatRoomBaseInfo", "errType = " + i18 + ", errCode = " + i19 + ", errMsg = " + str);
        this.f433103d.onSceneEnd(i18, i19, str, this);
    }
}
