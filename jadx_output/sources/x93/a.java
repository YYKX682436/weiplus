package x93;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx93/a;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class a extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("LiteAppJsApiAddScreenshotShareItem", "invoke: appId=" + str + ", data=" + jSONObject + ", isFromView=" + z17);
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiAddScreenshotShareItem", "appId is null or empty");
            this.f143442e.b("appId is invalid");
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiAddScreenshotShareItem", "data is null");
            this.f143442e.b("data is null");
            return;
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("itemList");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiAddScreenshotShareItem", "itemList is null or empty");
            this.f143442e.b("itemList is invalid");
            return;
        }
        com.tencent.mm.plugin.lite.api.q qVar = new com.tencent.mm.plugin.lite.api.q();
        try {
            int length = optJSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                if (optJSONObject != null) {
                    java.lang.String optString = optJSONObject.optString("type");
                    if (optString != null) {
                        int hashCode = optString.hashCode();
                        if (hashCode != -1068531200) {
                            if (hashCode != 97555) {
                                if (hashCode == 1071831751 && optString.equals("gamecenter")) {
                                    qVar.f143446c = true;
                                    qVar.f143447d = optJSONObject.optJSONObject(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
                                    com.tencent.mars.xlog.Log.i("LiteAppJsApiAddScreenshotShareItem", "enable gamecenter share, extraData=" + qVar.f143447d);
                                }
                            } else if (optString.equals("biz")) {
                                qVar.f143445b = true;
                                com.tencent.mars.xlog.Log.i("LiteAppJsApiAddScreenshotShareItem", "enable biz share");
                            }
                        } else if (optString.equals("moment")) {
                            qVar.f143444a = true;
                            com.tencent.mars.xlog.Log.i("LiteAppJsApiAddScreenshotShareItem", "enable moment share");
                        }
                    }
                    com.tencent.mars.xlog.Log.w("LiteAppJsApiAddScreenshotShareItem", "unknown type: " + optString);
                }
            }
            jd.c cVar = this.f143442e;
            long j17 = cVar.f299026c;
            long j18 = cVar.f299024a;
            synchronized (x93.c.class) {
                x93.c.f452723a = j17;
                x93.c.f452724b = qVar;
                com.tencent.mars.xlog.Log.i("ScreenshotShareConfigManager", "setConfig: pageId=" + j17 + ", config=" + qVar);
            }
            com.tencent.mars.xlog.Log.i("LiteAppJsApiAddScreenshotShareItem", "addScreenshotShareItem success, pageId=" + j17 + ", appUuid=" + j18);
            this.f143442e.d();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("LiteAppJsApiAddScreenshotShareItem", e17, "parse itemList failed", new java.lang.Object[0]);
            this.f143442e.b("parse itemList failed: " + e17.getMessage());
        }
    }
}
