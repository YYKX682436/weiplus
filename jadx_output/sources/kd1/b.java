package kd1;

/* loaded from: classes7.dex */
public class b implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f306695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f306696e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kd1.c f306697f;

    public b(kd1.c cVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f306697f = cVar;
        this.f306695d = lVar;
        this.f306696e = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String string = bundle.getString("idsStr", "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            java.util.Vector vector = new java.util.Vector();
            java.lang.String[] split = string.split(",");
            java.util.Vector vector2 = new java.util.Vector();
            java.util.Vector vector3 = new java.util.Vector();
            for (java.lang.String str : split) {
                vector.add(str);
                if (com.tencent.mm.sdk.platformtools.t8.D0(str, "0")) {
                    kd1.e.b();
                    java.lang.String string2 = kd1.e.a().getString(str, "");
                    com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.JsApiLoadPaySpeechDialectConfig", "resPath:%s", string2);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(string2) || !com.tencent.mm.vfs.w6.j(string2)) {
                        kd1.e.b();
                        vector2.add(kd1.e.c(str));
                        vector3.add("");
                    } else {
                        kd1.e.b();
                        vector2.add(kd1.e.c("0-1"));
                        kd1.e.b();
                        vector3.add(kd1.e.a().getString("0-1_version", ""));
                    }
                } else {
                    kd1.e.b();
                    vector2.add(kd1.e.c(str));
                    kd1.e.b();
                    vector3.add(kd1.e.a().getString(str + com.tencent.mapsdk.internal.ep.f49375t, ""));
                }
            }
            if (vector.size() > 0) {
                hashMap.put("downloadedPackId", new org.json.JSONArray((java.util.Collection) vector));
                hashMap.put("downloadedPackMD5", new org.json.JSONArray((java.util.Collection) vector2));
                hashMap.put("downloadedPackVersions", new org.json.JSONArray((java.util.Collection) vector3));
                com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.JsApiLoadPaySpeechDialectConfig", "downloadedPackId:%s  ，downloadedPackMD5：%s, downloadedPackVersions:%s", new org.json.JSONArray((java.util.Collection) vector).toString(), new org.json.JSONArray((java.util.Collection) vector2).toString(), new org.json.JSONArray((java.util.Collection) vector3).toString());
            }
        }
        java.lang.String string3 = bundle.getString("resId", "");
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.JsApiLoadPaySpeechDialectConfig", "resId:%s", string3);
        hashMap.put("dialectPackId", string3);
        this.f306695d.a(this.f306696e, this.f306697f.p("ok", hashMap));
    }
}
