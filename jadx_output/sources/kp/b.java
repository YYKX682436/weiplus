package kp;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f310716d = 0;

    public b(kp.c cVar, kp.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f310716d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f310716d;
        this.f310716d = i17 + 1;
        if (i17 == 0) {
            return kp.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
