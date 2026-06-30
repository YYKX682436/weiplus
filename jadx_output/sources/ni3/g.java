package ni3;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f337580d = 0;

    public g(ni3.h hVar, ni3.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f337580d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f337580d;
        this.f337580d = i17 + 1;
        if (i17 == 0) {
            return ni3.i2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
