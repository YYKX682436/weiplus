package com.tencent.tav.core;

/* loaded from: classes16.dex */
public class ExportErrorStatus {
    public static final int APPEND_BUFFER = -110;
    public static final int APPEND_VIDEO_SAMPLE_MAKE_CURRENT = -111;
    public static final int APPEND_VIDEO_SAMPLE_SWAP_BUFFERS = -113;
    public static final int AUDIO_CONFIGURE = -104;
    public static final int AUDIO_DECODER = -202;
    public static final int AUDIO_DECODE_FRAME = -212;
    public static final int AUDIO_ENCODER_NOT_READY_TIME_OUT = -131;
    public static final int AUDIO_FRAME_HANDLE_TIMEOUT = -204;
    public static final int AUDIO_FRAME_HANDLE_TIMEOUT_INTERRUPT = -207;
    public static final int END_WRITE_AUDIO_SAMPLE = -124;
    public static final int END_WRITE_VIDEO_SAMPLE = -123;
    public static final int ERROR_CODE_AUDIO_EXPORTING = -15;
    public static final int ERROR_CODE_VIDEO_EXPORTING = -14;
    public static final int ERROR_FINISHING = -10;
    public static final int EXPORT_CANCEL = -11;
    public static final int EXPORT_SUCCESS = 0;
    public static final int RELEASE_ERROR = -209;
    public static final int RENDER_SAMPLE_BUFFER = -112;
    public static final int START_AUDIO_ENCODER = -102;
    public static final int START_VIDEO_ENCODER = -101;
    public static final int VIDEO_CONFIGURE = -103;
    public static final int VIDEO_DECODER = -201;
    public static final int VIDEO_DECODE_FRAME = -211;
    public static final int VIDEO_ENCODER_NOT_READY_TIME_OUT = -130;
    public static final int VIDEO_FRAME_HANDLE_TIMEOUT = -203;
    public static final int VIDEO_FRAME_HANDLE_TIMEOUT_INTERRUPT = -206;
    public static final int VIDEO_MUXER_ERROR = -205;
    public static final int WRITE_AUDIO_SAMPLE = -122;
    public static final int WRITE_AUDIO_SAMPLE_TIMEOUT = -208;
    public static final int WRITE_VIDEO_SAMPLE = -121;
    public int code;
    public com.tencent.tav.core.parallel.info.PipelineIndicatorInfo indicatorInfo;
    public java.lang.String msg;
    public java.lang.Throwable throwable;

    public ExportErrorStatus(int i17) {
        this(i17, null);
    }

    private static int getErrCode(com.tencent.tav.coremedia.CMSampleState cMSampleState) {
        int exportCode = cMSampleState.getExportCode();
        return exportCode == 0 ? (int) cMSampleState.getStateCode() : exportCode;
    }

    public static boolean hardwareError(int i17) {
        return i17 == -101 || i17 == -102 || i17 == -103 || i17 == -104;
    }

    public java.lang.String toString() {
        return "ExportErrorStatus{code=" + this.code + ", throwable=" + this.throwable + ", msg='" + this.msg + "', indicatorInfo=" + this.indicatorInfo + '}';
    }

    public ExportErrorStatus(int i17, java.lang.Throwable th6, java.lang.String str, com.tencent.tav.core.parallel.info.PipelineIndicatorInfo pipelineIndicatorInfo) {
        this(i17, th6, str);
        this.indicatorInfo = pipelineIndicatorInfo;
    }

    public ExportErrorStatus(int i17, java.lang.Throwable th6) {
        this(i17, th6, null);
    }

    public ExportErrorStatus(int i17, java.lang.Throwable th6, java.lang.String str) {
        this.code = i17;
        this.throwable = th6;
        this.msg = str;
    }

    public ExportErrorStatus(com.tencent.tav.coremedia.CMSampleState cMSampleState) {
        this(getErrCode(cMSampleState), cMSampleState.getThrowable(), cMSampleState.getMsg());
    }
}
