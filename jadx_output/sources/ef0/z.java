package ef0;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f252369d = 0;

    public z(ef0.a0 a0Var, ef0.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f252369d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f252369d;
        this.f252369d = i17 + 1;
        if (i17 == 0) {
            return ef0.f3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
