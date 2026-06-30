package gi1;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f272242d = 0;

    public g(gi1.h hVar, gi1.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f272242d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f272242d;
        this.f272242d = i17 + 1;
        if (i17 == 0) {
            return gi1.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
