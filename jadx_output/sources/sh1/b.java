package sh1;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f408005d = 0;

    public b(sh1.c cVar, sh1.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f408005d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f408005d;
        this.f408005d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.skyline.nativeview.w0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
