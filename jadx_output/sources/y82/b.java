package y82;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f459973d = 0;

    public b(y82.c cVar, y82.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f459973d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f459973d;
        this.f459973d = i17 + 1;
        if (i17 == 0) {
            return y82.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
