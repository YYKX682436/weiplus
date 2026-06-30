package l81;

/* loaded from: classes6.dex */
public class a0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f317005d = 0;

    public a0(l81.b0 b0Var, l81.z zVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f317005d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f317005d;
        this.f317005d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.cb.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
