package gr0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f274717d = 0;

    public j(gr0.k kVar, gr0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f274717d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f274717d;
        this.f274717d = i17 + 1;
        if (i17 == 0) {
            return gr0.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
