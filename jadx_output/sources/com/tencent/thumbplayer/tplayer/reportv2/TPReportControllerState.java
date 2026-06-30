package com.tencent.thumbplayer.tplayer.reportv2;

/* loaded from: classes15.dex */
public class TPReportControllerState {
    public static final int IDLE = 1;
    private static final int INDEX = 0;
    public static final int PREPARED = 3;
    public static final int PREPARING = 2;
    private static final java.util.Map<java.lang.Integer, java.lang.String> STATE_TO_STRING_MAP;
    private int mCurState = 1;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface STATE {
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        STATE_TO_STRING_MAP = hashMap;
        hashMap.put(1, "IDLE");
        hashMap.put(2, "PREPARING");
        hashMap.put(3, "PREPARED");
    }

    public synchronized int getState() {
        return this.mCurState;
    }

    public synchronized boolean isMatchState(int i17) {
        return this.mCurState == i17;
    }

    public synchronized void setState(int i17) {
        this.mCurState = i17;
    }

    public synchronized java.lang.String toString() {
        return "state[ cur : " + STATE_TO_STRING_MAP.get(java.lang.Integer.valueOf(this.mCurState)) + " ]";
    }
}
