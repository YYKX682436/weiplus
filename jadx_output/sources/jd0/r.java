package jd0;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f299096d = 0;

    public r(jd0.s sVar, jd0.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f299096d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f299096d;
        this.f299096d = i17 + 1;
        if (i17 == 0) {
            return jd0.x1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
