package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes9.dex */
public class n0 extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f156910d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.utils.n f156911e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.utils.n f156912f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f156913g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f156914h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.remittance.model.m0 f156915i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f156916m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f156917n;

    public n0(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, java.lang.String str5, int i19, java.lang.String str6, java.util.Map map, long j17, java.lang.String str7, java.lang.String str8) {
        this(str, str2, i17, str3, str4, i18, "", str5, i19, str6, map, j17, str7, str8);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 1691;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 0;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/transferoperation";
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0153, code lost:
    
        r9.u1(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0104 A[Catch: Exception -> 0x00fc, TRY_ENTER, TryCatch #0 {Exception -> 0x00fc, blocks: (B:65:0x00f3, B:47:0x0104, B:48:0x0123, B:50:0x0149, B:55:0x0153, B:56:0x015a, B:62:0x0157, B:63:0x0114), top: B:64:0x00f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0114 A[Catch: Exception -> 0x00fc, TryCatch #0 {Exception -> 0x00fc, blocks: (B:65:0x00f3, B:47:0x0104, B:48:0x0123, B:50:0x0149, B:55:0x0153, B:56:0x015a, B:62:0x0157, B:63:0x0114), top: B:64:0x00f3 }] */
    @Override // com.tencent.mm.wallet_core.model.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r8, java.lang.String r9, org.json.JSONObject r10) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.remittance.model.n0.onGYNetEnd(int, java.lang.String, org.json.JSONObject):void");
    }

    public n0(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, java.lang.String str5, java.lang.String str6, int i19, java.lang.String str7, java.util.Map map, long j17, java.lang.String str8, java.lang.String str9) {
        this.f156910d = null;
        this.f156913g = "";
        this.f156914h = "";
        this.f156916m = "";
        this.f156917n = "";
        this.f156910d = str3;
        this.f156916m = str8;
        this.f156917n = str6;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("trans_id", str2);
        hashMap.put(ya.b.TRANSACTION_ID, str);
        hashMap.put("op", str3);
        hashMap.put(dm.i4.COL_USERNAME, str4);
        hashMap.put("invalid_time", i18 + "");
        hashMap.put("total_fee", java.lang.String.valueOf(i17));
        hashMap.put("left_button_continue", str5);
        hashMap.put("group_username", str6);
        hashMap.put("sub_recv_channel_id", java.lang.String.valueOf(j17));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str9)) {
            hashMap.put("transfer_attach", java.net.URLEncoder.encode(str9));
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
            if (c01.e2.E(str6)) {
                hashMap.put("group_type", "2");
            } else {
                hashMap.put("group_type", "1");
            }
        }
        hashMap.put("recv_account_type", i19 + "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str7)) {
            hashMap.put("bind_serial", str7);
        } else if (i19 == 7) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24610, "9", "5", "REMITTANCE_1002", str2 != null ? str2 : "");
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceUtil", "xjg remittance bind_serial error trans_id: " + str2);
        } else if (str7 == null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24610, "9", "5", "REMITTANCE_1001", str2 != null ? str2 : "");
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceUtil", "normal remittance bind_serial error account_type: " + i19 + " trans_id: " + str2);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceUtil", "normal remittance bind_serial is empty account_type: " + i19 + ", trans_id: " + str2);
        }
        if (map != null && map.size() > 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str10 = (java.lang.String) entry.getKey();
                java.lang.String str11 = (java.lang.String) entry.getValue();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str10) && !com.tencent.mm.sdk.platformtools.t8.K0(str11)) {
                    com.tencent.mars.xlog.Log.i("Micromsg.NetSceneTenpayRemittanceConfirm", "account click info , key is %s, value is %s", str10, str11);
                    try {
                        jSONObject.put(str10, str11);
                    } catch (org.json.JSONException unused) {
                    }
                }
            }
            hashMap.put("sub_title_clicked", jSONObject.toString());
        }
        com.tencent.mars.xlog.Log.i("Micromsg.NetSceneTenpayRemittanceConfirm", "trans_id：%s, transaction_id:%s， total_fee：%s ，recv_channel_type：%s, transferAttach：%s", str2, str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19), str9);
        setRequestData(hashMap);
    }
}
