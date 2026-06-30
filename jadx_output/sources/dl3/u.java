package dl3;

/* loaded from: classes13.dex */
public class u implements java.util.Comparator {
    public u(dl3.i iVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        long j17 = ((n01.b) obj).f333845j;
        long j18 = ((n01.b) obj2).f333845j;
        if (j17 > j18) {
            return 1;
        }
        return j17 < j18 ? -1 : 0;
    }
}
