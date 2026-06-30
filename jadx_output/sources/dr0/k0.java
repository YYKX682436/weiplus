package dr0;

/* loaded from: classes.dex */
public final class k0 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final dr0.k0 f242453d = new dr0.k0();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.util.Map.Entry entry2 = (java.util.Map.Entry) obj2;
        kotlin.jvm.internal.o.g(entry, "<name for destructuring parameter 0>");
        kotlin.jvm.internal.o.g(entry2, "<name for destructuring parameter 1>");
        return -kotlin.jvm.internal.o.j(((java.lang.Number) entry.getValue()).longValue(), ((java.lang.Number) entry2.getValue()).longValue());
    }
}
