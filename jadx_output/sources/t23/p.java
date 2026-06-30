package t23;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f415221d = 0;

    public p(t23.q qVar, t23.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f415221d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f415221d;
        this.f415221d = i17 + 1;
        if (i17 == 0) {
            return t23.h1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
