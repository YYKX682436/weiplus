package sg0;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f407809d = 0;

    public t(sg0.u uVar, sg0.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f407809d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f407809d;
        this.f407809d = i17 + 1;
        if (i17 == 0) {
            return sg0.f2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
