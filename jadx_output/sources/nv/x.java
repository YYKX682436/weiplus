package nv;

/* loaded from: classes6.dex */
public class x implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f340409d = 0;

    public x(nv.y yVar, nv.w wVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f340409d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f340409d;
        this.f340409d = i17 + 1;
        if (i17 == 0) {
            return nv.a2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
