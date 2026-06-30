package com.tencent.youtu.sdkkitframework.liveness;

/* loaded from: classes13.dex */
public class YtVideoEncoderHelper {
    private static final java.lang.String TAG = "YtVideoEncoderHelper";
    public org.json.JSONArray actionVideoFrames;
    private int codecSettingBitRate;
    private int codecSettingFrameRate;
    private int codecSettingiFrameInterval;
    public java.lang.String config;
    private java.lang.String innerMp4Path;
    private boolean isReportEncodeVideoError;
    private java.lang.String supportCodecJSONStr;
    private com.tencent.youtu.sdkkitframework.common.YtVideoEncoder videoEncoder;

    public YtVideoEncoderHelper(java.lang.String str, int i17, int i18, int i19, java.lang.String str2) {
        this.config = str2;
        this.innerMp4Path = str;
        this.codecSettingBitRate = i17;
        this.codecSettingFrameRate = i18;
        this.codecSettingiFrameInterval = i19;
        com.tencent.youtu.sdkkitframework.common.YtVideoEncoder ytVideoEncoder = new com.tencent.youtu.sdkkitframework.common.YtVideoEncoder();
        this.videoEncoder = ytVideoEncoder;
        ytVideoEncoder.getMediaCodecInfos();
    }

    private void conservationVideo(byte[][] bArr, int i17, int i18) {
        int i19;
        java.lang.String[] split = this.config.split("&");
        if (split.length > 0) {
            i19 = 0;
            for (java.lang.String str : split) {
                java.lang.String[] split2 = str.split("=");
                if (split2.length > 1 && split2[0].equals("action_video_shorten_strategy")) {
                    i19 = java.lang.Integer.parseInt(split2[1]);
                }
            }
        } else {
            i19 = 0;
        }
        if (i19 != 1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (split.length > 0) {
                for (java.lang.String str2 : split) {
                    java.lang.String[] split3 = str2.split("=");
                    if (split3.length > 1 && !split3[0].equals("action_video_shorten_strategy") && !split3[0].equals("reflect_images_shorten_strategy")) {
                        sb6.append(split3[0]);
                        sb6.append("=");
                        sb6.append(split3[1]);
                        sb6.append("&");
                    }
                }
            }
            sb6.append("reflect_images_shorten_strategy=1&action_video_shorten_strategy=1");
            this.config = sb6.toString();
        }
        this.supportCodecJSONStr = this.videoEncoder.getSupportCodecJSONStr();
        com.tencent.youtu.sdkkitframework.framework.YtFSM ytFSM = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance();
        if (ytFSM != null) {
            ytFSM.supportCodecJSONStr = this.supportCodecJSONStr;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (int i27 = 0; i27 < bArr.length; i27++) {
            if (i19 == 1 || i27 % 2 == 0) {
                com.tencent.youtu.sdkkitframework.common.YTImageData yTImageData = new com.tencent.youtu.sdkkitframework.common.YTImageData(bArr[i27], i17, i18);
                try {
                    byte[] yuv2JPEG = yTImageData.yuv2JPEG(80);
                    yTImageData.imgData = yuv2JPEG;
                    byte[] encode = android.util.Base64.encode(yuv2JPEG, 2);
                    yTImageData.imgData = encode;
                    yTImageData.checksum = com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.Checksum(encode);
                    jSONArray.put(yTImageData.toJSON());
                } catch (java.lang.Exception e17) {
                    com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "bgr to jpeg error" + android.util.Log.getStackTraceString(e17));
                    sendEncodeData(this.supportCodecJSONStr);
                }
            }
        }
        setActionVideoFrames(jSONArray);
    }

