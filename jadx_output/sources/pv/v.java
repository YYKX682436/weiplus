package pv;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f358501d = 0;

    public v(pv.w wVar, pv.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f358501d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f358501d;
        this.f358501d = i17 + 1;
        if (i17 == 0) {
            return ov.q0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
