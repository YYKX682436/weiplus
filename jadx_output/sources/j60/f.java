package j60;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f297849d = 0;

    public f(j60.g gVar, j60.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f297849d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f297849d;
        this.f297849d = i17 + 1;
        if (i17 == 0) {
            return j60.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
