package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class t2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameDetailUI2 f141762d;

    public t2(com.tencent.mm.plugin.game.ui.GameDetailUI2 gameDetailUI2) {
        this.f141762d = gameDetailUI2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameDetailUI2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.ui.GameDetailUI2 gameDetailUI2 = this.f141762d;
        if (gameDetailUI2.f140752n) {
            gameDetailUI2.f140750i.setMaxLines(3);
            gameDetailUI2.f140751m.setText(gameDetailUI2.getResources().getText(com.tencent.mm.R.string.flo));
            gameDetailUI2.f140752n = false;
        } else {
            gameDetailUI2.f140750i.setMaxLines(100);
            gameDetailUI2.f140751m.setText(gameDetailUI2.getResources().getText(com.tencent.mm.R.string.flp));
            gameDetailUI2.f140752n = true;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameDetailUI2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
