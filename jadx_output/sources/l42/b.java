package l42;

/* loaded from: classes15.dex */
public class b implements java.util.Comparator {
    public b(l42.c cVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        int i17 = ((s42.a) obj).f402928a;
        int i18 = ((s42.a) obj2).f402928a;
        if (i17 > i18) {
            return 1;
        }
        return i17 < i18 ? -1 : 0;
    }
}
