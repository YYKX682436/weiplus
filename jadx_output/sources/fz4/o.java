package fz4;

/* loaded from: classes5.dex */
public final class o implements java.util.function.Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f267329a;

    public o(java.lang.Object obj) {
        this.f267329a = obj;
    }

    @Override // java.util.function.Predicate
    public boolean test(java.lang.Object obj) {
        java.lang.ref.WeakReference it = (java.lang.ref.WeakReference) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return kotlin.jvm.internal.o.b(it.get(), this.f267329a);
    }
}
