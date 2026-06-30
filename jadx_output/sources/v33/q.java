package v33;

/* loaded from: classes8.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v33.r f433140d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(v33.r rVar) {
        super(0);
        this.f433140d = rVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new com.tencent.mm.plugin.game.autogen.chatroom.PublishChatroomMsgRequest();
        lVar.f70665b = new com.tencent.mm.plugin.game.autogen.chatroom.PublishChatroomMsgResponse();
        lVar.f70666c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/publishchatroommsg";
        v33.r rVar = this.f433140d;
        rVar.getClass();
        lVar.f70667d = 4565;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        if (fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.PublishChatroomMsgRequest) {
            com.tencent.mm.plugin.game.autogen.chatroom.PublishChatroomMsgRequest publishChatroomMsgRequest = (com.tencent.mm.plugin.game.autogen.chatroom.PublishChatroomMsgRequest) fVar;
            publishChatroomMsgRequest.chatroom_name = rVar.f433141d;
            publishChatroomMsgRequest.seq = rVar.f433142e;
        }
        return a17;
    }
}
