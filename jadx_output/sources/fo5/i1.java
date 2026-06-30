package fo5;

/* loaded from: classes11.dex */
public final class i1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f265001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265002e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f265002e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fo5.i1(this.f265002e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fo5.i1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f265001d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            fo5.q2 q2Var = fo5.q2.f265071d;
            this.f265001d = 1;
            if (fo5.q2.b(q2Var, this.f265002e, false, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        fo5.q2.f265071d.f().q();
        return jz5.f0.f302826a;
    }
}
