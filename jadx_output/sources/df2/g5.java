package df2;

/* loaded from: classes3.dex */
public final class g5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230189d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.h5 f230190e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(df2.h5 h5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230190e = h5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.g5(this.f230190e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.g5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230189d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            lu5.a aVar2 = lu5.a.f321457f;
            df2.f5 f5Var = new df2.f5(this.f230190e, null);
            this.f230189d = 1;
            if (kotlinx.coroutines.l.g(aVar2, f5Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
