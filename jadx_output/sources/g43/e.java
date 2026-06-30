package g43;

/* loaded from: classes5.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f268753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f268754e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f268755f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.util.LinkedList linkedList, com.tencent.mm.modelbase.m1 m1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f268754e = linkedList;
        this.f268755f = m1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new g43.e(this.f268754e, this.f268755f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((g43.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f268753d;
        com.tencent.mm.modelbase.m1 m1Var = this.f268755f;
        java.util.LinkedList userNames = this.f268754e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            g43.m mVar = g43.m.f268766d;
            kotlin.jvm.internal.o.f(userNames, "$userNames");
            com.tencent.mm.protobuf.f fVar = ((v33.n) m1Var).getCommReqResp().f70710a.f70684a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.GetUserAtMemberListRequest");
            java.lang.String chatroom_name = ((com.tencent.mm.plugin.game.autogen.chatroom.GetUserAtMemberListRequest) fVar).chatroom_name;
            kotlin.jvm.internal.o.f(chatroom_name, "chatroom_name");
            this.f268753d = 1;
            obj = g43.m.a(mVar, userNames, chatroom_name, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.List list = (java.util.List) obj;
        com.tencent.stubs.logger.Log.i("GameChatRoom.ChatroomMemberPreloadManager", "getSimpleUsersFromDbOrNet  rawUserSize = " + userNames.size() + " resultSimpleUsers = " + list.size() + "  threadId = " + java.lang.Thread.currentThread().getId() + "   threadName =  " + java.lang.Thread.currentThread().getName());
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        g43.d dVar = new g43.d(m1Var, list, null);
        this.f268753d = 2;
        if (kotlinx.coroutines.l.g(g3Var, dVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
