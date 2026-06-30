package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class v5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI f143044d;

    public v5(com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI iPCallUserProfileUI) {
        this.f143044d = iPCallUserProfileUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String substring;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI iPCallUserProfileUI = this.f143044d;
        iPCallUserProfileUI.A.d();
        q83.d dVar = iPCallUserProfileUI.A;
        dVar.f360754b = 1;
        dVar.f360755c = 5;
        dVar.b();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12766, 3);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(iPCallUserProfileUI.f142734t)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("smsto:");
            java.lang.String str = iPCallUserProfileUI.f142734t;
            iPCallUserProfileUI.getClass();
            java.lang.String str2 = "";
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            ((sb0.f) jVar).getClass();
            if (j35.u.d(context, "android.permission.READ_CONTACTS", true)) {
                android.database.Cursor query = com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver().query(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id=?", new java.lang.String[]{str}, null);
                if (query != null) {
                    try {
                        try {
                            if (query.moveToFirst()) {
                                while (!query.isAfterLast()) {
                                    str2 = str2 + query.getString(query.getColumnIndex("data1")) + ",";
                                    query.moveToNext();
                                }
                            }
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.IPCallUserProfileUI", "extractAddressItemFromCursor, error: %s, class: %s", e17.getMessage(), e17.getClass().getSimpleName());
                        }
                        query.close();
                        substring = str2.lastIndexOf(",") >= 0 ? str2.substring(0, str2.lastIndexOf(",")) : str2;
                        sb6.append(substring);
                        android.content.Intent intent = new android.content.Intent("android.intent.action.SENDTO", android.net.Uri.parse(sb6.toString()));
                        intent.putExtra("sms_body", iPCallUserProfileUI.getString(com.tencent.mm.R.string.g3v, c01.z1.g().f2()));
                        com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI iPCallUserProfileUI2 = this.f143044d;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(iPCallUserProfileUI2, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        iPCallUserProfileUI2.startActivity((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(iPCallUserProfileUI2, "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } catch (java.lang.Throwable th6) {
                        query.close();
                        throw th6;
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.IPCallUserProfileUI", "no contact permission");
            }
            substring = null;
            sb6.append(substring);
            android.content.Intent intent2 = new android.content.Intent("android.intent.action.SENDTO", android.net.Uri.parse(sb6.toString()));
            intent2.putExtra("sms_body", iPCallUserProfileUI.getString(com.tencent.mm.R.string.g3v, c01.z1.g().f2()));
            com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI iPCallUserProfileUI22 = this.f143044d;
            java.util.ArrayList arrayList22 = new java.util.ArrayList();
            arrayList22.add(intent2);
            java.util.Collections.reverse(arrayList22);
            yj0.a.d(iPCallUserProfileUI22, arrayList22.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            iPCallUserProfileUI22.startActivity((android.content.Intent) arrayList22.get(0));
            yj0.a.f(iPCallUserProfileUI22, "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(iPCallUserProfileUI.f142735u)) {
            android.content.Intent intent3 = new android.content.Intent("android.intent.action.SENDTO", android.net.Uri.parse("smsto:" + iPCallUserProfileUI.f142735u));
            intent3.putExtra("sms_body", iPCallUserProfileUI.getString(com.tencent.mm.R.string.g3v, c01.z1.g().f2()));
            com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI iPCallUserProfileUI3 = this.f143044d;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent3);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(iPCallUserProfileUI3, arrayList3.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            iPCallUserProfileUI3.startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(iPCallUserProfileUI3, "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
