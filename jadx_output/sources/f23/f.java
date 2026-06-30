package f23;

/* loaded from: classes.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f258990d = 0;

    public f(f23.g gVar, f23.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f258990d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f258990d;
        this.f258990d = i17 + 1;
        if (i17 == 0) {
            return f23.f2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
