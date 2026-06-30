package k91;

/* loaded from: classes7.dex */
public final class j5 {

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f305628c;

    /* renamed from: d, reason: collision with root package name */
    public int f305629d;

    /* renamed from: e, reason: collision with root package name */
    public int f305630e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f305631f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f305632g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f305633h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f305634i;

    /* renamed from: j, reason: collision with root package name */
    public java.util.List f305635j;

    /* renamed from: k, reason: collision with root package name */
    public java.util.List f305636k;

    /* renamed from: l, reason: collision with root package name */
    public java.util.List f305637l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f305638m;

    /* renamed from: n, reason: collision with root package name */
    public int f305639n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f305640o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f305641p;

    /* renamed from: u, reason: collision with root package name */
    public int f305646u;

    /* renamed from: v, reason: collision with root package name */
    public int f305647v;

    /* renamed from: w, reason: collision with root package name */
    public int f305648w;

    /* renamed from: y, reason: collision with root package name */
    public r45.ie7 f305650y;

    /* renamed from: z, reason: collision with root package name */
    public int f305651z;

    /* renamed from: a, reason: collision with root package name */
    public long f305626a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f305627b = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f305642q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f305643r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f305644s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f305645t = 0;

    /* renamed from: x, reason: collision with root package name */
    public int[] f305649x = null;
    public long A = 0;

    public static k91.j5 a(java.lang.String str) {
        org.json.JSONArray optJSONArray;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.WxaAttributes", "getAppInfo, json is EMPTY");
            return null;
        }
        android.os.SystemClock.elapsedRealtime();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            k91.j5 j5Var = new k91.j5();
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("RunningFlagInfo");
            if (optJSONObject != null) {
                j5Var.f305626a = optJSONObject.optLong("RunningFlag");
                optJSONObject.optString("AppOpenForbiddenUrl");
                j5Var.f305627b = optJSONObject.optLong("CanNotStarWxaBeforeTime", 0L);
            }
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("Network");
            if (optJSONObject2 != null) {
                j5Var.f305631f = k91.a6.a(optJSONObject2.optJSONArray("RequestDomain"));
                j5Var.f305632g = k91.a6.a(optJSONObject2.optJSONArray("WsRequestDomain"));
                j5Var.f305633h = k91.a6.a(optJSONObject2.optJSONArray("UploadDomain"));
                j5Var.f305634i = k91.a6.a(optJSONObject2.optJSONArray("DownloadDomain"));
                j5Var.f305635j = k91.a6.a(optJSONObject2.optJSONArray("UDPDomain"));
                j5Var.f305636k = k91.a6.a(optJSONObject2.optJSONArray("TCPDomain"));
                j5Var.f305637l = k91.a6.a(optJSONObject2.optJSONArray("PrefetchDNSDomain"));
            }
            j5Var.f305628c = jSONObject.optString("Appid");
            j5Var.f305630e = jSONObject.optInt("WechatPluginApp", 0);
            j5Var.f305629d = jSONObject.optInt("AppServiceType", 0);
            j5Var.f305638m = jSONObject.optString("fromBusinessUsername");
            j5Var.f305639n = jSONObject.optInt("OriginalFlag", 0);
            j5Var.f305640o = jSONObject.optString("OriginalRedirectUrl");
            j5Var.f305641p = jSONObject.optString("game_icon_flag_list");
            j5Var.f305642q = jSONObject.optInt("ShowRelievedBuyFlag", 0);
            j5Var.f305643r = jSONObject.optInt("ShowFlagshipFlag", 0);
            j5Var.f305644s = jSONObject.optInt("ShowFinancialLicenseFlag", 0);
            j5Var.f305645t = jSONObject.optInt("AgeAppropriateLevel", 0);
            j5Var.f305646u = jSONObject.optInt("SystemAuthBizScene", 0);
            j5Var.f305647v = jSONObject.optInt("SystemAuthFrequencyLimitFlag", 0);
            j5Var.f305648w = jSONObject.optInt("LaunchFallbackMinVersion", 0);
            j5Var.f305649x = new int[0];
            if (jSONObject.has("LaunchFallbackMinVersion_BlackScenes") && (optJSONArray = jSONObject.optJSONArray("LaunchFallbackMinVersion_BlackScenes")) != null) {
                j5Var.f305649x = new int[optJSONArray.length()];
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    j5Var.f305649x[i17] = optJSONArray.optInt(i17);
                }
            }
            org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("MigrateInfo");
            if (optJSONObject3 != null) {
                r45.ie7 ie7Var = new r45.ie7();
                j5Var.f305650y = ie7Var;
                ie7Var.f376978d = optJSONObject3.optString("target_appid");
            }
            j5Var.f305651z = jSONObject.optInt("BatchPreFetchBusiFlag", 0);
            j5Var.A = jSONObject.optLong("depend_lib_bit_flag", 0L);
            return j5Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.WxaAttributes", "getAppInfo, json(%s) parse failed ex = %s", str, e17);
            return null;
        }
    }

    public boolean b() {
        return this.f305629d == 4;
    }

    public boolean c() {
        return this.f305630e > 0 || this.f305629d == 7;
    }
}
