package gd0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f270475d = 0;

    public b(gd0.c cVar, gd0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f270475d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f270475d;
        this.f270475d = i17 + 1;
        if (i17 == 0) {
            return fd0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
