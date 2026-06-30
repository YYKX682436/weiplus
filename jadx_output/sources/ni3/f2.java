package ni3;

/* loaded from: classes12.dex */
public class f2 implements java.util.Comparator {
    public f2(ni3.g2 g2Var) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        long j17 = ((ni3.d1) obj).f337558b - ((ni3.d1) obj2).f337558b;
        if (j17 > 0) {
            return 1;
        }
        return j17 == 0 ? 0 : -1;
    }
}
