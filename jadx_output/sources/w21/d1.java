package w21;

/* loaded from: classes14.dex */
public class d1 implements tl.h {

    /* renamed from: a, reason: collision with root package name */
    public android.media.MediaPlayer f442335a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f442336b;

    /* renamed from: c, reason: collision with root package name */
    public tl.e f442337c;

    /* renamed from: d, reason: collision with root package name */
    public tl.f f442338d;

    /* renamed from: e, reason: collision with root package name */
    public final fp.e f442339e;

    /* renamed from: f, reason: collision with root package name */
    public int f442340f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f442341g;

    public d1() {
        this.f442336b = "";
        this.f442337c = null;
        this.f442338d = null;
        this.f442340f = 0;
        this.f442341g = true;
        to.g gVar = new to.g();
        this.f442335a = gVar;
        gVar.setOnCompletionListener(new w21.b1(this));
        this.f442335a.setOnErrorListener(new w21.c1(this));
    }

    @Override // tl.h
    public void a(tl.f fVar) {
        this.f442338d = fVar;
    }

    @Override // tl.h
    public void b(tl.e eVar) {
        this.f442337c = eVar;
    }

    @Override // tl.h
    public double c() {
        int i17 = this.f442340f;
        if (i17 != 1 && i17 != 2) {
            return 0.0d;
        }
        try {
            int currentPosition = this.f442335a.getCurrentPosition();
            int duration = this.f442335a.getDuration();
            if (duration != 0) {
                return currentPosition / duration;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.VoicePlayer", "getDuration File[" + this.f442336b + "] Failed");
            return 0.0d;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoicePlayer", "getNowProgress File[" + this.f442336b + "] ErrMsg[" + e17.getStackTrace() + "]");
            stop();
            return 0.0d;
        }
    }

    @Override // tl.h
    public void d(tl.g gVar) {
        com.tencent.mars.xlog.Log.e("MicroMsg.VoicePlayer", "seek not support");
    }

    @Override // tl.h
    public boolean e(java.lang.String str, boolean z17, int i17) {
        return l(str, z17, i17);
    }

    @Override // tl.h
    public boolean f(boolean z17) {
        fp.e eVar = this.f442339e;
        try {
            if (this.f442340f != 1) {
                com.tencent.mars.xlog.Log.e("MicroMsg.VoicePlayer", "pause not STATUS_PLAYING error status:" + this.f442340f);
                return false;
            }
            try {
                this.f442335a.pause();
                if (eVar != null && z17 && this.f442341g) {
                    eVar.a();
                }
                this.f442340f = 2;
                return true;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.VoicePlayer", "pause File[" + this.f442336b + "] ErrMsg[" + e17.getStackTrace() + "]");
                this.f442340f = -1;
                if (eVar != null && z17 && this.f442341g) {
                    eVar.a();
                }
                return false;
            }
        } catch (java.lang.Throwable th6) {
            if (eVar != null && z17 && this.f442341g) {
                eVar.a();
            }
            throw th6;
        }
    }

    @Override // tl.h
    public void g(boolean z17) {
        if (this.f442335a == null || com.tencent.mm.sdk.platformtools.l5.Bi()) {
            return;
        }
        int currentPosition = this.f442335a.getCurrentPosition();
        stop();
        to.g gVar = new to.g();
        this.f442335a = gVar;
        gVar.setOnCompletionListener(new w21.b1(this));
        this.f442335a.setOnErrorListener(new w21.c1(this));
        l(this.f442336b, z17, currentPosition);
    }

    @Override // tl.h
    public int getStatus() {
        return this.f442340f;
    }

    @Override // tl.h
    public boolean h(float f17) {
        return false;
    }

    @Override // tl.h
    public void i(boolean z17) {
        this.f442341g = z17;
    }

    @Override // tl.h
    public boolean isPlaying() {
        return this.f442340f == 1;
    }

    @Override // tl.h
    public boolean j(java.lang.String str, boolean z17) {
        return l(str, z17, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d A[Catch: Exception -> 0x0048, TryCatch #0 {Exception -> 0x0048, blocks: (B:9:0x0011, B:11:0x0017, B:15:0x0023, B:17:0x0027, B:18:0x002a, B:20:0x003d, B:21:0x0042), top: B:8:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(boolean r5, int r6) {
        /*
            r4 = this;
            fp.e r0 = r4.f442339e
            java.lang.String r1 = r4.f442336b
            boolean r1 = com.tencent.mm.vfs.w6.j(r1)
            if (r1 != 0) goto Lb
            return
        Lb:
            r1 = 3
            if (r5 == 0) goto L10
            r5 = r1
            goto L11
        L10:
            r5 = 0
        L11:
            wo.c r2 = wo.v1.f447823c     // Catch: java.lang.Exception -> L48
            boolean r3 = r2.f447589a     // Catch: java.lang.Exception -> L48
            if (r3 == 0) goto L20
            r2.c()     // Catch: java.lang.Exception -> L48
            int r2 = r2.f447603h     // Catch: java.lang.Exception -> L48
            r3 = 1
            if (r2 != r3) goto L20
            goto L21
        L20:
            r1 = r5
        L21:
            if (r0 == 0) goto L2a
            boolean r5 = r4.f442341g     // Catch: java.lang.Exception -> L48
            if (r5 == 0) goto L2a
            r0.b()     // Catch: java.lang.Exception -> L48
        L2a:
            android.media.MediaPlayer r5 = r4.f442335a     // Catch: java.lang.Exception -> L48
            r5.setAudioStreamType(r1)     // Catch: java.lang.Exception -> L48
            android.media.MediaPlayer r5 = r4.f442335a     // Catch: java.lang.Exception -> L48
            java.lang.String r1 = r4.f442336b     // Catch: java.lang.Exception -> L48
            r5.setDataSource(r1)     // Catch: java.lang.Exception -> L48
            android.media.MediaPlayer r5 = r4.f442335a     // Catch: java.lang.Exception -> L48
            r5.prepare()     // Catch: java.lang.Exception -> L48
            if (r6 <= 0) goto L42
            android.media.MediaPlayer r5 = r4.f442335a     // Catch: java.lang.Exception -> L48
            r5.seekTo(r6)     // Catch: java.lang.Exception -> L48
        L42:
            android.media.MediaPlayer r5 = r4.f442335a     // Catch: java.lang.Exception -> L48
            r5.start()     // Catch: java.lang.Exception -> L48
            goto L78
        L48:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "playImp : fail, exception = "
            r6.<init>(r1)
            java.lang.String r1 = r5.getMessage()
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r1 = "MicroMsg.VoicePlayer"
            com.tencent.mars.xlog.Log.e(r1, r6)
            boolean r6 = com.tencent.mm.sdk.platformtools.t8.f192989a
            java.lang.String r5 = com.tencent.mm.sdk.platformtools.z3.c(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r6 = "exception:%s"
            com.tencent.mars.xlog.Log.e(r1, r6, r5)
            if (r0 == 0) goto L78
            boolean r5 = r4.f442341g
            if (r5 == 0) goto L78
            r0.a()
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w21.d1.k(boolean, int):void");
    }

    public final boolean l(java.lang.String str, boolean z17, int i17) {
        if (this.f442340f != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoicePlayer", "startPlay error status:" + this.f442340f);
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoicePlayer", "startPlay speakerOn:%s,seekTo:%s,", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        this.f442336b = str;
        try {
            k(z17, i17);
        } catch (java.lang.Exception e17) {
            try {
                k(true, i17);
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.VoicePlayer", "startPlay File[" + this.f442336b + "] failed");
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.VoicePlayer", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                this.f442340f = -1;
                return false;
            }
        }
        this.f442340f = 1;
        return true;
    }

    @Override // tl.h
    public boolean pause() {
        return f(true);
    }

    @Override // tl.h
    public boolean resume() {
        fp.e eVar = this.f442339e;
        try {
            if (this.f442340f != 2) {
                com.tencent.mars.xlog.Log.e("MicroMsg.VoicePlayer", "resume not STATUS_PAUSE error status:" + this.f442340f);
                return false;
            }
            try {
                this.f442335a.start();
                if (eVar != null && this.f442341g) {
                    eVar.b();
                }
                this.f442340f = 1;
                return true;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.VoicePlayer", "resume File[" + this.f442336b + "] ErrMsg[" + e17.getStackTrace() + "]");
                this.f442340f = -1;
                if (eVar != null && this.f442341g) {
                    eVar.b();
                }
                return false;
            }
        } catch (java.lang.Throwable th6) {
            if (eVar != null && this.f442341g) {
                eVar.b();
            }
            throw th6;
        }
    }

    @Override // tl.h
    public boolean seek(long j17) {
        com.tencent.mars.xlog.Log.e("MicroMsg.VoicePlayer", "seek not support");
        return false;
    }

    @Override // tl.h
    public void setMute(boolean z17) {
        if (!j65.e.b() || !j65.e.g()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoicePlayer", "is not mute mode, don't set mute!!");
            return;
        }
        android.media.MediaPlayer mediaPlayer = this.f442335a;
        if (mediaPlayer == null) {
            return;
        }
        if (z17) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } else {
            mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    @Override // tl.h
    public boolean stop() {
        fp.e eVar = this.f442339e;
        int i17 = this.f442340f;
        if (i17 != 1 && i17 != 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoicePlayer", "stop not STATUS_PLAYING or STATUS_PAUSE error status:" + this.f442340f);
            return false;
        }
        try {
            try {
                this.f442335a.stop();
                this.f442335a.release();
                if (eVar != null && this.f442341g) {
                    eVar.a();
                }
                this.f442340f = 0;
                return true;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.VoicePlayer", "stop File[" + this.f442336b + "] ErrMsg[" + e17.getStackTrace() + "]");
                this.f442340f = -1;
                if (eVar != null && this.f442341g) {
                    eVar.a();
                }
                return false;
            }
        } catch (java.lang.Throwable th6) {
            if (eVar != null && this.f442341g) {
                eVar.a();
            }
            throw th6;
        }
    }

    public d1(android.content.Context context) {
        this();
        this.f442339e = new fp.e(context);
    }
}
