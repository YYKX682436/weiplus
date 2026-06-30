package yy0;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f468365d = 0;

    public v(yy0.w wVar, yy0.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f468365d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f468365d;
        this.f468365d = i17 + 1;
        if (i17 == 0) {
            return yy0.r7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
