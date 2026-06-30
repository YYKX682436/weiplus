package wf4;

/* loaded from: classes12.dex */
public class g extends com.tencent.mm.sdk.event.n implements com.tencent.mm.modelbase.u0 {
    public static com.tencent.mm.storage.kb D;
    public int A;
    public long B;
    public boolean C;

    /* renamed from: d, reason: collision with root package name */
    public ig4.a f445672d;

    /* renamed from: e, reason: collision with root package name */
    public ig4.c f445673e;

    /* renamed from: f, reason: collision with root package name */
    public ig4.b f445674f;

    /* renamed from: g, reason: collision with root package name */
    public w21.w0 f445675g;

    /* renamed from: h, reason: collision with root package name */
    public int f445676h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f445677i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f445678m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f445679n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f445680o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.autogen.events.ExtTranslateVoiceEvent f445681p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f445682q;

    /* renamed from: r, reason: collision with root package name */
    public int f445683r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Map f445684s;

    /* renamed from: t, reason: collision with root package name */
    public int f445685t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f445686u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f445687v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f445688w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f445689x;

    /* renamed from: y, reason: collision with root package name */
    public long f445690y;

    /* renamed from: z, reason: collision with root package name */
    public int f445691z;

    public g() {
        super(0);
        this.f445677i = false;
        this.f445678m = false;
        this.f445679n = false;
        this.f445684s = new java.util.HashMap();
        this.f445689x = true;
        this.f445690y = 0L;
        this.C = false;
    }

    public final void b() {
        if (this.f445689x) {
            this.f445689x = false;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            this.f445690y = currentTimeMillis;
            this.f445691z = (int) (currentTimeMillis - this.B);
        }
    }

