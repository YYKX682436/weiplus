package nq4;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static android.speech.tts.TextToSpeech f339010c;

    /* renamed from: f, reason: collision with root package name */
    public static yx3.e0 f339013f;

    /* renamed from: a, reason: collision with root package name */
    public static final nq4.e f339008a = new nq4.e();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f339009b = (lp0.b.X() + "app_ringtone") + '/';

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f339011d = true;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f339012e = new java.util.concurrent.atomic.AtomicBoolean(false);

    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPCallingTTSUtil", "destory tts player");
        android.speech.tts.TextToSpeech textToSpeech = f339010c;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        yx3.e0 e0Var = f339013f;
        if (e0Var != null) {
            m8.i0 i0Var = e0Var.f467902a;
            if (i0Var != null) {
                i0Var.n();
            }
            m8.i0 i0Var2 = e0Var.f467902a;
            if (i0Var2 != null) {
                i0Var2.release();
            }
        }
        f339013f = null;
        android.speech.tts.TextToSpeech textToSpeech2 = f339010c;
        if (textToSpeech2 != null) {
            textToSpeech2.shutdown();
        }
        f339010c = null;
    }

    public final java.lang.String b() {
        return com.tencent.mm.sdk.platformtools.m2.o(com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0), com.tencent.mm.sdk.platformtools.x2.f193071a);
    }

    public final void c(android.content.Context ctx, android.speech.tts.TextToSpeech.OnInitListener listener) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(listener, "listener");
        if (f339010c == null) {
            f339010c = new android.speech.tts.TextToSpeech(ctx.getApplicationContext(), listener);
        } else {
            listener.onInit(0);
        }
    }

    public final void d(java.lang.String id6, java.lang.String str, nq4.a aVar) {
        kotlin.jvm.internal.o.g(id6, "id");
        if (f339010c == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPCallingTTSUtil", "TextToSpeech object is null");
        }
        nq4.e eVar = f339008a;
        java.lang.String b17 = eVar.b();
        if (!java.lang.Boolean.valueOf(!(b17 == null || b17.length() == 0) && (kotlin.jvm.internal.o.b(b17, "zh_CN") || kotlin.jvm.internal.o.b(b17, "zh_TW") || kotlin.jvm.internal.o.b(b17, "zh_HK") || kotlin.jvm.internal.o.b(b17, "en"))).booleanValue() || f339010c == null) {
            java.lang.String b18 = b();
            nq4.f fVar = nq4.f.f339014a;
            nq4.f.f339019f = false;
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPCallingTTSUtil", "current language environment not support tts " + b18);
            a();
            if (aVar != null) {
                aVar.onDone();
                return;
            }
            return;
        }
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = f339012e;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        boolean z17 = f339011d;
        if (!z17 || f339010c == null || android.text.TextUtils.isEmpty(str)) {
            nq4.f fVar2 = nq4.f.f339014a;
            nq4.f.f339019f = false;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("not allow to play tts cause ");
            sb6.append(z17);
            sb6.append(" && ");
            sb6.append(f339010c);
            sb6.append(" != null && ");
            sb6.append(!android.text.TextUtils.isEmpty(str));
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPCallingTTSUtil", sb6.toString());
            a();
            if (aVar != null) {
                aVar.onDone();
                return;
            }
            return;
        }
        java.lang.String b19 = b();
        if (b19 == null) {
            b19 = "null";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPCallingTTSUtil", "Transfer " + str + " to TTS");
        java.lang.String str2 = f339009b + r26.i0.u(id6, '#', (char) 8205, false, 4, null) + '_' + b19 + ".wav";
        if (com.tencent.mm.vfs.w6.j(str2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPCallingTTSUtil", "start tts player");
            yx3.e0 e0Var = new yx3.e0();
            f339013f = e0Var;
            e0Var.a(com.tencent.mm.sdk.platformtools.x2.f193071a, str2, 0, new nq4.b(aVar, str2));
            return;
        }
        com.tencent.mm.vfs.w6.e(str2);
        android.speech.tts.TextToSpeech textToSpeech = f339010c;
        if (textToSpeech != null) {
            textToSpeech.setOnUtteranceProgressListener(new nq4.d(str2, aVar));
        }
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
        hashMap.put("utteranceId", "utterance");
        android.speech.tts.TextToSpeech textToSpeech2 = f339010c;
        if (textToSpeech2 != null) {
            textToSpeech2.setLanguage(com.tencent.mm.sdk.platformtools.m2.s(eVar.b()));
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPCallingTTSUtil", "tts set language: " + textToSpeech2.getLanguage());
            textToSpeech2.synthesizeToFile(str, hashMap, str2);
        }
    }
}
