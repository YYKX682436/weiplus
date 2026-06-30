package x61;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f452221d = 0;

    public r(x61.s sVar, x61.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f452221d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f452221d;
        this.f452221d = i17 + 1;
        if (i17 == 0) {
            return x61.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
