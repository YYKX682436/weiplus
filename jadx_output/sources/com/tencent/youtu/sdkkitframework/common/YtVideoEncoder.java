package com.tencent.youtu.sdkkitframework.common;

/* loaded from: classes13.dex */
public class YtVideoEncoder {
    private static final java.lang.String MIME_TYPE = "video/avc";
    private static final java.lang.String TAG = "YtVideoEncoder";
    public static int mCropWidth;
    private static int mHeight;
    private static int mWidth;
    private static org.json.JSONArray supportCodecJSONArray;
    private static final java.util.Set<java.lang.Integer> supportCodecType;
    private android.media.MediaCodecInfo codecInfo;
    byte[] mCroppedData;
    private java.util.concurrent.CountDownLatch mNewFrameLatch;
    private java.io.File mOutputFile;
    private android.media.MediaMuxer mediaMuxer;
    private android.media.MediaFormat mediaMuxerFormat;
    private java.lang.String outputFileString;
    private android.media.MediaCodec videoEncoder;
    private int videoTrackIndex;
    private java.util.concurrent.ConcurrentLinkedQueue<com.tencent.youtu.sdkkitframework.common.YTImageData> vidoeEncodeQueue = new java.util.concurrent.ConcurrentLinkedQueue<>();
    private boolean isMediaMuxerStarted = false;
    private final java.lang.Object mFrameSync = new java.lang.Object();
    private final java.lang.Object mediaMuxerSync = new java.lang.Object();
    private int videoRotation = 0;
    private int videoGenerateIndex = 0;
    private int addedTrackCount = 0;
    private boolean mNoMoreFrames = false;
    private boolean isEncodingStarted = false;
    private int colorFormat = 21;
    private int realColorFormat = 0;
    private java.util.Map<android.media.MediaCodecInfo, java.util.Set<java.lang.Integer>> selectEncode = new java.util.HashMap();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface VideoEncodeResultCode {
        public static final int VIDEO_ENCODE_FAIL = -2;
        public static final int VIDEO_ENCODE_SUCCESS = 0;
        public static final int VIDEO_MEDIA_NOT_HAS_USE = -1;
        public static final int VIDEO_START_SUCCESS = 0;
    }

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        supportCodecType = hashSet;
        hashSet.add(21);
        hashSet.add(39);
        hashSet.add(19);
        hashSet.add(20);
    }

    private void I420ToNV21(int i17, int i18, byte[] bArr, byte[] bArr2) {
        if (bArr2 == null) {
            bArr2 = new byte[((i17 * i18) * 3) / 2];
        }
        int i19 = i17 * i18;
        if (i19 >= 0) {
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, i19);
        }
        int i27 = (i19 / 4) + i19;
        int i28 = i19;
        int i29 = i28;
        while (i28 < (i19 * 3) / 2) {
            bArr2[i27] = bArr[i28];
            bArr2[i29] = bArr[i28 + 1];
            i27++;
            i29++;
            i28 += 2;
        }
    }

    private void NV12ToNV21(int i17, int i18, byte[] bArr, byte[] bArr2) {
        if (bArr2 == null) {
            bArr2 = new byte[((i17 * i18) * 3) / 2];
        }
        int i19 = i17 * i18;
        if (i19 >= 0) {
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, i19);
        }
        int i27 = i19;
        while (i27 < (i19 * 3) / 2) {
            int i28 = i27 + 1;
            if (i28 % 2 == 0) {
                int i29 = i27 - 1;
                bArr2[i27] = bArr[i29];
                bArr2[i29] = bArr[i27];
            }
            i27 = i28;
        }
    }

    public static java.lang.String colorFormatInt2String(int i17) {
        for (java.lang.reflect.Field field : android.media.MediaCodecInfo.CodecCapabilities.class.getDeclaredFields()) {
            if (field.getName().toLowerCase().contains("COLOR_".toLowerCase())) {
                try {
                    if (field.getInt(null) == i17) {
                        return field.getName();
                    }
                    continue;
                } catch (java.lang.IllegalAccessException unused) {
                    continue;
                }
            }
        }
        return "unknown colorFormat: " + i17;
    }

    private long computePresentationTime(long j17, int i17) {
        return ((j17 * 1000000) / i17) + 132;
    }

    private void convertYUV(com.tencent.youtu.sdkkitframework.common.YTImageData yTImageData, byte[] bArr) {
        cropYUV(yTImageData.imgData, yTImageData.getWidth(), yTImageData.getHeight(), mCropWidth);
        int i17 = this.colorFormat;
        if (i17 == 21) {
            NV12ToNV21(mCropWidth, yTImageData.getHeight(), this.mCroppedData, bArr);
        } else if (i17 != 39) {
            I420ToNV21(mCropWidth, yTImageData.getHeight(), this.mCroppedData, bArr);
        } else {
            byte[] bArr2 = this.mCroppedData;
            java.lang.System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        }
    }

    private void cropYUV(byte[] bArr, int i17, int i18, int i19) {
        if (this.mCroppedData == null) {
            this.mCroppedData = new byte[((i19 * i18) * 3) / 2];
        }
        int i27 = (i17 - i19) / 2;
        int i28 = (i17 * i18) + i27;
        for (int i29 = 0; i29 < i18; i29++) {
            java.lang.System.arraycopy(bArr, i27, this.mCroppedData, i29 * i19, i19);
            i27 += i17;
        }
        for (int i37 = 0; i37 < i18 / 2; i37++) {
            java.lang.System.arraycopy(bArr, i28, this.mCroppedData, (i19 * i18) + (i37 * i19), i19);
            i28 += i17;
        }
    }

    private java.nio.ByteBuffer getInputBuffer(int i17) {
        return this.videoEncoder.getInputBuffer(i17);
    }

    private java.nio.ByteBuffer getOutputBuffer(int i17) {
        return this.videoEncoder.getOutputBuffer(i17);
    }

    private void release() {
        synchronized (this.mediaMuxerSync) {
            if (this.videoEncoder != null) {
                java.lang.String str = TAG;
                com.tencent.youtu.sdkkitframework.common.YtLogger.d(str, "reset media codec");
                this.videoEncoder.reset();
                com.tencent.youtu.sdkkitframework.common.YtLogger.d(str, "stop media codec");
                this.videoEncoder.stop();
                com.tencent.youtu.sdkkitframework.common.YtLogger.d(str, "Release media codec");
                this.videoEncoder.release();
                this.videoEncoder = null;
                com.tencent.youtu.sdkkitframework.common.YtLogger.d(str, "RELEASE Video CODEC");
            }
            if (this.mediaMuxer != null) {
                java.lang.String str2 = TAG;
                com.tencent.youtu.sdkkitframework.common.YtLogger.d(str2, "Stop media muxer");
                this.mediaMuxer.stop();
                com.tencent.youtu.sdkkitframework.common.YtLogger.d(str2, "Release media muxer");
                this.mediaMuxer.release();
                this.mediaMuxer = null;
                this.isMediaMuxerStarted = false;
                com.tencent.youtu.sdkkitframework.common.YtLogger.d(str2, "RELEASE MUXER");
            }
            this.mediaMuxerFormat = null;
        }
    }

    private void startMediaMuxer(android.media.MediaFormat mediaFormat) {
        synchronized (this.mediaMuxerSync) {
            if (this.isMediaMuxerStarted) {
                android.media.MediaFormat mediaFormat2 = this.mediaMuxerFormat;
                if (mediaFormat2 != null && mediaFormat != null && mediaFormat2.toString().equals(mediaFormat.toString())) {
                    return;
                }
                try {
                    this.mediaMuxer.stop();
                } catch (java.lang.Exception e17) {
                    com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "media muxer stop failed:" + android.util.Log.getStackTraceString(e17));
                }
                this.mediaMuxer.release();
                this.mediaMuxer = null;
                this.isMediaMuxerStarted = false;
                try {
                    this.mediaMuxer = new android.media.MediaMuxer(this.outputFileString, 0);
                } catch (java.lang.Exception e18) {
                    com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "Unable to get path for " + android.util.Log.getStackTraceString(e18));
                    return;
                }
            }
            this.mediaMuxerFormat = mediaFormat;
            this.videoTrackIndex = this.mediaMuxer.addTrack(mediaFormat);
            int i17 = this.addedTrackCount + 1;
            this.addedTrackCount = i17;
            if (i17 >= 1) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.d(TAG, "Media muxer is starting...");
                this.mediaMuxer.start();
                this.isMediaMuxerStarted = true;
                this.mediaMuxerSync.notifyAll();
            }
        }
    }

    public void abortEncoding() {
        this.isEncodingStarted = false;
        if (this.mOutputFile != null) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.d(TAG, "Clean up record file");
            this.mOutputFile.delete();
            this.mOutputFile = null;
        }
        if (this.videoEncoder == null || this.mediaMuxer == null) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "Failed to abort encoding since it never started");
            return;
        }
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "Aborting encoding");
        release();
        this.mNoMoreFrames = true;
        this.vidoeEncodeQueue = new java.util.concurrent.ConcurrentLinkedQueue<>();
        synchronized (this.mFrameSync) {
            java.util.concurrent.CountDownLatch countDownLatch = this.mNewFrameLatch;
            if (countDownLatch != null && countDownLatch.getCount() > 0) {
                this.mNewFrameLatch.countDown();
            }
        }
    }

    public void clearCache() {
        if (this.mOutputFile != null) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.d(TAG, "Clean up record file");
            this.mOutputFile.delete();
            this.mOutputFile = null;
        }
        if (this.isEncodingStarted) {
            try {
                this.videoEncoder.stop();
                this.videoEncoder.release();
            } catch (java.lang.IllegalStateException e17) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "restart:stop video error" + android.util.Log.getStackTraceString(e17));
            }
        }
        if (this.mediaMuxer != null) {
            this.mediaMuxer = null;
        }
        this.vidoeEncodeQueue.clear();
        this.isEncodingStarted = false;
    }

    public void encode(int i17, byte[] bArr) {
        java.util.concurrent.CountDownLatch countDownLatch;
        if (this.isEncodingStarted) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.d(TAG, "Encoder started");
            if (this.mNoMoreFrames && this.vidoeEncodeQueue.size() == 0) {
                return;
            }
            com.tencent.youtu.sdkkitframework.common.YTImageData poll = this.vidoeEncodeQueue.poll();
            if (poll == null) {
                synchronized (this.mFrameSync) {
                    countDownLatch = new java.util.concurrent.CountDownLatch(1);
                    this.mNewFrameLatch = countDownLatch;
                }
                try {
                    countDownLatch.await();
                } catch (java.lang.InterruptedException e17) {
                    com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "Queueing frame" + android.util.Log.getStackTraceString(e17));
                }
                poll = this.vidoeEncodeQueue.poll();
            }
            if (poll == null) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "encode data is Null!!: ");
                return;
            }
            convertYUV(poll, bArr);
            int dequeueInputBuffer = this.videoEncoder.dequeueInputBuffer(200000L);
            long computePresentationTime = computePresentationTime(this.videoGenerateIndex, i17);
            if (dequeueInputBuffer >= 0) {
                java.nio.ByteBuffer inputBuffer = getInputBuffer(dequeueInputBuffer);
                inputBuffer.clear();
                inputBuffer.put(bArr);
                this.videoEncoder.queueInputBuffer(dequeueInputBuffer, 0, bArr.length, computePresentationTime, 0);
                this.videoGenerateIndex++;
            }
            android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.videoEncoder.dequeueOutputBuffer(bufferInfo, 200000L);
            if (dequeueOutputBuffer == -1) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "No output from encoder available");
                return;
            }
            if (dequeueOutputBuffer == -2) {
                startMediaMuxer(this.videoEncoder.getOutputFormat());
                return;
            }
            if (dequeueOutputBuffer < 0) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "unexpected result from encoder.dequeueOutputBuffer: " + dequeueOutputBuffer);
                return;
            }
            if (bufferInfo.size != 0) {
                java.nio.ByteBuffer outputBuffer = getOutputBuffer(dequeueOutputBuffer);
                if (outputBuffer == null) {
                    com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "encoderOutputBuffer " + dequeueOutputBuffer + " was null");
                    return;
                }
                outputBuffer.position(bufferInfo.offset);
                outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                com.tencent.youtu.sdkkitframework.common.YtLogger.d(TAG, "media muxer write video data outputindex " + this.videoGenerateIndex);
                synchronized (this.mediaMuxer) {
                    this.mediaMuxer.writeSampleData(this.videoTrackIndex, outputBuffer, bufferInfo);
                }
                this.videoEncoder.releaseOutputBuffer(dequeueOutputBuffer, false);
            }
        }
    }

    public android.media.MediaCodecInfo getCodecInfo() {
        return this.codecInfo;
    }

    public int getColorFormat() {
        return this.realColorFormat;
    }

    public void getMediaCodecInfos() {
        int codecCount = android.media.MediaCodecList.getCodecCount();
        for (int i17 = 0; i17 < codecCount; i17++) {
            android.media.MediaCodecInfo codecInfoAt = android.media.MediaCodecList.getCodecInfoAt(i17);
            if (codecInfoAt.isEncoder() && (codecInfoAt.getName().contains("google") || codecInfoAt.getName().contains(com.eclipsesource.mmv8.Platform.ANDROID))) {
                for (java.lang.String str : codecInfoAt.getSupportedTypes()) {
                    if (str.equalsIgnoreCase("video/avc")) {
                        android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType(str);
                        java.util.HashSet hashSet = new java.util.HashSet();
                        int i18 = 0;
                        while (true) {
                            int[] iArr = capabilitiesForType.colorFormats;
                            if (i18 >= iArr.length) {
                                break;
                            }
                            int i19 = iArr[i18];
                            if (supportCodecType.contains(java.lang.Integer.valueOf(i19))) {
                                hashSet.add(java.lang.Integer.valueOf(i19));
                            }
                            i18++;
                        }
                        if (hashSet.size() > 0) {
                            this.selectEncode.put(codecInfoAt, hashSet);
                        }
                    }
                }
            }
        }
        supportCodecJSONArray = new org.json.JSONArray();
        for (android.media.MediaCodecInfo mediaCodecInfo : this.selectEncode.keySet()) {
            try {
                supportCodecJSONArray.put(mediaCodecInfo.getName() + ":" + java.util.Arrays.toString(this.selectEncode.get(mediaCodecInfo).toArray(new java.lang.Integer[0])));
            } catch (java.lang.Exception e17) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "supportCodecJSONArray error" + android.util.Log.getStackTraceString(e17));
            }
        }
        com.tencent.youtu.sdkkitframework.common.YtLogger.d(TAG, supportCodecJSONArray.length() + "--getMediaCodecInfos:" + supportCodecJSONArray.toString());
    }

    public java.lang.String getSupportCodecJSONStr() {
        return supportCodecJSONArray.toString();
    }

    public boolean isEncodingStarted() {
        return this.isEncodingStarted;
    }

    public void queueFrame(com.tencent.youtu.sdkkitframework.common.YTImageData yTImageData) {
        if (!this.isEncodingStarted || this.videoEncoder == null || this.mediaMuxer == null) {
            return;
        }
        com.tencent.youtu.sdkkitframework.common.YtLogger.d(TAG, "Queueing frame");
        this.vidoeEncodeQueue.add(yTImageData);
        synchronized (this.mFrameSync) {
            java.util.concurrent.CountDownLatch countDownLatch = this.mNewFrameLatch;
            if (countDownLatch != null && countDownLatch.getCount() > 0) {
                this.mNewFrameLatch.countDown();
            }
        }
    }

    public int selectColorFormat() {
        java.util.Map<android.media.MediaCodecInfo, java.util.Set<java.lang.Integer>> map = this.selectEncode;
        if (map != null && map.size() != 0) {
            if (this.codecInfo == null) {
                java.util.Iterator<android.media.MediaCodecInfo> it = this.selectEncode.keySet().iterator();
                if (it.hasNext()) {
                    this.codecInfo = it.next();
                }
            }
            java.util.Set<java.lang.Integer> set = this.selectEncode.get(this.codecInfo);
            if (set == null || set.size() == 0) {
                this.selectEncode.remove(this.codecInfo);
                java.util.Iterator<android.media.MediaCodecInfo> it6 = this.selectEncode.keySet().iterator();
                if (it6.hasNext()) {
                    android.media.MediaCodecInfo next = it6.next();
                    this.codecInfo = next;
                    set = this.selectEncode.get(next);
                }
            }
            if (set.contains(21)) {
                set.remove(21);
                com.tencent.youtu.sdkkitframework.common.YtLogger.d(TAG, "codecInfo=" + this.codecInfo.getName() + "|selectColorFormat:" + colorFormatInt2String(21));
                return 21;
            }
            java.util.Iterator<java.lang.Integer> it7 = set.iterator();
            if (it7.hasNext()) {
                java.lang.Integer next2 = it7.next();
                it7.remove();
                com.tencent.youtu.sdkkitframework.common.YtLogger.d(TAG, "codecInfo=" + this.codecInfo.getName() + "|selectColorFormat:" + colorFormatInt2String(next2.intValue()));
                return next2.intValue();
            }
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "selectColorFormat error");
        }
        return -1;
    }

    public void startEncoding(int i17, int i18, java.io.File file, int i19, int i27, int i28, int i29) {
        if (i17 == 480) {
            mCropWidth = com.tencent.wcdb.FileUtils.S_IRWXU;
        } else if (i17 == 720) {
            mCropWidth = 704;
        } else {
            mCropWidth = i17;
        }
        mWidth = i17;
        mHeight = i18;
        this.mOutputFile = file;
        file.delete();
        this.outputFileString = file.getCanonicalPath();
        if (this.mediaMuxer == null) {
            android.media.MediaMuxer mediaMuxer = new android.media.MediaMuxer(this.outputFileString, 0);
            this.mediaMuxer = mediaMuxer;
            mediaMuxer.setOrientationHint(this.videoRotation);
        }
        java.lang.String str = TAG;
        com.tencent.youtu.sdkkitframework.common.YtLogger.d(str, "found codec: " + this.codecInfo.getName() + "|colorFormat:" + i29);
        this.realColorFormat = i29;
        this.videoEncoder = android.media.MediaCodec.createByCodecName(this.codecInfo.getName());
        android.media.MediaFormat createVideoFormat = android.media.MediaFormat.createVideoFormat("video/avc", mCropWidth, mHeight);
        createVideoFormat.setInteger(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, i19);
        createVideoFormat.setInteger("frame-rate", i27);
        createVideoFormat.setInteger("color-format", i29);
        createVideoFormat.setInteger("i-frame-interval", i28);
        this.videoEncoder.configure(createVideoFormat, (android.view.Surface) null, (android.media.MediaCrypto) null, 1);
        this.videoEncoder.start();
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(str, "Initialization complete. Starting encoder...");
        this.isEncodingStarted = true;
    }

    public void stopEncoding() {
        this.isEncodingStarted = false;
        if (this.videoEncoder == null || this.mediaMuxer == null) {
            return;
        }
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "Stopping encoding");
        this.mNoMoreFrames = true;
        synchronized (this.mFrameSync) {
            java.util.concurrent.CountDownLatch countDownLatch = this.mNewFrameLatch;
            if (countDownLatch != null && countDownLatch.getCount() > 0) {
                this.mNewFrameLatch.countDown();
            }
        }
        release();
    }
}
