package pg0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f354006d = 0;

    public j(pg0.k kVar, pg0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f354006d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f354006d;
        this.f354006d = i17 + 1;
        if (i17 == 0) {
            return pg0.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
