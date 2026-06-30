package k91;

/* loaded from: classes7.dex */
public final class v5 extends dm.vc {
    public static final l75.e0 E1 = dm.vc.initAutoDBInfo(dm.vc.class);
    public k91.o5 A1;
    public com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo B1;
    public java.util.List C1 = null;
    public k91.l5 D1;

    /* renamed from: z1, reason: collision with root package name */
    public k91.j5 f305799z1;

    public static org.json.JSONObject t0(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        try {
            return new org.json.JSONObject(str);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.WxaAttributes", e17, "createJsonObjectOrNull", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // dm.vc, l75.f0
    public void convertFrom(android.database.Cursor cursor) {
        super.convertFrom(cursor);
        this.f305799z1 = null;
        this.A1 = null;
        this.B1 = null;
        this.C1 = null;
        this.D1 = null;
    }

    @Override // dm.vc, l75.f0
    public l75.e0 getDBInfo() {
        return E1;
    }

    public java.lang.String toString() {
        return "WxaAttributes{field_username='" + this.field_username + "', field_appId='" + this.field_appId + "', field_nickname='" + this.field_nickname + "', field_signature='" + this.field_signature + "', field_registerSource='" + this.field_registerSource + "', field_appInfo='" + this.field_appInfo + "', field_versionInfo='" + this.field_versionInfo + "', field_bindWxaInfo='" + this.field_bindWxaInfo + "', field_dynamicInfo='" + this.field_dynamicInfo + "', field_bizMenu='" + this.field_bizMenu + "'}";
    }

    public k91.j5 u0() {
        if (this.f305799z1 == null) {
            this.f305799z1 = k91.j5.a(this.field_appInfo);
        }
        return this.f305799z1;
    }

    public k91.o5 v0() {
        org.json.JSONObject jSONObject;
        if (this.A1 == null) {
            java.lang.String str = null;
            try {
                jSONObject = new org.json.JSONObject(this.field_dynamicInfo);
            } catch (java.lang.Exception unused) {
                jSONObject = null;
            }
            if (jSONObject == null) {
                jSONObject = new org.json.JSONObject();
            }
            this.A1 = new k91.o5();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            android.os.SystemClock.elapsedRealtime();
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("NewSetting");
            if (optJSONObject == null) {
                optJSONObject = new org.json.JSONObject();
            }
            this.A1.f305706a.f77409d = optJSONObject.optInt("Uint32MaxLocalstorageSizeInMB", 5);
            this.A1.f305706a.f77410e = optJSONObject.optInt("Uint32OpendataMaxLocalstorageSizeInMB", 5);
            this.A1.f305706a.f77411f = optJSONObject.optInt("MaxCodeSize", 5);
            this.A1.f305706a.f77412g = optJSONObject.optInt("ExpendedMaxWebviewDepth", 5);
            this.A1.f305706a.f77413h = optJSONObject.optInt("MaxBackgroundLifespan", 600);
            this.A1.f305706a.f77414i = optJSONObject.optInt("MaxRequestConcurrent", 10);
            this.A1.f305706a.f77415m = optJSONObject.optInt("MaxUploadConcurrent", 10);
            this.A1.f305706a.f77416n = optJSONObject.optInt("MaxDownloadConcurrent", 10);
            this.A1.f305706a.f77417o = optJSONObject.optInt("MaxWebsocketConnect", 5);
            this.A1.f305706a.f77418p = optJSONObject.optInt("MaxWorkerConcurrent", 1);
            this.A1.f305706a.f77419q = optJSONObject.optInt("WebsocketSkipPortCheck", 0) != 0;
            this.A1.f305706a.f77420r = optJSONObject.optInt("TLSSkipHostnameCheck", 0) != 0;
            this.A1.f305706a.f77421s = optJSONObject.optInt("Uint32MaxFileStorageSizeInMB", 10);
            this.A1.f305706a.f77422t = optJSONObject.optInt("Uint32MaxTempFileStorageSizeInMB", 300);
            this.A1.f305706a.f77423u = optJSONObject.optInt("Uint32MinTempFileStorageSizeInMB", 100);
            this.A1.f305706a.f77424v = optJSONObject.optInt("CanKeepAliveByAudioPlay", 0) > 0;
            this.A1.f305706a.f77425w = optJSONObject.optInt("LifeSpanBeforeSuspend", 5);
            this.A1.f305706a.f77426x = optJSONObject.optInt("LifeSpanAfterSuspend", 300);
            this.A1.f305706a.f77427y = optJSONObject.optInt("ScanCodeEnableZZM", 0) != 0;
            this.A1.f305706a.f77428z = optJSONObject.optInt("CanPreFetchData", 0) > 0;
            this.A1.f305706a.A = optJSONObject.optInt("PreFetchDataWithLocation", 0) > 0;
            this.A1.f305706a.B = optJSONObject.optInt("CanPeriodFetchData", 0) > 0;
            this.A1.f305706a.C = optJSONObject.optInt("PeriodFetchData", 0);
            this.A1.f305706a.D = optJSONObject.optInt("PeriodFetchDataDay", 7);
            this.A1.f305706a.E = optJSONObject.optInt("GuaranteeFlag", 0);
            this.A1.f305706a.F = optJSONObject.optInt("CanShowLoadingAdvert", 0) > 0;
            this.A1.f305706a.G = optJSONObject.optInt("CanShowGameLoadingAdvert", 0) > 0;
            this.A1.f305706a.H = optJSONObject.optInt("BrandOfficialLabel", 0);
            this.A1.f305706a.I = optJSONObject.optLong("OpenWxaWaitUpdateMaxMicSec", 13000L);
            this.A1.f305706a.f77408J = optJSONObject.optLong("OpenWxaWaitUpdateMaxMicSecForWeakNet", com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
            this.A1.f305706a.K = optJSONObject.optLong("OpenWxaWaitUpdateMinMicSec", 0L);
            this.A1.f305706a.L = optJSONObject.optLong("NextTryOpenWxaDisMicSec", com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
            this.A1.f305706a.M = optJSONObject.optString("PreCgiCallByteBeforeLaunch", "").getBytes(java.nio.charset.StandardCharsets.UTF_8);
            this.A1.f305706a.N = optJSONObject.optLong("Uint32WxaLibPrivateMaxFileStorageSizeInMB", 200L);
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaDynamicInfo$Setting wxaAttributes$WxaDynamicInfo$Setting = this.A1.f305706a;
            java.lang.String optString = optJSONObject.optString("GameABTestControlBytes");
            try {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                    byte[] decode = android.util.Base64.decode(optString, 0);
                    r45.zb7 zb7Var = new r45.zb7();
                    zb7Var.parseFrom(decode);
                    byte[] bArr = zb7Var.f391898d.f192156a;
                    java.lang.String trim = new java.lang.String(android.util.Base64.encode(bArr, 0)).trim();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
                    if (bArr != null) {
                        for (int i17 = 0; i17 < bArr.length; i17++) {
                            byte b17 = bArr[i17];
                            if (i17 != 0) {
                                sb6.append(",");
                            }
                            sb6.append((int) b17);
                        }
                    }
                    sb6.append("]");
                    k91.j5 u07 = u0();
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WxaAttributes", "dl: GameABTestControlBytes[%s]: \"%s\" -> %s -> \"%s\"", u07 != null ? u07.f305628c : null, optString, sb6, trim);
                    str = trim;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.WxaAttributes", e17, "dl: GameABTestControlBytes, error, \"%s\"", optString);
            }
            wxaAttributes$WxaDynamicInfo$Setting.P = str;
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("NewCategories");
            if (optJSONArray != null) {
                this.A1.f305707b = new java.util.LinkedList();
                for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                    org.json.JSONObject optJSONObject2 = optJSONArray.optJSONObject(i18);
                    if (optJSONObject2 != null) {
                        this.A1.f305707b.add(new android.util.Pair(optJSONObject2.optString("first"), optJSONObject2.optString("second")));
                    }
                }
            }
            org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("parallel_download_info");
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WxaAttributes", "[ParallelDownload] getDynamicInfo: raw parallel_download_info json=%s", optJSONObject3);
            if (optJSONObject3 != null) {
                org.json.JSONArray optJSONArray2 = optJSONObject3.optJSONArray("package_list");
                if (optJSONArray2 != null) {
                    this.A1.f305708c = new java.util.LinkedList();
                    for (int i19 = 0; i19 < optJSONArray2.length(); i19++) {
                        org.json.JSONObject optJSONObject4 = optJSONArray2.optJSONObject(i19);
                        if (optJSONObject4 != null) {
                            this.A1.f305708c.add(new android.util.Pair(optJSONObject4.optString("module_name"), optJSONObject4.optString("package_type")));
                        }
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WxaAttributes", "[ParallelDownload] getDynamicInfo: package_list is NULL inside parallel_download_info");
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WxaAttributes", "[ParallelDownload] getDynamicInfo: parallel_download_info is NULL in dynamicInfo json");
            }
        }
        return this.A1;
    }

    public com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo w0() {
        if (this.B1 != null || com.tencent.mm.sdk.platformtools.t8.K0(this.field_versionInfo)) {
            return this.B1;
        }
        com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo a17 = com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo.a(this.field_versionInfo);
        this.B1 = a17;
        return a17;
    }

    public final java.util.List y0(org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                k91.k5 k5Var = new k91.k5();
                jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "");
                jSONObject.optInt("type");
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(jSONObject.optString("value", ""));
                k5Var.f305664a = jSONObject2.optString("userName", "");
                k5Var.f305665b = jSONObject2.optString("pagePath", "");
                k5Var.f305666c = jSONObject2.optInt("version");
                y0(jSONObject.optJSONArray("sub_button_list"));
                arrayList.add(k5Var);
            }
            return arrayList;
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    public java.lang.String z0() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("NickName", this.field_nickname);
        hashMap.put("BrandIconURL", this.field_brandIconURL);
        hashMap.put("BigHeadImgUrl", this.field_bigHeadURL);
        hashMap.put("SmallHeadImgUrl", this.field_smallHeadURL);
        hashMap.put("Signature", this.field_signature);
        hashMap.put("WxAppOpt", java.lang.Integer.valueOf(this.field_appOpt));
        hashMap.put("RegisterSource", t0(this.field_registerSource));
        hashMap.put("WxaAppInfo", t0(this.field_appInfo));
        hashMap.put("WxaAppVersionInfo", t0(this.field_versionInfo));
        hashMap.put("BindWxaInfo", t0(this.field_bindWxaInfo));
        hashMap.put("WxaAppDynamic", t0(this.field_dynamicInfo));
        hashMap.put("MMBizMenu", t0(this.field_bizMenu));
        return new org.json.JSONObject(hashMap).toString();
    }
}
