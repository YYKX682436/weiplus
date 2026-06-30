package mw3;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f331740d = 0;

    public j(mw3.k kVar, mw3.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f331740d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f331740d;
        this.f331740d = i17 + 1;
        if (i17 == 0) {
            return mw3.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
