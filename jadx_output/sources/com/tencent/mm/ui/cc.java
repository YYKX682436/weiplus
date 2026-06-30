package com.tencent.mm.ui;

/* loaded from: classes.dex */
public class cc implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f198089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f198090e;

    public cc(android.content.Intent intent, android.app.Activity activity) {
        this.f198089d = intent;
        this.f198090e = activity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 39L, 1L, true);
        android.content.Intent intent = this.f198089d;
        if (intent != null) {
            android.app.Activity activity = this.f198090e;
            activity.finish();
            android.app.Activity activity2 = this.f198090e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity2, arrayList.toArray(), "com/tencent/mm/ui/MMErrorProcessor$10", "onCancel", "(Landroid/content/DialogInterface;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity2, "com/tencent/mm/ui/MMErrorProcessor$10", "onCancel", "(Landroid/content/DialogInterface;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            db5.f.a(activity, intent);
        }
    }
}
