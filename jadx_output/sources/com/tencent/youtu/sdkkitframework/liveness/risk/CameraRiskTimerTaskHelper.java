package com.tencent.youtu.sdkkitframework.liveness.risk;

/* loaded from: classes16.dex */
public class CameraRiskTimerTaskHelper {
    private final com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskTimerTaskHelper.TimerTaskCallback callback;
    private long interval;
    private java.lang.Runnable taskRunnable;
    private boolean isRunning = false;
    private final android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());

    /* loaded from: classes16.dex */
    public interface TimerTaskCallback {
        void onTick();
    }

    public CameraRiskTimerTaskHelper(com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskTimerTaskHelper.TimerTaskCallback timerTaskCallback, long j17) {
        this.callback = timerTaskCallback;
        this.interval = j17;
    }

    public void setInterval(long j17) {
        this.interval = j17;
    }

    public void start() {
        if (this.isRunning) {
            return;
        }
        this.isRunning = true;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskTimerTaskHelper.1
            @Override // java.lang.Runnable
            public void run() {
                if (!com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskTimerTaskHelper.this.isRunning || com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskTimerTaskHelper.this.callback == null) {
                    return;
                }
                com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskTimerTaskHelper.this.callback.onTick();
                com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskTimerTaskHelper.this.handler.postDelayed(this, com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskTimerTaskHelper.this.interval);
            }
        };
        this.taskRunnable = runnable;
        this.handler.postDelayed(runnable, this.interval);
    }

    public void stop() {
        if (this.isRunning) {
            this.isRunning = false;
            this.handler.removeCallbacks(this.taskRunnable);
        }
    }
}
