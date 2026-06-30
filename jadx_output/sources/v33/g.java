package v33;

/* loaded from: classes4.dex */
public class g extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f433111d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f433112e;

    /* renamed from: f, reason: collision with root package name */
    public final int f433113f;

    public g(java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomRealtimeInfoRequest();
        lVar.f70665b = new com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomRealtimeInfoResponse();
        lVar.f70666c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getchatroomrealtimeinfo";
        lVar.f70667d = 4316;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70673j = true;
        lVar.f70674k = 25000;
        this.f433113f = i17;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f433112e = a17;
        com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomRealtimeInfoRequest getChatroomRealtimeInfoRequest = (com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomRealtimeInfoRequest) a17.f70710a.f70684a;
        getChatroomRealtimeInfoRequest.chatroom_name = str;
        getChatroomRealtimeInfoRequest.version = str2;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f433111d = u0Var;
        return dispatch(sVar, this.f433112e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4316;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f433111d.onSceneEnd(i18, i19, str, this);
    }
}
