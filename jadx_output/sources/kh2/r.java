package kh2;

/* loaded from: classes10.dex */
public final class r implements jh2.c {

    /* renamed from: b, reason: collision with root package name */
    public jh2.a f308029b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f308030c;

    /* renamed from: d, reason: collision with root package name */
    public my5.a f308031d;

    /* renamed from: e, reason: collision with root package name */
    public long f308032e;

    /* renamed from: f, reason: collision with root package name */
    public long f308033f;

    /* renamed from: g, reason: collision with root package name */
    public long f308034g;

    /* renamed from: h, reason: collision with root package name */
    public om2.u f308035h;

    /* renamed from: i, reason: collision with root package name */
    public lh2.a f308036i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f308037j;

    /* renamed from: k, reason: collision with root package name */
    public long f308038k;

    /* renamed from: l, reason: collision with root package name */
    public long f308039l;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f308028a = "MMScoreCoreImpl_" + hashCode();

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f308040m = jz5.h.b(kh2.o.f308025d);

    @Override // jh2.c
    public void a(om2.u songData) {
        kotlin.jvm.internal.o.g(songData, "songData");
        this.f308035h = songData;
        om2.p pVar = songData.f346384b;
        this.f308039l = pVar.f346371e * 1000;
        com.tencent.mars.xlog.Log.i(this.f308028a, "init songDuration: " + this.f308039l);
        this.f308031d = pVar.f346368b.f346391c;
        this.f308036i = new lh2.a("mm_origin_" + songData.f346383a + ".pcm");
    }

    @Override // jh2.c
    public void b(long j17, long j18) {
        com.tencent.mars.xlog.Log.i(this.f308028a, "updateValidTimeRange: " + j17 + '-' + j18);
        if (j17 < 0 || j18 <= 0 || j17 > j18) {
            return;
        }
        dn0.j i17 = i();
        i17.getClass();
        com.tencent.mars.xlog.Log.i(i17.f241841a, "updateValidTimeRange: " + j17 + '-' + j18);
        i17.f241848h = j17;
        i17.f241849i = j18;
    }

    @Override // jh2.c
    public void c(long j17) {
        com.tencent.mars.xlog.Log.i(this.f308028a, "updateCustomVoiceEndTime: " + j17);
        if (j17 <= 0) {
            return;
        }
        this.f308034g = j17;
        k();
    }

    @Override // jh2.c
    public void d(double d17) {
        com.tencent.mars.xlog.Log.i(this.f308028a, "setReduceRatio: " + d17);
        i().getClass();
    }

    @Override // jh2.c
    public void e(jh2.a aVar) {
        this.f308029b = aVar;
    }

