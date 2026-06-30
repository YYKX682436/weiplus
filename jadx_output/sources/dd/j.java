package dd;

/* loaded from: classes9.dex */
public final class j implements q80.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f228881a;

    public j(yz5.p pVar) {
        this.f228881a = pVar;
    }

    @Override // q80.x
    public final void onActivityResult(int i17, int i18, android.content.Intent intent) {
        yz5.p pVar = this.f228881a;
        if (i17 == 1 && i18 == -1) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
                java.util.List f07 = stringExtra != null ? r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null) : null;
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                if (f07 != null) {
                    java.util.Iterator it = f07.iterator();
                    while (it.hasNext()) {
                        jSONArray.put((java.lang.String) it.next());
                    }
                }
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, jSONArray);
                pVar.invoke(dd.d.f228871a.i(jSONObject, ""), java.lang.Boolean.FALSE);
            } catch (org.json.JSONException unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MultiSelectContactImpl", "select callback json error");
                pVar.invoke(dd.c.g(dd.d.f228871a, null, null, 3, null), java.lang.Boolean.FALSE);
            }
        }
    }
}
