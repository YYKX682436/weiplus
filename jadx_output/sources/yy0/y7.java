package yy0;

/* loaded from: classes4.dex */
public final class y7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n55.e f468428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o55.a f468429e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(n55.e eVar, o55.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468428d = eVar;
        this.f468429e = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yy0.y7(this.f468428d, this.f468429e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yy0.y7 y7Var = (yy0.y7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        y7Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f468428d.a(this.f468429e);
        return jz5.f0.f302826a;
    }
}
