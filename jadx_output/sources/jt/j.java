package jt;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f301579d = 0;

    public j(jt.k kVar, jt.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f301579d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f301579d;
        this.f301579d = i17 + 1;
        if (i17 == 0) {
            return ht.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
