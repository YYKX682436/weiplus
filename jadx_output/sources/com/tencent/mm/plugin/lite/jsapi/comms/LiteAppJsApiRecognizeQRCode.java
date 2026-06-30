package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes8.dex */
public class LiteAppJsApiRecognizeQRCode extends com.tencent.mm.plugin.lite.api.p {

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f143486g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f143487h;

    public LiteAppJsApiRecognizeQRCode() {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f143486g = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent>(a0Var) { // from class: com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiRecognizeQRCode.2
            {
                this.__eventId = 812146647;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent) {
                am.cq cqVar = recogQBarOfImageFileResultEvent.f54661g;
                com.tencent.mars.xlog.Log.i("LiteAppJsApiRecognizeQRCode", "recognize qr code success, count: %d", java.lang.Integer.valueOf(cqVar.f6369b.size()));
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (int i17 = 0; i17 < cqVar.f6369b.size(); i17++) {
                    try {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("codeType", cqVar.f6370c.get(i17));
                        jSONObject2.put("codeVersion", cqVar.f6372e.get(i17));
                        jSONObject2.put("x", cqVar.f6376i.get(i17));
                        jSONObject2.put("y", cqVar.f6377j.get(i17));
                        jSONObject2.put("codeString", cqVar.f6369b.get(i17));
                        jSONArray.put(jSONObject2);
                    } catch (org.json.JSONException e17) {
                        com.tencent.mars.xlog.Log.e("LiteAppJsApiRecognizeQRCode", e17.toString());
                    }
                }
                jSONObject.put("count", cqVar.f6369b.size());
                jSONObject.put("items", jSONArray);
                com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiRecognizeQRCode liteAppJsApiRecognizeQRCode = com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiRecognizeQRCode.this;
                liteAppJsApiRecognizeQRCode.f143443f.c(jSONObject, false);
                liteAppJsApiRecognizeQRCode.f143486g.dead();
                liteAppJsApiRecognizeQRCode.f143487h.dead();
                return false;
            }
        };
        this.f143487h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent>(a0Var) { // from class: com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiRecognizeQRCode.3
            {
                this.__eventId = 1700407223;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent recogQBarOfImageFileFailedEvent) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                com.tencent.mars.xlog.Log.e("LiteAppJsApiRecognizeQRCode", "recognize qr code failed. path: %s", recogQBarOfImageFileFailedEvent.f54660g.f6278a);
                try {
                    jSONObject.put("count", 0);
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.e("LiteAppJsApiRecognizeQRCode", e17.toString());
                }
                com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiRecognizeQRCode liteAppJsApiRecognizeQRCode = com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiRecognizeQRCode.this;
                liteAppJsApiRecognizeQRCode.f143443f.c(jSONObject, false);
                liteAppJsApiRecognizeQRCode.f143486g.dead();
                liteAppJsApiRecognizeQRCode.f143487h.dead();
                return false;
            }
        };
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("LiteAppJsApiRecognizeQRCode", "Invoke recognizeQRCode");
        java.lang.String optString = jSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
        if (((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Kj(optString)) {
            optString = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(str, this.f143442e.f299024a, optString);
        } else if (optString.startsWith("http")) {
            java.lang.Object c17 = c();
            if (!(c17 instanceof mx5.b)) {
                this.f143442e.b("not found flutter activity");
                return;
            }
            mx5.b bVar = (mx5.b) c17;
            int f45967f = bVar.getF45967f();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("url", optString);
            hashMap.put("pageName", bVar.getFlutterViewName());
            hashMap.put("activityId", java.lang.String.valueOf(this.f143442e.f299024a));
            kx5.n.h().k(f45967f, "getImageLocalInfo", hashMap, new com.tencent.mm.plugin.lite.jsapi.comms.o5(this));
            return;
        }
        if (optString == null || optString.isEmpty()) {
            this.f143443f.a("path is empty");
            return;
        }
        com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = new com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent();
        this.f143486g.alive();
        this.f143487h.alive();
        long nanoTime = java.lang.System.nanoTime();
        am.aq aqVar = recogQBarOfImageFileEvent.f54659g;
        aqVar.f6174a = nanoTime;
        aqVar.f6175b = optString;
        recogQBarOfImageFileEvent.e();
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
