package fi3;

/* loaded from: classes10.dex */
public class l {

    /* renamed from: b, reason: collision with root package name */
    public fi3.k f263024b;

    /* renamed from: c, reason: collision with root package name */
    public final int f263025c;

    /* renamed from: d, reason: collision with root package name */
    public final int f263026d;

    /* renamed from: e, reason: collision with root package name */
    public int f263027e;

    /* renamed from: f, reason: collision with root package name */
    public int f263028f;

    /* renamed from: g, reason: collision with root package name */
    public int f263029g;

    /* renamed from: h, reason: collision with root package name */
    public wo.i1 f263030h;

    /* renamed from: i, reason: collision with root package name */
    public android.media.MediaFormat f263031i;

    /* renamed from: j, reason: collision with root package name */
    public java.nio.ByteBuffer[] f263032j;

    /* renamed from: k, reason: collision with root package name */
    public java.nio.ByteBuffer[] f263033k;

    /* renamed from: n, reason: collision with root package name */
    public final android.media.MediaCodec.BufferInfo f263036n;

    /* renamed from: o, reason: collision with root package name */
    public final int f263037o;

    /* renamed from: s, reason: collision with root package name */
    public final int f263041s;

    /* renamed from: t, reason: collision with root package name */
    public final int f263042t;

    /* renamed from: u, reason: collision with root package name */
    public byte[] f263043u;

    /* renamed from: v, reason: collision with root package name */
    public int f263044v;

    /* renamed from: a, reason: collision with root package name */
    public int f263023a = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f263034l = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f263035m = -1;

    /* renamed from: p, reason: collision with root package name */
    public boolean f263038p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f263039q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f263040r = false;

    public l(int i17, int i18, int i19, int i27, int i28, int i29, int i37) {
        this.f263037o = 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "create MMSightRemuxMediaCodecEncoder, init targetWidth: %d, targetHeight: %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        this.f263025c = i19;
        this.f263026d = i27;
        this.f263042t = i37;
        this.f263041s = i29;
        this.f263036n = new android.media.MediaCodec.BufferInfo();
        this.f263037o = i28;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "create MMSightRemuxMediaCodecEncoder, frameWidth: %s, frameHeight: %s, targetWidth: %s, targetHeight: %s, bitrate: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28));
    }

