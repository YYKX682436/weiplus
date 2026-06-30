package mf0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f326009d = 0;

    public j(mf0.k kVar, mf0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f326009d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f326009d;
        this.f326009d = i17 + 1;
        if (i17 == 0) {
            return lf0.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
