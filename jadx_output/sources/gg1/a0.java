package gg1;

/* loaded from: classes7.dex */
public final class a0 extends gg1.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f271528a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(gg1.c1 c1Var) {
        super(c1Var);
        this.f271528a = c1Var;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get position  fail");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f2487c) : "");
        com.tencent.mars.xlog.Log.e("MicroMsg.VideoCast.VideoCastController", sb6.toString());
        gg1.x xVar = new gg1.x(gg1.a.f271526m);
        gg1.c1 c1Var = this.f271528a;
        c1Var.f271548n.d();
        gg1.c1.a(c1Var, xVar);
    }

    @Override // z91.a
    public void b(aa1.e response) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(response, "response");
        java.util.Map map = response.f2489b;
        if (map == null || map.isEmpty()) {
            return;
        }
        if (map.containsKey("RelTime") && map.containsKey("TrackDuration")) {
            java.lang.String str3 = ((aa1.a) kz5.c1.h(map, "RelTime")).f2481a;
            java.lang.String str4 = ((aa1.a) kz5.c1.h(map, "TrackDuration")).f2481a;
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoCast.VideoCastController", "getProgressTimeMs: relTime = " + str3 + ", duration =  " + str4);
            fg1.j jVar = fg1.u.f261893l;
            int b17 = (int) jVar.b(str3);
            int b18 = (int) jVar.b(str4);
            gg1.c1 c1Var = this.f271528a;
            c1Var.f271543i = b17;
            fg1.g gVar = (fg1.g) c1Var.f271536b;
            gVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "onVideoTimeUpdate: currentPosition = " + b17 + " duration = " + b18);
            try {
                if (java.lang.Math.abs(b17 - gVar.f261865a) < 250) {
                    str = str4;
                    str2 = "MicroMsg.VideoCast.VideoCastController";
                } else {
                    gVar.f261865a = b17;
                    double d17 = 1000;
                    double d18 = (b18 * 1.0d) / d17;
                    str = str4;
                    str2 = "MicroMsg.VideoCast.VideoCastController";
                    try {
                        double doubleValue = new java.math.BigDecimal((b17 * 1.0d) / d17).setScale(3, 4).doubleValue();
                        org.json.JSONObject b19 = gVar.b();
                        b19.put("type", "DLNA");
                        b19.put("position", doubleValue);
                        b19.put("duration", d18);
                        gVar.a(new fg1.e(), b19);
                    } catch (org.json.JSONException e17) {
                        e = e17;
                        com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "OnXWebVideoTimeUpdate fail", e);
                        int i17 = (int) ((b17 / b18) * 100);
                        fg1.g gVar2 = (fg1.g) c1Var.f271536b;
                        gVar2.getClass();
                        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "onVideoProgress: " + i17);
                        org.json.JSONObject b27 = gVar2.b();
                        b27.put("buffered", i17);
                        b27.put("type", "DLNA");
                        gVar2.a(new fg1.d(), b27);
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get position success, relTime: ");
                        fg1.j jVar2 = fg1.u.f261893l;
                        sb6.append((int) jVar2.b(str3));
                        sb6.append(" duration: ");
                        sb6.append((int) jVar2.b(str));
                        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
                    }
                }
            } catch (org.json.JSONException e18) {
                e = e18;
                str = str4;
                str2 = "MicroMsg.VideoCast.VideoCastController";
            }
            int i172 = (int) ((b17 / b18) * 100);
            fg1.g gVar22 = (fg1.g) c1Var.f271536b;
            gVar22.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "onVideoProgress: " + i172);
            try {
                org.json.JSONObject b272 = gVar22.b();
                b272.put("buffered", i172);
                b272.put("type", "DLNA");
                gVar22.a(new fg1.d(), b272);
            } catch (org.json.JSONException e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "OnXWebVideoProgress fail", e19);
            }
            java.lang.StringBuilder sb62 = new java.lang.StringBuilder("get position success, relTime: ");
            fg1.j jVar22 = fg1.u.f261893l;
            sb62.append((int) jVar22.b(str3));
            sb62.append(" duration: ");
            sb62.append((int) jVar22.b(str));
            com.tencent.mars.xlog.Log.i(str2, sb62.toString());
        }
    }
}
