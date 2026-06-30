package ff3;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f261645d = 0;

    public j(ff3.k kVar, ff3.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f261645d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f261645d;
        this.f261645d = i17 + 1;
        if (i17 == 0) {
            return ff3.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
