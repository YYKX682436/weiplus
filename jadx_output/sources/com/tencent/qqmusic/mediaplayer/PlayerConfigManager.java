package com.tencent.qqmusic.mediaplayer;

/* loaded from: classes13.dex */
public class PlayerConfigManager {
    private static final int ADD = 1;
    private static final int DTS_COST_THRESHOLD = 40;
    private static boolean ENABLE_CHANGE_THREAD_PRIORITY = false;
    private static final boolean ENABLE_REAL_CHECK = true;
    private static final int MAX_RATIO = 4;
    private static final int MAX_TIMES = 10;
    private static final int MIN_RATIO = 8;
    private static final int NONE = 0;
    private static final int SUB = -1;
    private static final java.lang.String TAG = "PlayerConfigManager";
    private static com.tencent.qqmusic.mediaplayer.PlayerConfigManager mInstance;
    private int count;
    private int mBufRatio;
    private long mLastDecodeSpeed;
    private long mStartTime;
    private com.tencent.qqmusic.mediaplayer.PlayerConfigManager.ContextGetter contextGetter = null;
    private long mPlaySpeed = 1;
    private int mAddPriority = 0;
    private int mProcessorNumber = java.lang.Runtime.getRuntime().availableProcessors();
    private java.lang.ref.WeakReference<com.tencent.qqmusic.mediaplayer.CorePlayer> mCommonPlayerRef = null;
    private int[] THREAD_PRIORITY = {19, 10, -2, -4, -8, -16, -19};
    private int mCurrPriorityIndex = 0;

    /* loaded from: classes13.dex */
    public interface ContextGetter {
        android.content.Context getContext();
    }

    private PlayerConfigManager() {
        this.mBufRatio = 4;
        this.count = 0;
        this.mStartTime = 0L;
        this.mBufRatio = 4;
        this.count = 0;
        this.mStartTime = 0L;
    }

    private boolean add() {
        return this.mAddPriority >= 1;
    }

    public static synchronized com.tencent.qqmusic.mediaplayer.PlayerConfigManager getInstance() {
        com.tencent.qqmusic.mediaplayer.PlayerConfigManager playerConfigManager;
        synchronized (com.tencent.qqmusic.mediaplayer.PlayerConfigManager.class) {
            if (mInstance == null) {
                mInstance = new com.tencent.qqmusic.mediaplayer.PlayerConfigManager();
            }
            playerConfigManager = mInstance;
        }
        return playerConfigManager;
    }

    private boolean sub() {
        return this.mAddPriority < -1;
    }

    public void calDTSCostEnd() {
        if (this.mBufRatio != 8 && java.lang.System.currentTimeMillis() - this.mStartTime > 40) {
            int i17 = this.count + 1;
            this.count = i17;
            if (i17 > 10) {
                this.mBufRatio *= 2;
                this.count = 0;
            }
        }
    }

    public void calDTSCostStart() {
        if (this.mBufRatio == 8) {
            return;
        }
        this.mStartTime = java.lang.System.currentTimeMillis();
    }

    public void changeDecodeThreadPriority() {
        com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer;
        java.lang.ref.WeakReference<com.tencent.qqmusic.mediaplayer.CorePlayer> weakReference = this.mCommonPlayerRef;
        if (weakReference == null || (corePlayer = weakReference.get()) == null) {
            return;
        }
        corePlayer.changePlayThreadPriorityImmediately();
    }

    public void changeDecodeThreadPriorityIfNeed() {
        try {
            int i17 = this.mCurrPriorityIndex;
            int i18 = this.THREAD_PRIORITY[r3.length - 1];
            if (isSingleCpuOrScreenOff() && ENABLE_CHANGE_THREAD_PRIORITY) {
                if (add()) {
                    i17++;
                } else if (sub()) {
                    i17--;
                }
                if (i17 == this.mCurrPriorityIndex && i17 >= 0 && i17 < this.THREAD_PRIORITY.length) {
                    com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "changeDecodeThreadPriorityIfNeed don't change Priority mCurrPriorityIndex = " + this.THREAD_PRIORITY[this.mCurrPriorityIndex]);
                    return;
                }
                if (i17 < 0) {
                    i17 = 0;
                } else {
                    int[] iArr = this.THREAD_PRIORITY;
                    if (i17 >= iArr.length) {
                        i17 = iArr.length - 1;
                    }
                }
                this.mCurrPriorityIndex = i17;
                int i19 = this.THREAD_PRIORITY[i17];
                this.mAddPriority = 0;
            } else {
                int i27 = this.THREAD_PRIORITY[r1.length - 1];
            }
            android.os.Process.setThreadPriority(0);
        } catch (java.lang.Throwable th6) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, th6);
        }
    }

    public int getBufRatio() {
        int i17 = this.mBufRatio;
        if (i17 <= 1) {
            this.mBufRatio = 4;
        } else if (i17 > 8) {
            this.mBufRatio = 8;
        }
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "getBufRatio = " + this.mBufRatio);
        this.count = 0;
        return this.mBufRatio;
    }

    public android.content.Context getContext() {
        com.tencent.qqmusic.mediaplayer.PlayerConfigManager.ContextGetter contextGetter = this.contextGetter;
        if (contextGetter != null) {
            return contextGetter.getContext();
        }
        return null;
    }

    public boolean isSingleCpuOrScreenOff() {
        int availableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        this.mProcessorNumber = availableProcessors;
        return availableProcessors <= 1;
    }

    public void setCommonPlayerRef(com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer) {
        if (corePlayer != null) {
            this.mCommonPlayerRef = new java.lang.ref.WeakReference<>(corePlayer);
            this.mCurrPriorityIndex = 0;
            this.mAddPriority = 0;
            com.tencent.qqmusic.mediaplayer.AudioInformation currentAudioInformation = corePlayer.getCurrentAudioInformation();
            if (currentAudioInformation != null) {
                this.mPlaySpeed = ((float) ((currentAudioInformation.getSampleRate() * 2) * currentAudioInformation.getChannels())) / 1000.0f;
                com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "setCommonPlayerRef info = " + currentAudioInformation + ",mPlaySpeed = " + this.mPlaySpeed);
            }
        }
    }

    public void setContextGetter(com.tencent.qqmusic.mediaplayer.PlayerConfigManager.ContextGetter contextGetter) {
        this.contextGetter = contextGetter;
    }
}
