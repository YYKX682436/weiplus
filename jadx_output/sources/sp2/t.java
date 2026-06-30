package sp2;

/* loaded from: classes2.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f411213d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f411214e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sp2.b0 f411215f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(sp2.b0 b0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f411215f = b0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        sp2.t tVar = new sp2.t(this.f411215f, continuation);
        tVar.f411214e = obj;
        return tVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sp2.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f411213d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f411214e;
            sp2.s sVar = new sp2.s(16);
            oz5.l f11582e = y0Var.getF11582e();
            int i18 = kotlinx.coroutines.r2.O0;
            kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) f11582e.get(kotlinx.coroutines.q2.f310571d);
            sp2.b0 b0Var = this.f411215f;
            zk2.c cVar = new zk2.c(sVar, r2Var, b0Var.getActivity(), 16, b0Var.f410981g);
            this.f411213d = 1;
            if (ay1.l.h(cVar, this) == aVar) {
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
