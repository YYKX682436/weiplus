package com.tencent.mm.plugin.vlog.parallel;

/* loaded from: classes10.dex */
public final class d extends com.tencent.mm.plugin.vlog.model.TAVKitMuxer$SightVideoJNIMediaMuxer {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f175826a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f175827b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f175828c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.vlog.parallel.b f175829d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String path, int i17) {
        super(path, i17);
        kotlin.jvm.internal.o.g(path, "path");
        this.f175826a = path;
        this.f175827b = "MicroMsg.ParallelSoftWriter[" + hashCode() + ']';
    }

    @Override // com.tencent.mm.plugin.vlog.model.TAVKitMuxer$SightVideoJNIMediaMuxer, com.tencent.tav.decoder.muxer.IMediaMuxer
    public int addTrack(android.media.MediaFormat mediaFormat) {
        kotlin.jvm.internal.o.g(mediaFormat, "mediaFormat");
        boolean z17 = false;
        if (mediaFormat.containsKey("mime")) {
            java.lang.String string = mediaFormat.getString("mime");
            kotlin.jvm.internal.o.d(string);
            if (r26.n0.B(string, "video", false)) {
                z17 = true;
            }
        }
        if (z17) {
            return super.addTrack(mediaFormat);
        }
        setAudioFormat(mediaFormat);
        this.f175829d = com.tencent.mm.plugin.vlog.parallel.b.f175803l.a(mediaFormat, java.lang.String.valueOf(hashCode()));
        return getAudioId();
    }

    @Override // com.tencent.mm.plugin.vlog.model.TAVKitMuxer$SightVideoJNIMediaMuxer, com.tencent.tav.decoder.muxer.IMediaMuxer
    /* renamed from: audioTrackIndex */
    public int getAudioId() {
        com.tencent.mm.plugin.vlog.parallel.b bVar = this.f175829d;
        if (bVar != null) {
            return bVar.f175805b;
        }
        return -1;
    }

    @Override // com.tencent.mm.plugin.vlog.model.TAVKitMuxer$SightVideoJNIMediaMuxer, com.tencent.tav.decoder.muxer.IMediaMuxer
    public void clearResource() {
        com.tencent.mars.xlog.Log.i(this.f175827b, "clearResource");
        super.clearResource();
        super.release();
    }

    @Override // com.tencent.mm.plugin.vlog.model.TAVKitMuxer$SightVideoJNIMediaMuxer, com.tencent.tav.decoder.muxer.IMediaMuxer
    public void release() {
        com.tencent.mars.xlog.Log.i(this.f175827b, "release");
    }

    @Override // com.tencent.mm.plugin.vlog.model.TAVKitMuxer$SightVideoJNIMediaMuxer, com.tencent.tav.decoder.muxer.IMediaMuxer
    public boolean stop(boolean z17) {
        if (this.f175828c) {
            return true;
        }
        this.f175828c = true;
        com.tencent.tav.decoder.AssetWriterVideoEncoder encoder = getEncoder();
        if (encoder != null) {
            encoder.stop();
        }
        com.tencent.mm.plugin.vlog.parallel.b bVar = this.f175829d;
        if (bVar != null) {
            try {
                java.nio.channels.WritableByteChannel writableByteChannel = bVar.f175813j;
                if (writableByteChannel != null) {
                    writableByteChannel.close();
                }
            } catch (java.lang.Exception unused) {
            }
        }
        if (getDuration() > 0) {
            setStarted(false);
            return true;
        }
        com.tencent.mars.xlog.Log.e(this.f175827b, "error duration is 0");
        setStarted(false);
        return false;
    }

    @Override // com.tencent.mm.plugin.vlog.model.TAVKitMuxer$SightVideoJNIMediaMuxer, com.tencent.tav.decoder.muxer.IMediaMuxer
    public void writeSampleData(int i17, java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo) {
        kotlin.jvm.internal.o.g(byteBuffer, "byteBuffer");
        kotlin.jvm.internal.o.g(bufferInfo, "bufferInfo");
        if (i17 != getAudioId()) {
            super.writeSampleData(i17, byteBuffer, bufferInfo);
            return;
        }
        com.tencent.mm.plugin.vlog.parallel.b bVar = this.f175829d;
        if (bVar != null) {
            bVar.a(byteBuffer, bufferInfo);
        }
    }
}
