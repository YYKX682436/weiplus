package t30;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f415393d = 0;

    public t(t30.u uVar, t30.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f415393d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f415393d;
        this.f415393d = i17 + 1;
        if (i17 == 0) {
            return t30.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
