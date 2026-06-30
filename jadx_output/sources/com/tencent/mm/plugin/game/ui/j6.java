package com.tencent.mm.plugin.game.ui;

/* loaded from: classes15.dex */
public class j6 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameSearchUI f141439d;

    public j6(com.tencent.mm.plugin.game.ui.GameSearchUI gameSearchUI) {
        this.f141439d = gameSearchUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameSearchUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.game.ui.b6 b6Var = (com.tencent.mm.plugin.game.ui.b6) ((com.tencent.mm.plugin.game.ui.d6) adapterView.getAdapter()).f141367f.get(i17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(b6Var.f141060b)) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameSearchUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(b6Var.f141061c);
        com.tencent.mm.plugin.game.ui.GameSearchUI gameSearchUI = this.f141439d;
        if (K0) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(b6Var.f141060b);
            java.util.regex.Pattern pattern = com.tencent.mm.plugin.game.ui.GameSearchUI.f140966x;
            gameSearchUI.T6(linkedList, 2, true);
            gameSearchUI.U6(1);
        } else {
            int i18 = b6Var.f141063e;
            if (i18 == 1) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putCharSequence("game_app_id", b6Var.f141061c);
                bundle.putInt("game_report_from_scene", v31.i.CTRL_INDEX);
                com.tencent.mm.game.report.l.f(gameSearchUI, 14, v31.i.CTRL_INDEX, i17, r53.f.o(gameSearchUI, b6Var.f141061c, null, bundle, 0), b6Var.f141061c, gameSearchUI.f140981u, null);
            } else if (i18 != 2) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GameSearchUI", "unknowed actionType : " + b6Var.f141063e);
            } else {
                com.tencent.mm.game.report.l.f(gameSearchUI, 14, v31.i.CTRL_INDEX, i17, r53.f.v(gameSearchUI.getContext(), b6Var.f141064f, "game_center_detail", null), b6Var.f141061c, gameSearchUI.f140981u, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameSearchUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
