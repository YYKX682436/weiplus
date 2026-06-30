package p90;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f352862d = 0;

    public f(p90.g gVar, p90.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f352862d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f352862d;
        this.f352862d = i17 + 1;
        if (i17 == 0) {
            return oh3.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
