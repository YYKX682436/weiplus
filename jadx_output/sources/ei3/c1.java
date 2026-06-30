package ei3;

/* loaded from: classes10.dex */
public abstract class c1 {
    public final boolean B;

    /* renamed from: b, reason: collision with root package name */
    public final int f253000b;

    /* renamed from: c, reason: collision with root package name */
    public final int f253001c;

    /* renamed from: d, reason: collision with root package name */
    public int f253002d;

    /* renamed from: e, reason: collision with root package name */
    public int f253003e;

    /* renamed from: f, reason: collision with root package name */
    public wo.i1 f253004f;

    /* renamed from: g, reason: collision with root package name */
    public android.media.MediaFormat f253005g;

    /* renamed from: i, reason: collision with root package name */
    public java.nio.ByteBuffer[] f253007i;

    /* renamed from: j, reason: collision with root package name */
    public java.nio.ByteBuffer[] f253008j;

    /* renamed from: m, reason: collision with root package name */
    public final android.media.MediaCodec.BufferInfo f253011m;

    /* renamed from: n, reason: collision with root package name */
    public final int f253012n;

    /* renamed from: v, reason: collision with root package name */
    public final int f253020v;

    /* renamed from: w, reason: collision with root package name */
    public final int f253021w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f253022x;

    /* renamed from: y, reason: collision with root package name */
    public ei3.o f253023y;

    /* renamed from: h, reason: collision with root package name */
    public long f253006h = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f253009k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f253010l = -1;

    /* renamed from: o, reason: collision with root package name */
    public boolean f253013o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f253014p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f253015q = false;

    /* renamed from: r, reason: collision with root package name */
    public int f253016r = -1;

    /* renamed from: s, reason: collision with root package name */
    public int f253017s = -1;

    /* renamed from: t, reason: collision with root package name */
    public int f253018t = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f253019u = -1;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.Object f253024z = new java.lang.Object();
    public boolean A = false;
    public long C = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ei3.d f252999a = new ei3.d(new ei3.a1(this));

    public c1(int i17, int i18, int i19, int i27, int i28, int i29, int i37, boolean z17, ei3.x0 x0Var) {
        this.f253012n = 0;
        this.f253022x = false;
        this.B = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "create MMSightYUVMediaCodecRecorder, init targetWidth: %d, targetHeight: %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "create MMSightYUVMediaCodecRecorder, after align 16, targetWidth: %d, targetHeight: %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        this.f253000b = i19;
        this.f253001c = i27;
        this.f253021w = i37;
        this.f253020v = i29;
        this.f253011m = new android.media.MediaCodec.BufferInfo();
        this.f253012n = i28;
        this.f253022x = z17;
        this.B = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_ignore_mediacodec_lock, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "create BigSightMediaCodecYUVRecorder, frameWidth: %s, frameHeight: %s, targetWidth: %s, targetHeight: %s, bitrate: %s, needRotateEachFrame: %s, muxer: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Boolean.valueOf(z17), x0Var);
    }