    private int reEncodeVideo(byte[][] bArr, int i17, int i18, byte[] bArr2) {
        java.lang.String str = TAG;
        com.tencent.youtu.sdkkitframework.common.YtLogger.d(str, "re encode video start");
        try {
            this.videoEncoder.clearCache();
            if (startVideoEncoding(i17, i18) != 0) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.d(str, "re encode video error:-1");
                return -1;
            }
            videoEncode(bArr, i17, i18, bArr2);
            com.tencent.youtu.sdkkitframework.common.YtLogger.d(str, "re encode video ok");
            return 0;
        } catch (java.lang.Exception e17) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "re encode video error:-2" + android.util.Log.getStackTraceString(e17));
            return -2;
        }
    }

    private void sendEncodeData(java.lang.String str) {
        if (this.isReportEncodeVideoError) {
            return;
        }
        this.isReportEncodeVideoError = true;
        com.tencent.youtu.sdkkitframework.common.YtLogger.d(TAG, "supportCodecJSONStr:" + str);
        com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendFSMEvent(new java.util.HashMap<java.lang.String, java.lang.Object>(str) { // from class: com.tencent.youtu.sdkkitframework.liveness.YtVideoEncoderHelper.1
            final /* synthetic */ java.lang.String val$supportCodecJSONStr;

            {
                this.val$supportCodecJSONStr = str;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, str);
                    jSONObject.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_ACTION_VIDEO_CONSERVATION_FAIL);
                } catch (org.json.JSONException unused) {
                }
                put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.CONSERVATION_VIDEO_MESSAGE, jSONObject.toString());
            }
        });
    }

    private int startVideoEncoding(int i17, int i18) {
        boolean z17 = false;
        int i19 = 0;
        while (!z17) {
            try {
                i19 = this.videoEncoder.selectColorFormat();
            } catch (java.lang.Exception e17) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "color format type=" + com.tencent.youtu.sdkkitframework.common.YtVideoEncoder.colorFormatInt2String(i19) + android.util.Log.getStackTraceString(e17));
            }
            if (i19 == -1) {
                return -1;
            }
            this.videoEncoder.startEncoding(i17, i18, new java.io.File(this.innerMp4Path), this.codecSettingBitRate, this.codecSettingFrameRate, this.codecSettingiFrameInterval, i19);
            z17 = true;
        }
        return 0;
    }

    private void videoEncode(byte[][] bArr, int i17, int i18, byte[] bArr2) {
        for (byte[] bArr3 : bArr) {
            this.videoEncoder.queueFrame(new com.tencent.youtu.sdkkitframework.common.YTImageData(bArr3, i17, i18));
            this.videoEncoder.encode(this.codecSettingFrameRate, bArr2);
        }
        com.tencent.youtu.sdkkitframework.common.YtLogger.d(TAG, "videoEncoder done");
    }

    public java.lang.String getSupportCodecJSONStr() {
        return this.supportCodecJSONStr;
    }

    public byte[] getVideData() {
        byte[] bArr;
        byte[] bArr2;
        java.io.FileInputStream fileInputStream;
        try {
            fileInputStream = new java.io.FileInputStream(new java.io.File(this.innerMp4Path));
            bArr2 = fileInputStream.available() != 0 ? new byte[fileInputStream.available()] : null;
        } catch (java.lang.Exception e17) {
            e = e17;
            bArr = null;
        }
        try {
            fileInputStream.read(bArr2);
            fileInputStream.close();
        } catch (java.lang.Exception e18) {
            bArr = bArr2;
            e = e18;
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "video io read error! " + android.util.Log.getStackTraceString(e));
            bArr2 = bArr;
            if (bArr2 != null) {
            }
            return null;
        }
        if (bArr2 != null || bArr2.length == 0) {
            return null;
        }
        return bArr2;
    }

    public void makeActionVideoData(byte[][] bArr, int i17, int i18) {
        if (this.videoEncoder == null) {
            this.videoEncoder = new com.tencent.youtu.sdkkitframework.common.YtVideoEncoder();
        }
        if (!this.videoEncoder.isEncodingStarted() && startVideoEncoding(i17, i18) != 0) {
            conservationVideo(bArr, i17, i18);
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "sunny-start video encode error");
            return;
        }
        byte[] bArr2 = new byte[((com.tencent.youtu.sdkkitframework.common.YtVideoEncoder.mCropWidth * i18) * 3) / 2];
        try {
            videoEncode(bArr, i17, i18, bArr2);
        } catch (java.lang.Exception e17) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "encode video error! " + android.util.Log.getStackTraceString(e17));
            int i19 = -2;
            while (i19 == -2) {
                i19 = reEncodeVideo(bArr, i17, i18, bArr2);
            }
            if (i19 != 0) {
                conservationVideo(bArr, i17, i18);
            }
        }
    }

    public void reset() {
        this.videoEncoder.abortEncoding();
    }

    public void setActionVideoFrames(org.json.JSONArray jSONArray) {
        if (this.actionVideoFrames == null) {
            this.actionVideoFrames = jSONArray;
            return;
        }
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            try {
                this.actionVideoFrames.put(jSONArray.get(i17));
            } catch (org.json.JSONException e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }
    }

    public void stop() {
        this.videoEncoder.stopEncoding();
    }

    public void unload() {
        com.tencent.youtu.sdkkitframework.common.YtVideoEncoder ytVideoEncoder = this.videoEncoder;
        if (ytVideoEncoder != null) {
            try {
                try {
                    ytVideoEncoder.abortEncoding();
                    this.videoEncoder.stopEncoding();
                } catch (java.lang.Exception e17) {
                    com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "video release error:" + android.util.Log.getStackTraceString(e17));
                }
            } finally {
                this.videoEncoder = null;
            }
        }
    }
}
