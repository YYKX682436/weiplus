package com.tencent.thumbplayer.adapter;

/* loaded from: classes16.dex */
public class TPPlayerStateStrategy {
    public static final int API_GET_BUFFERED = 15;
    public static final int API_GET_DEMUXER_OFFSET = 19;
    public static final int API_GET_DURATION = 11;
    public static final int API_GET_POSITION = 12;
    public static final int API_GET_STATUS = 14;
    public static final int API_GET_VIDEO_SIZE = 13;
    public static final int API_PAUSE = 6;
    public static final int API_PREPARE = 1;
    public static final int API_RELEASE = 16;
    public static final int API_RESET = 8;
    public static final int API_SEEK = 9;
    public static final int API_SELECT_PROGRAM = 18;
    public static final int API_SET_DATASOURCE = 2;
    public static final int API_SET_PARAMS = 3;
    public static final int API_SET_SURFACE = 4;
    public static final int API_START = 5;
    public static final int API_STOP = 7;
    public static final int API_SWITCH_DEF = 17;
    public static final int CB_ON_COMPLETE = 2;
    public static final int CB_ON_DATA_OUTPUT = 7;
    public static final int CB_ON_ERROR = 4;
    public static final int CB_ON_INFO = 3;
    public static final int CB_ON_PREPARED = 1;
    public static final int CB_ON_SEEK_COMPLETE = 5;
    public static final int CB_ON_VIDEO_SIZE_CHANGE = 6;
    private com.tencent.thumbplayer.api.TPPlayerState mState;

    public TPPlayerStateStrategy(com.tencent.thumbplayer.api.TPPlayerState tPPlayerState) {
        this.mState = tPPlayerState;
    }

