package e0;

/* loaded from: classes14.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f245655d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e0.u1 f245656e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(e0.u1 u1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f245656e = u1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new e0.o(this.f245656e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((e0.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f245655d;
        e0.u1 u1Var = this.f245656e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            z.e eVar = u1Var.f245707b;
            p2.m mVar = new p2.m(u1Var.f245708c);
            this.f245655d = 1;
            if (eVar.f(mVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        ((n0.q4) u1Var.f245709d).setValue(java.lang.Boolean.FALSE);
        return jz5.f0.f302826a;
    }
}
