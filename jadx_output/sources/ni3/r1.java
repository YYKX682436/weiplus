package ni3;

/* loaded from: classes12.dex */
public class r1 implements java.util.Comparator {
    public r1(ni3.g2 g2Var) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        long B = ((com.tencent.mm.vfs.r6) obj).B() - ((com.tencent.mm.vfs.r6) obj2).B();
        if (B > 0) {
            return 1;
        }
        return B == 0 ? 0 : -1;
    }

    @Override // java.util.Comparator
    public boolean equals(java.lang.Object obj) {
        return true;
    }
}
