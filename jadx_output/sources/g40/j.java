package g40;

/* loaded from: classes5.dex */
public final class j implements java.util.function.Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i40.a f268691a;

    public j(i40.a aVar) {
        this.f268691a = aVar;
    }

    @Override // java.util.function.Predicate
    public boolean test(java.lang.Object obj) {
        java.lang.ref.WeakReference it = (java.lang.ref.WeakReference) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return kotlin.jvm.internal.o.b(it.get(), this.f268691a);
    }
}
