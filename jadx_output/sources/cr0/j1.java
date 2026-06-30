package cr0;

/* loaded from: classes8.dex */
public final class j1 implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Iterator it = ((java.util.Map) ((jz5.l) obj).f302834e).values().iterator();
        long j17 = 0;
        long j18 = 0;
        while (it.hasNext()) {
            j18 += ((com.tencent.mm.matrix.battery.BinderTracker$Timer) it.next()).f68690e;
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(j18);
        java.util.Iterator it6 = ((java.util.Map) ((jz5.l) obj2).f302834e).values().iterator();
        while (it6.hasNext()) {
            j17 += ((com.tencent.mm.matrix.battery.BinderTracker$Timer) it6.next()).f68690e;
        }
        return mz5.a.b(valueOf, java.lang.Long.valueOf(j17));
    }
}
