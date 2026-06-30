package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class a implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm.a f197108d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f197109e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.AccountExpiredUI f197110f;

    public a(com.tencent.mm.ui.AccountExpiredUI accountExpiredUI, tm.a aVar, android.content.Intent intent) {
        this.f197110f = accountExpiredUI;
        this.f197108d = aVar;
        this.f197109e = intent;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        tm.a aVar = this.f197108d;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(aVar.f420398a);
        com.tencent.mm.ui.AccountExpiredUI accountExpiredUI = this.f197110f;
        if (K0) {
            com.tencent.mm.ui.AccountExpiredUI accountExpiredUI2 = this.f197110f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(this.f197109e);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(accountExpiredUI2, arrayList.toArray(), "com/tencent/mm/ui/AccountExpiredUI$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            accountExpiredUI2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(accountExpiredUI2, "com/tencent/mm/ui/AccountExpiredUI$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            db5.f.i(accountExpiredUI);
        } else {
            android.content.Intent intent = new android.content.Intent();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(aVar.f420398a);
            sb6.append("&wechat_real_lang=" + com.tencent.mm.sdk.platformtools.m2.d());
            intent.putExtra("rawUrl", sb6.toString());
            intent.putExtra("showShare", false);
            intent.putExtra("show_bottom", false);
            intent.putExtra("needRedirect", false);
            intent.putExtra("neverGetA8Key", true);
            intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
            intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
            j45.l.j(accountExpiredUI, "webview", ".ui.tools.WebViewUI", intent, null);
            db5.f.i(accountExpiredUI);
        }
        accountExpiredUI.finish();
        com.tencent.mm.autogen.events.BackupProcessMgrExitEvent backupProcessMgrExitEvent = new com.tencent.mm.autogen.events.BackupProcessMgrExitEvent();
        backupProcessMgrExitEvent.f53993g.f6990a = true;
        backupProcessMgrExitEvent.e();
    }
}
