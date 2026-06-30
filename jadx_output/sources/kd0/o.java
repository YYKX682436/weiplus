package kd0;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f306668d = 0;

    public o(kd0.p pVar, kd0.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f306668d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f306668d;
        this.f306668d = i17 + 1;
        if (i17 == 0) {
            return jd0.v1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
