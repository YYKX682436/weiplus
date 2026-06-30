package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class z implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f185575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185576e;

    public z(nw4.k kVar, nw4.y2 y2Var) {
        this.f185575d = kVar;
        this.f185576e = y2Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        final nw4.y2 y2Var = this.f185576e;
        final nw4.k kVar = this.f185575d;
        if (itemId != 1) {
            if (itemId != 2) {
                return;
            }
            com.tencent.mm.plugin.webview.ui.tools.jsapi.b0 b0Var = com.tencent.mm.plugin.webview.ui.tools.jsapi.b0.f184939d;
            b0Var.j(2);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChoosePassport", "real scene = %d", 1);
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            android.content.Context context = kVar.f340860a;
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            boolean Di = ((sb0.f) jVar).Di((android.app.Activity) context, new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 151, "", "");
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChoosePassport", "checkPermission checkStorage[%b]", java.lang.Boolean.valueOf(Di));
            if (Di) {
                b0Var.i(kVar, y2Var, 1);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChoosePassport", "requestStoragePermission: requesting storage permission");
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            j35.u.j(kVar.f340860a, 151, new com.tencent.mm.plugin.webview.ui.tools.jsapi.v(kVar, y2Var, 1), new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE"}, "", "");
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(32227, "3,0,0,0");
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ScanPassportResultEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ScanPassportResultEvent>(a0Var) { // from class: com.tencent.mm.plugin.webview.ui.tools.jsapi.JsApiChoosePassport$doScanPassport$1
            {
                this.__eventId = -2051503330;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ScanPassportResultEvent scanPassportResultEvent) {
                com.tencent.mm.autogen.events.ScanPassportResultEvent event = scanPassportResultEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.ws wsVar = event.f54733g;
                int i18 = wsVar.f8319a;
                nw4.y2 y2Var2 = y2Var;
                nw4.k kVar2 = nw4.k.this;
                if (i18 == 0) {
                    kVar2.f340863d.e(y2Var2.f341013c, "choosePassport:fail", null);
                    com.tencent.mm.sdk.event.IListener iListener2 = com.tencent.mm.plugin.webview.ui.tools.jsapi.b0.f184940e;
                    if (iListener2 != null) {
                        iListener2.dead();
                    }
                } else if (i18 == 1) {
                    java.util.ArrayList cardBitmapArr = wsVar.f8321c;
                    kotlin.jvm.internal.o.f(cardBitmapArr, "cardBitmapArr");
                    if (cardBitmapArr.size() == 0) {
                        kVar2.f340863d.e(y2Var2.f341013c, "choosePassport:fail", null);
                    } else {
                        try {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.util.Iterator it = cardBitmapArr.iterator();
                            while (it.hasNext()) {
                                java.lang.Object next = it.next();
                                java.lang.String str = lp0.b.e() + "tmpScanLicense/";
                                if (com.tencent.mm.vfs.w6.j(str)) {
                                    com.tencent.mm.vfs.w6.f(str);
                                }
                                com.tencent.mm.vfs.w6.u(str);
                                com.tencent.mm.vfs.w6.t(str);
                                java.lang.String str2 = str + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
                                com.tencent.mm.sdk.platformtools.x.D0(next instanceof android.graphics.Bitmap ? (android.graphics.Bitmap) next : null, 100, android.graphics.Bitmap.CompressFormat.JPEG, str2, true);
                                com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem d17 = com.tencent.mm.plugin.webview.model.m4.d(str2);
                                com.tencent.mm.plugin.webview.modeltools.z.Zi().a(d17);
                                arrayList.add(d17.f182736e);
                            }
                            java.util.HashMap hashMap = new java.util.HashMap();
                            hashMap.put("sourceType", "scan");
                            hashMap.put("localIdArr", new org.json.JSONArray((java.lang.String[]) arrayList.toArray(new java.lang.String[0])));
                            kVar2.f340863d.e(y2Var2.f341013c, "choosePassport:ok", hashMap);
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChoosePassport", "save scan license error: %s", e17.getMessage());
                            kVar2.f340863d.e(y2Var2.f341013c, "choosePassport:fail", null);
                        }
                    }
                    com.tencent.mm.sdk.event.IListener iListener3 = com.tencent.mm.plugin.webview.ui.tools.jsapi.b0.f184940e;
                    if (iListener3 != null) {
                        iListener3.dead();
                    }
                } else if (i18 == 2) {
                    kVar2.f340863d.e(y2Var2.f341013c, "choosePassport:cancel", null);
                    com.tencent.mm.sdk.event.IListener iListener4 = com.tencent.mm.plugin.webview.ui.tools.jsapi.b0.f184940e;
                    if (iListener4 != null) {
                        iListener4.dead();
                    }
                } else if (i18 == 3) {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(wsVar.f8320b);
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(32227, "5," + jSONObject.getInt("scan_detail") + ',' + jSONObject.getLong("scan_time") + ',' + jSONObject.getString("scan_session_id") + ',' + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.c0.clicfg_android_passport_scan_oblique_control_value, 0.15f) + ',' + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.c0.clicfg_android_passport_scan_stable_control_value, 15.0f) + ",," + jSONObject.optInt("is_vertical_screen"));
                    } catch (org.json.JSONException unused) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChoosePassport", "json error");
                    }
                }
                return true;
            }
        };
        com.tencent.mm.plugin.webview.ui.tools.jsapi.b0.f184940e = iListener;
        iListener.alive();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("BaseScanUI_select_scan_mode", 11);
        intent.putExtra("KEY_SUPPORT_ORIENTATION", true);
        java.lang.Object obj = y2Var.f340790a.get("scanDetailMsgMap");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChoosePassport", "JSPAI scan params: " + str);
            intent.putExtra("key_basescanui_scan_detail_msg_map", str);
        }
        j45.l.j(kVar.f340860a, "scanner", ".ui.ScanPassportUI", intent, null);
    }
}
