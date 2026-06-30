package kf1;

/* loaded from: classes.dex */
public class i extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 469;
    public static final java.lang.String NAME = "getAvailableAudioSources";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = jSONObject != null ? jSONObject.toString() : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetAvailableAudioSources", "getAvailableAudioSources data:%s", objArr);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("auto");
        arrayList.add("mic");
        arrayList.add("camcorder");
        arrayList.add("voice_recognition");
        arrayList.add("voice_communication");
        if (fp.h.c(24)) {
            arrayList.add("unprocessed");
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put((java.lang.String) it.next());
        }
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("audioSources", jSONArray);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetAvailableAudioSources", "getAvailableAudioSources ret:%s", hashMap.toString());
        lVar.a(i17, p("ok", hashMap));
    }
}
