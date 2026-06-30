package ed1;

/* loaded from: classes15.dex */
public final class g implements ed1.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ed1.h f251244a;

    public g(ed1.h hVar) {
        this.f251244a = hVar;
    }

    @Override // ed1.i
    public final void onResult(int i17, java.lang.String str) {
        new java.util.HashMap().put("errCode", java.lang.Integer.valueOf(i17));
        ed1.h hVar = this.f251244a;
        if (i17 == 0) {
            android.content.Context context = hVar.f251246c;
            if (context instanceof android.app.Activity) {
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                hVar.f251245b = (android.app.Activity) context;
                java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
                try {
                    org.json.JSONObject jSONObject = hVar.f251248e;
                    kotlin.jvm.internal.o.d(jSONObject);
                    org.json.JSONArray jSONArray = jSONObject.getJSONArray("aidList");
                    int length = jSONArray.length();
                    com.tencent.mars.xlog.Log.i("HceRegisterService", "mData: %s, aidList: %s, length: %d", java.lang.String.valueOf(hVar.f251248e), jSONArray.toString(), java.lang.Integer.valueOf(length));
                    for (int i18 = 0; i18 < length; i18++) {
                        java.lang.String upperCase = jSONArray.get(i18).toString().toUpperCase(java.util.Locale.ROOT);
                        kotlin.jvm.internal.o.f(upperCase, "toUpperCase(...)");
                        arrayList.add(upperCase);
                    }
                    android.app.Activity activity = hVar.f251245b;
                    kotlin.jvm.internal.o.d(activity);
                    dd1.a aVar = hVar.f251247d;
                    kotlin.jvm.internal.o.d(aVar);
                    java.util.List a17 = hVar.a(activity, aVar);
                    com.tencent.mars.xlog.Log.i("HceRegisterService", "checkAidCanRegister registeredAidList: " + a17 + ", deltaAidList=" + arrayList);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj : a17) {
                        if (arrayList.contains((java.lang.String) obj)) {
                            arrayList2.add(obj);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        com.tencent.mars.xlog.Log.e("HceRegisterService", "aid register conflict, but liteapp use for payment first");
                    }
                    android.content.Intent intent = new android.content.Intent(hVar.f251245b, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.HCEService.class);
                    org.json.JSONObject jSONObject2 = hVar.f251248e;
                    java.lang.String str2 = "";
                    if (jSONObject2 != null) {
                        str2 = jSONObject2.optString("liteAppId", "");
                        kotlin.jvm.internal.o.f(str2, "optString(...)");
                    }
                    intent.putExtra("key_appid", str2);
                    intent.putStringArrayListExtra("key_aid_list", arrayList);
                    intent.putExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_LITE_APP, 1);
                    android.app.Activity activity2 = hVar.f251245b;
                    kotlin.jvm.internal.o.d(activity2);
                    activity2.startService(intent);
                    arrayList.addAll(a17);
                    android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(hVar.f251245b);
                    if (defaultAdapter == null) {
                        com.tencent.mars.xlog.Log.e("HceRegisterService", "NfcAdapter is null when register aids");
                        dd1.a aVar2 = hVar.f251247d;
                        if (aVar2 != null) {
                            aVar2.b(hVar.b("NfcAdapter is null when register aids"));
                        }
                    } else {
                        android.nfc.cardemulation.CardEmulation cardEmulation = android.nfc.cardemulation.CardEmulation.getInstance(defaultAdapter);
                        if (cardEmulation != null) {
                            try {
                                android.app.Activity activity3 = hVar.f251245b;
                                kotlin.jvm.internal.o.d(activity3);
                                android.content.ComponentName componentName = new android.content.ComponentName(activity3, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.HCEService.class);
                                boolean registerAidsForService = cardEmulation.registerAidsForService(componentName, "payment", arrayList);
                                com.tencent.mars.xlog.Log.i("HceRegisterService", "register aids result: %b", java.lang.Boolean.valueOf(registerAidsForService));
                                if (registerAidsForService) {
                                    java.util.List<java.lang.String> aidsForService = cardEmulation.getAidsForService(componentName, "payment");
                                    if (aidsForService != null && aidsForService.size() > 0) {
                                        int size = aidsForService.size();
                                        for (int i19 = 0; i19 < size; i19++) {
                                            com.tencent.mars.xlog.Log.e("HceRegisterService", "dynamicAIDList aid=" + aidsForService.get(i19));
                                        }
                                    }
                                    dd1.a aVar3 = hVar.f251247d;
                                    if (aVar3 != null) {
                                        aVar3.b(ed1.k.e(hVar, null, 1, null));
                                    }
                                } else {
                                    dd1.a aVar4 = hVar.f251247d;
                                    if (aVar4 != null) {
                                        aVar4.b(hVar.b("registerAidsForService result failed"));
                                    }
                                }
                            } catch (java.lang.Exception e17) {
                                com.tencent.mars.xlog.Log.printErrStackTrace("HceRegisterService", e17, "HceRegisterService aid exception", new java.lang.Object[0]);
                                dd1.a aVar5 = hVar.f251247d;
                                if (aVar5 != null) {
                                    aVar5.b(hVar.b("registerAidsForService exception"));
                                }
                            }
                        }
                    }
                } catch (java.lang.Exception unused) {
                    dd1.a aVar6 = hVar.f251247d;
                    if (aVar6 != null) {
                        aVar6.b(hVar.c(13003, "failed: aid_list invalid"));
                    }
                }
            } else {
                dd1.a aVar7 = hVar.f251247d;
                if (aVar7 != null) {
                    aVar7.b(hVar.b("fail: unknown error"));
                }
            }
        } else {
            dd1.a aVar8 = hVar.f251247d;
            if (aVar8 != null) {
                aVar8.b(hVar.c(i17, "checkIsSupportHCE fail: " + str));
            }
        }
        hVar.f251247d = null;
        hVar.f251246c = null;
        hVar.f251245b = null;
        hVar.f251248e = null;
    }
}
