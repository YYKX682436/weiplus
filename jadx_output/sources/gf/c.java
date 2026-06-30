package gf;

/* loaded from: classes13.dex */
public final class c implements com.tencent.skyline.ISkylineMapHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.y f271027a;

    public c(com.tencent.luggage.sdk.jsapi.component.service.y yVar) {
        this.f271027a = yVar;
    }

    @Override // com.tencent.skyline.ISkylineMapHandler
    public void updateMapCustomCallout(int i17, long j17, double d17, double d18, int i18, byte[] bitmapBytes) {
        kotlin.jvm.internal.o.g(bitmapBytes, "bitmapBytes");
        com.tencent.mars.xlog.Log.i("AppServiceSkylineExtensionImpl", "updateMapCustomCallout mapId:" + i17 + " markerId:" + j17 + "  anchorX:" + d17 + " anchorY:" + d18 + " display:" + i18 + " bitmapBytes:" + bitmapBytes);
        java.lang.String appId = this.f271027a.getAppId();
        com.tencent.luggage.sdk.jsapi.component.b V0 = this.f271027a.V0();
        java.lang.String valueOf = java.lang.String.valueOf(i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(V0.getComponentId());
        sb6.append("&");
        sb6.append(valueOf);
        vc1.a3 b17 = vc1.h3.b(appId, sb6.toString());
        if (!(!(bitmapBytes.length == 0))) {
            if (b17 != null) {
                java.lang.String valueOf2 = java.lang.String.valueOf(j17);
                vc1.p1 p1Var = (vc1.p1) b17;
                com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "map:%s removeMarkerCallout markerId:%s", p1Var, valueOf2);
                vc1.o1 z17 = p1Var.z(valueOf2);
                if (z17 == null || z17.f435032e == null) {
                    return;
                }
                z17.f435025b.f435148s = null;
                p1Var.J(z17);
                synchronized (p1Var.f435104w) {
                    z17.f435032e = null;
                }
                return;
            }
            return;
        }
        android.graphics.Bitmap G = com.tencent.mm.sdk.platformtools.x.G(bitmapBytes);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("updateMapCustomCallout mapView:");
        sb7.append(b17);
        sb7.append(" bitmap:");
        sb7.append(G != null ? java.lang.Integer.valueOf(G.getWidth()) : null);
        sb7.append("  ");
        sb7.append(G != null ? java.lang.Integer.valueOf(G.getHeight()) : null);
        com.tencent.mars.xlog.Log.i("AppServiceSkylineExtensionImpl", sb7.toString());
        if (b17 != null) {
            java.lang.String valueOf3 = java.lang.String.valueOf(j17);
            vc1.q2 q2Var = new vc1.q2();
            if (G != null) {
                int c17 = ik1.w.c((int) d17);
                int c18 = ik1.w.c((int) d18);
                vc1.o2 o2Var = new vc1.o2();
                q2Var.f435148s = o2Var;
                o2Var.f435052s = G;
                o2Var.f435047n = i18;
                o2Var.f435049p = c17;
                o2Var.f435050q = c18;
            }
            ik1.h0.b(new vc1.c0((vc1.p1) b17, valueOf3, q2Var, (o91.d) this.f271027a.q(o91.d.class)));
        }
    }
}
