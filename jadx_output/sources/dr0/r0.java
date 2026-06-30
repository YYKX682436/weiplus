package dr0;

/* loaded from: classes.dex */
public final class r0 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final dr0.r0 f242518d = new dr0.r0();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.util.Map.Entry entry2 = (java.util.Map.Entry) obj2;
        kotlin.jvm.internal.o.g(entry, "<name for destructuring parameter 0>");
        kotlin.jvm.internal.o.g(entry2, "<name for destructuring parameter 1>");
        return -kotlin.jvm.internal.o.i(((java.lang.Number) entry.getValue()).intValue(), ((java.lang.Number) entry2.getValue()).intValue());
    }
}
