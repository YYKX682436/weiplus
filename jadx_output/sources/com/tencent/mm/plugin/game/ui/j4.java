package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class j4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameLibraryUI f141437d;

    public j4(com.tencent.mm.plugin.game.ui.GameLibraryUI gameLibraryUI) {
        this.f141437d = gameLibraryUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameLibraryUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r53.f.I(view, this.f141437d);
        com.tencent.mm.plugin.game.ui.GameLibraryUI gameLibraryUI = this.f141437d;
        com.tencent.mm.game.report.l.c(gameLibraryUI, 11, 1110, 999, 7, gameLibraryUI.A, null);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameLibraryUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
