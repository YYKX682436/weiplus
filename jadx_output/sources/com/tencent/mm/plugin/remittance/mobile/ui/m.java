package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class m extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI f156691d;

    public m(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI mobileRemitHistoryRecodUI) {
        this.f156691d = mobileRemitHistoryRecodUI;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitHistoryRecodUI$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI mobileRemitHistoryRecodUI = this.f156691d;
        int i18 = mobileRemitHistoryRecodUI.f156571o;
        com.tencent.mm.plugin.remittance.mobile.ui.v vVar = mobileRemitHistoryRecodUI.f156570n;
        boolean z17 = vVar.f156724d;
        vVar.getItemCount();
        if (i17 == 0) {
            com.tencent.mm.plugin.remittance.mobile.ui.v vVar2 = mobileRemitHistoryRecodUI.f156570n;
            if (!vVar2.f156724d && mobileRemitHistoryRecodUI.f156571o + 1 == vVar2.getItemCount()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "doFetchHistoryRecord() mLastId:%s", mobileRemitHistoryRecodUI.f156566g);
                mobileRemitHistoryRecodUI.doSceneProgress(new sw3.f(mobileRemitHistoryRecodUI.f156566g, mobileRemitHistoryRecodUI.f156565f), false);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitHistoryRecodUI$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitHistoryRecodUI$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI mobileRemitHistoryRecodUI = this.f156691d;
        mobileRemitHistoryRecodUI.f156571o = mobileRemitHistoryRecodUI.f156569m.y();
        yj0.a.h(this, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitHistoryRecodUI$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