    @Override // jh2.c
    public void f(yz5.l lVar) {
        om2.u uVar = this.f308035h;
        if (uVar != null) {
            h(uVar, null);
        }
        dn0.j i17 = i();
        kh2.n nVar = new kh2.n(lVar);
        synchronized (i17) {
            java.lang.Long l17 = i17.f241843c;
            if (l17 != null) {
                kotlinx.coroutines.l.d((kotlinx.coroutines.y0) ((jz5.n) i17.f241850j).getValue(), kotlinx.coroutines.q1.f310570c, null, new dn0.f(i17, l17.longValue(), nVar, null), 2, null);
            } else {
                com.tencent.mars.xlog.Log.i(i17.f241841a, "getNoteInfo scoreHandle invalid");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @Override // jh2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame r24, long r25, boolean r27) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.r.g(com.tencent.trtc.TRTCCloudDef$TRTCAudioFrame, long, boolean):void");
    }

    public final int h(om2.u uVar, com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        int i17;
        com.tencent.mm.protobuf.g gVar;
        if (this.f308037j) {
            return 0;
        }
        dn0.j i18 = i();
        int i19 = tRTCAudioFrame != null ? tRTCAudioFrame.sampleRate : 48000;
        int i27 = tRTCAudioFrame != null ? tRTCAudioFrame.channel : 2;
        if (dn0.b.f241826b) {
            synchronized (i18) {
                i18.f241843c = java.lang.Long.valueOf(i18.f241842b.Init(i19, i27));
                i18.f241845e = true;
                com.tencent.mars.xlog.Log.i(i18.f241841a, "init scoreHandle = " + i18.f241843c);
            }
        } else {
            com.tencent.mars.xlog.Log.e(i18.f241841a, "init error so load");
        }
        dn0.j i28 = i();
        om2.w wVar = uVar.f346384b.f346370d;
        byte[] bArr = (wVar == null || (gVar = wVar.f346387c) == null) ? null : gVar.f192156a;
        if (bArr == null) {
            bArr = new byte[0];
        }
        byte[] bArr2 = bArr;
        my5.a aVar = this.f308031d;
        int[] a17 = aVar != null ? aVar.a() : null;
        int[] iArr = a17 == null ? new int[0] : a17;
        i28.getClass();
        synchronized (i28) {
            java.lang.Long l17 = i28.f241843c;
            if (l17 != null) {
                i17 = i28.f241842b.SentSongInfo(l17.longValue(), bArr2, bArr2.length, iArr, iArr.length);
                com.tencent.mars.xlog.Log.i(i28.f241841a, "setSongInfo res = " + i17);
            } else {
                com.tencent.mars.xlog.Log.i(i28.f241841a, "setSongInfo scoreHandle invalid");
                i17 = -1;
            }
        }
        com.tencent.mars.xlog.Log.i(this.f308028a, "checkInitScore res: " + i17);
        this.f308037j = true;
        return i17;
    }

    public final dn0.j i() {
        return (dn0.j) ((jz5.n) this.f308040m).getValue();
    }

    @Override // jh2.c
    public void j() {
        java.io.OutputStream outputStream;
        dn0.j i17 = i();
        synchronized (i17) {
            com.tencent.mars.xlog.Log.i(i17.f241841a, "unInit:" + i17.f241843c + " nativeLoader " + i17.f241842b);
            java.lang.Long l17 = i17.f241843c;
            if (l17 != null) {
                i17.f241842b.UnInit(l17.longValue());
            }
            i17.f241843c = null;
            i17.f241845e = false;
        }
        i17.f241844d = null;
        kotlinx.coroutines.z0.e((kotlinx.coroutines.y0) ((jz5.n) i17.f241850j).getValue(), null, 1, null);
        kotlinx.coroutines.z0.e((kotlinx.coroutines.y0) ((jz5.n) i17.f241851k).getValue(), null, 1, null);
        i17.f241847g = 0;
        i17.f241846f = 0;
        i17.f241848h = 0L;
        i17.f241849i = 0L;
        this.f308030c = false;
        this.f308032e = 0L;
        this.f308033f = 0L;
        this.f308034g = 0L;
        lh2.a aVar = this.f308036i;
        if (aVar != null && (outputStream = aVar.f318660b) != null) {
            outputStream.close();
        }
        this.f308029b = null;
        com.tencent.mars.xlog.Log.i(this.f308028a, "unInit :" + this.f308030c);
    }

    public final void k() {
        long max;
        long j17;
        long j18 = this.f308034g;
        if (j18 > 0) {
            long j19 = this.f308033f;
            if (j19 > 0) {
                j18 = java.lang.Math.min(j18, j19);
                this.f308032e = j18;
                max = java.lang.Math.max(j18, 0L);
                this.f308032e = max;
                j17 = this.f308039l;
                if (j17 > 0 || 6000 + max <= j17) {
                    j17 = max + androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS;
                }
                this.f308038k = j17;
                com.tencent.mars.xlog.Log.i(this.f308028a, "voiceEndTime: " + this.f308032e + " customVoiceEndTime: " + this.f308034g + " lastSentenceEndTime: " + this.f308033f + " singFinishTime: " + this.f308038k + " songDuraion: " + this.f308039l);
            }
        }
        long j27 = this.f308033f;
        if (j27 > 0) {
            j18 = j27;
        }
        this.f308032e = j18;
        max = java.lang.Math.max(j18, 0L);
        this.f308032e = max;
        j17 = this.f308039l;
        if (j17 > 0) {
        }
        j17 = max + androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS;
        this.f308038k = j17;
        com.tencent.mars.xlog.Log.i(this.f308028a, "voiceEndTime: " + this.f308032e + " customVoiceEndTime: " + this.f308034g + " lastSentenceEndTime: " + this.f308033f + " singFinishTime: " + this.f308038k + " songDuraion: " + this.f308039l);
    }

    @Override // jh2.c
    public void setKeyShift(int i17) {
        jz5.f0 f0Var;
        dn0.j i18 = i();
        synchronized (i18) {
            java.lang.Long l17 = i18.f241843c;
            if (l17 != null) {
                int SetToneChangeVal = i18.f241842b.SetToneChangeVal(l17.longValue(), i17);
                com.tencent.mars.xlog.Log.i(i18.f241841a, "setKeyShift res: " + SetToneChangeVal);
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.i(i18.f241841a, "setKeyShift scoreHandle invalid");
            }
        }
    }
}
