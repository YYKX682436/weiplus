package f91;

/* loaded from: classes13.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f260238a = new java.util.HashMap();

    public f() {
        a(new f91.i());
        a(new f91.g());
        a(new f91.h());
        a(new f91.j());
        a(new f91.d());
        a(new f91.b());
        a(new f91.c());
        a(new f91.k());
    }

    public final void a(f91.a aVar) {
        if (aVar == null) {
            return;
        }
        this.f260238a.put(aVar.getMethod(), aVar);
    }

    public android.graphics.Path b(com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathActionArgWrapper pathActionArgWrapper) {
        android.graphics.Path path = new android.graphics.Path();
        java.util.List<com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg> list = pathActionArgWrapper.f77146e;
        if (list != null && list.size() != 0) {
            for (com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg basePathActionArg : list) {
                if (basePathActionArg != null) {
                    f91.a aVar = (f91.a) ((java.util.HashMap) this.f260238a).get(basePathActionArg.f77041d);
                    if (aVar != null) {
                        aVar.a(path, basePathActionArg);
                    }
                }
            }
        }
        return path;
    }

    public android.graphics.Path c(org.json.JSONArray jSONArray) {
        android.graphics.Path path = new android.graphics.Path();
        if (jSONArray != null && jSONArray.length() != 0) {
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
                if (optJSONObject != null) {
                    java.lang.String optString = optJSONObject.optString(ya.b.METHOD);
                    org.json.JSONArray optJSONArray = optJSONObject.optJSONArray(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                    f91.a aVar = (f91.a) ((java.util.HashMap) this.f260238a).get(optString);
                    if (aVar != null) {
                        aVar.b(path, optJSONArray);
                    }
                }
            }
        }
        return path;
    }
}
