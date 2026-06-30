package y56;

/* loaded from: classes16.dex */
public final class a implements java.util.Comparator {
    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        y56.e eVar = (y56.e) obj;
        y56.e eVar2 = (y56.e) obj2;
        long j17 = eVar.f459583a;
        long j18 = eVar2.f459583a;
        if (j17 != j18) {
            if (j17 >= j18) {
                if (j17 > j18) {
                    return 1;
                }
                return 0;
            }
            return -1;
        }
        long j19 = eVar.f459586d;
        long j27 = eVar2.f459586d;
        if (j19 >= j27) {
            if (j19 > j27) {
                return 1;
            }
            return 0;
        }
        return -1;
    }
}
