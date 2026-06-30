package mz5;

/* loaded from: classes5.dex */
public final /* synthetic */ class a$$a implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l[] f333358d;

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        for (yz5.l lVar : this.f333358d) {
            int b17 = mz5.a.b((java.lang.Comparable) lVar.invoke(obj), (java.lang.Comparable) lVar.invoke(obj2));
            if (b17 != 0) {
                return b17;
            }
        }
        return 0;
    }
}
