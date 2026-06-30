package com.tencent.qqmusic.mediaplayer;

/* loaded from: classes13.dex */
class PlayerStateRunner {
    private static final java.lang.String TAG = "StateRunner";
    private java.lang.Integer mState;
    private final java.util.concurrent.locks.ReadWriteLock mLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
    private java.lang.ref.WeakReference<android.media.AudioTrack> mAudioTrack = new java.lang.ref.WeakReference<>(null);

    public PlayerStateRunner(java.lang.Integer num) {
        this.mState = num;
    }

    public java.lang.Integer get() {
        this.mLock.readLock().lock();
        try {
            int intValue = this.mState.intValue();
            android.media.AudioTrack audioTrack = this.mAudioTrack.get();
            if (audioTrack != null) {
                int playState = audioTrack.getPlayState();
                if (playState == 2) {
                    intValue = 5;
                } else if (playState == 3) {
                    intValue = 4;
                }
                if (!this.mState.equals(java.lang.Integer.valueOf(intValue))) {
                    com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "!mState.equals(state), mstate = " + this.mState.toString() + "   state = " + intValue);
                }
            }
            return java.lang.Integer.valueOf(intValue);
        } finally {
            this.mLock.readLock().unlock();
        }
    }

    public boolean isEqual(java.lang.Integer... numArr) {
        this.mLock.readLock().lock();
        try {
            for (java.lang.Integer num : numArr) {
                if (this.mState.equals(num)) {
                    this.mLock.readLock().unlock();
                    return true;
                }
            }
            return false;
        } finally {
            this.mLock.readLock().unlock();
        }
    }

    public void setAudioTrack(android.media.AudioTrack audioTrack) {
        this.mAudioTrack = new java.lang.ref.WeakReference<>(audioTrack);
    }

    public java.lang.Integer transfer(java.lang.Integer num) {
        this.mLock.writeLock().lock();
        try {
            java.lang.Integer num2 = this.mState;
            this.mState = num;
            com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, num2.toString() + " -> " + this.mState.toString());
            return num2;
        } finally {
            this.mLock.writeLock().unlock();
        }
    }

    public boolean transfer(java.lang.Integer num, java.lang.Integer... numArr) {
        this.mLock.writeLock().lock();
        try {
            if (!isEqual(numArr)) {
                this.mLock.writeLock().unlock();
                return false;
            }
            transfer(num);
            this.mLock.writeLock().unlock();
            return true;
        } catch (java.lang.Throwable th6) {
            this.mLock.writeLock().unlock();
            throw th6;
        }
    }
}
