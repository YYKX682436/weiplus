package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class nc implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f209411d;

    public nc(android.app.Activity activity) {
        this.f209411d = activity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 37L, 1L, true);
        android.app.Activity activity = this.f209411d;
        activity.finish();
        com.tencent.mm.ui.vb.c(activity);
    }
}
