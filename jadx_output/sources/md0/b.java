package md0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f325704d = 0;

    public b(md0.c cVar, md0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f325704d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f325704d;
        this.f325704d = i17 + 1;
        if (i17 == 0) {
            return md0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
