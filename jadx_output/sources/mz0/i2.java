package mz0;

/* loaded from: classes5.dex */
public final class i2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f332970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mz0.l2 f332971e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ az0.b0 f332972f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(mz0.l2 l2Var, az0.b0 b0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332971e = l2Var;
        this.f332972f = b0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mz0.i2(this.f332971e, this.f332972f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mz0.i2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f332970d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        try {
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            az0.i5 i5Var = az0.i5.f15557a;
            az0.i5.x(i5Var, false, false, 3, null);
            this.f332970d = 1;
            if (i5Var.g(this) == aVar) {
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
        kotlin.Result.m521constructorimpl(f0Var);
        mz0.l2 l2Var = this.f332971e;
        l2Var.f7().dismiss();
        this.f332970d = 2;
        return mz0.l2.J7(l2Var, this.f332972f, this) == aVar ? aVar : f0Var;
    }
}
