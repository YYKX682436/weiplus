package l81;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f317073d = 0;

    public s(l81.t tVar, l81.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f317073d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f317073d;
        this.f317073d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.k8.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
