package pu;

/* loaded from: classes5.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.msg.MsgIdTalker f358288d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f358288d = msgIdTalker;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pu.c(this.f358288d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pu.c cVar = (pu.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        cVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        qi3.b0 b0Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        pu.b bVar = pu.k.f358320i;
        d75.c cVar = (d75.c) ((java.util.concurrent.ConcurrentHashMap) ((jz5.n) pu.k.f358321m).getValue()).get(this.f358288d.toString());
        if (cVar != null && (b0Var = (qi3.b0) cVar.get()) != null) {
            b0Var.x();
        }
        return jz5.f0.f302826a;
    }
}
