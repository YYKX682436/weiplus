package com.tencent.mm.plugin.lite.secure;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0007\u001a\u00020\u00062\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0003H\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0007J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0007J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0007J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0007J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0007J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0007J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0007¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/plugin/lite/secure/LiteAppSecureModule;", "Lbd/d;", "", "", "", "params", "Lorg/json/JSONObject;", "makeSuccessResult", "errMsg", "makeErrorResult", "", "errCode", "option", "Ljz5/f0;", "importKey", "encrypt", "decrypt", "sign", "verify", "generateKey", "getPublicKey", "<init>", "()V", "Companion", "na3/c", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class LiteAppSecureModule extends bd.d {
    public static final na3.c Companion = new na3.c(null);
    private static final java.lang.String TAG = "LiteAppSecureModule";

    private final org.json.JSONObject makeErrorResult(java.lang.String errMsg) {
        return makeErrorResult(-1, errMsg);
    }

    private final org.json.JSONObject makeSuccessResult(java.util.Map<java.lang.String, ? extends java.lang.Object> params) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errCode", 0);
            jSONObject.put("errMsg", "ok");
            if (params != null) {
                for (java.util.Map.Entry<java.lang.String, ? extends java.lang.Object> entry : params.entrySet()) {
                    java.lang.String key = entry.getKey();
                    java.lang.Object value = entry.getValue();
                    if (value instanceof byte[]) {
                        jSONObject.put(key, android.util.Base64.encodeToString((byte[]) value, 2));
                    } else {
                        jSONObject.put(key, value);
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "makeSuccessResult error: ", e17);
        }
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ org.json.JSONObject makeSuccessResult$default(com.tencent.mm.plugin.lite.secure.LiteAppSecureModule liteAppSecureModule, java.util.Map map, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            map = null;
        }
        return liteAppSecureModule.makeSuccessResult(map);
    }

    @bd.c(uiThread = true)
    public final void decrypt(org.json.JSONObject option) {
        kotlin.jvm.internal.o.g(option, "option");
        try {
            java.lang.String string = option.getString("keyId");
            byte[] decode = android.util.Base64.decode(option.getString("encrypted"), 0);
            java.lang.String string2 = option.getString("algorithm");
            na3.e eVar = na3.e.f335986a;
            kotlin.jvm.internal.o.d(string);
            kotlin.jvm.internal.o.d(decode);
            kotlin.jvm.internal.o.d(string2);
            getCallback().a(makeSuccessResult(kz5.b1.e(new jz5.l("decrypted", eVar.a(string, decode, string2)))), false, false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "decrypt error: ", e17);
            getCallback().a(makeErrorResult("decrypt error: " + e17.getMessage()), false, true);
        }
    }

    @bd.c(uiThread = true)
    public final void encrypt(org.json.JSONObject option) {
        kotlin.jvm.internal.o.g(option, "option");
        try {
            java.lang.String string = option.getString("keyId");
            java.lang.String string2 = option.getString("algorithm");
            byte[] decode = android.util.Base64.decode(option.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA), 0);
            na3.e eVar = na3.e.f335986a;
            kotlin.jvm.internal.o.d(string);
            kotlin.jvm.internal.o.d(decode);
            kotlin.jvm.internal.o.d(string2);
            getCallback().a(makeSuccessResult(kz5.b1.e(new jz5.l("encrypted", eVar.b(string, decode, string2)))), false, false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "encrypt error: ", e17);
            getCallback().a(makeErrorResult("encrypt error: " + e17.getMessage()), false, true);
        }
    }

    @bd.c(uiThread = true)
    public final void generateKey(org.json.JSONObject option) {
        kotlin.jvm.internal.o.g(option, "option");
        try {
            java.lang.String string = option.getString("algorithm");
            int optInt = option.optInt("keySize", 2048);
            na3.e eVar = na3.e.f335986a;
            kotlin.jvm.internal.o.d(string);
            getCallback().a(makeSuccessResult(kz5.b1.e(new jz5.l("keyId", eVar.d(string, optInt)))), false, false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "generateKey error: ", e17);
            getCallback().a(makeErrorResult("generateKey error: " + e17.getMessage()), false, true);
        }
    }

    @bd.c(uiThread = true)
    public final void getPublicKey(org.json.JSONObject option) {
        kotlin.jvm.internal.o.g(option, "option");
        try {
            java.lang.String string = option.getString("keyId");
            java.lang.String string2 = option.getString("algorithm");
            na3.e eVar = na3.e.f335986a;
            kotlin.jvm.internal.o.d(string);
            kotlin.jvm.internal.o.d(string2);
            getCallback().a(makeSuccessResult(kz5.b1.e(new jz5.l("publicKey", eVar.f(string, string2)))), false, false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "getPublicKey error: ", e17);
            getCallback().a(makeErrorResult("getPublicKey error: " + e17.getMessage()), false, true);
        }
    }

    @bd.c(uiThread = true)
    public final void importKey(org.json.JSONObject option) {
        kotlin.jvm.internal.o.g(option, "option");
        try {
            java.lang.String optString = option.optString("publicKey");
            java.lang.String string = option.getString("privateKey");
            java.lang.String string2 = option.getString("certificate");
            java.lang.String string3 = option.getString("algorithm");
            byte[] decode = android.util.Base64.decode(optString, 0);
            byte[] decode2 = android.util.Base64.decode(string, 0);
            byte[] decode3 = android.util.Base64.decode(string2, 0);
            na3.e eVar = na3.e.f335986a;
            kotlin.jvm.internal.o.d(decode);
            kotlin.jvm.internal.o.d(decode2);
            kotlin.jvm.internal.o.d(decode3);
            kotlin.jvm.internal.o.d(string3);
            getCallback().a(makeSuccessResult(kz5.b1.e(new jz5.l("keyId", eVar.g(decode, decode2, decode3, string3)))), false, false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "importKey error: ", e17);
            getCallback().a(makeErrorResult("importKey error: " + e17.getMessage()), false, true);
        }
    }

    @bd.c(uiThread = true)
    public final void sign(org.json.JSONObject option) {
        kotlin.jvm.internal.o.g(option, "option");
        try {
            java.lang.String string = option.getString("keyId");
            byte[] decode = android.util.Base64.decode(option.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA), 0);
            java.lang.String string2 = option.getString("algorithm");
            na3.e eVar = na3.e.f335986a;
            kotlin.jvm.internal.o.d(string);
            kotlin.jvm.internal.o.d(decode);
            kotlin.jvm.internal.o.d(string2);
            getCallback().a(makeSuccessResult(kz5.b1.e(new jz5.l("signature", eVar.h(string, decode, string2)))), false, false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "sign error: ", e17);
            getCallback().a(makeErrorResult("sign error: " + e17.getMessage()), false, true);
        }
    }

    @bd.c(uiThread = true)
    public final void verify(org.json.JSONObject option) {
        kotlin.jvm.internal.o.g(option, "option");
        try {
            java.lang.String string = option.getString("keyId");
            byte[] decode = android.util.Base64.decode(option.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA), 0);
            byte[] decode2 = android.util.Base64.decode(option.getString("signature"), 0);
            java.lang.String string2 = option.getString("algorithm");
            na3.e eVar = na3.e.f335986a;
            kotlin.jvm.internal.o.d(string);
            kotlin.jvm.internal.o.d(decode);
            kotlin.jvm.internal.o.d(decode2);
            kotlin.jvm.internal.o.d(string2);
            getCallback().a(makeSuccessResult(kz5.b1.e(new jz5.l("result", java.lang.Boolean.valueOf(eVar.i(string, decode, decode2, string2))))), false, false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "verify error: ", e17);
            getCallback().a(makeErrorResult("verify error: " + e17.getMessage()), false, true);
        }
    }

    private final org.json.JSONObject makeErrorResult(int errCode, java.lang.String errMsg) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errCode", errCode);
            jSONObject.put("errMsg", errMsg);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "makeErrorResult error: ", e17);
        }
        return jSONObject;
    }
}
