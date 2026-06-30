package ir2;

/* loaded from: classes2.dex */
public final class o1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f294201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ir2.p1 f294202e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ir2.v1 f294203f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(ir2.p1 p1Var, ir2.v1 v1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f294202e = p1Var;
        this.f294203f = v1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ir2.o1(this.f294202e, this.f294203f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ir2.o1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f294201d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.i2 i2Var = this.f294202e.f294207b;
            this.f294201d = 1;
            if (((kotlinx.coroutines.flow.q2) i2Var).emit(this.f294203f, this) == aVar) {
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
