package vk;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f437735d = 0;

    public f(vk.g gVar, vk.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f437735d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f437735d;
        this.f437735d = i17 + 1;
        if (i17 == 0) {
            return vk.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
