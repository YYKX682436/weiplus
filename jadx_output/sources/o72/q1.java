package o72;

/* loaded from: classes6.dex */
public class q1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f343445d = 0;

    public q1(o72.r1 r1Var, o72.p1 p1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f343445d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f343445d;
        this.f343445d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.fav.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
