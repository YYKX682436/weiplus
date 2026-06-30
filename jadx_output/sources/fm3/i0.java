package fm3;

/* loaded from: classes.dex */
public final class i0 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final fm3.i0 f264076d = new fm3.i0();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.util.Map.Entry entry2 = (java.util.Map.Entry) obj2;
        if (((java.lang.Number) entry.getValue()).longValue() > ((java.lang.Number) entry2.getValue()).longValue()) {
            return -1;
        }
        return ((java.lang.Number) entry.getValue()).longValue() < ((java.lang.Number) entry2.getValue()).longValue() ? 1 : 0;
    }
}
