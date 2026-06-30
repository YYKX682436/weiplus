package com.tencent.mm.plugin.voip.widget;

/* loaded from: classes.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.widget.InviteRemindDialog f177131d;

    public c(com.tencent.mm.plugin.voip.widget.InviteRemindDialog inviteRemindDialog) {
        this.f177131d = inviteRemindDialog;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/voip/widget/InviteRemindDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.voip.widget.InviteRemindDialog inviteRemindDialog = this.f177131d;
        java.lang.String str = null;
        if (inviteRemindDialog.f177092e != null) {
            try {
                java.util.Map b17 = com.tencent.mm.plugin.voip.model.e0.b((java.lang.String) gm0.j1.u().c().l(77829, null));
                if (b17 != null) {
                    if (b17.size() > 0) {
                        if (b17.containsKey(inviteRemindDialog.f177092e)) {
                            com.tencent.mm.plugin.voip.model.e0 e0Var = (com.tencent.mm.plugin.voip.model.e0) b17.get(inviteRemindDialog.f177092e);
                            e0Var.f176465b++;
                            b17.put(inviteRemindDialog.f177092e, e0Var);
                        } else {
                            com.tencent.mm.plugin.voip.model.e0 e0Var2 = new com.tencent.mm.plugin.voip.model.e0();
                            e0Var2.f176465b++;
                            b17.put(inviteRemindDialog.f177092e, e0Var2);
                        }
                    }
                    gm0.j1.u().c().w(77829, com.tencent.mm.plugin.voip.model.e0.a(b17));
                    java.util.Iterator it = b17.entrySet().iterator();
                    while (it.hasNext()) {
                        int i17 = ((com.tencent.mm.plugin.voip.model.e0) ((java.util.Map.Entry) it.next()).getValue()).f176464a;
                    }
                } else {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    com.tencent.mm.plugin.voip.model.e0 e0Var3 = new com.tencent.mm.plugin.voip.model.e0();
                    e0Var3.f176465b++;
                    hashMap.put(inviteRemindDialog.f177092e, e0Var3);
                    gm0.j1.u().c().w(77829, com.tencent.mm.plugin.voip.model.e0.a(hashMap));
                    java.util.Iterator it6 = hashMap.entrySet().iterator();
                    while (it6.hasNext()) {
                        int i18 = ((com.tencent.mm.plugin.voip.model.e0) ((java.util.Map.Entry) it6.next()).getValue()).f176464a;
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MMInviteRemindDialog", e17, "", new java.lang.Object[0]);
            }
        }
        int i19 = inviteRemindDialog.f177093f;
        if (i19 == 0) {
            str = inviteRemindDialog.getString(com.tencent.mm.R.string.f493467kc0);
        } else if (i19 == 1) {
            str = inviteRemindDialog.getString(com.tencent.mm.R.string.kdj);
        }
        java.lang.String str2 = inviteRemindDialog.f177092e;
        gm0.j1.d().g(new com.tencent.mm.plugin.voip.model.y(str2, str, c01.e2.C(str2), 0));
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
        intent.addFlags(67108864);
        intent.putExtra("Chat_User", inviteRemindDialog.f177092e);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.j(intent, inviteRemindDialog);
        inviteRemindDialog.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/voip/widget/InviteRemindDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
