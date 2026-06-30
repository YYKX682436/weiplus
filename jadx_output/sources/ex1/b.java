package ex1;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f257188d = 0;

    public b(ex1.c cVar, ex1.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f257188d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f257188d;
        this.f257188d = i17 + 1;
        if (i17 == 0) {
            return ex1.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
