package wo5;

/* loaded from: classes13.dex */
public final class b implements uo5.n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f448315a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f448316b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f448317c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f448318d;

    public b(boolean z17, android.os.Handler codecHandler, yz5.a qosGetter) {
        kotlin.jvm.internal.o.g(codecHandler, "codecHandler");
        kotlin.jvm.internal.o.g(qosGetter, "qosGetter");
        this.f448315a = z17;
        this.f448316b = codecHandler;
        this.f448317c = qosGetter;
        this.f448318d = z17 ? "video/hevc" : "video/avc";
    }

    @Override // uo5.n
    public uo5.a a(boolean z17) {
        uo5.u uVar = (uo5.u) this.f448317c.invoke();
        java.lang.String str = this.f448318d;
        if (uVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.HW.ILinkVoIPEncodeConfigProviderImpl", "getCodecConfig: get qos params null");
            android.media.MediaFormat createVideoFormat = android.media.MediaFormat.createVideoFormat(str, 0, 0);
            kotlin.jvm.internal.o.f(createVideoFormat, "createVideoFormat(...)");
            return new uo5.a(true, str, createVideoFormat);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.HW.ILinkVoIPEncodeConfigProviderImpl", "getCodecConfig: qos " + uVar);
        int i17 = uVar.f429744a;
        android.media.MediaFormat createVideoFormat2 = android.media.MediaFormat.createVideoFormat(str, i17, uVar.f429745b);
        kotlin.jvm.internal.o.f(createVideoFormat2, "createVideoFormat(...)");
        createVideoFormat2.setInteger("color-format", com.tencent.tav.decoder.EncoderWriter.OUTPUT_VIDEO_COLOR_FORMAT);
        createVideoFormat2.setInteger("stride", i17);
        boolean z18 = this.f448315a;
        short s17 = uVar.f429746c;
        if (z17 || z18) {
            createVideoFormat2.setInteger(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, s17 * 1000);
        } else {
            createVideoFormat2.setInteger(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, s17 * 1200);
        }
        createVideoFormat2.setInteger("frame-rate", uVar.f429747d);
        createVideoFormat2.setInteger("i-frame-interval", 160);
        if (!z18) {
            createVideoFormat2.setInteger(com.google.android.gms.common.Scopes.PROFILE, z17 ? 8 : 1);
            createVideoFormat2.setInteger(ya.b.LEVEL, 256);
        }
        createVideoFormat2.setInteger("bitrate-mode", 2);
        return new uo5.a(true, str, createVideoFormat2);
    }

    @Override // uo5.n
    public android.os.Handler b() {
        return this.f448316b;
    }

    @Override // uo5.n
    public int c() {
        return 1;
    }
}
