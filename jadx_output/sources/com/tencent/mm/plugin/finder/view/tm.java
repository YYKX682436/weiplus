package com.tencent.mm.plugin.finder.view;

/* loaded from: classes14.dex */
public final class tm extends android.media.MediaCodec.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.xm f133136a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f133137b;

    public tm(com.tencent.mm.plugin.finder.view.xm xmVar, yz5.l lVar) {
        this.f133136a = xmVar;
        this.f133137b = lVar;
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(android.media.MediaCodec codec, android.media.MediaCodec.CodecException e17) {
        kotlin.jvm.internal.o.g(codec, "codec");
        kotlin.jvm.internal.o.g(e17, "e");
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(android.media.MediaCodec decoder, int i17) {
        kotlin.jvm.internal.o.g(decoder, "decoder");
        com.tencent.mars.xlog.Log.i(this.f133136a.f133342c, "lxl onInputBufferAvailable");
        com.tencent.mm.plugin.finder.view.xm xmVar = this.f133136a;
        synchronized (xmVar.f133343d) {
            if (i17 >= 0) {
                try {
                    java.nio.ByteBuffer inputBuffer = decoder.getInputBuffer(i17);
                    gp.c a17 = xmVar.a();
                    kotlin.jvm.internal.o.d(inputBuffer);
                    int f17 = a17.f(inputBuffer, 0);
                    if (f17 < 0) {
                        com.tencent.mars.xlog.Log.i(xmVar.f133342c, "lxl queueInputBuffer BUFFER_FLAG_END_OF_STREAM");
                        decoder.queueInputBuffer(i17, 0, 0, 0L, 4);
                    } else {
                        decoder.queueInputBuffer(i17, 0, f17, xmVar.a().b(), 0);
                        xmVar.a().a();
                        com.tencent.mars.xlog.Log.i(xmVar.f133342c, "lxl queueInputBuffer " + (xmVar.a().b() / 1000));
                    }
                    if (xmVar.f133354o) {
                        xmVar.f133343d.wait();
                        xmVar.f133354o = false;
                    }
                } finally {
                }
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(android.media.MediaCodec decoder, int i17, android.media.MediaCodec.BufferInfo bufferInfo) {
        kotlin.jvm.internal.o.g(decoder, "decoder");
        kotlin.jvm.internal.o.g(bufferInfo, "bufferInfo");
        com.tencent.mars.xlog.Log.i(this.f133136a.f133342c, "lxl onOutputBufferAvailable");
        try {
            if (i17 == -3 || i17 == -2 || i17 == -1) {
                decoder.releaseOutputBuffer(i17, false);
                return;
            }
            if (i17 >= 0 && (bufferInfo.flags & 4) == 0) {
                long j17 = bufferInfo.presentationTimeUs;
                com.tencent.mm.plugin.finder.view.xm xmVar = this.f133136a;
                long j18 = 1000;
                if (j17 >= xmVar.f133351l * j18) {
                    decoder.releaseOutputBuffer(i17, true);
                    this.f133137b.invoke(java.lang.Long.valueOf(bufferInfo.presentationTimeUs));
                    com.tencent.mars.xlog.Log.i(this.f133136a.f133342c, "lxl releaseOutputBuffer " + (bufferInfo.presentationTimeUs / j18) + ", render!");
                    com.tencent.mm.plugin.finder.view.xm xmVar2 = this.f133136a;
                    synchronized (xmVar2.f133343d) {
                        xmVar2.f133354o = true;
                    }
                } else {
                    com.tencent.mars.xlog.Log.i(xmVar.f133342c, "lxl releaseOutputBuffer " + (bufferInfo.presentationTimeUs / j18) + ", no");
                    decoder.releaseOutputBuffer(i17, false);
                }
                this.f133136a.f133353n = bufferInfo.presentationTimeUs;
                return;
            }
            com.tencent.mars.xlog.Log.i(this.f133136a.f133342c, "lxl releaseOutputBuffer BUFFER_FLAG_END_OF_STREAM");
            decoder.releaseOutputBuffer(i17, false);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f133136a.f133342c, th6, "lxl onOutputBufferAvailable exception", new java.lang.Object[0]);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(android.media.MediaCodec codec, android.media.MediaFormat format) {
        kotlin.jvm.internal.o.g(codec, "codec");
        kotlin.jvm.internal.o.g(format, "format");
    }
}
