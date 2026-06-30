package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class u4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.y4 f141788d;

    public u4(com.tencent.mm.plugin.game.ui.y4 y4Var) {
        this.f141788d = y4Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameListAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!(view.getTag() instanceof com.tencent.mm.plugin.game.model.b)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameListAdapter", "No button tag retrived, ignore click");
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameListAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.game.model.b bVar = (com.tencent.mm.plugin.game.model.b) view.getTag();
        com.tencent.mm.plugin.game.ui.y4 y4Var = this.f141788d;
        if (!y4Var.f141881q.containsKey(bVar.field_appId)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameListAdapter", "No DownloadInfo found");
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameListAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.game.model.c0 c0Var = (com.tencent.mm.plugin.game.model.c0) y4Var.f141881q.get(bVar.field_appId);
        c0Var.a(y4Var.f141878n);
        com.tencent.mm.plugin.game.ui.s sVar = y4Var.f141883s;
        sVar.f141747h = bVar.f140221x2;
        sVar.f141746g = y4Var.f141880p;
        sVar.a(bVar, c0Var);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameListAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
