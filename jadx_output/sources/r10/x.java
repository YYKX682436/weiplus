package r10;

/* loaded from: classes6.dex */
public class x implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f368598d = 0;

    public x(r10.y yVar, r10.w wVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f368598d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f368598d;
        this.f368598d = i17 + 1;
        if (i17 == 0) {
            return r10.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
