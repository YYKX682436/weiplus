package ma1;

/* loaded from: classes.dex */
public class n extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    public static final int CTRL_INDEX = 668;
    public static final java.lang.String NAME = "isGameRecorderSupported";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsApiScreenRecorderSupport", "hy: trigger call whether is support screen recording");
        java.util.HashMap hashMap = new java.util.HashMap(2);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        hashMap.put("isVolumeSupported", bool);
        hashMap.put("isAtempoSupported", bool);
        hashMap.put("isFrameSupported", bool);
        hashMap.put("isSoundSupported", bool);
        return p("ok", hashMap);
    }
}
