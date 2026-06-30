package i11;

/* loaded from: classes13.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f287156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.map.geolocation.sapp.TencentLocationListener f287157e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f287158f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Looper f287159g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i11.u f287160h;

    public y(i11.u uVar, android.content.Context context, com.tencent.map.geolocation.sapp.TencentLocationListener tencentLocationListener, int i17, android.os.Looper looper) {
        this.f287160h = uVar;
        this.f287156d = context;
        this.f287157e = tencentLocationListener;
        this.f287158f = i17;
        this.f287159g = looper;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean booleanValue;
        boolean h17 = j35.u.h(this.f287156d, "android.permission.ACCESS_FINE_LOCATION");
        com.tencent.map.geolocation.sapp.TencentLocationListener tencentLocationListener = this.f287157e;
        if (h17) {
            if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, null)) {
                com.tencent.map.geolocation.sapp.TencentLocationManagerOptions.isLoadLibraryEnabled();
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(584L, 0L, 1L, true);
                com.tencent.map.geolocation.sapp.TencentLocationManager.getInstance(i11.u.f287150d, new android.util.Pair(com.tencent.map.geolocation.sapp.TencentLocationManager.TYPE_OAID, "")).setCoordinateType(this.f287158f);
                com.tencent.map.geolocation.sapp.TencentLocationRequest create = com.tencent.map.geolocation.sapp.TencentLocationRequest.create();
                this.f287160h.getClass();
                java.lang.Boolean bool = i11.u.f287151e;
                if (bool != null) {
                    booleanValue = bool.booleanValue();
                } else {
                    java.lang.String str = (java.lang.String) gm0.j1.u().c().l(274436, null);
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (str == null) {
                        str = "CN";
                    }
                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(!"CN".equalsIgnoreCase(str));
                    i11.u.f287151e = valueOf;
                    com.tencent.mars.xlog.Log.i("MicroMsg.SLocationManager", "isOverseasUser: %b", valueOf);
                    booleanValue = i11.u.f287151e.booleanValue();
                }
                if (booleanValue) {
                    create.setLocationDomainMode(1);
                } else {
                    create.setLocationDomainMode(0);
                }
                create.setInterval(2000L);
                create.setAndroidId(wo.w0.c());
                com.tencent.mars.xlog.Log.i("MicroMsg.SLocationManager", "requestCode %d", java.lang.Integer.valueOf(com.tencent.map.geolocation.sapp.TencentLocationManager.getInstance(i11.u.f287150d, new android.util.Pair(com.tencent.map.geolocation.sapp.TencentLocationManager.TYPE_OAID, "")).requestLocationUpdates(create, tencentLocationListener, this.f287159g)));
                return;
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.SLocationManager", "no location permission, just return.");
        tencentLocationListener.onLocationChanged(null, -1, null);
    }
}
