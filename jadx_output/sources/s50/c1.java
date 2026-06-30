package s50;

/* loaded from: classes12.dex */
public final class c1 implements k23.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s50.l1 f403037a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f403038b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k23.v0 f403039c;

    public c1(s50.l1 l1Var, java.lang.ref.WeakReference weakReference, k23.v0 v0Var) {
        this.f403037a = l1Var;
        this.f403038b = weakReference;
        this.f403039c = v0Var;
    }

    @Override // k23.v2
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", "ModeSwitchVoice onStartPress");
    }

    @Override // k23.v2
    public void b(java.lang.String result, java.lang.String voiceID) {
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(voiceID, "voiceID");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", "ModeSwitchVoice onResult: ".concat(result));
        java.lang.ref.WeakReference weakReference = this.f403038b;
        s50.l1 l1Var = this.f403037a;
        l1Var.getClass();
        try {
            l1Var.f403085i = s50.x0.f403144n;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, result);
            if (voiceID.length() > 0) {
                jSONObject.put("voiceid", voiceID);
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("status", "onsearch");
            jSONObject2.put("extinfo", jSONObject);
            jSONObject2.put("from", "bottom");
            jSONObject2.put("sceneFrom", 3);
            l1Var.cj(weakReference, jSONObject2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceInputSearchFromBottom, error: " + e17);
        }
        k23.v0 v0Var = this.f403039c;
        v0Var.w(8, "", result);
        v0Var.w(9, "", result);
    }

    @Override // k23.v2
    public void onCancel() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", "ModeSwitchVoice onCancel");
        java.lang.ref.WeakReference weakReference = this.f403038b;
        s50.l1 l1Var = this.f403037a;
        l1Var.getClass();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("status", "oncancel");
            jSONObject.put("from", "bottom");
            l1Var.cj(weakReference, jSONObject);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceInputCancelFromBottom, error: " + e17);
        }
    }
}
