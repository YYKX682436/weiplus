package m33;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f323284d = 0;

    public f(m33.g gVar, m33.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f323284d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f323284d;
        this.f323284d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.game.d1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
