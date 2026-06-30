package l42;

/* loaded from: classes15.dex */
public class g implements java.util.Comparator {
    public g(l42.n nVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        long V = com.tencent.mm.sdk.platformtools.t8.V(((s42.c) obj).f402945a, 0L);
        long V2 = com.tencent.mm.sdk.platformtools.t8.V(((s42.c) obj2).f402945a, 0L);
        if (V > V2) {
            return 1;
        }
        return V < V2 ? -1 : 0;
    }
}
