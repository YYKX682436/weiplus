package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class e0 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameCategoryUI f141370d;

    public e0(com.tencent.mm.plugin.game.ui.GameCategoryUI gameCategoryUI) {
        this.f141370d = gameCategoryUI;
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
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameCategoryUI$4", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameCategoryUI$4", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameCategoryUI$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        java.lang.String str = "(Landroid/widget/AbsListView;I)V";
        if (i17 == 0 && absListView.getLastVisiblePosition() == absListView.getCount() - 1) {
            com.tencent.mm.plugin.game.ui.GameCategoryUI gameCategoryUI = this.f141370d;
            if (!gameCategoryUI.f140691m || gameCategoryUI.f140689h) {
                yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameCategoryUI$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
                return;
            }
            android.view.View view = gameCategoryUI.f140687f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/GameCategoryUI$4", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/game/ui/GameCategoryUI$4", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            gm0.j1.d().g(new com.tencent.mm.plugin.game.model.h3(gameCategoryUI.f140690i, 15, gameCategoryUI.f140692n, gameCategoryUI.f140693o));
            gameCategoryUI.f140689h = true;
            str = "(Landroid/widget/AbsListView;I)V";
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameCategoryUI$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", str);
    }
}
