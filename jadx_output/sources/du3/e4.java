package du3;

/* loaded from: classes3.dex */
public final class e4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f243574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ du3.h4 f243575e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(du3.h4 h4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f243575e = h4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new du3.e4(this.f243575e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((du3.e4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f243574d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            du3.h4 h4Var = this.f243575e;
            kotlinx.coroutines.flow.f3 b17 = kotlinx.coroutines.flow.l.b(h4Var.C().f281819m);
            du3.d4 d4Var = new du3.d4(h4Var);
            this.f243574d = 1;
            if (((kotlinx.coroutines.flow.l2) b17).a(d4Var, this) == aVar) {
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
