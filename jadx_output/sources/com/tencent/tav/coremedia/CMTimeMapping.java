package com.tencent.tav.coremedia;

/* loaded from: classes16.dex */
public class CMTimeMapping {
    private com.tencent.tav.coremedia.CMTimeRange source;
    private com.tencent.tav.coremedia.CMTimeRange target;

    public CMTimeMapping(com.tencent.tav.coremedia.CMTimeRange cMTimeRange, com.tencent.tav.coremedia.CMTimeRange cMTimeRange2) {
        this.source = cMTimeRange.m414clone();
        this.target = cMTimeRange2.m414clone();
    }

    public com.tencent.tav.coremedia.CMTimeRange getSource() {
        return this.source;
    }

    public com.tencent.tav.coremedia.CMTimeRange getTarget() {
        return this.target;
    }

    public void setSource(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        this.source = cMTimeRange.m414clone();
    }

    public void setTarget(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        this.target = cMTimeRange.m414clone();
    }

    public java.lang.String toString() {
        return "CMTimeMapping{source=" + this.source.toSimpleString() + ", target=" + this.target.toSimpleString() + '}';
    }
}
