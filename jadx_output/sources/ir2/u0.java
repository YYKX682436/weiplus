package ir2;

/* loaded from: classes2.dex */
public final class u0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f294224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ir2.a1 f294225e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ir2.u f294226f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(ir2.a1 a1Var, ir2.u uVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f294225e = a1Var;
        this.f294226f = uVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ir2.u0(this.f294225e, this.f294226f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ir2.u0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f294224d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f294224d = 1;
            if (this.f294225e.T6(this.f294226f, this) == aVar) {
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
