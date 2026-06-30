package uq3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f430219d = 0;

    public b(uq3.c cVar, uq3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f430219d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f430219d;
        this.f430219d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.performance.s4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
