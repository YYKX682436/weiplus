package he0;

/* loaded from: classes6.dex */
public class b2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f280667d = 0;

    public b2(he0.c2 c2Var, he0.a2 a2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f280667d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f280667d;
        this.f280667d = i17 + 1;
        if (i17 == 0) {
            return he0.h5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
