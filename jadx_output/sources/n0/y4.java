package n0;

/* loaded from: classes11.dex */
public final class y4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f333793d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f333794e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ oz5.l f333795f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f333796g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(oz5.l lVar, kotlinx.coroutines.flow.j jVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f333795f = lVar;
        this.f333796g = jVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        n0.y4 y4Var = new n0.y4(this.f333795f, this.f333796g, continuation);
        y4Var.f333794e = obj;
        return y4Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((n0.y4) create((n0.f3) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f333793d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            n0.f3 f3Var = (n0.f3) this.f333794e;
            oz5.m mVar = oz5.m.f350329d;
            oz5.l lVar = this.f333795f;
            boolean b17 = kotlin.jvm.internal.o.b(lVar, mVar);
            kotlinx.coroutines.flow.j jVar = this.f333796g;
            if (b17) {
                n0.v4 v4Var = new n0.v4(f3Var);
                this.f333793d = 1;
                if (jVar.a(v4Var, this) == aVar) {
                    return aVar;
                }
            } else {
                n0.x4 x4Var = new n0.x4(jVar, f3Var, null);
                this.f333793d = 2;
                if (kotlinx.coroutines.l.g(lVar, x4Var, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1 && i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
