package p05;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f350614d = 0;

    public m(p05.n nVar, p05.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f350614d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f350614d;
        this.f350614d = i17 + 1;
        if (i17 == 0) {
            return p05.r1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
