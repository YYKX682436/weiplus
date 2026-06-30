package v81;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f434063d = 0;

    public b(v81.c cVar, v81.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f434063d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f434063d;
        this.f434063d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.appstorage.x0.INSTANCE;
        }
        if (i17 == 1) {
            return com.tencent.mm.plugin.appbrand.appstorage.m3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
