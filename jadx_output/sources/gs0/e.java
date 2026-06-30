package gs0;

/* loaded from: classes10.dex */
public final class e extends android.media.MediaCodec.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gs0.h f274983a;

    public e(gs0.h hVar) {
        this.f274983a = hVar;
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(android.media.MediaCodec codec, android.media.MediaCodec.CodecException e17) {
        kotlin.jvm.internal.o.g(codec, "codec");
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mars.xlog.Log.e("MicroMsg.MediaCodecAACEncoderAsync", "onError, e:" + e17.getMessage() + ", " + e17);
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(android.media.MediaCodec codec, int i17) {
        boolean z17;
        kotlin.jvm.internal.o.g(codec, "codec");
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACEncoderAsync", "has input buffer " + i17);
            if (this.f274983a.f274986i.size() == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACEncoderAsync", "current data is null");
                this.f274983a.f274987j.add(java.lang.Integer.valueOf(i17));
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACEncoderAsync", "has input buffer avaiable" + i17);
            if (this.f274983a.f274967e) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACEncoderAsync", "sendDataToEncoder end now");
                return;
            }
            gs0.h hVar = this.f274983a;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            hVar.f274968f = android.os.SystemClock.elapsedRealtime();
            if (i17 < 0) {
                return;
            }
            java.util.List list = this.f274983a.f274986i;
            kotlin.jvm.internal.o.f(list, "access$getInputDataSource$p(...)");
            gs0.d dVar = (gs0.d) kz5.n0.X(list);
            byte[] bArr = dVar.f274980a;
            long j17 = dVar.f274981b;
            boolean z19 = dVar.f274982c;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("encode data, pts:");
            sb6.append(j17);
            sb6.append(", isLast:");
            sb6.append(z19);
            sb6.append(", pcmData:");
            sb6.append(bArr != null ? java.lang.Integer.valueOf(bArr.length) : null);
            sb6.append(", inputDataSource.size:");
            sb6.append(this.f274983a.f274986i.size());
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACEncoderAsync", sb6.toString());
            if (bArr != null && i17 >= 0) {
                java.nio.ByteBuffer j18 = this.f274983a.f274965c.j(i17);
                if (j18 != null) {
                    j18.clear();
                }
                if (j18 != null) {
                    j18.position(0);
                }
                if (j18 != null) {
                    j18.put(bArr);
                }
                if (z19) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACEncoderAsync", "last, send EOS and try delay stop encoder");
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (z17) {
                    this.f274983a.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACEncoderAsync", "EOS received in sendAudioToEncoder");
                    this.f274983a.f274965c.p(i17, 0, bArr.length, j17, 4);
                    final yz5.a aVar = this.f274983a.f274990m;
                    com.tencent.mm.sdk.platformtools.u3.l(new java.lang.Runnable(aVar) { // from class: gs0.f

                        /* renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ yz5.a f274984d;

                        {
                            kotlin.jvm.internal.o.g(aVar, "function");
                            this.f274984d = aVar;
                        }

                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.f274984d.invoke();
                        }
                    });
                    com.tencent.mm.sdk.platformtools.u3.i(new java.lang.Runnable(aVar) { // from class: gs0.f

                        /* renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ yz5.a f274984d;

                        {
                            kotlin.jvm.internal.o.g(aVar, "function");
                            this.f274984d = aVar;
                        }

                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.f274984d.invoke();
                        }
                    }, 2000L);
                } else {
                    this.f274983a.f274965c.p(i17, 0, bArr.length, j17, 0);
                }
                this.f274983a.f274986i.remove(dVar);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecAACEncoderAsync", e17, "onInputBufferAvailable error", new java.lang.Object[0]);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(android.media.MediaCodec codec, int i17, android.media.MediaCodec.BufferInfo info) {
        kotlin.jvm.internal.o.g(codec, "codec");
        kotlin.jvm.internal.o.g(info, "info");
        if (i17 == -1) {
            return;
        }
        gs0.h hVar = this.f274983a;
        try {
            if (i17 == -2) {
                android.media.MediaFormat o17 = hVar.f274965c.o();
                kotlin.jvm.internal.o.f(o17, "getOutputFormat(...)");
                hVar.getClass();
                hVar.f274966d = o17;
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACEncoderAsync", "dstMediaFormat change: %s", hVar.f274966d);
                return;
            }
            if (i17 < 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MediaCodecAACEncoderAsync", "unexpected encoderOutputBufferIndex: %s", java.lang.Integer.valueOf(i17));
                return;
            }
            if ((info.flags & 2) != 0) {
                hVar.getClass();
                hVar.getClass();
                info.size = 0;
            }
            hVar.a(hVar.f274965c.m(i17), info);
            hVar.f274965c.s(i17, false);
            if ((info.flags & 4) != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACEncoderAsync", "receive EOS!");
                hVar.b();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecAACEncoderAsync", e17, "drainEncoder error: %s", e17.getMessage());
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(android.media.MediaCodec codec, android.media.MediaFormat format) {
        kotlin.jvm.internal.o.g(codec, "codec");
        kotlin.jvm.internal.o.g(format, "format");
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACEncoderAsync", "onOutputFormatChanged: " + format);
    }
}
