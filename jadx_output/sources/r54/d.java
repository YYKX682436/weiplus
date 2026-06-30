package r54;

/* loaded from: classes4.dex */
public final class d implements com.tencent.mm.plugin.sns.model.t, j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.Reference f392731a;

    /* renamed from: b, reason: collision with root package name */
    public final r54.c f392732b;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f392734d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f392735e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f392736f = new r54.a(this);

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f392733c = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    public d(android.content.Context context, r54.c cVar) {
        this.f392731a = new java.lang.ref.WeakReference(context);
        this.f392732b = cVar;
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
        if (obj instanceof android.os.Bundle) {
            try {
                android.os.Bundle bundle = (android.os.Bundle) obj;
                bundle.setClassLoader(r54.d.class.getClassLoader());
                int i17 = 0;
                boolean b17 = com.tencent.mm.sdk.platformtools.c2.b(bundle, "result", false);
                double n17 = a84.g0.n(bundle, "latitude", 0.0d);
                double n18 = a84.g0.n(bundle, "longitude", 0.0d);
                double n19 = a84.g0.n(bundle, "accuracy", 0.0d);
                double n27 = a84.g0.n(bundle, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_NETWORK_SPEED, 0.0d);
                if (!b17) {
                    i17 = 2;
                }
                d(i17, b17 ? "get_location:ok" : "get_location:failed", n17, n18, n27, n19);
            } catch (java.lang.Throwable unused) {
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void b(int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
    }

    public final void c(int i17, java.lang.String str, double d17, double d18, double d19, double d27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doCallback", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
        try {
            if (!this.f392734d) {
                this.f392734d = true;
                if (this.f392732b != null) {
                    android.util.ArrayMap arrayMap = new android.util.ArrayMap();
                    arrayMap.put("ret", java.lang.Integer.valueOf(i17));
                    arrayMap.put("err_msg", str);
                    if (i17 == 0) {
                        arrayMap.put("latitude", java.lang.Double.valueOf(d17));
                        arrayMap.put("longitude", java.lang.Double.valueOf(d18));
                        arrayMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_NETWORK_SPEED, java.lang.Double.valueOf(d19));
                        arrayMap.put("accuracy", java.lang.Double.valueOf(d27));
                    }
                    ((eb4.m) this.f392732b).a(arrayMap);
                }
                this.f392733c.removeCallbacks(this.f392736f);
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("GeoClientRequester", "the do Callback has something wrong");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doCallback", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
    }

    public final void d(int i17, java.lang.String str, double d17, double d18, double d19, double d27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doCallbackInUIThread", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            c(i17, str, d17, d18, d19, d27);
        } else {
            this.f392733c.post(new r54.b(this, i17, str, d17, d18, d19, d27));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doCallbackInUIThread", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
    }

    public final boolean e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestPermission", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
        android.content.Context context = (android.content.Context) this.f392731a.get();
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestPermission", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
            return false;
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (j35.u.d(context, "android.permission.ACCESS_FINE_LOCATION", true)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestPermission", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
            return true;
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        j35.u.j(context, 1, this, new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION"}, null, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestPermission", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
        return false;
    }

    @Override // j35.b0
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
        boolean z17 = true;
        if (i17 == 1) {
            if (iArr != null) {
                try {
                    int length = iArr.length;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= length) {
                            break;
                        }
                        if (iArr[i18] != 0) {
                            z17 = false;
                            break;
                        }
                        i18++;
                    }
                } catch (java.lang.Throwable unused) {
                }
            }
            if (z17) {
                java.lang.String str = this.f392735e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("start", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
                if (str == null) {
                    str = "";
                }
                com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().geoLocation(str, this);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doCallbackWithoutPermission", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
                d(1, "get_location:no_permission", 0.0d, 0.0d, 0.0d, 0.0d);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doCallbackWithoutPermission", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
    }
}
