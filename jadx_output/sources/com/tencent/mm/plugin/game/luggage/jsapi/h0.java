package com.tencent.mm.plugin.game.luggage.jsapi;

@mk0.a
/* loaded from: classes.dex */
class h0 implements com.tencent.mm.ipcinvoker.j {
    private h0() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        int i17 = bundle.getInt("cmd");
        java.lang.String string = bundle.getString("param");
        android.os.Bundle bundle2 = new android.os.Bundle();
        if (i17 == 10002) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("webpageCount", 1);
            } catch (org.json.JSONException unused) {
            }
            bundle2.putString("backResult", jSONObject.toString());
        } else {
            com.tencent.mm.autogen.events.GameCommOperationEvent gameCommOperationEvent = new com.tencent.mm.autogen.events.GameCommOperationEvent();
            am.me meVar = gameCommOperationEvent.f54359h;
            am.le leVar = gameCommOperationEvent.f54358g;
            leVar.f7243a = i17;
            leVar.f7244b = string;
            leVar.f7245c = com.tencent.mm.sdk.platformtools.x2.f193071a;
            gameCommOperationEvent.e();
            try {
                if (com.tencent.mm.sdk.platformtools.t8.K0(meVar.f7341a)) {
                    bundle2.putString("backResult", "");
                } else {
                    bundle2.putString("backResult", new org.json.JSONObject(meVar.f7341a).toString());
                }
            } catch (org.json.JSONException unused2) {
            }
        }
        rVar.a(bundle2);
    }
}
