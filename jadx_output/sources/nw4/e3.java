package nw4;

/* loaded from: classes.dex */
public abstract class e3 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f340830a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f340831b = "";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f340832c = "";

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f340833d = "";

    public static void a(java.util.Map map, boolean z17, java.lang.String str, java.lang.String str2) {
        if (map != null) {
            map.put("fromMenu", java.lang.Boolean.valueOf(z17));
            map.put("keyParam", str);
            if (com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) map.get("appId"))) {
                map.put("appId", str2);
            }
        }
    }

    public static void b(java.lang.String str, java.util.Map map) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        boolean z17;
        boolean z18;
        int i17;
        int i18;
        int i19;
        java.lang.String str6 = str;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewSecurityUtil", "function name is null or nil.");
            return;
        }
        if (map != null) {
            z17 = com.tencent.mm.sdk.platformtools.t8.n1((java.lang.Boolean) map.get("fromMenu"));
            str2 = (java.lang.String) map.get("keyParam");
            if (str2 == null) {
                str2 = "";
            }
            str3 = (java.lang.String) map.get("appId");
            if (str3 == null) {
                str3 = "";
            }
            z18 = com.tencent.mm.sdk.platformtools.t8.n1((java.lang.Boolean) map.get("isSuccess"));
            i17 = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) map.get("permissionValue"));
            i18 = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) map.get("baseErrorCode"));
            i19 = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) map.get("jsapiErrorCode"));
            str4 = (java.lang.String) map.get("containerEnv");
            if (str4 == null) {
                str4 = "";
            }
            str5 = (java.lang.String) map.get("miniProgramPath");
            if (str5 == null) {
                str5 = "";
            }
        } else {
            str2 = null;
            str3 = "";
            str4 = str3;
            str5 = str4;
            z17 = false;
            z18 = false;
            i17 = 0;
            i18 = 0;
            i19 = 0;
        }
        java.lang.String str7 = f340831b;
        if (str7 == null) {
            str7 = "";
        }
        com.tencent.mm.sdk.platformtools.i6 i6Var = com.tencent.mm.pluginsdk.ui.tools.e9.f191608a;
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.y9.a(str7);
        if (com.tencent.mm.sdk.platformtools.t8.K0(a17) && map != null) {
            java.lang.String str8 = (java.lang.String) map.get("report_initUrl");
            if (str8 == null) {
                str8 = "";
            }
            a17 = com.tencent.mm.sdk.platformtools.y9.a(str8);
        }
        java.lang.String str9 = f340832c;
        if (str9 == null) {
            str9 = "";
        }
        java.lang.String a18 = com.tencent.mm.sdk.platformtools.y9.a(str9);
        boolean z19 = !com.tencent.mm.sdk.platformtools.t8.K0(str4);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(a17);
        sb6.append(",");
        sb6.append(a18);
        sb6.append(",");
        java.lang.String str10 = f340833d;
        sb6.append(str10 != null ? str10 : "");
        sb6.append(",");
        sb6.append(str6 == null ? "" : str6);
        sb6.append(",");
        sb6.append(z17 ? "1" : "0");
        sb6.append(",");
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        sb6.append(",");
        sb6.append(str3);
        sb6.append(",");
        sb6.append(z18 ? "1" : "0");
        sb6.append(",");
        sb6.append(i17);
        if (z18) {
            sb6.append(",0,0,0");
        } else {
            sb6.append(",0,");
            sb6.append(i18);
            sb6.append(",");
            sb6.append(i19);
        }
        java.lang.String sb7 = sb6.toString();
        if (z19) {
            if (java.lang.System.currentTimeMillis() % 20 == 0) {
                sb6.append(",");
                sb6.append(str4);
                sb6.append(",");
                sb6.append(str5);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(18816, sb6.toString());
            }
        } else {
            if (java.lang.System.currentTimeMillis() % 20 == 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10417, sb7);
            }
        }
        java.util.HashSet hashSet = (java.util.HashSet) f340830a;
        if (hashSet.size() <= 0) {
            hashSet.add("openUrlByExtBrowser");
            hashSet.add("getCurrentSSID");
            hashSet.add(com.tencent.mm.plugin.appbrand.jsapi.media.e3.NAME);
            hashSet.add("uploadImage");
            hashSet.add("chooseVideo");
            hashSet.add("uploadVideo");
            hashSet.add("getOpenDeviceId");
            hashSet.add("chooseIdCard");
            hashSet.add("recordVideo");
            hashSet.add(com.tencent.mm.plugin.appbrand.jsapi.media.z3.NAME);
            hashSet.add("requestWxFacePictureVerify");
            hashSet.add("requestWxFacePictureVerifyUnionVideo");
            hashSet.add(cb1.o0.NAME);
            hashSet.add(com.tencent.mm.plugin.appbrand.jsapi.appdownload.g0.NAME);
            hashSet.add(com.tencent.mm.plugin.appbrand.jsapi.appdownload.q.NAME);
            hashSet.add(com.tencent.mm.plugin.appbrand.jsapi.appdownload.x.NAME);
            hashSet.add(com.tencent.mm.plugin.appbrand.jsapi.appdownload.l1.NAME);
            hashSet.add(com.tencent.mm.plugin.appbrand.jsapi.appdownload.m0.NAME);
            hashSet.add("launch3rdApp");
            hashSet.add(com.tencent.mm.plugin.appbrand.jsapi.appdownload.h1.NAME);
            hashSet.add(com.tencent.mm.plugin.appbrand.jsapi.pc.NAME);
            hashSet.add("launchApplication");
            hashSet.add(com.tencent.mm.plugin.appbrand.jsapi.appdownload.v.NAME);
            hashSet.add(com.google.android.gms.common.Scopes.PROFILE);
            hashSet.add("addContact");
            hashSet.add("jumpToBizProfile");
            hashSet.add("startTempSession");
            hashSet.add("quicklyAddBrandContact");
            hashSet.add("openBizChat");
            hashSet.add(com.tencent.mm.plugin.appbrand.jsapi.share.g1.NAME);
            hashSet.add("sendAppMessage");
            hashSet.add("sendServiceAppMessage");
            hashSet.add("getSendC2CMessageRequest");
            hashSet.add("shareQQ");
            hashSet.add("selectSingleContact");
            hashSet.add("sendAppMessageToSpecifiedContact");
            hashSet.add("sendSingleAppMessage");
            hashSet.add("openWeApp");
            hashSet.add(com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.l.NAME);
            hashSet.add("addCustomMenuItems");
            hashSet.add("openUrlWithExtraWebview");
            hashSet.add("enableFullScreen");
            hashSet.add("openCustomWebview");
            hashSet.add("openSpecificView");
            hashSet.add("getBrandWCPayBindCardRequest");
            hashSet.add("getTransferMoneyRequest");
            hashSet.add("verifyWCPayPassword");
            hashSet.add("getRecevieBizHongBaoRequest");
            hashSet.add("getH5PrepayRequest");
            hashSet.add("getH5TransactionRequest");
            hashSet.add("getWebPayCheckoutCounterRequst");
            hashSet.add("getWCPayRealnameVerify");
            hashSet.add("unbindBankCard");
            hashSet.add("idCardRealnameVerify");
            hashSet.add("openLuckyMoneyDetailView");
            hashSet.add("setWCPayPassword");
            hashSet.add(com.tencent.mm.plugin.appbrand.jsapi.w9.NAME);
            hashSet.add(com.tencent.mm.plugin.appbrand.jsapi.bio.face.j.NAME);
            hashSet.add("scanLicence");
            hashSet.add(com.tencent.mm.plugin.appbrand.jsapi.fakenative.h.NAME);
            hashSet.add("getBrandWCPayRequest");
            hashSet.add(com.tencent.mm.plugin.appbrand.jsapi.pay.p1.NAME);
            hashSet.add("editAddress");
            hashSet.add("getLatestAddress");
            hashSet.add(com.tencent.mm.plugin.appbrand.jsapi.lbs.g0.NAME);
            hashSet.add(com.tencent.mm.plugin.appbrand.jsapi.u4.NAME);
            hashSet.add("requireSoterBiometricAuthentication");
            hashSet.add(com.tencent.mm.plugin.appbrand.jsapi.c6.NAME);
        }
        if (hashSet.contains(str6)) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(a17);
            sb8.append(",");
            sb8.append(a18);
            sb8.append(",");
            if (str6 == null) {
                str6 = "";
            }
            sb8.append(str6);
            sb8.append(",");
            sb8.append(str3);
            sb8.append(",");
            sb8.append(z18 ? "1" : "0");
            java.lang.String sb9 = sb8.toString();
            if (!z19) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(17048, sb9);
                return;
            }
            sb8.append(",");
            sb8.append(str4);
            sb8.append(",");
            sb8.append(str5);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(18817, sb8.toString());
        }
    }
}
