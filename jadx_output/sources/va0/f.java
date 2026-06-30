package va0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f434223d = 0;

    public f(va0.g gVar, va0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f434223d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f434223d;
        this.f434223d = i17 + 1;
        if (i17 == 0) {
            return ua0.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
