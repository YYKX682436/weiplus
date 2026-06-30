package rm;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f397384d = 0;

    public k(rm.l lVar, rm.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f397384d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f397384d;
        this.f397384d = i17 + 1;
        if (i17 == 0) {
            return ur1.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
