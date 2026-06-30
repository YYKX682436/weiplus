package vd2;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f435767d = 0;

    public j(vd2.k kVar, vd2.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f435767d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f435767d;
        this.f435767d = i17 + 1;
        if (i17 == 0) {
            return vd2.l1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
