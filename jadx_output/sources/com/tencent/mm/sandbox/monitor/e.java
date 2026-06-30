package com.tencent.mm.sandbox.monitor;

/* loaded from: classes.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f192290d;

    public e(java.util.Map map) {
        this.f192290d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent className = new android.content.Intent().setClassName(com.tencent.mm.sdk.platformtools.x2.f193071a, "com.tencent.mm.sandbox.updater.AppUpdaterUI");
        className.addFlags(268435456);
        java.util.Map map = this.f192290d;
        className.putExtra("intent_extra_desc", (java.lang.String) map.get(".Response.desc"));
        className.putExtra("intent_update_type", 999);
        className.putExtra("intent_extra_download_url", new java.lang.String[]{(java.lang.String) map.get(".Response.url")});
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(className);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/sandbox/monitor/CrashUpload$4", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/sandbox/monitor/CrashUpload$4", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
