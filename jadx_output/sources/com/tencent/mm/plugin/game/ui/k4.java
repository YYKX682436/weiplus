package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class k4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameLibraryUI f141447d;

    public k4(com.tencent.mm.plugin.game.ui.GameLibraryUI gameLibraryUI) {
        this.f141447d = gameLibraryUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameLibraryUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = view.getTag() instanceof java.lang.String;
        com.tencent.mm.plugin.game.ui.GameLibraryUI gameLibraryUI = this.f141447d;
        if (z17) {
            r53.f.I(view, gameLibraryUI);
            i17 = 7;
        } else {
            android.content.Intent intent = new android.content.Intent(gameLibraryUI, (java.lang.Class<?>) com.tencent.mm.plugin.game.ui.GameCategoryUI.class);
            intent.putExtra("extra_type", 2);
            intent.putExtra("extra_category_name", gameLibraryUI.getString(com.tencent.mm.R.string.fmt));
            intent.putExtra("game_report_from_scene", 1113);
            com.tencent.mm.plugin.game.ui.GameLibraryUI gameLibraryUI2 = this.f141447d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(gameLibraryUI2, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/GameLibraryUI$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            gameLibraryUI2.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(gameLibraryUI2, "com/tencent/mm/plugin/game/ui/GameLibraryUI$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            i17 = 6;
        }
        com.tencent.mm.plugin.game.ui.GameLibraryUI gameLibraryUI3 = this.f141447d;
        com.tencent.mm.game.report.l.c(gameLibraryUI3, 11, 1113, 1, i17, gameLibraryUI3.A, null);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameLibraryUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
