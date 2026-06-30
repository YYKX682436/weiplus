package x03;

/* loaded from: classes15.dex */
public class i1 extends x03.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x03.j1 f451059a;

    public i1(x03.j1 j1Var) {
        this.f451059a = j1Var;
    }

    public void a(int i17, int i18, java.lang.String str, java.lang.String str2) {
        if (this.f451059a.f451062d.f451096i != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, java.lang.Integer.valueOf(i17));
            hashMap.put("errorType", java.lang.Integer.valueOf(i18));
            hashMap.put(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_MSG, str);
            hashMap.put("errorActionDesc", str2);
            ((ku5.t0) ku5.t0.f312615d).B(new x03.h1(this, i17, str, hashMap));
        }
    }

    public void b(com.tencent.thumbplayer.api.TPPlayerMsg.TPVideoSeiInfo tPVideoSeiInfo) {
        if (tPVideoSeiInfo != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVideoPlayerPlugin", "onPlayerGetSeiInfo seiInfoType: " + tPVideoSeiInfo.videoSeiType);
            java.lang.String str = new java.lang.String(tPVideoSeiInfo.seiData, java.nio.charset.StandardCharsets.UTF_8);
            int lastIndexOf = str.lastIndexOf("\\0");
            if (lastIndexOf != -1 && lastIndexOf == str.length() - 2) {
                str = str.substring(0, lastIndexOf);
            }
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                x03.p1 p1Var = this.f451059a.f451062d;
                if (p1Var.f451099l) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("event", "getMessage");
                    hashMap.put("msg", jSONObject.toString());
                    ((ku5.t0) ku5.t0.f312615d).B(new x03.o1(p1Var, hashMap));
                }
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FlutterVideoPlayerPlugin", e17.toString());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(boolean r11, int r12, com.tencent.thumbplayer.api.ITPPlayer r13) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x03.i1.c(boolean, int, com.tencent.thumbplayer.api.ITPPlayer):void");
    }
}
