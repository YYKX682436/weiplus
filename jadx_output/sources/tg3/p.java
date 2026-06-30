package tg3;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f419203d = 0;

    public p(tg3.q qVar, tg3.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f419203d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f419203d;
        this.f419203d = i17 + 1;
        if (i17 == 0) {
            return dk5.d6.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
