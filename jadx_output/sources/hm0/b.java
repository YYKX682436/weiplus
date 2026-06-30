package hm0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f282180d = 0;

    public b(hm0.c cVar, hm0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f282180d < 11;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f282180d;
        this.f282180d = i17 + 1;
        switch (i17) {
            case 0:
                return com.tencent.mm.feature.app.extension.y0.INSTANCE;
            case 1:
                return qb0.m.INSTANCE;
            case 2:
                return com.tencent.mm.plugin.appbrand.task.preload.a0.INSTANCE;
            case 3:
                return xc.m.INSTANCE;
            case 4:
                return com.tencent.mm.plugin.appbrand.performance.a0.INSTANCE;
            case 5:
                return com.tencent.mm.plugin.appbrand.o.INSTANCE;
            case 6:
                return com.tencent.mm.feature.app.extension.v0.INSTANCE;
            case 7:
                return com.tencent.mm.plugin.appbrand.app.t7.INSTANCE;
            case 8:
                return com.tencent.mm.feature.app.extension.p0.INSTANCE;
            case 9:
                return v43.o.INSTANCE;
            case 10:
                return com.tencent.mm.plugin.webview.ui.tools.floatball.i.INSTANCE;
            default:
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 11");
        }
    }
}
