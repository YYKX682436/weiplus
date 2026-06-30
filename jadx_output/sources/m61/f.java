package m61;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f324365d = 0;

    public f(m61.g gVar, m61.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f324365d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f324365d;
        this.f324365d = i17 + 1;
        if (i17 == 0) {
            return m61.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
