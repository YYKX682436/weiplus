package d50;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f226508d = 0;

    public b(d50.c cVar, d50.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f226508d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f226508d;
        this.f226508d = i17 + 1;
        if (i17 == 0) {
            return d50.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
