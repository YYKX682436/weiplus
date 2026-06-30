package he0;

/* loaded from: classes6.dex */
public class x implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f280832d = 0;

    public x(he0.y yVar, he0.w wVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f280832d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f280832d;
        this.f280832d = i17 + 1;
        if (i17 == 0) {
            return he0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
