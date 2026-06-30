package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class g3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.j3 f142836d;

    public g3(com.tencent.mm.plugin.ipcall.ui.j3 j3Var) {
        this.f142836d = j3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        s83.c cVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallRecentRecordAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() instanceof java.lang.Integer) {
            int intValue = ((java.lang.Integer) view.getTag()).intValue();
            com.tencent.mm.plugin.ipcall.ui.j3 j3Var = this.f142836d;
            if (!t83.f.c(j3Var.f212608e)) {
                yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallRecentRecordAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            s83.l lVar = (s83.l) j3Var.f142880q.get(intValue);
            long j17 = lVar.field_addressId;
            if (j17 > 0) {
                java.util.HashMap hashMap = j3Var.f142879p;
                cVar = hashMap.containsKey(java.lang.Long.valueOf(j17)) ? (s83.c) hashMap.get(java.lang.Long.valueOf(lVar.field_addressId)) : com.tencent.mm.plugin.ipcall.model.r.wi().J0(lVar.field_addressId);
                if (cVar != null) {
                    hashMap.put(java.lang.Long.valueOf(lVar.field_addressId), cVar);
                }
            } else {
                cVar = null;
            }
            if (cVar != null) {
                android.content.Intent intent = new android.content.Intent(j3Var.f212608e, (java.lang.Class<?>) com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI.class);
                intent.putExtra("IPCallTalkUI_phoneNumber", lVar.field_phonenumber);
                intent.putExtra("IPCallTalkUI_contactId", cVar.field_contactId);
                intent.putExtra("IPCallTalkUI_nickname", cVar.field_systemAddressBookUsername);
                intent.putExtra("IPCallTalkUI_toWechatUsername", cVar.field_wechatUsername);
                intent.putExtra("IPCallTalkUI_dialScene", 3);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12059, 0, 0, 0, 0, 3);
                ((androidx.fragment.app.FragmentActivity) j3Var.f212608e).startActivityForResult(intent, 1001);
            } else {
                android.content.Intent intent2 = new android.content.Intent(j3Var.f212608e, (java.lang.Class<?>) com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI.class);
                intent2.putExtra("IPCallTalkUI_phoneNumber", lVar.field_phonenumber);
                intent2.putExtra("IPCallTalkUI_dialScene", 3);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12059, 0, 0, 0, 0, 3);
                ((androidx.fragment.app.FragmentActivity) j3Var.f212608e).startActivityForResult(intent2, 1001);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallRecentRecordAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
