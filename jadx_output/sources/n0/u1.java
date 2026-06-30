package n0;

/* loaded from: classes14.dex */
public final class u1 implements n0.r2 {

    /* renamed from: d, reason: collision with root package name */
    public static final n0.u1 f333714d = new n0.u1();

    /* renamed from: e, reason: collision with root package name */
    public static final android.view.Choreographer f333715e;

    static {
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        f333715e = (android.view.Choreographer) kotlinx.coroutines.l.e(((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h, new n0.r1(null));
    }

    @Override // oz5.l
    public java.lang.Object fold(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // oz5.l
    public oz5.i get(oz5.j key) {
        kotlin.jvm.internal.o.g(key, "key");
        return oz5.h.a(this, key);
    }

    @Override // oz5.i
    public oz5.j getKey() {
        return n0.q2.f333685d;
    }

    @Override // n0.r2
    public java.lang.Object l(yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        n0.t1 t1Var = new n0.t1(rVar, lVar);
        f333715e.postFrameCallback(t1Var);
        rVar.m(new n0.s1(t1Var));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    @Override // oz5.l
    public oz5.l minusKey(oz5.j key) {
        kotlin.jvm.internal.o.g(key, "key");
        return oz5.h.b(this, key);
    }

    @Override // oz5.l
    public oz5.l plus(oz5.l context) {
        kotlin.jvm.internal.o.g(context, "context");
        return oz5.g.a(this, context);
    }
}
