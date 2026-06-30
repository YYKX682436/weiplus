package eu0;

/* loaded from: classes5.dex */
public final class q {

    /* renamed from: g, reason: collision with root package name */
    public static final eu0.p f256729g = new eu0.p(null);

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f256730a = "reedit";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f256731b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f256732c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f256733d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f256734e;

    /* renamed from: f, reason: collision with root package name */
    public eu0.o f256735f;

    public final boolean a() {
        if (!kotlin.jvm.internal.o.b(this.f256730a, "reedit")) {
            return false;
        }
        java.lang.String str = this.f256731b;
        if (str == null || str.length() == 0) {
            return false;
        }
        java.lang.String str2 = this.f256732c;
        if (str2 == null || str2.length() == 0) {
            return false;
        }
        java.lang.String str3 = this.f256733d;
        if (str3 == null || str3.length() == 0) {
            return false;
        }
        java.util.List list = this.f256734e;
        return !(list == null || list.isEmpty());
    }

    public final org.json.JSONObject b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f256730a);
        java.lang.String str = this.f256731b;
        if (str != null) {
            if (!(str.length() > 0)) {
                str = null;
            }
            if (str != null) {
                jSONObject.put("template_id", str);
            }
        }
        java.lang.String str2 = this.f256732c;
        if (str2 != null) {
            if (!(str2.length() > 0)) {
                str2 = null;
            }
            if (str2 != null) {
                jSONObject.put("aigc_task_id", str2);
            }
        }
        java.lang.String str3 = this.f256733d;
        if (str3 != null) {
            if (!(str3.length() > 0)) {
                str3 = null;
            }
            if (str3 != null) {
                jSONObject.put("aigc_service_id", str3);
            }
        }
        java.util.List list = this.f256734e;
        if (list != null) {
            java.util.List list2 = list.isEmpty() ^ true ? list : null;
            if (list2 != null) {
                jSONObject.put("refer_url", new org.json.JSONArray((java.util.Collection) list2));
            }
        }
        eu0.o oVar = this.f256735f;
        if (oVar != null) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("finder_tab_context_id", oVar.f256727a);
            jSONObject2.put("finder_context_id", oVar.f256728b);
            jSONObject.put("rawInfos", jSONObject2);
        }
        return jSONObject;
    }

    public java.lang.String toString() {
        return "ReeditQueryParams: scene=" + this.f256730a + ", templateID=" + this.f256731b + ", aigcTaskID=" + this.f256732c + ", aigcServiceID=" + this.f256733d + ", referUrl=" + this.f256734e + ", rawInfos=" + this.f256735f;
    }
}
