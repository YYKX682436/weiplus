package lu5;

/* loaded from: classes14.dex */
public final class f implements oz5.i {

    /* renamed from: e, reason: collision with root package name */
    public static final oz5.j f321463e = new lu5.e();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f321464d;

    public f(boolean z17) {
        this.f321464d = z17;
    }

    @Override // oz5.l
    public java.lang.Object fold(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.h(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // oz5.l
    public oz5.i get(oz5.j key) {
        kotlin.jvm.internal.o.h(key, "key");
        return oz5.h.a(this, key);
    }

    @Override // oz5.i
    public oz5.j getKey() {
        return f321463e;
    }

    @Override // oz5.l
    public oz5.l minusKey(oz5.j key) {
        kotlin.jvm.internal.o.h(key, "key");
        return oz5.h.b(this, key);
    }

    @Override // oz5.l
    public oz5.l plus(oz5.l context) {
        kotlin.jvm.internal.o.h(context, "context");
        return oz5.g.a(this, context);
    }
}
