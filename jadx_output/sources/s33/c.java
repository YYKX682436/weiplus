package s33;

/* loaded from: classes15.dex */
public class c implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f402478a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f402479b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u33.f f402480c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s33.d f402481d;

    public c(s33.d dVar, java.util.Map map, java.util.List list, u33.f fVar) {
        this.f402481d = dVar;
        this.f402478a = map;
        this.f402479b = list;
        this.f402480c = fVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData> linkedList;
        u33.h y07;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("GameChatRoom.ChatRoomContactService", "get contact from server errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b), fVar.f70617c);
        int i17 = fVar.f70615a;
        java.util.Map map = this.f402478a;
        if (i17 == 0 && fVar.f70616b == 0 && (linkedList = ((com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomMemberInfoResponse) fVar.f70618d).user_data_list) != null) {
            com.tencent.mars.xlog.Log.i("GameChatRoom.ChatRoomContactService", "get contact from server success, count %d", java.lang.Integer.valueOf(linkedList.size()));
            java.util.Iterator<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData> it = ((com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomMemberInfoResponse) fVar.f70618d).user_data_list.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData next = it.next();
                ((s33.j0) i95.n0.c(s33.j0.class)).wi().z0(s33.w.a(next));
                if (!com.tencent.mm.sdk.platformtools.t8.K0(next.username) && (y07 = ((s33.j0) i95.n0.c(s33.j0.class)).wi().y0(next.username)) != null) {
                    map.put(next.username, y07);
                    ((java.util.concurrent.ConcurrentHashMap) this.f402481d.f402483d).put(next.username, y07);
                }
            }
        }
        for (java.lang.String str : this.f402479b) {
            if (!map.containsKey(str)) {
                y33.e eVar = new y33.e();
                eVar.field_userName = str;
                map.put(str, eVar);
            }
        }
        u33.f fVar2 = this.f402480c;
        if (fVar2 == null) {
            return null;
        }
        fVar2.a(map);
        return null;
    }
}
