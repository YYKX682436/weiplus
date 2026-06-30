package m11;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f322766d = 0;

    public p(m11.q qVar, m11.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f322766d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f322766d;
        this.f322766d = i17 + 1;
        if (i17 == 0) {
            return m11.s0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
