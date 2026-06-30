package yd1;

/* loaded from: classes7.dex */
public class c implements ta1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yd1.d f460988a;

    public c(yd1.d dVar) {
        this.f460988a = dVar;
    }

    @Override // ta1.t0
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        yd1.d dVar = this.f460988a;
        yd1.h.H(dVar.f460992d, dVar.f460989a, i17, i18, str, jSONObject, jSONObject2);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameRecord.JsApiOpenVideoEditor", "editFormatResult result, %s", jSONObject2.toString());
        dVar.f460989a.a(dVar.f460990b, jSONObject2.toString());
    }
}
