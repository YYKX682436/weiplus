package s50;

/* loaded from: classes12.dex */
public final class b1 implements k23.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s50.l1 f403035a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f403036b;

    public b1(s50.l1 l1Var, java.lang.ref.WeakReference weakReference) {
        this.f403035a = l1Var;
        this.f403036b = weakReference;
    }

    @Override // k23.k1
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", "ModeSwitchListener onKeyboardClick");
        java.lang.ref.WeakReference weakReference = this.f403036b;
        s50.l1 l1Var = this.f403035a;
        l1Var.getClass();
        try {
            l1Var.f403085i = s50.x0.f403144n;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("status", "onBottomToggleKeyboard");
            jSONObject.put("from", "bottom");
            l1Var.cj(weakReference, jSONObject);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceBottomToggleKeyboard, error: " + e17);
        }
    }

    @Override // k23.d1
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", "ModeSwitchListener onMoveToRecognize");
    }

    @Override // k23.d1
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", "ModeSwitchListener onTouchDown");
        java.lang.ref.WeakReference weakReference = this.f403036b;
        s50.l1 l1Var = this.f403035a;
        l1Var.getClass();
        try {
            l1Var.f403085i = s50.x0.f403144n;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("status", "onstart");
            jSONObject.put("from", "bottom");
            l1Var.cj(weakReference, jSONObject);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceInputStartFromBottom, error: " + e17);
        }
    }

    @Override // k23.k1
    public void d(k23.f0 newMode) {
        kotlin.jvm.internal.o.g(newMode, "newMode");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", "ModeSwitchListener onModeSwitch: " + newMode);
        java.lang.ref.WeakReference weakReference = this.f403036b;
        s50.l1 l1Var = this.f403035a;
        l1Var.getClass();
        try {
            l1Var.f403085i = s50.x0.f403144n;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("modeType", newMode.f303568d);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("status", "onmodeswitch");
            jSONObject2.put("extinfo", jSONObject);
            jSONObject2.put("from", "bottom");
            l1Var.cj(weakReference, jSONObject2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceModeSwitch, error: " + e17);
        }
    }

    @Override // k23.d1
    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", "ModeSwitchListener onMoveUpwardToCancel");
    }

    @Override // k23.k1
    public void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", "ModeSwitchListener onUploadClick");
        java.lang.ref.WeakReference weakReference = this.f403036b;
        s50.l1 l1Var = this.f403035a;
        l1Var.getClass();
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceUploadClick");
            l1Var.f403085i = s50.x0.f403144n;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("status", "onclickupload");
            jSONObject.put("from", "bottom");
            l1Var.cj(weakReference, jSONObject);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceUploadClick, error: " + e17);
        }
    }

    @Override // k23.d1
    public void g(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", "ModeSwitchListener onTouchUp: isCanceling=" + z17);
        if (z17) {
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f403036b;
        s50.l1 l1Var = this.f403035a;
        l1Var.getClass();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("status", "onstop");
            jSONObject.put("from", "bottom");
            l1Var.cj(weakReference, jSONObject);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceInputStopFromBottom, error: " + e17);
        }
    }
}
