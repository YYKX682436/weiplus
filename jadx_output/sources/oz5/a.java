package oz5;

/* loaded from: classes14.dex */
public abstract class a implements oz5.i {
    private final oz5.j key;

    public a(oz5.j key) {
        kotlin.jvm.internal.o.g(key, "key");
        this.key = key;
    }

    @Override // oz5.l
    public <R> R fold(R r17, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return (R) operation.invoke(r17, this);
    }

    @Override // oz5.l
    public <E extends oz5.i> E get(oz5.j jVar) {
        return (E) oz5.h.a(this, jVar);
    }

    @Override // oz5.i
    public oz5.j getKey() {
        return this.key;
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
