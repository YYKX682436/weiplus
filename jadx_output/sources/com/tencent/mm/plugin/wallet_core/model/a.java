package com.tencent.mm.plugin.wallet_core.model;

/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public int f179817a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Orders.ShowInfo f179818b;

    public static com.tencent.mm.plugin.wallet_core.model.a a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.tencent.mm.plugin.wallet_core.model.a aVar = new com.tencent.mm.plugin.wallet_core.model.a();
        aVar.f179817a = jSONObject.optInt(dm.i4.COL_ID);
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("show_info");
        if (optJSONObject != null) {
            com.tencent.mm.plugin.wallet_core.model.Orders.ShowInfo showInfo = new com.tencent.mm.plugin.wallet_core.model.Orders.ShowInfo();
            showInfo.f179805d = optJSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
            showInfo.f179806e = optJSONObject.optString("value");
            showInfo.f179813o = optJSONObject.optInt("value_attr");
            showInfo.f179807f = optJSONObject.optString("name_color");
            showInfo.f179808g = optJSONObject.optString("value_color");
            aVar.f179818b = showInfo;
        }
        return aVar;
    }
}
