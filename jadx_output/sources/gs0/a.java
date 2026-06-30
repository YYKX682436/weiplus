package gs0;

/* loaded from: classes10.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.q f274963a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f274964b;

    /* renamed from: c, reason: collision with root package name */
    public final wo.i1 f274965c;

    /* renamed from: d, reason: collision with root package name */
    public android.media.MediaFormat f274966d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f274967e;

    /* renamed from: f, reason: collision with root package name */
    public long f274968f;

    /* renamed from: g, reason: collision with root package name */
    public long f274969g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object f274970h;

    public a(android.media.MediaFormat mediaFormat, yz5.q frameEncodeCallback, yz5.a frameEncodeEndCallback) {
        kotlin.jvm.internal.o.g(mediaFormat, "mediaFormat");
        kotlin.jvm.internal.o.g(frameEncodeCallback, "frameEncodeCallback");
        kotlin.jvm.internal.o.g(frameEncodeEndCallback, "frameEncodeEndCallback");
        this.f274963a = frameEncodeCallback;
        this.f274964b = frameEncodeEndCallback;
        this.f274970h = new java.lang.Object();
        com.tencent.mars.xlog.Log.i("MicroMsg.IAudioEncoder", "init audio encoder");
        mediaFormat.getString("mime");
        try {
            android.media.MediaFormat mediaFormat2 = new android.media.MediaFormat();
            this.f274966d = mediaFormat2;
            mediaFormat2.setString("mime", "audio/mp4a-latm");
            this.f274966d.setInteger("aac-profile", 2);
            this.f274966d.setInteger("sample-rate", 44100);
            int integer = mediaFormat.containsKey("channel-count") ? mediaFormat.getInteger("channel-count") : 0;
            integer = integer <= 0 ? 1 : integer;
            this.f274966d.setInteger("channel-count", integer);
            this.f274966d.setInteger(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, mediaFormat.getInteger(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE));
            this.f274966d.setInteger("max-input-size", integer * 2048);
            wo.i1 d17 = wo.i1.d("audio/mp4a-latm", false);
            this.f274965c = d17;
            d17.a(this.f274966d, null, null, 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.IAudioEncoder", "finish init audio encoder, dstMediaFormat:" + this.f274966d);
        } catch (java.lang.Exception unused) {
            throw new java.lang.IllegalStateException("init encoder error");
        }
    }

    public final void a(java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo) {
        kotlin.jvm.internal.o.g(bufferInfo, "bufferInfo");
        if (byteBuffer == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IAudioEncoder", "ERROR, retrieve encoderOutputBuffer is null!!");
            return;
        }
        if (bufferInfo.size > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IAudioEncoder", "encoder output buffer:" + bufferInfo.size + ", pts:" + bufferInfo.presentationTimeUs);
            byteBuffer.position(bufferInfo.offset);
            byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
            long j17 = this.f274968f;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
            this.f274969g += elapsedRealtime;
            com.tencent.mars.xlog.Log.i("MicroMsg.IAudioEncoder", hashCode() + " encode frame used " + elapsedRealtime);
            this.f274963a.invoke(byteBuffer, bufferInfo, this.f274966d);
        }
    }

    public final synchronized void b() {
        try {
            synchronized (this.f274970h) {
                if (!this.f274967e) {
                    this.f274967e = true;
                    com.tencent.mars.xlog.Log.i("MicroMsg.IAudioEncoder", "releaseEncoder");
                    this.f274965c.y();
                    this.f274965c.q();
                    this.f274964b.invoke();
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.IAudioEncoder", "total encode used " + this.f274969g);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IAudioEncoder", "releaseEncoder error: %s", e17.getMessage());
        }
    }

    public abstract void c(byte[] bArr, long j17, boolean z17);
}
