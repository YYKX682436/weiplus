package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class n4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.model.y1 f141674d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.o4 f141675e;

    public n4(com.tencent.mm.plugin.game.ui.o4 o4Var, com.tencent.mm.plugin.game.model.y1 y1Var) {
        this.f141675e = o4Var;
        this.f141674d = y1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.o4 o4Var = this.f141675e;
        com.tencent.mm.plugin.game.ui.GameLibraryUI gameLibraryUI = o4Var.f141694e;
        com.tencent.mm.plugin.game.ui.GameLibraryUI.T6(gameLibraryUI, this.f141674d, gameLibraryUI.f140911s != 0);
        com.tencent.mm.plugin.game.ui.GameLibraryUI gameLibraryUI2 = o4Var.f141694e;
        gameLibraryUI2.f140910r = false;
        android.view.View view = gameLibraryUI2.f140913u;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/GameLibraryUI$9$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/ui/GameLibraryUI$9$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.game.ui.GameLibraryUI gameLibraryUI3 = o4Var.f141694e;
        gameLibraryUI3.f140911s += 15;
        android.app.Dialog dialog = gameLibraryUI3.f140917y;
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
