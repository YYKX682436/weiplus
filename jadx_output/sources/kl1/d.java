package kl1;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f308744d = 0;

    public d(kl1.e eVar, kl1.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f308744d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f308744d;
        this.f308744d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.luggage.customize.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
