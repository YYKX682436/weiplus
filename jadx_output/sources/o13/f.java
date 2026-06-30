package o13;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f342235d = 0;

    public f(o13.g gVar, o13.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f342235d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f342235d;
        this.f342235d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.fts.l0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
