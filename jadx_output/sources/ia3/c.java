package ia3;

/* loaded from: classes15.dex */
public class c implements z21.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f289994a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ia3.d f289995b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f289996c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ia3.e f289997d;

    public c(ia3.e eVar, int i17, ia3.d dVar, boolean z17) {
        this.f289997d = eVar;
        this.f289994a = i17;
        this.f289995b = dVar;
        this.f289996c = z17;
    }

    @Override // z21.b
    public void a(java.lang.String[] strArr, java.util.List list) {
        ia3.e eVar = this.f289997d;
        int i17 = eVar.f290018e;
        int i18 = this.f289994a;
        if (i18 != i17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVoiceHelper", "onRes: stale callback (gen:%d != current:%d), ignore", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(eVar.f290018e));
            return;
        }
        ia3.d dVar = eVar.f290015b;
        ia3.d dVar2 = this.f289995b;
        if (dVar != dVar2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVoiceHelper", "onRes: session already removed, ignore callback");
            return;
        }
        if (strArr == null || strArr.length <= 0 || android.text.TextUtils.isEmpty(strArr[0])) {
            return;
        }
        eVar.f290017d = true;
        java.lang.String str = strArr[0];
        if ((str == null || !str.equals(dVar2.f290011n)) && !dVar2.f290012o) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVoiceHelper", "onResult text:%s", str);
            dVar2.f290011n = str;
            dVar2.d(str, false);
        }
    }

    @Override // z21.b
    public void b(java.util.List list) {
        if (this.f289994a != this.f289997d.f290018e) {
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(list != null ? list.size() : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVoiceHelper", "onKeywordRes: %d keywords", objArr);
    }

    @Override // z21.b
    public void c() {
        if (this.f289994a != this.f289997d.f290018e) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVoiceHelper", "onRecordStart");
        boolean z17 = this.f289996c;
        ia3.d dVar = this.f289995b;
        if (!z17) {
            long j17 = dVar.f290007j;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVoiceHelper", "onStart callbackId:%d", java.lang.Long.valueOf(j17));
            if (j17 != 0) {
                dVar.a(j17, new org.json.JSONObject().toString(), true);
            }
        }
        dVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVoiceHelper", "onSpeechStart");
        long j18 = dVar.f290004g;
        if (j18 != 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVoiceHelper", "onSpeechStart callbackId:%d", java.lang.Long.valueOf(j18));
            dVar.a(j18, jSONObject.toString(), true);
        }
    }

    @Override // z21.b
    public void d(int i17) {
        ia3.e eVar = this.f289997d;
        if (this.f289994a != eVar.f290018e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVoiceHelper", "onRecognizeFinish: stale callback, ignore");
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        ia3.d dVar = this.f289995b;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVoiceHelper", "onRecognizeFinish: %d, continuous: %b", valueOf, java.lang.Boolean.valueOf(dVar.f290009l));
        if (eVar.f290014a == null) {
            return;
        }
        if (eVar.f290017d) {
            eVar.f290017d = false;
            dVar.c();
        }
        if (!dVar.f290009l) {
            dVar.b();
            eVar.f290015b = null;
            return;
        }
        z21.e eVar2 = eVar.f290014a;
        if (eVar2 != null) {
            eVar2.cancel(false);
            eVar.f290014a.stop(false);
            eVar.f290014a = null;
        }
        eVar.f290016c.postDelayed(new ia3.b(this), 100L);
    }

    @Override // z21.b
    public void e(int i17, int i18, int i19, long j17) {
        if (this.f289994a != this.f289997d.f290018e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVoiceHelper", "onError: stale callback, ignore");
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppVoiceHelper", "onError localCode:%d, errType:%d, errCode:%d, voiceid:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(j17));
        ia3.d dVar = this.f289995b;
        dVar.getClass();
        com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppVoiceHelper", "onError localCode:%d, errType:%d, errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        long j18 = dVar.f290006i;
        if (j18 != 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errCode", i17);
                jSONObject.put("errMsg", "Voice recognition error: " + i17);
            } catch (java.lang.Exception unused) {
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVoiceHelper", "onError callbackId:%d, error:%s", java.lang.Long.valueOf(j18), jSONObject.toString());
            dVar.a(j18, jSONObject.toString(), true);
        }
    }

    @Override // z21.b
    public void f(java.lang.String str, boolean z17) {
        if (this.f289994a != this.f289997d.f290018e) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVoiceHelper", "onFullReplaceText: %s %b", str, java.lang.Boolean.valueOf(z17));
    }

    @Override // z21.b
    public void g() {
        if (this.f289994a != this.f289997d.f290018e) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVoiceHelper", "onRecordFin");
    }
}
