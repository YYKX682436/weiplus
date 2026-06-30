package com.tencent.tav.debug;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/tencent/tav/debug/DebugTraceLog;", "", "Ljz5/f0;", "clear", "", "tag", com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, com.tencent.tinker.loader.shareutil.SharePatchInfo.FINGER_PRINT, "Ljava/lang/ref/WeakReference;", "Lcom/tencent/tav/debug/DebugTraceLogger;", "logger", "Ljava/lang/ref/WeakReference;", "getLogger", "()Ljava/lang/ref/WeakReference;", "setLogger", "(Ljava/lang/ref/WeakReference;)V", "<init>", "()V", "tav-foundation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class DebugTraceLog {
    public static final com.tencent.tav.debug.DebugTraceLog INSTANCE = new com.tencent.tav.debug.DebugTraceLog();
    private static java.lang.ref.WeakReference<com.tencent.tav.debug.DebugTraceLogger> logger;

    private DebugTraceLog() {
    }

    public final void clear() {
        com.tencent.tav.debug.DebugTraceLogger debugTraceLogger;
        java.lang.ref.WeakReference<com.tencent.tav.debug.DebugTraceLogger> weakReference = logger;
        if (weakReference == null || (debugTraceLogger = weakReference.get()) == null) {
            return;
        }
        debugTraceLogger.clear();
    }

    public final java.lang.ref.WeakReference<com.tencent.tav.debug.DebugTraceLogger> getLogger() {
        return logger;
    }

    public final void print(java.lang.String tag, java.lang.String message) {
        com.tencent.tav.debug.DebugTraceLogger debugTraceLogger;
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(message, "message");
        java.lang.ref.WeakReference<com.tencent.tav.debug.DebugTraceLogger> weakReference = logger;
        if (weakReference == null || (debugTraceLogger = weakReference.get()) == null) {
            return;
        }
        debugTraceLogger.print(tag, message);
    }

    public final void setLogger(java.lang.ref.WeakReference<com.tencent.tav.debug.DebugTraceLogger> weakReference) {
        logger = weakReference;
    }
}
