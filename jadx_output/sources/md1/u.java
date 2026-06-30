package md1;

/* loaded from: classes13.dex */
public final class u extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1449;
    public static final java.lang.String NAME = "operateVoIPView";

    public static final java.lang.String C(md1.u uVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, boolean z17) {
        uVar.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return str;
        }
        ik1.b0 b0Var = new ik1.b0();
        com.tencent.mm.plugin.appbrand.appstorage.u1 fileSystem = lVar.getFileSystem();
        kotlin.jvm.internal.o.d(fileSystem);
        com.tencent.mm.plugin.appbrand.appstorage.j1 createTempFileFrom = fileSystem.createTempFileFrom(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str)), "", z17, b0Var);
        kotlin.jvm.internal.o.f(createTempFileFrom, "createTempFileFrom(...)");
        if (createTempFileFrom == com.tencent.mm.plugin.appbrand.appstorage.j1.OK) {
            return (java.lang.String) b0Var.f291824a;
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        boolean z17;
        java.lang.String str2;
        if (lVar == null || jSONObject == null) {
            return;
        }
        java.lang.String optString = jSONObject.optString("type");
        java.lang.String optString2 = jSONObject.optString("openId");
        kotlin.jvm.internal.o.f(optString2, "optString(...)");
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        final com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE;
        fw1.d b17 = p0Var.f96019h.b(optString2);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceOperateVoIPView", "onOperateVoIPView, member:[" + b17 + "],data:" + jSONObject);
        p0Var.O1 = new md1.t(this, lVar, i17);
        if (optString != null) {
            switch (optString.hashCode()) {
                case -1909077165:
                    if (optString.equals(com.tencent.mm.plugin.appbrand.jsapi.audio.d3.NAME)) {
                        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("startRecordArgs");
                        int i18 = 3;
                        if (optJSONObject != null) {
                            i18 = optJSONObject.optInt("recordType", 3);
                            z17 = optJSONObject.optBoolean("isSaveRecordPath", false);
                            str = optJSONObject.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, "");
                            kotlin.jvm.internal.o.f(str, "optString(...)");
                        } else {
                            str = "";
                            z17 = false;
                        }
                        final java.lang.Integer valueOf = java.lang.Integer.valueOf(b17.f267069a);
                        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "start record for memberId %s, recordType:%d, isSaveRecordPath:%b", valueOf, java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17));
                        if (p0Var.T1.get(valueOf) != null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceService", "start record failed: record has been started");
                            ((md1.t) p0Var.O1).b(2, "Record has already been started");
                            return;
                        }
                        p0Var.P1 = i18;
                        p0Var.Q1 = z17;
                        p0Var.R1 = str;
                        java.lang.String str3 = "MicroMsg_" + java.lang.System.currentTimeMillis();
                        boolean z18 = p0Var.Q1;
                        java.util.HashMap hashMap = p0Var.N1;
                        java.util.HashMap hashMap2 = p0Var.M1;
                        if (z18) {
                            java.lang.String str4 = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.f96010d2 + p0Var.f96028q + "/";
                            if (!com.tencent.mm.vfs.w6.j(str4)) {
                                com.tencent.mm.vfs.w6.u(str4);
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "setVideoPath: %s", str4);
                            hashMap2.put(valueOf, str4 + str3 + ".mp4");
                            hashMap.put(valueOf, str4 + str3 + ".jpeg");
                        } else {
                            if (!com.tencent.mm.vfs.w6.j(lp0.b.K())) {
                                com.tencent.mm.vfs.w6.u(lp0.b.K());
                            }
                            hashMap2.put(valueOf, lp0.b.K() + str3 + ".mp4");
                            hashMap.put(valueOf, lp0.b.K() + str3 + ".jpeg");
                        }
                        p0Var.f96036x0.e(valueOf.intValue(), "screenRecordCallback", p0Var.V1);
                        p0Var.f96018g.f95988t.put(valueOf, p0Var.W1);
                        ((md1.t) p0Var.O1).b(0, ya.b.SUCCESS);
                        p0Var.n(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0$$a
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var2 = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.this;
                                p0Var2.getClass();
                                p0Var2.l(valueOf.intValue(), p0Var2.f96033v, p0Var2.f96034w);
                            }
                        });
                        return;
                    }
                    break;
                case -1391995149:
                    if (optString.equals(com.tencent.mm.plugin.appbrand.jsapi.audio.l3.NAME)) {
                        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("stopRecordArgs");
                        java.lang.String str5 = "";
                        if (optJSONObject2 != null) {
                            str5 = optJSONObject2.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, "");
                            kotlin.jvm.internal.o.f(str5, "optString(...)");
                        }
                        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(b17.f267069a);
                        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "stop record for memberId %s, extraData:%s", valueOf2, str5);
                        p0Var.f96036x0.d(valueOf2.intValue(), "screenRecordCallback");
                        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c0 c0Var = (com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c0) p0Var.T1.get(valueOf2);
                        if (c0Var == null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceService", "stop record failed: record hasn't been started yet");
                            ((md1.t) p0Var.O1).c(1, "Record hasn't been started yet", "", 0, 0, false);
                            return;
                        }
                        c0Var.d();
                        java.lang.String str6 = (java.lang.String) p0Var.M1.get(valueOf2);
                        if (str6 != null) {
                            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str6));
                            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "record file exist:%b, file length:%d", java.lang.Boolean.valueOf(r6Var.m()), java.lang.Long.valueOf(r6Var.C()));
                        }
                        ((md1.t) p0Var.O1).c(0, ya.b.SUCCESS, str6, c0Var.f95856a, c0Var.f95857b, p0Var.Q1);
                        synchronized (p0Var.U1) {
                            p0Var.T1.remove(valueOf2);
                        }
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                            p0Var.R1 = str5;
                        }
                        if (p0Var.Q1) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "save service voip record path to db");
                            s75.d.b(new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.x1(p0Var, str6), "InsertOrUpdateServiceVoipRecord");
                            return;
                        }
                        return;
                    }
                    break;
                case -802181223:
                    if (optString.equals("exitFullScreen")) {
                        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d D = D(jSONObject);
                        if (D != null) {
                            D.exitFullScreen();
                            str2 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                            if (str2 == null) {
                                str2 = "";
                            }
                            java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                            try {
                                jSONObject2.put("errno", 0);
                            } catch (java.lang.Exception e17) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                            }
                            lVar.a(i17, u(str2, jSONObject2));
                            return;
                        }
                        java.lang.String concat = "cannot find view of openId ".concat(optString2);
                        if (android.text.TextUtils.isEmpty(concat)) {
                            concat = "fail:jsapi invalid request data";
                        }
                        if (concat == null) {
                            concat = "";
                        }
                        java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        try {
                            jSONObject3.put("errno", 101);
                        } catch (java.lang.Exception e18) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                        }
                        lVar.a(i17, u(concat, jSONObject3));
                        return;
                    }
                    break;
                case 458133450:
                    if (optString.equals("requestFullScreen")) {
                        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d D2 = D(jSONObject);
                        if (D2 != null) {
                            D2.d(jSONObject.optInt(com.tencent.map.geolocation.sapp.TencentLocation.EXTRA_DIRECTION, -1));
                            str2 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                            if (str2 == null) {
                                str2 = "";
                            }
                            java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                            try {
                                jSONObject4.put("errno", 0);
                            } catch (java.lang.Exception e19) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
                            }
                            lVar.a(i17, u(str2, jSONObject4));
                            return;
                        }
                        java.lang.String concat2 = "cannot find view of openID ".concat(optString2);
                        if (android.text.TextUtils.isEmpty(concat2)) {
                            concat2 = "fail:jsapi invalid request data";
                        }
                        if (concat2 == null) {
                            concat2 = "";
                        }
                        java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                        try {
                            jSONObject5.put("errno", 101);
                        } catch (java.lang.Exception e27) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
                        }
                        lVar.a(i17, u(concat2, jSONObject5));
                        return;
                    }
                    break;
                case 552585030:
                    if (optString.equals("capture")) {
                        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(b17.f267069a);
                        java.lang.String format = java.lang.String.format("%s%d.%s", "capture", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "jpeg");
                        p0Var.L1.put(valueOf3, lp0.b.K() + format);
                        p0Var.f96036x0.e(valueOf3.intValue(), "screenCaptureCallback", p0Var.S1);
                        return;
                    }
                    break;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.JsApiCloudVoiceOperateVoIPView", "operateType not supported: " + optString);
        java.lang.String str11 = "operateType " + optString + " is not supported";
        if (android.text.TextUtils.isEmpty(str11)) {
            str11 = "fail:jsapi invalid request data";
        }
        if (str11 == null) {
            str11 = "";
        }
        java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject6 = new org.json.JSONObject();
        try {
            jSONObject6.put("errno", 101);
        } catch (java.lang.Exception e28) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e28);
        }
        lVar.a(i17, u(str11, jSONObject6));
    }

    public final com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d D(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d dVar;
        java.lang.String optString = jSONObject.optString("openId");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        java.util.Iterator it = ((java.util.HashMap) com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE.f96019h.f96141b).entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                dVar = null;
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (((com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d) entry.getValue()).getOpenId().equals(optString)) {
                dVar = (com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d) entry.getValue();
                break;
            }
        }
        if (dVar != null) {
            return dVar;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.OpenVoice.JsApiCloudVoiceOperateVoIPView", "the view of openId " + optString + " not found");
        return null;
    }
}
