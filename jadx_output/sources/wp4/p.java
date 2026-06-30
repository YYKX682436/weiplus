package wp4;

/* loaded from: classes4.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n55.e f448429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o55.a f448430e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(n55.e eVar, o55.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f448429d = eVar;
        this.f448430e = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wp4.p(this.f448429d, this.f448430e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        wp4.p pVar = (wp4.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        pVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f448429d.a(this.f448430e);
        return jz5.f0.f302826a;
    }
}
