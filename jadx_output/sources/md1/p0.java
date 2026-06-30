package md1;

/* loaded from: classes7.dex */
public class p0 implements z2.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f325779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f325780e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f325781f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ md1.q0 f325782g;

    public p0(md1.q0 q0Var, com.tencent.mm.plugin.appbrand.service.c0 c0Var, org.json.JSONObject jSONObject, int i17) {
        this.f325782g = q0Var;
        this.f325779d = c0Var;
        this.f325780e = jSONObject;
        this.f325781f = i17;
    }

    @Override // z2.f
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (i17 != 122) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "requestCameraPermission requestCode is not for open voice api");
            return;
        }
        md1.q0 q0Var = this.f325782g;
        int i18 = this.f325781f;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f325779d;
        if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "requestCameraPermission sys perm denied for open voice api");
            c0Var.a(i18, q0Var.o("fail:system permission denied"));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "requestCameraPermission permission is grant for open voice api");
            q0Var.A(c0Var, this.f325780e, i18);
        }
    }
}