    public final void a() {
        wo.i1 i1Var = this.f263030h;
        android.media.MediaCodec.BufferInfo bufferInfo = this.f263036n;
        this.f263035m = i1Var.g(bufferInfo, 600L);
        while (true) {
            int i17 = this.f263035m;
            if (i17 == -1) {
                if (!this.f263040r) {
                    return;
                }
            } else if (i17 == -3) {
                this.f263033k = this.f263030h.n();
            } else if (i17 == -2) {
                java.util.Objects.toString(this.f263030h.o());
            } else if (i17 < 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMSightRemuxMediaCodecEncoder", "unexpected result from encoder.dequeueOutputBuffer: " + this.f263035m);
            } else {
                java.nio.ByteBuffer byteBuffer = this.f263033k[i17];
                if (byteBuffer == null) {
                    throw new java.lang.RuntimeException("encoderOutputBuffer " + this.f263035m + " was null");
                }
                this.f263028f++;
                if ((bufferInfo.flags & 2) != 0) {
                    int i18 = bufferInfo.size;
                }
                if (bufferInfo.size != 0) {
                    byteBuffer.position(bufferInfo.offset);
                    byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    if (bufferInfo != null && this.f263024b != null) {
                        com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI.writeH264DataLock(this.f263023a, byteBuffer, bufferInfo.size);
                    }
                }
                this.f263030h.s(this.f263035m, false);
                if ((bufferInfo.flags & 4) != 0) {
                    if (!this.f263039q) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "reached end of stream unexpectedly");
                        return;
                    }
                    com.tencent.mars.xlog.Log.w("MicroMsg.MMSightRemuxMediaCodecEncoder", "do stop encoder, frameCount: %s, writeFrameCount: %s", java.lang.Integer.valueOf(this.f263028f), java.lang.Integer.valueOf(this.f263029g));
                    try {
                        this.f263030h.y();
                        this.f263030h.q();
                        this.f263030h = null;
                        this.f263038p = false;
                        return;
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "do stop encoder error: %s", e17.getMessage());
                        return;
                    }
                }
            }
            this.f263035m = this.f263030h.g(bufferInfo, 600L);
            if (this.f263035m < 0 && !this.f263040r) {
                return;
            }
        }
    }

    public final int b() {
        android.media.MediaCodecInfo mediaCodecInfo;
        android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType;
        android.media.MediaCodecInfo.EncoderCapabilities encoderCapabilities;
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
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "Unable to find an appropriate codec for video/avc");
            di3.x.f();
            return -1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "found codec: %s, used %sms", mediaCodecInfo.getName(), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
        android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType2 = mediaCodecInfo.getCapabilitiesForType("video/avc");
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "getCapabilitiesForType used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime3));
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "color format length: %s", java.lang.Integer.valueOf(capabilitiesForType2.colorFormats.length));
        int i18 = 0;
        int i19 = 0;
        while (true) {
            int[] iArr = capabilitiesForType2.colorFormats;
            if (i18 >= iArr.length) {
                break;
            }
            int i27 = iArr[i18];
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "capabilities colorFormat: %s", java.lang.Integer.valueOf(i27));
            if ((i27 == 19 || i27 == 21 || i27 == 2130706688) && i27 > i19) {
                i19 = i27;
                if (i27 == 19) {
                    break;
                }
            }
            i18++;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "codec: %s, colorFormat: %s", mediaCodecInfo.getName(), java.lang.Integer.valueOf(i19));
        this.f263027e = i19;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "found colorFormat: %s, used %sms", java.lang.Integer.valueOf(this.f263027e), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2));
        if (this.f263027e == 19) {
            this.f263044v = 2;
        } else {
            this.f263044v = 1;
        }
        long elapsedRealtime4 = android.os.SystemClock.elapsedRealtime();
        this.f263031i = android.media.MediaFormat.createVideoFormat("video/avc", this.f263025c, this.f263026d);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "createVideoFormat used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime4));
        if (fp.h.c(23)) {
            try {
                android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType3 = mediaCodecInfo.getCapabilitiesForType("video/avc");
                if (capabilitiesForType3 != null && (codecProfileLevelArr = capabilitiesForType3.profileLevels) != null) {
                    android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel = new android.media.MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.level = 0;
                    codecProfileLevel.profile = 0;
                    for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                        int i28 = codecProfileLevel2.profile;
                        int i29 = codecProfileLevel2.level;
                        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "profile: %s, level: %s", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
                        if ((i28 == 1 || i28 == 2 || i28 == 8) && i28 >= codecProfileLevel.profile && i29 >= codecProfileLevel.level) {
                            codecProfileLevel.profile = i28;
                            codecProfileLevel.level = i29;
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "best profile: %s, level: %s", java.lang.Integer.valueOf(codecProfileLevel.profile), java.lang.Integer.valueOf(codecProfileLevel.level));
                    int i37 = codecProfileLevel.profile;
                    if (i37 > 0 && codecProfileLevel.level >= 256) {
                        this.f263031i.setInteger(com.google.android.gms.common.Scopes.PROFILE, i37);
                        this.f263031i.setInteger(ya.b.LEVEL, 256);
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "trySetProfile error: %s", e17.getMessage());
            }
        }
        try {
            if (fp.h.c(21) && (capabilitiesForType = mediaCodecInfo.getCapabilitiesForType("video/avc")) != null && (encoderCapabilities = capabilitiesForType.getEncoderCapabilities()) != null) {
                if (encoderCapabilities.isBitrateModeSupported(2)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "support cbr bitrate mode");
                    this.f263031i.setInteger("bitrate-mode", 2);
                } else if (encoderCapabilities.isBitrateModeSupported(0)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "support cq bitrate mode");
                    this.f263031i.setInteger("bitrate-mode", 0);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "both cbr and cq bitrate mode not support!");
                }
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "trySetBitRateMode error: %s", e18.getMessage());
        }
        this.f263031i.setInteger(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, this.f263037o);
        this.f263031i.setInteger("frame-rate", this.f263042t);
        this.f263031i.setInteger("color-format", this.f263027e);
        this.f263031i.setInteger("i-frame-interval", this.f263041s);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "mediaFormat: %s", this.f263031i);
        wo.i1 b17 = wo.i1.b(mediaCodecInfo.getName());
        this.f263030h = b17;
        b17.a(this.f263031i, null, null, 1);
        this.f263030h.x();
        return 0;
    }

    public void c(byte[] bArr, boolean z17, long j17) {
        try {
            if (!this.f263038p) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "writeData, not start!");
                return;
            }
            if (this.f263030h == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "encoder is null");
                return;
            }
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            android.os.SystemClock.elapsedRealtime();
            this.f263032j = this.f263030h.k();
            this.f263033k = this.f263030h.n();
            int i17 = 0;
            while (true) {
                wo.i1 i1Var = this.f263030h;
                if (i1Var == null) {
                    break;
                }
                int f17 = i1Var.f(600L);
                this.f263034l = f17;
                if (f17 >= 0 || i17 >= 10) {
                    break;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "video no input available, drain first");
                a();
                i17++;
            }
            if (this.f263030h == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "encoder is null");
                return;
            }
            android.os.SystemClock.elapsedRealtime();
            int i18 = this.f263034l;
            if (i18 >= 0) {
                if (!this.f263038p || z17 || bArr == null) {
                    this.f263040r = true;
                    this.f263030h.p(i18, 0, 0, j17, 4);
                    this.f263039q = true;
                } else {
                    java.nio.ByteBuffer byteBuffer = this.f263032j[i18];
                    byteBuffer.clear();
                    byteBuffer.put(bArr);
                    byteBuffer.position(0);
                    this.f263030h.p(this.f263034l, 0, bArr.length, j17, 0);
                }
            }
            a();
            android.os.SystemClock.elapsedRealtime();
            android.os.SystemClock.elapsedRealtime();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecWriteYUVError");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(440L, 21L, 1L, false);
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "writeData error: %s", e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMSightRemuxMediaCodecEncoder", e17, "", new java.lang.Object[0]);
        }
    }
}
