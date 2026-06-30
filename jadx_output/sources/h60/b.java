package h60;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f279133d = 0;

    public b(h60.c cVar, h60.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f279133d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f279133d;
        this.f279133d = i17 + 1;
        if (i17 == 0) {
            return g60.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
