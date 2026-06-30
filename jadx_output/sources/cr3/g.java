package cr3;

/* loaded from: classes11.dex */
public class g implements com.tencent.mm.ui.base.preference.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j41.e0 f221947a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f221948b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j41.d0 f221949c;

    public g(j41.e0 e0Var, com.tencent.mm.storage.z3 z3Var, j41.d0 d0Var) {
        this.f221947a = e0Var;
        this.f221948b = z3Var;
        this.f221949c = d0Var;
    }

    @Override // com.tencent.mm.ui.base.preference.r0
    public boolean a(com.tencent.mm.ui.base.preference.Preference preference) {
        j41.e0 e0Var = this.f221947a;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(e0Var.f297623e);
            java.lang.String optString = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
            java.lang.String optString2 = jSONObject.optString("pagepath");
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
            am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
            nxVar.f7466a = optString;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (optString2 == null) {
                optString2 = "";
            }
            nxVar.f7467b = optString2;
            nxVar.f7468c = 0;
            nxVar.f7469d = 1192;
            startAppBrandUIFromOuterEvent.e();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15319, this.f221948b.Q0(), java.lang.Integer.valueOf(e0Var.f297622d), this.f221949c.f297617a);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Profile.OpenIMProfileLogic", e17, "loadProfile", new java.lang.Object[0]);
        }
        return true;
    }
}
