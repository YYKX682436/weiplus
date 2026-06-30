package zl;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f473553d = 0;

    public f(zl.g gVar, zl.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f473553d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f473553d;
        this.f473553d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.app.extension.c1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
