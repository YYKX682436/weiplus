package df2;

/* loaded from: classes3.dex */
public final class g8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f230205e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8(df2.s8 s8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230205e = s8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.g8(this.f230205e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.g8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230204d;
        df2.s8 s8Var = this.f230205e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long j17 = s8Var.f231309u;
            this.f230204d = 1;
            if (kotlinx.coroutines.k1.b(j17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        s8Var.m7(df2.h7.f230301d);
        return jz5.f0.f302826a;
    }
}
