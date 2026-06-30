package vk;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f437732d = 0;

    public b(vk.c cVar, vk.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f437732d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f437732d;
        this.f437732d = i17 + 1;
        if (i17 == 0) {
            return vk.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
