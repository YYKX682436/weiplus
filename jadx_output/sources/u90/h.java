package u90;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f425798d = 0;

    public h(u90.i iVar, u90.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f425798d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f425798d;
        this.f425798d = i17 + 1;
        if (i17 == 0) {
            return u90.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
