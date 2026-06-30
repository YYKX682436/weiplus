package ry5;

/* loaded from: classes13.dex */
public final /* synthetic */ class c$$d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry5.c f401721d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f401722e;

    public /* synthetic */ c$$d(ry5.c cVar, java.lang.String str) {
        this.f401721d = cVar;
        this.f401722e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        java.lang.String str = this.f401722e;
        ry5.c cVar = this.f401721d;
        cVar.getClass();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            i17 = jSONObject.getInt("action");
            try {
                jSONObject.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            } catch (org.json.JSONException unused) {
            }
        } catch (org.json.JSONException unused2) {
            i17 = -1;
        }
        if (i17 == 1) {
            cVar.e();
            cVar.c();
            if (a.b.c().f48e != null) {
                com.tencent.mm.sdk.platformtools.o4.M("mmkv_id_amoeba_default").putString("sentinel_main_start", cVar.f401703a);
                return;
            }
            return;
        }
        if (i17 == 2) {
            cVar.e();
            return;
        }
        if (i17 == 5) {
            return;
        }
        if (i17 == 6) {
            cVar.c();
            return;
        }
        xy5.b.a("enricwu.SentinelService", "unknow action : " + i17);
    }
}
