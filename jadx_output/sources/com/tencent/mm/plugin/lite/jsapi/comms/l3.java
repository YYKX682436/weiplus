package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes8.dex */
public class l3 implements m93.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean[] f143650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143651b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean[] f143652c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f143653d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f143654e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.m3 f143655f;

    public l3(com.tencent.mm.plugin.lite.jsapi.comms.m3 m3Var, boolean[] zArr, java.lang.String str, boolean[] zArr2, boolean z17, java.lang.String[] strArr) {
        this.f143655f = m3Var;
        this.f143650a = zArr;
        this.f143651b = str;
        this.f143652c = zArr2;
        this.f143653d = z17;
        this.f143654e = strArr;
    }

    @Override // m93.h
    public void a() {
        synchronized (this.f143650a) {
            if (!this.f143650a[0]) {
                com.tencent.mars.xlog.Log.w("LiteAppJsApiLogin", "geta8key fail");
                this.f143650a[0] = true;
                this.f143655f.f143443f.a("getA8Key fail");
            }
        }
    }

    @Override // m93.h
    public void b(m93.g gVar) {
        android.os.Bundle extraData;
        synchronized (this.f143650a) {
            if (!this.f143650a[0]) {
                com.tencent.mars.xlog.Log.i("LiteAppJsApiLogin", "geta8key:" + this.f143651b);
                this.f143650a[0] = true;
                java.lang.String str = this.f143651b;
                if (str != null && com.tencent.mm.plugin.lite.w.f144511n.contains(str)) {
                    ((java.util.HashMap) gVar.f325034c).put("referer", "https://game.weixin.qq.com/");
                }
                com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback uICallback = com.tencent.mm.plugin.lite.LiteAppCenter.getUICallback(this.f143655f.f143442e.f299024a);
                if (uICallback != null && (extraData = uICallback.getExtraData()) != null) {
                    extraData.putInt(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, gVar.f325033b);
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                java.util.Map map = gVar.f325035d;
                if (map != null) {
                    for (java.util.Map.Entry entry : ((java.util.HashMap) map).entrySet()) {
                        try {
                            jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
                        } catch (org.json.JSONException unused) {
                        }
                    }
                }
                this.f143655f.f143443f.c(jSONObject, false);
                if (!this.f143652c[0]) {
                    java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        java.lang.String next = keys.next();
                        if (next.equals("uin") || next.equals("exportKey") || next.equals("exportkey") || next.equals("wx_header")) {
                            keys.remove();
                            ((java.util.HashMap) gVar.f325035d).remove(next);
                        }
                    }
                }
                com.tencent.mm.plugin.lite.LiteAppCenter.setAuthInfo(this.f143651b, gVar.f325032a, gVar.f325034c, gVar.f325035d, this.f143653d);
                com.tencent.mm.plugin.lite.storage.f fVar = new com.tencent.mm.plugin.lite.storage.f();
                fVar.field_host = this.f143654e[0];
                fVar.field_param = gVar.f325032a;
                fVar.field_paramMap = jSONObject.toString();
                fVar.field_updateTime = java.lang.System.currentTimeMillis() / 1000;
                fVar.field_headerMap = new org.json.JSONObject(gVar.f325034c).toString();
                com.tencent.mm.plugin.lite.logic.g1.s().T(fVar);
                com.tencent.mars.xlog.Log.i("LiteAppJsApiLogin", "geta8key success");
            }
        }
    }
}
