package com.tencent.mm.plugin.vlog.model;

@kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010;\u001a\u00020\u0006\u0012\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\bw\u0010xJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u0010\n\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0002J\u0010\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\u000e\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\bJ\b\u0010\u001a\u001a\u00020\u000bH\u0014J\b\u0010\u001b\u001a\u00020\u000bH\u0016J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u0002H\u0016J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0016J\u0018\u0010&\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$H\u0016J \u0010,\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\b2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0016J\b\u0010-\u001a\u00020\u000bH\u0016J\b\u0010.\u001a\u00020\bH\u0016J\b\u0010/\u001a\u00020\bH\u0016J\u0010\u00101\u001a\u00020\b2\u0006\u00100\u001a\u00020\u0004H\u0016J\b\u00103\u001a\u0004\u0018\u000102J$\u00108\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\b2\b\u00106\u001a\u0004\u0018\u0001052\b\u00107\u001a\u0004\u0018\u000105H\u0016J\b\u00109\u001a\u00020\u000bH\u0016J\n\u0010:\u001a\u0004\u0018\u00010\u001eH\u0016R\u0014\u0010;\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0005\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010=R\u0018\u0010>\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010=R\u0016\u0010C\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010=R\u0016\u0010D\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010=R\u0016\u0010F\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010=R\u0016\u0010I\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010=R\u0016\u0010J\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010=R\u0016\u0010K\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010=R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010LR$\u0010M\u001a\u0004\u0018\u00010\u00048\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010S\u001a\u0004\u0018\u00010\u00048\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bS\u0010N\u001a\u0004\bT\u0010P\"\u0004\bU\u0010RR\"\u0010\u0018\u001a\u00020\b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010=\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010Z\u001a\u00020\b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bZ\u0010=\u001a\u0004\b[\u0010W\"\u0004\b\\\u0010YR\"\u0010]\u001a\u00020\u00028\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b]\u0010A\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u0016\u0010a\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010AR\u0016\u0010b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010AR&\u0010e\u001a\u0012\u0012\u0004\u0012\u00020\r0cj\b\u0012\u0004\u0012\u00020\r`d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010g\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010=R$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u0016\u0010m\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010=R\u0016\u0010n\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010GR\u0016\u0010o\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010=R\u0016\u0010p\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010=R\u0016\u0010r\u001a\u00020q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010=R$\u00104\u001a\u00020\b2\u0006\u0010u\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b4\u0010=\u001a\u0004\bv\u0010W¨\u0006y"}, d2 = {"com/tencent/mm/plugin/vlog/model/TAVKitMuxer$SightVideoJNIMediaMuxer", "Lcom/tencent/tav/decoder/muxer/IMediaMuxer;", "", "checkVideoFormatValid", "Landroid/media/MediaFormat;", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_FORMAT, "", "key", "", "defVal", "getMediaFormatInt", "Ljz5/f0;", "flushPendingVideoDts", "", "dts", "doWriteVideoDts", "isSoftEncode", "configMuxerToSoftEncode", "Lt21/d2;", "softEncoderConfig", "configSoftEncodeCustom", "Lcom/tencent/tav/decoder/AssetWriterVideoEncoder;", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_ENCODER, "setSoftEncoder", "duration", "ensureMuxerVideoDuration", "checkInitBufId", "start", "ignoreHeader", "isMuxerStarted", "Lcom/tencent/tav/core/ExportConfig;", "exportConfig", "setExportConfig", "isCancel", "stop", "isVideo", "Lcom/tencent/tav/coremedia/CMTime;", "sampleTime", "writeSampleDataTime", "trackId", "Ljava/nio/ByteBuffer;", "byteBuffer", "Landroid/media/MediaCodec$BufferInfo;", "bufferInfo", "writeSampleData", "release", "audioTrackIndex", "videoTrackIndex", "mediaFormat", "addTrack", "Lcom/tencent/mm/plugin/sight/base/h;", "getSightEncode", ya.b.INDEX, "Lcom/tencent/tav/coremedia/CMTimeRange;", "segmentRange", "allRange", "prepareParallelSegmentInfo", "clearResource", "getExportConfig", com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "Ljava/lang/String;", "I", "sightEncode", "Lcom/tencent/mm/plugin/sight/base/h;", "isUseFFMpegMuxer", "Z", "videoId", "audioId", "videoBitrate", "", "videoFps", "F", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH, com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT, "audioSampleRate", "audioChannelCount", "Lcom/tencent/tav/core/ExportConfig;", "audioFormat", "Landroid/media/MediaFormat;", "getAudioFormat", "()Landroid/media/MediaFormat;", "setAudioFormat", "(Landroid/media/MediaFormat;)V", "videoFormat", "getVideoFormat", "setVideoFormat", "getDuration", "()I", "setDuration", "(I)V", "videoFrameCount", "getVideoFrameCount", "setVideoFrameCount", "isStarted", "()Z", "setStarted", "(Z)V", "softEncode", "isHevc", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "pendingVideoDts", "Ljava/util/ArrayList;", "dtsCount", "Lcom/tencent/tav/decoder/AssetWriterVideoEncoder;", "getEncoder", "()Lcom/tencent/tav/decoder/AssetWriterVideoEncoder;", "setEncoder", "(Lcom/tencent/tav/decoder/AssetWriterVideoEncoder;)V", "customPreset", "crf", "vbvBufferSize", "roiSwitch", "Lcom/tencent/tav/decoder/logger/WXLogger;", "logger", "Lcom/tencent/tav/decoder/logger/WXLogger;", "roiFlag", "<set-?>", "getIndex", "<init>", "(Ljava/lang/String;I)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public class TAVKitMuxer$SightVideoJNIMediaMuxer implements com.tencent.tav.decoder.muxer.IMediaMuxer {
    private int audioChannelCount;
    private android.media.MediaFormat audioFormat;
    private int audioId;
    private int audioSampleRate;
    private float crf;
    private int customPreset;
    private int dtsCount;
    private int duration;
    private com.tencent.tav.decoder.AssetWriterVideoEncoder encoder;
    private com.tencent.tav.core.ExportConfig exportConfig;
    private final int format;
    private int index;
    private boolean isHevc;
    private boolean isStarted;
    private boolean isUseFFMpegMuxer;
    private com.tencent.tav.decoder.logger.WXLogger logger;
    private final java.lang.String path;
    private java.util.ArrayList<java.lang.Long> pendingVideoDts;
    private int roiFlag;
    private int roiSwitch;
    private volatile com.tencent.mm.plugin.sight.base.h sightEncode;
    private boolean softEncode;
    private int vbvBufferSize;
    private int videoBitrate;
    private android.media.MediaFormat videoFormat;
    private float videoFps;
    private int videoFrameCount;
    private int videoHeight;
    private int videoId;
    private int videoWidth;

    public TAVKitMuxer$SightVideoJNIMediaMuxer(java.lang.String path, int i17) {
        kotlin.jvm.internal.o.g(path, "path");
        this.path = path;
        this.format = i17;
        this.videoId = -1;
        this.audioId = -1;
        this.pendingVideoDts = new java.util.ArrayList<>();
        this.customPreset = -1;
        this.crf = 23.0f;
        this.logger = new com.tencent.tav.decoder.logger.WXLogger();
        this.index = -1;
    }

    private final boolean checkVideoFormatValid() {
        android.media.MediaFormat mediaFormat = this.videoFormat;
        if (mediaFormat != null && mediaFormat.containsKey("width")) {
            android.media.MediaFormat mediaFormat2 = this.videoFormat;
            if (mediaFormat2 != null && mediaFormat2.containsKey("height")) {
                android.media.MediaFormat mediaFormat3 = this.videoFormat;
                if (mediaFormat3 != null && mediaFormat3.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE)) {
                    android.media.MediaFormat mediaFormat4 = this.videoFormat;
                    if (mediaFormat4 != null && mediaFormat4.containsKey("frame-rate")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final void doWriteVideoDts(long j17) {
        if (this.dtsCount == 0) {
            com.tencent.mm.plugin.sight.base.h hVar = this.sightEncode;
            if (hVar != null) {
                hVar.f(a06.d.b(1000.0f / this.videoFps) * (-1) * 1000);
            }
            this.dtsCount++;
        }
        com.tencent.mm.plugin.sight.base.h hVar2 = this.sightEncode;
        if (hVar2 != null) {
            hVar2.f(j17);
        }
        this.dtsCount++;
    }

    private final void flushPendingVideoDts() {
        com.tencent.tav.decoder.logger.WXLogger wXLogger = this.logger;
        com.tencent.mm.plugin.vlog.model.d1 d1Var = com.tencent.mm.plugin.vlog.model.d1.f175577a;
        wXLogger.i("TAVKitMuxer", "flushPendingVideoDts size:" + this.pendingVideoDts.size(), new java.lang.Object[0]);
        java.util.Iterator<java.lang.Long> it = this.pendingVideoDts.iterator();
        while (it.hasNext()) {
            java.lang.Long next = it.next();
            kotlin.jvm.internal.o.d(next);
            doWriteVideoDts(next.longValue());
        }
        this.pendingVideoDts.clear();
    }

    private final int getMediaFormatInt(android.media.MediaFormat format, java.lang.String key, int defVal) {
        return (format != null && format.containsKey(key)) ? format.getInteger(key) : defVal;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c8, code lost:
    
        if ((r0.f162415a >= 0) == true) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003d  */
    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int addTrack(android.media.MediaFormat r9) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.vlog.model.TAVKitMuxer$SightVideoJNIMediaMuxer.addTrack(android.media.MediaFormat):int");
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    /* renamed from: audioTrackIndex, reason: from getter */
    public int getAudioId() {
        return this.audioId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cd, code lost:
    
        if ((r0.f162415a >= 0) == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void checkInitBufId() {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.vlog.model.TAVKitMuxer$SightVideoJNIMediaMuxer.checkInitBufId():void");
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public void clearResource() {
    }

    public final void configMuxerToSoftEncode(boolean z17) {
        this.softEncode = z17;
        com.tencent.tav.decoder.logger.WXLogger wXLogger = this.logger;
        com.tencent.mm.plugin.vlog.model.d1 d1Var = com.tencent.mm.plugin.vlog.model.d1.f175577a;
        wXLogger.i("TAVKitMuxer", "configMuxerToSoftEncode:" + z17, new java.lang.Object[0]);
    }

    public final void configSoftEncodeCustom(t21.d2 d2Var) {
        if (d2Var == null) {
            return;
        }
        this.customPreset = d2Var.f414732a;
        this.crf = d2Var.f414733b;
        this.vbvBufferSize = d2Var.f414734c;
        this.roiSwitch = d2Var.f414735d;
        this.roiFlag = d2Var.f414736e;
        com.tencent.tav.decoder.logger.WXLogger wXLogger = this.logger;
        com.tencent.mm.plugin.vlog.model.d1 d1Var = com.tencent.mm.plugin.vlog.model.d1.f175577a;
        wXLogger.i("TAVKitMuxer", "configSoftEncodeCustom:" + d2Var, new java.lang.Object[0]);
    }

    public final void ensureMuxerVideoDuration(int i17) {
        if (this.duration <= 0) {
            this.duration = i17;
        }
    }

    public final android.media.MediaFormat getAudioFormat() {
        return this.audioFormat;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final com.tencent.tav.decoder.AssetWriterVideoEncoder getEncoder() {
        return this.encoder;
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public com.tencent.tav.core.ExportConfig getExportConfig() {
        return this.exportConfig;
    }

    public final int getIndex() {
        return this.index;
    }

    public final com.tencent.mm.plugin.sight.base.h getSightEncode() {
        return this.sightEncode;
    }

    public final android.media.MediaFormat getVideoFormat() {
        return this.videoFormat;
    }

    public final int getVideoFrameCount() {
        return this.videoFrameCount;
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public boolean ignoreHeader() {
        return false;
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    /* renamed from: isMuxerStarted, reason: from getter */
    public boolean getIsStarted() {
        return this.isStarted;
    }

    public final boolean isStarted() {
        return this.isStarted;
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public void prepareParallelSegmentInfo(int i17, com.tencent.tav.coremedia.CMTimeRange cMTimeRange, com.tencent.tav.coremedia.CMTimeRange cMTimeRange2) {
        this.index = i17;
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public void release() {
        com.tencent.mm.plugin.sight.base.h hVar = this.sightEncode;
        if (hVar != null) {
            hVar.c();
        }
        this.isStarted = false;
    }

    public final void setAudioFormat(android.media.MediaFormat mediaFormat) {
        this.audioFormat = mediaFormat;
    }

    public final void setDuration(int i17) {
        this.duration = i17;
    }

    public final void setEncoder(com.tencent.tav.decoder.AssetWriterVideoEncoder assetWriterVideoEncoder) {
        this.encoder = assetWriterVideoEncoder;
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public void setExportConfig(com.tencent.tav.core.ExportConfig exportConfig) {
        kotlin.jvm.internal.o.g(exportConfig, "exportConfig");
        com.tencent.tav.decoder.logger.WXLogger wXLogger = this.logger;
        com.tencent.mm.plugin.vlog.model.d1 d1Var = com.tencent.mm.plugin.vlog.model.d1.f175577a;
        wXLogger.i("TAVKitMuxer", "setExportConfig:" + exportConfig + ' ', new java.lang.Object[0]);
        this.exportConfig = exportConfig;
        com.tencent.tav.decoder.logger.WXLoggerConfig wXLoggerConfig = exportConfig.loggerConfig;
        if (wXLoggerConfig != null) {
            this.logger.setConfig(wXLoggerConfig);
        }
    }

    public final void setSoftEncoder(com.tencent.tav.decoder.AssetWriterVideoEncoder encoder) {
        kotlin.jvm.internal.o.g(encoder, "encoder");
        this.encoder = encoder;
    }

    public final void setStarted(boolean z17) {
        this.isStarted = z17;
    }

    public final void setVideoFormat(android.media.MediaFormat mediaFormat) {
        this.videoFormat = mediaFormat;
    }

    public final void setVideoFrameCount(int i17) {
        this.videoFrameCount = i17;
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public void start() {
        com.tencent.tav.decoder.logger.WXLogger wXLogger = this.logger;
        com.tencent.mm.plugin.vlog.model.d1 d1Var = com.tencent.mm.plugin.vlog.model.d1.f175577a;
        wXLogger.i("TAVKitMuxer", "start", new java.lang.Object[0]);
        this.isStarted = true;
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public boolean stop(boolean isCancel) {
        com.tencent.tav.decoder.logger.WXLogger wXLogger = this.logger;
        com.tencent.mm.plugin.vlog.model.d1 d1Var = com.tencent.mm.plugin.vlog.model.d1.f175577a;
        wXLogger.i("TAVKitMuxer", "stop, duration:" + this.duration + "，frameCount:" + this.videoFrameCount + ", dtsCount:" + this.dtsCount, new java.lang.Object[0]);
        com.tencent.tav.decoder.logger.WXLogger wXLogger2 = this.logger;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop videoFormat:");
        sb6.append(this.videoFormat);
        wXLogger2.i("TAVKitMuxer", sb6.toString(), new java.lang.Object[0]);
        this.logger.i("TAVKitMuxer", "stop audioFormat:" + this.audioFormat, new java.lang.Object[0]);
        if (this.duration <= 0) {
            this.logger.e("TAVKitMuxer", "error duration is 0");
            this.isStarted = false;
            return false;
        }
        this.audioSampleRate = getMediaFormatInt(this.audioFormat, "sample-rate", 0);
        this.audioChannelCount = getMediaFormatInt(this.audioFormat, "channel-count", 0);
        int mediaFormatInt = getMediaFormatInt(this.videoFormat, "frame-rate", 0);
        this.videoBitrate = getMediaFormatInt(this.videoFormat, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, 0);
        float f17 = (this.videoFrameCount * 1000.0f) / this.duration;
        this.logger.i("TAVKitMuxer", "audioSampleRate:" + this.audioSampleRate + ", audioChannelCount:" + this.audioChannelCount + ", mediaFormatFps:" + mediaFormatInt + ", videoBitrate:" + this.videoBitrate + ", duration:" + this.duration + ", countFps:" + f17 + ", configToSoftEncode:" + this.softEncode, new java.lang.Object[0]);
        com.tencent.tav.decoder.logger.WXLogger wXLogger3 = this.logger;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("exportConfig: audioSampleRate:");
        com.tencent.tav.core.ExportConfig exportConfig = this.exportConfig;
        sb7.append(exportConfig != null ? java.lang.Integer.valueOf(exportConfig.getAudioSampleRateHz()) : null);
        sb7.append(", audioChannelCount:");
        com.tencent.tav.core.ExportConfig exportConfig2 = this.exportConfig;
        sb7.append(exportConfig2 != null ? java.lang.Integer.valueOf(exportConfig2.getAudioChannelCount()) : null);
        sb7.append(", videoBitrate:");
        com.tencent.tav.core.ExportConfig exportConfig3 = this.exportConfig;
        sb7.append(exportConfig3 != null ? java.lang.Integer.valueOf(exportConfig3.getVideoBitRate()) : null);
        wXLogger3.i("TAVKitMuxer", sb7.toString(), new java.lang.Object[0]);
        if (!this.softEncode) {
            this.videoFps = f17;
        }
        if (this.audioSampleRate <= 0) {
            com.tencent.tav.core.ExportConfig exportConfig4 = this.exportConfig;
            this.audioSampleRate = exportConfig4 != null ? exportConfig4.getAudioSampleRateHz() : 0;
        }
        if (this.audioChannelCount <= 0) {
            com.tencent.tav.core.ExportConfig exportConfig5 = this.exportConfig;
            this.audioChannelCount = exportConfig5 != null ? exportConfig5.getAudioChannelCount() : 0;
        }
        if (this.videoBitrate <= 0) {
            com.tencent.tav.core.ExportConfig exportConfig6 = this.exportConfig;
            this.videoBitrate = exportConfig6 != null ? exportConfig6.getVideoBitRate() : 0;
        }
        boolean z17 = (this.audioSampleRate <= 0 && this.audioChannelCount <= 0) || this.audioFormat == null;
        if (isCancel) {
            this.logger.i("TAVKitMuxer", "stop by cancel, do not mux", new java.lang.Object[0]);
            this.isStarted = false;
            return true;
        }
        com.tencent.mm.plugin.vlog.model.d1 d1Var2 = com.tencent.mm.plugin.vlog.model.d1.f175577a;
        int intValue = ((java.lang.Number) ((jz5.n) com.tencent.mm.plugin.vlog.model.d1.f175578b).getValue()).intValue();
        com.tencent.tav.core.ExportConfig exportConfig7 = this.exportConfig;
        int minMuxDuration = exportConfig7 != null ? exportConfig7.getMinMuxDuration() : -1;
        com.tencent.tav.core.ExportConfig exportConfig8 = this.exportConfig;
        int minMuxFrameCount = exportConfig8 != null ? exportConfig8.getMinMuxFrameCount() : -1;
        if (minMuxDuration > 0) {
            intValue = minMuxDuration;
        }
        if (minMuxFrameCount <= 0) {
            minMuxFrameCount = 5;
        }
        this.logger.i("TAVKitMuxer", "check remux, checkFrameCount:" + minMuxFrameCount + ", checkDuration:" + intValue, new java.lang.Object[0]);
        if (this.duration < intValue || this.videoFrameCount < minMuxFrameCount) {
            this.logger.e("TAVKitMuxer", "stop remux error, duration:" + this.duration + ", frameCount:" + this.videoFrameCount);
        } else {
            com.tencent.tav.core.ExportConfig exportConfig9 = this.exportConfig;
            if (exportConfig9 != null && (exportConfig9.getOutputWidth() != exportConfig9.getRenderWidth() || exportConfig9.getOutputHeight() != exportConfig9.getRenderHeight())) {
                int outputWidth = exportConfig9.getOutputWidth() - exportConfig9.getRenderWidth();
                int outputHeight = exportConfig9.getOutputHeight() - exportConfig9.getRenderHeight();
                this.logger.i("TAVKitMuxer", "setCropBorder cropRight:" + outputWidth + " cropBottom:" + outputHeight, new java.lang.Object[0]);
                com.tencent.mm.plugin.sight.base.h hVar = this.sightEncode;
                if (hVar != null) {
                    com.tencent.mm.plugin.sight.base.SightVideoJNI.setCropBorder(hVar.f162415a, 0, 0, outputWidth, outputHeight);
                }
            }
            com.tencent.mm.plugin.sight.base.h hVar2 = this.sightEncode;
            java.lang.Integer valueOf = hVar2 != null ? java.lang.Integer.valueOf(hVar2.b(this.path, this.duration, this.videoFps, z17, this.audioSampleRate, this.audioChannelCount)) : null;
            this.logger.i("TAVKitMuxer", "stop ret:" + valueOf, new java.lang.Object[0]);
        }
        this.isStarted = false;
        return true;
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    /* renamed from: videoTrackIndex, reason: from getter */
    public int getVideoId() {
        return this.videoId;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cb  */
    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void writeSampleData(int r14, java.nio.ByteBuffer r15, android.media.MediaCodec.BufferInfo r16) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.vlog.model.TAVKitMuxer$SightVideoJNIMediaMuxer.writeSampleData(int, java.nio.ByteBuffer, android.media.MediaCodec$BufferInfo):void");
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public void writeSampleDataTime(boolean z17, com.tencent.tav.coremedia.CMTime sampleTime) {
        kotlin.jvm.internal.o.g(sampleTime, "sampleTime");
        if (!z17 || this.softEncode) {
            return;
        }
        com.tencent.tav.decoder.logger.WXLogger wXLogger = this.logger;
        com.tencent.mm.plugin.vlog.model.d1 d1Var = com.tencent.mm.plugin.vlog.model.d1.f175577a;
        wXLogger.i("TAVKitMuxer", "write video dts:" + sampleTime.getTimeUs(), new java.lang.Object[0]);
        com.tencent.mm.plugin.sight.base.h hVar = this.sightEncode;
        if ((hVar != null ? hVar.f162415a : -1) >= 0) {
            doWriteVideoDts(sampleTime.getTimeUs());
            return;
        }
        this.logger.i("TAVKitMuxer", "save pending dts:" + sampleTime.getTimeUs(), new java.lang.Object[0]);
        this.pendingVideoDts.add(java.lang.Long.valueOf(sampleTime.getTimeUs()));
    }
}
