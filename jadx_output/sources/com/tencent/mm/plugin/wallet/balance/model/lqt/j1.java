package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes.dex */
public final class j1 implements com.tencent.mm.plugin.wallet.balance.model.lqt.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f177662a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f177663b;

    public j1(android.app.Activity activity, android.app.Dialog dialog) {
        this.f177662a = activity;
        this.f177663b = dialog;
    }

    @Override // com.tencent.mm.plugin.wallet.balance.model.lqt.c1
    public final void call(java.lang.Object obj) {
        boolean z17 = obj instanceof java.lang.Throwable;
        android.app.Activity activity = this.f177662a;
        java.lang.String message = z17 ? ((java.lang.Throwable) obj).getMessage() : obj instanceof java.lang.String ? obj.toString() : activity.getString(com.tencent.mm.R.string.kpu);
        android.app.Dialog dialog = this.f177663b;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.tencent.mars.xlog.Log.i("LqtNativeUrlJumpHandler", "fetch detail failed: " + message);
        dp.a.makeText(activity, message, 1).show();
    }
}
