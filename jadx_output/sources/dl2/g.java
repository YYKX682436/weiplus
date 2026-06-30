package dl2;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f235220a;

    /* renamed from: b, reason: collision with root package name */
    public long f235221b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f235222c;

    public g(int i17, long j17, java.util.LinkedList productList) {
        kotlin.jvm.internal.o.g(productList, "productList");
        this.f235220a = i17;
        this.f235221b = j17;
        this.f235222c = productList;
    }

    public java.lang.String toString() {
        java.lang.String str = "FinderLiveGiftPkgChooseResult: level=" + this.f235220a + ", coin=" + this.f235221b + " \n";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = this.f235222c.iterator();
        while (it.hasNext()) {
            sb6.append(((dl2.f) it.next()).toString());
            sb6.append("\n");
        }
        return str + ((java.lang.Object) sb6);
    }
}
