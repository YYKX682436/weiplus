package l43;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f316015d = 0;

    public b(l43.c cVar, l43.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f316015d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f316015d;
        this.f316015d = i17 + 1;
        if (i17 == 0) {
            return l43.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
