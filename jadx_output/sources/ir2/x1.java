package ir2;

/* loaded from: classes2.dex */
public final class x1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f294239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f294240e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ir2.a0 f294241f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(androidx.lifecycle.y yVar, ir2.a0 a0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f294240e = yVar;
        this.f294241f = a0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ir2.x1(this.f294240e, this.f294241f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ir2.x1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f294239d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ir2.r1 r1Var = new ir2.r1(new ir2.w1(this.f294241f), null, this.f294240e, 2, null);
            this.f294239d = 1;
            if (ay1.l.h(r1Var, this) == aVar) {
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
