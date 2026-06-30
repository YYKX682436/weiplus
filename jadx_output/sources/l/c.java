package l;

/* loaded from: classes16.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f314024d = 0;

    public c(l.d dVar, l.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f314024d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f314024d;
        this.f314024d = i17 + 1;
        if (i17 == 0) {
            return i.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
