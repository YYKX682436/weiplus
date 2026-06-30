package com.tencent.mm.plugin.messenger.foundation.recover.check;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/messenger/foundation/recover/check/CheckContactWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "plugin-messenger-foundation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class CheckContactWorker extends androidx.work.CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckContactWorker(android.content.Context context, androidx.work.WorkerParameters params) {
        super(context, params);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(params, "params");
    }

    @Override // androidx.work.CoroutineWorker
    public java.lang.Object h(kotlin.coroutines.Continuation continuation) {
        java.lang.Object a17;
        androidx.work.WorkerParameters workerParameters = this.f12459e;
        int b17 = workerParameters.f12466b.b("DATA_KEY_CHECK_PERIOD", 0);
        java.lang.Object obj = ((java.util.HashMap) workerParameters.f12466b.f1411a).get("DATA_KEY_TARGET_TIME");
        long longValue = obj instanceof java.lang.Long ? ((java.lang.Long) obj).longValue() : 0L;
        int i17 = workerParameters.f12467c;
        if (i17 >= 10) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CheckContactWorker", "doWork() called runAttemptCount reach max runAttemptCount:" + i17);
            return new a5.v();
        }
        try {
            boolean i18 = i();
            com.tencent.mars.xlog.Log.i("MicroMsg.CheckContactWorker", "doWork() called isNeedRetry:" + i18 + " runAttemptCount:" + i17 + " targetTime:" + longValue);
            if (i18) {
                a17 = new a5.w();
            } else {
                android.os.Looper.getMainLooper().getQueue().addIdleHandler(new bh3.d(i17, longValue, b17));
                a17 = a5.y.a();
            }
            return a17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CheckContactWorker", th6, "check contact failed", new java.lang.Object[0]);
            return new a5.v();
        }
    }

    public final boolean i() {
        if (!(com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.isBackground() || com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner.INSTANCE.isBackground() || com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE.isBackground())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CheckContactWorker", "isNeedRetry() called isBackground = false");
            return true;
        }
        java.lang.Object l17 = gm0.j1.u().c().l(15, null);
        kotlin.jvm.internal.o.e(l17, "null cannot be cast to non-null type kotlin.Int");
        if (!(com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) l17) == 0)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CheckContactWorker", "isNeedRetry() called notInit");
        return true;
    }
}
