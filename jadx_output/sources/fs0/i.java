package fs0;

/* loaded from: classes10.dex */
public final class i extends android.media.MediaCodec.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fs0.l f266255a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266256b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f266257c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hs0.a f266258d;

    public i(fs0.l lVar, java.lang.String str, long j17, hs0.a aVar) {
        this.f266255a = lVar;
        this.f266256b = str;
        this.f266257c = j17;
        this.f266258d = aVar;
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(android.media.MediaCodec codec, android.media.MediaCodec.CodecException e17) {
        kotlin.jvm.internal.o.g(codec, "codec");
        kotlin.jvm.internal.o.g(e17, "e");
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(android.media.MediaCodec codec, int i17) {
        long j17;
        int i18;
        hs0.a aVar = this.f266258d;
        java.lang.String str = this.f266256b;
        fs0.l lVar = this.f266255a;
        kotlin.jvm.internal.o.g(codec, "codec");
        try {
            com.tencent.mars.xlog.Log.i(lVar.f266261u, "onInputBufferAvailable, index:" + i17 + ", audioId:" + str);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            lVar.f266224n = android.os.SystemClock.elapsedRealtime();
            if (i17 < 0) {
                return;
            }
            wo.i1 i1Var = lVar.f266218h;
            java.nio.ByteBuffer j18 = i1Var != null ? i1Var.j(i17) : null;
            if (j18 != null) {
                j18.clear();
            }
            if (j18 == null) {
                return;
            }
            lVar.f266264x = false;
            if (!hs0.a.c(aVar, j18, 0, 2, null)) {
                com.tencent.mars.xlog.Log.i(lVar.f266261u, "read sample end");
                lVar.f266264x = true;
            }
            if (lVar.f266264x) {
                j17 = 0;
                i18 = 0;
            } else {
                int i19 = aVar.f284555i;
                j18.position(0);
                long a17 = aVar.a();
                com.tencent.mars.xlog.Log.i(lVar.f266261u, "sampleTime : " + a17 + ", sampleSize:" + i19 + ", audioId:" + str);
                if (i19 < 0 || a17 >= lVar.f266263w * 1000) {
                    lVar.f266264x = true;
                    com.tencent.mars.xlog.Log.i(lVar.f266261u, "sawInputEOS, audioId:" + str);
                }
                i18 = i19;
                j17 = a17;
            }
            wo.i1 i1Var2 = lVar.f266218h;
            if (i1Var2 != null) {
                i1Var2.p(i17, 0, i18, j17, lVar.f266264x ? 4 : 0);
            }
            if (lVar.f266264x) {
                final yz5.a aVar2 = lVar.f266265y;
                com.tencent.mm.sdk.platformtools.u3.l(new java.lang.Runnable(aVar2) { // from class: fs0.j

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ yz5.a f266259d;

                    {
                        kotlin.jvm.internal.o.g(aVar2, "function");
                        this.f266259d = aVar2;
                    }

                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f266259d.invoke();
                    }
                });
                com.tencent.mm.sdk.platformtools.u3.i(new java.lang.Runnable(aVar2) { // from class: fs0.j

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ yz5.a f266259d;

                    {
                        kotlin.jvm.internal.o.g(aVar2, "function");
                        this.f266259d = aVar2;
                    }

                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f266259d.invoke();
                    }
                }, 3000L);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(lVar.f266261u, e17, "", new java.lang.Object[0]);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(android.media.MediaCodec codec, int i17, android.media.MediaCodec.BufferInfo bufferInfo) {
        java.lang.String str = this.f266256b;
        fs0.l lVar = this.f266255a;
        kotlin.jvm.internal.o.g(codec, "codec");
        kotlin.jvm.internal.o.g(bufferInfo, "bufferInfo");
        try {
            com.tencent.mars.xlog.Log.i(lVar.f266261u, "onOutputBufferAvailable, index:" + i17 + ", bufferInfo:" + bufferInfo + " size:" + bufferInfo.size + ", audioId:" + str);
            if (i17 < 0) {
                wo.i1 i1Var = lVar.f266218h;
                if (i1Var != null) {
                    i1Var.s(i17, false);
                    return;
                }
                return;
            }
            long j17 = bufferInfo.presentationTimeUs;
            com.tencent.mars.xlog.Log.i(lVar.f266261u, "presentationTimeUs : " + j17);
            long j18 = 1000;
            long j19 = this.f266257c;
            if (j17 < j19 * j18 && (bufferInfo.flags & 4) == 0) {
                wo.i1 i1Var2 = lVar.f266218h;
                if (i1Var2 != null) {
                    i1Var2.s(i17, false);
                }
                com.tencent.mars.xlog.Log.i(lVar.f266261u, "decoder pts: " + j17 + ", not reach start: " + (j19 * j18) + ", audioId:" + str);
                return;
            }
            if (bufferInfo.size == 0) {
                com.tencent.mars.xlog.Log.i(lVar.f266261u, "decode zero size:" + str + ", zeroCount:" + lVar.f266262v);
                lVar.f266262v = lVar.f266262v + 1;
                wo.i1 i1Var3 = lVar.f266218h;
                if (i1Var3 != null) {
                    i1Var3.s(i17, false);
                    return;
                }
                return;
            }
            wo.i1 i1Var4 = lVar.f266218h;
            lVar.c(i1Var4 != null ? i1Var4.m(i17) : null, bufferInfo);
            wo.i1 i1Var5 = lVar.f266218h;
            if (i1Var5 != null) {
                i1Var5.s(i17, false);
            }
            long j27 = lVar.f266263w;
            if (j27 * j18 != 1 && j17 >= j27 * j18) {
                com.tencent.mars.xlog.Log.e(lVar.f266261u, "exceed endTimeMs, audioId:" + str);
                lVar.e();
                return;
            }
            if ((bufferInfo.flags & 4) != 0) {
                com.tencent.mars.xlog.Log.i(lVar.f266261u, "receive eos! audioId:" + str);
                lVar.e();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(lVar.f266261u, e17, "", new java.lang.Object[0]);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(android.media.MediaCodec codec, android.media.MediaFormat format) {
        kotlin.jvm.internal.o.g(codec, "codec");
        kotlin.jvm.internal.o.g(format, "format");
        fs0.l lVar = this.f266255a;
        lVar.f266219i = format;
        if (format.containsKey("sample-rate")) {
            android.media.MediaFormat mediaFormat = lVar.f266219i;
            int integer = mediaFormat != null ? mediaFormat.getInteger("sample-rate") : 0;
            if (integer > 0) {
                lVar.f266222l = integer;
            }
        }
        com.tencent.mars.xlog.Log.i(lVar.f266261u, "onOutputFormatChanged:" + lVar.f266219i + ", aacSampleRate:" + lVar.f266222l + ", audioId:" + this.f266256b);
    }
}
