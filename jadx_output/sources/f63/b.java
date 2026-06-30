package f63;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f259848d = 0;

    public b(f63.c cVar, f63.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f259848d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f259848d;
        this.f259848d = i17 + 1;
        if (i17 == 0) {
            return f63.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
