package li3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f318773d = 0;

    public b(li3.c cVar, li3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f318773d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f318773d;
        this.f318773d = i17 + 1;
        if (i17 == 0) {
            return li3.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
