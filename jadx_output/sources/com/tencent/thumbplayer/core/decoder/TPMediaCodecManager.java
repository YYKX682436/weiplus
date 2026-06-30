package com.tencent.thumbplayer.core.decoder;

/* loaded from: classes14.dex */
public class TPMediaCodecManager {
    private static final java.lang.String TAG = "TPMediaCodecManager";
    private static android.util.SparseArray<com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder> mCodecList = new android.util.SparseArray<>();
    private static java.util.concurrent.atomic.AtomicInteger codecNum = new java.util.concurrent.atomic.AtomicInteger(0);

    private static native void _onMediaCodecException(int i17, java.lang.String str);

    private static native void _onMediaCodecReady(int i17, java.lang.String str);

    private static native void _onMediaCodecReportEvent(int i17, int i18);

    private static native void _onMediaDrmInfo(int i17, java.lang.Object obj);

    private static void addCodecToList(int i17, com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder iTPMediaCodecDecoder) {
        synchronized (com.tencent.thumbplayer.core.decoder.TPMediaCodecManager.class) {
            mCodecList.put(i17, iTPMediaCodecDecoder);
        }
    }

    public static int createMediaCodec(boolean z17) {
        if (codecNum.get() >= Integer.MAX_VALUE) {
            codecNum.set(0);
        }
        int andIncrement = codecNum.getAndIncrement();
        addCodecToList(andIncrement, z17 ? new com.tencent.thumbplayer.core.decoder.TPMediaCodecAudioDecoder(andIncrement) : new com.tencent.thumbplayer.core.decoder.TPMediaCodecVideoDecoder(andIncrement));
        return andIncrement;
    }

    public static int flushMediaCodec(int i17) {
        com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder codecById = getCodecById(i17);
        if (codecById != null) {
            return codecById.flush();
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, TAG, "flushMediaCodec failed!");
        return 3;
    }

    private static com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder getCodecById(int i17) {
        com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder iTPMediaCodecDecoder;
        synchronized (com.tencent.thumbplayer.core.decoder.TPMediaCodecManager.class) {
            iTPMediaCodecDecoder = mCodecList.get(i17);
        }
        if (iTPMediaCodecDecoder != null) {
            return iTPMediaCodecDecoder;
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, TAG, "No such codec by id:" + i17);
        return null;
    }

    public static int getSDKVersion() {
        return android.os.Build.VERSION.SDK_INT;
    }

