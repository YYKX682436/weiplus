package l71;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f316826d = 0;

    public b(l71.c cVar, l71.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f316826d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f316826d;
        this.f316826d = i17 + 1;
        if (i17 == 0) {
            return l71.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
