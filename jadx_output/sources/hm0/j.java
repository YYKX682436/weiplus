package hm0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f282186d = 0;

    public j(hm0.k kVar, hm0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f282186d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f282186d;
        this.f282186d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.networking.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
