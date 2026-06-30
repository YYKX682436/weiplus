package d61;

/* loaded from: classes13.dex */
public class i implements java.util.Comparator {
    public i(d61.j jVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return ((java.lang.Integer) ((android.util.Pair) obj).first).compareTo((java.lang.Integer) ((android.util.Pair) obj2).first);
    }
}
