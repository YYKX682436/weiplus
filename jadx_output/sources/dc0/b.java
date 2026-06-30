package dc0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f228674d = 0;

    public b(dc0.c cVar, dc0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f228674d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f228674d;
        this.f228674d = i17 + 1;
        if (i17 == 0) {
            return dc0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
