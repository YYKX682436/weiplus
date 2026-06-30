package ne4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f336547d = 0;

    public b(ne4.c cVar, ne4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f336547d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f336547d;
        this.f336547d = i17 + 1;
        if (i17 == 0) {
            return ne4.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
