package du3;

/* loaded from: classes3.dex */
public final class c2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f243550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ du3.g2 f243551e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(du3.g2 g2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f243551e = g2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new du3.c2(this.f243551e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((du3.c2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f243550d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            du3.g2 g2Var = this.f243551e;
            kotlinx.coroutines.flow.f3 b17 = kotlinx.coroutines.flow.l.b(g2Var.C().f281819m);
            du3.b2 b2Var = new du3.b2(g2Var);
            this.f243550d = 1;
            if (((kotlinx.coroutines.flow.l2) b17).a(b2Var, this) == aVar) {
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
