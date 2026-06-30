package ct1;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f222233d = 0;

    public q(ct1.r rVar, ct1.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f222233d < 17;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f222233d;
        this.f222233d = i17 + 1;
        switch (i17) {
            case 0:
                return ao5.b0.INSTANCE;
            case 1:
                return hk3.g.INSTANCE;
            case 2:
                return oo2.i.INSTANCE;
            case 3:
                return ww1.f2.INSTANCE;
            case 4:
                return oo2.c.INSTANCE;
            case 5:
                return jr4.o.INSTANCE;
            case 6:
                return fr1.h.INSTANCE;
            case 7:
                return xw.h.INSTANCE;
            case 8:
                return hk.q.INSTANCE;
            case 9:
                return com.tencent.mm.plugin.lite.h.INSTANCE;
            case 10:
                return oo2.l.INSTANCE;
            case 11:
                return q12.g0.INSTANCE;
            case 12:
                return ji4.i0.INSTANCE;
            case 13:
                return oo2.f.INSTANCE;
            case 14:
                return c63.p.INSTANCE;
            case 15:
                return kt1.c.INSTANCE;
            case 16:
                return po2.c.INSTANCE;
            default:
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 17");
        }
    }
}
