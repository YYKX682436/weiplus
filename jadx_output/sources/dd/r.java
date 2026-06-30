package dd;

/* loaded from: classes9.dex */
public final class r implements com.tencent.kinda.framework.module.impl.KindaJSEvent.KindaJsEventDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f228891a;

    public r(yz5.p pVar) {
        this.f228891a = pVar;
    }

    @Override // com.tencent.kinda.gen.KJSEvent
    public void kindaCloseWebViewImpl(boolean z17, com.tencent.kinda.gen.VoidCallback completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
    }

    @Override // com.tencent.kinda.gen.KJSEvent
    public void kindaEndWithResult(java.lang.String result, java.util.HashMap extraInfo) {
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(extraInfo, "extraInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.WeixinPayService.StartKindaUseCaseImpl", "kindaEndWithResult: %s", result);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("result", new org.json.JSONObject(result));
        } catch (org.json.JSONException unused) {
            jSONObject.put("result", result);
        }
        for (java.util.Map.Entry entry : extraInfo.entrySet()) {
            try {
                try {
                    jSONObject.put((java.lang.String) entry.getKey(), new org.json.JSONObject((java.lang.String) entry.getValue()));
                } catch (org.json.JSONException unused2) {
                    jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
                }
            } catch (org.json.JSONException unused3) {
                jSONObject.put((java.lang.String) entry.getKey(), new org.json.JSONArray((java.lang.String) entry.getValue()));
            }
        }
        this.f228891a.invoke(dd.c.j(dd.d.f228871a, jSONObject, null, 2, null), java.lang.Boolean.TRUE);
    }

    @Override // com.tencent.kinda.gen.KJSEvent
    public com.tencent.kinda.gen.KindaJSEventType kindaGetType() {
        return com.tencent.kinda.gen.KindaJSEventType.LITEAPP;
    }
}
