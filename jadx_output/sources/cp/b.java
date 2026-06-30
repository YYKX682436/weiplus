package cp;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f220736d = 0;

    public b(cp.c cVar, cp.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f220736d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f220736d;
        this.f220736d = i17 + 1;
        if (i17 == 0) {
            return fz.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
