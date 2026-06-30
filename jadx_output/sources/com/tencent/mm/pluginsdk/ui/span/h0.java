package com.tencent.mm.pluginsdk.ui.span;

/* loaded from: classes.dex */
public class h0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f191213d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f191214e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnDismissListener f191215f;

    public h0(android.content.Context context, java.lang.String str, android.content.DialogInterface.OnDismissListener onDismissListener) {
        this.f191213d = context;
        this.f191214e = str;
        this.f191215f = onDismissListener;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        android.content.Context context = this.f191213d;
        java.lang.String str = this.f191214e;
        if (itemId != 0) {
            if (itemId == 1) {
                com.tencent.mm.pluginsdk.ui.span.u0.a(context, str);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10114, "1");
            }
        } else if (com.tencent.mm.pluginsdk.ui.span.u0.b()) {
            android.content.Context context2 = this.f191213d;
            android.content.Intent intent = new android.content.Intent("android.intent.action.INSERT");
            intent.setType("vnd.android.cursor.dir/contact");
            intent.putExtra("phone", str);
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/span/MailPhoneMenuHelper", "phoneCreateContact", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context2, "com/tencent/mm/pluginsdk/ui/span/MailPhoneMenuHelper", "phoneCreateContact", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MailPhoneMenuHelper", e17, "", new java.lang.Object[0]);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10113, "1");
        } else {
            com.tencent.mm.pluginsdk.ui.span.u0.a(context, str);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10114, "1");
        }
        android.content.DialogInterface.OnDismissListener onDismissListener = this.f191215f;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(null);
        }
    }
}
