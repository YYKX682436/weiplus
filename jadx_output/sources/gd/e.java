package gd;

/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public gd.b f270473a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.liteapp.framework.dynamic_module.realname.WXPLiteAppRealnameService$resultEvent$1 f270474b;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.liteapp.framework.dynamic_module.realname.WXPLiteAppRealnameService$resultEvent$1] */
    public e() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f270474b = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RealnameVerifyGuardianResultEvent>(a0Var) { // from class: com.tencent.liteapp.framework.dynamic_module.realname.WXPLiteAppRealnameService$resultEvent$1
            {
                this.__eventId = 1142547354;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RealnameVerifyGuardianResultEvent realnameVerifyGuardianResultEvent) {
                com.tencent.mm.autogen.events.RealnameVerifyGuardianResultEvent event = realnameVerifyGuardianResultEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.pp ppVar = event.f54648g;
                int i17 = ppVar.f7644a;
                gd.e eVar = gd.e.this;
                if (i17 == 1) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.putOpt("UnderAgeResult", "1");
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(ppVar.f7645b)) {
                        jSONObject.putOpt("appid", ppVar.f7645b);
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(ppVar.f7646c)) {
                        jSONObject.putOpt(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, ppVar.f7646c);
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(ppVar.f7647d)) {
                        jSONObject.putOpt("query", ppVar.f7647d);
                    }
                    gd.b bVar = eVar.f270473a;
                    if (bVar == null) {
                        kotlin.jvm.internal.o.o("verifyParentCallback");
                        throw null;
                    }
                    bVar.onCall(jSONObject);
                } else {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.putOpt("UnderAgeResult", "0");
                    gd.b bVar2 = eVar.f270473a;
                    if (bVar2 == null) {
                        kotlin.jvm.internal.o.o("verifyParentCallback");
                        throw null;
                    }
                    bVar2.onCall(jSONObject2);
                }
                dead();
                return false;
            }
        };
    }
}
