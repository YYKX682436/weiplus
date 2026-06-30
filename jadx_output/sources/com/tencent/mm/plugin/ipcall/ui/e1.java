package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes3.dex */
public class e1 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallContactUI f142789d;

    public e1(com.tencent.mm.plugin.ipcall.ui.IPCallContactUI iPCallContactUI) {
        this.f142789d = iPCallContactUI;
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
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallContactUI$8", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        com.tencent.mm.plugin.ipcall.ui.IPCallContactUI iPCallContactUI = this.f142789d;
        if (iPCallContactUI.f142559q == -1) {
            iPCallContactUI.f142559q = i17;
            yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallContactUI$8", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        } else {
            if (iPCallContactUI.f142560r == -1) {
                iPCallContactUI.f142560r = i17;
            }
            yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallContactUI$8", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallContactUI$8", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        this.f142789d.hideVKB();
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallContactUI$8", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
