package s61;

/* loaded from: classes8.dex */
public class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.friend.ui.InviteFriendUI f403358d;

    public i0(com.tencent.mm.plugin.account.friend.ui.InviteFriendUI inviteFriendUI) {
        this.f403358d = inviteFriendUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/friend/ui/InviteFriendUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.friend.ui.InviteFriendUI inviteFriendUI = this.f403358d;
        int i17 = inviteFriendUI.f73151d;
        if (i17 != 0) {
            if (i17 == 1) {
                java.lang.String str = (java.lang.String) gm0.j1.u().c().l(42, "");
                if (str == null || str.length() == 0) {
                    str = (java.lang.String) gm0.j1.u().c().l(2, "");
                }
                java.lang.String string = inviteFriendUI.getString(com.tencent.mm.R.string.f492329g26, str);
                android.net.Uri parse = android.net.Uri.parse("smsto:" + inviteFriendUI.f73152e);
                android.content.Intent intent = new android.content.Intent("android.intent.action.SENDTO", parse);
                intent.putExtra("sms_body", string);
                android.content.pm.PackageManager packageManager = inviteFriendUI.getPackageManager();
                java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                java.util.HashMap hashMap = new java.util.HashMap();
                if (queryIntentActivities != null) {
                    for (android.content.pm.ResolveInfo resolveInfo : queryIntentActivities) {
                        if (!resolveInfo.activityInfo.packageName.equals("com.whatsapp")) {
                            hashMap.put(resolveInfo.activityInfo.name, resolveInfo);
                        }
                    }
                }
                if (hashMap.size() == 1) {
                    java.util.Iterator it = hashMap.keySet().iterator();
                    if (it.hasNext()) {
                        java.lang.String str2 = (java.lang.String) it.next();
                        android.content.Intent intent2 = new android.content.Intent();
                        intent2.setComponent(new android.content.ComponentName(((android.content.pm.ResolveInfo) hashMap.get(str2)).activityInfo.packageName, ((android.content.pm.ResolveInfo) hashMap.get(str2)).activityInfo.name));
                        intent2.setAction("android.intent.action.SENDTO");
                        intent2.setData(parse);
                        intent2.putExtra("sms_body", string);
                        com.tencent.mm.plugin.account.friend.ui.InviteFriendUI inviteFriendUI2 = this.f403358d;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent2);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(inviteFriendUI2, arrayList2.toArray(), "com/tencent/mm/plugin/account/friend/ui/InviteFriendUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        inviteFriendUI2.startActivity((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(inviteFriendUI2, "com/tencent/mm/plugin/account/friend/ui/InviteFriendUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        com.tencent.mm.plugin.account.friend.ui.InviteFriendUI.T6(inviteFriendUI);
                    }
                } else if (hashMap.size() > 1) {
                    android.view.LayoutInflater.from(inviteFriendUI);
                    com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) inviteFriendUI, 1, false);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    new java.util.ArrayList();
                    s61.d0 d0Var = new s61.d0(this, hashMap, packageManager);
                    s61.e0 e0Var = new s61.e0(this, hashMap);
                    s61.f0 f0Var = new s61.f0(this, hashMap, parse, string);
                    java.util.Iterator it6 = arrayList3.iterator();
                    while (it6.hasNext()) {
                        db5.h4 h4Var = (db5.h4) ((android.view.MenuItem) it6.next());
                        h4Var.f228381y = null;
                        h4Var.f228382z = null;
                    }
                    arrayList3.clear();
                    db5.g4 g4Var = new db5.g4(inviteFriendUI);
                    e0Var.onCreateMMMenu(g4Var);
                    if (g4Var.z()) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
                    } else {
                        k0Var.f211872n = e0Var;
                        k0Var.f211881s = f0Var;
                        k0Var.f211854d = null;
                        k0Var.G = d0Var;
                        k0Var.v();
                    }
                    com.tencent.mm.plugin.account.friend.ui.InviteFriendUI.T6(inviteFriendUI);
                } else {
                    dp.a.makeText(inviteFriendUI, com.tencent.mm.R.string.igz, 1).show();
                }
            } else if (i17 == 2) {
                s61.f1 f1Var = new s61.f1(inviteFriendUI, new s61.h0(this));
                java.lang.String str3 = inviteFriendUI.f73154g;
                java.lang.String str4 = inviteFriendUI.f73152e;
                gm0.j1.d().a(489, f1Var);
                ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
                android.database.Cursor D0 = m61.k.Di().D0(str3);
                if (D0 == null || D0.getCount() <= 1) {
                    f1Var.a(str4);
                } else {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    D0.moveToFirst();
                    int count = D0.getCount();
                    for (int i18 = 0; i18 < count; i18++) {
                        r61.s0 s0Var = new r61.s0();
                        s0Var.convertFrom(D0);
                        arrayList4.add(s0Var.field_googlegmail);
                        arrayList5.add(java.lang.Integer.valueOf(i18));
                        arrayList6.add(s0Var);
                        D0.moveToNext();
                    }
                    arrayList5.add(-1);
                    android.content.Context context = f1Var.f403348d;
                    db5.e1.c(context, context.getResources().getString(com.tencent.mm.R.string.fqx), arrayList4, arrayList5, null, context.getResources().getString(com.tencent.mm.R.string.f490347sg), true, new s61.b1(f1Var, arrayList6), null);
                }
                if (D0 != null) {
                    D0.close();
                }
            }
        } else {
            int[] iArr = {kk.v.b(inviteFriendUI.f73152e)};
            s61.a1 a1Var = new s61.a1(inviteFriendUI, new s61.g0(this));
            gm0.j1.d().a(116, a1Var);
            r61.p1 p1Var = new r61.p1(iArr);
            gm0.j1.d().g(p1Var);
            if (a1Var.f403321g) {
                a1Var.f403320f = db5.e1.Q(inviteFriendUI, inviteFriendUI.getString(com.tencent.mm.R.string.g2a), inviteFriendUI.getString(com.tencent.mm.R.string.g29), true, true, new s61.x0(a1Var, p1Var));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/friend/ui/InviteFriendUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
