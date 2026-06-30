package com.tencent.mm.pluginsdk.ui.span;

/* loaded from: classes.dex */
public abstract class u0 {
    public static void a(android.content.Context context, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.INSERT_OR_EDIT", android.provider.ContactsContract.Contacts.CONTENT_URI);
        intent.setType("vnd.android.cursor.item/person");
        intent.putExtra("phone", str);
        if (com.tencent.mm.sdk.platformtools.t8.I0(context, intent, false, false)) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/span/MailPhoneMenuHelper", "phoneModifyContact", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/pluginsdk/ui/span/MailPhoneMenuHelper", "phoneModifyContact", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MailPhoneMenuHelper", e17, "", new java.lang.Object[0]);
            }
        }
    }

    public static boolean b() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.content.Intent intent = new android.content.Intent("android.intent.action.INSERT");
        intent.setType("vnd.android.cursor.dir/contact");
        intent.putExtra("phone", "10086");
        return com.tencent.mm.sdk.platformtools.t8.I0(context, intent, false, false);
    }

    public static void c(android.content.Context context, java.lang.String str, android.content.DialogInterface.OnDismissListener onDismissListener) {
        boolean z17 = (c01.z1.n() & 1) == 0;
        java.lang.String replace = str.replace(" ", "").replace("#", "@");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
        k0Var.q(context.getString(com.tencent.mm.R.string.f492970ii0, replace), 17);
        k0Var.f211872n = new com.tencent.mm.pluginsdk.ui.span.l0(z17, context);
        k0Var.f211881s = new com.tencent.mm.pluginsdk.ui.span.m0(context, replace);
        k0Var.f211892z = new com.tencent.mm.pluginsdk.ui.span.n0();
        k0Var.v();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(k0Var.f211864i.getWindow().getDecorView(), "email_actionsheet");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(k0Var.f211864i.getWindow().getDecorView(), 32, 28603);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).rj(k0Var.f211864i.getWindow().getDecorView());
    }

    public static void d(android.content.Context context, java.lang.String str, android.content.DialogInterface.OnDismissListener onDismissListener, android.os.Bundle bundle) {
        if (!(context instanceof android.app.Activity)) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.w("MicroMsg.MailPhoneMenuHelper", "context should be Activity, %s", new com.tencent.mm.sdk.platformtools.z3());
        }
        boolean booleanValue = gm0.j1.b().m() ? ((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERFINO_IPCALL_HAS_ENTRY_BOOLEAN, java.lang.Boolean.FALSE)).booleanValue() : false;
        int i17 = bundle != null ? bundle.getInt("fromScene") : 0;
        java.lang.String replace = str.replace(" ", "").replace("(", "").replace(")", "").replace("-", "");
        java.lang.String replaceAll = replace.replaceAll("#", "%23");
        java.lang.String string = bundle == null ? "" : bundle.getString("Contact_User");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str2 = string != null ? string : "";
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
        k0Var.q(context.getString(com.tencent.mm.R.string.f490879b54, replace), 17);
        k0Var.f211872n = new com.tencent.mm.pluginsdk.ui.span.q0(context, booleanValue, str2, n17);
        k0Var.f211881s = new com.tencent.mm.pluginsdk.ui.span.r0(context, replaceAll, replace, str, i17, bundle, onDismissListener);
        k0Var.f211854d = new com.tencent.mm.pluginsdk.ui.span.s0(onDismissListener);
        k0Var.C = new com.tencent.mm.pluginsdk.ui.span.t0(onDismissListener);
        k0Var.v();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(k0Var.f211864i.getWindow().getDecorView(), "phone_actionsheet");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(k0Var.f211864i.getWindow().getDecorView(), 32, 28603);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).rj(k0Var.f211864i.getWindow().getDecorView());
    }
}
