package eg5;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f252857d = 0;

    public p(eg5.q qVar, eg5.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f252857d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f252857d;
        this.f252857d = i17 + 1;
        if (i17 == 0) {
            return eg5.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
