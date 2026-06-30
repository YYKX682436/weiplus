package en3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f255288d = 0;

    public b(en3.c cVar, en3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f255288d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f255288d;
        this.f255288d = i17 + 1;
        if (i17 == 0) {
            return en3.m0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
