package com.tencent.thumbplayer.core.decoder;

/* loaded from: classes14.dex */
public interface ITPMediaCodecDecoder {
    public static final int BOOL_DISABLE_MEDIA_CODEC_DOLBY_VISION_COMPONENT = 6;
    public static final int BOOL_ENABLE_ASYNC_MODE = 1;
    public static final int BOOL_ENABLE_DEFAULT_CODEC_FOR_DOLBY = 299;
    public static final int BOOL_ENABLE_HDR_CUSTOM_RENDER = 99;
    public static final int BOOL_ENABLE_MEDIACODEC_OUTPUT_DATA = 5;
    public static final int BOOL_ENABLE_MEDIACODEC_RELEASE_OUTPUTBUFFER_WITH_TIMESTAMP = 7;
    public static final int BOOL_ENABLE_MEDIACODEC_REUSE = 4;
    public static final int BOOL_ENABLE_SET_OUTPUT_SURFACE_API = 0;
    public static final int BOOL_SET_IS_ADTS = 2;
    public static final int BOOL_SET_IS_AUDIO_PASSTHROUGH = 3;
    public static final int BYTES_SET_CSD0_DATA = 200;
    public static final int BYTES_SET_CSD1_DATA = 201;
    public static final int BYTES_SET_CSD2_DATA = 202;
    public static final int INT_ENABLE_RENDERER_SHARPEN = 100;
    public static final int OBJECT_SET_MEDIA_CRYPTO = 300;
    public static final int STRING_SHARPEN_SHADER_PATH = 101;
    public static final int TP_CODEC_RETURN_CODE_EOS = 2;
    public static final int TP_CODEC_RETURN_CODE_ERROR = 3;
    public static final int TP_CODEC_RETURN_CODE_INTERNAL_RESET = 4;
    public static final int TP_CODEC_RETURN_CODE_OK = 0;
    public static final int TP_CODEC_RETURN_CODE_TRY_AGAIN = 1;
    public static final int TP_ERROR_DECODE_FAILED = 103;
    public static final int TP_ERROR_FLUSH_FAILED = 104;
    public static final int TP_ERROR_INVALID_CODECPAR = 100;
    public static final int TP_ERROR_NO_CODEC = 101;
    public static final int TP_ERROR_OPEN_FAILED = 102;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface MediaCodecReturnCode {
    }

    int decode(byte[] bArr, boolean z17, long j17, boolean z18);

    com.tencent.thumbplayer.core.decoder.TPFrameInfo dequeueOutputBuffer();

    int flush();

    boolean initDecoder(java.lang.String str, int i17, int i18, int i19, int i27);

    boolean initDecoder(java.lang.String str, int i17, int i18, int i19, android.view.Surface surface, int i27, int i28, int i29);

    int release();

    int releaseOutputBuffer(int i17, boolean z17, long j17);

    void setCryptoInfo(int i17, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i18, int i19, int i27);

    int setOperateRate(float f17);

    int setOutputSurface(android.view.Surface surface);

    boolean setParamBool(int i17, boolean z17);

    boolean setParamBytes(int i17, byte[] bArr);

    boolean setParamInt(int i17, int i18);

    boolean setParamLong(int i17, long j17);

    boolean setParamObject(int i17, java.lang.Object obj);

    boolean setParamString(int i17, java.lang.String str);

    int setSharpenSwitch();

    int signalEndOfStream();

    boolean startDecoder();

    int switchHdrModeWithSurface(android.view.Surface surface, int i17);
}
