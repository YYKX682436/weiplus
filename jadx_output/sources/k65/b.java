package k65;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f304610d = 0;

    public b(k65.c cVar, k65.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f304610d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f304610d;
        this.f304610d = i17 + 1;
        if (i17 == 0) {
            return fm.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
