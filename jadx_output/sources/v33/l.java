package v33;

/* loaded from: classes5.dex */
public final class l extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f433121d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f433122e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo f433123f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f433124g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.q f433125h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f433126i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f433127m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f433128n;

    public /* synthetic */ l(java.util.LinkedList linkedList, java.lang.String str, com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo adminInfo, boolean z17, kotlinx.coroutines.q qVar, int i17, kotlin.jvm.internal.i iVar) {
        this(linkedList, str, adminInfo, (i17 & 8) != 0 ? false : z17, (i17 & 16) != 0 ? null : qVar);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f433127m = u0Var;
        java.lang.Object value = this.f433128n.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return dispatch(sVar, (com.tencent.mm.modelbase.o) value, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4952;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        java.lang.String str2;
        java.util.LinkedList<java.lang.String> linkedList;
        com.tencent.mars.xlog.Log.i("ChatroomMemberPreloadManager.SyncRoomMember", "errType = " + i18 + ", errCode = " + i19 + ", errMsg = " + str);
        if (i18 == 0 && i19 == 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.Object value = this.f433128n.getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            com.tencent.mm.protobuf.f fVar = ((com.tencent.mm.modelbase.o) value).f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.BatchGetSimpleChatroomMemberResponse");
            java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserSimpleData> simple_data_list = ((com.tencent.mm.plugin.game.autogen.chatroom.BatchGetSimpleChatroomMemberResponse) fVar).simple_data_list;
            kotlin.jvm.internal.o.f(simple_data_list, "simple_data_list");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(simple_data_list, 10));
            java.util.Iterator<T> it = simple_data_list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                str2 = this.f433122e;
                if (!hasNext) {
                    break;
                }
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserSimpleData chatroomUserSimpleData = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserSimpleData) it.next();
                y33.g gVar = new y33.g();
                gVar.field_compositionKey = str2 + chatroomUserSimpleData.username;
                java.lang.String username = chatroomUserSimpleData.username;
                gVar.field_userName = username;
                gVar.field_nickName = chatroomUserSimpleData.nickname;
                gVar.field_roomName = str2;
                gVar.field_avatarURL = chatroomUserSimpleData.avatar;
                kotlin.jvm.internal.o.f(username, "username");
                com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo adminInfo = this.f433123f;
                if (!kotlin.jvm.internal.o.b(adminInfo != null ? adminInfo.owner_username : null, username)) {
                    r5 = ((adminInfo == null || (linkedList = adminInfo.admin_username_list) == null || !linkedList.contains(username)) ? 0 : 1) != 0 ? 2 : 0;
                }
                gVar.field_role = r5;
                gVar.field_updateTime = currentTimeMillis;
                arrayList.add(gVar);
            }
            kotlinx.coroutines.q qVar = this.f433125h;
            if (qVar != null) {
                kotlinx.coroutines.r rVar = (kotlinx.coroutines.r) qVar;
                if (rVar.n()) {
                    rVar.resumeWith(kotlin.Result.m521constructorimpl(arrayList));
                }
            }
            ((y33.h) this.f433126i.getValue()).z2(arrayList, str2);
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f433127m;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    public l(java.util.LinkedList userNameList, java.lang.String chatroomName, com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo adminInfo, boolean z17, kotlinx.coroutines.q qVar) {
        kotlin.jvm.internal.o.g(userNameList, "userNameList");
        kotlin.jvm.internal.o.g(chatroomName, "chatroomName");
        this.f433121d = userNameList;
        this.f433122e = chatroomName;
        this.f433123f = adminInfo;
        this.f433124g = z17;
        this.f433125h = qVar;
        jz5.i iVar = jz5.i.f302831f;
        this.f433126i = jz5.h.a(iVar, v33.k.f433120d);
        this.f433128n = jz5.h.a(iVar, new v33.j(this));
    }
}
