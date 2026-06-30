package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class l5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameMessageUI f141458d;

    public l5(com.tencent.mm.plugin.game.ui.GameMessageUI gameMessageUI) {
        this.f141458d = gameMessageUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameMessageUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.ui.GameMessageUI gameMessageUI = this.f141458d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(gameMessageUI.f140938r)) {
            com.tencent.mm.game.report.l.c(gameMessageUI.getContext(), 13, com.tencent.mm.plugin.appbrand.jsapi.finder.v.CTRL_INDEX, 1, r53.f.v(gameMessageUI.getContext(), gameMessageUI.f140938r, null, null), gameMessageUI.f140935o, null);
        }
        gameMessageUI.f140936p = true;
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameMessageUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
