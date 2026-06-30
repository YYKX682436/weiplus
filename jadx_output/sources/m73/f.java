package m73;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f324497d = 0;

    public f(m73.g gVar, m73.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f324497d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f324497d;
        this.f324497d = i17 + 1;
        if (i17 == 0) {
            return m73.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
