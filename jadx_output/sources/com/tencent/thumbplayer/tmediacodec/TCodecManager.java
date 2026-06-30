package com.tencent.thumbplayer.tmediacodec;

/* loaded from: classes14.dex */
public final class TCodecManager {
    public static final java.lang.String TAG = "TCodecManager";
    private static final com.tencent.thumbplayer.tmediacodec.TCodecManager mInstance = new com.tencent.thumbplayer.tmediacodec.TCodecManager();
    private static boolean mIsDebugVersion = false;
    private static boolean mIsLeakFixed = true;
    private boolean mConfigMethodCalled;
    private com.tencent.thumbplayer.tmediacodec.reuse.ReusePolicy mReusePolicy = com.tencent.thumbplayer.tmediacodec.reuse.ReusePolicy.DEFAULT;
    private boolean mGlobalReuseEnable = true;
    private final java.util.HashMap<com.tencent.thumbplayer.tmediacodec.TMediaCodec, com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper> mCodecMap = new java.util.HashMap<>();
    private final com.tencent.thumbplayer.tmediacodec.preload.PreloadCodecManager mPreloadCodecManager = new com.tencent.thumbplayer.tmediacodec.preload.PreloadCodecManager();
    private final com.tencent.thumbplayer.tmediacodec.pools.CodecWrapperManager mVideoCodecManager = new com.tencent.thumbplayer.tmediacodec.pools.CodecWrapperManager();
    private final com.tencent.thumbplayer.tmediacodec.pools.CodecWrapperManager mAudioCodecManager = new com.tencent.thumbplayer.tmediacodec.pools.CodecWrapperManager();
    private boolean mAllowKeepPool = true;

    private void changeToReuseDisable() {
        this.mVideoCodecManager.clearAndReleaseAll();
        this.mAudioCodecManager.clearAndReleaseAll();
    }

