package uo5;

/* loaded from: classes13.dex */
public final class c implements uo5.m {
    public uo5.r a(uo5.a codecConfig) {
        java.lang.Object m521constructorimpl;
        kotlin.jvm.internal.o.g(codecConfig, "codecConfig");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            boolean z17 = codecConfig.f429711a;
            java.lang.String str = codecConfig.f429712b;
            android.media.MediaCodec createEncoderByType = z17 ? android.media.MediaCodec.createEncoderByType(str) : android.media.MediaCodec.createDecoderByType(str);
            kotlin.jvm.internal.o.d(createEncoderByType);
            m521constructorimpl = kotlin.Result.m521constructorimpl(new uo5.s(createEncoderByType));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CodecProviderImpl", "get codec error ", m524exceptionOrNullimpl);
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            m521constructorimpl = null;
        }
        return (uo5.r) m521constructorimpl;
    }
}
