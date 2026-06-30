package com.tencent.tav.codec;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 42\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b2\u00103J.\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\bH\u0016J0\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0016J\u0012\u0010\"\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016J\u0012\u0010#\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\bH\u0016J\u0018\u0010&\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010%\u001a\u00020$H\u0016J\n\u0010'\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010(\u001a\u00020\nH\u0016J\b\u0010)\u001a\u00020\nH\u0016J\n\u0010*\u001a\u0004\u0018\u00010\u0002H\u0016J\n\u0010+\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010-\u001a\u0004\u0018\u00010,J\b\u0010.\u001a\u00020$H\u0016R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00065"}, d2 = {"Lcom/tencent/tav/codec/MediaCodecAnalyse;", "Lcom/tencent/tav/codec/IMediaCodec;", "Landroid/media/MediaFormat;", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_FORMAT, "Landroid/view/Surface;", "surface", "Landroid/media/MediaCrypto;", "crypto", "", "flags", "Ljz5/f0;", "configure", com.tencent.tav.codec.MediaCodecAnalyse.STATE_START, "flush", com.tencent.tav.codec.MediaCodecAnalyse.STATE_STOP, "release", "Landroid/graphics/SurfaceTexture;", "surfaceTexture", "bindSurfaceTexture", "Landroid/media/MediaCodec$BufferInfo;", "info", "", "timeoutUs", "dequeueOutputBuffer", "dequeueInputBuffer", ya.b.INDEX, "Ljava/nio/ByteBuffer;", "getOutputBuffer", "offset", "size", "presentationTimeUs", "queueInputBuffer", "", com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "setDataSource", "getInputBuffer", "", "render", "releaseOutputBuffer", "createInputSurface", "signalEndOfInputStream", com.tencent.tav.codec.MediaCodecAnalyse.STATE_RESET, "getOutputFormat", "getInputFormat", "Landroid/media/MediaCodec;", "getCodec", "isSoft", "Lcom/tencent/tav/codec/MediaCodecAnalyse$Companion$MediaCodecData;", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Lcom/tencent/tav/codec/MediaCodecAnalyse$Companion$MediaCodecData;", "<init>", "()V", "Companion", "tav-foundation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes16.dex */
public final class MediaCodecAnalyse implements com.tencent.tav.codec.IMediaCodec {
    private static int DEBUG_COUNT = 0;
    private static final java.lang.String DEFAULT_SCENE = "default";
    private static final java.lang.String STATE_CREATE = "create";
    private static final java.lang.String STATE_RELEASE = "release";
    private static final java.lang.String STATE_RESET = "reset";
    private static final java.lang.String STATE_START = "start";
    private static final java.lang.String STATE_STOP = "stop";
    private static final java.lang.String TAG = "MediaCodecAnalyse";
    private final com.tencent.tav.codec.MediaCodecAnalyse.Companion.MediaCodecData data = new com.tencent.tav.codec.MediaCodecAnalyse.Companion.MediaCodecData(null, null, false, null, null, null, 63, null);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.tav.codec.MediaCodecAnalyse.Companion INSTANCE = new com.tencent.tav.codec.MediaCodecAnalyse.Companion(null);
    private static final java.util.ArrayList<com.tencent.tav.codec.MediaCodecAnalyse.Companion.MediaCodecData> analyseList = new java.util.ArrayList<>();

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001&B\t\b\u0002¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\nJ\u001a\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007J\u001a\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007R\"\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R$\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00020 j\b\u0012\u0004\u0012\u00020\u0002`!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/tencent/tav/codec/MediaCodecAnalyse$Companion;", "", "Lcom/tencent/tav/codec/MediaCodecAnalyse$Companion$MediaCodecData;", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Ljz5/f0;", "addNewInstance", "removeInstance", "makeDebugCountIncrease", "Lorg/json/JSONArray;", "getCodecInfo", "", "instanceCount", "", "type", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "Lcom/tencent/tav/codec/MediaCodecAnalyse;", "createDecoderByType", "createEncoderByType", "DEBUG_COUNT", "I", "getDEBUG_COUNT", "()I", "setDEBUG_COUNT", "(I)V", "DEFAULT_SCENE", "Ljava/lang/String;", "STATE_CREATE", "STATE_RELEASE", "STATE_RESET", "STATE_START", "STATE_STOP", "TAG", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "analyseList", "Ljava/util/ArrayList;", "<init>", "()V", "MediaCodecData", "tav-foundation_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes16.dex */
    public static final class Companion {

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003JK\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010(\u001a\u00020\u00072\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001c¨\u0006-"}, d2 = {"Lcom/tencent/tav/codec/MediaCodecAnalyse$Companion$MediaCodecData;", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "", "codec", "Landroid/media/MediaCodec;", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_ENCODER, "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_FORMAT, "Landroid/media/MediaFormat;", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "state", "(Ljava/lang/String;Landroid/media/MediaCodec;ZLandroid/media/MediaFormat;Ljava/lang/String;Ljava/lang/String;)V", "getCodec", "()Landroid/media/MediaCodec;", "setCodec", "(Landroid/media/MediaCodec;)V", "getEncoder", "()Z", "setEncoder", "(Z)V", "getFormat", "()Landroid/media/MediaFormat;", "setFormat", "(Landroid/media/MediaFormat;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getScene", "setScene", "getState", "setState", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "tav-foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes16.dex */
        public static final /* data */ class MediaCodecData {
            private android.media.MediaCodec codec;
            private boolean encoder;
            private android.media.MediaFormat format;
            private java.lang.String name;
            private java.lang.String scene;
            private java.lang.String state;

            public MediaCodecData() {
                this(null, null, false, null, null, null, 63, null);
            }

            public static /* synthetic */ com.tencent.tav.codec.MediaCodecAnalyse.Companion.MediaCodecData copy$default(com.tencent.tav.codec.MediaCodecAnalyse.Companion.MediaCodecData mediaCodecData, java.lang.String str, android.media.MediaCodec mediaCodec, boolean z17, android.media.MediaFormat mediaFormat, java.lang.String str2, java.lang.String str3, int i17, java.lang.Object obj) {
                if ((i17 & 1) != 0) {
                    str = mediaCodecData.name;
                }
                if ((i17 & 2) != 0) {
                    mediaCodec = mediaCodecData.codec;
                }
                android.media.MediaCodec mediaCodec2 = mediaCodec;
                if ((i17 & 4) != 0) {
                    z17 = mediaCodecData.encoder;
                }
                boolean z18 = z17;
                if ((i17 & 8) != 0) {
                    mediaFormat = mediaCodecData.format;
                }
                android.media.MediaFormat mediaFormat2 = mediaFormat;
                if ((i17 & 16) != 0) {
                    str2 = mediaCodecData.scene;
                }
                java.lang.String str4 = str2;
                if ((i17 & 32) != 0) {
                    str3 = mediaCodecData.state;
                }
                return mediaCodecData.copy(str, mediaCodec2, z18, mediaFormat2, str4, str3);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getName() {
                return this.name;
            }

            /* renamed from: component2, reason: from getter */
            public final android.media.MediaCodec getCodec() {
                return this.codec;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getEncoder() {
                return this.encoder;
            }

            /* renamed from: component4, reason: from getter */
            public final android.media.MediaFormat getFormat() {
                return this.format;
            }

            /* renamed from: component5, reason: from getter */
            public final java.lang.String getScene() {
                return this.scene;
            }

            /* renamed from: component6, reason: from getter */
            public final java.lang.String getState() {
                return this.state;
            }

            public final com.tencent.tav.codec.MediaCodecAnalyse.Companion.MediaCodecData copy(java.lang.String name, android.media.MediaCodec codec, boolean encoder, android.media.MediaFormat format, java.lang.String scene, java.lang.String state) {
                kotlin.jvm.internal.o.g(scene, "scene");
                kotlin.jvm.internal.o.g(state, "state");
                return new com.tencent.tav.codec.MediaCodecAnalyse.Companion.MediaCodecData(name, codec, encoder, format, scene, state);
            }

            public boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.tencent.tav.codec.MediaCodecAnalyse.Companion.MediaCodecData)) {
                    return false;
                }
                com.tencent.tav.codec.MediaCodecAnalyse.Companion.MediaCodecData mediaCodecData = (com.tencent.tav.codec.MediaCodecAnalyse.Companion.MediaCodecData) other;
                return kotlin.jvm.internal.o.b(this.name, mediaCodecData.name) && kotlin.jvm.internal.o.b(this.codec, mediaCodecData.codec) && this.encoder == mediaCodecData.encoder && kotlin.jvm.internal.o.b(this.format, mediaCodecData.format) && kotlin.jvm.internal.o.b(this.scene, mediaCodecData.scene) && kotlin.jvm.internal.o.b(this.state, mediaCodecData.state);
            }

            public final android.media.MediaCodec getCodec() {
                return this.codec;
            }

            public final boolean getEncoder() {
                return this.encoder;
            }

            public final android.media.MediaFormat getFormat() {
                return this.format;
            }

            public final java.lang.String getName() {
                return this.name;
            }

            public final java.lang.String getScene() {
                return this.scene;
            }

            public final java.lang.String getState() {
                return this.state;
            }

            public int hashCode() {
                java.lang.String str = this.name;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                android.media.MediaCodec mediaCodec = this.codec;
                int hashCode2 = (((hashCode + (mediaCodec == null ? 0 : mediaCodec.hashCode())) * 31) + java.lang.Boolean.hashCode(this.encoder)) * 31;
                android.media.MediaFormat mediaFormat = this.format;
                return ((((hashCode2 + (mediaFormat != null ? mediaFormat.hashCode() : 0)) * 31) + this.scene.hashCode()) * 31) + this.state.hashCode();
            }

            public final void setCodec(android.media.MediaCodec mediaCodec) {
                this.codec = mediaCodec;
            }

            public final void setEncoder(boolean z17) {
                this.encoder = z17;
            }

            public final void setFormat(android.media.MediaFormat mediaFormat) {
                this.format = mediaFormat;
            }

            public final void setName(java.lang.String str) {
                this.name = str;
            }

            public final void setScene(java.lang.String str) {
                kotlin.jvm.internal.o.g(str, "<set-?>");
                this.scene = str;
            }

            public final void setState(java.lang.String str) {
                kotlin.jvm.internal.o.g(str, "<set-?>");
                this.state = str;
            }

            public java.lang.String toString() {
                return "MediaCodecData(name=" + this.name + ", codec=" + this.codec + ", encoder=" + this.encoder + ", format=" + this.format + ", scene=" + this.scene + ", state=" + this.state + ')';
            }

            public MediaCodecData(java.lang.String str, android.media.MediaCodec mediaCodec, boolean z17, android.media.MediaFormat mediaFormat, java.lang.String scene, java.lang.String state) {
                kotlin.jvm.internal.o.g(scene, "scene");
                kotlin.jvm.internal.o.g(state, "state");
                this.name = str;
                this.codec = mediaCodec;
                this.encoder = z17;
                this.format = mediaFormat;
                this.scene = scene;
                this.state = state;
            }

            public /* synthetic */ MediaCodecData(java.lang.String str, android.media.MediaCodec mediaCodec, boolean z17, android.media.MediaFormat mediaFormat, java.lang.String str2, java.lang.String str3, int i17, kotlin.jvm.internal.i iVar) {
                this((i17 & 1) != 0 ? null : str, (i17 & 2) != 0 ? null : mediaCodec, (i17 & 4) != 0 ? false : z17, (i17 & 8) == 0 ? mediaFormat : null, (i17 & 16) != 0 ? "default" : str2, (i17 & 32) != 0 ? com.tencent.tav.codec.MediaCodecAnalyse.STATE_CREATE : str3);
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        private final void addNewInstance(com.tencent.tav.codec.MediaCodecAnalyse.Companion.MediaCodecData mediaCodecData) {
            com.tencent.tav.codec.MediaCodecAnalyse.analyseList.add(mediaCodecData);
        }

        public static /* synthetic */ com.tencent.tav.codec.MediaCodecAnalyse createDecoderByType$default(com.tencent.tav.codec.MediaCodecAnalyse.Companion companion, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
            if ((i17 & 2) != 0) {
                str2 = "default";
            }
            return companion.createDecoderByType(str, str2);
        }

        public static /* synthetic */ com.tencent.tav.codec.MediaCodecAnalyse createEncoderByType$default(com.tencent.tav.codec.MediaCodecAnalyse.Companion companion, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
            if ((i17 & 2) != 0) {
                str2 = "default";
            }
            return companion.createEncoderByType(str, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void removeInstance(com.tencent.tav.codec.MediaCodecAnalyse.Companion.MediaCodecData mediaCodecData) {
            com.tencent.tav.codec.MediaCodecAnalyse.analyseList.remove(mediaCodecData);
        }

        public final com.tencent.tav.codec.MediaCodecAnalyse createDecoderByType(java.lang.String type, java.lang.String scene) {
            kotlin.jvm.internal.o.g(type, "type");
            kotlin.jvm.internal.o.g(scene, "scene");
            com.tencent.tav.decoder.logger.Logger.i(com.tencent.tav.codec.MediaCodecAnalyse.TAG, "createDecoderByType start: ".concat(type));
            com.tencent.tav.codec.MediaCodecAnalyse mediaCodecAnalyse = new com.tencent.tav.codec.MediaCodecAnalyse();
            mediaCodecAnalyse.data.setScene(scene);
            mediaCodecAnalyse.data.setCodec(android.media.MediaCodec.createDecoderByType(type));
            com.tencent.tav.codec.MediaCodecAnalyse.Companion.MediaCodecData mediaCodecData = mediaCodecAnalyse.data;
            android.media.MediaCodec codec = mediaCodecAnalyse.data.getCodec();
            mediaCodecData.setName(codec != null ? codec.getName() : null);
            mediaCodecAnalyse.data.setEncoder(false);
            com.tencent.tav.codec.MediaCodecAnalyse.INSTANCE.addNewInstance(mediaCodecAnalyse.data);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createDecoderByType finish: ");
            sb6.append(type);
            sb6.append(" name: ");
            android.media.MediaCodec codec2 = mediaCodecAnalyse.data.getCodec();
            sb6.append(codec2 != null ? codec2.getName() : null);
            com.tencent.tav.decoder.logger.Logger.i(com.tencent.tav.codec.MediaCodecAnalyse.TAG, sb6.toString());
            return mediaCodecAnalyse;
        }

        public final com.tencent.tav.codec.MediaCodecAnalyse createEncoderByType(java.lang.String type, java.lang.String scene) {
            kotlin.jvm.internal.o.g(type, "type");
            kotlin.jvm.internal.o.g(scene, "scene");
            com.tencent.tav.decoder.logger.Logger.i(com.tencent.tav.codec.MediaCodecAnalyse.TAG, "createEncoderByType start: ".concat(type));
            com.tencent.tav.codec.MediaCodecAnalyse mediaCodecAnalyse = new com.tencent.tav.codec.MediaCodecAnalyse();
            mediaCodecAnalyse.data.setScene(scene);
            mediaCodecAnalyse.data.setCodec(android.media.MediaCodec.createEncoderByType(type));
            com.tencent.tav.codec.MediaCodecAnalyse.Companion.MediaCodecData mediaCodecData = mediaCodecAnalyse.data;
            android.media.MediaCodec codec = mediaCodecAnalyse.data.getCodec();
            mediaCodecData.setName(codec != null ? codec.getName() : null);
            mediaCodecAnalyse.data.setEncoder(true);
            com.tencent.tav.codec.MediaCodecAnalyse.INSTANCE.addNewInstance(mediaCodecAnalyse.data);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createEncoderByType finish: ");
            sb6.append(type);
            sb6.append(" name: ");
            android.media.MediaCodec codec2 = mediaCodecAnalyse.data.getCodec();
            sb6.append(codec2 != null ? codec2.getName() : null);
            com.tencent.tav.decoder.logger.Logger.i(com.tencent.tav.codec.MediaCodecAnalyse.TAG, sb6.toString());
            return mediaCodecAnalyse;
        }

        public final org.json.JSONArray getCodecInfo() {
            android.media.MediaFormat format;
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (com.tencent.tav.codec.MediaCodecAnalyse.Companion.MediaCodecData mediaCodecData : com.tencent.tav.codec.MediaCodecAnalyse.analyseList) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                java.lang.String str = null;
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, mediaCodecData != null ? mediaCodecData.getName() : null);
                jSONObject.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_ENCODER, mediaCodecData != null ? java.lang.Boolean.valueOf(mediaCodecData.getEncoder()) : null);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, mediaCodecData != null ? mediaCodecData.getScene() : null);
                jSONObject.put("state", mediaCodecData != null ? mediaCodecData.getState() : null);
                if (mediaCodecData != null && (format = mediaCodecData.getFormat()) != null) {
                    str = format.toString();
                }
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_FORMAT, str);
                jSONArray.put(jSONObject);
            }
            return jSONArray;
        }

        public final int getDEBUG_COUNT() {
            return com.tencent.tav.codec.MediaCodecAnalyse.DEBUG_COUNT;
        }

        public final int instanceCount() {
            return com.tencent.tav.codec.MediaCodecAnalyse.analyseList.size();
        }

        public final void makeDebugCountIncrease() {
            setDEBUG_COUNT(getDEBUG_COUNT() + 1);
        }

        public final void setDEBUG_COUNT(int i17) {
            com.tencent.tav.codec.MediaCodecAnalyse.DEBUG_COUNT = i17;
        }
    }

    public static final com.tencent.tav.codec.MediaCodecAnalyse createDecoderByType(java.lang.String str, java.lang.String str2) {
        return INSTANCE.createDecoderByType(str, str2);
    }

    public static final com.tencent.tav.codec.MediaCodecAnalyse createEncoderByType(java.lang.String str, java.lang.String str2) {
        return INSTANCE.createEncoderByType(str, str2);
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public void bindSurfaceTexture(android.graphics.SurfaceTexture surfaceTexture) {
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public void configure(android.media.MediaFormat mediaFormat, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i17) {
        this.data.setFormat(mediaFormat);
        android.media.MediaCodec codec = this.data.getCodec();
        if (codec != null) {
            codec.configure(mediaFormat, surface, mediaCrypto, i17);
        }
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public android.view.Surface createInputSurface() {
        android.media.MediaCodec codec = this.data.getCodec();
        if (codec != null) {
            return codec.createInputSurface();
        }
        return null;
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public int dequeueInputBuffer(long timeoutUs) {
        android.media.MediaCodec codec = this.data.getCodec();
        if (codec != null) {
            return codec.dequeueInputBuffer(timeoutUs);
        }
        return -1;
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public int dequeueOutputBuffer(android.media.MediaCodec.BufferInfo info, long timeoutUs) {
        kotlin.jvm.internal.o.g(info, "info");
        android.media.MediaCodec codec = this.data.getCodec();
        if (codec != null) {
            return codec.dequeueOutputBuffer(info, timeoutUs);
        }
        return -1;
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public void flush() {
        android.media.MediaCodec codec = this.data.getCodec();
        if (codec != null) {
            codec.flush();
        }
    }

    public final android.media.MediaCodec getCodec() {
        return this.data.getCodec();
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public java.nio.ByteBuffer getInputBuffer(int index) {
        return com.tencent.tav.decoder.DecoderUtils.getInputBuffer(this, index);
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public android.media.MediaFormat getInputFormat() {
        android.media.MediaCodec codec = this.data.getCodec();
        if (codec != null) {
            return codec.getInputFormat();
        }
        return null;
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public java.nio.ByteBuffer getOutputBuffer(int index) {
        return com.tencent.tav.decoder.DecoderUtils.getOutputBuffer(this, index);
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public android.media.MediaFormat getOutputFormat() {
        android.media.MediaCodec codec = this.data.getCodec();
        if (codec != null) {
            return codec.getOutputFormat();
        }
        return null;
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public boolean isSoft() {
        return false;
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public void queueInputBuffer(int i17, int i18, int i19, long j17, int i27) {
        android.media.MediaCodec codec = this.data.getCodec();
        if (codec != null) {
            codec.queueInputBuffer(i17, i18, i19, j17, i27);
        }
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public void release() {
        INSTANCE.removeInstance(this.data);
        this.data.setState("release");
        android.media.MediaCodec codec = this.data.getCodec();
        if (codec != null) {
            codec.release();
        }
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public void releaseOutputBuffer(int i17, boolean z17) {
        android.media.MediaCodec codec = this.data.getCodec();
        if (codec != null) {
            codec.releaseOutputBuffer(i17, z17);
        }
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public void reset() {
        this.data.setState(STATE_RESET);
        android.media.MediaCodec codec = this.data.getCodec();
        if (codec != null) {
            codec.reset();
        }
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public void setDataSource(java.lang.String str) {
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public void signalEndOfInputStream() {
        android.media.MediaCodec codec = this.data.getCodec();
        if (codec != null) {
            codec.signalEndOfInputStream();
        }
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public void start() {
        this.data.setState(STATE_START);
        android.media.MediaCodec codec = this.data.getCodec();
        if (codec != null) {
            codec.start();
        }
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public void stop() {
        this.data.setState(STATE_STOP);
        android.media.MediaCodec codec = this.data.getCodec();
        if (codec != null) {
            codec.stop();
        }
    }
}
