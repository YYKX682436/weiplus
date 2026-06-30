package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f198065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.AccountExpiredUI f198066e;

    public c(com.tencent.mm.ui.AccountExpiredUI accountExpiredUI, android.content.Intent intent) {
        this.f198066e = accountExpiredUI;
        this.f198065d = intent;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.AccountExpiredUI accountExpiredUI = this.f198066e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.f198065d);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(accountExpiredUI, arrayList.toArray(), "com/tencent/mm/ui/AccountExpiredUI$3", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        accountExpiredUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(accountExpiredUI, "com/tencent/mm/ui/AccountExpiredUI$3", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.ui.AccountExpiredUI accountExpiredUI2 = this.f198066e;
        db5.f.i(accountExpiredUI2);
        accountExpiredUI2.finish();
        com.tencent.mm.autogen.events.BackupProcessMgrExitEvent backupProcessMgrExitEvent = new com.tencent.mm.autogen.events.BackupProcessMgrExitEvent();
        backupProcessMgrExitEvent.f53993g.f6990a = true;
        backupProcessMgrExitEvent.e();
    }
}
