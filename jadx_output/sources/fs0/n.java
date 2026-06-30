package fs0;

/* loaded from: classes10.dex */
public final class n extends android.media.MediaCodec.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fs0.o f266269a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hs0.a f266270b;

    public n(fs0.o oVar, hs0.a aVar) {
        this.f266269a = oVar;
        this.f266270b = aVar;
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(android.media.MediaCodec codec, android.media.MediaCodec.CodecException e17) {
        kotlin.jvm.internal.o.g(codec, "codec");
        kotlin.jvm.internal.o.g(e17, "e");
        fs0.o oVar = this.f266269a;
        com.tencent.mars.xlog.Log.e(oVar.f266271x, "onError, codec:" + codec + ", " + e17.isRecoverable() + ' ' + e17.isTransient() + ' ' + e17.getDiagnosticInfo());
        if (oVar.f266249s) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxDecodeFrameFailedAsyncOnError");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 80L, 1L);
        }
        if (e17.isRecoverable() || e17.isTransient()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxDecodeFrameFailedAsyncOnErrorStop");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 80L, 1L);
        oVar.c();
        yz5.a aVar = oVar.f266241k;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(android.media.MediaCodec codec, int i17) {
        kotlin.jvm.internal.o.g(codec, "codec");
        com.tencent.mars.xlog.Log.i(this.f266269a.f266271x, "onInputBufferAvailable, index:" + i17);
        if (i17 >= 0) {
            try {
                java.nio.ByteBuffer inputBuffer = codec.getInputBuffer(i17);
                kotlin.jvm.internal.o.e(inputBuffer, "null cannot be cast to non-null type java.nio.ByteBuffer");
                inputBuffer.clear();
                if (!hs0.a.c(this.f266270b, inputBuffer, 0, 2, null)) {
                    com.tencent.mars.xlog.Log.i(this.f266269a.f266271x, "read sample end");
                    this.f266269a.A = true;
                    wo.i1 i1Var = this.f266269a.f266236f;
                    kotlin.jvm.internal.o.d(i1Var);
                    i1Var.p(i17, 0, 0, 0L, 4);
                    return;
                }
                long a17 = this.f266270b.a();
                int i18 = this.f266270b.f284555i;
                com.tencent.mars.xlog.Log.i(this.f266269a.f266271x, "input sampleTime:" + a17 + ", sampleSize:" + i18);
                inputBuffer.position(0);
                wo.i1 i1Var2 = this.f266269a.f266236f;
                kotlin.jvm.internal.o.d(i1Var2);
                i1Var2.p(i17, 0, i18, a17, 0);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(this.f266269a.f266271x, e17, "onInputBufferAvailable error", new java.lang.Object[0]);
                if (this.f266269a.f266249s) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxDecodeFrameFailed");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 76L, 1L);
                }
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(android.media.MediaCodec codec, int i17, android.media.MediaCodec.BufferInfo bufferInfo) {
        kotlin.jvm.internal.o.g(codec, "codec");
        kotlin.jvm.internal.o.g(bufferInfo, "bufferInfo");
        com.tencent.mars.xlog.Log.i(this.f266269a.f266271x, "onOutputBufferAvailable, index:" + i17 + ", bufferInfo:" + bufferInfo + " size:" + bufferInfo.size + ", isFinished:" + this.f266269a.f266245o);
        try {
            if (i17 < 0) {
                wo.i1 i1Var = this.f266269a.f266236f;
                kotlin.jvm.internal.o.d(i1Var);
                i1Var.s(i17, false);
                return;
            }
            long j17 = bufferInfo.presentationTimeUs;
            com.tencent.mars.xlog.Log.i(this.f266269a.f266271x, "presentationTimeUs : " + j17);
            fs0.o oVar = this.f266269a;
            long j18 = (long) 1000;
            if (j17 < oVar.f266231a * j18 && (bufferInfo.flags & 4) == 0) {
                wo.i1 i1Var2 = oVar.f266236f;
                kotlin.jvm.internal.o.d(i1Var2);
                i1Var2.s(i17, false);
                com.tencent.mars.xlog.Log.i(this.f266269a.f266271x, "decoder pts: " + j17 + ", not reach start: " + (this.f266269a.f266231a * j18));
                return;
            }
            oVar.b(i17, bufferInfo);
            fs0.o oVar2 = this.f266269a;
            long j19 = oVar2.f266232b * j18;
            if (j19 != 1 && j17 >= j19) {
                com.tencent.mars.xlog.Log.e(oVar2.f266271x, "exceed endTimeMs");
                fs0.o oVar3 = this.f266269a;
                com.tencent.mars.xlog.Log.i(oVar3.f266271x, "onDecodeEnd ");
                if (!oVar3.f266273z) {
                    yz5.a aVar = oVar3.f266239i;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    oVar3.f266273z = true;
                }
                this.f266269a.c();
                return;
            }
            if ((bufferInfo.flags & 4) != 0 || oVar2.A) {
                com.tencent.mars.xlog.Log.i(this.f266269a.f266271x, "receive eos!");
                fs0.o oVar4 = this.f266269a;
                com.tencent.mars.xlog.Log.i(oVar4.f266271x, "onDecodeEnd ");
                if (!oVar4.f266273z) {
                    yz5.a aVar2 = oVar4.f266239i;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                    oVar4.f266273z = true;
                }
                this.f266269a.c();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f266269a.f266271x, e17, "onOutputBufferAvailable error", new java.lang.Object[0]);
            if (this.f266269a.f266249s) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxDecodeFrameFailed");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 76L, 1L);
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(android.media.MediaCodec codec, android.media.MediaFormat format) {
        yz5.l lVar;
        kotlin.jvm.internal.o.g(codec, "codec");
        kotlin.jvm.internal.o.g(format, "format");
        fs0.o oVar = this.f266269a;
        oVar.f266237g = format;
        com.tencent.mars.xlog.Log.i(oVar.f266271x, "decoder output format changed: " + oVar.f266237g);
        android.media.MediaFormat mediaFormat = oVar.f266237g;
        if (mediaFormat == null || (lVar = oVar.f266240j) == null) {
            return;
        }
        lVar.invoke(mediaFormat);
    }
}
