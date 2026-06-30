package com.tencent.youtu.sdkkitframework.common;

/* loaded from: classes14.dex */
public class TimeoutCounter {
    private static final java.lang.String TAG = "TimeoutCounter";
    private java.lang.String name;
    private long elaspeTimeMs = 0;
    private long targetTimeoutMs = 0;
    private boolean needTimer = false;
    private boolean needShowTimer = true;

    public TimeoutCounter(java.lang.String str) {
        this.name = str;
    }

    public void cancel() {
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, this.name + " cancel");
        this.needTimer = false;
    }

    public boolean checkTimeout() {
        return this.needTimer && this.targetTimeoutMs > 0 && java.lang.System.currentTimeMillis() - this.elaspeTimeMs > this.targetTimeoutMs;
    }

    public void init(long j17, boolean z17) {
        this.targetTimeoutMs = j17;
        this.needShowTimer = z17;
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, this.name + " init with " + this.targetTimeoutMs);
    }

    public boolean isRunning() {
        return this.needTimer && this.targetTimeoutMs > 0;
    }

    public void reset() {
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, this.name + " reset");
        this.needTimer = true;
        if (this.targetTimeoutMs > 0 && this.needShowTimer) {
            com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendFSMEvent(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.tencent.youtu.sdkkitframework.common.TimeoutCounter.1
                {
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_ACTION, com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.TIMEOUT_COUNTDOWN_BEGIN);
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.COUNTDOWN_TIME, java.lang.Long.valueOf(com.tencent.youtu.sdkkitframework.common.TimeoutCounter.this.targetTimeoutMs));
                }
            });
        }
        this.elaspeTimeMs = java.lang.System.currentTimeMillis();
    }

    public void start() {
        reset();
    }
}
