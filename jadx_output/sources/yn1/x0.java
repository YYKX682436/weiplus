package yn1;

/* loaded from: classes11.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f463913d;

    public x0(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yn1.x0(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new yn1.x0((kotlin.coroutines.Continuation) obj2).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f463913d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.i2 i2Var = yn1.z0.f463950r;
            yn1.w0 w0Var = new yn1.w0(null);
            this.f463913d = 1;
            obj = kotlinx.coroutines.flow.l.l(i2Var, w0Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
