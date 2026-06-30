package ks3;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f311733d = 0;

    public p(ks3.q qVar, ks3.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f311733d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f311733d;
        this.f311733d = i17 + 1;
        if (i17 == 0) {
            return hs3.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
