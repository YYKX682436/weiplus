package y90;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f460252d = 0;

    public b(y90.c cVar, y90.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f460252d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f460252d;
        this.f460252d = i17 + 1;
        if (i17 == 0) {
            return x90.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
