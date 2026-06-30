package l32;

/* loaded from: classes.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f315414d = 0;

    public m(l32.n nVar, l32.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f315414d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f315414d;
        this.f315414d = i17 + 1;
        if (i17 == 0) {
            return l32.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
