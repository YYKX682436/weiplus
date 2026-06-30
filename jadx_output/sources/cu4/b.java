package cu4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f222477d = 0;

    public b(cu4.c cVar, cu4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f222477d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f222477d;
        this.f222477d = i17 + 1;
        if (i17 == 0) {
            return bu4.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
