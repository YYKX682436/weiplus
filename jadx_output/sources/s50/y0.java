package s50;

/* loaded from: classes4.dex */
public final class y0 implements java.util.function.Predicate {

    /* renamed from: a, reason: collision with root package name */
    public static final s50.y0 f403146a = new s50.y0();

    @Override // java.util.function.Predicate
    public boolean test(java.lang.Object obj) {
        java.util.Map.Entry it = (java.util.Map.Entry) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return ((java.lang.ref.WeakReference) it.getValue()).get() == null;
    }
}
