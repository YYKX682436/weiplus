package rv0;

/* loaded from: classes5.dex */
public final class x5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f400329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.z6 f400330e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(rv0.z6 z6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f400330e = z6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rv0.x5(this.f400330e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.x5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f400329d;
        rv0.z6 z6Var = this.f400330e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.r2 r2Var = z6Var.A;
            if (r2Var != null) {
                this.f400329d = 1;
                if (r2Var.C(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        rv0.c7 c7Var = rv0.c7.f399961e;
        this.f400329d = 2;
        if (rv0.z6.m7(z6Var, c7Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
