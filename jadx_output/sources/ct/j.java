package ct;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f222159d = 0;

    public j(ct.k kVar, ct.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f222159d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f222159d;
        this.f222159d = i17 + 1;
        if (i17 == 0) {
            return qg5.m0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