    public static boolean initAudioMediaCodec(int i17, java.lang.String str, int i18, int i19, int i27, int i28) {
        com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder codecById = getCodecById(i17);
        if (codecById == null) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, TAG, "initAudioMediaCodec failed!");
            return false;
        }
        if (codecById.initDecoder(str, i18, i19, i27, i28)) {
            return codecById.startDecoder();
        }
        return false;
    }

    public static boolean initVideoMediaCodec(int i17, java.lang.String str, int i18, int i19, int i27, android.view.Surface surface, int i28, int i29, int i37) {
        com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder codecById = getCodecById(i17);
        if (codecById == null) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, TAG, "initVideoMediaCodec failed!");
            return false;
        }
        if (codecById.initDecoder(str, i18, i19, i27, surface, i28, i29, i37)) {
            return codecById.startDecoder();
        }
        return false;
    }

    public static void onMediaCodecException(int i17, java.lang.String str) {
        _onMediaCodecException(i17, str);
    }

    public static void onMediaCodecReady(int i17, java.lang.String str) {
        _onMediaCodecReady(i17, str);
    }

    public static void onMediaCodecReportEvent(int i17, int i18) {
        _onMediaCodecReportEvent(i17, i18);
    }

    public static void onMediaDrmInfo(int i17, java.lang.Object obj) {
        _onMediaDrmInfo(i17, obj);
    }

    public static com.tencent.thumbplayer.core.decoder.TPFrameInfo receiveOneFrame(int i17) {
        com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder codecById = getCodecById(i17);
        if (codecById != null) {
            return codecById.dequeueOutputBuffer();
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, TAG, "receiveOneFrame failed!");
        return null;
    }

    public static int releaseMediaCodec(int i17) {
        com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder codecById = getCodecById(i17);
        if (codecById == null) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, TAG, "releaseMediaCodec failed!");
            return 3;
        }
        removeCodecFromList(i17);
        return codecById.release();
    }

    public static int releaseVideoFrame(int i17, int i18, boolean z17, long j17) {
        com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder codecById = getCodecById(i17);
        if (codecById != null) {
            return codecById.releaseOutputBuffer(i18, z17, j17);
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, TAG, "releaseVideoFrame failed!");
        return 3;
    }

    private static void removeCodecFromList(int i17) {
        synchronized (com.tencent.thumbplayer.core.decoder.TPMediaCodecManager.class) {
            mCodecList.remove(i17);
        }
    }

    public static int sendOnePacket(int i17, byte[] bArr, boolean z17, long j17, boolean z18) {
        com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder codecById = getCodecById(i17);
        if (codecById != null) {
            return codecById.decode(bArr, z17, j17, z18);
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, TAG, "sendOnePacket failed!");
        return 3;
    }

    public static void setCryptoInfo(int i17, int i18, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i19, int i27, int i28) {
        com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder codecById = getCodecById(i17);
        if (codecById == null) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, TAG, "setMediaCodecParamObject failed!");
        } else {
            codecById.setCryptoInfo(i18, iArr, iArr2, bArr, bArr2, i19, i27, i28);
        }
    }

    public static int setMediaCodecOperateRate(int i17, float f17) {
        com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder codecById = getCodecById(i17);
        if (codecById != null) {
            return codecById.setOperateRate(f17);
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, TAG, "setMediaCodecOperateRate failed!");
        return 3;
    }

    public static boolean setMediaCodecParamBool(int i17, int i18, boolean z17) {
        com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder codecById = getCodecById(i17);
        if (codecById != null) {
            return codecById.setParamBool(i18, z17);
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, TAG, "setMediaCodecParamBool failed!");
        return false;
    }

    public static boolean setMediaCodecParamBytes(int i17, int i18, byte[] bArr) {
        com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder codecById = getCodecById(i17);
        if (codecById != null) {
            return codecById.setParamBytes(i18, bArr);
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, TAG, "setMediaCodecParamBytes failed!");
        return false;
    }

    public static boolean setMediaCodecParamInt(int i17, int i18, int i19) {
        com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder codecById = getCodecById(i17);
        if (codecById != null) {
            return codecById.setParamInt(i18, i19);
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, TAG, "setMediaCodecParamInt failed!");
        return false;
    }

    public static boolean setMediaCodecParamLong(int i17, int i18, long j17) {
        com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder codecById = getCodecById(i17);
        if (codecById != null) {
            return codecById.setParamLong(i18, j17);
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, TAG, "setMediaCodecParamLong failed!");
        return false;
    }

    public static boolean setMediaCodecParamObject(int i17, int i18, java.lang.Object obj) {
        com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder codecById = getCodecById(i17);
        if (codecById != null) {
            return codecById.setParamObject(i18, obj);
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, TAG, "setMediaCodecParamObject failed!");
        return false;
    }

    public static boolean setMediaCodecParamString(int i17, int i18, java.lang.String str) {
        com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder codecById = getCodecById(i17);
        if (codecById != null) {
            return codecById.setParamString(i18, str);
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, TAG, "setMediaCodecParamString failed!");
        return false;
    }

    public static int setMediaCodecSharpenSwitch(int i17) {
        com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder codecById = getCodecById(i17);
        if (codecById != null) {
            return codecById.setSharpenSwitch();
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, TAG, "setMediaCodecSharpenSwitch failed!");
        return 3;
    }

    public static int setMediaCodecSurface(int i17, android.view.Surface surface) {
        com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder codecById = getCodecById(i17);
        if (codecById != null) {
            return codecById.setOutputSurface(surface);
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, TAG, "setMediaCodecSurface failed!");
        return 3;
    }

    public static int signalEndOfStream(int i17) {
        com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder codecById = getCodecById(i17);
        if (codecById != null) {
            return codecById.signalEndOfStream();
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, TAG, "signalEndOfStream failed!");
        return 3;
    }

    public static int switchHdrModeWithSurface(int i17, android.view.Surface surface, int i18) {
        com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder codecById = getCodecById(i17);
        if (codecById != null) {
            return codecById.switchHdrModeWithSurface(surface, i18);
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, TAG, "setMediaCodecSurface failed!");
        return 3;
    }
}
