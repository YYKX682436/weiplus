package rh;

/* loaded from: classes12.dex */
public class f0 implements java.util.Comparator {
    public f0(rh.c1 c1Var) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj2;
        java.util.Iterator it = ((java.util.List) ((java.util.Map.Entry) obj).getValue()).iterator();
        long j17 = 0;
        while (it.hasNext()) {
            j17 += ((java.lang.Long) ((rh.f) ((rh.o2) ((m3.d) it.next()).f323093b).f395486c).f395377g.f395552a).longValue();
        }
        java.util.Iterator it6 = ((java.util.List) entry.getValue()).iterator();
        long j18 = 0;
        while (it6.hasNext()) {
            j18 += ((java.lang.Long) ((rh.f) ((rh.o2) ((m3.d) it6.next()).f323093b).f395486c).f395377g.f395552a).longValue();
        }
        long j19 = j17 - j18;
        if (j19 == 0) {
            return 0;
        }
        return j19 > 0 ? -1 : 1;
    }
}
