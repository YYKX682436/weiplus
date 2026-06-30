package ve0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f436066d = 0;

    public b(ve0.c cVar, ve0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f436066d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f436066d;
        this.f436066d = i17 + 1;
        if (i17 == 0) {
            return o95.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
