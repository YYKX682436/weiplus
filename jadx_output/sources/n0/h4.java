package n0;

/* loaded from: classes14.dex */
public final class h4 implements n0.r2 {

    /* renamed from: d, reason: collision with root package name */
    public static final n0.h4 f333528d = new n0.h4();

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
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        return kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new n0.g4(lVar, null), continuation);
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
