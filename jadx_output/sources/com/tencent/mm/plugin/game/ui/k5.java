package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class k5 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameMessageUI f141448d;

    public k5(com.tencent.mm.plugin.game.ui.GameMessageUI gameMessageUI) {
        this.f141448d = gameMessageUI;
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
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameMessageUI$4", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameMessageUI$4", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameMessageUI$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i17 == 0 && absListView.getLastVisiblePosition() == absListView.getCount() - 1) {
            com.tencent.mm.plugin.game.ui.GameMessageUI gameMessageUI = this.f141448d;
            com.tencent.mm.plugin.game.ui.b5 b5Var = gameMessageUI.f140932i;
            int i18 = b5Var.f141051s;
            int i19 = b5Var.f141052t;
            if (!(i18 >= i19)) {
                if (i18 >= i19) {
                    com.tencent.mm.ui.y9 y9Var = b5Var.f212611h;
                    if (y9Var != null) {
                        y9Var.b(null);
                    }
                } else {
                    int i27 = i18 + 15;
                    b5Var.f141051s = i27;
                    if (i27 > i19) {
                        b5Var.f141051s = i19;
                    }
                }
                gameMessageUI.f140932i.onNotifyChange(null, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameMessageUI$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
