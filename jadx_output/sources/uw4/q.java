package uw4;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw4.o f431746d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(uw4.o oVar) {
        super(1);
        this.f431746d = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.plugin.webview.luggage.jsapi.w3.f182493e = str;
        com.tencent.mm.plugin.webview.luggage.jsapi.w3.f182494f = 2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "friend");
        } catch (org.json.JSONException unused) {
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        this.f431746d.a(str, jSONObject);
        return jz5.f0.f302826a;
    }
}
