package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class n8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.StatusIconConfigUpdateEvent f174122d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f174123e;

    public n8(com.tencent.mm.autogen.events.StatusIconConfigUpdateEvent statusIconConfigUpdateEvent, com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity) {
        this.f174122d = statusIconConfigUpdateEvent;
        this.f174123e = textStatusEditActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("config update old");
        com.tencent.mm.autogen.events.StatusIconConfigUpdateEvent statusIconConfigUpdateEvent = this.f174122d;
        sb6.append(statusIconConfigUpdateEvent.f54867g.f8406a);
        sb6.append(" new:");
        sb6.append(statusIconConfigUpdateEvent.f54867g.f8407b);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusEditActivity", sb6.toString());
        com.tencent.mm.plugin.textstatus.ui.d8 d8Var = com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity.f173566u2;
        com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity = this.f174123e;
        textStatusEditActivity.K7();
        textStatusEditActivity.A7();
    }
}
