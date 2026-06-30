package m01;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f322533d = 0;

    public b(m01.c cVar, m01.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f322533d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f322533d;
        this.f322533d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.s9.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
