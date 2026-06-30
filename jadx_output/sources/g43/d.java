package g43;

/* loaded from: classes5.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f268749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f268750e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.modelbase.m1 m1Var, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f268749d = m1Var;
        this.f268750e = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new g43.d(this.f268749d, this.f268750e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        g43.d dVar = (g43.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        dVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.HashMap c17 = g43.m.f268766d.c();
        com.tencent.mm.protobuf.f fVar = ((v33.n) this.f268749d).getCommReqResp().f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.GetUserAtMemberListRequest");
        u33.m mVar = (u33.m) c17.get(((com.tencent.mm.plugin.game.autogen.chatroom.GetUserAtMemberListRequest) fVar).chatroom_name);
        if (mVar != null) {
            ((g43.u) mVar).a(this.f268750e);
        }
        return jz5.f0.f302826a;
    }
}
