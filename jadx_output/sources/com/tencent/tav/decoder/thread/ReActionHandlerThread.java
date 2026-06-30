package com.tencent.tav.decoder.thread;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0002H$R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/tencent/tav/decoder/thread/ReActionHandlerThread;", "Landroid/os/HandlerThread;", "Ljz5/f0;", "start", "action", "release", "doAction", "", "TAG", "Ljava/lang/String;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "<init>", "(Ljava/lang/String;)V", "tav-foundation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes16.dex */
public abstract class ReActionHandlerThread extends android.os.HandlerThread {
    private final java.lang.String TAG;
    private android.os.Handler handler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReActionHandlerThread(java.lang.String name) {
        super(name);
        kotlin.jvm.internal.o.g(name, "name");
        this.TAG = "ReHandlerThread-".concat(name);
    }

    public final void action() {
        com.tencent.tav.decoder.logger.Logger.v(this.TAG, "action: " + this + ' ' + hashCode());
        android.os.Handler handler = this.handler;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.tencent.tav.decoder.thread.ReActionHandlerThread$action$1
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.tav.decoder.thread.ReActionHandlerThread.this.doAction();
                }
            });
        }
    }

    public abstract void doAction();

    public final synchronized void release() {
        android.os.Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        quitSafely();
    }

    @Override // java.lang.Thread
    public void start() {
        super.start();
        this.handler = new android.os.Handler(getLooper());
    }
}
