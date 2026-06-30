package pb0;

/* loaded from: classes4.dex */
public final class b implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Long valueOf;
        java.lang.Long valueOf2;
        java.util.Map.Entry entry = (java.util.Map.Entry) obj2;
        synchronized (entry.getValue()) {
            valueOf = java.lang.Long.valueOf(((pb0.a) entry.getValue()).a());
        }
        java.util.Map.Entry entry2 = (java.util.Map.Entry) obj;
        synchronized (entry2.getValue()) {
            valueOf2 = java.lang.Long.valueOf(((pb0.a) entry2.getValue()).a());
        }
        return mz5.a.b(valueOf, valueOf2);
    }
}
