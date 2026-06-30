package mx0;

/* loaded from: classes5.dex */
public final class u0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f332362d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mx0.e1 f332363e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(mx0.e1 e1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332363e = e1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.u0(this.f332363e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.u0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f332362d;
        mx0.e1 e1Var = this.f332363e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f332362d = 1;
            if (mx0.e1.b(e1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f332362d = 2;
        obj = mx0.e1.c(e1Var, this);
        return obj == aVar ? aVar : obj;
    }
}
