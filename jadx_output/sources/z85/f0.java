package z85;

/* loaded from: classes12.dex */
public class f0 extends l75.s0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f470796d;

    public f0() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f470796d = linkedList;
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_RECENT_SMILEY_STRING, "");
        try {
            synchronized (linkedList) {
                linkedList.clear();
                org.json.JSONArray jSONArray = new org.json.JSONArray(str);
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    z85.e0 e0Var = new z85.e0();
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                    e0Var.f470793a = jSONObject.optString("key", "");
                    e0Var.f470794b = jSONObject.optInt("use_count", 0);
                    e0Var.f470795c = jSONObject.optLong("last_time", 0L);
                    this.f470796d.add(e0Var);
                }
            }
        } catch (org.json.JSONException unused) {
            com.tencent.mars.xlog.Log.w("SmileyUsageInfoStorage", "data error clear all");
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_RECENT_SMILEY_STRING, null);
            this.f470796d.clear();
        }
    }

    public java.util.List m0() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this.f470796d) {
            java.util.Iterator it = this.f470796d.iterator();
            while (it.hasNext()) {
                z85.e0 e0Var = (z85.e0) it.next();
                if (com.tencent.mm.smiley.e1.b().a(e0Var.f470793a)) {
                    arrayList.add(e0Var);
                }
            }
        }
        return arrayList;
    }
}
