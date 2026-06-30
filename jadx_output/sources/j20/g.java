package j20;

/* loaded from: classes9.dex */
public final class g implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f297224d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Runnable f297225e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f297226f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j20.o f297227g;

    public g(j20.o oVar, int i17, yz5.l lVar) {
        this.f297227g = oVar;
        this.f297224d = lVar;
    }

    public final synchronized void a(int i17, float f17, float f18) {
        if (this.f297226f) {
            return;
        }
        this.f297226f = true;
        com.tencent.mars.xlog.Log.i("EcsPoiService", "result:" + i17 + ",fLongitude:" + f17 + ",fLatitude:" + f18 + ",callback:" + this.f297224d);
        yz5.l lVar = this.f297224d;
        if (lVar != null) {
            lVar.invoke(this.f297227g.Ai(i17, f17, f18, c01.id.c()));
        }
        java.util.List wi6 = j20.o.wi(this.f297227g);
        if (wi6 != null) {
            wi6.remove(this);
        }
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        java.lang.Runnable runnable = this.f297225e;
        j20.o oVar = this.f297227g;
        if (runnable != null) {
            ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) oVar.f297238e).getValue()).removeCallbacks(runnable);
        }
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h.e().m(this);
        if (z17) {
            oVar.Ni(f17, f18);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onGetLocation] longitude=");
            sb6.append(f17);
            sb6.append(" latitude=");
            sb6.append(f18);
            sb6.append(", listener size=");
            java.util.List wi6 = j20.o.wi(oVar);
            sb6.append(wi6 != null ? java.lang.Integer.valueOf(wi6.size()) : null);
            sb6.append('}');
            com.tencent.mars.xlog.Log.i("EcsPoiService", sb6.toString());
            a(1, f17, f18);
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[onGetLocation] from cache. longitude=");
            sb7.append(f17);
            sb7.append(" latitude=");
            sb7.append(f18);
            sb7.append(", listener size=");
            java.util.List wi7 = j20.o.wi(oVar);
            sb7.append(wi7 != null ? java.lang.Integer.valueOf(wi7.size()) : null);
            sb7.append('}');
            com.tencent.mars.xlog.Log.i("EcsPoiService", sb7.toString());
            a(102, f17, f18);
        }
        return true;
    }
}
