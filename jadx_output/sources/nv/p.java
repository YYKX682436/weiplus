package nv;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f340378d = 0;

    public p(nv.q qVar, nv.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f340378d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f340378d;
        this.f340378d = i17 + 1;
        if (i17 == 0) {
            return nv.q1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
