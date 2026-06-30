package m33;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f323274d = 0;

    public b(m33.c cVar, m33.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f323274d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f323274d;
        this.f323274d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.game.i0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
