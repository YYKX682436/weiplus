package vr4;

/* loaded from: classes6.dex */
public class x implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f439810d = 0;

    public x(vr4.y yVar, vr4.w wVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f439810d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f439810d;
        this.f439810d = i17 + 1;
        if (i17 == 0) {
            return vr4.z0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
