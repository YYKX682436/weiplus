package sg0;

/* loaded from: classes6.dex */
public class x implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f407854d = 0;

    public x(sg0.y yVar, sg0.w wVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f407854d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f407854d;
        this.f407854d = i17 + 1;
        if (i17 == 0) {
            return sg0.x2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
