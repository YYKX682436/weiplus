package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/w;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class w extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String str2;
        boolean z18;
        java.lang.String optString = jSONObject != null ? jSONObject.optString("src", "") : null;
        if (((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Kj(optString)) {
            str2 = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(str, this.f143442e.f299024a, optString);
            kotlin.jvm.internal.o.f(str2, "getFilePathByBothLocalId(...)");
        } else {
            str2 = com.tencent.mm.plugin.lite.logic.g1.s().y(str, null).path + "/pkg" + optString;
        }
        if (lj.f.f(str2) || !com.tencent.mm.vfs.w6.j(str2)) {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiCheckVideoIsHDR", "invalid path", null);
            this.f143442e.b("invalid path");
            return;
        }
        gp.c cVar = new gp.c();
        cVar.k(str2);
        int d17 = cVar.d();
        int i18 = 0;
        while (true) {
            if (i18 >= d17) {
                z18 = false;
                break;
            }
            android.media.MediaFormat e17 = cVar.e(i18);
            kotlin.jvm.internal.o.f(e17, "getTrackFormat(...)");
            java.lang.String string = e17.getString("mime");
            if (string != null && r26.i0.y(string, "video/", false)) {
                z18 = true;
                if (e17.containsKey("color-transfer")) {
                    int integer = e17.getInteger("color-transfer");
                    if (integer == 6) {
                        break;
                    } else if (integer == 7) {
                        break;
                    }
                }
                if (e17.containsKey("color-standard") && e17.getInteger("color-standard") == 6) {
                    break;
                }
            }
            i18++;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("isHDR", z18);
        this.f143442e.f(jSONObject2, false);
    }
}
