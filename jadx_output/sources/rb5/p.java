package rb5;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f393903d = 0;

    public p(rb5.q qVar, rb5.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f393903d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f393903d;
        this.f393903d = i17 + 1;
        if (i17 == 0) {
            return rb5.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
