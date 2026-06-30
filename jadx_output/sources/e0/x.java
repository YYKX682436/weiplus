package e0;

/* loaded from: classes14.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f245717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f245718e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f245719f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(e0.f1 f1Var, n0.v2 v2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f245718e = f1Var;
        this.f245719f = v2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new e0.x(this.f245718e, this.f245719f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((e0.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f245717d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.j f17 = n0.s4.f(new e0.v(this.f245718e));
            e0.w wVar = new e0.w(this.f245719f);
            this.f245717d = 1;
            if (((kotlinx.coroutines.flow.b) f17).a(wVar, this) == aVar) {
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
