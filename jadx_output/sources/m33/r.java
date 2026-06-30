package m33;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f323328d = 0;

    public r(m33.s sVar, m33.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f323328d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f323328d;
        this.f323328d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.game.m1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
