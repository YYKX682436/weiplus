package p9;

/* loaded from: classes15.dex */
public final class i implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final int f352843d;

    /* renamed from: e, reason: collision with root package name */
    public final p9.d f352844e;

    public i(int i17, p9.d dVar) {
        this.f352843d = i17;
        this.f352844e = dVar;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return this.f352843d - ((p9.i) obj).f352843d;
    }
}
