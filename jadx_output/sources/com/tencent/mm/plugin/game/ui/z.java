package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f141890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameBlockView f141891e;

    public z(com.tencent.mm.plugin.game.ui.GameBlockView gameBlockView, int i17) {
        this.f141891e = gameBlockView;
        this.f141890d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameBlockView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null || !(view.getTag() instanceof java.lang.String)) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameBlockView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String str = (java.lang.String) view.getTag();
        com.tencent.mm.plugin.game.ui.GameBlockView gameBlockView = this.f141891e;
        com.tencent.mm.game.report.l.c(gameBlockView.getContext(), 10, 1002, 99, r53.f.v(gameBlockView.getContext(), str, "game_center_mygame_more", null), this.f141890d, null);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameBlockView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
