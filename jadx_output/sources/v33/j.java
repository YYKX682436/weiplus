package v33;

/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v33.l f433119d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(v33.l lVar) {
        super(0);
        this.f433119d = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new com.tencent.mm.plugin.game.autogen.chatroom.BatchGetSimpleChatroomMemberRequest();
        lVar.f70665b = new com.tencent.mm.plugin.game.autogen.chatroom.BatchGetSimpleChatroomMemberResponse();
        lVar.f70666c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/batchgetsimplechatroommember";
        v33.l lVar2 = this.f433119d;
        lVar2.getClass();
        lVar.f70667d = 4952;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        if (fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.BatchGetSimpleChatroomMemberRequest) {
            ((com.tencent.mm.plugin.game.autogen.chatroom.BatchGetSimpleChatroomMemberRequest) fVar).username_list = lVar2.f433121d;
        }
        return a17;
    }
}
