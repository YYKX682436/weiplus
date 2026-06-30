package je0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f299186d = 0;

    public b(je0.c cVar, je0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f299186d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f299186d;
        this.f299186d = i17 + 1;
        if (i17 == 0) {
            return ie0.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
