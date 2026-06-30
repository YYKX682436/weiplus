package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class a1 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI f162238d;

    public a1(com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI shakeTvHistoryListUI) {
        this.f162238d = shakeTvHistoryListUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/shake/ui/ShakeTvHistoryListUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI shakeTvHistoryListUI = this.f162238d;
        h34.z.a((h34.h0) shakeTvHistoryListUI.f162219d.getItem(i17), shakeTvHistoryListUI.getContext(), 2);
        yj0.a.h(this, "com/tencent/mm/plugin/shake/ui/ShakeTvHistoryListUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
