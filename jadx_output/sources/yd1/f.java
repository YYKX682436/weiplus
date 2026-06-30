package yd1;

/* loaded from: classes7.dex */
public class f implements ta1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f460995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f460996b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f460997c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yd1.g f460998d;

    public f(yd1.g gVar, java.lang.String str, java.lang.String str2, int i17) {
        this.f460998d = gVar;
        this.f460995a = str;
        this.f460996b = str2;
        this.f460997c = i17;
    }

    @Override // ta1.t0
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        ta1.k0 k0Var = (ta1.k0) obj;
        yd1.g gVar = this.f460998d;
        try {
            if (i18 != 0) {
                gVar.f461000b.a(i17, i18, str, new org.json.JSONObject());
            } else {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, this.f460995a);
                jSONObject.put("thumbPath", this.f460996b);
                jSONObject.put("chosenId", this.f460997c);
                jSONObject.put("duration", k0Var.f416636a);
                jSONObject.put("size", k0Var.f416637b);
                gVar.f461000b.a(0, 0, "ok", jSONObject);
            }
        } catch (org.json.JSONException e17) {
            gVar.f461000b.a(1, -1, e17.getMessage(), new org.json.JSONObject());
        }
    }
}
