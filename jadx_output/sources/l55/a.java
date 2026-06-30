package l55;

/* loaded from: classes10.dex */
public final class a implements com.tencent.tavkit.composition.audio.TAVAudioProcessorNode.TAVAudioProcessorEffect {

    /* renamed from: a, reason: collision with root package name */
    public kl.i f316665a;

    /* renamed from: b, reason: collision with root package name */
    public java.nio.ByteBuffer f316666b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f316667c = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.tav.decoder.AudioInfo f316668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l55.b f316669e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rm5.j f316670f;

    public a(l55.b bVar, rm5.j jVar) {
        this.f316669e = bVar;
        this.f316670f = jVar;
        com.tencent.tav.decoder.AudioInfo audioInfo = new com.tencent.tav.decoder.AudioInfo();
        this.f316668d = audioInfo;
        audioInfo.sampleRate = bVar.f316671a;
        audioInfo.channelCount = bVar.f316672b;
        audioInfo.pcmEncoding = 2;
    }

    @Override // com.tencent.tav.core.AudioTapProcessor
    public com.tencent.tav.decoder.AudioInfo getDestAudioInfo() {
        return this.f316668d;
    }

    @Override // com.tencent.tav.core.AudioTapProcessor
    public java.nio.ByteBuffer processAudioPCM(com.tencent.tav.coremedia.CMTime time, java.nio.ByteBuffer pcmBuffer, com.tencent.tav.decoder.AudioInfo audioInfo) {
        kotlin.jvm.internal.o.g(time, "time");
        kotlin.jvm.internal.o.g(pcmBuffer, "pcmBuffer");
        kotlin.jvm.internal.o.g(audioInfo, "audioInfo");
        if (this.f316665a == null) {
            java.lang.String str = this.f316670f.f397499a;
            int i17 = audioInfo.sampleRate;
            int i18 = audioInfo.channelCount;
            int i19 = audioInfo.pcmEncoding;
            com.tencent.tav.decoder.AudioInfo audioInfo2 = this.f316668d;
            this.f316665a = new kl.i(str, i17, i18, i19, audioInfo2.sampleRate, audioInfo2.channelCount, audioInfo2.pcmEncoding, 3);
            this.f316669e.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.AudioResampler", "processAudioPCM, create convert processor, src:" + audioInfo + ", dst:" + audioInfo2);
        }
        if (this.f316667c.length != pcmBuffer.limit()) {
            this.f316667c = new byte[pcmBuffer.limit()];
        }
        pcmBuffer.position(0);
        pcmBuffer.get(this.f316667c);
        pcmBuffer.position(0);
        kl.i iVar = this.f316665a;
        byte[] a17 = iVar != null ? iVar.a(this.f316667c) : null;
        if (a17 == null) {
            return pcmBuffer;
        }
        java.nio.ByteBuffer byteBuffer = this.f316666b;
        if (!(byteBuffer != null && byteBuffer.capacity() == a17.length)) {
            java.nio.ByteBuffer order = java.nio.ByteBuffer.allocateDirect(a17.length).order(java.nio.ByteOrder.LITTLE_ENDIAN);
            order.put(a17);
            this.f316666b = order;
            order.position(0);
            return order;
        }
        java.nio.ByteBuffer byteBuffer2 = this.f316666b;
        if (byteBuffer2 != null) {
            byteBuffer2.position(0);
        }
        java.nio.ByteBuffer byteBuffer3 = this.f316666b;
        if (byteBuffer3 != null) {
            byteBuffer3.put(a17);
        }
        java.nio.ByteBuffer byteBuffer4 = this.f316666b;
        if (byteBuffer4 != null) {
            byteBuffer4.position(0);
        }
        java.nio.ByteBuffer byteBuffer5 = this.f316666b;
        kotlin.jvm.internal.o.d(byteBuffer5);
        return byteBuffer5;
    }

    @Override // com.tencent.tav.core.AudioTapProcessor
    public void release() {
        kl.i iVar = this.f316665a;
        if (iVar != null) {
            iVar.release();
        }
    }
}
