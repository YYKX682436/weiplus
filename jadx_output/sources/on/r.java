package on;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f346752d = 0;

    public r(on.s sVar, on.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f346752d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f346752d;
        this.f346752d = i17 + 1;
        if (i17 == 0) {
            return on.e.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
