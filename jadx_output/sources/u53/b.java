package u53;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f424799d = 0;

    public b(u53.c cVar, u53.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f424799d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f424799d;
        this.f424799d = i17 + 1;
        if (i17 == 0) {
            return y53.z.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
