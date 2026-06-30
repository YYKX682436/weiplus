package com.tencent.thumbplayer.api;

/* loaded from: classes16.dex */
public class TPPlayerState {
    public static final int COMPLETE = 7;
    public static final int ERROR = 10;
    public static final int IDLE = 1;
    public static final int INDEX = 0;
    public static final int INITIALIZED = 2;
    private static final android.util.SparseArray<java.lang.String> NS_STATES;
    public static final int PAUSE = 6;
    public static final int PREPARED = 4;
    public static final int PREPARING = 3;
    public static final int RELEASED = 11;
    public static final int START = 5;
    public static final int STOPPED = 9;
    public static final int STOPPING = 8;
    private com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnStateChangeListener mStateChangeListener;
    private int mCurState = 1;
    private int mPreState = 1;
    private int mLastState = 1;
    private int mInnerPlayState = 1;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface STATE {
    }

    static {
        android.util.SparseArray<java.lang.String> sparseArray = new android.util.SparseArray<>();
        NS_STATES = sparseArray;
        sparseArray.put(1, "IDLE");
        sparseArray.put(2, "INITIALIZED");
        sparseArray.put(3, "PREPARING");
        sparseArray.put(4, "PREPARED");
        sparseArray.put(5, "START");
        sparseArray.put(6, "PAUSE");
        sparseArray.put(7, "COMPLETE");
        sparseArray.put(8, "STOPPING");
        sparseArray.put(9, "STOPPED");
        sparseArray.put(10, "ERROR");
        sparseArray.put(11, "RELEASED");
    }

    public synchronized void changeState(int i17) {
        int i18 = this.mCurState;
        if (i18 != i17) {
            this.mPreState = i18;
            this.mCurState = i17;
            com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnStateChangeListener iOnStateChangeListener = this.mStateChangeListener;
            if (iOnStateChangeListener != null) {
                iOnStateChangeListener.onStateChange(i18, i17);
            }
        }
    }

    public synchronized int innerPlayState() {
        return this.mInnerPlayState;
    }

    public synchronized boolean is(int i17) {
        return this.mCurState == i17;
    }

    public synchronized int lastState() {
        return this.mLastState;
    }

    public synchronized int preState() {
        return this.mPreState;
    }

    public synchronized void setInnerPlayStateState(int i17) {
        if (this.mInnerPlayState != i17) {
            this.mInnerPlayState = i17;
        }
    }

    public synchronized void setLastState(int i17) {
        if (this.mLastState != i17) {
            this.mLastState = i17;
        }
    }

    public void setOnPlayerStateChangeListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnStateChangeListener iOnStateChangeListener) {
        this.mStateChangeListener = iOnStateChangeListener;
    }

    public synchronized int state() {
        return this.mCurState;
    }

    public synchronized java.lang.String toString() {
        android.util.SparseArray<java.lang.String> sparseArray;
        sparseArray = NS_STATES;
        return "state[ cur : " + sparseArray.get(this.mCurState) + " , pre : " + sparseArray.get(this.mPreState) + " , last : " + sparseArray.get(this.mLastState) + " , inner play : " + sparseArray.get(this.mInnerPlayState) + " ]";
    }
}
