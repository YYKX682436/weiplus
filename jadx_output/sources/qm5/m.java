package qm5;

/* loaded from: classes14.dex */
public class m implements java.util.Comparator {
    public m(qm5.n nVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        int i17 = ((qm5.q) obj).f364867b;
        int i18 = ((qm5.q) obj2).f364867b;
        if (i18 < i17) {
            return 1;
        }
        return i17 < i18 ? -1 : 0;
    }
}
