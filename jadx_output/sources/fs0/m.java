package fs0;

/* loaded from: classes10.dex */
public final class m extends fs0.g {

    /* renamed from: x, reason: collision with root package name */
    public final android.media.MediaCodec.BufferInfo f266266x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f266267y;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f266268z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(long j17, long j18, hs0.a mediaExtractorWrapper, android.view.Surface surface, int i17, boolean z17, yz5.l lVar) {
        super(j17, j18, mediaExtractorWrapper, surface, i17, z17);
        kotlin.jvm.internal.o.g(mediaExtractorWrapper, "mediaExtractorWrapper");
        this.f266266x = new android.media.MediaCodec.BufferInfo();
        this.f266267y = "MicroMsg.MediaCodecTransDecoder";
        try {
            this.f266237g = mediaExtractorWrapper.f284551e;
            java.lang.String b17 = mediaExtractorWrapper.b();
            if (r26.i0.p("video/dolby-vision", b17, true) && !ph3.f.f()) {
                b17 = "video/hevc";
            }
            wo.i1 c17 = wo.i1.c(b17);
            this.f266236f = c17;
            c17.a(this.f266237g, surface, null, 0);
            wo.i1 i1Var = this.f266236f;
            kotlin.jvm.internal.o.d(i1Var);
            i1Var.x();
            if (lVar != null) {
                lVar.invoke(this);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f266267y, e17, "create decoder error:" + e17.getMessage(), new java.lang.Object[0]);
            throw new java.lang.IllegalStateException("init decoder error");
        }
    }

