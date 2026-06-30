package l81;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f317067d = 0;

    public k(l81.l lVar, l81.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f317067d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f317067d;
        this.f317067d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.screenshot.e0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
