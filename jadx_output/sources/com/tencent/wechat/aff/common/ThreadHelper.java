package com.tencent.wechat.aff.common;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/wechat/aff/common/ThreadHelper;", "", "<init>", "()V", "Companion", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ThreadHelper {
    public static final java.lang.String TAG = "MicroMessage.Ting.ThreadHelper";
    private static com.tencent.wechat.aff.common.ThreadHelperDelegate delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.wechat.aff.common.ThreadHelper.Companion INSTANCE = new com.tencent.wechat.aff.common.ThreadHelper.Companion(null);
    private static final jz5.g mainThreadHandle$delegate = jz5.h.b(com.tencent.wechat.aff.common.ThreadHelper$Companion$mainThreadHandle$2.INSTANCE);

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/tencent/wechat/aff/common/ThreadHelper$Companion;", "", "<init>", "()V", "TAG", "", "delegate", "Lcom/tencent/wechat/aff/common/ThreadHelperDelegate;", "getDelegate", "()Lcom/tencent/wechat/aff/common/ThreadHelperDelegate;", "setDelegate", "(Lcom/tencent/wechat/aff/common/ThreadHelperDelegate;)V", "mainThreadHandle", "Landroid/os/Handler;", "getMainThreadHandle", "()Landroid/os/Handler;", "mainThreadHandle$delegate", "Lkotlin/Lazy;", "isMainThread", "", "runInMainThread", "", "runnablePtr", "", "delayMs", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        private final android.os.Handler getMainThreadHandle() {
            return (android.os.Handler) com.tencent.wechat.aff.common.ThreadHelper.mainThreadHandle$delegate.getValue();
        }

        public final com.tencent.wechat.aff.common.ThreadHelperDelegate getDelegate() {
            return com.tencent.wechat.aff.common.ThreadHelper.delegate;
        }

        public final boolean isMainThread() {
            com.tencent.wechat.aff.common.ThreadHelperDelegate delegate = getDelegate();
            return delegate != null ? delegate.isMainThread() : kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread());
        }

        public final void runInMainThread(long runnablePtr, long delayMs) {
            com.tencent.wechat.zlog.Zlog.a(com.tencent.wechat.aff.common.ThreadHelper.TAG, "runInMainThread ptr:" + runnablePtr, new java.lang.Object[0]);
            com.tencent.wechat.aff.common.FunctionRunnable functionRunnable = new com.tencent.wechat.aff.common.FunctionRunnable();
            functionRunnable.setNativePointer(runnablePtr);
            com.tencent.wechat.aff.common.ThreadHelperDelegate delegate = getDelegate();
            if (delegate != null) {
                delegate.runInMainThread(functionRunnable, delayMs);
            } else if (delayMs > 0 || !isMainThread()) {
                getMainThreadHandle().postDelayed(functionRunnable, delayMs);
            } else {
                functionRunnable.run();
            }
        }

        public final void setDelegate(com.tencent.wechat.aff.common.ThreadHelperDelegate threadHelperDelegate) {
            com.tencent.wechat.aff.common.ThreadHelper.delegate = threadHelperDelegate;
        }
    }

    public static final boolean isMainThread() {
        return INSTANCE.isMainThread();
    }

    public static final void runInMainThread(long j17, long j18) {
        INSTANCE.runInMainThread(j17, j18);
    }
}
