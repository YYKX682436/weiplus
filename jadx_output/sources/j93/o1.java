package j93;

/* loaded from: classes.dex */
public final class o1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f298468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j93.p1 f298469e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p13.v f298470f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(j93.p1 p1Var, p13.v vVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f298469e = p1Var;
        this.f298470f = vVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new j93.o1(this.f298469e, this.f298470f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((j93.o1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f298468d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.i2 i2Var = this.f298469e.f298474d;
            this.f298468d = 1;
            if (i2Var.emit(this.f298470f, this) == aVar) {
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
