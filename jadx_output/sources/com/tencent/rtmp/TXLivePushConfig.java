package com.tencent.rtmp;

/* loaded from: classes16.dex */
public class TXLivePushConfig implements java.io.Serializable {
    public static final int DEFAULT_MAX_VIDEO_BITRATE = 1200;
    public static final int DEFAULT_MIN_VIDEO_BITRATE = 800;
    public int mAudioBitrate;
    public java.lang.String mAudioPreProcessFuncName;
    public java.lang.String mAudioPreProcessLibrary;
    public java.util.HashMap<java.lang.String, java.lang.String> mMetaData;
    public java.lang.String mVideoPreProcessFuncName;
    public java.lang.String mVideoPreProcessLibrary;
    public android.graphics.Bitmap mWatermark;
    public int mCustomModeType = 0;
    public int mAudioSample = 48000;
    public int mAudioChannels = 1;
    public int mVideoFPS = 20;
    public com.tencent.rtmp.TXVideoResolution mVideoResolution = com.tencent.rtmp.TXVideoResolution.RESOLUTION_TYPE_540_960;
    public int mVideoBitrate = 1200;
    public int mMaxVideoBitrate = 1500;
    public int mMinVideoBitrate = 800;
    public int mBeautyLevel = 0;
    public int mWhiteningLevel = 0;
    public int mRuddyLevel = 0;
    public int mEyeScaleLevel = 0;
    public int mFaceSlimLevel = 0;
    public int mConnectRetryCount = 3;
    public int mConnectRetryInterval = 3;
    public int mWatermarkX = 0;
    public int mWatermarkY = 0;
    public float mWatermarkXF = 0.0f;
    public float mWatermarkYF = 0.0f;
    public float mWatermarkWidth = -1.0f;
    public int mVideoEncodeGop = 3;
    public boolean mVideoEncoderXMirror = false;
    public boolean mEnableHighResolutionCapture = false;
    public boolean mEnableVideoHardEncoderMainProfile = true;
    public boolean mFrontCamera = true;
    public boolean mAutoAdjustBitrate = false;
    public int mAutoAdjustStrategy = 0;
    public int mHardwareAccel = 2;
    public boolean mTouchFocus = true;
    public boolean mEnableZoom = false;
    public int mHomeOrientation = 1;
    public android.graphics.Bitmap mPauseImg = null;
    public int mPauseTime = 300;
    public int mPauseFps = 5;
    public int mPauseFlag = 1;
    public boolean mEnableAec = false;
    public boolean mEnableAgc = false;
    public boolean mEnableAns = false;
    public boolean mEnableAudioPreview = false;
    public boolean mEnableScreenCaptureAutoRotate = false;
    public boolean mEnablePureAudioPush = false;
    public boolean mEnableNearestIP = true;
    public int mVolumeType = 0;
    public int mLocalVideoMirrorType = 0;
    public int mRtmpChannelType = 0;

    @java.lang.Deprecated
    public void enableAEC(boolean z17) {
        this.mEnableAec = z17;
    }

    @java.lang.Deprecated
    public void enableAGC(boolean z17) {
        this.mEnableAgc = z17;
    }

    public void enableANS(boolean z17) {
        this.mEnableAns = z17;
    }

    public void enableAudioEarMonitoring(boolean z17) {
        this.mEnableAudioPreview = z17;
    }

    @java.lang.Deprecated
    public void enableHighResolutionCaptureMode(boolean z17) {
        this.mEnableHighResolutionCapture = z17;
    }

    @java.lang.Deprecated
    public void enableNearestIP(boolean z17) {
        this.mEnableNearestIP = z17;
    }

    public void enablePureAudioPush(boolean z17) {
        this.mEnablePureAudioPush = z17;
    }

    public void enableScreenCaptureAutoRotate(boolean z17) {
        this.mEnableScreenCaptureAutoRotate = z17;
    }

    public void enableVideoHardEncoderMainProfile(boolean z17) {
        this.mEnableVideoHardEncoderMainProfile = z17;
    }

