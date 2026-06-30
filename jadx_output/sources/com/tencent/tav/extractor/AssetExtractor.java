package com.tencent.tav.extractor;

/* loaded from: classes16.dex */
public class AssetExtractor implements java.lang.Cloneable {
    public static final int SAMPLE_FLAG_ENCRYPTED = 2;
    public static final int SAMPLE_FLAG_SYNC = 1;
    public static final int SEEK_TO_CLOSEST_SYNC = 2;
    public static final int SEEK_TO_NEXT_SYNC = 1;
    public static final int SEEK_TO_PREVIOUS_SYNC = 0;
    private final java.lang.String TAG;
    private byte _hellAccFlag_;
    private com.tencent.tav.extractor.IExtractorDelegate delegate;
    private long duration;
    private long mNativeContext;
    private int preferRotation;
    private boolean released;
    private com.tencent.tav.coremedia.CGSize size;
    private java.lang.String sourcePath;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface SampleFlag {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface SeekMode {
    }

    static {
        if (com.tencent.tav.ResourceLoadUtil.isLoaded()) {
            nativeInit();
            return;
        }
        java.lang.System.out.println("loadlibrary : tav start");
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("tav");
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/tav/extractor/AssetExtractor", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/tav/extractor/AssetExtractor", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.tencent.tav.ResourceLoadUtil.setLoaded(true);
            nativeInit();
        } catch (java.lang.Throwable unused) {
        }
    }

    public AssetExtractor() {
        this(com.tencent.tav.extractor.AssetExtractorConfig.DOWNGRADING);
    }

    private native synchronized boolean advanceNative();

    private native synchronized long getSampleTimeNative();

    private native synchronized int getSampleTrackIndexNative();

    private final native synchronized int getTrackCountNative();

    private native synchronized java.util.Map<java.lang.String, java.lang.Object> getTrackFormatNative(int i17);

    private final native synchronized void nativeFinalize();

    private static final native synchronized void nativeInit();

    private native synchronized int readSampleDataNative(java.nio.ByteBuffer byteBuffer, int i17);

    private final native synchronized void releaseNative();

    private native void seekToNative(long j17, int i17);

    private native synchronized void selectTrackNative(int i17);

    private native synchronized void unselectTrackNative(int i17);

    public synchronized boolean advance() {
        com.tencent.tav.extractor.IExtractorDelegate iExtractorDelegate = this.delegate;
        if (iExtractorDelegate != null) {
            return iExtractorDelegate.advance();
        }
        if (this.released) {
            return false;
        }
        return advanceNative();
    }

    public synchronized void dispose() {
        if (this.sourcePath.isEmpty()) {
            return;
        }
        if (!this.released && this.delegate == null) {
            com.tencent.tav.decoder.logger.Logger.i(this.TAG, "dispose: sourcePath = " + this.sourcePath);
            releaseNative();
        }
        com.tencent.tav.extractor.IExtractorDelegate iExtractorDelegate = this.delegate;
        if (iExtractorDelegate != null) {
            iExtractorDelegate.release();
            this.delegate = null;
        }
    }

    public void finalize() {
        if (this.delegate == null && !this.released) {
            synchronized (this) {
                if (!this.released) {
                    this.released = true;
                    nativeFinalize();
                }
            }
        }
    }

    public synchronized long getAudioDuration() {
        return com.tencent.tav.decoder.DecoderUtils.getAudioDuration(this);
    }

    public synchronized long getDuration() {
        if (this.duration == 0) {
            this.duration = com.tencent.tav.decoder.DecoderUtils.getDuration(this);
        }
        return this.duration;
    }

    public synchronized int getPreferRotation() {
        if (this.preferRotation == -1) {
            this.preferRotation = com.tencent.tav.extractor.ExtractorUtils.getPreferRotation(this);
        }
        return this.preferRotation;
    }

    public native int getSampleFlags();

    public synchronized long getSampleTime() {
        com.tencent.tav.extractor.IExtractorDelegate iExtractorDelegate = this.delegate;
        if (iExtractorDelegate != null) {
            return iExtractorDelegate.getSampleTime();
        }
        if (this.released) {
            return -1L;
        }
        return getSampleTimeNative();
    }

    public synchronized int getSampleTrackIndex() {
        com.tencent.tav.extractor.IExtractorDelegate iExtractorDelegate = this.delegate;
        if (iExtractorDelegate != null) {
            return iExtractorDelegate.getSampleTrackIndex();
        }
        if (this.released) {
            return -1;
        }
        return getSampleTrackIndexNative();
    }

    public synchronized com.tencent.tav.coremedia.CGSize getSize() {
        if (this.size == null) {
            this.size = com.tencent.tav.extractor.ExtractorUtils.getVideoSize(this);
        }
        return this.size;
    }

    public java.lang.String getSourcePath() {
        return this.sourcePath;
    }

    public final synchronized int getTrackCount() {
        com.tencent.tav.extractor.IExtractorDelegate iExtractorDelegate = this.delegate;
        if (iExtractorDelegate != null) {
            return iExtractorDelegate.getTrackCount();
        }
        if (this.released) {
            return 0;
        }
        return getTrackCountNative();
    }

