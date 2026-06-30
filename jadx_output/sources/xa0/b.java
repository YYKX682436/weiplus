package xa0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f452766d = 0;

    public b(xa0.c cVar, xa0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f452766d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f452766d;
        this.f452766d = i17 + 1;
        if (i17 == 0) {
            return wa0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
