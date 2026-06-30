package g43;

/* loaded from: classes5.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f268756d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.modelbase.m1 m1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f268756d = m1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new g43.f(this.f268756d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        g43.f fVar = (g43.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        fVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        g43.m mVar = g43.m.f268766d;
        com.tencent.mm.modelbase.m1 m1Var = this.f268756d;
        java.util.LinkedList<java.lang.String> member_username_list = ((v33.w) m1Var).I().member_username_list;
        kotlin.jvm.internal.o.f(member_username_list, "member_username_list");
        java.lang.String chatroom_name = ((v33.w) m1Var).H().chatroom_name;
        kotlin.jvm.internal.o.f(chatroom_name, "chatroom_name");
        java.util.LinkedList d17 = mVar.d(member_username_list, chatroom_name);
        com.tencent.mm.modelbase.r1 d18 = gm0.j1.d();
        java.lang.String chatroom_name2 = ((v33.w) m1Var).H().chatroom_name;
        kotlin.jvm.internal.o.f(chatroom_name2, "chatroom_name");
        d18.g(new v33.l(d17, chatroom_name2, (com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo) mVar.b().get(((v33.w) m1Var).H().chatroom_name), true, null, 16, null));
        return jz5.f0.f302826a;
    }
}
