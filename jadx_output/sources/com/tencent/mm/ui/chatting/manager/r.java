package com.tencent.mm.ui.chatting.manager;

/* loaded from: classes.dex */
public final class r implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f201979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201980e;

    public r(java.lang.Runnable runnable, java.lang.String str) {
        this.f201979d = runnable;
        this.f201980e = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.Runnable runnable = this.f201979d;
        if (runnable != null) {
            runnable.run();
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17509, 2, this.f201980e);
    }
}
