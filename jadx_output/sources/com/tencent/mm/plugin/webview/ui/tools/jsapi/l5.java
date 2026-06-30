package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class l5 implements i11.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185252e;

    public l5(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, java.lang.String str) {
        this.f185252e = c1Var;
        this.f185251d = str;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        return false;
    }

    @Override // i11.d
    public boolean w6(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19, android.os.Bundle bundle) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185252e;
        if (!z17) {
            if (c1Var.R == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MsgHandler", "is not ok, already callback");
                return false;
            }
            if (!c1Var.T && !com.tencent.mm.sdk.platformtools.n2.a()) {
                c1Var.T = true;
                if (((java.util.HashMap) c1Var.f184976e.f340790a).containsKey("forbidAlert") ? ((java.lang.String) ((java.util.HashMap) c1Var.f184976e.f340790a).get("forbidAlert")).equals("true") : false) {
                    c1Var.U = true;
                    c1Var.i5(c1Var.f184976e, "geo_location:fail_gps_closed", null);
                    return true;
                }
                android.content.Context context = c1Var.f184975d;
                if (context != null) {
                    com.tencent.mm.plugin.webview.stub.WebViewStubTempUI.U6(context, c1Var.f184998y, false, j65.q.a(context).getString(com.tencent.mm.R.string.fs_), j65.q.a(c1Var.f184975d).getString(com.tencent.mm.R.string.f490573yv), j65.q.a(c1Var.f184975d).getString(com.tencent.mm.R.string.g6z), j65.q.a(c1Var.f184975d).getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.webview.ui.tools.jsapi.j5(this), new com.tencent.mm.plugin.webview.ui.tools.jsapi.k5(this));
                }
            }
            if (c1Var.T && c1Var.U) {
                c1Var.S.removeCallbacksAndMessages(null);
                c1Var.R = null;
                c1Var.i5(c1Var.f184976e, "geo_location:fail_gps_closed", null);
            }
            return true;
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = c1Var.S;
        if (n3Var != null) {
            n3Var.removeCallbacksAndMessages(null);
        }
        i11.e eVar = c1Var.Q;
        if (eVar != null) {
            ((i11.h) eVar).m(c1Var.R);
        }
        if (c1Var.R == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MsgHandler", "already callback");
            return false;
        }
        c1Var.R = null;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("longitude", java.lang.Float.valueOf(f17));
        hashMap.put("latitude", java.lang.Float.valueOf(f18));
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_NETWORK_SPEED, java.lang.Double.valueOf(d17));
        hashMap.put("accuracy", java.lang.Double.valueOf(d18));
        hashMap.put("type", this.f185251d);
        if (bundle != null) {
            hashMap.put("indoor_building_id", bundle.getString("indoor_building_id"));
            hashMap.put("indoor_building_floor", bundle.getString("indoor_building_floor"));
            hashMap.put("indoor_building_type", java.lang.Integer.valueOf(bundle.getInt("indoor_building_type")));
        }
        com.tencent.mm.plugin.webview.core.x3 x3Var = com.tencent.mm.plugin.webview.core.x3.f182012a;
        if (((java.lang.Boolean) ((jz5.n) com.tencent.mm.plugin.webview.core.x3.f182017f).getValue()).booleanValue()) {
            c1Var.V = hashMap;
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "startGeoLocation cache retValues");
        }
        c1Var.i5(c1Var.f184976e, "geo_location:ok", hashMap);
        return false;
    }
}
