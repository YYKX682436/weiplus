package v33;

/* loaded from: classes4.dex */
public final class w extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f433153d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f433154e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f433155f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f433156g;

    public w(java.lang.String chatroomName, java.lang.String str) {
        kotlin.jvm.internal.o.g(chatroomName, "chatroomName");
        this.f433153d = chatroomName;
        this.f433154e = str;
        this.f433156g = jz5.h.a(jz5.i.f302831f, new v33.v(this));
    }

    public final com.tencent.mm.plugin.game.autogen.chatroom.SyncChatroomMemberRequest H() {
        java.lang.Object value = this.f433156g.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        com.tencent.mm.protobuf.f fVar = ((com.tencent.mm.modelbase.o) value).f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.SyncChatroomMemberRequest");
        return (com.tencent.mm.plugin.game.autogen.chatroom.SyncChatroomMemberRequest) fVar;
    }

    public final com.tencent.mm.plugin.game.autogen.chatroom.SyncChatroomMemberResponse I() {
        java.lang.Object value = this.f433156g.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        com.tencent.mm.protobuf.f fVar = ((com.tencent.mm.modelbase.o) value).f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.SyncChatroomMemberResponse");
        return (com.tencent.mm.plugin.game.autogen.chatroom.SyncChatroomMemberResponse) fVar;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f433155f = u0Var;
        java.lang.Object value = this.f433156g.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return dispatch(sVar, (com.tencent.mm.modelbase.o) value, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4713;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("GameChatRoom.CgiSyncChatroomMember", "errType = " + i18 + ", errCode = " + i19 + ", errMsg = " + str);
        com.tencent.mm.modelbase.u0 u0Var = this.f433155f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
