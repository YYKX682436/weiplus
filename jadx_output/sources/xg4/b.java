package xg4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f454437d = 0;

    public b(xg4.c cVar, xg4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f454437d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f454437d;
        this.f454437d = i17 + 1;
        if (i17 == 0) {
            return xg4.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
