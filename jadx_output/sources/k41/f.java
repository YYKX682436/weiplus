package k41;

/* loaded from: classes.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f303985d = 0;

    public f(k41.g gVar, k41.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f303985d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f303985d;
        this.f303985d = i17 + 1;
        if (i17 == 0) {
            return k41.f0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
