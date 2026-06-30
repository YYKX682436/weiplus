package th4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f419326d = 0;

    public b(th4.c cVar, th4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f419326d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f419326d;
        this.f419326d = i17 + 1;
        if (i17 == 0) {
            return th4.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
