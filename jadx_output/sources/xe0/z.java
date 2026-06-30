package xe0;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f453826d = 0;

    public z(xe0.a0 a0Var, xe0.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f453826d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f453826d;
        this.f453826d = i17 + 1;
        if (i17 == 0) {
            return we0.k1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
