package fd0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f261254d = 0;

    public b(fd0.c cVar, fd0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f261254d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f261254d;
        this.f261254d = i17 + 1;
        if (i17 == 0) {
            return fd0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