    @Override // fs0.g
    public void e() {
        boolean z17;
        do {
            z17 = true;
            try {
                synchronized (this.f266244n) {
                    if (this.f266245o) {
                        com.tencent.mars.xlog.Log.i(this.f266267y, "inputDecoder already finished");
                    }
                }
                com.tencent.mars.xlog.Log.i(this.f266267y, "inputDecoder");
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                wo.i1 i1Var = this.f266236f;
                kotlin.jvm.internal.o.d(i1Var);
                java.nio.ByteBuffer[] k17 = i1Var.k();
                if (k17 == null) {
                    z17 = false;
                } else {
                    wo.i1 i1Var2 = this.f266236f;
                    kotlin.jvm.internal.o.d(i1Var2);
                    int f17 = i1Var2.f(60000L);
                    for (int i17 = 0; f17 < 0 && i17 < 15; i17++) {
                        if (f()) {
                            break;
                        }
                        wo.i1 i1Var3 = this.f266236f;
                        kotlin.jvm.internal.o.d(i1Var3);
                        f17 = i1Var3.f(60000L);
                    }
                    this.f266268z = false;
                    if (f17 >= 0) {
                        java.nio.ByteBuffer byteBuffer = k17[f17];
                        byteBuffer.clear();
                        hs0.a aVar = this.f266233c;
                        kotlin.jvm.internal.o.d(aVar);
                        if (hs0.a.c(aVar, byteBuffer, 0, 2, null)) {
                            long a17 = this.f266233c.a();
                            int i18 = this.f266233c.f284555i;
                            byteBuffer.position(0);
                            com.tencent.mars.xlog.Log.i(this.f266267y, "sampleTime : " + a17 + " us");
                            if (i18 < 0 || a17 >= this.f266232b * 1000) {
                                this.f266268z = true;
                                com.tencent.mars.xlog.Log.i(this.f266267y, "sawInputEOS");
                            }
                            wo.i1 i1Var4 = this.f266236f;
                            kotlin.jvm.internal.o.d(i1Var4);
                            i1Var4.p(f17, 0, i18, a17, this.f266268z ? 4 : 0);
                        } else {
                            com.tencent.mars.xlog.Log.i(this.f266267y, "read sample end");
                        }
                    } else {
                        com.tencent.mars.xlog.Log.w(this.f266267y, "input buffer not available");
                    }
                    boolean f18 = f();
                    com.tencent.mars.xlog.Log.i(this.f266267y, "inputDecoder cost " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                    if (f18) {
                        com.tencent.mars.xlog.Log.i(this.f266267y, "drainDecoder eos");
                    } else {
                        z17 = this.f266268z;
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(this.f266267y, e17, "inputDecoder error", new java.lang.Object[0]);
                if (this.f266249s) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxDecodeFrameFailed");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 76L, 1L);
                }
            }
        } while (!z17);
        com.tencent.mars.xlog.Log.i(this.f266267y, "inputDecoder end");
        try {
            synchronized (this.f266244n) {
                if (this.f266245o) {
                    com.tencent.mars.xlog.Log.i(this.f266267y, "drainDecoder already finished");
                }
            }
            com.tencent.mars.xlog.Log.i(this.f266267y, "sendDecoderEOS");
            wo.i1 i1Var5 = this.f266236f;
            kotlin.jvm.internal.o.d(i1Var5);
            java.nio.ByteBuffer[] k18 = i1Var5.k();
            wo.i1 i1Var6 = this.f266236f;
            kotlin.jvm.internal.o.d(i1Var6);
            int f19 = i1Var6.f(60000L);
            while (true) {
                if (f19 >= 0) {
                    if (f19 >= 0) {
                        java.nio.ByteBuffer byteBuffer2 = k18[f19];
                        byteBuffer2.clear();
                        hs0.a aVar2 = this.f266233c;
                        kotlin.jvm.internal.o.d(aVar2);
                        hs0.a.c(aVar2, byteBuffer2, 0, 2, null);
                        long a18 = this.f266233c.a();
                        byteBuffer2.position(0);
                        if (f19 >= 0) {
                            wo.i1 i1Var7 = this.f266236f;
                            kotlin.jvm.internal.o.d(i1Var7);
                            i1Var7.p(f19, 0, 0, a18, 4);
                        }
                    }
                    f();
                } else {
                    if (f()) {
                        break;
                    }
                    wo.i1 i1Var8 = this.f266236f;
                    kotlin.jvm.internal.o.d(i1Var8);
                    f19 = i1Var8.f(60000L);
                }
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f266267y, e18, "sendDecoderEOS error", new java.lang.Object[0]);
        }
        c();
        yz5.a aVar3 = this.f266239i;
        if (aVar3 != null) {
            aVar3.invoke();
        }
    }

    public final boolean f() {
        yz5.l lVar;
        try {
            com.tencent.mars.xlog.Log.i(this.f266267y, "drainDecoder");
            synchronized (this.f266244n) {
                if (this.f266245o) {
                    com.tencent.mars.xlog.Log.i(this.f266267y, "drainDecoder already finished");
                }
            }
            wo.i1 i1Var = this.f266236f;
            kotlin.jvm.internal.o.d(i1Var);
            int g17 = i1Var.g(this.f266266x, 100L);
            while (true) {
                if (g17 == -1) {
                    com.tencent.mars.xlog.Log.i(this.f266267y, "no output from decoder available, break");
                    break;
                }
                if (g17 == -3) {
                    com.tencent.mars.xlog.Log.i(this.f266267y, "decoder output buffers changed");
                    break;
                }
                if (g17 == -2) {
                    wo.i1 i1Var2 = this.f266236f;
                    kotlin.jvm.internal.o.d(i1Var2);
                    this.f266237g = i1Var2.o();
                    com.tencent.mars.xlog.Log.i(this.f266267y, "decoder output format changed: " + this.f266237g);
                    android.media.MediaFormat mediaFormat = this.f266237g;
                    if (mediaFormat != null && (lVar = this.f266240j) != null) {
                        lVar.invoke(mediaFormat);
                    }
                } else {
                    if (g17 < 0) {
                        com.tencent.mars.xlog.Log.w(this.f266267y, "unexpected result from decoder.dequeueOutputBuffer: " + g17);
                        break;
                    }
                    long j17 = this.f266266x.presentationTimeUs;
                    com.tencent.mars.xlog.Log.i(this.f266267y, "presentationTimeUs : " + j17);
                    long j18 = (long) 1000;
                    if (j17 < this.f266231a * j18 && (this.f266266x.flags & 4) == 0) {
                        wo.i1 i1Var3 = this.f266236f;
                        kotlin.jvm.internal.o.d(i1Var3);
                        i1Var3.s(g17, false);
                        com.tencent.mars.xlog.Log.i(this.f266267y, "decoder pts: " + j17 + ", not reach start: " + (this.f266231a * j18));
                        return false;
                    }
                    android.media.MediaCodec.BufferInfo bufferInfo = this.f266266x;
                    if (bufferInfo.size != 0) {
                        b(g17, bufferInfo);
                        long j19 = this.f266232b;
                        if (j19 * j18 != 1 && j17 >= j19 * j18) {
                            com.tencent.mars.xlog.Log.e(this.f266267y, "exceed endTimeMs");
                            return true;
                        }
                        if ((this.f266266x.flags & 4) == 0) {
                            return false;
                        }
                        try {
                            wo.i1 i1Var4 = this.f266236f;
                            kotlin.jvm.internal.o.d(i1Var4);
                            i1Var4.y();
                            wo.i1 i1Var5 = this.f266236f;
                            kotlin.jvm.internal.o.d(i1Var5);
                            i1Var5.q();
                        } catch (java.lang.Exception unused) {
                        }
                        return true;
                    }
                    wo.i1 i1Var6 = this.f266236f;
                    kotlin.jvm.internal.o.d(i1Var6);
                    i1Var6.s(g17, false);
                    wo.i1 i1Var7 = this.f266236f;
                    kotlin.jvm.internal.o.d(i1Var7);
                    g17 = i1Var7.g(this.f266266x, 100L);
                    if (g17 < 0) {
                        break;
                    }
                }
            }
            return false;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f266267y, e17, "drainDecoder error", new java.lang.Object[0]);
            if (this.f266249s) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxDecodeFrameFailed");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 76L, 1L);
            }
            return false;
        }
    }
}
