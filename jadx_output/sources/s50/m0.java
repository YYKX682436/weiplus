package s50;

@j95.b
/* loaded from: classes12.dex */
public class m0 extends i95.w implements u50.x {

    /* renamed from: d, reason: collision with root package name */
    public final p13.w f403091d = new p13.w();

    public void x1() {
        java.lang.String j17 = j62.e.g().j("clicfg_android_websearch_sort_with_group_chat", "", true, true);
        p13.w wVar = this.f403091d;
        wVar.getClass();
        try {
            wVar.f351161a = false;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(j17)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(j17);
                wVar.f351162b = jSONObject.optInt("prefixCnt", 0);
                wVar.f351163c = jSONObject.optDouble(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_MEDIA_RATE, 0.0d);
                wVar.f351164d = jSONObject.optInt("count", 0);
                wVar.f351165e = jSONObject.optInt("matchMemberCnt", 0);
                wVar.f351161a = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSSortConfig", "parseSortConfig, matchRate: %f, matchQueryCnt: %d, matchMemberCnt: %d", java.lang.Double.valueOf(wVar.f351163c), java.lang.Integer.valueOf(wVar.f351164d), java.lang.Integer.valueOf(wVar.f351165e));
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FTS.FTSSortConfig", e17.getMessage());
        }
        java.lang.String j18 = j62.e.g().j("clicfg_android_fts_group_chat_sort_v2", "", true, true);
        wVar.f351166f = true;
        wVar.f351167g = true;
        wVar.f351168h = false;
        wVar.f351169i = 14;
        wVar.f351170j = 15;
        wVar.f351171k = true;
        wVar.f351172l = true;
        if (com.tencent.mm.sdk.platformtools.t8.K0(j18)) {
            return;
        }
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(j18);
            wVar.f351166f = jSONObject2.optBoolean("useAllMemberFirst", true);
            wVar.f351167g = jSONObject2.optBoolean("useFoldSort", true);
            wVar.f351168h = jSONObject2.optBoolean("useSilentSort", false);
            wVar.f351169i = jSONObject2.optInt("groupActiveDays", 14);
            wVar.f351170j = jSONObject2.optInt("smallChatroomMembers", 15);
            wVar.f351171k = jSONObject2.optBoolean("useTrainSort", true);
            wVar.f351172l = jSONObject2.optBoolean("useTrainSortFold", true);
            if (wVar.f351169i <= 0) {
                wVar.f351169i = 14;
            }
            if (wVar.f351170j <= 0) {
                wVar.f351170j = 15;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSSortConfig", "parseGroupSortConfig, useAllMemberFirst=%b, useFoldSort=%b, useSilentSort=%b, groupActiveDays=%d, smallChatroomMembers=%d, useTrainSort=%b, useTrainSortFold=%b", java.lang.Boolean.valueOf(wVar.f351166f), java.lang.Boolean.valueOf(wVar.f351167g), java.lang.Boolean.valueOf(wVar.f351168h), java.lang.Integer.valueOf(wVar.f351169i), java.lang.Integer.valueOf(wVar.f351170j), java.lang.Boolean.valueOf(wVar.f351171k), java.lang.Boolean.valueOf(wVar.f351172l));
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FTS.FTSSortConfig", "parseGroupSortConfig failed: " + e18.getMessage());
        }
    }
}
