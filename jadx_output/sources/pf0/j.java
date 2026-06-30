package pf0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f353762d = 0;

    public j(pf0.k kVar, pf0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f353762d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f353762d;
        this.f353762d = i17 + 1;
        if (i17 == 0) {
            return kn4.l0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
