package v33;

/* loaded from: classes2.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v33.n f433129d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(v33.n nVar) {
        super(0);
        this.f433129d = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new com.tencent.mm.plugin.game.autogen.chatroom.GetUserAtMemberListRequest();
        lVar.f70665b = new com.tencent.mm.plugin.game.autogen.chatroom.GetUserAtMemberListResponse();
        lVar.f70666c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getuseratmemberlist";
        v33.n nVar = this.f433129d;
        nVar.getClass();
        lVar.f70667d = 5069;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        if (fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.GetUserAtMemberListRequest) {
            ((com.tencent.mm.plugin.game.autogen.chatroom.GetUserAtMemberListRequest) fVar).chatroom_name = nVar.f433130d;
        }
        return a17;
    }
}
