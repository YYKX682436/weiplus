package l44;

/* loaded from: classes4.dex */
public final class e3 {

    /* renamed from: k, reason: collision with root package name */
    public static final l44.d3 f316108k = new l44.d3(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f316109a;

    /* renamed from: b, reason: collision with root package name */
    public final int f316110b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f316111c;

    /* renamed from: d, reason: collision with root package name */
    public final int f316112d;

    /* renamed from: e, reason: collision with root package name */
    public final int f316113e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f316114f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f316115g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f316116h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f316117i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f316118j;

    public e3(int i17, int i18, java.lang.String aId, int i19, int i27, java.lang.String snsId, java.lang.String traceId, java.lang.String tid, boolean z17, java.util.List subAdList, int i28, kotlin.jvm.internal.i iVar) {
        i17 = (i28 & 1) != 0 ? -1 : i17;
        i18 = (i28 & 2) != 0 ? 0 : i18;
        aId = (i28 & 4) != 0 ? "" : aId;
        i19 = (i28 & 8) != 0 ? 0 : i19;
        i27 = (i28 & 16) != 0 ? 0 : i27;
        snsId = (i28 & 32) != 0 ? "0" : snsId;
        traceId = (i28 & 64) != 0 ? "" : traceId;
        tid = (i28 & 128) != 0 ? "" : tid;
        z17 = (i28 & 256) != 0 ? false : z17;
        subAdList = (i28 & 512) != 0 ? new java.util.ArrayList() : subAdList;
        kotlin.jvm.internal.o.g(aId, "aId");
        kotlin.jvm.internal.o.g(snsId, "snsId");
        kotlin.jvm.internal.o.g(traceId, "traceId");
        kotlin.jvm.internal.o.g(tid, "tid");
        kotlin.jvm.internal.o.g(subAdList, "subAdList");
        this.f316109a = i17;
        this.f316110b = i18;
        this.f316111c = aId;
        this.f316112d = i19;
        this.f316113e = i27;
        this.f316114f = snsId;
        this.f316115g = traceId;
        this.f316116h = tid;
        this.f316117i = z17;
        this.f316118j = subAdList;
    }

    public final org.json.JSONObject a() {
        org.json.JSONObject jSONObject;
        java.util.List list = this.f316118j;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toJSON", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper$AdRecord");
        try {
            jSONObject = new org.json.JSONObject();
            jSONObject.putOpt("adPosAbs", java.lang.Integer.valueOf(this.f316109a));
            jSONObject.putOpt("adPosRelative", java.lang.Integer.valueOf(this.f316110b));
            jSONObject.putOpt("aid", this.f316111c);
            jSONObject.putOpt("createTime", java.lang.Integer.valueOf(this.f316112d));
            jSONObject.putOpt("exposeCnt", java.lang.Integer.valueOf(this.f316113e));
            jSONObject.putOpt("snsId", this.f316114f);
            jSONObject.putOpt("traceId", this.f316115g);
            jSONObject.putOpt("tid", this.f316116h);
            jSONObject.putOpt("isCollectedAd", java.lang.Boolean.valueOf(this.f316117i));
            if (!list.isEmpty()) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((s34.w1) it.next()).a());
                }
                jSONObject.putOpt("subAdList", jSONArray);
            }
        } catch (org.json.JSONException unused) {
            com.tencent.mars.xlog.Log.i("SnsAd.AdLocalRecordHelper", "there is exception when create json object when generate ad record json");
            jSONObject = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toJSON", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper$AdRecord");
        return jSONObject;
    }
}