    public final void c(java.lang.String str, wf4.f fVar, r45.pv pvVar) {
        int i17;
        int i18;
        int i19;
        com.tencent.mars.xlog.Log.i("ExtTranslateVoiceEventListener", "finishWithResult mstate:%s", fVar);
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f445680o;
        if (b4Var != null) {
            b4Var.d();
        }
        if (!wf4.k.b()) {
            c01.d9.e().q(546, this);
            c01.d9.e().q(547, this);
            c01.d9.e().q(548, this);
        }
        com.tencent.mm.autogen.events.ExtTranslateVoiceEvent extTranslateVoiceEvent = this.f445681p;
        wf4.f fVar2 = wf4.f.LOCAL_ERROR;
        wf4.f fVar3 = wf4.f.SERVER_ERROR;
        wf4.f fVar4 = wf4.f.CANCEL;
        wf4.f fVar5 = wf4.f.FINISH;
        int i27 = 2;
        if (extTranslateVoiceEvent != null) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                ((java.util.HashMap) this.f445684s).put(this.f445681p.f54213g.f8177a, str);
                com.tencent.mm.storage.kb kbVar = D;
                if ((kbVar == null || com.tencent.mm.sdk.platformtools.t8.K0(kbVar.field_content)) && this.f445681p.f54213g.f8180d == 1) {
                    com.tencent.mm.storage.lb Ai = w21.p0.Ai();
                    am.v8 v8Var = this.f445681p.f54213g;
                    com.tencent.mars.xlog.Log.i("ExtTranslateVoiceEventListener", "createVoiceTT localId(%s) , fileName(%s).", v8Var.f8178b, v8Var.f8177a);
                    com.tencent.mm.storage.kb kbVar2 = new com.tencent.mm.storage.kb();
                    kbVar2.field_msgId = java.lang.Long.valueOf(this.f445681p.f54213g.f8178b).longValue();
                    java.lang.String str2 = this.f445681p.f54213g.f8177a;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                        kbVar2.field_cmsgId = str2;
                    }
                    kbVar2.field_content = str;
                    Ai.getClass();
                    Ai.f195098d.m("VoiceTransText", "msgId", kbVar2.convertTo());
                    if (this.f445688w != null) {
                        com.tencent.mm.autogen.events.VoiceTransTextCompletedEvent voiceTransTextCompletedEvent = new com.tencent.mm.autogen.events.VoiceTransTextCompletedEvent();
                        voiceTransTextCompletedEvent.f54940g.f7954a = java.lang.Long.valueOf(this.f445681p.f54213g.f8178b).longValue();
                        voiceTransTextCompletedEvent.f54940g.f7955b = this.f445688w.Q0();
                        am.t00 t00Var = voiceTransTextCompletedEvent.f54940g;
                        t00Var.f7956c = str;
                        t00Var.f7957d = this.f445688w.getCreateTime();
                        voiceTransTextCompletedEvent.f54940g.f7958e = this.f445688w.A0();
                        voiceTransTextCompletedEvent.e();
                    }
                }
            } else if (fVar == fVar5) {
                com.tencent.mars.xlog.Log.i("ExtTranslateVoiceEventListener", "finishWithResult State.FINISH id:%s", this.f445681p.f54213g.f8178b);
                this.f445681p.f54214h.f8270c = 2;
            }
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent extTranslateVoiceEvent2 = this.f445681p;
            am.w8 w8Var = extTranslateVoiceEvent2.f54214h;
            w8Var.f8269b = true;
            w8Var.f8268a = str;
            if (fVar == fVar4) {
                w8Var.f8270c = 1;
            } else if (fVar == fVar2 || fVar == fVar3) {
                w8Var.f8270c = 2;
            }
            w8Var.f8271d = pvVar;
            java.lang.Runnable runnable = extTranslateVoiceEvent2.f54213g.f8181e;
            if (runnable != null) {
                runnable.run();
            }
        }
        if (this.C && this.f445675g != null) {
            int length = str != null ? str.length() : 0;
            if (fVar != fVar5) {
                this.f445691z = 0;
                this.A = 0;
                if (fVar == fVar4) {
                    i27 = 5;
                } else {
                    if (fVar != fVar3) {
                        if (fVar == fVar2) {
                            i27 = 4;
                        } else if (fVar != wf4.f.NETWORK_OVERTIME) {
                            i17 = 0;
                            i18 = 0;
                        }
                    }
                    i19 = 3;
                    i18 = i19;
                    i17 = 0;
                }
                i19 = i27;
                i18 = i19;
                i17 = 0;
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                this.f445691z = 0;
                this.A = 0;
                i19 = 3;
                i18 = i19;
                i17 = 0;
            } else {
                i17 = length;
                i18 = 1;
            }
            com.tencent.mars.xlog.Log.i("ExtTranslateVoiceEventListener", "transformTextResult voiceId: %s, wordCount: %d, waitTime: %d, animationTime: %d, transformResult: %d", this.f445675g.f442487d, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f445691z), java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(i18));
            if (i18 != 0) {
                w21.w0 w0Var = this.f445675g;
                cg4.k.a(w0Var.f442487d, i17, this.f445691z, this.A, i18, w0Var.f442495l);
            }
        }
        this.f445672d = null;
        this.f445673e = null;
        this.f445674f = null;
        this.f445681p = null;
        this.f445688w = null;
        this.f445682q = false;
        this.f445678m = false;
        this.f445677i = false;
        this.f445679n = false;
        this.f445683r = 20;
        D = null;
        this.f445689x = true;
        this.f445690y = 0L;
        this.B = 0L;
        this.f445691z = 0;
        this.A = 0;
        this.C = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x02a5, code lost:
    
        if (r2 == null) goto L81;
     */
    @Override // com.tencent.mm.sdk.event.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean callback(com.tencent.mm.sdk.event.IEvent r19) {
        /*
            Method dump skipped, instructions count: 717
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wf4.g.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }

    public final void f(wf4.f fVar, r45.pv pvVar) {
        w21.j jVar;
        java.lang.String str;
        java.lang.String str2;
        boolean z17;
        boolean z18;
        switch (fVar.ordinal()) {
            case 0:
                com.tencent.mars.xlog.Log.i("ExtTranslateVoiceEventListener", "net check");
                if (wf4.k.b()) {
                    com.tencent.mars.xlog.Log.i("ExtTranslateVoiceEventListener", "use ilink CheckVoiceRecognizeRequest");
                    java.lang.String voiceId = this.f445675g.f442487d;
                    wf4.b bVar = new wf4.b(this);
                    kotlin.jvm.internal.o.g(voiceId, "voiceId");
                    com.tencent.mars.xlog.Log.i("ExtTranslateVoiceEventListenerKtHelper", "doCheckVoiceRecognizeRequest voiceId:" + voiceId + ", scene:39");
                    r45.y20 y20Var = new r45.y20();
                    y20Var.set(0, voiceId);
                    y20Var.set(1, 39);
                    com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                    lVar.f70667d = 11348;
                    lVar.f70666c = "/cgi-bin/micromsg-bin/chat_voice_recognize_check";
                    lVar.f70664a = y20Var;
                    lVar.f70665b = new r45.z20();
                    com.tencent.mm.modelbase.o a17 = lVar.a();
                    com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
                    iVar.p(a17);
                    iVar.l().q(new wf4.h(bVar));
                } else {
                    long j17 = this.f445675g.f442488e;
                    if (j17 > 0) {
                        com.tencent.mars.xlog.Log.i("ExtTranslateVoiceEventListener", "has msg svr id: %d", java.lang.Long.valueOf(j17));
                        w21.w0 w0Var = this.f445675g;
                        this.f445672d = new ig4.a(w0Var.f442487d, w0Var.f442491h, this.f445676h, w0Var.f442488e, w0Var.f442485b, this.f445685t, this.f445686u, this.f445687v);
                    } else {
                        com.tencent.mars.xlog.Log.i("ExtTranslateVoiceEventListener", "not existex msg svr id: %d", java.lang.Long.valueOf(j17));
                        w21.w0 w0Var2 = this.f445675g;
                        this.f445672d = new ig4.a(w0Var2.f442487d, w0Var2.f442491h, w0Var2.f442485b, this.f445685t, this.f445686u, this.f445687v);
                    }
                    c01.d9.e().g(this.f445672d);
                    com.tencent.mm.modelbase.r1 e17 = c01.d9.e();
                    this.f445672d.getClass();
                    e17.a(546, this);
                }
                this.B = java.lang.System.currentTimeMillis();
                return;
            case 1:
                com.tencent.mars.xlog.Log.i("ExtTranslateVoiceEventListener", "net upload");
                if (!wf4.k.b()) {
                    ig4.a aVar = this.f445672d;
                    if (aVar == null) {
                        com.tencent.mars.xlog.Log.w("ExtTranslateVoiceEventListener", "request upload must after check!");
                        return;
                    }
                    w21.w0 w0Var3 = this.f445675g;
                    this.f445673e = new ig4.c(w0Var3.f442487d, aVar.f291446r, this.f445676h, w0Var3.f442485b, this.f445685t, this.f445686u, this.f445687v, w0Var3.f442496m, w0Var3.f442507x);
                    c01.d9.e().g(this.f445673e);
                    com.tencent.mm.modelbase.r1 e18 = c01.d9.e();
                    this.f445673e.getClass();
                    e18.a(547, this);
                    return;
                }
                com.tencent.mars.xlog.Log.i("ExtTranslateVoiceEventListener", "use ilink VoiceInputController to upload voice");
                w21.w0 w0Var4 = this.f445675g;
                java.lang.String voiceId2 = w0Var4.f442487d;
                java.lang.String fileName = w0Var4.f442485b;
                com.tencent.mm.storage.f9 f9Var = this.f445688w;
                java.lang.String str3 = w0Var4.f442507x;
                int i17 = this.f445676h;
                wf4.c cVar = new wf4.c(this);
                kotlin.jvm.internal.o.g(voiceId2, "voiceId");
                kotlin.jvm.internal.o.g(fileName, "fileName");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doUploadVoiceByVoiceInputController voiceId:");
                sb6.append(voiceId2);
                sb6.append(", fileName:");
                sb6.append(fileName);
                sb6.append(", chatUsername:");
                sb6.append(str3);
                sb6.append(", voiceFormat:");
                sb6.append(i17);
                sb6.append(", msgInfo is null:");
                sb6.append(f9Var == null);
                com.tencent.mars.xlog.Log.i("ExtTranslateVoiceEventListenerKtHelper", sb6.toString());
                if (f9Var != null) {
                    str = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).yj(f9Var, fileName, false);
                    com.tencent.mars.xlog.Log.i("ExtTranslateVoiceEventListenerKtHelper", "doUploadVoiceByVoiceInputController fullPath:".concat(str));
                    z17 = false;
                    str2 = "ExtTranslateVoiceEventListenerKtHelper";
                } else {
                    com.tencent.mars.xlog.Log.i("ExtTranslateVoiceEventListenerKtHelper", "doUploadVoiceByVoiceInputController msgInfo is null, fallback to IFileOperator");
                    try {
                        jVar = ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Bi(null, fileName);
                    } catch (java.lang.Exception e19) {
                        com.tencent.mars.xlog.Log.e("ExtTranslateVoiceEventListenerKtHelper", "doUploadVoiceByVoiceInputController getFileOp failed", e19);
                        jVar = null;
                    }
                    if (jVar == null) {
                        com.tencent.mars.xlog.Log.e("ExtTranslateVoiceEventListenerKtHelper", "doUploadVoiceByVoiceInputController fileOperator is null!");
                        cVar.d(0, 0, "fileOperator is null");
                        return;
                    }
                    int d17 = w21.v0.d(null, fileName);
                    if (d17 <= 0) {
                        com.tencent.mars.xlog.Log.e("ExtTranslateVoiceEventListenerKtHelper", "doUploadVoiceByVoiceInputController totalLen <= 0");
                        jVar.b();
                        cVar.d(0, 0, "voice file is empty");
                        return;
                    }
                    w21.t d18 = jVar.d(0, d17);
                    jVar.b();
                    if (d18 == null || d18.f442467d != 0 || d18.f442464a == null || d18.f442465b <= 0) {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("doUploadVoiceByVoiceInputController read voice data failed, ret:");
                        sb7.append(d18 != null ? java.lang.Integer.valueOf(d18.f442467d) : null);
                        com.tencent.mars.xlog.Log.e("ExtTranslateVoiceEventListenerKtHelper", sb7.toString());
                        cVar.d(0, 0, "read voice data failed");
                        return;
                    }
                    com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
                    str = lp0.b.h0("voice_trans_upload") + "/voice_raw_" + java.lang.System.currentTimeMillis();
                    com.tencent.mm.vfs.w6.S(str, d18.f442464a, 0, d18.f442465b);
                    str2 = "ExtTranslateVoiceEventListenerKtHelper";
                    com.tencent.mars.xlog.Log.i(str2, "doUploadVoiceByVoiceInputController IFileOperator wrote raw file:" + str + ", len:" + d18.f442465b);
                    z17 = true;
                }
                int k17 = (int) com.tencent.mm.vfs.w6.k(str);
                if (k17 <= 0) {
                    com.tencent.mars.xlog.Log.e(str2, "doUploadVoiceByVoiceInputController fileLength <= 0, rawFilePath:" + str);
                    wf4.k.a(z17, str);
                    cVar.d(0, 0, "voice file is empty");
                    return;
                }
                if (w21.v0.h(str, 0, true) && k17 > 1) {
                    com.tencent.mm.vfs.r7 r7Var2 = com.tencent.mm.vfs.q7.f213141a;
                    java.lang.String str4 = lp0.b.h0("voice_trans_upload") + "/silk_trimmed_" + java.lang.System.currentTimeMillis();
                    byte[] N = com.tencent.mm.vfs.w6.N(str, 1, k17 - 1);
                    wf4.k.a(z17, str);
                    if (N != null) {
                        if (!(N.length == 0)) {
                            com.tencent.mm.vfs.w6.S(str4, N, 0, N.length);
                            k17 = N.length;
                            com.tencent.mars.xlog.Log.i(str2, "doUploadVoiceByVoiceInputController silk format, skip first byte, uploadPath:" + str4 + ", fileLength:" + k17);
                            str = str4;
                            z17 = true;
                        }
                    }
                    com.tencent.mars.xlog.Log.e(str2, "doUploadVoiceByVoiceInputController read silk data failed");
                    cVar.d(0, 0, "read silk data failed");
                    return;
                }
                try {
                    e70.a0 wi6 = ((i70.g) ((e70.b0) i95.n0.c(e70.b0.class))).wi(true);
                    z21.a0 a0Var = new z21.a0(java.lang.String.valueOf(java.lang.System.nanoTime() & io.flutter.embedding.android.KeyboardMap.kValueMask));
                    a0Var.b(voiceId2);
                    z21.j0 j0Var = new z21.j0(null, new wf4.j(new kotlin.jvm.internal.h0(), z17, str, cVar), str, a0Var, wi6, 39, 0);
                    if (i17 != 0) {
                        z18 = true;
                        if (i17 == 1) {
                            j0Var.i(0);
                            com.tencent.mars.xlog.Log.i(str2, "doUploadVoiceByVoiceInputController set encodeType to SPEEX");
                        }
                    } else {
                        z18 = true;
                        j0Var.i(1);
                        com.tencent.mars.xlog.Log.i(str2, "doUploadVoiceByVoiceInputController set encodeType to AMR");
                    }
                    j0Var.f469639v = java.lang.System.currentTimeMillis();
                    j0Var.f469633p = z18;
                    j0Var.f469640w = z18;
                    j0Var.f469641x = str3;
                    j0Var.b(k17);
                    if (j0Var.e()) {
                        j0Var.k();
                        return;
                    }
                    com.tencent.mars.xlog.Log.e(str2, "doUploadVoiceByVoiceInputController preDoScene failed");
                    wf4.k.a(z17, str);
                    cVar.d(0, 0, "preDoScene failed");
                    return;
                } catch (java.lang.Exception unused) {
                    com.tencent.mars.xlog.Log.e(str2, "doUploadVoiceByVoiceInputController createStreamController failed");
                    wf4.k.a(z17, str);
                    cVar.d(0, 0, "createStreamController failed");
                    return;
                }
            case 2:
                com.tencent.mars.xlog.Log.i("ExtTranslateVoiceEventListener", "net upload more");
                ig4.c cVar2 = this.f445673e;
                if (cVar2 == null) {
                    com.tencent.mars.xlog.Log.w("ExtTranslateVoiceEventListener", "upload more need has upload netScene!");
                    return;
                }
                this.f445673e = new ig4.c(cVar2);
                c01.d9.e().g(this.f445673e);
                com.tencent.mm.modelbase.r1 e27 = c01.d9.e();
                this.f445673e.getClass();
                e27.a(547, this);
                return;
            case 3:
                if (this.f445677i) {
                    com.tencent.mars.xlog.Log.i("ExtTranslateVoiceEventListener", "pulling so pass");
                    return;
                }
                com.tencent.mars.xlog.Log.i("ExtTranslateVoiceEventListener", "net get");
                this.f445677i = true;
                if (!wf4.k.b()) {
                    if (this.f445672d == null) {
                        com.tencent.mars.xlog.Log.w("ExtTranslateVoiceEventListener", "request get must after check!");
                        return;
                    }
                    this.f445674f = new ig4.b(this.f445675g.f442487d);
                    c01.d9.e().g(this.f445674f);
                    com.tencent.mm.modelbase.r1 e28 = c01.d9.e();
                    this.f445674f.getClass();
                    e28.a(548, this);
                    return;
                }
                com.tencent.mars.xlog.Log.i("ExtTranslateVoiceEventListener", "use ilink VoiceInputController to poll voice trans result");
                w21.w0 w0Var5 = this.f445675g;
                java.lang.String voiceId3 = w0Var5.f442487d;
                java.lang.String str5 = w0Var5.f442507x;
                int i18 = this.f445676h;
                wf4.d dVar = new wf4.d(this);
                kotlin.jvm.internal.o.g(voiceId3, "voiceId");
                com.tencent.mars.xlog.Log.i("ExtTranslateVoiceEventListenerKtHelper", "doGetVoiceTransResultByVoiceInputController voiceId:" + voiceId3 + ", chatUsername:" + str5 + ", voiceFormat:" + i18);
                try {
                    e70.a0 wi7 = ((i70.g) ((e70.b0) i95.n0.c(e70.b0.class))).wi(true);
                    z21.a0 a0Var2 = new z21.a0(java.lang.String.valueOf(io.flutter.embedding.android.KeyboardMap.kValueMask & java.lang.System.nanoTime()));
                    a0Var2.b(voiceId3);
                    z21.j0 j0Var2 = new z21.j0(null, new wf4.i(new kotlin.jvm.internal.h0(), dVar), "", a0Var2, wi7, 39, 0);
                    if (i18 == 0) {
                        j0Var2.i(1);
                        com.tencent.mars.xlog.Log.i("ExtTranslateVoiceEventListenerKtHelper", "doGetVoiceTransResultByVoiceInputController set encodeType to AMR");
                    } else if (i18 == 1) {
                        j0Var2.i(0);
                        com.tencent.mars.xlog.Log.i("ExtTranslateVoiceEventListenerKtHelper", "doGetVoiceTransResultByVoiceInputController set encodeType to SPEEX");
                    }
                    j0Var2.f469639v = java.lang.System.currentTimeMillis();
                    j0Var2.f469633p = true;
                    j0Var2.f469640w = true;
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputController", "setSendEmpty voiceId:".concat(voiceId3));
                    j0Var2.f469635r = voiceId3;
                    j0Var2.f469634q = true;
                    j0Var2.f469641x = str5;
                    j0Var2.k();
                    return;
                } catch (java.lang.Exception unused2) {
                    com.tencent.mars.xlog.Log.e("ExtTranslateVoiceEventListenerKtHelper", "doGetVoiceTransResultByVoiceInputController createStreamController failed");
                    dVar.d(0, 0, "createStreamController failed");
                    return;
                }
            case 4:
                this.f445678m = true;
                return;
            case 5:
            case 7:
            default:
                return;
            case 6:
                if (wf4.k.b()) {
                    this.f445679n = true;
                } else {
                    c01.d9.e().d(this.f445672d);
                    c01.d9.e().d(this.f445673e);
                    c01.d9.e().d(this.f445674f);
                }
                if (this.f445682q) {
                    this.C = true;
                }
                c(null, wf4.f.CANCEL, null);
                return;
            case 8:
            case 9:
                this.C = true;
                c(null, fVar, pvVar);
                return;
            case 10:
                this.C = true;
                c(null, fVar, null);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e1  */
    @Override // com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r8, int r9, java.lang.String r10, com.tencent.mm.modelbase.m1 r11) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wf4.g.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
