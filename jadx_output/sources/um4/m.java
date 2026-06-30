package um4;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lum4/m;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "plugin-topstory_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public class m extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiSearchDataHasResult", jSONObject != null ? jSONObject.toString() : null);
        if (jSONObject != null) {
            try {
                int optInt = jSONObject.optInt("tagId", 0);
                int optInt2 = jSONObject.optInt("resultCount", 0);
                if (pm4.w.l(optInt)) {
                    if (optInt2 > 0) {
                        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_HAS_HAOKAN_RESULT_INT, 1);
                    } else {
                        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_HAS_HAOKAN_RESULT_INT, 0);
                    }
                }
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.putOpt("retCode", "0");
                this.f143443f.c(jSONObject2, false);
            } catch (java.lang.Exception unused) {
                this.f143443f.a("Error");
            }
        }
    }
}
