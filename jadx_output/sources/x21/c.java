package x21;

/* loaded from: classes14.dex */
public final class c implements x21.f {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.a f451512a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f451513b;

    /* renamed from: c, reason: collision with root package name */
    public android.media.AudioTrack f451514c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f451515d;

    /* renamed from: e, reason: collision with root package name */
    public int f451516e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f451517f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f451518g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object f451519h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f451520i;

    /* renamed from: j, reason: collision with root package name */
    public int f451521j;

    /* renamed from: k, reason: collision with root package name */
    public f25.m0 f451522k;

    /* renamed from: l, reason: collision with root package name */
    public final x21.a f451523l;

    public c(boolean z17, yz5.a onPlayInterrupt, boolean z18) {
        kotlin.jvm.internal.o.g(onPlayInterrupt, "onPlayInterrupt");
        this.f451512a = onPlayInterrupt;
        this.f451513b = z18;
        this.f451515d = z17;
        this.f451516e = 16000;
        this.f451518g = new java.lang.Object();
        this.f451519h = new java.lang.Object();
        this.f451523l = new x21.a(this);
    }

    public static void d(x21.c cVar, boolean z17, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            z17 = cVar.f451515d;
        }
        if ((i18 & 2) != 0) {
            i17 = cVar.f451516e;
        }
        cVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MSP.AudioTrackAudioPlayer", "setPlayParams " + z17 + ", sampleRate: " + i17 + "; curPR: " + cVar.f451515d + ", curSR: " + cVar.f451516e);
        synchronized (cVar.f451518g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MSP.AudioTrackAudioPlayer", "real do");
            android.media.AudioTrack audioTrack = cVar.f451514c;
            if (audioTrack != null) {
                if (audioTrack.getPlayState() == 3) {
                    cVar.b(z17, i17);
                }
            }
            cVar.f451515d = z17;
            cVar.f451516e = i17;
        }
    }

    public final void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MSP.AudioTrackAudioPlayer", "pausePlay " + z17 + ", curState " + this.f451520i);
        if (z17) {
            synchronized (this.f451519h) {
                this.f451520i = true;
            }
        } else {
            synchronized (this.f451519h) {
                this.f451520i = false;
                this.f451519h.notifyAll();
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:12|13|(3:15|(1:17)|18)|19|(2:(1:48)(1:24)|(10:26|(2:28|(1:32))|34|35|(1:37)|38|39|(1:41)|42|43))|49|50|51|(1:53)(1:65)|54|55|(1:59)|60|(1:62)|63|43) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
    
        if (r1 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e4, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e5, code lost:
    
        r1 = kotlin.Result.INSTANCE;
        kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(r8));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r7, int r8) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x21.c.b(boolean, int):void");
    }

    public final void c(boolean z17) {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MSP.AudioTrackAudioPlayer", "release audioTrack forceStop: " + z17 + ' ' + this.f451514c, new java.lang.Object[0]);
        a(false);
        synchronized (this.f451518g) {
            this.f451517f = false;
            android.media.AudioTrack audioTrack = this.f451514c;
            if (audioTrack != null) {
                if (z17) {
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        audioTrack.pause();
                        audioTrack.flush();
                        audioTrack.release();
                        if (this.f451513b) {
                            f25.m0 m0Var = this.f451522k;
                            if (m0Var != null) {
                                i95.m c17 = i95.n0.c(f25.n0.class);
                                kotlin.jvm.internal.o.f(c17, "getService(...)");
                                ((f25.n0) c17).yg(m0Var);
                            }
                            this.f451522k = null;
                        }
                        m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
                    } catch (java.lang.Throwable th6) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                    }
                    java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
                    if (m524exceptionOrNullimpl != null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.MSP.AudioTrackAudioPlayer", "stop audio track error", m524exceptionOrNullimpl);
                    }
                    kotlin.Result.m520boximpl(m521constructorimpl);
                } else {
                    audioTrack.setNotificationMarkerPosition(this.f451521j / 2);
                    audioTrack.setPlaybackPositionUpdateListener(new x21.b(this));
                }
            }
            this.f451514c = null;
            this.f451521j = 0;
        }
    }

    public boolean e(x21.m rawAudioInfo) {
        kotlin.jvm.internal.o.g(rawAudioInfo, "rawAudioInfo");
        synchronized (this.f451519h) {
            if (this.f451520i) {
                this.f451519h.wait();
            }
        }
        synchronized (this.f451518g) {
            if (this.f451514c != null && this.f451517f) {
                if (rawAudioInfo.f451554d != this.f451516e) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MSP.AudioTrackAudioPlayer", "sample rate not match, new is " + rawAudioInfo.f451554d);
                    b(this.f451515d, rawAudioInfo.f451554d);
                }
                rawAudioInfo.f451553c.rewind();
                android.media.AudioTrack audioTrack = this.f451514c;
                if (audioTrack != null) {
                    audioTrack.write(rawAudioInfo.f451553c.array(), 0, rawAudioInfo.f451553c.limit());
                }
                this.f451521j += rawAudioInfo.f451553c.limit();
                return true;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.MSP.AudioTrackAudioPlayer", "write error canWrite: " + this.f451517f + ' ' + this.f451514c);
            return false;
        }
    }
}
