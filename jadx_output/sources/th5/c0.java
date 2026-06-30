package th5;

/* loaded from: classes11.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ th5.o f419355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f419356e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(th5.o oVar, float f17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f419355d = oVar;
        this.f419356e = f17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new th5.c0(this.f419355d, this.f419356e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        th5.c0 c0Var = (th5.c0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        c0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        yz5.l lVar = this.f419355d.f419425j;
        if (lVar != null) {
            lVar.invoke(new java.lang.Float(this.f419356e));
        }
        return jz5.f0.f302826a;
    }
}
