package i11;

/* loaded from: classes13.dex */
public abstract class s implements com.tencent.map.geolocation.sapp.TencentLocationListener {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f287147a;

    public s() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f287147a = hashMap;
        hashMap.put("gps", 0);
        hashMap.put("network", 1);
    }

    public abstract void a(boolean z17, double d17, double d18, int i17, double d19, double d27, double d28, java.lang.String str, java.lang.String str2, int i18);

    @Override // com.tencent.map.geolocation.sapp.TencentLocationListener
    public void onLocationChanged(com.tencent.map.geolocation.sapp.TencentLocation tencentLocation, int i17, java.lang.String str) {
        if (tencentLocation == null) {
            a(false, 0.0d, 0.0d, 0, 0.0d, 0.0d, 0.0d, null, null, 0);
            return;
        }
        int e17 = c01.id.e();
        com.tencent.mars.xlog.Log.i("MicroMsg.SLocationListener", "lat=%f, lng=%f, accuracy=%f errcode=%d, areastat=%d, speed=%f, bearing=%f, reason=%s, provider=%s, changeTime=%s", java.lang.Double.valueOf(tencentLocation.getLatitude()), java.lang.Double.valueOf(tencentLocation.getLongitude()), java.lang.Float.valueOf(tencentLocation.getAccuracy()), java.lang.Integer.valueOf(i17), tencentLocation.getAreaStat(), java.lang.Float.valueOf(tencentLocation.getSpeed()), java.lang.Float.valueOf(tencentLocation.getBearing()), str, tencentLocation.getProvider(), java.lang.Integer.valueOf(e17));
        java.util.Map map = this.f287147a;
        if (i17 != 0) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(584L, 2L, 1L, true);
            if (i17 == 1) {
                g0Var.idkeyStat(584L, 3L, 1L, true);
            } else if (i17 == 4) {
                g0Var.idkeyStat(584L, 4L, 1L, true);
            }
            a(false, tencentLocation.getLatitude(), tencentLocation.getLongitude(), ((java.lang.Integer) ((java.util.HashMap) map).get(tencentLocation.getProvider())).intValue(), tencentLocation.getSpeed(), tencentLocation.getAccuracy(), tencentLocation.getAltitude(), tencentLocation.getIndoorBuildingId(), tencentLocation.getIndoorBuildingFloor(), tencentLocation.getIndoorLocationType());
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(584L, 1L, 1L, true);
        if (gm0.j1.b().m()) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append((int) tencentLocation.getAccuracy());
            stringBuffer.append(",");
            stringBuffer.append(((java.util.HashMap) map).get(tencentLocation.getProvider()));
            stringBuffer.append(",");
            stringBuffer.append(tencentLocation.getLatitude());
            stringBuffer.append(",");
            stringBuffer.append(tencentLocation.getLongitude());
            stringBuffer.append(",");
            stringBuffer.append(e17);
            gm0.j1.u().c().w(68110, stringBuffer.toString());
        }
        a(true, tencentLocation.getLatitude(), tencentLocation.getLongitude(), ((java.lang.Integer) ((java.util.HashMap) map).get(tencentLocation.getProvider())).intValue(), tencentLocation.getSpeed(), tencentLocation.getAccuracy(), tencentLocation.getAltitude(), tencentLocation.getIndoorBuildingId(), tencentLocation.getIndoorBuildingFloor(), tencentLocation.getIndoorLocationType());
    }
}
