package com.tencent.tav.coremedia;

/* loaded from: classes16.dex */
public class CMTimeRange implements java.lang.Cloneable {
    public static com.tencent.tav.coremedia.CMTimeRange CMTimeRangeInvalid;
    private com.tencent.tav.coremedia.CMTime duration;
    private com.tencent.tav.coremedia.CMTime end;
    private com.tencent.tav.coremedia.CMTime start;

    static {
        com.tencent.tav.coremedia.CMTime cMTime = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        CMTimeRangeInvalid = new com.tencent.tav.coremedia.CMTimeRange(cMTime, cMTime);
    }

    public CMTimeRange(com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.coremedia.CMTime cMTime2) {
        this.start = cMTime;
        this.duration = cMTime2;
        this.end = cMTime.add(cMTime2);
    }

    public static com.tencent.tav.coremedia.CMTimeRange fromMs(long j17, long j18) {
        return new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.fromMs(j17), com.tencent.tav.coremedia.CMTime.fromMs(j18));
    }

    public static com.tencent.tav.coremedia.CMTimeRange fromSeconds(float f17, float f18) {
        return new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.fromSeconds(f17), com.tencent.tav.coremedia.CMTime.fromSeconds(f18));
    }

    public static com.tencent.tav.coremedia.CMTimeRange fromUs(long j17, long j18) {
        return new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.fromUs(j17), com.tencent.tav.coremedia.CMTime.fromUs(j18));
    }

    public static com.tencent.tav.coremedia.CMTimeRange getIntersection(com.tencent.tav.coremedia.CMTimeRange cMTimeRange, com.tencent.tav.coremedia.CMTimeRange cMTimeRange2) {
        if (cMTimeRange == null || cMTimeRange2 == null) {
            return CMTimeRangeInvalid;
        }
        com.tencent.tav.coremedia.CMTimeRange m414clone = cMTimeRange.m414clone();
        com.tencent.tav.coremedia.CMTimeRange m414clone2 = cMTimeRange2.m414clone();
        if (m414clone.getStartUs() > m414clone2.getStartUs()) {
            m414clone2 = m414clone;
            m414clone = m414clone2;
        }
        return (m414clone.getEndUs() <= m414clone2.getStartUs() || m414clone.getEndUs() >= m414clone2.getEndUs()) ? m414clone.getEndUs() >= m414clone2.getEndUs() ? m414clone2 : m414clone.getEndUs() < m414clone2.getStartUs() ? CMTimeRangeInvalid : CMTimeRangeInvalid : new com.tencent.tav.coremedia.CMTimeRange(m414clone2.getStart(), m414clone.getEnd().sub(m414clone2.getStart()));
    }

    public static com.tencent.tav.coremedia.CMTimeRange[] getUnions(com.tencent.tav.coremedia.CMTimeRange cMTimeRange, com.tencent.tav.coremedia.CMTimeRange cMTimeRange2) {
        com.tencent.tav.coremedia.CMTimeRange[] cMTimeRangeArr = new com.tencent.tav.coremedia.CMTimeRange[2];
        if (cMTimeRange == null) {
            cMTimeRangeArr[0] = cMTimeRange2;
        } else if (cMTimeRange2 == null) {
            cMTimeRangeArr[0] = cMTimeRange;
        } else {
            com.tencent.tav.coremedia.CMTimeRange m414clone = cMTimeRange.m414clone();
            com.tencent.tav.coremedia.CMTimeRange m414clone2 = cMTimeRange2.m414clone();
            if (m414clone.getStartUs() > m414clone2.getStartUs()) {
                m414clone2 = m414clone;
                m414clone = m414clone2;
            }
            cMTimeRangeArr[0] = m414clone;
            if (m414clone.getEndUs() >= m414clone2.getStartUs() && m414clone.getEndUs() < m414clone2.getEndUs()) {
                cMTimeRangeArr[1] = new com.tencent.tav.coremedia.CMTimeRange(m414clone.getEnd(), m414clone2.getEnd().sub(m414clone.getEnd()));
            } else if (m414clone.getEndUs() >= m414clone2.getEndUs()) {
                cMTimeRangeArr[1] = null;
            } else if (m414clone.getEndUs() < m414clone2.getStartUs()) {
                cMTimeRangeArr[1] = m414clone2;
            }
        }
        return cMTimeRangeArr;
    }

    public boolean containsTime(com.tencent.tav.coremedia.CMTime cMTime) {
        return getStartUs() <= cMTime.getTimeUs() && getEndUs() > cMTime.getTimeUs();
    }

    public boolean containsTimeRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        return getStartUs() <= cMTimeRange.getStartUs() && getEndUs() >= cMTimeRange.getEndUs();
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.tav.coremedia.CMTimeRange)) {
            return false;
        }
        com.tencent.tav.coremedia.CMTimeRange cMTimeRange = (com.tencent.tav.coremedia.CMTimeRange) obj;
        return this.start.equals(cMTimeRange.start) && this.duration.equals(cMTimeRange.duration);
    }

    public com.tencent.tav.coremedia.CMTime getDuration() {
        return this.duration;
    }

    public long getDurationUs() {
        return this.duration.getTimeUs();
    }

    public com.tencent.tav.coremedia.CMTime getEnd() {
        return this.end;
    }

    public long getEndUs() {
        return getStartUs() + getDurationUs();
    }

    public com.tencent.tav.coremedia.CMTime getStart() {
        return this.start;
    }

    public long getStartUs() {
        return this.start.getTimeUs();
    }

    public boolean isLegal() {
        return getStartUs() >= 0 && getDurationUs() > 0;
    }

    public void setDuration(com.tencent.tav.coremedia.CMTime cMTime) {
        this.duration = cMTime;
        this.end = this.start.add(cMTime);
    }

    public void setStart(com.tencent.tav.coremedia.CMTime cMTime) {
        this.start = cMTime;
        this.end = cMTime.add(this.duration);
    }

    public com.tencent.tav.coremedia.CMTimeRange[] split(float f17) {
        if (f17 < 0.0f || f17 > 1.0f) {
            return null;
        }
        com.tencent.tav.coremedia.CMTimeRange cMTimeRange = new com.tencent.tav.coremedia.CMTimeRange(this.start, getDuration().multi(f17));
        return new com.tencent.tav.coremedia.CMTimeRange[]{cMTimeRange, new com.tencent.tav.coremedia.CMTimeRange(cMTimeRange.getEnd(), getDuration().multi(1.0f - f17))};
    }

    public java.lang.String toSimpleString() {
        return "CMTimeRange{startUs=" + this.start.getTimeUs() + ", durationUs=" + this.duration.getTimeUs() + '}';
    }

    public java.lang.String toString() {
        return "CMTimeRange{start=" + this.start + ", duration=" + this.duration + ", end=" + this.end + '}';
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.tencent.tav.coremedia.CMTimeRange m414clone() {
        return new com.tencent.tav.coremedia.CMTimeRange(this.start, this.duration);
    }
}
