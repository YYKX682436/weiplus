package ez0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f257786d = 0;

    public b(ez0.c cVar, ez0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f257786d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f257786d;
        this.f257786d = i17 + 1;
        if (i17 == 0) {
            return ez0.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
