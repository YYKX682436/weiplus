package vg3;

/* loaded from: classes6.dex */
public class i2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f436711d = 0;

    public i2(vg3.j2 j2Var, vg3.h2 h2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f436711d < 40;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f436711d;
        this.f436711d = i17 + 1;
        switch (i17) {
            case 0:
                return o30.f.INSTANCE;
            case 1:
                return oh1.b1.INSTANCE;
            case 2:
                return oh1.t2.INSTANCE;
            case 3:
                return on.e.INSTANCE;
            case 4:
                return d21.m.INSTANCE;
            case 5:
                return com.tencent.mm.plugin.lite.logic.w2.INSTANCE;
            case 6:
                return sj.d.INSTANCE;
            case 7:
                return cm1.x.INSTANCE;
            case 8:
                return n41.n.INSTANCE;
            case 9:
                return oh1.q2.INSTANCE;
            case 10:
                return com.tencent.mm.plugin.appbrand.appcache.predownload.d1.INSTANCE;
            case 11:
                return jf3.t.INSTANCE;
            case 12:
                return ln.r.INSTANCE;
            case 13:
                return oe2.d0.INSTANCE;
            case 14:
                return jr2.x.INSTANCE;
            case 15:
                return p05.r1.INSTANCE;
            case 16:
                return jr2.d0.INSTANCE;
            case 17:
                return dh0.l.INSTANCE;
            case 18:
                return oh1.w0.INSTANCE;
            case 19:
                return qb2.a2.INSTANCE;
            case 20:
                return j00.n1.INSTANCE;
            case 21:
                return com.tencent.mm.plugin.lite.logic.b0.INSTANCE;
            case 22:
                return com.tencent.mm.plugin.fav.j.INSTANCE;
            case 23:
                return oh1.j1.INSTANCE;
            case 24:
                return rj1.q.INSTANCE;
            case 25:
                return qb2.w1.INSTANCE;
            case 26:
                return f30.c.INSTANCE;
            case 27:
                return c01.w.INSTANCE;
            case 28:
                return sn3.n.INSTANCE;
            case 29:
                return oh1.f1.INSTANCE;
            case 30:
                return jr2.b0.INSTANCE;
            case 31:
                return aq5.u0.INSTANCE;
            case 32:
                return oh1.v1.INSTANCE;
            case 33:
                return jr2.z.INSTANCE;
            case 34:
                return jr2.f0.INSTANCE;
            case 35:
                return w61.m.INSTANCE;
            case 36:
                return oe2.z.INSTANCE;
            case 37:
                return b14.f.INSTANCE;
            case 38:
                return a35.t.INSTANCE;
            case 39:
                return ln.t.INSTANCE;
            default:
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 40");
        }
    }
}
