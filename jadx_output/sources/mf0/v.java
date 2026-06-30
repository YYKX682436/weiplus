package mf0;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f326018d = 0;

    public v(mf0.w wVar, mf0.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f326018d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f326018d;
        this.f326018d = i17 + 1;
        if (i17 == 0) {
            return mf0.i0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
