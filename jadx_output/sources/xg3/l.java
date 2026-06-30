package xg3;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f454409d = 0;

    public l(xg3.m mVar, xg3.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f454409d < 14;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f454409d;
        this.f454409d = i17 + 1;
        switch (i17) {
            case 0:
                return p62.i.INSTANCE;
            case 1:
                return eg5.i.INSTANCE;
            case 2:
                return xw.e0.INSTANCE;
            case 3:
                return ib3.h0.INSTANCE;
            case 4:
                return lw3.d0.INSTANCE;
            case 5:
                return e81.f.INSTANCE;
            case 6:
                return com.tencent.mm.ui.chatting.component.d1.INSTANCE;
            case 7:
                return y00.r.INSTANCE;
            case 8:
                return so3.v.INSTANCE;
            case 9:
                return wz1.h.INSTANCE;
            case 10:
                return f01.y1.INSTANCE;
            case 11:
                return on.g.INSTANCE;
            case 12:
                return yv1.m3.INSTANCE;
            case 13:
                return k05.n.INSTANCE;
            default:
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 14");
        }
    }
}
