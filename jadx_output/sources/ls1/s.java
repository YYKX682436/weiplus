package ls1;

/* loaded from: classes8.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f321009d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ls1.e0 f321010e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ls1.e0 e0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f321010e = e0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ls1.s(this.f321010e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ls1.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f321009d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f321009d = 1;
            if (kotlinx.coroutines.k1.b(300L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f321010e.I(-130);
        return jz5.f0.f302826a;
    }
}
