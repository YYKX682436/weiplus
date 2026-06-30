package u93;

/* loaded from: classes15.dex */
public class m implements m33.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u93.n f425827a;

    public m(u93.n nVar) {
        this.f425827a = nVar;
    }

    public void a(boolean z17, int i17, java.util.LinkedList linkedList, java.util.LinkedList linkedList2, java.util.LinkedList linkedList3, java.lang.String str) {
        u93.n nVar = this.f425827a;
        if (!z17) {
            nVar.f143443f.a("fail: upload fail: " + i17);
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("mediaUrl", new org.json.JSONArray((java.util.Collection) linkedList3));
            if (nVar.f425829h != 1) {
                jSONObject.put("thumbUrl", str);
            } else {
                jSONObject.put("thumbUrl", "");
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("LiteAppJsApiUploadGameMediaFile", e17, "", new java.lang.Object[0]);
        }
        nVar.f143443f.c(jSONObject, false);
    }
}
