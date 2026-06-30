package qg0;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f362742d = 0;

    public v(qg0.w wVar, qg0.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f362742d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f362742d;
        this.f362742d = i17 + 1;
        if (i17 == 0) {
            return pg0.u3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
