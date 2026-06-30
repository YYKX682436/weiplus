package d70;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f226862d = 0;

    public b(d70.c cVar, d70.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f226862d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f226862d;
        this.f226862d = i17 + 1;
        if (i17 == 0) {
            return c70.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
