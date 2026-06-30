package w82;

/* loaded from: classes10.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.widget.FavFilterPanel f443943d;

    public x(com.tencent.mm.plugin.fav.ui.widget.FavFilterPanel favFilterPanel) {
        this.f443943d = favFilterPanel;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/widget/FavFilterPanel$initView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.fav.ui.widget.FavFilterPanel favFilterPanel = this.f443943d;
        int i17 = favFilterPanel.f101542u;
        if (i17 == 1) {
            com.tencent.mm.plugin.fav.ui.widget.FavFilterPanel.b(favFilterPanel, false, null, 3, null);
        } else if (!favFilterPanel.f101543v) {
            if (i17 == -1 || i17 == 1) {
                favFilterPanel.d(1);
            } else {
                favFilterPanel.a(false, new w82.t(favFilterPanel, 1));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/widget/FavFilterPanel$initView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
