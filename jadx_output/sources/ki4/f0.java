package ki4;

/* loaded from: classes.dex */
public final class f0 implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f308130d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f308131e;

    public f0(java.util.List list, java.lang.String str) {
        this.f308130d = list;
        this.f308131e = str;
    }

    @Override // l81.p0
    public final java.lang.String a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        boolean z17 = true;
        java.util.List list = this.f308130d;
        if (list != null && (!list.isEmpty())) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put((java.lang.String) it.next());
            }
            jSONObject.put("enc_usernames", jSONArray);
        }
        jSONObject.put("isprerender", true);
        java.lang.String str = this.f308131e;
        if (str != null && !r26.n0.N(str)) {
            z17 = false;
        }
        if (!z17) {
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, str);
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }
}
