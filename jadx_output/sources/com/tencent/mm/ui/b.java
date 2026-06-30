package com.tencent.mm.ui;

/* loaded from: classes3.dex */
public class b implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f197200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.AccountExpiredUI f197201e;

    public b(com.tencent.mm.ui.AccountExpiredUI accountExpiredUI, android.content.Intent intent) {
        this.f197201e = accountExpiredUI;
        this.f197200d = intent;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.AccountExpiredUI accountExpiredUI = this.f197201e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.f197200d);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(accountExpiredUI, arrayList.toArray(), "com/tencent/mm/ui/AccountExpiredUI$2", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        accountExpiredUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(accountExpiredUI, "com/tencent/mm/ui/AccountExpiredUI$2", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.ui.AccountExpiredUI accountExpiredUI2 = this.f197201e;
        db5.f.i(accountExpiredUI2);
        accountExpiredUI2.finish();
    }
}
