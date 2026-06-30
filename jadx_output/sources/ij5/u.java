package ij5;

/* loaded from: classes.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f291808d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ij5.v f291809e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p13.v f291810f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ij5.v vVar, p13.v vVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f291809e = vVar;
        this.f291810f = vVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ij5.u(this.f291809e, this.f291810f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ij5.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f291808d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.i2 i2Var = this.f291809e.f291811d;
            this.f291808d = 1;
            if (i2Var.emit(this.f291810f, this) == aVar) {
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
