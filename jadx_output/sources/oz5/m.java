package oz5;

/* loaded from: classes5.dex */
public final class m implements oz5.l, java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final oz5.m f350329d = new oz5.m();

    @Override // oz5.l
    public java.lang.Object fold(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return obj;
    }

    @Override // oz5.l
    public oz5.i get(oz5.j key) {
        kotlin.jvm.internal.o.g(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // oz5.l
    public oz5.l minusKey(oz5.j key) {
        kotlin.jvm.internal.o.g(key, "key");
        return this;
    }

    @Override // oz5.l
    public oz5.l plus(oz5.l context) {
        kotlin.jvm.internal.o.g(context, "context");
        return context;
    }

    public java.lang.String toString() {
        return "EmptyCoroutineContext";
    }
}
