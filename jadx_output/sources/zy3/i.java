package zy3;

/* loaded from: classes7.dex */
public final class i implements zy3.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zy3.k f477655a;

    public i(zy3.k kVar) {
        this.f477655a = kVar;
    }

    public void a(java.lang.String str, java.lang.Object obj, int i17, org.json.JSONObject jSONObject, java.util.Map map, java.util.Map map2) {
        boolean b17 = kotlin.jvm.internal.o.b("ok", str);
        boolean z17 = true;
        zy3.k kVar = this.f477655a;
        if (!b17 || i17 != 200 || obj == null) {
            com.tencent.mars.xlog.Log.e(kVar.f477656a, "connect failed statusCode:%d,error:%s", java.lang.Integer.valueOf(i17), obj);
            ((az3.a) kVar.f477661f).a(1, i17, "");
            return;
        }
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(obj.toString());
            int i18 = jSONObject2.getInt("errcode");
            kVar.f477660e.f477665a = java.lang.Integer.valueOf(i18);
            if (i18 != 0) {
                com.tencent.mars.xlog.Log.e(kVar.f477656a, "JSON MISSMatch obj: errcode");
                ((az3.a) kVar.f477661f).a(1, i18, "");
                return;
            }
            org.json.JSONObject jSONObject3 = jSONObject2.getJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            kotlin.jvm.internal.o.f(jSONObject3, "getJSONObject(...)");
            kVar.f477658c = jSONObject3;
            try {
                kVar.f477660e.f477667c = com.tenpay.ndk.WxSmCryptoUtil.getInstance().sm2DecryptWithMode(android.util.Base64.decode(kVar.f477658c.getString("data_encrypt_key"), 0), kVar.f477657b[0], com.tenpay.ndk.WxSmCryptoUtil.SM2CipherMode.SM2CipherMode_C1C3C2_ASN1);
                if (com.tencent.mm.sdk.platformtools.t8.M0(kVar.f477660e.f477667c)) {
                    com.tencent.mars.xlog.Log.e(kVar.f477656a, "SM4 Encrypt Key get failed");
                    ((az3.a) kVar.f477661f).a(5, 10006, "");
                    return;
                }
                com.tencent.mars.xlog.Log.i(kVar.f477656a, "SM4 Encrypt Key get success " + kVar.f477660e.f477667c);
                org.json.JSONObject jSONObject4 = kVar.f477658c.getJSONObject("bankcard_res");
                kotlin.jvm.internal.o.f(jSONObject4, "getJSONObject(...)");
                kVar.f477659d = jSONObject4;
                kVar.f477660e.f477666b.f477646e = java.lang.Integer.valueOf(kVar.f477659d.getInt("key_seq"));
                java.lang.String string = kVar.f477659d.getString("aad");
                kotlin.jvm.internal.o.f(string, "getString(...)");
                zy3.a aVar = kVar.f477660e.f477666b;
                java.nio.charset.Charset charset = r26.c.f368865a;
                byte[] bytes = string.getBytes(charset);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                aVar.f477645d = bytes;
                java.lang.String string2 = kVar.f477659d.getString("tag");
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                kVar.f477660e.f477666b.f477643b = android.util.Base64.decode(string2, 0);
                java.lang.String string3 = kVar.f477659d.getString("iv");
                zy3.a aVar2 = kVar.f477660e.f477666b;
                kotlin.jvm.internal.o.d(string3);
                byte[] bytes2 = string3.getBytes(charset);
                kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
                aVar2.f477644c = bytes2;
                com.tencent.mars.xlog.Log.i(kVar.f477656a, "SM4 Encrypt Param aad " + kVar.f477660e.f477666b.f477645d + ",tag " + kVar.f477660e.f477666b.f477643b + ",iv " + kVar.f477660e.f477666b.f477644c);
                kVar.f477660e.f477666b.f477642a = android.util.Base64.decode(kVar.f477659d.getString("cipher_text"), 0);
                if (com.tencent.mm.sdk.platformtools.t8.M0(kVar.f477660e.f477666b.f477642a)) {
                    com.tencent.mars.xlog.Log.e(kVar.f477656a, "Decode Base64 get failed");
                    ((az3.a) kVar.f477661f).a(5, 10006, "");
                    return;
                }
                zy3.a aVar3 = kVar.f477660e.f477666b;
                com.tenpay.ndk.WxSmCryptoUtil wxSmCryptoUtil = com.tenpay.ndk.WxSmCryptoUtil.getInstance();
                zy3.m mVar = kVar.f477660e;
                zy3.a aVar4 = mVar.f477666b;
                aVar3.f477642a = wxSmCryptoUtil.sm4GcmDecrypt(aVar4.f477642a, aVar4.f477643b, mVar.f477667c, aVar4.f477644c, aVar4.f477645d);
                if (com.tencent.mm.sdk.platformtools.t8.M0(kVar.f477660e.f477666b.f477642a)) {
                    com.tencent.mars.xlog.Log.e(kVar.f477656a, "SM4 GCM Decode Failed");
                    ((az3.a) kVar.f477661f).a(5, 10006, "");
                    return;
                }
                com.tencent.mars.xlog.Log.i(kVar.f477656a, "SM4 GCM Decode OCR Data Success " + kVar.f477660e.f477666b.f477642a);
                r45.ld ldVar = new r45.ld();
                ldVar.parseFrom(kVar.f477660e.f477666b.f477642a);
                java.lang.String str2 = ldVar.f379317e.f392455d;
                if (str2 != null && str2.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    com.tencent.mars.xlog.Log.e(kVar.f477656a, "Protobuf Decode Failed");
                    ((az3.a) kVar.f477661f).a(5, 10006, "");
                } else {
                    zy3.j jVar = kVar.f477661f;
                    java.lang.String text = ldVar.f379317e.f392455d;
                    kotlin.jvm.internal.o.f(text, "text");
                    ((az3.a) jVar).a(0, 0, text);
                }
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e(kVar.f477656a, "JSON MISSMatch obj: %s", e17.getMessage());
                ((az3.a) kVar.f477661f).a(1, 10005, "");
            }
        } catch (org.json.JSONException unused) {
            com.tencent.mars.xlog.Log.e(kVar.f477656a, "JSON MISSMatch obj: errcode");
            ((az3.a) kVar.f477661f).a(1, 10005, "");
        }
    }
}
