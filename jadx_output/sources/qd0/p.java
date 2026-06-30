package qd0;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f361576d = 0;

    public p(qd0.q qVar, qd0.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f361576d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f361576d;
        this.f361576d = i17 + 1;
        if (i17 == 0) {
            return qd0.p0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
