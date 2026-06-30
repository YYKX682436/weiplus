package fn4;

/* loaded from: classes13.dex */
public class m0 implements java.util.Comparator {
    public m0(fn4.n0 n0Var) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return java.lang.Long.compare(((com.tencent.mm.vfs.r6) obj2).B(), ((com.tencent.mm.vfs.r6) obj).B());
    }
}
