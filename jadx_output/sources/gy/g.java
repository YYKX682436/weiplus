package gy;

/* loaded from: classes14.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public android.media.AudioRecord f277480a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f277481b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.concurrent.Future f277482c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f277483d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f277484e;

    /* renamed from: f, reason: collision with root package name */
    public final java.nio.ByteBuffer f277485f;

    /* renamed from: g, reason: collision with root package name */
    public final java.nio.ByteBuffer f277486g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f277487h;

    /* renamed from: i, reason: collision with root package name */
    public final gy.j f277488i;

    /* renamed from: j, reason: collision with root package name */
    public final android.media.AudioManager f277489j;

    /* renamed from: k, reason: collision with root package name */
    public android.media.AudioFocusRequest f277490k;

    /* renamed from: l, reason: collision with root package name */
    public final android.media.AudioManager.OnAudioFocusChangeListener f277491l;

    public g(android.content.Context appContext) {
        kotlin.jvm.internal.o.g(appContext, "appContext");
        this.f277481b = ((ku5.t0) ku5.t0.f312615d).p("ChatBot.SMCAudioManager");
        this.f277484e = new java.util.concurrent.locks.ReentrantLock();
        this.f277485f = java.nio.ByteBuffer.allocateDirect(640);
        this.f277486g = java.nio.ByteBuffer.allocateDirect(640);
        this.f277488i = new gy.j(new gy.e(this));
        java.lang.Object systemService = appContext.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.f277489j = (android.media.AudioManager) systemService;
        this.f277491l = gy.d.f277477d;
    }

    public static final int b(gy.g gVar, java.nio.ByteBuffer pcmData, int i17) {
        int i18;
        if (gVar.f277487h != null) {
            gy.j jVar = gVar.f277488i;
            jVar.getClass();
            kotlin.jvm.internal.o.g(pcmData, "pcmData");
            if (jVar.f277497d && (i18 = i17 - (i17 % 2)) != 0 && pcmData.remaining() >= i18) {
                int i19 = i18 / 2;
                int position = pcmData.position();
                double d17 = 0.0d;
                for (int i27 = 0; i27 < i19; i27++) {
                    int i28 = (i27 * 2) + position;
                    d17 += java.lang.Math.pow(java.lang.Math.abs((int) ((short) (((pcmData.get(i28 + 1) & 255) << 8) | (pcmData.get(i28) & 255)))), 2);
                }
                double d18 = i19 > 0 ? d17 / i19 : 0.0d;
                synchronized (jVar.a()) {
                    jVar.a().add(java.lang.Double.valueOf(d18));
                    if (jVar.a().size() > 5) {
                        jVar.a().removeFirst();
                    }
                }
            }
        }
        return com.tencent.wechat.aff.chatbot.w0.f216518b.h(pcmData, i17);
    }

    public final void a() {
        try {
            try {
                int i17 = android.os.Build.VERSION.SDK_INT;
                android.media.AudioManager audioManager = this.f277489j;
                if (i17 >= 26) {
                    android.media.AudioFocusRequest audioFocusRequest = this.f277490k;
                    if (audioFocusRequest != null) {
                        audioManager.abandonAudioFocusRequest(audioFocusRequest);
                    }
                } else {
                    audioManager.abandonAudioFocus(this.f277491l);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("ChatBot.SMCAudioManager", "abandonAudioFocus failed: " + e17.getMessage(), e17);
            }
        } finally {
            this.f277490k = null;
        }
    }

    public final boolean c() {
        if (this.f277480a != null) {
            return true;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(android.media.AudioRecord.getMinBufferSize(16000, 16, 2));
        int intValue = valueOf.intValue();
        if (!((intValue == -1 || intValue == -2) ? false : true)) {
            valueOf = null;
        }
        android.media.AudioRecord audioRecord = new android.media.AudioRecord(7, 16000, 16, 2, (valueOf != null ? valueOf.intValue() : 32000) * 2);
        android.media.AudioRecord audioRecord2 = audioRecord.getState() == 1 ? audioRecord : null;
        if (audioRecord2 == null) {
            return false;
        }
        this.f277480a = audioRecord2;
        return true;
    }

    public final void d() {
        j();
        a();
        e();
        ((ku5.f) this.f277481b).shutdownNow();
    }

    public final void e() {
        android.media.AudioRecord audioRecord = this.f277480a;
        if (audioRecord != null) {
            try {
                try {
                    if (audioRecord.getState() == 1) {
                        if (audioRecord.getRecordingState() == 3) {
                            audioRecord.stop();
                        }
                        audioRecord.release();
                    } else {
                        com.tencent.mars.xlog.Log.i("ChatBot.SMCAudioManager", "releaseAudioRecord Failed");
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("ChatBot.SMCAudioManager", "Failed to release recording resources：" + e17.getMessage());
                }
            } finally {
                this.f277480a = null;
            }
        }
        gy.j jVar = this.f277488i;
        jVar.c();
        synchronized (jVar.a()) {
            jVar.a().clear();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if (r5.requestAudioFocus(r4, 0, 2) == 1) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f() {
        /*
            r7 = this;
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L48
            r2 = 26
            r3 = 2
            android.media.AudioManager$OnAudioFocusChangeListener r4 = r7.f277491l
            android.media.AudioManager r5 = r7.f277489j
            r6 = 1
            if (r1 < r2) goto L40
            android.media.AudioAttributes$Builder r1 = new android.media.AudioAttributes$Builder     // Catch: java.lang.Exception -> L48
            r1.<init>()     // Catch: java.lang.Exception -> L48
            android.media.AudioAttributes$Builder r1 = r1.setUsage(r3)     // Catch: java.lang.Exception -> L48
            android.media.AudioAttributes$Builder r1 = r1.setContentType(r6)     // Catch: java.lang.Exception -> L48
            android.media.AudioAttributes r1 = r1.build()     // Catch: java.lang.Exception -> L48
            android.media.AudioFocusRequest$Builder r2 = new android.media.AudioFocusRequest$Builder     // Catch: java.lang.Exception -> L48
            r3 = 4
            r2.<init>(r3)     // Catch: java.lang.Exception -> L48
            android.media.AudioFocusRequest$Builder r1 = r2.setAudioAttributes(r1)     // Catch: java.lang.Exception -> L48
            android.media.AudioFocusRequest$Builder r1 = r1.setOnAudioFocusChangeListener(r4)     // Catch: java.lang.Exception -> L48
            android.media.AudioFocusRequest$Builder r1 = r1.setWillPauseWhenDucked(r6)     // Catch: java.lang.Exception -> L48
            android.media.AudioFocusRequest r1 = r1.build()     // Catch: java.lang.Exception -> L48
            r7.f277490k = r1     // Catch: java.lang.Exception -> L48
            kotlin.jvm.internal.o.d(r1)     // Catch: java.lang.Exception -> L48
            int r1 = r5.requestAudioFocus(r1)     // Catch: java.lang.Exception -> L48
            if (r1 != r6) goto L65
            goto L46
        L40:
            int r1 = r5.requestAudioFocus(r4, r0, r3)     // Catch: java.lang.Exception -> L48
            if (r1 != r6) goto L65
        L46:
            r0 = r6
            goto L65
        L48:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "requestAudioFocus failed: "
            r2.<init>(r3)
            java.lang.String r3 = r1.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r3 = "ChatBot.SMCAudioManager"
            com.tencent.mars.xlog.Log.e(r3, r2, r1)
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gy.g.f():boolean");
    }

    public final void g() {
        android.media.AudioManager audioManager = this.f277489j;
        try {
            if (audioManager.isMusicActive()) {
                android.view.KeyEvent keyEvent = new android.view.KeyEvent(0, 127);
                android.view.KeyEvent keyEvent2 = new android.view.KeyEvent(1, 127);
                audioManager.dispatchMediaKeyEvent(keyEvent);
                audioManager.dispatchMediaKeyEvent(keyEvent2);
                com.tencent.mars.xlog.Log.i("ChatBot.SMCAudioManager", "dispatch media pause key to pause external playback");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("ChatBot.SMCAudioManager", "sendMediaPauseIfMusicActive failed: " + e17.getMessage(), e17);
        }
    }

    public final boolean h() {
        this.f277484e.lock();
        try {
            if (this.f277483d) {
                return true;
            }
            if (!c()) {
                com.tencent.mars.xlog.Log.e("ChatBot.SMCAudioManager", "AudioRecord initialization failed (check recording permissions/hardware）");
                e();
                return false;
            }
            if (!f()) {
                com.tencent.mars.xlog.Log.w("ChatBot.SMCAudioManager", "audio focus not granted, try to pause external music as fallback");
                g();
            }
            this.f277483d = true;
            i();
            android.media.AudioRecord audioRecord = this.f277480a;
            if (audioRecord != null) {
                yj0.a.j(audioRecord, "com/tencent/mm/feature/chatbot/media/AudioRecorder", "start", "()Z", "android/media/AudioRecord", "startRecording", "()V");
            }
            if (this.f277487h != null) {
                this.f277488i.b();
            }
            com.tencent.mars.xlog.Log.i("ChatBot.SMCAudioManager", "Recording start");
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("ChatBot.SMCAudioManager", "failed_to_start_recording：" + e17.getMessage(), e17);
            e();
            return false;
        } finally {
            this.f277484e.unlock();
        }
    }

    public final void i() {
        java.util.concurrent.Future future = this.f277482c;
        if (future != null) {
            future.cancel(true);
        }
        this.f277482c = ((java.util.concurrent.AbstractExecutorService) this.f277481b).submit(new gy.f(this));
    }

    public final void j() {
        this.f277484e.lock();
        try {
            try {
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("ChatBot.SMCAudioManager", "failed to stop recording：" + e17.getMessage(), e17);
            }
            if (this.f277483d) {
                this.f277483d = false;
                android.media.AudioRecord audioRecord = this.f277480a;
                if (audioRecord != null && audioRecord.getState() == 1 && audioRecord.getRecordingState() == 3) {
                    try {
                        audioRecord.stop();
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.e("ChatBot.SMCAudioManager", "stop AudioRecord failed: " + e18.getMessage(), e18);
                    }
                }
                java.util.concurrent.Future future = this.f277482c;
                if (future != null) {
                    future.cancel(true);
                }
                this.f277482c = null;
                com.tencent.mars.xlog.Log.i("ChatBot.SMCAudioManager", "recording has stopped");
                this.f277484e.unlock();
                a();
                if (this.f277487h != null) {
                    this.f277488i.c();
                }
            }
        } finally {
            this.f277484e.unlock();
        }
    }
}
