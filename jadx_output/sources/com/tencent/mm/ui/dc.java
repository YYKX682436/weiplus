package com.tencent.mm.ui;

/* loaded from: classes.dex */
public class dc implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f208331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f208332e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f208333f;

    public dc(java.lang.String str, android.app.Activity activity, android.content.Intent intent) {
        this.f208331d = str;
        this.f208332e = activity;
        this.f208333f = intent;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(322L, 23L, 1L, true);
        java.lang.String str = this.f208331d;
        g0Var.d(11098, 4023, java.lang.String.format("%b|%s", java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(str)), str));
        gm0.m.o();
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        android.app.Activity activity = this.f208332e;
        if (K0) {
            android.app.Activity activity2 = this.f208332e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            android.content.Intent intent = this.f208333f;
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity2, arrayList.toArray(), "com/tencent/mm/ui/MMErrorProcessor$3", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity2, "com/tencent/mm/ui/MMErrorProcessor$3", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            db5.f.a(activity, intent);
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("rawUrl", str);
        intent2.putExtra("showShare", false);
        intent2.putExtra("show_bottom", false);
        intent2.putExtra("needRedirect", false);
        intent2.putExtra("neverGetA8Key", true);
        intent2.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
        intent2.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
        j45.l.j(activity, "webview", ".ui.tools.WebViewUI", intent2, null);
    }
}
