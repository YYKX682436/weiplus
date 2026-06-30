package vi1;

/* loaded from: classes7.dex */
public final class j2 {
    public java.lang.String A;
    public java.lang.String B;

    /* renamed from: a, reason: collision with root package name */
    public long f437352a;

    /* renamed from: b, reason: collision with root package name */
    public long f437353b;

    /* renamed from: c, reason: collision with root package name */
    public long f437354c;

    /* renamed from: d, reason: collision with root package name */
    public long f437355d;

    /* renamed from: e, reason: collision with root package name */
    public long f437356e;

    /* renamed from: f, reason: collision with root package name */
    public long f437357f;

    /* renamed from: g, reason: collision with root package name */
    public long f437358g;

    /* renamed from: h, reason: collision with root package name */
    public long f437359h;

    /* renamed from: i, reason: collision with root package name */
    public long f437360i;

    /* renamed from: j, reason: collision with root package name */
    public long f437361j;

    /* renamed from: k, reason: collision with root package name */
    public long f437362k;

    /* renamed from: l, reason: collision with root package name */
    public long f437363l;

    /* renamed from: m, reason: collision with root package name */
    public long f437364m;

    /* renamed from: n, reason: collision with root package name */
    public long f437365n;

    /* renamed from: o, reason: collision with root package name */
    public long f437366o;

    /* renamed from: p, reason: collision with root package name */
    public long f437367p;

    /* renamed from: q, reason: collision with root package name */
    public long f437368q;

    /* renamed from: r, reason: collision with root package name */
    public long f437369r;

    /* renamed from: s, reason: collision with root package name */
    public long f437370s;

    /* renamed from: t, reason: collision with root package name */
    public long f437371t;

    /* renamed from: u, reason: collision with root package name */
    public long f437372u;

    /* renamed from: v, reason: collision with root package name */
    public long f437373v;

    /* renamed from: w, reason: collision with root package name */
    public long f437374w;

    /* renamed from: x, reason: collision with root package name */
    public long f437375x;

    /* renamed from: y, reason: collision with root package name */
    public long f437376y;

    /* renamed from: z, reason: collision with root package name */
    public long f437377z;

    public j2(long j17, long j18, long j19, long j27, long j28, long j29, long j37, long j38, long j39, long j47, long j48, long j49, long j57, long j58, long j59, long j66, long j67, long j68, long j69, long j76, long j77, long j78, long j79, long j86, long j87, long j88, java.lang.String str, java.lang.String str2, int i17, kotlin.jvm.internal.i iVar) {
        long j89 = (i17 & 1) != 0 ? 0L : j17;
        long j96 = (i17 & 2) != 0 ? 0L : j18;
        long j97 = (i17 & 4) != 0 ? 0L : j19;
        long j98 = (i17 & 8) != 0 ? 0L : j27;
        long j99 = (i17 & 16) != 0 ? 0L : j28;
        long j100 = (i17 & 32) != 0 ? 0L : j29;
        long j101 = (i17 & 64) != 0 ? 0L : j37;
        long j102 = (i17 & 128) != 0 ? 0L : j38;
        long j103 = (i17 & 256) != 0 ? 0L : j39;
        long j104 = (i17 & 512) != 0 ? 0L : j47;
        long j105 = (i17 & 1024) != 0 ? 0L : j48;
        long j106 = (i17 & 2048) != 0 ? 0L : j49;
        long j107 = (i17 & 4096) != 0 ? 0L : j57;
        long j108 = (i17 & 8192) != 0 ? 0L : j58;
        long j109 = (i17 & 16384) != 0 ? 0L : j59;
        long j110 = (32768 & i17) != 0 ? 0L : j66;
        long j111 = (65536 & i17) != 0 ? 0L : j67;
        long j112 = (131072 & i17) != 0 ? 0L : j68;
        long j113 = (262144 & i17) != 0 ? 0L : j69;
        long j114 = (524288 & i17) != 0 ? 0L : j76;
        long j115 = (1048576 & i17) != 0 ? 0L : j77;
        long j116 = (2097152 & i17) != 0 ? 0L : j78;
        long j117 = (4194304 & i17) != 0 ? 0L : j79;
        long j118 = (8388608 & i17) != 0 ? 0L : j86;
        long j119 = (16777216 & i17) != 0 ? 0L : j87;
        long j120 = (33554432 & i17) != 0 ? 0L : j88;
        java.lang.String appId = (67108864 & i17) != 0 ? "" : str;
        java.lang.String phoneNumber = (i17 & 134217728) == 0 ? str2 : "";
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(phoneNumber, "phoneNumber");
        this.f437352a = j89;
        this.f437353b = j96;
        this.f437354c = j97;
        this.f437355d = j98;
        this.f437356e = j99;
        this.f437357f = j100;
        this.f437358g = j101;
        this.f437359h = j102;
        this.f437360i = j103;
        this.f437361j = j104;
        this.f437362k = j105;
        this.f437363l = j106;
        this.f437364m = j107;
        this.f437365n = j108;
        this.f437366o = j109;
        this.f437367p = j110;
        this.f437368q = j111;
        this.f437369r = j112;
        this.f437370s = j113;
        this.f437371t = j114;
        this.f437372u = j115;
        this.f437373v = j116;
        this.f437374w = j117;
        this.f437375x = j118;
        this.f437376y = j119;
        this.f437377z = j120;
        this.A = appId;
        this.B = phoneNumber;
    }