    public synchronized android.media.MediaFormat getTrackFormat(int i17) {
        com.tencent.tav.extractor.IExtractorDelegate iExtractorDelegate = this.delegate;
        if (iExtractorDelegate != null) {
            android.media.MediaFormat trackFormat = iExtractorDelegate.getTrackFormat(i17);
            com.tencent.tav.decoder.logger.Logger.v(this.TAG, "getTrackFormat(delegate): index = " + i17 + ", format = " + trackFormat);
            return trackFormat;
        }
        android.media.MediaFormat mediaFormat = new android.media.MediaFormat();
        if (this.released) {
            return mediaFormat;
        }
        java.util.Map<java.lang.String, java.lang.Object> trackFormatNative = getTrackFormatNative(i17);
        try {
            java.lang.reflect.Field declaredField = android.media.MediaFormat.class.getDeclaredField("mMap");
            declaredField.setAccessible(true);
            declaredField.set(mediaFormat, trackFormatNative);
        } catch (java.lang.Exception e17) {
            e17.getMessage();
        }
        com.tencent.tav.decoder.logger.Logger.v(this.TAG, "getTrackFormat: index = " + i17 + ", format = " + mediaFormat);
        return mediaFormat;
    }

    public boolean isReleased() {
        return this.released;
    }

    public boolean needMirror() {
        com.tencent.tav.extractor.IExtractorDelegate iExtractorDelegate = this.delegate;
        if (iExtractorDelegate != null) {
            return iExtractorDelegate.needMirror();
        }
        return true;
    }

    public synchronized int readSampleData(java.nio.ByteBuffer byteBuffer, int i17) {
        com.tencent.tav.extractor.IExtractorDelegate iExtractorDelegate = this.delegate;
        if (iExtractorDelegate != null) {
            int readSampleData = iExtractorDelegate.readSampleData(byteBuffer, i17);
            com.tencent.tav.decoder.logger.Logger.v(this.TAG, "readSampleData(delegate): ret = " + readSampleData + ", buf = " + byteBuffer);
            return readSampleData;
        }
        if (this.released) {
            return -1;
        }
        int readSampleDataNative = readSampleDataNative(byteBuffer, i17);
        com.tencent.tav.decoder.logger.Logger.v(this.TAG, "readSampleData: ret = " + readSampleDataNative + ", buf = " + byteBuffer);
        return readSampleDataNative;
    }

    public final synchronized void release() {
        com.tencent.tav.extractor.IExtractorDelegate iExtractorDelegate = this.delegate;
        if (iExtractorDelegate != null) {
            iExtractorDelegate.release();
            this.delegate = null;
        } else {
            if (!this.released) {
                releaseNative();
                this.released = true;
            }
        }
    }

    public synchronized void seekTo(long j17, int i17) {
        com.tencent.tav.decoder.logger.Logger.v(this.TAG, "seekTo() called with: timeUs = [" + j17 + "], mode = [" + i17 + "]");
        com.tencent.tav.extractor.IExtractorDelegate iExtractorDelegate = this.delegate;
        if (iExtractorDelegate != null) {
            iExtractorDelegate.seekTo(j17, i17);
        } else {
            if (!this.released) {
                seekToNative(j17, i17);
            }
        }
    }

    public synchronized void selectTrack(int i17) {
        com.tencent.tav.extractor.IExtractorDelegate iExtractorDelegate = this.delegate;
        if (iExtractorDelegate != null) {
            iExtractorDelegate.selectTrack(i17);
        } else {
            if (!this.released) {
                selectTrackNative(i17);
            }
        }
    }

    public final native void setDataSource(java.io.FileDescriptor fileDescriptor, long j17, long j18);

    public final synchronized void setDataSource(java.lang.String str) {
        com.tencent.tav.extractor.IExtractorDelegate iExtractorDelegate = this.delegate;
        if (iExtractorDelegate != null) {
            iExtractorDelegate.setDataSource(str);
        }
        this.sourcePath = str;
        if (com.tencent.tav.extractor.wrapper.ExtractorWrapperPool.contains(str)) {
            com.tencent.tav.extractor.wrapper.ExtractorWrapperPool.fillIn(this.sourcePath, this);
        } else {
            com.tencent.tav.extractor.wrapper.ExtractorLoader.cacheExtractor(str);
        }
    }

    public void setDuration(long j17) {
        this.duration = j17;
    }

    public synchronized void setIsSoft(boolean z17) {
        com.tencent.tav.extractor.IExtractorDelegate iExtractorDelegate = this.delegate;
        if (iExtractorDelegate != null) {
            iExtractorDelegate.setIsSoft(z17);
        }
    }

    public void setPreferRotation(int i17) {
        this.preferRotation = i17;
    }

    public void setSize(com.tencent.tav.coremedia.CGSize cGSize) {
        this.size = cGSize;
    }

    public synchronized void unselectTrack(int i17) {
        com.tencent.tav.extractor.IExtractorDelegate iExtractorDelegate = this.delegate;
        if (iExtractorDelegate != null) {
            iExtractorDelegate.unselectTrack(i17);
        } else {
            if (!this.released) {
                unselectTrackNative(i17);
            }
        }
    }

    public AssetExtractor(boolean z17) {
        this.TAG = "AssetExtractor@" + java.lang.Integer.toHexString(hashCode());
        this.released = false;
        this.mNativeContext = 0L;
        this.sourcePath = "";
        this.duration = 0L;
        this.size = null;
        this.preferRotation = -1;
        if (z17) {
            this.delegate = com.tencent.tav.extractor.ExtractorDelegateFactory.createDelegate();
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.tencent.tav.extractor.AssetExtractor m418clone() {
        com.tencent.tav.extractor.AssetExtractor assetExtractor = new com.tencent.tav.extractor.AssetExtractor();
        assetExtractor.setSize(getSize());
        assetExtractor.setPreferRotation(getPreferRotation());
        assetExtractor.setDuration(getDuration());
        assetExtractor.setDataSource(this.sourcePath);
        return assetExtractor;
    }
}
