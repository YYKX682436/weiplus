package ff0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f261583d = 0;

    public b(ff0.c cVar, ff0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f261583d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f261583d;
        this.f261583d = i17 + 1;
        if (i17 == 0) {
            return if0.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
