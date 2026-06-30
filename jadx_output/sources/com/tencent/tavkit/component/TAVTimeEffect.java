package com.tencent.tavkit.component;

/* loaded from: classes16.dex */
public class TAVTimeEffect {
    private com.tencent.tav.coremedia.CMTimeRange timeRange;
    private com.tencent.tav.coremedia.CMTime scaledDuration = com.tencent.tav.coremedia.CMTime.CMTimeInvalid;
    private int loopCount = 1;
    private boolean reverse = false;
    private boolean freeze = false;

    public int getLoopCount() {
        return java.lang.Math.abs(this.loopCount);
    }

    public com.tencent.tav.coremedia.CMTime getScaledDuration() {
        return this.scaledDuration;
    }

    public com.tencent.tav.coremedia.CMTimeRange getTimeRange() {
        return this.timeRange;
    }

    public boolean isFreeze() {
        return this.freeze;
    }

    public boolean isReverse() {
        return this.reverse;
    }

    public void setFreeze(boolean z17) {
        this.freeze = z17;
    }

    public void setLoopCount(int i17) {
        this.loopCount = i17;
    }

    public void setReverse(boolean z17) {
        this.reverse = z17;
    }

    public void setScaledDuration(com.tencent.tav.coremedia.CMTime cMTime) {
        this.scaledDuration = cMTime;
    }

    public void setTimeRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        this.timeRange = cMTimeRange;
    }
}
