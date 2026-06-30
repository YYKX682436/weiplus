package lo1;

/* loaded from: classes5.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final lo1.b f320094d = new lo1.b();

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ro1.v vVar = ro1.v.f398014a;
        java.util.List b17 = vVar.b();
        java.util.List a17 = vVar.a();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(a17, 10));
        java.util.Iterator it = ((java.util.ArrayList) a17).iterator();
        while (it.hasNext()) {
            po1.d dVar = (po1.d) it.next();
            org.json.JSONObject put = new org.json.JSONObject().put("deviceId", dVar.f357295a).put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, dVar.f357299e).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, dVar.f357297c).put("remark", dVar.f357298d);
            java.util.ArrayList arrayList2 = (java.util.ArrayList) b17;
            if (!arrayList2.isEmpty()) {
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    if (kotlin.jvm.internal.o.b(((po1.d) it6.next()).f357300f, dVar.f357300f)) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            arrayList.add(put.put("connection", z17));
        }
        jSONObject.put("devices", new org.json.JSONArray((java.util.Collection) arrayList));
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.RoamJsApiEvent", "post event:portableDict, data:" + jSONObject);
        jSONObject.put("notify_type", "portableDict");
        ((xc1.t) ((ft.q4) i95.n0.c(ft.q4.class))).Ai("wxd930c3b7cf7c92e6", jSONObject.toString());
    }
}
