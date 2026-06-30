package vz4;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f441728d = 0;

    public d(vz4.e eVar, vz4.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f441728d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f441728d;
        this.f441728d = i17 + 1;
        if (i17 == 0) {
            return vz4.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
