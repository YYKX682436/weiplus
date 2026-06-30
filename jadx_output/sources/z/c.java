package z;

/* loaded from: classes14.dex */
public final class c extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z.e f468604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f468605e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(z.e eVar, java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f468604d = eVar;
        this.f468605e = obj;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new z.c(this.f468604d, this.f468605e, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        z.c cVar = (z.c) create((kotlin.coroutines.Continuation) obj);
        jz5.f0 f0Var = jz5.f0.f302826a;
        cVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        z.e eVar = this.f468604d;
        z.e.b(eVar);
        java.lang.Object a17 = z.e.a(eVar, this.f468605e);
        ((n0.q4) eVar.f468632c.f468811e).setValue(a17);
        ((n0.q4) eVar.f468634e).setValue(a17);
        return jz5.f0.f302826a;
    }
}
