package v42;

/* loaded from: classes15.dex */
public class a implements java.util.Comparator {
    public a(v42.b bVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        int i17 = ((r42.b) obj).f369512a;
        int i18 = ((r42.b) obj2).f369512a;
        if (i17 > i18) {
            return 1;
        }
        return i17 < i18 ? -1 : 0;
    }
}
