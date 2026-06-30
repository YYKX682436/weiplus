package com.tencent.mm.pluginsdk.ui.span;

/* loaded from: classes11.dex */
public class r0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f191279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f191280e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f191281f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f191282g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f191283h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnDismissListener f191284i;

    public r0(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, android.os.Bundle bundle, android.content.DialogInterface.OnDismissListener onDismissListener) {
        this.f191279d = context;
        this.f191280e = str;
        this.f191281f = str2;
        this.f191282g = str3;
        this.f191283h = bundle;
        this.f191284i = onDismissListener;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        android.content.DialogInterface.OnDismissListener onDismissListener = this.f191284i;
        if (itemId != 1) {
            java.lang.String str = this.f191281f;
            android.content.Context context = this.f191279d;
            if (itemId == 2) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12059, 0, 0, 0, 0, 0);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("IPCallTalkUI_phoneNumber", str);
                j45.l.j(context, "ipcall", ".ui.IPCallDialUI", intent, null);
            } else if (itemId == 3) {
                android.app.Activity activity = (android.app.Activity) context;
                android.os.Bundle bundle = this.f191283h;
                java.lang.String string = bundle.getString("Contact_User");
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                java.lang.String str2 = string != null ? string : "";
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
                if (n17 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MailPhoneMenuHelper", "contact is null");
                } else {
                    java.lang.String string2 = bundle.getString("Contact_Mobile_MD5");
                    java.lang.String str3 = n17.E1;
                    boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(string2);
                    java.lang.String str4 = this.f191282g;
                    int i18 = (K0 || string2 == str4 || n17.p2()) ? 0 : 1;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                        java.lang.String[] c17 = com.tencent.mm.contact.a.c(n17, str3);
                        if (c17 != null) {
                            for (java.lang.String str5 : c17) {
                                arrayList.add(str5);
                            }
                        }
                        if (arrayList.contains(str4)) {
                            arrayList.remove(str4);
                        }
                    }
                    arrayList.add(str4);
                    if (arrayList.size() + i18 <= 5) {
                        r45.qo4 qo4Var = new r45.qo4();
                        qo4Var.f384148d = str2;
                        r45.c85 c85Var = new r45.c85();
                        c85Var.f371374e = new java.util.LinkedList();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.util.Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            java.lang.String str6 = (java.lang.String) it.next();
                            if (aq1.e.d(str6)) {
                                r45.b85 b85Var = new r45.b85();
                                b85Var.f370631d = str6;
                                c85Var.f371374e.add(b85Var);
                                arrayList2.add(str6);
                            }
                        }
                        c85Var.f371373d = arrayList2.size();
                        qo4Var.f384149e = c85Var;
                        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(60, qo4Var));
                        if (((int) n17.E2) > 0 && n17.r2()) {
                            n17.a3(com.tencent.mm.contact.a.a(arrayList));
                            com.tencent.mm.contact.a.d(n17);
                            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().l0(n17);
                        }
                        dp.a.makeText(activity, activity.getString(com.tencent.mm.R.string.jnm), 0).show();
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12040, n17.d1(), 4, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(arrayList.size() + i18));
                    } else {
                        dp.a.makeText(activity, activity.getString(com.tencent.mm.R.string.f492558gz2), 0).show();
                    }
                }
            } else if (itemId == 4) {
                com.tencent.mm.sdk.platformtools.b0.d(context, str, str, null);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10115, "1");
                dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f490361st), 1).show();
            } else if (itemId == 5) {
                java.lang.String[] stringArray = (com.tencent.mm.pluginsdk.ui.span.u0.b() && com.tencent.mm.sdk.platformtools.t8.I0(com.tencent.mm.sdk.platformtools.x2.f193071a, new android.content.Intent("android.intent.action.PICK", android.provider.ContactsContract.Contacts.CONTENT_URI), false, false)) ? context.getResources().getStringArray(com.tencent.mm.R.array.f478015a2) : com.tencent.mm.pluginsdk.ui.span.u0.b() ? new java.lang.String[]{context.getResources().getString(com.tencent.mm.R.string.b4z)} : new java.lang.String[]{context.getResources().getString(com.tencent.mm.R.string.f490880b55)};
                context.getResources().getString(com.tencent.mm.R.string.f490879b54);
                android.view.LayoutInflater.from(context);
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                new java.util.ArrayList();
                com.tencent.mm.pluginsdk.ui.span.g0 g0Var = new com.tencent.mm.pluginsdk.ui.span.g0(stringArray);
                com.tencent.mm.pluginsdk.ui.span.h0 h0Var = new com.tencent.mm.pluginsdk.ui.span.h0(context, str, onDismissListener);
                com.tencent.mm.pluginsdk.ui.span.i0 i0Var = new com.tencent.mm.pluginsdk.ui.span.i0(onDismissListener);
                k0Var.f211854d = i0Var;
                java.util.Iterator it6 = arrayList3.iterator();
                while (it6.hasNext()) {
                    db5.h4 h4Var = (db5.h4) ((android.view.MenuItem) it6.next());
                    h4Var.f228381y = null;
                    h4Var.f228382z = null;
                }
                arrayList3.clear();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                int i19 = 0;
                while (true) {
                    java.lang.String[] strArr = g0Var.f191211d;
                    if (i19 >= strArr.length) {
                        break;
                    }
                    java.lang.String str7 = strArr[i19];
                    db5.h4 h4Var2 = new db5.h4(context, i19, 0);
                    h4Var2.f228368i = str7;
                    arrayList4.add(h4Var2);
                    i19++;
                }
                if (arrayList4.size() == 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
                } else {
                    k0Var.f211872n = g0Var;
                    k0Var.f211881s = h0Var;
                    k0Var.f211854d = i0Var;
                    k0Var.G = null;
                    k0Var.v();
                }
            }
        } else {
            android.content.Context context2 = this.f191279d;
            android.content.Intent intent2 = new android.content.Intent("android.intent.action.DIAL", android.net.Uri.parse("tel:" + this.f191280e));
            intent2.addFlags(268435456);
            boolean I0 = com.tencent.mm.sdk.platformtools.t8.I0(context2, intent2, true, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.MailPhoneMenuHelper", "isIntentAvailable:%s", java.lang.Boolean.valueOf(I0));
            if (I0) {
                try {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(intent2);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(context2, arrayList5.toArray(), "com/tencent/mm/pluginsdk/ui/span/MailPhoneMenuHelper", "gotoPhoneCall", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context2.startActivity((android.content.Intent) arrayList5.get(0));
                    yj0.a.f(context2, "com/tencent/mm/pluginsdk/ui/span/MailPhoneMenuHelper", "gotoPhoneCall", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MailPhoneMenuHelper", e17, "", new java.lang.Object[0]);
                }
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10112, "1");
        }
        if (onDismissListener == null || menuItem.getItemId() == 5) {
            return;
        }
        onDismissListener.onDismiss(null);
    }
}
