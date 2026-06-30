package r54;

/* loaded from: classes4.dex */
public final class f implements i11.d {

    /* renamed from: d, reason: collision with root package name */
    public final k55.b f392738d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f392739e;

    /* renamed from: f, reason: collision with root package name */
    public final long f392740f;

    /* renamed from: g, reason: collision with root package name */
    public final i11.e f392741g;

    public f(k55.b bVar, java.lang.String str, long j17) {
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        this.f392741g = i11.h.e();
        this.f392740f = j17;
        this.f392738d = bVar;
        this.f392739e = str;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetLocation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetLocation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
        return false;
    }

    @Override // i11.d
    public boolean w6(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19, android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetLocation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
        com.tencent.mars.xlog.Log.i("GeoServerRequester", "the onGetLocation is called, the longitude is " + f17);
        try {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
            if (android.os.Looper.myLooper() != null) {
                ((i11.h) this.f392741g).m(this);
            } else {
                new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new r54.e(this));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putBoolean("result", z17);
            bundle2.putDouble("latitude", f18);
            bundle2.putDouble("longitude", f17);
            bundle2.putDouble(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_NETWORK_SPEED, d17);
            bundle2.putDouble("accuracy", d18);
            k55.b bVar = this.f392738d;
            if (bVar != null) {
                bVar.CLIENT_CALL(this.f392739e, java.lang.Long.valueOf(this.f392740f), bundle2);
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("GeoServerRequester", "there is something wrong in onGetLocation");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetLocation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
        return false;
    }
}
