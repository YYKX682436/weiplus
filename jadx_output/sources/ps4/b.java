package ps4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f358146d = 0;

    public b(ps4.c cVar, ps4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f358146d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f358146d;
        this.f358146d = i17 + 1;
        if (i17 == 0) {
            return ps4.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
