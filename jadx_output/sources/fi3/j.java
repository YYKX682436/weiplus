package fi3;

/* loaded from: classes10.dex */
public class j implements fi3.a {

    /* renamed from: a, reason: collision with root package name */
    public gp.c f263010a;

    /* renamed from: b, reason: collision with root package name */
    public fi3.p f263011b;

    /* renamed from: c, reason: collision with root package name */
    public long f263012c;

    /* renamed from: d, reason: collision with root package name */
    public long f263013d;

    /* renamed from: e, reason: collision with root package name */
    public android.media.MediaFormat f263014e;

    /* renamed from: f, reason: collision with root package name */
    public wo.i1 f263015f;

    /* renamed from: i, reason: collision with root package name */
    public int f263018i;

    /* renamed from: j, reason: collision with root package name */
    public int f263019j;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f263020k;

    /* renamed from: g, reason: collision with root package name */
    public final android.media.MediaCodec.BufferInfo f263016g = new android.media.MediaCodec.BufferInfo();

    /* renamed from: h, reason: collision with root package name */
    public int f263017h = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f263021l = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f263022m = false;

    @Override // fi3.a
    public android.graphics.Point a() {
        return new android.graphics.Point(this.f263014e.getInteger("width"), this.f263014e.getInteger("height"));
    }

    @Override // fi3.a
    public void b(fi3.p pVar) {
        this.f263011b = pVar;
    }

    @Override // fi3.a
    public void c(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "setFrameDropInterval: %s", java.lang.Integer.valueOf(i17));
        this.f263018i = i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x011b, code lost:
    
        if (g() != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0065, code lost:
    
        if (r14 < 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0067, code lost:
    
        r3 = r3[r14];
        r3.clear();
        r20.f263019j = r2.f(r3, 0);
        r3.position(0);
        r17 = r2.b();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "sampleTime: %s", java.lang.Long.valueOf(r17));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0088, code lost:
    
        if (r20.f263019j < 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008f, code lost:
    
        if (r17 < (r20.f263013d * 1000)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0092, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0095, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "sawInputEOS: %s", java.lang.Boolean.valueOf(r2));
        r13 = r20.f263015f;
        r3 = r20.f263019j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a7, code lost:
    
        if (r2 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a9, code lost:
    
        r19 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00af, code lost:
    
        r13.p(r14, 0, r3, r17, r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b9, code lost:
    
        r3 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        r11 = android.os.SystemClock.elapsedRealtime();
        r3 = g();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "drain cost2 %d", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d5, code lost:
    
        if (r3 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ad, code lost:
    
        r19 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0094, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b5, code lost:
    
        com.tencent.mars.xlog.Log.w("MicroMsg.MMSightRemuxMediaCodecDecoder", "input buffer not available");
        r2 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f0 A[EDGE_INSN: B:25:0x00f0->B:11:0x00f0 BREAK  A[LOOP:0: B:2:0x0007->B:24:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00db  */
    @Override // fi3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fi3.j.d():void");
    }

    @Override // fi3.a
    public int e() {
        int integer = this.f263014e.getInteger("color-format");
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "src color format: %s", java.lang.Integer.valueOf(integer));
        return integer != 19 ? 1 : 2;
    }

    @Override // fi3.a
    public int f(java.lang.String str, long j17, long j18, int i17) {
        android.media.MediaCodecInfo mediaCodecInfo;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "initDecoder, srcFilePath: %s, startTime: %s, endTime: %s, videoFps: %s", str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i17));
            try {
                gp.c cVar = new gp.c();
                this.f263010a = cVar;
                cVar.k(str);
                int i18 = 0;
                while (true) {
                    if (i18 >= this.f263010a.d()) {
                        break;
                    }
                    android.media.MediaFormat e17 = this.f263010a.e(i18);
                    if (e17.getString("mime").toLowerCase().startsWith("video/")) {
                        this.f263017h = i18;
                        this.f263014e = e17;
                        break;
                    }
                    i18++;
                }
                int i19 = this.f263017h;
                if (i19 < 0) {
                    return -1;
                }
                this.f263012c = j17;
                this.f263013d = j18;
                this.f263010a.i(i19);
                java.lang.String string = this.f263014e.getString("mime");
                this.f263015f = wo.i1.c(string);
                int codecCount = android.media.MediaCodecList.getCodecCount();
                int i27 = 0;
                loop1: while (true) {
                    if (i27 >= codecCount) {
                        mediaCodecInfo = null;
                        break;
                    }
                    mediaCodecInfo = android.media.MediaCodecList.getCodecInfoAt(i27);
                    if (!mediaCodecInfo.isEncoder()) {
                        for (java.lang.String str2 : mediaCodecInfo.getSupportedTypes()) {
                            if (str2.equalsIgnoreCase(string)) {
                                break loop1;
                            }
                        }
                    }
                    i27++;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "found codec: %s", mediaCodecInfo);
                if (mediaCodecInfo != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "codec name: %s", mediaCodecInfo.getName());
                    int h17 = h(mediaCodecInfo, string);
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "found colorFormat: %s", java.lang.Integer.valueOf(h17));
                    this.f263014e.setInteger("color-format", h17);
                }
                this.f263015f.a(this.f263014e, null, null, 0);
                this.f263015f.x();
                return 0;
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMSightRemuxMediaCodecDecoder", e18, "Init decoder failed : %s", e18.getMessage());
            }
        }
        return -1;
    }

