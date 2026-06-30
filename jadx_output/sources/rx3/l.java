package rx3;

/* loaded from: classes.dex */
public final class l implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f401036d;

    public l(java.util.List list) {
        this.f401036d = list;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.util.List list = this.f401036d;
        return mz5.a.b(java.lang.Integer.valueOf(list.indexOf((ox3.g) obj)), java.lang.Integer.valueOf(list.indexOf((ox3.g) obj2)));
    }
}
