package wo3;

/* loaded from: classes9.dex */
public class m extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.String f448198m = "";

    /* renamed from: n, reason: collision with root package name */
    public static java.lang.String f448199n = "";

    /* renamed from: d, reason: collision with root package name */
    public int f448200d = -1;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f448201e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f448202f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f448203g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f448204h = "";

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f448205i;

    public m(java.lang.String str, int i17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f448205i = hashMap;
        hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID, wo.w0.k());
        hashMap.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, str);
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "" + i17);
        hashMap.put("sign", com.tencent.mm.sdk.platformtools.w2.a(wo.w0.k() + "&" + str));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        gm0.j1.i();
        sb6.append(gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_OFFLINE_CODE_VER_STRING, ""));
        hashMap.put("code_ver", sb6.toString());
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 568;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 49;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/offlinequeryuser";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            f448198m = jSONObject.optString("limit_fee");
            f448199n = jSONObject.optString("is_show_order_detail");
            java.lang.String optString = jSONObject.optString("pay_amount");
            java.lang.String optString2 = jSONObject.optString("pay_number");
            java.lang.String optString3 = jSONObject.optString("card_logos");
            to3.c0.Ai().Vi(196629, f448198m);
            to3.c0.Ai().Vi(196641, f448199n);
            to3.c0.Ai().Vi(196645, optString);
            to3.c0.Ai().Vi(196646, optString2);
            to3.c0.Ai().Vi(196615, optString3);
            yo3.m.f464158e = optString3;
            jSONObject.optInt("retcode");
            jSONObject.optString("retmsg");
            this.f448200d = jSONObject.optInt("wx_error_type");
            this.f448201e = jSONObject.optString("wx_error_msg");
            this.f448202f = jSONObject.optString("get_code_flag");
            this.f448203g = jSONObject.optString("micropay_pause_flag");
            this.f448204h = jSONObject.optString("micropay_pause_word");
        }
    }
}
