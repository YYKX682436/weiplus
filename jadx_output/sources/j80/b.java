package j80;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f298132d = 0;

    public b(j80.c cVar, j80.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f298132d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f298132d;
        this.f298132d = i17 + 1;
        if (i17 == 0) {
            return j80.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