    public final void a() {
        wo.i1 i1Var = this.f253004f;
        android.media.MediaCodec.BufferInfo bufferInfo = this.f253011m;
        this.f253010l = i1Var.g(bufferInfo, 100L);
        while (true) {
            int i17 = this.f253010l;
            if (i17 == -1) {
                if (!this.f253015q) {
                    return;
                }
            } else if (i17 == -3) {
                this.f253008j = this.f253004f.n();
            } else if (i17 == -2) {
                java.util.Objects.toString(this.f253004f.o());
            } else if (i17 < 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMSightYUVMediaCodecRecorder", "unexpected result from encoder.dequeueOutputBuffer: " + this.f253010l);
            } else {
                java.nio.ByteBuffer byteBuffer = this.f253008j[i17];
                if (byteBuffer == null) {
                    throw new java.lang.RuntimeException("encoderOutputBuffer " + this.f253010l + " was null");
                }
                this.f253003e++;
                int i18 = bufferInfo.flags;
                if (bufferInfo.size != 0) {
                    byteBuffer.position(bufferInfo.offset);
                    byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    ei3.z0 z0Var = (ei3.z0) this;
                    if (z0Var.D >= 0 && bufferInfo.size == byteBuffer.limit() - byteBuffer.position()) {
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        com.tencent.mm.plugin.sight.base.SightVideoJNI.writeH264DataLock(z0Var.D, byteBuffer, bufferInfo.size, bufferInfo.presentationTimeUs);
                        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "writeH264Data used %sms, size: %s %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Integer.valueOf(bufferInfo.size), java.lang.Integer.valueOf(byteBuffer.capacity()));
                    }
                }
                this.f253004f.s(this.f253010l, false);
                if ((bufferInfo.flags & 4) != 0) {
                    if (!this.f253014p) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.MMSightYUVMediaCodecRecorder", "reached end of stream unexpectedly");
                        return;
                    }
                    com.tencent.mars.xlog.Log.w("MicroMsg.MMSightYUVMediaCodecRecorder", "do stop encoder");
                    b();
                    ei3.o oVar = this.f253023y;
                    if (oVar != null) {
                        ei3.w0 w0Var = ((ei3.p0) oVar).f253116a;
                        w0Var.getClass();
                        s75.d.b(new ei3.s0(w0Var), "MMSightMediaCodecMP4MuxRecorder_stop");
                        this.f253023y = null;
                        return;
                    }
                    return;
                }
            }
            int g17 = this.f253004f.g(bufferInfo, 100L);
            this.f253010l = g17;
            if (g17 < 0 && !this.f253015q) {
                return;
            }
        }
    }

    public final void b() {
        if (this.B) {
            c();
            return;
        }
        synchronized (this.f253024z) {
            if (!this.A && 0 != this.f253006h) {
                this.A = true;
                c();
            }
        }
    }

    public final void c() {
        try {
            ei3.d dVar = this.f252999a;
            if (dVar != null) {
                dVar.b();
            }
            if (this.f253004f != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "stop encoder");
                this.f253004f.y();
                this.f253004f.q();
                this.f253013o = false;
                this.f253004f = null;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightYUVMediaCodecRecorder", "clear error: %s", e17.getMessage());
        }
    }

    public final int d() {
        android.media.MediaCodecInfo mediaCodecInfo;
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int codecCount = android.media.MediaCodecList.getCodecCount();
        int i17 = 0;
        loop0: while (true) {
            if (i17 >= codecCount) {
                mediaCodecInfo = null;
                break;
            }
            mediaCodecInfo = android.media.MediaCodecList.getCodecInfoAt(i17);
            if (mediaCodecInfo.isEncoder()) {
                for (java.lang.String str : mediaCodecInfo.getSupportedTypes()) {
                    if (str.equalsIgnoreCase("video/avc")) {
                        break loop0;
                    }
                }
            }
            i17++;
        }
        if (mediaCodecInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightYUVMediaCodecRecorder", "Unable to find an appropriate codec for video/avc");
            di3.x.f();
            return -1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "found codec: %s, used %sms", mediaCodecInfo.getName(), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        int i18 = com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance() != null ? com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance().getInt(com.tencent.mm.storage.u3.USERINFO_MMSIGHT_MEDIACODEC_COLORFORMAT_INT, -1) : -1;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "saveColorFormat: %s", java.lang.Integer.valueOf(i18));
        if (i18 <= 0) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
            android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType("video/avc");
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "getCapabilitiesForType used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime3));
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "color format length: %s", java.lang.Integer.valueOf(capabilitiesForType.colorFormats.length));
            int i19 = 0;
            int i27 = 0;
            while (true) {
                int[] iArr = capabilitiesForType.colorFormats;
                if (i27 >= iArr.length) {
                    break;
                }
                int i28 = iArr[i27];
                com.tencent.mars.xlog.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "capabilities colorFormat: %s", java.lang.Integer.valueOf(i28));
                if ((i28 == 19 || i28 == 21 || i28 == 2130706688) && (i28 > i19 || i28 == 21)) {
                    i19 = i28;
                }
                i27++;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "codec: %s, colorFormat: %s", mediaCodecInfo.getName(), java.lang.Integer.valueOf(i19));
            i18 = i19;
        }
        this.f253002d = i18;
        long elapsedRealtime4 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime2;
        if (this.f253002d > 0 && elapsedRealtime4 > 200 && com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance() != null) {
            com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance().set(com.tencent.mm.storage.u3.USERINFO_MMSIGHT_MEDIACODEC_COLORFORMAT_INT, java.lang.Integer.valueOf(this.f253002d));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "found colorFormat: %s, used %sms", java.lang.Integer.valueOf(this.f253002d), java.lang.Long.valueOf(elapsedRealtime4));
        long elapsedRealtime5 = android.os.SystemClock.elapsedRealtime();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "initRotate: %s", java.lang.Integer.valueOf(this.f253016r));
        if (this.f253022x) {
            int i29 = this.f253016r;
            this.f253005g = android.media.MediaFormat.createVideoFormat("video/avc", (i29 == 180 || i29 == 0) ? this.f253000b : this.f253001c, (i29 == 180 || i29 == 0) ? this.f253001c : this.f253000b);
        } else {
            int i37 = this.f253016r;
            this.f253005g = android.media.MediaFormat.createVideoFormat("video/avc", (i37 == 180 || i37 == 0) ? this.f253001c : this.f253000b, (i37 == 180 || i37 == 0) ? this.f253000b : this.f253001c);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "createVideoFormat used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime5));
        if (fp.h.c(23)) {
            try {
                android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType2 = mediaCodecInfo.getCapabilitiesForType("video/avc");
                if (capabilitiesForType2 != null && (codecProfileLevelArr = capabilitiesForType2.profileLevels) != null) {
                    android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel = new android.media.MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.level = 0;
                    codecProfileLevel.profile = 0;
                    for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                        int i38 = codecProfileLevel2.profile;
                        int i39 = codecProfileLevel2.level;
                        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "profile: %s, level: %s", java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(i39));
                        if ((i38 == 1 || i38 == 2 || i38 == 8) && i38 >= codecProfileLevel.profile && i39 >= codecProfileLevel.level) {
                            codecProfileLevel.profile = i38;
                            codecProfileLevel.level = i39;
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "best profile: %s, level: %s", java.lang.Integer.valueOf(codecProfileLevel.profile), java.lang.Integer.valueOf(codecProfileLevel.level));
                    int i47 = codecProfileLevel.profile;
                    if (i47 > 0 && codecProfileLevel.level >= 256) {
                        this.f253005g.setInteger(com.google.android.gms.common.Scopes.PROFILE, i47);
                        this.f253005g.setInteger(ya.b.LEVEL, 256);
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMSightYUVMediaCodecRecorder", "trySetProfile error: %s", e17.getMessage());
            }
        }
        try {
            if (fp.h.c(21)) {
                this.f253005g.setInteger("bitrate-mode", 1);
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightYUVMediaCodecRecorder", "trySetBitRateMode error: %s", e18.getMessage());
        }
        this.f253005g.setInteger(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, this.f253012n);
        this.f253005g.setInteger("frame-rate", this.f253021w);
        this.f253005g.setInteger("color-format", this.f253002d);
        this.f253005g.setInteger("i-frame-interval", this.f253020v);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "mediaFormat: %s", this.f253005g);
        wo.i1 b17 = wo.i1.b(mediaCodecInfo.getName());
        this.f253004f = b17;
        b17.a(this.f253005g, null, null, 1);
        this.f253004f.x();
        if (this.B) {
            return 0;
        }
        synchronized (this.f253024z) {
            this.A = false;
        }
        return 0;
    }

    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "Start");
        this.f253013o = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "Start：isStart：" + this.f253013o);
        this.f253006h = java.lang.System.nanoTime();
    }

    public void f(ei3.o oVar) {
        this.f253023y = oVar;
        this.f253014p = true;
        ei3.d dVar = this.f252999a;
        boolean z17 = dVar.f253028c == dVar.f253027b;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "!!!stop, isStart!!: %s %s isEnd %s", java.lang.Boolean.valueOf(this.f253013o), this.f253023y, java.lang.Boolean.valueOf(z17));
        if (z17) {
            g();
        }
    }

    public final void g() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "stopImp %s  isStart:%b", com.tencent.mm.sdk.platformtools.z3.b(true), java.lang.Boolean.valueOf(this.f253013o));
        try {
            if (this.f253013o) {
                com.tencent.mm.sdk.platformtools.u3.i(new ei3.b1(this), 500L);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightYUVMediaCodecRecorder", "stop error: %s", e17.getMessage());
        }
    }

    public void h(byte[] bArr, int i17, int i18, int i19) {
        int i27;
        boolean z17;
        int i28;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        int i29 = this.f253016r;
        boolean z19 = this.f253022x;
        if (z19) {
            int i37 = this.f253017s;
            if (i37 != -1) {
                i29 = i37;
            }
            i27 = i29;
            z17 = z19;
        } else {
            int i38 = this.f253017s;
            if (i38 == -1 || i38 == i29) {
                i27 = i29;
                z17 = false;
            } else {
                int max = java.lang.Math.max(0, i29 <= 180 ? i38 - i29 : i38 + (360 - i29));
                if (max >= 360) {
                    z17 = true;
                    i27 = 0;
                } else {
                    i27 = max;
                    z17 = true;
                }
            }
        }
        int i39 = this.f253016r;
        int i47 = this.f253017s;
        if (i47 != -1 && i47 != i39) {
            i39 = i47;
        }
        int i48 = (i39 == 0 || i39 == 180) ? i18 : i19;
        int i49 = (i39 == 0 || i39 == 180) ? i19 : i18;
        int i57 = this.f253001c;
        int i58 = this.f253000b;
        boolean z27 = (i48 == i58 && i49 == i57) ? false : true;
        int i59 = this.f253018t;
        ei3.g gVar = new ei3.g(i48, i49, this.f253002d, i58, i57, (i59 == -1 || (i28 = this.f253019u) == -1 || (i59 == i58 && i28 == i57)) ? z27 : true, z17, i27, bArr);
        ei3.d dVar = this.f252999a;
        if (dVar.f253032g) {
            return;
        }
        if (dVar.f253030e == null) {
            dVar.f253030e = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.myLooper());
        }
        int i66 = dVar.f253027b;
        int i67 = i66 % ei3.d.f253025i;
        com.tencent.mm.sdk.platformtools.n3 n3Var = dVar.f253026a[i67];
        if (n3Var == null) {
            return;
        }
        xu5.b serial = n3Var.getSerial();
        ei3.f fVar = dVar.f253033h;
        gVar.f253046c = i66;
        gVar.f253052i = i67;
        android.os.SystemClock.elapsedRealtime();
        com.tencent.mars.xlog.Log.i("MicroMsg.FrameBufProcessor", "create framebuf %d %d", java.lang.Integer.valueOf(gVar.f253044a.length), java.lang.Integer.valueOf(gVar.f253046c));
        new com.tencent.mm.sdk.platformtools.n3(serial).post(new ei3.e(gVar, fVar));
        dVar.f253027b++;
    }
}
