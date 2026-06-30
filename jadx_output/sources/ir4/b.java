package ir4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f294261d = 0;

    public b(ir4.c cVar, ir4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f294261d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f294261d;
        this.f294261d = i17 + 1;
        if (i17 == 0) {
            return ir4.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
