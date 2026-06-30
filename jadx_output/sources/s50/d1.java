package s50;

/* loaded from: classes12.dex */
public final class d1 implements z21.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s50.l1 f403043a;

    public d1(s50.l1 l1Var) {
        this.f403043a = l1Var;
    }

    @Override // z21.b
    public void a(java.lang.String[] strArr, java.util.List list) {
        kotlin.jvm.internal.o.f(java.util.Arrays.toString(strArr), "toString(...)");
        java.util.Objects.toString(list);
        boolean z17 = true;
        if (strArr != null) {
            if (!(strArr.length == 0)) {
                z17 = false;
            }
        }
        if (z17) {
            return;
        }
        java.lang.String str = strArr[0];
        s50.l1 l1Var = this.f403043a;
        if (str != null) {
            java.lang.ref.WeakReference weakReference = l1Var.f403081e;
            try {
                if (!l1Var.f403086m.equals(str)) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, str);
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("status", "ondata");
                    jSONObject2.put("extinfo", jSONObject);
                    l1Var.bj(weakReference, jSONObject2);
                    l1Var.f403086m = str;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceInputData, error: " + e17);
            }
        }
        l1Var.f403089p.removeMessages(101);
        l1Var.f403089p.sendEmptyMessageDelayed(101, 3000L);
    }

    @Override // z21.b
    public void b(java.util.List list) {
        java.util.Objects.toString(list);
    }

    @Override // z21.b
    public void c() {
    }

    @Override // z21.b
    public void d(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", "onRecognizeFinish");
        s50.l1 l1Var = this.f403043a;
        java.lang.ref.WeakReference weakReference = l1Var.f403081e;
        l1Var.getClass();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("status", "onend");
            l1Var.bj(weakReference, jSONObject);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceInputEnd, error: " + e17);
        }
        l1Var.Bi();
    }

    @Override // z21.b
    public void e(int i17, int i18, int i19, long j17) {
        com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.VoiceSearchService", "onError, errType: " + i18 + ", errCode: " + i19 + ", localCode: " + i17 + ", voiceid: " + j17);
        s50.l1 l1Var = this.f403043a;
        l1Var.Zi(l1Var.f403081e, s50.w0.f403132h, "voice input errno: " + i18 + ", " + i19 + ", " + i17 + ", " + j17);
    }

    @Override // z21.b
    public void f(java.lang.String str, boolean z17) {
    }

    @Override // z21.b
    public void g() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", "onRecordFin");
    }
}
