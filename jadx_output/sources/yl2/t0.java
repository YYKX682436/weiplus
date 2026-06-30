package yl2;

/* loaded from: classes3.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f463074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yl2.g1 f463075e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(yl2.g1 g1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f463075e = g1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yl2.t0(this.f463075e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yl2.t0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f463074d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sf2.i1 i1Var = sf2.i1.f407168a;
            java.lang.String e17 = xy2.c.e(this.f463075e.f463008a);
            this.f463074d = 1;
            if (i1Var.a(e17, this) == aVar) {
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
