package db5;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f228463d = 0;

    public p(db5.q qVar, db5.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f228463d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f228463d;
        this.f228463d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.z7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
