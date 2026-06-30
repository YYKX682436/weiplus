package v33;

/* loaded from: classes2.dex */
public class d extends com.tencent.mm.modelbase.i {
    public d(java.util.LinkedList linkedList) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70665b = new com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomMemberInfoResponse();
        com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomMemberInfoRequest getChatroomMemberInfoRequest = new com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomMemberInfoRequest();
        getChatroomMemberInfoRequest.username_list = linkedList;
        lVar.f70664a = getChatroomMemberInfoRequest;
        lVar.f70666c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getchatroommemberinfo";
        lVar.f70667d = 4982;
        p(lVar.a());
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public /* bridge */ /* synthetic */ void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
    }
}
