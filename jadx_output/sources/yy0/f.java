package yy0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f468079d = 0;

    public f(yy0.g gVar, yy0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f468079d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f468079d;
        this.f468079d = i17 + 1;
        if (i17 == 0) {
            return yy0.n0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
