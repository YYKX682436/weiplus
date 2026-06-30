package vv4;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI f440520d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI mMFTSImageRecognitionUI) {
        super(0);
        this.f440520d = mMFTSImageRecognitionUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        org.json.JSONObject jSONObject;
        java.lang.String stringExtra = this.f440520d.getIntent().getStringExtra("reuse_image_info");
        if (stringExtra == null) {
            stringExtra = "";
        }
        try {
            jSONObject = new org.json.JSONObject(stringExtra);
        } catch (org.json.JSONException unused) {
            jSONObject = new org.json.JSONObject();
        }
        return d75.b.e(jSONObject, vv4.x.f440518d);
    }
}
