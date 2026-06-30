package he0;

/* loaded from: classes6.dex */
public class j4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f280737d = 0;

    public j4(he0.k4 k4Var, he0.i4 i4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f280737d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f280737d;
        this.f280737d = i17 + 1;
        if (i17 == 0) {
            return he0.o6.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
