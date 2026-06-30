package i11;

/* loaded from: classes13.dex */
public abstract class t implements com.tencent.map.geolocation.sapp.TencentLocationListener {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f287148a;

    public t() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f287148a = hashMap;
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
        com.tencent.mars.xlog.Log.i("MicroMsg.SLocationListenerWgs84", "lat=%f, lng=%f, accuracy=%f errcode=%d, areastat=%d, speed=%f, bearing=%f, reason=%s, provider=%s,changeTime=%s", java.lang.Double.valueOf(tencentLocation.getLatitude()), java.lang.Double.valueOf(tencentLocation.getLongitude()), java.lang.Float.valueOf(tencentLocation.getAccuracy()), java.lang.Integer.valueOf(i17), tencentLocation.getAreaStat(), java.lang.Float.valueOf(tencentLocation.getSpeed()), java.lang.Float.valueOf(tencentLocation.getBearing()), str, tencentLocation.getProvider(), java.lang.Integer.valueOf(e17));
        java.util.Map map = this.f287148a;
        if (i17 != 0) {
            a(false, tencentLocation.getLatitude(), tencentLocation.getLongitude(), ((java.lang.Integer) ((java.util.HashMap) map).get(tencentLocation.getProvider())).intValue(), tencentLocation.getSpeed(), tencentLocation.getAccuracy(), tencentLocation.getAltitude(), tencentLocation.getIndoorBuildingId(), tencentLocation.getIndoorBuildingFloor(), tencentLocation.getIndoorLocationType());
            return;
        }
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
            gm0.j1.u().c().w(68109, stringBuffer.toString());
        }
        a(true, tencentLocation.getLatitude(), tencentLocation.getLongitude(), ((java.lang.Integer) ((java.util.HashMap) map).get(tencentLocation.getProvider())).intValue(), tencentLocation.getSpeed(), tencentLocation.getAccuracy(), tencentLocation.getAltitude(), tencentLocation.getIndoorBuildingId(), tencentLocation.getIndoorBuildingFloor(), tencentLocation.getIndoorLocationType());
    }

    @Override // com.tencent.map.geolocation.sapp.TencentLocationListener
    public void onStatusUpdate(java.lang.String str, int i17, java.lang.String str2) {
    }
}