    public boolean g() {
        wo.i1 i1Var = this.f263015f;
        if (i1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightRemuxMediaCodecDecoder", "drainDecoder, decoder is null");
            return true;
        }
        java.nio.ByteBuffer[] n17 = i1Var.n();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "decoderOutputByteBuffers length: %s", java.lang.Integer.valueOf(n17.length));
        wo.i1 i1Var2 = this.f263015f;
        android.media.MediaCodec.BufferInfo bufferInfo = this.f263016g;
        int g17 = i1Var2.g(bufferInfo, 60000L);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "outputBufferIndex-->" + g17);
        while (true) {
            if (g17 == -1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "no output from decoder available, break");
                break;
            }
            if (g17 == -3) {
                n17 = this.f263015f.n();
                com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "decoder output buffers changed");
            } else if (g17 == -2) {
                this.f263014e = this.f263015f.o();
                com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "decoder output format changed: " + this.f263014e);
            } else if (g17 < 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMSightRemuxMediaCodecDecoder", "unexpected result from decoder.dequeueOutputBuffer: " + g17);
            } else {
                java.nio.ByteBuffer byteBuffer = n17[g17];
                if (byteBuffer == null) {
                    break;
                }
                long j17 = bufferInfo.presentationTimeUs;
                if (j17 < this.f263012c * 1000 && (bufferInfo.flags & 4) == 0) {
                    this.f263015f.s(g17, false);
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "decoder pts: %s, not reach start: %s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(this.f263012c * 1000));
                    return false;
                }
                if (bufferInfo.size != 0) {
                    byteBuffer.position(bufferInfo.offset);
                    byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    android.os.SystemClock.elapsedRealtime();
                    int i17 = this.f263021l + 1;
                    this.f263021l = i17;
                    int i18 = this.f263018i;
                    if (i18 <= 1 || i17 % i18 != 0) {
                        if (this.f263020k == null) {
                            this.f263020k = new byte[byteBuffer.remaining()];
                        }
                        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        try {
                            this.f263014e = this.f263015f.o();
                        } catch (java.lang.Exception unused) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightRemuxMediaCodecDecoder", "get output format error");
                        }
                        byteBuffer.get(this.f263020k, 0, byteBuffer.remaining());
                        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "processDecodeOutputBuffer, byteBuffer: %s, bufferInfo: %s, size: %d cost %d", byteBuffer, bufferInfo, java.lang.Integer.valueOf(bufferInfo.size), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                        fi3.p pVar = this.f263011b;
                        if (pVar != null) {
                            long j18 = this.f263013d;
                            boolean z18 = j18 != 1 && bufferInfo.presentationTimeUs >= j18 * 1000;
                            byte[] bArr = this.f263020k;
                            pVar.a(bArr, bArr == null || this.f263022m || z18, bufferInfo.presentationTimeUs / 1000);
                        }
                    }
                    android.os.SystemClock.elapsedRealtime();
                    this.f263015f.s(g17, false);
                    long j19 = this.f263013d;
                    if (j19 != 1 && j17 >= j19 * 1000) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.MMSightRemuxMediaCodecDecoder", "exceed endTimeMs");
                        this.f263022m = true;
                        return true;
                    }
                    if ((bufferInfo.flags & 4) == 0) {
                        return false;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "receive end of stream");
                    try {
                        this.f263015f.y();
                        this.f263015f.q();
                        this.f263022m = true;
                        this.f263015f = null;
                        return true;
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.MMSightRemuxMediaCodecDecoder", "stop and release decoder error: %s", e17.getMessage());
                        return true;
                    }
                }
                this.f263015f.s(g17, false);
            }
            g17 = this.f263015f.g(bufferInfo, 60000L);
            if (g17 < 0) {
                break;
            }
        }
        return false;
    }

    public int h(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "selectColorFormat, mimeType: %s, codecInfo: %s", str, mediaCodecInfo);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "getCapabilitiesForType used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "color format length: %s", java.lang.Integer.valueOf(capabilitiesForType.colorFormats.length));
        int i17 = 0;
        int i18 = 0;
        while (true) {
            int[] iArr = capabilitiesForType.colorFormats;
            if (i17 >= iArr.length) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "codec: %s, colorFormat: %s", mediaCodecInfo.getName(), java.lang.Integer.valueOf(i18));
                return i18;
            }
            int i19 = iArr[i17];
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "capabilities colorFormat: %s", java.lang.Integer.valueOf(i19));
            if ((i19 == 19 || i19 == 21) && (i19 > i18 || i19 == 21)) {
                i18 = i19;
            }
            i17++;
        }
    }
}
