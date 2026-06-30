package m33;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f323346d = 0;

    public z(m33.a0 a0Var, m33.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f323346d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f323346d;
        this.f323346d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.game.u1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
