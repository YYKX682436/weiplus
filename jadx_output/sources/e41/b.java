package e41;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f247633d = 0;

    public b(e41.c cVar, e41.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f247633d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f247633d;
        this.f247633d = i17 + 1;
        if (i17 == 0) {
            return d41.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
