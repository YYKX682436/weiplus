package y30;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f459130d = 0;

    public b(y30.c cVar, y30.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f459130d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f459130d;
        this.f459130d = i17 + 1;
        if (i17 == 0) {
            return y30.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
