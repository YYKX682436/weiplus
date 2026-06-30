package l81;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f317062d = 0;

    public g(l81.h hVar, l81.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f317062d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f317062d;
        this.f317062d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.v8_snapshot.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
