package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class q4 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186452d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186453e;

    public q4(nw4.k kVar, nw4.y2 y2Var) {
        this.f186452d = kVar;
        this.f186453e = y2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.BizPoiResponse bizPoiResponse = (com.tencent.mm.plugin.webview.ui.tools.newjsapi.BizPoiResponse) obj;
        java.lang.String str = bizPoiResponse.f185875g;
        boolean z17 = str == null || str.length() == 0;
        nw4.k kVar = this.f186452d;
        nw4.y2 y2Var = this.f186453e;
        if (!z17) {
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ':' + bizPoiResponse.f185875g, null);
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("latitude", bizPoiResponse.f185872d);
        jSONObject.put("longitude", bizPoiResponse.f185873e);
        jSONObject.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, bizPoiResponse.f185874f);
        java.util.Map l17 = kz5.c1.l(new jz5.l("position", jSONObject));
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", l17);
    }
}
