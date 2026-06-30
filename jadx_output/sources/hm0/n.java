package hm0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f282189d = 0;

    public n(hm0.o oVar, hm0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f282189d < 7;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f282189d;
        this.f282189d = i17 + 1;
        switch (i17) {
            case 0:
                return o90.r.INSTANCE;
            case 1:
                return el4.c0.INSTANCE;
            case 2:
                return com.tencent.mm.feature.app.extension.s0.INSTANCE;
            case 3:
                return com.tencent.mm.plugin.appbrand.networking.l.INSTANCE;
            case 4:
                return ah0.b2.INSTANCE;
            case 5:
                return gt.l5.INSTANCE;
            case 6:
                return ez3.n.INSTANCE;
            default:
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 7");
        }
    }
}
