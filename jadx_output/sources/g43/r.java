package g43;

/* loaded from: classes5.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f268777d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g43.x f268778e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268779f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo f268780g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(java.util.List list, g43.x xVar, java.lang.String str, com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo adminInfo, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f268777d = list;
        this.f268778e = xVar;
        this.f268779f = str;
        this.f268780g = adminInfo;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new g43.r(this.f268777d, this.f268778e, this.f268779f, this.f268780g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        g43.r rVar = (g43.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        rVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.LinkedList<java.lang.String> linkedList;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.List list = this.f268777d;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            java.lang.String str = this.f268779f;
            if (!hasNext) {
                ((y33.h) this.f268778e.f268798h.getValue()).z2(arrayList, str);
                return jz5.f0.f302826a;
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData chatroomUserData = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData) it.next();
            y33.g gVar = new y33.g();
            gVar.field_compositionKey = str + chatroomUserData.username;
            java.lang.String username = chatroomUserData.username;
            gVar.field_userName = username;
            gVar.field_nickName = chatroomUserData.nickname;
            gVar.field_roomName = str;
            gVar.field_avatarURL = chatroomUserData.avatar;
            kotlin.jvm.internal.o.f(username, "username");
            com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo adminInfo = this.f268780g;
            if (!kotlin.jvm.internal.o.b(adminInfo != null ? adminInfo.owner_username : null, username)) {
                r7 = ((adminInfo == null || (linkedList = adminInfo.admin_username_list) == null || !linkedList.contains(username)) ? 0 : 1) != 0 ? 2 : 0;
            }
            gVar.field_role = r7;
            gVar.field_updateTime = currentTimeMillis;
            arrayList.add(gVar);
        }
    }
}
