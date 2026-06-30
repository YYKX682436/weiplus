package v33;

/* loaded from: classes4.dex */
public class o extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f433133d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f433134e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f433135f;

    /* renamed from: g, reason: collision with root package name */
    public final long f433136g;

    /* renamed from: h, reason: collision with root package name */
    public final long f433137h;

    public o(java.lang.String str, com.tencent.mm.plugin.game.autogen.chatroom.Lbs lbs, boolean z17, long j17, long j18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new com.tencent.mm.plugin.game.autogen.chatroom.JoinChatroomRequest();
        lVar.f70665b = new com.tencent.mm.plugin.game.autogen.chatroom.JoinChatroomResponse();
        lVar.f70666c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/joinchatroom";
        lVar.f70667d = 4897;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f433135f = z17;
        this.f433136g = j17;
        this.f433137h = j18;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f433134e = a17;
        com.tencent.mm.plugin.game.autogen.chatroom.JoinChatroomRequest joinChatroomRequest = (com.tencent.mm.plugin.game.autogen.chatroom.JoinChatroomRequest) a17.f70710a.f70684a;
        joinChatroomRequest.chatroom_name = str;
        if (lbs != null) {
            joinChatroomRequest.lbs_info = lbs;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.ExportExternInfo exportExternInfo = new com.tencent.mm.plugin.game.autogen.chatroom.ExportExternInfo();
        exportExternInfo.sourceid = j18;
        exportExternInfo.ssid = j17;
        joinChatroomRequest.extern_info = exportExternInfo;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f433133d = u0Var;
        return dispatch(sVar, this.f433134e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4897;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("GameChatRoom.CgiJoinChatRoom", "errType = " + i18 + ", errCode = " + i19 + ", errMsg = " + str);
        if (i18 == 0 && i19 == 0 && this.f433135f) {
            com.tencent.mm.game.report.g.f68195a.m(1L, 14L, 0L, this.f433136g, this.f433137h);
        }
        this.f433133d.onSceneEnd(i18, i19, str, this);
    }
}
