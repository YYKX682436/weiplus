package com.tencent.tav.coremedia;

/* loaded from: classes16.dex */
public class CMSampleState {
    private int exportCode;
    private boolean isNewFrame;
    private java.lang.String msg;
    public com.tencent.tav.coremedia.CMPerformance performance;
    private long stateCode;
    private java.lang.Throwable throwable;
    private final com.tencent.tav.coremedia.CMTime time;

    public CMSampleState() {
        this(com.tencent.tav.coremedia.CMTime.CMTimeInvalid);
    }

    public static com.tencent.tav.coremedia.CMSampleState fromError(long j17) {
        return fromError(j17, "state:" + j17);
    }

    public static com.tencent.tav.coremedia.CMSampleState fromExportError(long j17, int i17, java.lang.String str, java.lang.Throwable th6) {
        com.tencent.tav.coremedia.CMSampleState cMSampleState = new com.tencent.tav.coremedia.CMSampleState(j17, str, th6);
        cMSampleState.exportCode = i17;
        return cMSampleState;
    }

    public int getExportCode() {
        return this.exportCode;
    }

    public java.lang.String getMsg() {
        return this.msg;
    }

    public long getStateCode() {
        return this.stateCode;
    }

    public java.lang.Throwable getThrowable() {
        return this.throwable;
    }

    public com.tencent.tav.coremedia.CMTime getTime() {
        return this.time;
    }

    public com.tencent.tav.coremedia.CMSampleState inherit(com.tencent.tav.coremedia.CMSampleState cMSampleState) {
        this.performance = cMSampleState.performance;
        cMSampleState.performance = null;
        return this;
    }

    public boolean isInvalid() {
        return this.time == com.tencent.tav.coremedia.CMTime.CMTimeInvalid;
    }

    public boolean isNewFrame() {
        return this.isNewFrame;
    }

    public void joinNode(com.tencent.tav.coremedia.CMSampleState cMSampleState) {
        com.tencent.tav.coremedia.CMPerformance cMPerformance = cMSampleState.performance;
        if (cMPerformance != null) {
            this.performance.preNodes.add(cMPerformance);
            cMSampleState.performance = null;
        }
    }

    public void setNewFrame(boolean z17) {
        this.isNewFrame = z17;
    }

    public boolean stateMatchingTo(long... jArr) {
        for (long j17 : jArr) {
            if (this.stateCode == j17) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String toString() {
        return "CMSampleState{time=" + this.time + ", isNewFrame=" + this.isNewFrame + ", stateCode=" + this.stateCode + ", throwable=" + this.throwable + ", msg='" + this.msg + "'}";
    }

    public void updatePerformance() {
        while (this.performance.getNextNode() != null) {
            this.performance = this.performance.getNextNode();
        }
    }

    public CMSampleState(com.tencent.tav.coremedia.CMTime cMTime) {
        this.performance = new com.tencent.tav.coremedia.CMPerformance();
        this.isNewFrame = true;
        this.stateCode = 0L;
        this.exportCode = 0;
        this.time = cMTime;
        long j17 = cMTime.value;
        if (j17 < 0) {
            this.stateCode = j17;
        }
    }

    public static com.tencent.tav.coremedia.CMSampleState fromError(long j17, java.lang.String str) {
        return fromError(j17, str, new java.lang.RuntimeException(str));
    }

    public static com.tencent.tav.coremedia.CMSampleState fromError(long j17, java.lang.String str, java.lang.Throwable th6) {
        return new com.tencent.tav.coremedia.CMSampleState(j17, str, th6);
    }

    public CMSampleState(com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.coremedia.CMPerformance cMPerformance) {
        this(cMTime);
        this.performance = cMPerformance;
    }

    public CMSampleState(long j17, java.lang.String str, java.lang.Throwable th6) {
        this.performance = new com.tencent.tav.coremedia.CMPerformance();
        this.isNewFrame = true;
        this.stateCode = 0L;
        this.exportCode = 0;
        this.time = new com.tencent.tav.coremedia.CMTime(j17);
        this.stateCode = j17;
        this.msg = str;
        this.throwable = th6;
    }
}
