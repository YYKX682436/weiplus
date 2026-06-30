package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes4.dex */
public class j2 implements com.tencent.mm.ui.y9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI f142877a;

    public j2(com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI iPCallMsgUI) {
        this.f142877a = iPCallMsgUI;
    }

    @Override // com.tencent.mm.ui.y9
    public void a(java.lang.Object obj) {
    }

    @Override // com.tencent.mm.ui.y9
    public void b(java.lang.Object obj) {
        com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI iPCallMsgUI = this.f142877a;
        if (iPCallMsgUI.f142633e.getCount() == 0) {
            iPCallMsgUI.f142632d.setVisibility(8);
            android.view.View view = iPCallMsgUI.f142635g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI$3", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI$3", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        iPCallMsgUI.f142632d.setVisibility(0);
        android.view.View view2 = iPCallMsgUI.f142635g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI$3", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI$3", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
