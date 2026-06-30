package xp0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f455865d = 0;

    public b(xp0.c cVar, xp0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f455865d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f455865d;
        this.f455865d = i17 + 1;
        if (i17 == 0) {
            return s12.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
