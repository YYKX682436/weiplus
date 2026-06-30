package cw0;

/* loaded from: classes5.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f222658d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f222659e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cw0.l0 f222660f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(cw0.l0 l0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f222660f = l0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        cw0.n nVar = new cw0.n(this.f222660f, continuation);
        nVar.f222659e = obj;
        return nVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cw0.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f222658d;
        cw0.l0 l0Var = this.f222660f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f222659e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            l0Var.s7(new cw0.m(y0Var, arrayList));
            this.f222658d = 1;
            if (kotlinx.coroutines.h.a(arrayList, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        l0Var.R7();
        return jz5.f0.f302826a;
    }
}
