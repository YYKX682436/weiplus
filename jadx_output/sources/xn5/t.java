package xn5;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f455721d = 0;

    public t(xn5.u uVar, xn5.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f455721d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f455721d;
        this.f455721d = i17 + 1;
        if (i17 == 0) {
            return xn5.v0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