    public void setAudioChannels(int i17) {
        this.mAudioChannels = i17;
    }

    public void setAudioSampleRate(int i17) {
        this.mAudioSample = i17;
    }

    public void setAutoAdjustBitrate(boolean z17) {
        this.mAutoAdjustBitrate = z17;
    }

    public void setAutoAdjustStrategy(int i17) {
        this.mAutoAdjustStrategy = i17;
    }

    @java.lang.Deprecated
    public void setBeautyFilter(int i17, int i18, int i19) {
        this.mBeautyLevel = i17;
        this.mWhiteningLevel = i18;
        this.mRuddyLevel = i19;
    }

    public void setConnectRetryCount(int i17) {
        this.mConnectRetryCount = i17;
    }

    public void setConnectRetryInterval(int i17) {
        this.mConnectRetryInterval = i17;
    }

    public void setCustomModeType(int i17) {
        this.mCustomModeType = i17;
    }

    public void setEnableZoom(boolean z17) {
        this.mEnableZoom = z17;
    }

    @java.lang.Deprecated
    public void setEyeScaleLevel(int i17) {
        this.mEyeScaleLevel = i17;
    }

    @java.lang.Deprecated
    public void setFaceSlimLevel(int i17) {
        this.mFaceSlimLevel = i17;
    }

    @java.lang.Deprecated
    public void setFrontCamera(boolean z17) {
        this.mFrontCamera = z17;
    }

    public void setHardwareAcceleration(int i17) {
        if (i17 < 0) {
            i17 = 2;
        }
        this.mHardwareAccel = i17 <= 2 ? i17 : 2;
    }

    public void setHomeOrientation(int i17) {
        this.mHomeOrientation = i17;
    }

    public void setLocalVideoMirrorType(int i17) {
        this.mLocalVideoMirrorType = i17;
    }

    public void setMaxVideoBitrate(int i17) {
        this.mMaxVideoBitrate = i17;
    }

    public void setMetaData(java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        this.mMetaData = hashMap;
    }

    public void setMinVideoBitrate(int i17) {
        this.mMinVideoBitrate = i17;
    }

    public void setPauseFlag(int i17) {
        this.mPauseFlag = i17;
    }

    public void setPauseImg(android.graphics.Bitmap bitmap) {
        this.mPauseImg = bitmap;
    }

    @java.lang.Deprecated
    public void setRtmpChannelType(int i17) {
        this.mRtmpChannelType = i17;
    }

    public void setTouchFocus(boolean z17) {
        this.mTouchFocus = z17;
    }

    public void setVideoBitrate(int i17) {
        this.mVideoBitrate = i17;
    }

    public void setVideoEncodeGop(int i17) {
        this.mVideoEncodeGop = i17;
    }

    public void setVideoEncoderXMirror(boolean z17) {
        this.mVideoEncoderXMirror = z17;
    }

    public void setVideoFPS(int i17) {
        this.mVideoFPS = i17;
    }

