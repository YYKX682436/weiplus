package com.tencent.mm.ui;

/* loaded from: classes3.dex */
public class d implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f208317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.AccountExpiredUI f208318e;

    public d(com.tencent.mm.ui.AccountExpiredUI accountExpiredUI, android.content.Intent intent) {
        this.f208318e = accountExpiredUI;
        this.f208317d = intent;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.ui.AccountExpiredUI accountExpiredUI = this.f208318e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.f208317d);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(accountExpiredUI, arrayList.toArray(), "com/tencent/mm/ui/AccountExpiredUI$4", "onCancel", "(Landroid/content/DialogInterface;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        accountExpiredUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(accountExpiredUI, "com/tencent/mm/ui/AccountExpiredUI$4", "onCancel", "(Landroid/content/DialogInterface;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.ui.AccountExpiredUI accountExpiredUI2 = this.f208318e;
        db5.f.i(accountExpiredUI2);
        accountExpiredUI2.finish();
    }
}
