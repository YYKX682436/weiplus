package df2;

/* loaded from: classes3.dex */
public final class h8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f230310e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(df2.s8 s8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230310e = s8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.h8(this.f230310e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.h8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230309d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f230309d = 1;
            if (kotlinx.coroutines.k1.b(1200L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        df2.s8.Z6(this.f230310e, "curTaskInfo");
        return jz5.f0.f302826a;
    }
}
