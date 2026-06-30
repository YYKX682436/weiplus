package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class l0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s83.l f142894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f142895e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.m0 f142896f;

    public l0(com.tencent.mm.plugin.ipcall.ui.m0 m0Var, s83.l lVar, int i17) {
        this.f142896f = m0Var;
        this.f142894d = lVar;
        this.f142895e = i17;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (i17 == 0) {
            com.tencent.mm.plugin.ipcall.ui.m0 m0Var = this.f142896f;
            m0Var.getClass();
            s83.l lVar = this.f142894d;
            if (lVar.field_addressId > 0) {
                s83.m Vi = com.tencent.mm.plugin.ipcall.model.r.Vi();
                long j17 = lVar.field_addressId;
                Vi.getClass();
                if (j17 > 0) {
                    Vi.f404888d.delete("IPCallRecord", "addressId=?", new java.lang.String[]{java.lang.String.valueOf(j17)});
                }
            } else {
                s83.m Vi2 = com.tencent.mm.plugin.ipcall.model.r.Vi();
                java.lang.String str = lVar.field_phonenumber;
                Vi2.getClass();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    Vi2.f404888d.delete("IPCallRecord", "phonenumber=?", new java.lang.String[]{str});
                }
            }
            com.tencent.mm.plugin.ipcall.ui.j3 j3Var = m0Var.f142930b;
            j3Var.f142880q.remove(this.f142895e);
            j3Var.notifyDataSetChanged();
            if (m0Var.f142930b.getCount() > 0) {
                android.view.View view = m0Var.f142931c;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "deleteRecordIntenal", "(Lcom/tencent/mm/plugin/ipcall/model/storage/IPCallRecord;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "deleteRecordIntenal", "(Lcom/tencent/mm/plugin/ipcall/model/storage/IPCallRecord;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            android.view.View view2 = m0Var.f142931c;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "deleteRecordIntenal", "(Lcom/tencent/mm/plugin/ipcall/model/storage/IPCallRecord;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "deleteRecordIntenal", "(Lcom/tencent/mm/plugin/ipcall/model/storage/IPCallRecord;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
