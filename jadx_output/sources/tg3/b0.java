package tg3;

/* loaded from: classes6.dex */
public class b0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f419182d = 0;

    public b0(tg3.c0 c0Var, tg3.a0 a0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f419182d < 13;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f419182d;
        this.f419182d = i17 + 1;
        switch (i17) {
            case 0:
                return m90.y0.INSTANCE;
            case 1:
                return v61.d0.INSTANCE;
            case 2:
                return oh1.c2.INSTANCE;
            case 3:
                return jn.c.INSTANCE;
            case 4:
                return m90.w1.INSTANCE;
            case 5:
                return gc0.a0.INSTANCE;
            case 6:
                return m90.t1.INSTANCE;
            case 7:
                return go.r.INSTANCE;
            case 8:
                return gc0.v.INSTANCE;
            case 9:
                return m90.a2.INSTANCE;
            case 10:
                return if3.x.INSTANCE;
            case 11:
                return m90.l1.INSTANCE;
            case 12:
                return m90.p1.INSTANCE;
            default:
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 13");
        }
    }
}
