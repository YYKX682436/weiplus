package ss5;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f412178d = 0;

    public z(ss5.a0 a0Var, ss5.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f412178d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f412178d;
        this.f412178d = i17 + 1;
        if (i17 == 0) {
            return ke2.w0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
