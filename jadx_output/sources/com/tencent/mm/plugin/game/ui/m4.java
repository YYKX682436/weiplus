package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class m4 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameLibraryUI f141472d;

    public m4(com.tencent.mm.plugin.game.ui.GameLibraryUI gameLibraryUI) {
        this.f141472d = gameLibraryUI;
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
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameLibraryUI$8", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameLibraryUI$8", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameLibraryUI$8", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        java.lang.String str = "(Landroid/widget/AbsListView;I)V";
        if (i17 == 0 && absListView.getLastVisiblePosition() == absListView.getCount() - 1) {
            com.tencent.mm.plugin.game.ui.GameLibraryUI gameLibraryUI = this.f141472d;
            if (!gameLibraryUI.f140912t || gameLibraryUI.f140910r) {
                yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameLibraryUI$8", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
                return;
            }
            android.view.View view = gameLibraryUI.f140913u;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/GameLibraryUI$8", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/game/ui/GameLibraryUI$8", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            gameLibraryUI.U6();
            str = "(Landroid/widget/AbsListView;I)V";
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameLibraryUI$8", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", str);
    }
}
