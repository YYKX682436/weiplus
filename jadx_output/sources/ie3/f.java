package ie3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f290999d = 0;

    public f(ie3.g gVar, ie3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f290999d < 17;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f290999d;
        this.f290999d = i17 + 1;
        switch (i17) {
            case 0:
                return kx.q.INSTANCE;
            case 1:
                return z02.f.INSTANCE;
            case 2:
                return uj.s.INSTANCE;
            case 3:
                return g10.z.INSTANCE;
            case 4:
                return pg4.h.INSTANCE;
            case 5:
                return kx.s.INSTANCE;
            case 6:
                return nw.l.INSTANCE;
            case 7:
                return ek.g.INSTANCE;
            case 8:
                return ih1.x.INSTANCE;
            case 9:
                return kq0.g.INSTANCE;
            case 10:
                return nw.n.INSTANCE;
            case 11:
                return xg4.s.INSTANCE;
            case 12:
                return it2.b0.INSTANCE;
            case 13:
                return c10.f.INSTANCE;
            case 14:
                return f05.f.INSTANCE;
            case 15:
                return e10.s.INSTANCE;
            case 16:
                return kx.u.INSTANCE;
            default:
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 17");
        }
    }
}
