package g4;

/* loaded from: classes5.dex */
public final class s1 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268546d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268547e;

    /* renamed from: f, reason: collision with root package name */
    public int f268548f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g4.t1 f268549g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(kotlin.coroutines.Continuation continuation, g4.t1 t1Var, g4.f4 f4Var) {
        super(3, continuation);
        this.f268549g = t1Var;
    }

    @Override // yz5.q
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        kotlinx.coroutines.flow.k create = (kotlinx.coroutines.flow.k) obj;
        kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) obj3;
        kotlin.jvm.internal.o.g(create, "$this$create");
        kotlin.jvm.internal.o.g(continuation, "continuation");
        g4.s1 s1Var = new g4.s1(continuation, this.f268549g, null);
        s1Var.f268546d = create;
        s1Var.f268547e = obj2;
        return s1Var.invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f268548f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.k kVar = (kotlinx.coroutines.flow.k) this.f268546d;
            g4.m1 m1Var = (g4.m1) this.f268547e;
            g4.t1 t1Var = this.f268549g;
            g4.x1 x1Var = t1Var.f268566f;
            g4.y2 y2Var = m1Var.f268430a;
            x1Var.getClass();
            kotlinx.coroutines.flow.j jVar = y2Var.f268636g;
            g4.x1 x1Var2 = t1Var.f268566f;
            g4.j3 j3Var = new g4.j3(jVar, new g4.n1(x1Var2, m1Var.f268430a, x1Var2.f268607b));
            this.f268548f = 1;
            if (kVar.emit(j3Var, this) == aVar) {
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
