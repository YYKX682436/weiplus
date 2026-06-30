package org.libpag;

/* loaded from: classes.dex */
public class PAGVideoRange {
    public long endTime;
    public long playDuration;
    public boolean reversed;
    public long startTime;

    public PAGVideoRange(long j17, long j18, long j19, boolean z17) {
        this.startTime = j17;
        this.endTime = j18;
        this.playDuration = j19;
        this.reversed = z17;
    }
}
