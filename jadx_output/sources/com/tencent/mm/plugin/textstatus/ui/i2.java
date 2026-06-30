package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes.dex */
public final class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f173971d;

    public i2(android.app.Activity activity, com.tencent.mm.plugin.textstatus.ui.j2 j2Var) {
        this.f173971d = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object m521constructorimpl;
        android.app.Activity activity = this.f173971d;
        if (activity.isFinishing() || activity.isDestroyed()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TextStatus.MultipleTextStatusCardDialog", "showPublishSuccessToast: activity invalid, skip toast");
            return;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
            e4Var.d(com.tencent.mm.R.string.pio);
            e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
            m521constructorimpl = kotlin.Result.m521constructorimpl(e4Var.c());
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TextStatus.MultipleTextStatusCardDialog", m524exceptionOrNullimpl, "showPublishSuccessToast failed", new java.lang.Object[0]);
        }
    }
}
