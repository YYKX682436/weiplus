package y80;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f459963d = 0;

    public z(y80.a0 a0Var, y80.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f459963d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f459963d;
        this.f459963d = i17 + 1;
        if (i17 == 0) {
            return y80.o1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
