package om4;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f346422d = 0;

    public g(om4.h hVar, om4.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f346422d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f346422d;
        this.f346422d = i17 + 1;
        if (i17 == 0) {
            return om4.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
