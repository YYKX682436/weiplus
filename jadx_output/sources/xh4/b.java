package xh4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f454583d = 0;

    public b(xh4.c cVar, xh4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f454583d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f454583d;
        this.f454583d = i17 + 1;
        if (i17 == 0) {
            return xh4.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
