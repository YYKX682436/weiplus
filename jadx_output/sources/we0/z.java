package we0;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f445189d = 0;

    public z(we0.a0 a0Var, we0.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f445189d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f445189d;
        this.f445189d = i17 + 1;
        if (i17 == 0) {
            return we0.m1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
