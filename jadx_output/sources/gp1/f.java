package gp1;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f274182d = 0;

    public f(gp1.g gVar, gp1.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f274182d < 16;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f274182d;
        this.f274182d = i17 + 1;
        switch (i17) {
            case 0:
                return uy.k.INSTANCE;
            case 1:
                return ll3.s0.INSTANCE;
            case 2:
                return zk4.n.INSTANCE;
            case 3:
                return pa3.k.INSTANCE;
            case 4:
                return cz4.h.INSTANCE;
            case 5:
                return ah0.y1.INSTANCE;
            case 6:
                return gt.c5.INSTANCE;
            case 7:
                return com.tencent.mm.plugin.webview.ui.tools.floatball.i.INSTANCE;
            case 8:
                return ah0.v1.INSTANCE;
            case 9:
                return cm3.l.INSTANCE;
            case 10:
                return nf0.t.INSTANCE;
            case 11:
                return r63.r.INSTANCE;
            case 12:
                return ah0.b1.INSTANCE;
            case 13:
                return n02.d.INSTANCE;
            case 14:
                return kd2.z.INSTANCE;
            case 15:
                return lc5.r.INSTANCE;
            default:
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 16");
        }
    }
}
