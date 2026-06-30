package z43;

/* loaded from: classes8.dex */
public class b0 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f470106a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z43.a0 f470107b;

    public b0(z43.a0 a0Var, org.json.JSONObject jSONObject) {
        this.f470107b = a0Var;
        this.f470106a = jSONObject;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("LiteAppJsApiOpenGameUrlWithExtraWebView", "openLiteApp failed");
        this.f470107b.A(this.f470106a);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("LiteAppJsApiOpenGameUrlWithExtraWebView", "openLiteApp success");
        this.f470107b.f143443f.d(false);
    }
}
