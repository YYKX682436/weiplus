package hm;

/* loaded from: classes10.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f282164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hm.u f282165e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f282166f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(kotlin.jvm.internal.h0 h0Var, hm.u uVar, java.lang.Class cls, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f282164d = h0Var;
        this.f282165e = uVar;
        this.f282166f = cls;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hm.p(this.f282164d, this.f282165e, this.f282166f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        hm.p pVar = (hm.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        pVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f282164d.f310123d = ((java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f282165e.f282179g).getValue()).get(this.f282166f);
        return jz5.f0.f302826a;
    }
}
