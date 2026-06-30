package i11;

/* loaded from: classes13.dex */
public class m extends i11.s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i11.h f287129b;

    public m(i11.h hVar) {
        this.f287129b = hVar;
    }

    @Override // i11.s
    public void a(boolean z17, double d17, double d18, int i17, double d19, double d27, double d28, java.lang.String str, java.lang.String str2, int i18) {
        i11.h.a(this.f287129b, z17, d17, d18, d28, d27, true);
        if (z17) {
            i11.h hVar = this.f287129b;
            hVar.f287102k = d17;
            hVar.f287103l = d18;
            hVar.f287104m = i17;
            hVar.f287105n = d19;
            hVar.f287106o = d27;
            hVar.f287107p = d28;
            hVar.f287108q = str;
            hVar.f287109r = str2;
            hVar.f287110s = i18;
            hVar.f287099h = java.lang.System.currentTimeMillis();
            hVar.f287100i = true;
            hVar.f287101j = false;
            i11.h.b(hVar, 67592);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LocationGeo", "onGetLocation fLongitude: %f fLatitude:%f locType:%d %f:spped", java.lang.Double.valueOf(d18), java.lang.Double.valueOf(d17), java.lang.Integer.valueOf(i17), java.lang.Double.valueOf(d19));
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new i11.l(this, z17, d17, d18, i17, d19, d27, d28));
    }

    @Override // com.tencent.map.geolocation.sapp.TencentLocationListener
    public void onStatusUpdate(java.lang.String str, int i17, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LocationGeo", "onStatusUpdate name %s, status %d", str, java.lang.Integer.valueOf(i17));
    }
}
