package vd2;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f435935d = 0;

    public v(vd2.w wVar, vd2.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f435935d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f435935d;
        this.f435935d = i17 + 1;
        if (i17 == 0) {
            return vd2.x2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
