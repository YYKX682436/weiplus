package lt;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f321138d = 0;

    public b(lt.c cVar, lt.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f321138d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f321138d;
        this.f321138d = i17 + 1;
        if (i17 == 0) {
            return kt.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