    private com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper createDirectCodecWrapper(android.media.MediaFormat mediaFormat, com.tencent.thumbplayer.tmediacodec.TMediaCodec tMediaCodec) {
        if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(TAG, "createDirectCodecWrapper mediaFormat:" + mediaFormat + " createBy:" + tMediaCodec.getCreateBy() + " nameOrType:" + tMediaCodec.getNameOrType());
        }
        return tMediaCodec.getCreateBy() == com.tencent.thumbplayer.tmediacodec.TMediaCodec.CreateBy.CreateByName ? new com.tencent.thumbplayer.tmediacodec.codec.DirectCodecWrapper(android.media.MediaCodec.createByCodecName(tMediaCodec.getNameOrType())) : new com.tencent.thumbplayer.tmediacodec.codec.DirectCodecWrapper(android.media.MediaCodec.createDecoderByType(tMediaCodec.getNameOrType()));
    }

    private com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper createNewReuseCodecWrapper(android.media.MediaFormat mediaFormat, com.tencent.thumbplayer.tmediacodec.TMediaCodec tMediaCodec) {
        if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(TAG, "createNewReuseCodecWrapper mediaFormat:" + mediaFormat + " createBy:" + tMediaCodec.getCreateBy() + " nameOrType:" + tMediaCodec.getNameOrType());
        }
        java.lang.String string = mediaFormat.getString("mime");
        com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper create = com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper.create(mediaFormat);
        com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.initFormatWrapper(create, mediaFormat);
        return tMediaCodec.getCreateBy() == com.tencent.thumbplayer.tmediacodec.TMediaCodec.CreateBy.CreateByName ? com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.create(android.media.MediaCodec.createByCodecName(tMediaCodec.getNameOrType()), string, create) : com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.create(android.media.MediaCodec.createDecoderByType(string), string, create);
    }

    private com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper getCodec(android.media.MediaFormat mediaFormat, com.tencent.thumbplayer.tmediacodec.TMediaCodec tMediaCodec, android.view.Surface surface) {
        boolean isVideo = tMediaCodec.isVideo();
        if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(TAG, "getCodec isVideo:" + isVideo + " codecFinalReuseEnable:" + tMediaCodec.codecFinalReuseEnable);
        }
        if (!tMediaCodec.codecFinalReuseEnable) {
            tMediaCodec.isReUsed = false;
            if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
                com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(TAG, "getCodec return DirectCodecWrapper for mediaFormat:" + mediaFormat + " codecFinalReuseEnable:false surface:" + surface);
            }
            return createDirectCodecWrapper(mediaFormat, tMediaCodec);
        }
        com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper create = com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper.create(mediaFormat);
        com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper obtainCodecWrapper = obtainCodecWrapper(isVideo, create);
        com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper.dumpCsdArray(create.initializationData);
        if (obtainCodecWrapper != null) {
            com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.ReuseType canReuseType = obtainCodecWrapper.canReuseType(create);
            if (canReuseType == com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.ReuseType.KEEP_CODEC_RESULT_YES_WITHOUT_RECONFIGURATION || canReuseType == com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.ReuseType.KEEP_CODEC_RESULT_YES_WITH_RECONFIGURATION) {
                if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
                    com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(TAG, "getCodec reuse, isVideo:" + isVideo + " reuseType:" + canReuseType);
                }
                obtainCodecWrapper.attachThread();
                obtainCodecWrapper.prepareToReUse();
                tMediaCodec.isReUsed = true;
                return obtainCodecWrapper;
            }
            if (canReuseType == com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.ReuseType.KEEP_CODEC_RESULT_NO && com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
                com.tencent.thumbplayer.tmediacodec.util.LogUtils.w(TAG, "getCodec not reuse, isVideo:" + isVideo + " reuseType:" + canReuseType);
            }
        }
        if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(TAG, "getCodec not reuse, for can't find reUseAble CodecWrapper. isVideo:" + isVideo);
        }
        tMediaCodec.isReUsed = false;
        com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper createNewReuseCodecWrapper = createNewReuseCodecWrapper(mediaFormat, tMediaCodec);
        createNewReuseCodecWrapper.attachThread();
        this.mCodecMap.put(tMediaCodec, createNewReuseCodecWrapper);
        return createNewReuseCodecWrapper;
    }

    public static com.tencent.thumbplayer.tmediacodec.TCodecManager getInstance() {
        return mInstance;
    }

    public static void init() {
    }

    public static boolean isDebug() {
        return mIsDebugVersion;
    }

    public static boolean isLeakFixed() {
        return mIsLeakFixed;
    }

    private com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper obtainCodecWrapper(boolean z17, com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper formatWrapper) {
        return (z17 ? this.mVideoCodecManager : this.mAudioCodecManager).obtainCodecWrapper(formatWrapper);
    }

    private void onCodecRunning(com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper codecWrapper) {
        if (isGlobalReuseEnable()) {
            if (codecWrapper instanceof com.tencent.thumbplayer.tmediacodec.codec.VideoCodecWrapper) {
                this.mVideoCodecManager.transToRunning((com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper) codecWrapper);
            } else if (codecWrapper instanceof com.tencent.thumbplayer.tmediacodec.codec.AudioCodecWrapper) {
                this.mAudioCodecManager.transToRunning((com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper) codecWrapper);
            }
        }
    }

    public static void setIsDebug(boolean z17) {
        mIsDebugVersion = z17;
    }

    public static void setLeakFixed(boolean z17) {
        mIsLeakFixed = z17;
    }

    public final void clearAndReleaseKeepPool() {
        this.mAllowKeepPool = false;
        this.mVideoCodecManager.clearAndReleaseKeepPool();
        this.mAudioCodecManager.clearAndReleaseKeepPool();
    }

    public final com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper configure(android.media.MediaFormat mediaFormat, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i17, com.tencent.thumbplayer.tmediacodec.TMediaCodec tMediaCodec) {
        if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(TAG, "configureStart videoPoolInfo:" + this.mVideoCodecManager.getDumpInfo() + ", audioPoolInfo:" + this.mAudioCodecManager.getDumpInfo());
        }
        this.mConfigMethodCalled = true;
        this.mAllowKeepPool = true;
        com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper codec = getCodec(mediaFormat, tMediaCodec, surface);
        onCodecRunning(codec);
        codec.setCodecCallback(tMediaCodec.getCodecCallback());
        codec.configure(mediaFormat, surface, mediaCrypto, i17);
        if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(TAG, "configureEnd   videoPoolInfo:" + this.mVideoCodecManager.getDumpInfo() + ", audioPoolInfo:" + this.mAudioCodecManager.getDumpInfo());
        }
        return codec;
    }

    public final com.tencent.thumbplayer.tmediacodec.reuse.ReusePolicy getReusePolicy() {
        return this.mReusePolicy;
    }

    public final boolean isAllowKeepPool() {
        return this.mAllowKeepPool;
    }

    public final boolean isGlobalReuseEnable() {
        return this.mGlobalReuseEnable;
    }

    public final boolean isVideoKeepPoolFull() {
        return this.mVideoCodecManager.isKeepPoolFull();
    }

    public final void preloadCodec(java.lang.String str, java.lang.String str2) {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        if (com.tencent.thumbplayer.tmediacodec.preload.PreloadCodecManager.isInvalidMimeType(str)) {
            linkedHashSet.add(str);
        }
        if (com.tencent.thumbplayer.tmediacodec.preload.PreloadCodecManager.isInvalidMimeType(str2)) {
            linkedHashSet.add(str2);
        }
        if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(TAG, "preloadCodec mimeTypeSet:" + linkedHashSet);
        }
        this.mPreloadCodecManager.preload(linkedHashSet);
    }

    public final void recycleCodecFromRunning(com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper codecWrapper) {
        if (isGlobalReuseEnable()) {
            if (codecWrapper instanceof com.tencent.thumbplayer.tmediacodec.codec.VideoCodecWrapper) {
                this.mVideoCodecManager.transToKeep((com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper) codecWrapper);
            } else if (codecWrapper instanceof com.tencent.thumbplayer.tmediacodec.codec.AudioCodecWrapper) {
                this.mAudioCodecManager.transToKeep((com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper) codecWrapper);
            }
        }
    }

    public final void removeCodecFromRunningPool(com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper codecWrapper) {
        if (isGlobalReuseEnable()) {
            if (codecWrapper instanceof com.tencent.thumbplayer.tmediacodec.codec.VideoCodecWrapper) {
                this.mVideoCodecManager.removeFromRunning((com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper) codecWrapper);
            } else if (codecWrapper instanceof com.tencent.thumbplayer.tmediacodec.codec.AudioCodecWrapper) {
                this.mAudioCodecManager.removeFromRunning((com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper) codecWrapper);
            }
        }
    }

    public boolean reuseEnable(com.tencent.thumbplayer.tmediacodec.TMediaCodec tMediaCodec, android.view.Surface surface) {
        boolean isGlobalReuseEnable = isGlobalReuseEnable();
        boolean isReuseEnable = tMediaCodec.isReuseEnable();
        boolean isVideo = tMediaCodec.isVideo();
        boolean z17 = isGlobalReuseEnable && isReuseEnable;
        boolean z18 = !com.tencent.thumbplayer.tmediacodec.util.TUtils.codecNeedsSetOutputSurfaceWorkaround();
        if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(TAG, "reuseEnable getCodec isVideo:" + isVideo + " reuseEnable:" + z17 + " globalReuseEnable:" + isGlobalReuseEnable + " mediaCodecReuseEnable:" + isReuseEnable + " canUseSetOutputSurfaceAPI:" + z18 + " ,surface:" + surface);
        }
        return z17 && isVideo && z18 && surface != null;
    }

    public final void setGlobalReuseEnable(boolean z17) {
        if (this.mGlobalReuseEnable != z17) {
            this.mGlobalReuseEnable = z17;
            if (!this.mConfigMethodCalled || z17) {
                return;
            }
            changeToReuseDisable();
        }
    }

    public final void setLogEnable(boolean z17) {
        com.tencent.thumbplayer.tmediacodec.util.LogUtils.setLogEnable(z17);
    }

    public final void setLogLevel(int i17) {
        com.tencent.thumbplayer.tmediacodec.util.LogUtils.setLogLevel(i17);
    }

    public final void setLogProxy(com.tencent.thumbplayer.tmediacodec.util.ILogProxy iLogProxy) {
        com.tencent.thumbplayer.tmediacodec.util.LogUtils.setLogProxy(iLogProxy);
    }

    public final void setReusePolicy(com.tencent.thumbplayer.tmediacodec.reuse.ReusePolicy reusePolicy) {
        this.mReusePolicy = reusePolicy;
    }

    public final com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper configure(android.media.MediaFormat mediaFormat, android.view.Surface surface, int i17, android.media.MediaDescrambler mediaDescrambler, com.tencent.thumbplayer.tmediacodec.TMediaCodec tMediaCodec) {
        if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(TAG, "configureStart videoPoolInfo:" + this.mVideoCodecManager.getDumpInfo() + ", audioPoolInfo:" + this.mAudioCodecManager.getDumpInfo());
        }
        this.mConfigMethodCalled = true;
        this.mAllowKeepPool = true;
        com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper codec = getCodec(mediaFormat, tMediaCodec, surface);
        codec.setCodecCallback(tMediaCodec.getCodecCallback());
        onCodecRunning(codec);
        codec.configure(mediaFormat, surface, i17, mediaDescrambler);
        if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(TAG, "configureEnd   videoPoolInfo:" + this.mVideoCodecManager.getDumpInfo() + ", audioPoolInfo:" + this.mAudioCodecManager.getDumpInfo());
        }
        return codec;
    }
}
