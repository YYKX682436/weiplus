package nz2;

/* loaded from: classes9.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public int f341543a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f341544b = 0;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f341545c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f341546d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f341547e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f341548f;

    public static nz2.c a(java.lang.String str, int i17, int i18, int i19, int i27) {
        nz2.c cVar = new nz2.c();
        cVar.f341543a = i17;
        cVar.f341544b = i18;
        cVar.f341545c = com.tencent.mm.plugin.fingerprint.FingerPrintAuth.genPayFPEncrypt(mz2.n0.a(com.tencent.mm.sdk.platformtools.x2.f193071a), mz2.n0.b(), wo.w0.k(), java.lang.String.valueOf(i18), com.tencent.mm.wallet_core.model.f1.a(), str, wo.w0.m());
        cVar.f341546d = com.tencent.mm.plugin.fingerprint.FingerPrintAuth.genOpenFPSign(mz2.n0.a(com.tencent.mm.sdk.platformtools.x2.f193071a), mz2.n0.b(), wo.w0.k(), cVar.f341545c);
        return cVar;
    }

    public static nz2.c b(eu5.a aVar) {
        nz2.c cVar = new nz2.c();
        boolean a17 = aVar.a();
        mz2.d2 d2Var = mz2.d2.IML;
        if (a17) {
            zt5.s sVar = (zt5.s) aVar.f256827c;
            if (sVar != null) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("json", sVar.f475629j);
                    jSONObject.put("signature", sVar.f475630k);
                    java.lang.String str = sVar.f475629j;
                    cVar.f341547e = str;
                    java.lang.String str2 = sVar.f475630k;
                    cVar.f341548f = str2;
                    d2Var.f333114g = sVar;
                    cVar.f341543a = 0;
                    com.tencent.mars.xlog.Log.i("MicroMsg.BiometricPayAuthenticationResult", "soter authen result: %s, sign: %s", str, str2);
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BiometricPayAuthenticationResult", e17, "", new java.lang.Object[0]);
                    cVar.f341543a = 3000;
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.BiometricPayAuthenticationResult", "signature result is null");
                cVar.f341543a = 3000;
            }
        } else {
            int i17 = aVar.f475605a;
            if (i17 == 1007 || i17 == 1027 || i17 == 1018) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BiometricPayAuthenticationResult", "init error, maybe key invalid. remove former key and give suggestion");
                cVar.f341543a = com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_LOADING;
                d2Var.f333113f = true;
            } else if (i17 == 1021 || i17 == 1022) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BiometricPayAuthenticationResult", "too many trial");
                cVar.f341543a = 10308;
            } else if (i17 == 1020) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BiometricPayAuthenticationResult", "user cancelled");
                cVar.f341543a = 2000;
            } else if (i17 == 1023) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BiometricPayAuthenticationResult", "add authenticate task failed");
                cVar.f341543a = com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_RESOLUTION;
            } else if (i17 == 1029) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BiometricPayAuthenticationResult", "clicked negative button");
                cVar.f341543a = com.tencent.rtmp.TXLiveConstants.PLAY_EVT_GET_PLAYINFO_SUCC;
            } else {
                cVar.f341543a = com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_PROGRESS;
            }
        }
        return cVar;
    }
}
