package t56;

/* loaded from: classes16.dex */
public final class p0 implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final r56.a f415927d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Long f415928e;

    /* renamed from: f, reason: collision with root package name */
    public final int f415929f;

    public p0(r56.a aVar, java.lang.Long l17, int i17) {
        this.f415927d = aVar;
        this.f415928e = l17;
        this.f415929f = i17;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        t56.p0 p0Var = (t56.p0) obj;
        int compareTo = this.f415928e.compareTo(p0Var.f415928e);
        if (compareTo != 0) {
            return compareTo;
        }
        t56.q0 q0Var = t56.q0.f415931e;
        int i17 = this.f415929f;
        int i18 = p0Var.f415929f;
        return i17 < i18 ? -1 : i17 == i18 ? 0 : 1;
    }
}
