package com.tencent.mm.ui.contact;

/* loaded from: classes3.dex */
public class m7 implements android.widget.AbsListView.OnScrollListener {
    public m7(com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment openIMAddressUIFragment) {
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
        yj0.a.b("com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment$12", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMAddressUI", "[onScroll] firstVisibleItem:%s", java.lang.Integer.valueOf(i17));
        yj0.a.h(this, "com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment$12", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment$12", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMAddressUI", "[onScrollStateChanged] scrollState:%s", java.lang.Integer.valueOf(i17));
        yj0.a.h(this, "com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment$12", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
