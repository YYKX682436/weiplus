package v33;

/* loaded from: classes4.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v33.w f433152d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(v33.w wVar) {
        super(0);
        this.f433152d = wVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new com.tencent.mm.plugin.game.autogen.chatroom.SyncChatroomMemberRequest();
        lVar.f70665b = new com.tencent.mm.plugin.game.autogen.chatroom.SyncChatroomMemberResponse();
        lVar.f70666c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/syncchatroommember";
        v33.w wVar = this.f433152d;
        wVar.getClass();
        lVar.f70667d = 4713;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        if (fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.SyncChatroomMemberRequest) {
            com.tencent.mm.plugin.game.autogen.chatroom.SyncChatroomMemberRequest syncChatroomMemberRequest = (com.tencent.mm.plugin.game.autogen.chatroom.SyncChatroomMemberRequest) fVar;
            syncChatroomMemberRequest.chatroom_name = wVar.f433153d;
            syncChatroomMemberRequest.last_version = wVar.f433154e;
        }
        return a17;
    }
}
