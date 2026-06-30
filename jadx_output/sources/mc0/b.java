package mc0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f325570d = 0;

    public b(mc0.c cVar, mc0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f325570d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f325570d;
        this.f325570d = i17 + 1;
        if (i17 == 0) {
            return bt3.w1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
