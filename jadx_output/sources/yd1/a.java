package yd1;

/* loaded from: classes7.dex */
public class a implements ta1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f460982a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f460983b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yd1.h f460984c;

    public a(yd1.h hVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17) {
        this.f460984c = hVar;
        this.f460982a = c0Var;
        this.f460983b = i17;
    }

    @Override // ta1.t0
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        yd1.h.H(this.f460984c, this.f460982a, i17, i18, str, jSONObject, jSONObject2);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameRecord.JsApiOpenVideoEditor", "editFormatResult result, %s", jSONObject2.toString());
        this.f460982a.a(this.f460983b, jSONObject2.toString());
    }
}
