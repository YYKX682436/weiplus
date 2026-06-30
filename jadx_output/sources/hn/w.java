package hn;

/* loaded from: classes6.dex */
public class w implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f282379d = 0;

    public w(hn.x xVar, hn.v vVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f282379d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f282379d;
        this.f282379d = i17 + 1;
        if (i17 == 0) {
            return hn.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
