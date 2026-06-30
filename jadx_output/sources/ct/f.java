package ct;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f222147d = 0;

    public f(ct.g gVar, ct.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f222147d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f222147d;
        this.f222147d = i17 + 1;
        if (i17 == 0) {
            return qg5.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
