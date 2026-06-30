package com.tencent.mm.pluginsdk.ui.span;

/* loaded from: classes.dex */
public class p0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f191274d;

    public p0(android.content.Context context) {
        this.f191274d = context;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL", android.net.Uri.parse("tel:" + menuItem.getTitle().toString().replace(" ", "").replace("(", "").replace(")", "").replace("-", "")));
        intent.addFlags(268435456);
        if (com.tencent.mm.sdk.platformtools.t8.I0(this.f191274d, intent, true, false)) {
            try {
                android.content.Context context = this.f191274d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/span/MailPhoneMenuHelper$5", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/pluginsdk/ui/span/MailPhoneMenuHelper$5", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MailPhoneMenuHelper", e17, "", new java.lang.Object[0]);
            }
        }
    }
}
