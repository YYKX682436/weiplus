package com.tencent.thumbplayer.tmediacodec.codec;

/* loaded from: classes14.dex */
public final class FormatWrapper {
    public static final int NO_VALUE = -1;
    public static final java.lang.String TAG = "FormatWrapper";
    public int channelCount;
    private boolean isVideo;
    private boolean isVideoFieldInit;
    public int rotationDegrees;
    public final java.lang.String sampleMimeType;
    public int sampleRate;
    public java.util.ArrayList<byte[]> initializationData = new java.util.ArrayList<>();
    public int width = -1;
    public int height = -1;
    public int maxWidth = -1;
    public int maxHeight = -1;
    public int maxInputSize = -1;

    public FormatWrapper(java.lang.String str) {
        this.sampleMimeType = str;
    }

    private static java.lang.String configCsdArray(java.lang.String str, byte[] bArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str);
        sb6.append(", length:");
        sb6.append(bArr.length);
        sb6.append("  [");
        for (int i17 = 0; i17 < java.lang.Math.min(bArr.length, 20); i17++) {
            if (i17 != 0) {
                sb6.append(" ,");
            }
            sb6.append((int) bArr[i17]);
        }
        sb6.append("]");
        return sb6.toString();
    }

    public static com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper create(android.media.MediaFormat mediaFormat) {
        com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper formatWrapper = new com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper(mediaFormat.getString("mime"));
        try {
            formatWrapper.sampleRate = getInteger(mediaFormat, "sample-rate");
            formatWrapper.maxInputSize = getInteger(mediaFormat, "max-input-size");
            formatWrapper.initializationData = com.tencent.thumbplayer.tmediacodec.util.TUtils.getCsdBuffers(mediaFormat);
            if (formatWrapper.isVideo()) {
                formatWrapper.rotationDegrees = getInteger(mediaFormat, "rotation-degrees");
                formatWrapper.width = getInteger(mediaFormat, "width");
                formatWrapper.height = getInteger(mediaFormat, "height");
                formatWrapper.maxWidth = getInteger(mediaFormat, "max-width");
                formatWrapper.maxHeight = getInteger(mediaFormat, "max-height");
            } else {
                formatWrapper.channelCount = getInteger(mediaFormat, "channel-count");
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.e(TAG, "create format error", th6);
        }
        return formatWrapper;
    }

    public static void dumpCsdArray(java.util.ArrayList<byte[]> arrayList) {
        if (arrayList != null && com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                sb6.append(configCsdArray(com.tencent.thumbplayer.tmediacodec.util.TUtils.CSD_INDEX_ARRAY[i17], arrayList.get(i17)));
                sb6.append("\n");
            }
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(TAG, "csdData size:" + arrayList.size() + "    " + sb6.toString());
        }
    }

    public static int getInteger(android.media.MediaFormat mediaFormat, java.lang.String str) {
        return getInteger(mediaFormat, str, -1);
    }

    public final boolean initializationDataEquals(com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper formatWrapper) {
        if (this.initializationData.size() != formatWrapper.initializationData.size()) {
            return false;
        }
        for (int i17 = 0; i17 < this.initializationData.size(); i17++) {
            if (!this.initializationData.get(i17).equals(formatWrapper.initializationData.get(i17))) {
                return false;
            }
        }
        return true;
    }

    public final boolean isVideo() {
        if (!this.isVideoFieldInit) {
            this.isVideoFieldInit = true;
            this.isVideo = com.tencent.thumbplayer.tmediacodec.util.TUtils.isVideo(this.sampleMimeType);
        }
        return this.isVideo;
    }

    public static int getInteger(android.media.MediaFormat mediaFormat, java.lang.String str, int i17) {
        return mediaFormat.containsKey(str) ? mediaFormat.getInteger(str) : i17;
    }
}