    private static boolean validCallGetBufferPercent(com.tencent.thumbplayer.api.TPPlayerState tPPlayerState) {
        return tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6) || tPPlayerState.is(8) || tPPlayerState.is(9) || tPPlayerState.is(7);
    }

    private static boolean validCallGetDemuxerOffset(com.tencent.thumbplayer.api.TPPlayerState tPPlayerState) {
        return tPPlayerState.is(1) || tPPlayerState.is(2) || tPPlayerState.is(3) || tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6) || tPPlayerState.is(8) || tPPlayerState.is(9) || tPPlayerState.is(7);
    }

    private static boolean validCallGetDuration(com.tencent.thumbplayer.api.TPPlayerState tPPlayerState) {
        return tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6) || tPPlayerState.is(8) || tPPlayerState.is(9) || tPPlayerState.is(7);
    }

    private static boolean validCallGetPosition(com.tencent.thumbplayer.api.TPPlayerState tPPlayerState) {
        return tPPlayerState.is(1) || tPPlayerState.is(2) || tPPlayerState.is(3) || tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6) || tPPlayerState.is(8) || tPPlayerState.is(9) || tPPlayerState.is(7);
    }

    private static boolean validCallGetStatus(com.tencent.thumbplayer.api.TPPlayerState tPPlayerState) {
        return tPPlayerState.is(1) || tPPlayerState.is(2) || tPPlayerState.is(3) || tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6) || tPPlayerState.is(8) || tPPlayerState.is(9) || tPPlayerState.is(7);
    }

    private static boolean validCallGetVideoSize(com.tencent.thumbplayer.api.TPPlayerState tPPlayerState) {
        return tPPlayerState.is(1) || tPPlayerState.is(2) || tPPlayerState.is(3) || tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6) || tPPlayerState.is(8) || tPPlayerState.is(9) || tPPlayerState.is(7);
    }

    private static boolean validCallPause(com.tencent.thumbplayer.api.TPPlayerState tPPlayerState) {
        return tPPlayerState.is(5) || tPPlayerState.is(6);
    }

    private static boolean validCallPrepare(com.tencent.thumbplayer.api.TPPlayerState tPPlayerState) {
        return tPPlayerState.is(2) || tPPlayerState.is(8) || tPPlayerState.is(9);
    }

    private static boolean validCallRelease(com.tencent.thumbplayer.api.TPPlayerState tPPlayerState) {
        return tPPlayerState.is(1) || tPPlayerState.is(2) || tPPlayerState.is(3) || tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6) || tPPlayerState.is(8) || tPPlayerState.is(9) || tPPlayerState.is(7) || tPPlayerState.is(10);
    }

    private static boolean validCallReset(com.tencent.thumbplayer.api.TPPlayerState tPPlayerState) {
        return tPPlayerState.is(1) || tPPlayerState.is(2) || tPPlayerState.is(3) || tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6) || tPPlayerState.is(8) || tPPlayerState.is(9) || tPPlayerState.is(7) || tPPlayerState.is(10);
    }

    private static boolean validCallSeek(com.tencent.thumbplayer.api.TPPlayerState tPPlayerState) {
        return tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6) || tPPlayerState.is(7);
    }

    private static boolean validCallSelectProgram(com.tencent.thumbplayer.api.TPPlayerState tPPlayerState) {
        return tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(8) || tPPlayerState.is(9) || tPPlayerState.is(6) || tPPlayerState.is(7);
    }

    private static boolean validCallSetDataSource(com.tencent.thumbplayer.api.TPPlayerState tPPlayerState) {
        return tPPlayerState.is(1);
    }

    private static boolean validCallSetParams(com.tencent.thumbplayer.api.TPPlayerState tPPlayerState) {
        return tPPlayerState.is(1) || tPPlayerState.is(2) || tPPlayerState.is(3) || tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6) || tPPlayerState.is(7) || tPPlayerState.is(8) || tPPlayerState.is(9);
    }

    private static boolean validCallSetSurface(com.tencent.thumbplayer.api.TPPlayerState tPPlayerState) {
        return true;
    }

    private static boolean validCallStart(com.tencent.thumbplayer.api.TPPlayerState tPPlayerState) {
        return tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6) || tPPlayerState.is(7);
    }

    private static boolean validCallStop(com.tencent.thumbplayer.api.TPPlayerState tPPlayerState) {
        return tPPlayerState.is(3) || tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(8) || tPPlayerState.is(9) || tPPlayerState.is(6) || tPPlayerState.is(7);
    }

    private static boolean validCallSwitchDef(com.tencent.thumbplayer.api.TPPlayerState tPPlayerState) {
        return tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6) || tPPlayerState.is(7);
    }

    private static boolean validCallbackOnComplete(com.tencent.thumbplayer.api.TPPlayerState tPPlayerState) {
        return tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6);
    }

    private static boolean validCallbackOnDataOutput(com.tencent.thumbplayer.api.TPPlayerState tPPlayerState) {
        return tPPlayerState.is(3) || tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6) || tPPlayerState.is(7) || tPPlayerState.is(8);
    }

    private static boolean validCallbackOnError(com.tencent.thumbplayer.api.TPPlayerState tPPlayerState) {
        return tPPlayerState.is(2) || tPPlayerState.is(3) || tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6);
    }

    private static boolean validCallbackOnInfo(com.tencent.thumbplayer.api.TPPlayerState tPPlayerState) {
        return tPPlayerState.is(3) || tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6);
    }

    private static boolean validCallbackOnPrepared(com.tencent.thumbplayer.api.TPPlayerState tPPlayerState) {
        return tPPlayerState.is(3);
    }

    private static boolean validCallbackOnSeekComplete(com.tencent.thumbplayer.api.TPPlayerState tPPlayerState) {
        return tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6);
    }

    private static boolean validCallbackOnSizeChange(com.tencent.thumbplayer.api.TPPlayerState tPPlayerState) {
        return tPPlayerState.is(3) || tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6);
    }

    public final boolean validStateCall(int i17) {
        if (i17 == 1) {
            return validCallPrepare(this.mState);
        }
        if (i17 == 2) {
            return validCallSetDataSource(this.mState);
        }
        if (i17 == 3) {
            return validCallSetParams(this.mState);
        }
        if (i17 == 4) {
            return validCallSetSurface(this.mState);
        }
        if (i17 == 5) {
            return validCallStart(this.mState);
        }
        if (i17 == 6) {
            return validCallPause(this.mState);
        }
        if (i17 == 7) {
            return validCallStop(this.mState);
        }
        if (i17 == 8) {
            return validCallReset(this.mState);
        }
        if (i17 == 9) {
            return validCallSeek(this.mState);
        }
        if (i17 == 11) {
            return validCallGetDuration(this.mState);
        }
        if (i17 == 12) {
            return validCallGetPosition(this.mState);
        }
        if (i17 == 13) {
            return validCallGetVideoSize(this.mState);
        }
        if (i17 == 14) {
            return validCallGetStatus(this.mState);
        }
        if (i17 == 15) {
            return validCallGetBufferPercent(this.mState);
        }
        if (i17 == 16) {
            return validCallRelease(this.mState);
        }
        if (i17 == 17) {
            return validCallSwitchDef(this.mState);
        }
        if (i17 == 18) {
            return validCallSelectProgram(this.mState);
        }
        if (i17 == 19) {
            return validCallGetDemuxerOffset(this.mState);
        }
        return false;
    }

    public final boolean validStateCallback(int i17) {
        if (i17 == 1) {
            return validCallbackOnPrepared(this.mState);
        }
        if (i17 == 2) {
            return validCallbackOnComplete(this.mState);
        }
        if (i17 == 3) {
            return validCallbackOnInfo(this.mState);
        }
        if (i17 == 4) {
            return validCallbackOnError(this.mState);
        }
        if (i17 == 5) {
            return validCallbackOnSeekComplete(this.mState);
        }
        if (i17 == 6) {
            return validCallbackOnSizeChange(this.mState);
        }
        if (i17 == 7) {
            return validCallbackOnDataOutput(this.mState);
        }
        return false;
    }
}