    public java.lang.String toString() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("isBindPhone", this.f437352a);
        jSONObject.put("bindSuccess", this.f437353b);
        jSONObject.put("getPhoneNumberCount", this.f437354c);
        jSONObject.put("clickConfirmCount", this.f437355d);
        jSONObject.put("clickDenyCount", this.f437356e);
        jSONObject.put("clickCancelCount", this.f437357f);
        jSONObject.put("confirmBindedPhoneCount", this.f437358g);
        jSONObject.put("confirmUnBindPhoneCount", this.f437359h);
        jSONObject.put("clickInfoCount", this.f437360i);
        jSONObject.put("clickUseOtherPhoneCount", this.f437361j);
        jSONObject.put("clickManagePhoneCount", this.f437362k);
        jSONObject.put("clickGetVerifyCodeCount", this.f437363l);
        jSONObject.put("getVerifyCodeSuccessCount", this.f437364m);
        jSONObject.put("getVerifyCodeFailedCount", this.f437365n);
        jSONObject.put("clickAddPhoneDoneCount", this.f437366o);
        jSONObject.put("addPhoneSuccessCount", this.f437367p);
        jSONObject.put("addPhoneFailedCount", this.f437368q);
        jSONObject.put("addPhoneAndSaveCount", this.f437369r);
        jSONObject.put("addPhoneNotSaveCount", this.f437370s);
        jSONObject.put("clickAddPhoneOnManagePageCount", this.f437371t);
        jSONObject.put("deletePhoneCount", this.f437372u);
        jSONObject.put("deletePhoneSuccessCount", this.f437373v);
        jSONObject.put("deletePhoneFailedCount", this.f437374w);
        jSONObject.put("verifyCodeCount", this.f437375x);
        jSONObject.put("verifyCodeSuccessCount", this.f437376y);
        jSONObject.put("verifyCodeFailedCount", this.f437377z);
        jSONObject.put("appId", this.A);
        jSONObject.put("phoneNumber", this.B);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j2(java.lang.String jsonStr) {
        this(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, null, 268435455, null);
        kotlin.jvm.internal.o.g(jsonStr, "jsonStr");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(jsonStr);
            try {
                this.f437352a = jSONObject.optLong("isBindPhone", 0L);
                this.f437353b = jSONObject.optLong("bindSuccess", 0L);
                this.f437354c = jSONObject.optLong("getPhoneNumberCount", 0L);
                this.f437355d = jSONObject.optLong("clickConfirmCount", 0L);
                this.f437356e = jSONObject.optLong("clickDenyCount", 0L);
                this.f437357f = jSONObject.optLong("clickCancelCount", 0L);
                this.f437358g = jSONObject.optLong("confirmBindedPhoneCount", 0L);
                this.f437359h = jSONObject.optLong("confirmUnBindPhoneCount", 0L);
                this.f437360i = jSONObject.optLong("clickInfoCount", 0L);
                this.f437361j = jSONObject.optLong("clickUseOtherPhoneCount", 0L);
                this.f437362k = jSONObject.optLong("clickManagePhoneCount", 0L);
                this.f437363l = jSONObject.optLong("clickGetVerifyCodeCount", 0L);
                this.f437364m = jSONObject.optLong("getVerifyCodeSuccessCount", 0L);
                this.f437365n = jSONObject.optLong("getVerifyCodeFailedCount", 0L);
                this.f437366o = jSONObject.optLong("clickAddPhoneDoneCount", 0L);
                this.f437367p = jSONObject.optLong("addPhoneSuccessCount", 0L);
                this.f437368q = jSONObject.optLong("addPhoneFailedCount", 0L);
                this.f437369r = jSONObject.optLong("addPhoneAndSaveCount", 0L);
                this.f437370s = jSONObject.optLong("addPhoneNotSaveCount", 0L);
                this.f437371t = jSONObject.optLong("clickAddPhoneOnManagePageCount", 0L);
                this.f437372u = jSONObject.optLong("deletePhoneCount", 0L);
                this.f437373v = jSONObject.optLong("deletePhoneSuccessCount", 0L);
                this.f437374w = jSONObject.optLong("deletePhoneFailedCount", 0L);
                this.f437375x = jSONObject.optLong("verifyCodeCount", 0L);
                this.f437376y = jSONObject.optLong("verifyCodeSuccessCount", 0L);
                this.f437377z = jSONObject.optLong("verifyCodeFailedCount", 0L);
                java.lang.String optString = jSONObject.optString("appId", "");
                kotlin.jvm.internal.o.f(optString, "optString(...)");
                this.A = optString;
                java.lang.String optString2 = jSONObject.optString("phoneNumber", "");
                kotlin.jvm.internal.o.f(optString2, "optString(...)");
                this.B = optString2;
            } catch (java.lang.Exception unused) {
            }
        } catch (java.lang.Exception unused2) {
        }
    }
}
