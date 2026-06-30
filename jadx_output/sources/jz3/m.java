package jz3;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f302796d = 0;

    public m(jz3.n nVar, jz3.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f302796d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f302796d;
        this.f302796d = i17 + 1;
        if (i17 == 0) {
            return jz3.e.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
