package kd0;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f306677d = 0;

    public s(kd0.t tVar, kd0.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f306677d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f306677d;
        this.f306677d = i17 + 1;
        if (i17 == 0) {
            return hs.e0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
