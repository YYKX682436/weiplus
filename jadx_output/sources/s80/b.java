package s80;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f404712d = 0;

    public b(s80.c cVar, s80.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f404712d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f404712d;
        this.f404712d = i17 + 1;
        if (i17 == 0) {
            return s80.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
