package dk0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f233105d = 0;

    public b(dk0.c cVar, dk0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f233105d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f233105d;
        this.f233105d = i17 + 1;
        if (i17 == 0) {
            return oy4.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
