package dc1;

/* loaded from: classes8.dex */
public class d extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1040;
    private static final java.lang.String NAME = "openCustomerServiceChat";

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f228691g = new java.util.concurrent.ConcurrentHashMap();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject data, int i17) {
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.o6 runtime;
        java.lang.String optString = data != null ? data.optString("extInfo") : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenCustomerServiceChat", "openCustomerServiceChat extInfo: %s", optString);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f228691g;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        if (data == null || (str = data.toString()) == null) {
            str = "";
        }
        concurrentHashMap.put(valueOf, str);
        G(lVar, data, mq0.z.f330647u, "");
        if (optString == null || optString.length() == 0) {
            E(lVar, i17, 1, "extInfo empty");
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(optString);
        java.lang.String optString2 = jSONObject.optString("url");
        if (optString2 == null || optString2.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenCustomerServiceChat", "openCustomerServiceChat url invalid");
            E(lVar, i17, 1, "url empty");
            return;
        }
        kotlin.jvm.internal.o.g(data, "data");
        int optInt = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 8);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String optString3 = jSONObject.optString("url", "");
        java.lang.String optString4 = jSONObject.optString("finder_context", "");
        u65.a aVar = new u65.a(2);
        com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = new com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest();
        openIMKefuStartConversationRequest.f72272d = lVar != null ? lVar.getContext() : null;
        openIMKefuStartConversationRequest.f72273e = currentTimeMillis;
        openIMKefuStartConversationRequest.f72274f = optInt;
        openIMKefuStartConversationRequest.f72290y = optString4;
        r45.s4 s4Var = new r45.s4();
        s4Var.f385486d = optString3;
        r45.l05 l05Var = new r45.l05();
        l05Var.f379061f = optString3;
        l05Var.f379059d = openIMKefuStartConversationRequest.f72274f;
        l05Var.f379060e = F(lVar, jSONObject, data);
        s4Var.f385489g = l05Var;
        openIMKefuStartConversationRequest.f72277i = s4Var;
        openIMKefuStartConversationRequest.f72276h = j41.f0.a(openIMKefuStartConversationRequest.f72274f);
        r45.g15 g15Var = new r45.g15();
        boolean optBoolean = data.optBoolean("showMessageCard", false);
        g15Var.f374804d = optBoolean;
        if (optBoolean) {
            g15Var.f374805e = data.optString("sendMessageTitle");
            g15Var.f374806f = data.optString("sendMessagePath");
            java.lang.String optString5 = data.optString("sendMessageImg");
            g15Var.f374807g = optString5;
            g15Var.f374808h = com.tencent.mm.sdk.platformtools.t8.K0(optString5);
            if (lVar instanceof com.tencent.mm.plugin.appbrand.service.c0) {
                g15Var.f374809i = com.tencent.mm.plugin.appbrand.jsapi.share.n2.b(com.tencent.mm.plugin.appbrand.jsapi.share.n2.e(((com.tencent.mm.plugin.appbrand.service.c0) lVar).V0(), g15Var.f374807g, true));
            }
            if (D()) {
                g15Var.f374820w = data.optString("sendMessageHintTitle");
                org.json.JSONObject optJSONObject = data.optJSONObject("sendMessageParam");
                g15Var.f374821x = optJSONObject != null ? optJSONObject.toString() : null;
            }
        }
        if (lVar instanceof com.tencent.mm.plugin.appbrand.service.c0) {
            com.tencent.mm.plugin.appbrand.page.n7 V0 = ((com.tencent.mm.plugin.appbrand.service.c0) lVar).V0();
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC E0 = (V0 == null || (runtime = V0.getRuntime()) == null) ? null : runtime.E0();
            if (E0 != null) {
                g15Var.f374810m = V0.getAppId();
                g15Var.f374811n = com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.a(lVar);
                g15Var.f374812o = E0.f305841d;
                g15Var.f374813p = E0.f305843f;
                g15Var.f374814q = E0.f305852r.f75399d;
                g15Var.f374815r = E0.f305852r.pkgVersion;
                g15Var.f374816s = E0.f305852r.f75372md5;
                g15Var.f374818u = V0.X1();
                g15Var.f374819v = com.tencent.mm.plugin.appbrand.v9.b(V0.getAppId());
            }
        }
        openIMKefuStartConversationRequest.f72289x.putExtra("key_appbrand_chat_info", g15Var.toByteArray());
        android.content.Intent intent = openIMKefuStartConversationRequest.f72289x;
        java.lang.String appId = lVar != null ? lVar.getAppId() : null;
        data.put("appId", appId != null ? appId : "");
        intent.putExtra("key_appbrand_check_bind_info", data.toString());
        android.content.Intent intent2 = new android.content.Intent();
        openIMKefuStartConversationRequest.f72288w = intent2;
        android.os.Handler createFreeHandler = com.tencent.mm.sdk.platformtools.n3.createFreeHandler(android.os.Looper.getMainLooper());
        kotlin.jvm.internal.o.f(createFreeHandler, "createFreeHandler(...)");
        intent2.putExtra("key_result_receiver", new com.tencent.mm.openim.model.OpenImKefuStartChattingResultReceiver(createFreeHandler, new dc1.c(this, lVar, i17, aVar)));
        C(openIMKefuStartConversationRequest);
        if (lVar instanceof com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.x) {
            int a17 = cf.b.a(this);
            j41.z zVar = (j41.z) i95.n0.c(j41.z.class);
            if (zVar != null) {
                dc1.a aVar2 = new dc1.a(a17, aVar);
                l41.g2 g2Var = (l41.g2) zVar;
                g2Var.Ai(openIMKefuStartConversationRequest);
                com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuStartConversationService", "startConversationForRequest %s", openIMKefuStartConversationRequest);
                android.content.Intent intent3 = openIMKefuStartConversationRequest.f72288w;
                if (intent3 == null) {
                    intent3 = new android.content.Intent();
                }
                g2Var.wi(intent3, openIMKefuStartConversationRequest);
                intent3.setClassName(openIMKefuStartConversationRequest.f72272d, "com.tencent.mm.openim.ui.OpenIMKefuConfirmUI");
                if (!(openIMKefuStartConversationRequest.f72272d instanceof android.app.Activity)) {
                    intent3.addFlags(268435456);
                }
                if (com.tencent.mm.ui.b2.a(openIMKefuStartConversationRequest.f72272d, true, new android.content.Intent[]{intent3}, new java.lang.Object[0])) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.OpenIMKefuStartConversationService", "startConversationForResult hit duplicated start");
                } else {
                    android.content.Context context = openIMKefuStartConversationRequest.f72272d;
                    if (context instanceof com.tencent.mm.ui.MMActivity) {
                        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                        ((com.tencent.mm.ui.MMActivity) context).mmStartActivityForResult((com.tencent.mm.ui.da) aVar2, intent3, a17);
                    } else if (context instanceof com.tencent.mm.ui.MMFragmentActivity) {
                        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
                        ((com.tencent.mm.ui.MMFragmentActivity) context).mmStartActivityForResult(new l41.f2(aVar2), intent3, a17);
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.OpenIMKefuStartConversationService", "startConversationForRequest context is not MMActivity or MMFragmentActivity");
                        intent3.addFlags(268435456);
                        android.content.Context context2 = openIMKefuStartConversationRequest.f72272d;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent3);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/openim/model/OpenIMKefuStartConversationService", "startConversationForResult", "(Lcom/tencent/mm/openim/api/OpenIMKefuStartConversationRequest;ILcom/tencent/mm/ui/MMActivity$IMMOnActivityResult;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context2.startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(context2, "com/tencent/mm/openim/model/OpenIMKefuStartConversationService", "startConversationForResult", "(Lcom/tencent/mm/openim/api/OpenIMKefuStartConversationRequest;ILcom/tencent/mm/ui/MMActivity$IMMOnActivityResult;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        android.content.Intent intent4 = new android.content.Intent();
                        intent4.putExtra("key_result_err_code", 0);
                        intent4.putExtra("key_result_err_msg", "ok");
                        aVar2.mmOnActivityResult(a17, 1, intent4);
                    }
                }
            }
        } else {
            aVar.b();
            j41.z zVar2 = (j41.z) i95.n0.c(j41.z.class);
            if (zVar2 != null) {
                ((l41.g2) zVar2).Bi(openIMKefuStartConversationRequest);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenCustomerServiceChat", "openCustomerServiceChat scene: %s, data: %s", java.lang.Integer.valueOf(optInt), data);
    }

    public void C(com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest request) {
        kotlin.jvm.internal.o.g(request, "request");
    }

    public boolean D() {
        return false;
    }

    public final void E(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, int i18, java.lang.String str) {
        java.lang.String p17;
        if (lVar != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", java.lang.Integer.valueOf(i18));
            if (i18 != 0) {
                p17 = p("fail " + str, hashMap);
                kotlin.jvm.internal.o.d(p17);
            } else {
                p17 = p("ok", hashMap);
                kotlin.jvm.internal.o.d(p17);
            }
            lVar.a(i17, p17);
        }
        try {
            java.lang.String str2 = (java.lang.String) this.f228691g.remove(java.lang.Integer.valueOf(i17));
            if (str2 == null) {
                str2 = "";
            }
            G(lVar, str2.length() > 0 ? new org.json.JSONObject(str2) : null, i18 == 0 ? mq0.z.f330648v : mq0.z.f330649w, str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MBADFullLinkReporter", "[MBAd] onCallback parse cachedData failed", e17);
        }
    }

    public java.lang.String F(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject extInfo, org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String appId = lVar != null ? lVar.getAppId() : null;
        return appId == null ? "" : appId;
    }

    public final void G(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, mq0.z zVar, java.lang.String str) {
        java.lang.String optString;
        if (jSONObject != null) {
            try {
                optString = jSONObject.optString("bizInfo", "");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MBADFullLinkReporter", "[MBAd] report full-link failed", e17);
                return;
            }
        } else {
            optString = null;
        }
        if (optString == null) {
            optString = "";
        }
        java.lang.String optString2 = jSONObject != null ? jSONObject.optString("traceId", "") : null;
        java.lang.String str2 = optString2 == null ? "" : optString2;
        java.lang.String optString3 = jSONObject != null ? jSONObject.optString("frameSetName", "") : null;
        java.lang.String str3 = optString3 == null ? "" : optString3;
        java.lang.String optString4 = jSONObject != null ? jSONObject.optString("implType", "") : null;
        java.lang.String str4 = optString4 == null ? "" : optString4;
        java.lang.String optString5 = jSONObject != null ? jSONObject.optString("bizName", "") : null;
        java.lang.String str5 = optString5 == null ? "" : optString5;
        java.lang.String optString6 = jSONObject != null ? jSONObject.optString("bizScene", "") : null;
        java.lang.String str6 = optString6 == null ? "" : optString6;
        mq0.c0 c0Var = (mq0.c0) i95.n0.c(mq0.c0.class);
        if (c0Var == null) {
            return;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("apiName", NAME);
        boolean z17 = true;
        if (optString.length() > 0) {
            linkedHashMap.put("uxinfo", optString);
        }
        if (str.length() <= 0) {
            z17 = false;
        }
        if (z17) {
            linkedHashMap.put("errMsg", str);
        }
        mq0.c0.ig(c0Var, zVar, str5, str6, str2, str3, str4, null, linkedHashMap, 64, null);
    }
}
