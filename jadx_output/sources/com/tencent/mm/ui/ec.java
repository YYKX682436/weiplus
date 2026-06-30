package com.tencent.mm.ui;

/* loaded from: classes.dex */
public class ec implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f208396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f208397e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f208398f;

    public ec(java.lang.String str, android.app.Activity activity, android.content.Intent intent) {
        this.f208396d = str;
        this.f208397e = activity;
        this.f208398f = intent;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(322L, 24L, 1L, true);
        java.lang.String str = this.f208396d;
        g0Var.d(11098, 4024, java.lang.String.format("%b|%s", java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(str)), str));
        android.app.Activity activity = this.f208397e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.content.Intent intent = this.f208398f;
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/ui/MMErrorProcessor$4", "onCancel", "(Landroid/content/DialogInterface;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/ui/MMErrorProcessor$4", "onCancel", "(Landroid/content/DialogInterface;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        db5.f.a(this.f208397e, intent);
    }
}
