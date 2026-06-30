package vd0;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f435489d = 0;

    public q(vd0.r rVar, vd0.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f435489d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f435489d;
        this.f435489d = i17 + 1;
        if (i17 == 0) {
            return vd0.w1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
