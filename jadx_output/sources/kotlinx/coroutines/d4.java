package kotlinx.coroutines;

/* loaded from: classes14.dex */
public final class d4 implements oz5.i, oz5.j {

    /* renamed from: d, reason: collision with root package name */
    public static final kotlinx.coroutines.d4 f310168d = new kotlinx.coroutines.d4();

    @Override // oz5.l
    public java.lang.Object fold(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // oz5.l
    public oz5.i get(oz5.j jVar) {
        return oz5.h.a(this, jVar);
    }

    @Override // oz5.i
    public oz5.j getKey() {
        return this;
    }

    @Override // oz5.l
    public oz5.l minusKey(oz5.j jVar) {
        return oz5.h.b(this, jVar);
    }

    @Override // oz5.l
    public oz5.l plus(oz5.l context) {
        kotlin.jvm.internal.o.g(context, "context");
        return oz5.g.a(this, context);
    }
}
