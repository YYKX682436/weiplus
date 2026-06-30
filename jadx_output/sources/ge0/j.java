package ge0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f270902d = 0;

    public j(ge0.k kVar, ge0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f270902d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f270902d;
        this.f270902d = i17 + 1;
        if (i17 == 0) {
            return ge0.g0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
