package um4;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lum4/k;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "plugin-topstory_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class k extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiK1kContainerCommand", jSONObject != null ? jSONObject.toString() : null);
        if (jSONObject != null) {
            try {
                com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback uICallback = com.tencent.mm.plugin.lite.LiteAppCenter.getUICallback(this.f143442e.f299024a);
                if (uICallback != null && (uICallback instanceof com.tencent.liteapp.ui.WxaLiteAppBaseView) && ((com.tencent.liteapp.ui.WxaLiteAppBaseView) uICallback).getRootView() != null) {
                    java.lang.String string = jSONObject.getString("action");
                    if (kotlin.jvm.internal.o.b("setScrollEnaled", string)) {
                        ((ku5.t0) ku5.t0.f312615d).B(new um4.i(uICallback, jSONObject.getBoolean("enabled")));
                    } else {
                        if (!kotlin.jvm.internal.o.b("setScrollAreas", string)) {
                            this.f143443f.a("action not support");
                            return;
                        }
                        org.json.JSONArray jSONArray = jSONObject.getJSONArray("scrollAreas");
                        kotlin.jvm.internal.o.f(jSONArray, "getJSONArray(...)");
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        int length = jSONArray.length();
                        for (int i17 = 0; i17 < length; i17++) {
                            android.graphics.RectF rectF = new android.graphics.RectF();
                            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
                            float f17 = 0.0f;
                            rectF.left = i65.a.a(c(), optJSONObject != null ? (float) optJSONObject.optDouble("x") : 0.0f);
                            rectF.top = i65.a.a(c(), optJSONObject != null ? (float) optJSONObject.optDouble("y") : 0.0f);
                            rectF.right = rectF.left + i65.a.a(c(), optJSONObject != null ? (float) optJSONObject.getDouble("width") : 0.0f);
                            float f18 = rectF.top;
                            android.content.Context c17 = c();
                            if (optJSONObject != null) {
                                f17 = (float) optJSONObject.getDouble("height");
                            }
                            rectF.bottom = f18 + i65.a.a(c17, f17);
                            arrayList.add(rectF);
                        }
                        ((ku5.t0) ku5.t0.f312615d).B(new um4.j(uICallback, arrayList));
                    }
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.putOpt("retCode", "0");
                    this.f143443f.c(jSONObject2, false);
                    return;
                }
                this.f143443f.a("cannot find view");
            } catch (java.lang.Exception unused) {
                this.f143443f.a("Error");
            }
        }
    }
}
