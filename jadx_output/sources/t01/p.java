package t01;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f414410d = 0;

    public p(t01.q qVar, t01.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f414410d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f414410d;
        this.f414410d = i17 + 1;
        if (i17 == 0) {
            return t01.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
