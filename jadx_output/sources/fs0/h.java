package fs0;

/* loaded from: classes10.dex */
public final class h extends fs0.f {

    /* renamed from: u, reason: collision with root package name */
    public boolean f266254u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(hs0.a mediaExtractorWrapper, java.lang.String audioId, long j17, long j18, yz5.p pVar, yz5.a aVar) {
        super(mediaExtractorWrapper, audioId, j17, j18, pVar, aVar);
        kotlin.jvm.internal.o.g(mediaExtractorWrapper, "mediaExtractorWrapper");
        kotlin.jvm.internal.o.g(audioId, "audioId");
    }

    @Override // fs0.f
    public void d() {
        boolean z17;
        long j17;
        int i17;
        wo.i1 i1Var = this.f266218h;
        if (i1Var != null) {
            i1Var.x();
        }
        while (!this.f266254u && !this.f266220j) {
            try {
                synchronized (this.f266223m) {
                    if (this.f266220j) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACDecoder", "readNextSample decoder stop");
                    }
                }
                wo.i1 i1Var2 = this.f266218h;
                if (i1Var2 != null) {
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    this.f266224n = android.os.SystemClock.elapsedRealtime();
                    int f17 = i1Var2.f(100L);
                    if (f17 < 0) {
                        f();
                    }
                    if (f17 >= 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACDecoder", "inputIndex: " + f17);
                        this.f266224n = android.os.SystemClock.elapsedRealtime();
                        java.nio.ByteBuffer byteBuffer = i1Var2.k()[f17];
                        if (byteBuffer != null) {
                            byteBuffer.clear();
                        }
                        hs0.a aVar = this.f266211a;
                        java.lang.Boolean bool = null;
                        if (aVar != null) {
                            kotlin.jvm.internal.o.d(byteBuffer);
                            bool = java.lang.Boolean.valueOf(hs0.a.c(aVar, byteBuffer, 0, 2, null));
                        }
                        boolean b17 = kotlin.jvm.internal.o.b(bool, java.lang.Boolean.FALSE);
                        boolean z19 = true;
                        if (b17) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACDecoder", "read sample end");
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (z17) {
                            j17 = 0;
                            i17 = 0;
                        } else {
                            hs0.a aVar2 = this.f266211a;
                            i17 = aVar2 != null ? aVar2.f284555i : 0;
                            if (byteBuffer != null) {
                                byteBuffer.position(0);
                            }
                            hs0.a aVar3 = this.f266211a;
                            j17 = aVar3 != null ? aVar3.a() : -1L;
                            com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACDecoder", "sampleTime : " + j17 + ", sampleSize:" + i17);
                            if (i17 >= 0 && j17 < this.f266214d * 1000) {
                                z19 = z17;
                                z17 = z19;
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACDecoder", "sawInputEOS");
                            z17 = z19;
                        }
                        i1Var2.p(f17, 0, i17, j17, z17 ? 4 : 0);
                        if (z17) {
                            e();
                        }
                        f();
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecAACDecoder", e17, "", new java.lang.Object[0]);
            }
        }
        e();
    }

    public final void f() {
        try {
            synchronized (this.f266223m) {
                try {
                    if (this.f266220j) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACDecoder", "drainDecoder, decoder is stop");
                        return;
                    }
                    wo.i1 i1Var = this.f266218h;
                    if (i1Var != null) {
                        android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
                        this.f266226p = bufferInfo;
                        int g17 = i1Var.g(bufferInfo, 60000L);
                        do {
                            if (g17 == -2) {
                                android.media.MediaFormat o17 = i1Var.o();
                                this.f266219i = o17;
                                if (o17 != null && o17.containsKey("sample-rate")) {
                                    android.media.MediaFormat mediaFormat = this.f266219i;
                                    int integer = mediaFormat != null ? mediaFormat.getInteger("sample-rate") : 0;
                                    if (integer > 0) {
                                        this.f266222l = integer;
                                    }
                                }
                                com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACDecoder", "onOutputFormatChanged:" + this.f266219i + ", aacSampleRate:" + this.f266222l + ", audioId:" + this.f266212b);
                            } else if (g17 >= 0) {
                                java.nio.ByteBuffer byteBuffer = i1Var.n()[g17];
                                if (byteBuffer == null) {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.MediaCodecAACDecoder", "ERROR, retrieve decoderOutputBuffer is null!!");
                                    return;
                                }
                                long j17 = this.f266226p.presentationTimeUs;
                                com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACDecoder", "presentationTimeUs : " + j17);
                                long j18 = (long) 1000;
                                if (j17 < this.f266213c * j18 && (this.f266226p.flags & 4) == 0) {
                                    i1Var.s(g17, false);
                                    com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACDecoder", "decoder pts: " + j17 + ", not reach start: " + (this.f266213c * j18));
                                    return;
                                }
                                android.media.MediaCodec.BufferInfo bufferInfo2 = this.f266226p;
                                if (bufferInfo2.size > 0) {
                                    c(byteBuffer, bufferInfo2);
                                }
                                i1Var.s(g17, false);
                                long j19 = this.f266214d;
                                if (j19 * j18 != 1 && j17 >= j19 * j18) {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.MediaCodecAACDecoder", "exceed endTimeMs");
                                    e();
                                    return;
                                } else if ((this.f266226p.flags & 4) != 0) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACDecoder", "receive EOS!");
                                    e();
                                    return;
                                }
                            }
                            g17 = i1Var.g(this.f266226p, 60000L);
                        } while (g17 >= 0);
                    }
                } finally {
                }
            }
        } catch (java.lang.Exception e17) {
            this.f266254u = true;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecAACDecoder", e17, "", new java.lang.Object[0]);
        }
    }
}
