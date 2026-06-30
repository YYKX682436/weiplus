package yf2;

/* loaded from: classes3.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f461752d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf2.o f461753e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(yf2.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f461753e = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yf2.n(this.f461753e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((yf2.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f461752d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            yf2.o oVar = this.f461753e;
            mm2.g1 g1Var = (mm2.g1) oVar.business(mm2.g1.class);
            kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
            c0Var.f310112d = zl2.r4.f473950a.G1((r45.q12) ((kotlinx.coroutines.flow.h3) g1Var.f329068f).getValue());
            kotlinx.coroutines.flow.j2 j2Var = g1Var.f329068f;
            yf2.m mVar = new yf2.m(c0Var, oVar);
            this.f461752d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(mVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
