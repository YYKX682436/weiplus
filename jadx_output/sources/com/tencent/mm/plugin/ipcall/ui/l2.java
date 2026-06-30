package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes4.dex */
public class l2 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI f142898d;

    public l2(com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI iPCallMsgUI) {
        this.f142898d = iPCallMsgUI;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI$5", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI$5", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI$5", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (absListView.getLastVisiblePosition() != absListView.getCount() - 1) {
            yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI$5", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
            return;
        }
        com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI iPCallMsgUI = this.f142898d;
        com.tencent.mm.plugin.ipcall.ui.q2 q2Var = iPCallMsgUI.f142633e;
        int i18 = q2Var.f142986o;
        int i19 = q2Var.f142987p;
        if (i18 >= i19) {
            com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI iPCallMsgUI2 = q2Var.f142988q;
            if (iPCallMsgUI2.f142634f.getParent() != null) {
                iPCallMsgUI2.f142632d.removeFooterView(iPCallMsgUI2.f142634f);
            }
        } else {
            int i27 = i18 + 10;
            q2Var.f142986o = i27;
            if (i27 > i19) {
                q2Var.f142986o = i19;
                int i28 = i19 % 10;
            }
        }
        iPCallMsgUI.f142633e.onNotifyChange(null, null);
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI$5", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
