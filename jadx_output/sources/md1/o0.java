package md1;

/* loaded from: classes7.dex */
public class o0 implements z2.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f325773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f325774e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f325775f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ md1.q0 f325776g;

    public o0(md1.q0 q0Var, com.tencent.mm.plugin.appbrand.service.c0 c0Var, org.json.JSONObject jSONObject, int i17) {
        this.f325776g = q0Var;
        this.f325773d = c0Var;
        this.f325774e = jSONObject;
        this.f325775f = i17;
    }

    @Override // z2.f
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (i17 != 121) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "requestAudioPermission requestCode is not for open voice api");
            return;
        }
        md1.q0 q0Var = this.f325776g;
        int i18 = this.f325775f;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f325773d;
        if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "requestAudioPermission sys perm denied for open voice api");
            c0Var.a(i18, q0Var.o("fail:system permission denied"));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "requestAudioPermission permission is grant for open voice api");
            q0Var.A(c0Var, this.f325774e, i18);
        }
    }
}
