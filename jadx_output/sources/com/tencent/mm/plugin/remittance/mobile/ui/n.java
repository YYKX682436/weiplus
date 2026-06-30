package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class n implements androidx.recyclerview.widget.v2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI f156694d;

    public n(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI mobileRemitHistoryRecodUI) {
        this.f156694d = mobileRemitHistoryRecodUI;
    }

    @Override // androidx.recyclerview.widget.v2
    public void a(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitHistoryRecodUI$4", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitHistoryRecodUI$4", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
    }

    @Override // androidx.recyclerview.widget.v2
    public boolean b(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI mobileRemitHistoryRecodUI = this.f156694d;
        mobileRemitHistoryRecodUI.f156572p[0] = (int) motionEvent.getRawX();
        mobileRemitHistoryRecodUI.f156572p[1] = (int) motionEvent.getRawY();
        int i17 = mobileRemitHistoryRecodUI.f156572p[0];
        int i18 = mobileRemitHistoryRecodUI.f156572p[1];
        return false;
    }

    @Override // androidx.recyclerview.widget.v2
    public void c(boolean z17) {
    }
}
