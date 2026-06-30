package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class lc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mc f209076d;

    public lc(com.tencent.mm.ui.mc mcVar) {
        this.f209076d = mcVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (i95.n0.c(mi3.f.class) != null) {
            mi3.f fVar = (mi3.f) i95.n0.c(mi3.f.class);
            android.content.Context context = this.f209076d.f209121f;
            ((com.tencent.mm.plugin.sandbox.SubCoreSandBox) fVar).getClass();
            int i17 = com.tencent.mm.sandbox.updater.Updater.f192322o;
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.sandbox.updater.AppInstallerUI.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/sandbox/updater/Updater", "goInstall", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/sandbox/updater/Updater", "goInstall", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
