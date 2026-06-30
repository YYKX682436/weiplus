package s50;

@j95.b
/* loaded from: classes.dex */
public class i0 extends i95.w implements tg0.i1 {
    public java.lang.String wi() {
        try {
            java.util.List list = new g23.h().f267920d;
            if (list == null) {
                return null;
            }
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            if (arrayList.isEmpty()) {
                return null;
            }
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                g23.g gVar = (g23.g) it.next();
                if (gVar != null) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("key", gVar.f267914a);
                    jSONObject.put(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, gVar.f267915b);
                    jSONObject.put("selected", gVar.f267916c ? 1 : 0);
                    jSONArray.put(jSONObject);
                }
            }
            if (jSONArray.length() > 0) {
                return jSONArray.toString();
            }
            return null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.ConfigProvider", e17, "getCheckBoxesJson error", new java.lang.Object[0]);
            return null;
        }
    }
}
