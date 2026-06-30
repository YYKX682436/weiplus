package h43;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f278908d = 0;

    public b(h43.c cVar, h43.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f278908d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f278908d;
        this.f278908d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.game.commlib.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
