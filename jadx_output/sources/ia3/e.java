package ia3;

/* loaded from: classes15.dex */
public class e {

    /* renamed from: f, reason: collision with root package name */
    public static volatile ia3.e f290013f;

    /* renamed from: a, reason: collision with root package name */
    public z21.e f290014a;

    /* renamed from: b, reason: collision with root package name */
    public ia3.d f290015b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f290017d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f290018e = 0;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Handler f290016c = new android.os.Handler(android.os.Looper.getMainLooper());

    public static ia3.e c() {
        if (f290013f == null) {
            synchronized (ia3.e.class) {
                if (f290013f == null) {
                    f290013f = new ia3.e();
                }
            }
        }
        return f290013f;
    }

    public final void a(int i17, java.lang.String str, com.tencent.mm.plugin.lite.LiteAppCenter.NativeCallback nativeCallback) {
        if (nativeCallback == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errCode", i17);
            jSONObject.put("errMsg", str);
        } catch (java.lang.Exception unused) {
        }
        nativeCallback.onCallback(jSONObject.toString());
    }

    public final void b(long j17, java.lang.String str, long j18, java.lang.String str2, boolean z17, int i17, com.tencent.mm.plugin.lite.LiteAppCenter.NativeCallback nativeCallback) {
        ia3.e eVar;
        com.tencent.mm.plugin.lite.LiteAppCenter.NativeCallback nativeCallback2;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            try {
                ia3.d dVar = new ia3.d(this, j17, str, j18, z17, i17, jSONObject.optLong("onResult", 0L), jSONObject.optLong("onSpeechStart", 0L), jSONObject.optLong("onSpeechEnd", 0L), jSONObject.optLong("onError", 0L), jSONObject.optLong("onVolumeChange", 0L), jSONObject.optLong("onStart", 0L), jSONObject.optLong("onEnd", 0L), jSONObject.optBoolean("continuous", false), jSONObject.optBoolean("interimResults", true), jSONObject.optString("lang", "zh_CN"));
                eVar = this;
                try {
                    eVar.f290015b = dVar;
                    eVar.d(dVar, i17, false);
                    nativeCallback2 = nativeCallback;
                } catch (java.lang.Exception e17) {
                    e = e17;
                    nativeCallback2 = nativeCallback;
                    com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppVoiceHelper", "doStartSpeechRecognition error: %s", e.toString());
                    eVar.a(21401005, "startSpeechRecognition:fail " + e.getMessage(), nativeCallback2);
                }
                try {
                    eVar.a(0, "startSpeechRecognition:ok", nativeCallback2);
                } catch (java.lang.Exception e18) {
                    e = e18;
                    com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppVoiceHelper", "doStartSpeechRecognition error: %s", e.toString());
                    eVar.a(21401005, "startSpeechRecognition:fail " + e.getMessage(), nativeCallback2);
                }
            } catch (java.lang.Exception e19) {
                e = e19;
                eVar = this;
            }
        } catch (java.lang.Exception e27) {
            e = e27;
            eVar = this;
            nativeCallback2 = nativeCallback;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(ia3.d r7, int r8, boolean r9) {
        /*
            r6 = this;
            java.lang.String r0 = r7.f290010m
            r1 = 1
            if (r0 != 0) goto L8
        L5:
            r3 = r1
            goto L68
        L8:
            int r2 = r0.hashCode()
            r3 = 2
            r4 = 4
            r5 = -1
            switch(r2) {
                case 3241: goto L59;
                case 96598594: goto L4e;
                case 96646644: goto L43;
                case 115813378: goto L37;
                case 115813762: goto L2b;
                case 115861428: goto L1f;
                case 115861812: goto L13;
                default: goto L12;
            }
        L12:
            goto L63
        L13:
            java.lang.String r2 = "zh_TW"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L1d
            goto L63
        L1d:
            r5 = 6
            goto L63
        L1f:
            java.lang.String r2 = "zh_HK"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L29
            goto L63
        L29:
            r5 = 5
            goto L63
        L2b:
            java.lang.String r2 = "zh-TW"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L35
            goto L63
        L35:
            r5 = r4
            goto L63
        L37:
            java.lang.String r2 = "zh-HK"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L41
            goto L63
        L41:
            r5 = 3
            goto L63
        L43:
            java.lang.String r2 = "en_US"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L4c
            goto L63
        L4c:
            r5 = r3
            goto L63
        L4e:
            java.lang.String r2 = "en-US"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L57
            goto L63
        L57:
            r5 = r1
            goto L63
        L59:
            java.lang.String r2 = "en"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L62
            goto L63
        L62:
            r5 = 0
        L63:
            switch(r5) {
                case 0: goto L67;
                case 1: goto L67;
                case 2: goto L67;
                case 3: goto L68;
                case 4: goto L68;
                case 5: goto L68;
                case 6: goto L68;
                default: goto L66;
            }
        L66:
            goto L5
        L67:
            r3 = r4
        L68:
            int r0 = r6.f290018e
            int r0 = r0 + r1
            r6.f290018e = r0
            boolean r1 = com.tencent.mm.sdk.platformtools.x2.n()
            java.lang.Class<y90.i> r2 = y90.i.class
            if (r1 == 0) goto L86
            i95.m r1 = i95.n0.c(r2)
            y90.i r1 = (y90.i) r1
            x90.o r1 = (x90.o) r1
            r1.getClass()
            z21.w r1 = new z21.w
            r1.<init>()
            goto L95
        L86:
            i95.m r1 = i95.n0.c(r2)
            y90.i r1 = (y90.i) r1
            x90.o r1 = (x90.o) r1
            r1.getClass()
            com.tencent.mm.modelvoiceaddr.SceneVoiceInputAddrProxy r1 = com.tencent.mm.modelvoiceaddr.SceneVoiceInputAddrProxy.getInstance()
        L95:
            r6.f290014a = r1
            ia3.c r2 = new ia3.c
            r2.<init>(r6, r0, r7, r9)
            r1.init(r3, r8, r2)
            z21.e r7 = r6.f290014a
            r7.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ia3.e.d(ia3.d, int, boolean):void");
    }

    public void e(long j17, com.tencent.mm.plugin.lite.LiteAppCenter.NativeCallback nativeCallback) {
        z21.e eVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVoiceHelper", "stopSpeechRecognition appUuid:%d", java.lang.Long.valueOf(j17));
        try {
            ia3.d dVar = this.f290015b;
            if (dVar == null || dVar.f289998a != j17 || (eVar = this.f290014a) == null) {
                a(0, "stopSpeechRecognition:ok not detecting", nativeCallback);
            } else {
                this.f290018e++;
                eVar.cancel(true);
                this.f290015b.c();
                this.f290015b.b();
                this.f290014a.stop(true);
                this.f290014a = null;
                this.f290015b = null;
                a(0, "stopSpeechRecognition:ok", nativeCallback);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppVoiceHelper", "stopSpeechRecognition error: %s", e17.toString());
            a(-1, "stopSpeechRecognition:fail " + e17.getMessage(), nativeCallback);
        }
    }
}
