package yd1;

/* loaded from: classes7.dex */
public class e implements ta1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yd1.j f460993a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ta1.t0 f460994b;

    public e(yd1.h hVar, yd1.j jVar, ta1.t0 t0Var) {
        this.f460993a = jVar;
        this.f460994b = t0Var;
    }

    @Override // ta1.t0
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        yd1.j jVar = this.f460993a;
        if (i18 == 0) {
            try {
                jSONObject.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, jVar.f461003a);
                jSONObject.put("wxaFilePath", jVar.f461004b);
            } catch (org.json.JSONException e17) {
                str = e17.getMessage();
                i17 = 1;
                i18 = -1;
            }
        }
        this.f460994b.a(i17, i18, str, jSONObject);
    }
}
