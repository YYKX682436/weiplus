package hr3;

/* loaded from: classes10.dex */
public final class cd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.RecommendDeleteContactUI f283453d;

    public cd(com.tencent.mm.plugin.profile.ui.RecommendDeleteContactUI recommendDeleteContactUI) {
        this.f283453d = recommendDeleteContactUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/RecommendDeleteContactUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.profile.ui.RecommendDeleteContactUI recommendDeleteContactUI = this.f283453d;
        if (!recommendDeleteContactUI.f153795o) {
            yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/RecommendDeleteContactUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        recommendDeleteContactUI.U6();
        recommendDeleteContactUI.Y6(false);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("infrequentcontactsortpage_refresh_button", "view_clk", kz5.b1.e(new jz5.l("contacts_max_limit_sort_sessionid", recommendDeleteContactUI.W6())), 32337);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/RecommendDeleteContactUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
