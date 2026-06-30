package eb4;

/* loaded from: classes4.dex */
public final class r implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f250909a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f250910b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f250911c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f250912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f250913e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.q f250914f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f250915g;

    public r(yz5.a aVar, java.lang.String str, java.lang.String str2, android.content.Context context, boolean z17, yz5.q qVar, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f250909a = aVar;
        this.f250910b = str;
        this.f250911c = str2;
        this.f250912d = context;
        this.f250913e = z17;
        this.f250914f = qVar;
        this.f250915g = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper$showLBSAuthDialog$rightClickFunc$1");
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("sns_ad_landing_page_key");
        if (M == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper$showLBSAuthDialog$rightClickFunc$1");
            return;
        }
        M.putBoolean("canRequestLBS", true);
        eb4.s sVar = eb4.s.f250916a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
        com.tencent.mars.xlog.Log.i("RequestGeoLocationHelper", "showLBSAuthDialog and confirm!");
        yz5.a aVar = this.f250909a;
        if (aVar != null) {
            aVar.invoke();
        }
        sVar.d(this.f250910b, this.f250911c, this.f250912d, this.f250913e, this.f250914f);
        this.f250915g.B();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ab4.n0 b17 = sVar.b(this.f250912d);
        java.lang.String k17 = b17 != null ? b17.k() : null;
        if (k17 == null) {
            k17 = "";
        }
        jSONObject.put("snsid", k17);
        java.lang.String o17 = b17 != null ? b17.o() : null;
        jSONObject.put("uxinfo", o17 != null ? o17 : "");
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, b17 != null ? b17.l() : 0);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "ad");
        jSONObject2.put("status", "ok");
        jSONObject.put("extInfo", jSONObject2);
        java.lang.String jSONObject3 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
        ca4.m0.a("location_ad_auth_report", jSONObject3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper$showLBSAuthDialog$rightClickFunc$1");
    }
}
