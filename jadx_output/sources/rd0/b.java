package rd0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f394199d = 0;

    public b(rd0.c cVar, rd0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f394199d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f394199d;
        this.f394199d = i17 + 1;
        if (i17 == 0) {
            return qd0.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
