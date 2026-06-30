package u50;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f424759d = 0;

    public f(u50.g gVar, u50.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f424759d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f424759d;
        this.f424759d = i17 + 1;
        if (i17 == 0) {
            return s50.l0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
