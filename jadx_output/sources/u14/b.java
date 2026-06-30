package u14;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f423777d = 0;

    public b(u14.c cVar, u14.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f423777d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f423777d;
        this.f423777d = i17 + 1;
        if (i17 == 0) {
            return u14.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