    public void setVideoResolution(int i17) {
        if (i17 == 30) {
            this.mVideoResolution = com.tencent.rtmp.TXVideoResolution.RESOLUTION_TYPE_1080_1920;
            return;
        }
        if (i17 == 31) {
            this.mVideoResolution = com.tencent.rtmp.TXVideoResolution.RESOLUTION_TYPE_1920_1080;
            return;
        }
        switch (i17) {
            case 0:
                this.mVideoResolution = com.tencent.rtmp.TXVideoResolution.RESOLUTION_TYPE_360_640;
                return;
            case 1:
                this.mVideoResolution = com.tencent.rtmp.TXVideoResolution.RESOLUTION_TYPE_540_960;
                return;
            case 2:
                this.mVideoResolution = com.tencent.rtmp.TXVideoResolution.RESOLUTION_TYPE_720_1280;
                return;
            case 3:
                this.mVideoResolution = com.tencent.rtmp.TXVideoResolution.RESOLUTION_TYPE_640_360;
                return;
            case 4:
                this.mVideoResolution = com.tencent.rtmp.TXVideoResolution.RESOLUTION_TYPE_960_540;
                return;
            case 5:
                this.mVideoResolution = com.tencent.rtmp.TXVideoResolution.RESOLUTION_TYPE_1280_720;
                return;
            case 6:
                this.mVideoResolution = com.tencent.rtmp.TXVideoResolution.RESOLUTION_TYPE_320_480;
                return;
            case 7:
                this.mVideoResolution = com.tencent.rtmp.TXVideoResolution.RESOLUTION_TYPE_180_320;
                return;
            case 8:
                this.mVideoResolution = com.tencent.rtmp.TXVideoResolution.RESOLUTION_TYPE_270_480;
                return;
            case 9:
                this.mVideoResolution = com.tencent.rtmp.TXVideoResolution.RESOLUTION_TYPE_320_180;
                return;
            case 10:
                this.mVideoResolution = com.tencent.rtmp.TXVideoResolution.RESOLUTION_TYPE_480_270;
                return;
            case 11:
                this.mVideoResolution = com.tencent.rtmp.TXVideoResolution.RESOLUTION_TYPE_240_320;
                return;
            case 12:
                this.mVideoResolution = com.tencent.rtmp.TXVideoResolution.RESOLUTION_TYPE_360_480;
                return;
            case 13:
                this.mVideoResolution = com.tencent.rtmp.TXVideoResolution.RESOLUTION_TYPE_480_640;
                return;
            case 14:
                this.mVideoResolution = com.tencent.rtmp.TXVideoResolution.RESOLUTION_TYPE_320_240;
                return;
            case 15:
                this.mVideoResolution = com.tencent.rtmp.TXVideoResolution.RESOLUTION_TYPE_480_360;
                return;
            case 16:
                this.mVideoResolution = com.tencent.rtmp.TXVideoResolution.RESOLUTION_TYPE_640_480;
                return;
            case 17:
                this.mVideoResolution = com.tencent.rtmp.TXVideoResolution.RESOLUTION_TYPE_480_480;
                return;
            case 18:
                this.mVideoResolution = com.tencent.rtmp.TXVideoResolution.RESOLUTION_TYPE_270_270;
                return;
            case 19:
                this.mVideoResolution = com.tencent.rtmp.TXVideoResolution.RESOLUTION_TYPE_160_160;
                return;
            default:
                return;
        }
    }

    public void setVolumeType(int i17) {
        this.mVolumeType = i17;
    }

    public void setWatermark(android.graphics.Bitmap bitmap, int i17, int i18) {
        this.mWatermark = bitmap;
        this.mWatermarkX = i17;
        this.mWatermarkY = i18;
    }

    public java.lang.String toString() {
        return "[resolution:" + this.mVideoResolution + "][fps:" + this.mVideoFPS + "][gop:" + this.mVideoEncodeGop + "][bitrate:" + this.mVideoBitrate + "][maxBitrate:" + this.mMaxVideoBitrate + "][minBitrate:" + this.mMinVideoBitrate + "][highCapture:" + this.mEnableHighResolutionCapture + "][hwAcc:" + this.mHardwareAccel + "][homeOrientation:" + this.mHomeOrientation + "][volumeType:" + this.mVolumeType + "][earMonitor:" + this.mEnableAudioPreview + "][agc:" + this.mEnableAgc + "][ans:" + this.mEnableAns + "][aec:" + this.mEnableAec + "][sample:" + this.mAudioSample + "][pureAudioPush:" + this.mEnablePureAudioPush + "]";
    }

    @java.lang.Deprecated
    public void setPauseImg(int i17, int i18) {
        this.mPauseTime = i17;
        this.mPauseFps = i18;
    }

    public void setWatermark(android.graphics.Bitmap bitmap, float f17, float f18, float f19) {
        this.mWatermark = bitmap;
        this.mWatermarkXF = f17;
        this.mWatermarkYF = f18;
        this.mWatermarkWidth = f19;
    }
}
