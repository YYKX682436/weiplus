package kh2;

/* loaded from: classes10.dex */
public final class l implements jh2.c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f308004a = "KTVSongTMEScoreCore_" + hashCode();

    /* renamed from: b, reason: collision with root package name */
    public jh2.a f308005b;

    /* renamed from: c, reason: collision with root package name */
    public lh2.a f308006c;

    /* renamed from: d, reason: collision with root package name */
    public lh2.a f308007d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f308008e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f308009f;

    /* renamed from: g, reason: collision with root package name */
    public my5.a f308010g;

    /* renamed from: h, reason: collision with root package name */
    public long f308011h;

    /* renamed from: i, reason: collision with root package name */
    public long f308012i;

    /* renamed from: j, reason: collision with root package name */
    public long f308013j;

    /* renamed from: k, reason: collision with root package name */
    public long f308014k;

    /* renamed from: l, reason: collision with root package name */
    public om2.u f308015l;

    /* renamed from: m, reason: collision with root package name */
    public long f308016m;

    /* renamed from: n, reason: collision with root package name */
    public long f308017n;

    /* renamed from: o, reason: collision with root package name */
    public long f308018o;

    /* renamed from: p, reason: collision with root package name */
    public int f308019p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f308020q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f308021r;

    public l() {
        kh2.h hVar = new kh2.h(this);
        oy5.e eVar = com.tme.karaoke.lib_singscore.ScorerNativeBridge.Companion;
        eVar.getClass();
        com.tme.karaoke.lib_singscore.ScorerNativeBridge.log = null;
        eVar.getClass();
        com.tme.karaoke.lib_singscore.ScorerNativeBridge.log = hVar;
        this.f308020q = jz5.h.b(kh2.e.f307997d);
        this.f308021r = jz5.h.b(new kh2.g(this));
    }

    @Override // jh2.c
    public void a(om2.u songData) {
        kotlin.jvm.internal.o.g(songData, "songData");
        this.f308015l = songData;
        om2.p pVar = songData.f346384b;
        this.f308016m = pVar.f346371e * 1000;
        com.tencent.mars.xlog.Log.i(this.f308004a, "init songDuraion: " + this.f308016m);
        this.f308010g = pVar.f346368b.f346391c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("origin_");
        java.lang.String str = songData.f346383a;
        sb6.append(str);
        sb6.append(".pcm");
        this.f308006c = new lh2.a(sb6.toString());
        this.f308007d = new lh2.a("score_" + str + ".pcm");
    }

    @Override // jh2.c
    public void b(long j17, long j18) {
        com.tencent.mars.xlog.Log.i(this.f308004a, "updateValidTimeRange: " + j17 + '-' + j18);
        if (j17 < 0 || j18 <= 0 || j17 > j18) {
            return;
        }
        this.f308017n = j17;
        this.f308018o = j18;
    }

    @Override // jh2.c
    public void c(long j17) {
        com.tencent.mars.xlog.Log.i(this.f308004a, "updateCustomVoiceEndTime: " + j17);
        if (j17 <= 0) {
            return;
        }
        this.f308013j = j17;
        k();
    }

    @Override // jh2.c
    public void d(double d17) {
        boolean z17;
        com.tencent.mars.xlog.Log.i(this.f308004a, "setReduceRatio: " + d17);
        oy5.h hVar = (oy5.h) i();
        hVar.getClass();
        com.tme.karaoke.lib_singscore.ScorerNativeBridge.Companion.getClass();
        z17 = com.tme.karaoke.lib_singscore.ScorerNativeBridge.loadRet;
        if (z17) {
            hVar.f350114c.setReduceRatio(d17);
        }
    }

    @Override // jh2.c
    public void e(jh2.a aVar) {
        this.f308005b = aVar;
    }

    @Override // jh2.c
    public void f(yz5.l lVar) {
        boolean z17;
        android.os.Handler handler;
        om2.u uVar = this.f308015l;
        if (uVar != null) {
            h(uVar, null, "getNote");
        }
        oy5.c i17 = i();
        kh2.d dVar = new kh2.d(lVar, this);
        final oy5.h hVar = (oy5.h) i17;
        hVar.getClass();
        hVar.f350120i = dVar;
        com.tme.karaoke.lib_singscore.ScorerNativeBridge.Companion.getClass();
        z17 = com.tme.karaoke.lib_singscore.ScorerNativeBridge.loadRet;
        if (z17 && (handler = hVar.f350117f) != null) {
            handler.post(new java.lang.Runnable() { // from class: oy5.h$$e
                @Override // java.lang.Runnable
                public final void run() {
                    oy5.h this$0 = oy5.h.this;
                    kotlin.jvm.internal.o.g(this$0, "this$0");
                    com.tme.karaoke.lib_singscore.NoteItem[] allGrove = this$0.f350114c.getAllGrove();
                    com.tme.karaoke.lib_singscore.IAllGroveCallback iAllGroveCallback = this$0.f350120i;
                    if (iAllGroveCallback != null) {
                        iAllGroveCallback.allGrove(allGrove);
                    }
                }
            });
        }
    }

    @Override // jh2.c
    public void g(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame audioFrame, long j17, boolean z17) {
        byte[] copyOf;
        boolean z18;
        android.os.Handler handler;
        boolean z19;
        int i17;
        boolean z27;
        boolean z28;
        android.os.Handler handler2;
        android.os.Handler handler3;
        kotlin.jvm.internal.o.g(audioFrame, "audioFrame");
        if (!this.f308009f) {
            om2.u uVar = this.f308015l;
            my5.a aVar = this.f308010g;
            if (uVar != null && aVar != null) {
                this.f308012i = 0L;
                this.f308014k = 0L;
                java.util.ArrayList mSentences = aVar.f332852a;
                kotlin.jvm.internal.o.f(mSentences, "mSentences");
                my5.c cVar = (my5.c) kz5.n0.k0(mSentences);
                if (cVar != null) {
                    this.f308012i = cVar.f332858b + cVar.f332859c + 200;
                    k();
                }
                oy5.b bVar = (oy5.b) ((jz5.n) this.f308020q).getValue();
                final int i18 = audioFrame.sampleRate;
                final int i19 = audioFrame.channel;
                final oy5.g gVar = (oy5.g) bVar;
                gVar.getClass();
                com.tme.karaoke.lib_singscore.PitchNativeBridge.Companion.getClass();
                z19 = com.tme.karaoke.lib_singscore.PitchNativeBridge.loadRet;
                if (z19) {
                    android.os.HandlerThread handlerThread = gVar.f350096b;
                    if (handlerThread == null) {
                        handlerThread = new android.os.HandlerThread(gVar.f350098d);
                    }
                    gVar.f350100f = handlerThread;
                    handlerThread.start();
                    gVar.f350099e = new android.os.Handler(handlerThread.getLooper());
                    final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
                    android.os.Handler handler4 = gVar.f350099e;
                    if (handler4 == null) {
                        kotlin.jvm.internal.o.o("pitchHandler");
                        throw null;
                    }
                    handler4.post(new java.lang.Runnable() { // from class: oy5.g$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            oy5.g this$0 = oy5.g.this;
                            int i27 = i18;
                            int i28 = i19;
                            java.util.concurrent.CountDownLatch countDownLatch2 = countDownLatch;
                            kotlin.jvm.internal.o.g(this$0, "this$0");
                            kotlin.jvm.internal.o.g(countDownLatch2, "$countDownLatch");
                            this$0.f350101g = this$0.f350097c.init(i27, i28, false);
                            countDownLatch2.countDown();
                        }
                    });
                    countDownLatch.await(1000L, java.util.concurrent.TimeUnit.MILLISECONDS);
                    if (gVar.f350101g < 0) {
                        gVar.a();
                    }
                    yz5.l lVar = gVar.f350095a;
                    if (lVar != null) {
                        lVar.invoke(kz5.c1.k(new jz5.l(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, java.lang.String.valueOf(gVar.f350101g)), new jz5.l("type", ya.b.SCORE)));
                    }
                    i17 = gVar.f350101g;
                } else {
                    i17 = -1000;
                }
                int h17 = h(uVar, audioFrame, "sing");
                com.tencent.mars.xlog.Log.i(this.f308004a, "init pitchRes res = " + i17 + " initScoreResult: " + h17);
                oy5.c i27 = i();
                kh2.a aVar2 = new kh2.a(this, uVar);
                final oy5.h hVar = (oy5.h) i27;
                hVar.getClass();
                hVar.f350119h = aVar2;
                com.tme.karaoke.lib_singscore.ScorerNativeBridge.Companion.getClass();
                z27 = com.tme.karaoke.lib_singscore.ScorerNativeBridge.loadRet;
                if (z27 && (handler3 = hVar.f350117f) != null) {
                    handler3.post(new java.lang.Runnable() { // from class: oy5.h$$c
                        @Override // java.lang.Runnable
                        public final void run() {
                            oy5.h this$0 = oy5.h.this;
                            kotlin.jvm.internal.o.g(this$0, "this$0");
                            this$0.f350114c.setScoreUpdateCallback(new oy5.j(this$0));
                        }
                    });
                }
                oy5.c i28 = i();
                kh2.b bVar2 = new kh2.b(this, uVar);
                final oy5.h hVar2 = (oy5.h) i28;
                hVar2.getClass();
                hVar2.f350121j = bVar2;
                z28 = com.tme.karaoke.lib_singscore.ScorerNativeBridge.loadRet;
                if (z28 && (handler2 = hVar2.f350117f) != null) {
                    handler2.post(new java.lang.Runnable() { // from class: oy5.h$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            oy5.h this$0 = oy5.h.this;
                            kotlin.jvm.internal.o.g(this$0, "this$0");
                            this$0.f350114c.setGroveAndHitCallback(new oy5.i(this$0));
                        }
                    });
                }
                jh2.a aVar3 = this.f308005b;
                if (aVar3 != null) {
                    aVar3.R0(uVar.f346383a, aVar.f332852a.size());
                }
                if (h17 == 0 && i17 == 0) {
                    this.f308009f = true;
                    jh2.a aVar4 = this.f308005b;
                    if (aVar4 != null) {
                        aVar4.e4(uVar.f346383a);
                    }
                } else {
                    this.f308009f = false;
                    jh2.a aVar5 = this.f308005b;
                    if (aVar5 != null) {
                        aVar5.e6(uVar.f346383a, new jh2.d(jh2.e.f299812d, h17, "scoreRes = " + h17 + " , pitchRes = " + i17, audioFrame.sampleRate, audioFrame.channel));
                    }
                }
            }
        }
        if (this.f308009f) {
            byte[] data = audioFrame.data;
            if (z17) {
                copyOf = new byte[data.length];
            } else {
                kotlin.jvm.internal.o.f(data, "data");
                copyOf = java.util.Arrays.copyOf(data, data.length);
                kotlin.jvm.internal.o.f(copyOf, "copyOf(...)");
            }
            final byte[] bArr = copyOf;
            lh2.a aVar6 = this.f308006c;
            if (aVar6 != null) {
                aVar6.b(bArr, bArr.length);
            }
            oy5.b bVar3 = (oy5.b) ((jz5.n) this.f308020q).getValue();
            final int length = bArr.length;
            final float f17 = (float) j17;
            final kh2.k kVar = new kh2.k(this);
            final oy5.g gVar2 = (oy5.g) bVar3;
            gVar2.getClass();
            com.tme.karaoke.lib_singscore.PitchNativeBridge.Companion.getClass();
            z18 = com.tme.karaoke.lib_singscore.PitchNativeBridge.loadRet;
            if (z18 && (handler = gVar2.f350099e) != null) {
                handler.post(new java.lang.Runnable() { // from class: oy5.g$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        oy5.g this$0 = oy5.g.this;
                        kotlin.jvm.internal.o.g(this$0, "this$0");
                        byte[] buffer = bArr;
                        kotlin.jvm.internal.o.g(buffer, "$buffer");
                        yz5.r callback = kVar;
                        kotlin.jvm.internal.o.g(callback, "$callback");
                        com.tme.karaoke.lib_singscore.PitchNativeBridge pitchNativeBridge = this$0.f350097c;
                        int i29 = length;
                        float f18 = f17;
                        pitchNativeBridge.process(buffer, i29, f18);
                        callback.C(buffer, java.lang.Integer.valueOf(i29), java.lang.Float.valueOf(f18), pitchNativeBridge.getPitchArray());
                    }
                });
            }
            long j18 = this.f308011h;
            if (1 <= j18 && j18 < j17) {
                com.tencent.mars.xlog.Log.i(this.f308004a, "notifyVoiceEnd voiceEndTime: " + this.f308011h + " songTimeStamp: " + j17 + " isFrameInit: " + this.f308009f);
                this.f308011h = 0L;
                com.tencent.mars.xlog.Log.i(this.f308004a, "notifyVoiceEnd");
                pm0.v.X(new kh2.j(this));
            }
            long j19 = this.f308014k;
            if (1 <= j19 && j19 < j17) {
                com.tencent.mars.xlog.Log.i(this.f308004a, "notifyFinishSing voiceEndTime: " + this.f308011h + " songFinishTime: " + this.f308014k + " songTimeStamp: " + j17 + " isFrameInit: " + this.f308009f);
                this.f308014k = 0L;
                com.tencent.mars.xlog.Log.i(this.f308004a, "notifyFinishSing");
                pm0.v.X(new kh2.i(this));
            }
        }
    }

    public final int h(om2.u uVar, com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame, java.lang.String str) {
        boolean z17;
        int i17;
        boolean z18;
        boolean z19;
        com.tencent.mm.protobuf.g gVar;
        int[] a17;
        com.tencent.mm.protobuf.g gVar2;
        byte[] bArr;
        com.tencent.mm.protobuf.g gVar3;
        oy5.c i18 = i();
        final com.tme.karaoke.lib_singscore.ScoreInfo scoreInfo = new com.tme.karaoke.lib_singscore.ScoreInfo(tRTCAudioFrame != null ? tRTCAudioFrame.sampleRate : 48000, tRTCAudioFrame != null ? tRTCAudioFrame.channel : 2, 2);
        final com.tme.karaoke.lib_singscore.ScoreOption scoreOption = new com.tme.karaoke.lib_singscore.ScoreOption(true, true, false);
        om2.w wVar = uVar.f346384b.f346370d;
        byte[] bArr2 = (wVar == null || (gVar3 = wVar.f346387c) == null) ? null : gVar3.f192156a;
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        my5.a aVar = this.f308010g;
        int[] a18 = aVar != null ? aVar.a() : null;
        if (a18 == null) {
            a18 = new int[0];
        }
        final com.tme.karaoke.lib_singscore.ScoreConfig scoreConfig = new com.tme.karaoke.lib_singscore.ScoreConfig(bArr2, a18, null, null);
        final oy5.h hVar = (oy5.h) i18;
        hVar.getClass();
        com.tme.karaoke.lib_singscore.ScorerNativeBridge.Companion.getClass();
        z17 = com.tme.karaoke.lib_singscore.ScorerNativeBridge.loadRet;
        if (z17) {
            android.os.HandlerThread handlerThread = hVar.f350113b;
            if (handlerThread == null) {
                handlerThread = new android.os.HandlerThread(hVar.f350115d);
            }
            hVar.f350116e = handlerThread;
            handlerThread.start();
            hVar.f350117f = new android.os.Handler(handlerThread.getLooper());
            hVar.f350118g = 0;
            final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            android.os.Handler handler = hVar.f350117f;
            if (handler == null) {
                kotlin.jvm.internal.o.o("scoreHandler");
                throw null;
            }
            handler.post(new java.lang.Runnable() { // from class: oy5.h$$b
                @Override // java.lang.Runnable
                public final void run() {
                    oy5.h this$0 = oy5.h.this;
                    com.tme.karaoke.lib_singscore.ScoreInfo info = scoreInfo;
                    com.tme.karaoke.lib_singscore.ScoreOption option = scoreOption;
                    com.tme.karaoke.lib_singscore.ScoreConfig config = scoreConfig;
                    java.util.concurrent.CountDownLatch countDownLatch2 = countDownLatch;
                    kotlin.jvm.internal.o.g(this$0, "this$0");
                    kotlin.jvm.internal.o.g(info, "$info");
                    kotlin.jvm.internal.o.g(option, "$option");
                    kotlin.jvm.internal.o.g(config, "$config");
                    kotlin.jvm.internal.o.g(countDownLatch2, "$countDownLatch");
                    this$0.f350118g = this$0.f350114c.init(info, option, config);
                    countDownLatch2.countDown();
                }
            });
            countDownLatch.await(1000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            if (hVar.f350118g < 0) {
                android.os.Handler handler2 = hVar.f350117f;
                if (handler2 == null) {
                    kotlin.jvm.internal.o.o("scoreHandler");
                    throw null;
                }
                handler2.post(new oy5.h$$f(hVar));
                android.os.HandlerThread handlerThread2 = hVar.f350116e;
                if (handlerThread2 != null) {
                    handlerThread2.quit();
                }
            }
            yz5.l lVar = hVar.f350112a;
            if (lVar != null) {
                lVar.invoke(kz5.b1.e(new jz5.l(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, java.lang.String.valueOf(hVar.f350118g))));
            }
            i17 = hVar.f350118g;
        } else {
            i17 = -1000;
        }
        int i19 = i17;
        this.f308008e = true;
        java.lang.String str2 = this.f308004a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init iScore res = ");
        sb6.append(i19);
        sb6.append(" noteSize: ");
        om2.w wVar2 = uVar.f346384b.f346370d;
        sb6.append((wVar2 == null || (gVar2 = wVar2.f346387c) == null || (bArr = gVar2.f192156a) == null) ? null : java.lang.Integer.valueOf(bArr.length));
        sb6.append(" lyricSize: ");
        my5.a aVar2 = this.f308010g;
        sb6.append((aVar2 == null || (a17 = aVar2.a()) == null) ? null : java.lang.Integer.valueOf(a17.length));
        sb6.append(" sampleRate: ");
        sb6.append(tRTCAudioFrame != null ? java.lang.Integer.valueOf(tRTCAudioFrame.sampleRate) : null);
        sb6.append(" channel: ");
        sb6.append(tRTCAudioFrame != null ? java.lang.Integer.valueOf(tRTCAudioFrame.sampleRate) : null);
        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
        if (i19 != 0) {
            om2.w wVar3 = uVar.f346384b.f346370d;
            byte[] bArr3 = (wVar3 == null || (gVar = wVar3.f346387c) == null) ? null : gVar.f192156a;
            if (bArr3 == null) {
                bArr3 = new byte[0];
            }
            int length = bArr3.length;
            int i27 = 0;
            while (true) {
                if (i27 >= length) {
                    z18 = true;
                    break;
                }
                if (bArr3[i27] != 0) {
                    z18 = false;
                    break;
                }
                i27++;
            }
            my5.a aVar3 = this.f308010g;
            int[] a19 = aVar3 != null ? aVar3.a() : null;
            if (a19 == null) {
                a19 = new int[0];
            }
            int length2 = a19.length;
            int i28 = 0;
            while (true) {
                if (i28 >= length2) {
                    z19 = true;
                    break;
                }
                if (a19[i28] != 0) {
                    z19 = false;
                    break;
                }
                i28++;
            }
            pm0.z.b(xy2.b.f458155b, "tmeScoreInitError", false, null, null, false, false, new kh2.c(i19, z18, z19, uVar, tRTCAudioFrame, str), 60, null);
        }
        return i19;
    }

    public final oy5.c i() {
        return (oy5.c) this.f308021r.getValue();
    }

    @Override // jh2.c
    public void j() {
        java.io.OutputStream outputStream;
        java.io.OutputStream outputStream2;
        if (this.f308009f) {
            ((oy5.g) ((oy5.b) ((jz5.n) this.f308020q).getValue())).a();
        }
        if (this.f308008e) {
            oy5.h hVar = (oy5.h) i();
            android.os.Handler handler = hVar.f350117f;
            if (handler == null) {
                kotlin.jvm.internal.o.o("scoreHandler");
                throw null;
            }
            handler.post(new oy5.h$$f(hVar));
            android.os.HandlerThread handlerThread = hVar.f350116e;
            if (handlerThread != null) {
                handlerThread.quit();
            }
        }
        this.f308009f = false;
        this.f308005b = null;
        this.f308011h = 0L;
        this.f308013j = 0L;
        this.f308012i = 0L;
        this.f308017n = 0L;
        this.f308018o = 0L;
        this.f308019p = 0;
        lh2.a aVar = this.f308006c;
        if (aVar != null && (outputStream2 = aVar.f318660b) != null) {
            outputStream2.close();
        }
        lh2.a aVar2 = this.f308007d;
        if (aVar2 != null && (outputStream = aVar2.f318660b) != null) {
            outputStream.close();
        }
        com.tme.karaoke.lib_singscore.ScorerNativeBridge.Companion.getClass();
        com.tme.karaoke.lib_singscore.ScorerNativeBridge.log = null;
        com.tencent.mars.xlog.Log.i(this.f308004a, "unInit");
    }

    public final void k() {
        long max;
        long j17;
        long j18 = this.f308013j;
        if (j18 > 0) {
            long j19 = this.f308012i;
            if (j19 > 0) {
                j18 = java.lang.Math.min(j18, j19);
                this.f308011h = j18;
                max = java.lang.Math.max(j18, 0L);
                this.f308011h = max;
                j17 = this.f308016m;
                if (j17 > 0 || 6000 + max <= j17) {
                    j17 = max + androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS;
                }
                this.f308014k = j17;
                com.tencent.mars.xlog.Log.i(this.f308004a, "voiceEndTime: " + this.f308011h + " customVoiceEndTime: " + this.f308013j + " lastSentenceEndTime: " + this.f308012i + " singFinishTime: " + this.f308014k + " songDuraion: " + this.f308016m);
            }
        }
        long j27 = this.f308012i;
        if (j27 > 0) {
            j18 = j27;
        }
        this.f308011h = j18;
        max = java.lang.Math.max(j18, 0L);
        this.f308011h = max;
        j17 = this.f308016m;
        if (j17 > 0) {
        }
        j17 = max + androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS;
        this.f308014k = j17;
        com.tencent.mars.xlog.Log.i(this.f308004a, "voiceEndTime: " + this.f308011h + " customVoiceEndTime: " + this.f308013j + " lastSentenceEndTime: " + this.f308012i + " singFinishTime: " + this.f308014k + " songDuraion: " + this.f308016m);
    }

    @Override // jh2.c
    public void setKeyShift(int i17) {
        boolean z17;
        oy5.h hVar = (oy5.h) i();
        hVar.getClass();
        com.tme.karaoke.lib_singscore.ScorerNativeBridge.Companion.getClass();
        z17 = com.tme.karaoke.lib_singscore.ScorerNativeBridge.loadRet;
        if (z17) {
            hVar.f350114c.setKeyShift(i17);
        }
    }
}
