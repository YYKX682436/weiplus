package com.tencent.mm.pluginsdk.ui.span;

/* loaded from: classes.dex */
public class m0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f191270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f191271e;

    public m0(android.content.Context context, java.lang.String str) {
        this.f191270d = context;
        this.f191271e = str;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        android.content.Context context = this.f191270d;
        java.lang.String str = this.f191271e;
        if (itemId == 1) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("composeType", 4);
            intent.putExtra("toList", new java.lang.String[]{str.substring(0, str.indexOf(64)) + " " + str});
            j45.l.j(context, "qqmail", ".ui.ComposeUI", intent, null);
            return;
        }
        if (itemId != 2) {
            if (itemId != 3) {
                return;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mm.sdk.platformtools.b0.e(str);
            }
            db5.e1.T(context, context.getString(com.tencent.mm.R.string.f490361st));
            return;
        }
        android.content.Context context2 = this.f191270d;
        android.content.Intent intent2 = new android.content.Intent("android.intent.action.SENDTO");
        intent2.setData(android.net.Uri.parse("mailto:"));
        intent2.putExtra("android.intent.extra.EMAIL", new java.lang.String[]{str});
        if (!com.tencent.mm.sdk.platformtools.t8.I0(context2, intent2, true, false)) {
            db5.e1.m(context2, com.tencent.mm.R.string.b4u, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.pluginsdk.ui.span.k0());
            return;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/span/MailPhoneMenuHelper", "emailByDefault", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/pluginsdk/ui/span/MailPhoneMenuHelper", "emailByDefault", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (android.content.ActivityNotFoundException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MailPhoneMenuHelper", "ActivityNotFoundException:" + e17);
            db5.e1.m(context2, com.tencent.mm.R.string.b4u, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.pluginsdk.ui.span.j0());
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MailPhoneMenuHelper", e18, "", new java.lang.Object[0]);
        }
    }
}
