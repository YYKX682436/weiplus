package qv;

/* loaded from: classes6.dex */
public class b2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f366839d = 0;

    public b2(qv.c2 c2Var, qv.a2 a2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f366839d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f366839d;
        this.f366839d = i17 + 1;
        if (i17 == 0) {
            return qv.h2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
