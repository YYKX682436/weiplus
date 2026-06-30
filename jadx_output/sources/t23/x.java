package t23;

/* loaded from: classes6.dex */
public class x implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f415289d = 0;

    public x(t23.y yVar, t23.w wVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f415289d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f415289d;
        this.f415289d = i17 + 1;
        if (i17 == 0) {
            return t23.h1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
