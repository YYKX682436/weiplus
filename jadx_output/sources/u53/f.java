package u53;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f424802d = 0;

    public f(u53.g gVar, u53.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f424802d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f424802d;
        this.f424802d = i17 + 1;
        if (i17 == 0) {
            return z53.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
