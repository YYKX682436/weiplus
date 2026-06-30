package mz0;

/* loaded from: classes5.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f333077d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f333078e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(mz0.b2 b2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f333078e = b2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mz0.x0(this.f333078e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mz0.x0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f333077d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f333077d = 1;
            if (this.f333078e.U6(this) == aVar) {
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
