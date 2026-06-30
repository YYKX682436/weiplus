package og0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f345111d = 0;

    public b(og0.c cVar, og0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f345111d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f345111d;
        this.f345111d = i17 + 1;
        if (i17 == 0) {
            return ng0.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
