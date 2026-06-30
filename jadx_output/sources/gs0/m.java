package gs0;

/* loaded from: classes10.dex */
public final class m extends android.media.MediaCodec.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gs0.p f275002a;

    public m(gs0.p pVar) {
        this.f275002a = pVar;
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(android.media.MediaCodec codec, android.media.MediaCodec.CodecException e17) {
        kotlin.jvm.internal.o.g(codec, "codec");
        kotlin.jvm.internal.o.g(e17, "e");
        gs0.p pVar = this.f275002a;
        com.tencent.mars.xlog.Log.e(pVar.f275005j, "codec Error, e:" + e17);
        if (pVar.f274976f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxEncodeFrameFailedAsyncOnError");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 81L, 1L);
        }
        pVar.f();
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(android.media.MediaCodec codec, int i17) {
        kotlin.jvm.internal.o.g(codec, "codec");
        com.tencent.mars.xlog.Log.i(this.f275002a.f275005j, "onInputBufferAvailable, index:" + i17);
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(android.media.MediaCodec codec, int i17, android.media.MediaCodec.BufferInfo bufferInfo) {
        kotlin.jvm.internal.o.g(codec, "codec");
        kotlin.jvm.internal.o.g(bufferInfo, "bufferInfo");
        gs0.p pVar = this.f275002a;
        java.lang.String str = pVar.f275005j;
        try {
            if (i17 < 0) {
                pVar.f275006k.s(i17, false);
                return;
            }
            java.nio.ByteBuffer m17 = pVar.f275006k.m(i17);
            if ((bufferInfo.flags & 2) != 0) {
                com.tencent.mars.xlog.Log.i(pVar.f275005j, "codec config!");
            }
            if ((bufferInfo.flags & 4) != 0) {
                com.tencent.mars.xlog.Log.i(pVar.f275005j, "encode end of stream");
                pVar.f();
            } else if (bufferInfo.size != 0) {
                m17.position(bufferInfo.offset);
                m17.limit(bufferInfo.offset + bufferInfo.size);
                pVar.e(m17, bufferInfo);
                pVar.f275006k.r(i17, bufferInfo.presentationTimeUs);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(pVar.f275005j, e17, "onOutputBufferAvailable error", new java.lang.Object[0]);
            if (pVar.f274976f) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxEncodeFrameFailed");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 77L, 1L);
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(android.media.MediaCodec codec, android.media.MediaFormat format) {
        kotlin.jvm.internal.o.g(codec, "codec");
        kotlin.jvm.internal.o.g(format, "format");
        gs0.p pVar = this.f275002a;
        com.tencent.mars.xlog.Log.i(pVar.f275005j, "encoder output format changed " + pVar.f275006k.o());
    }
}
