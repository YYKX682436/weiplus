package yy0;

/* loaded from: classes4.dex */
public final class v7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n55.e f468385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o55.a f468386e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(n55.e eVar, o55.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468385d = eVar;
        this.f468386e = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yy0.v7(this.f468385d, this.f468386e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yy0.v7 v7Var = (yy0.v7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        v7Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f468385d.a(this.f468386e);
        return jz5.f0.f302826a;
    }
}
