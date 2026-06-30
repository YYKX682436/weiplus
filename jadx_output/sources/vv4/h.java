package vv4;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI f440467d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI mMFTSImageRecognitionUI) {
        super(0);
        this.f440467d = mMFTSImageRecognitionUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        org.json.JSONObject jSONObject;
        java.lang.String stringExtra = this.f440467d.getIntent().getStringExtra("extras");
        if (stringExtra == null) {
            stringExtra = "";
        }
        try {
            jSONObject = new org.json.JSONObject(stringExtra);
        } catch (org.json.JSONException unused) {
            jSONObject = new org.json.JSONObject();
        }
        return d75.b.e(jSONObject, vv4.g.f440465d);
    }
}
