package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public class p5 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("LiteAppJsApiReleaseKeepAlive", "appId:%s", str);
        com.tencent.mm.plugin.lite.LiteAppCenter.releaseKeepAlive(str, this.f143442e.f299024a);
        this.f143443f.d(false);
    }
}
