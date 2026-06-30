package j20;

/* loaded from: classes9.dex */
public final class j implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j20.o f297230d;

    public j(j20.o oVar) {
        this.f297230d = oVar;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h.e().m(this);
        j20.o oVar = this.f297230d;
        if (!z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onGetLocation] from cache. longitude=");
            sb6.append(f17);
            sb6.append(" latitude=");
            sb6.append(f18);
            sb6.append(", listener size=");
            java.util.List wi6 = j20.o.wi(oVar);
            sb6.append(wi6 != null ? java.lang.Integer.valueOf(wi6.size()) : null);
            com.tencent.mars.xlog.Log.i("EcsPoiService", sb6.toString());
            return true;
        }
        oVar.Ni(f17, f18);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[onGetLocation] longitude=");
        sb7.append(f17);
        sb7.append(" latitude=");
        sb7.append(f18);
        sb7.append(", listener size=");
        java.util.List wi7 = j20.o.wi(oVar);
        sb7.append(wi7 != null ? java.lang.Integer.valueOf(wi7.size()) : null);
        com.tencent.mars.xlog.Log.i("EcsPoiService", sb7.toString());
        return true;
    }
}
