package t93;

/* loaded from: classes.dex */
public class f extends com.tencent.mm.plugin.lite.api.p {
    public static android.os.Bundle A(java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            for (java.lang.String str2 : str.split("&")) {
                java.lang.String[] split = str2.split("=");
                try {
                    if (split.length == 2) {
                        bundle.putString(java.net.URLDecoder.decode(split[0], com.tencent.mapsdk.internal.rv.f51270c), java.net.URLDecoder.decode(split[1], com.tencent.mapsdk.internal.rv.f51270c));
                    } else if (split.length == 1) {
                        bundle.putString(java.net.URLDecoder.decode(split[0], com.tencent.mapsdk.internal.rv.f51270c), "");
                    }
                } catch (java.io.UnsupportedEncodingException unused) {
                }
            }
        }
        return bundle;
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f143443f.a("data is null");
            com.tencent.mars.xlog.Log.w("LiteAppJsApiHandleFinderJump", "data is null");
            return;
        }
        final java.lang.String optString = jSONObject.optString("jump_info_str");
        if (android.text.TextUtils.isEmpty(optString)) {
            this.f143443f.a("jump_info_str is null");
            com.tencent.mars.xlog.Log.w("LiteAppJsApiHandleFinderJump", "jump_info_str is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("LiteAppJsApiHandleFinderJump", java.lang.String.format("Invoke jumpInfoStr:%s", optString));
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: t93.f$$a
            /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x00a7  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 860
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: t93.f$$a.run():void");
            }
        });
        this.f143443f.d(false);
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
