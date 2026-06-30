package l44;

/* loaded from: classes4.dex */
public final class c3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f316070a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f316071b;

    public c3(int i17, java.util.List records, int i18, int i19, kotlin.jvm.internal.i iVar) {
        i17 = (i19 & 1) != 0 ? 0 : i17;
        records = (i19 & 2) != 0 ? kz5.p0.f313996d : records;
        kotlin.jvm.internal.o.g(records, "records");
        this.f316070a = i17;
        this.f316071b = records;
    }

    public final org.json.JSONObject a() {
        org.json.JSONObject jSONObject;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toJSON", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper$AdLocalRecordConfig");
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = this.f316071b.iterator();
            while (it.hasNext()) {
                org.json.JSONObject a17 = ((l44.e3) it.next()).a();
                if (a17 != null) {
                    jSONArray.put(a17);
                }
            }
            jSONObject = new org.json.JSONObject();
            jSONObject.putOpt("records", jSONArray);
            jSONObject.putOpt("timeConfig", java.lang.String.valueOf(this.f316070a));
        } catch (org.json.JSONException unused) {
            com.tencent.mars.xlog.Log.i("SnsAd.AdLocalRecordHelper", "there is exception when create json object when generate ad record json array");
            jSONObject = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toJSON", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper$AdLocalRecordConfig");
        return jSONObject;
    }
}
