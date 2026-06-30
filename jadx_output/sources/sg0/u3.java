package sg0;

@j95.b
/* loaded from: classes8.dex */
public class u3 extends jm0.o implements tg0.w1 {

    /* renamed from: m, reason: collision with root package name */
    public boolean f407822m = false;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f407823n = new java.util.HashMap();

    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        set.add(ug0.y.class);
        set.add(ug0.z.class);
        if (!ug0.q.f427472n) {
            com.tencent.mars.xlog.Log.i("WebSearchService", "CommonSyncRedDot disabled.");
        } else {
            com.tencent.mars.xlog.Log.i("WebSearchService", "CommonSyncRedDot enabled, importing WebSearchCommonSyncRedDotFSC.");
            set.add(ug0.q.class);
        }
    }

    public void Zi(j75.b bVar) {
        j75.f Ai = Ai();
        j75.f fVar = null;
        if (Ai != null && (Ai.getState() instanceof ug0.x)) {
            fVar = Ai();
        }
        if (fVar != null) {
            fVar.B3(bVar);
        }
    }

    public tg0.u1 aj() {
        return ug0.q.T6(this).f427475h;
    }

    public boolean bj(java.lang.String str) {
        ug0.q T6 = ug0.q.T6(this);
        if (!ug0.q.f427472n) {
            return false;
        }
        if ((str == null || str.length() == 0) || !((java.util.Set) ((jz5.n) T6.f427473f).getValue()).contains(str)) {
            return false;
        }
        if (kotlin.jvm.internal.o.b(str, "Search.Entrance")) {
            return ug0.q.f427470i;
        }
        if (kotlin.jvm.internal.o.b(str, "Search.MentionEntrance")) {
            return ug0.q.f427471m;
        }
        return false;
    }

    public boolean cj() {
        boolean z17 = j62.e.g().i("clicfg_android_fts_vertical_search_new_style", 1, true, true) > 0;
        if (z17 != this.f407822m) {
            this.f407822m = z17;
            com.tencent.mars.xlog.Log.i("WebSearchService", "useVerticalSearchNewStyle: ".concat(z17 ? "true" : "false"));
        }
        return this.f407822m;
    }

    public void fj(int i17, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("logid", java.lang.Integer.valueOf(i17));
        hashMap.put("log_buffer", str);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            jSONArray.put(new org.json.JSONObject(hashMap));
            jSONObject2.put("clientversion", o45.wf.f343029g);
            jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_DEVICE_NAME, o45.wf.f343023a);
            jSONObject2.put(ya.b.ITEM_LIST, jSONArray);
            jSONObject.put("cgiName", "MMDataReport");
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject2);
            gm0.j1.d().g(new su4.s1("test", jSONObject.toString(), -1));
        } catch (org.json.JSONException unused) {
        }
    }

    public void hj(java.lang.String str, boolean z17) {
        ug0.q T6 = ug0.q.T6(this);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setRedDotShowingAtPath, isCommonSyncRedDotEnabled: ");
        boolean z18 = ug0.q.f427472n;
        sb6.append(z18);
        sb6.append(", redDotPath: ");
        sb6.append(str);
        sb6.append(", isShowing: ");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", sb6.toString());
        if (z18) {
            if ((str == null || str.length() == 0) || !((java.util.Set) ((jz5.n) T6.f427473f).getValue()).contains(str)) {
                return;
            }
            if (kotlin.jvm.internal.o.b(str, "Search.Entrance")) {
                ug0.q.f427470i = z17;
            } else if (kotlin.jvm.internal.o.b(str, "Search.MentionEntrance")) {
                ug0.q.f427471m = z17;
            }
        }
    }
}
