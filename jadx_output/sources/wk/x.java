package wk;

/* loaded from: classes6.dex */
public class x implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f446913d = 0;

    public x(wk.y yVar, wk.w wVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f446913d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f446913d;
        this.f446913d = i17 + 1;
        if (i17 == 0) {
            return wk.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
