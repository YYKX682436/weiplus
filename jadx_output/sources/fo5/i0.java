package fo5;

/* loaded from: classes14.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fo5.r0 f265000d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(fo5.r0 r0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f265000d = r0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fo5.i0(this.f265000d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fo5.i0 i0Var = (fo5.i0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        i0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        fo5.r0 r0Var = this.f265000d;
        r0Var.f265095n.a(true);
        if (r0Var.r()) {
            ((jp5.o) i95.n0.c(jp5.o.class)).we(r0Var.f265083b);
        }
        return jz5.f0.f302826a;
    }
}
