package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class rl implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.sl f129784d;

    public rl(com.tencent.mm.plugin.finder.ui.sl slVar) {
        this.f129784d = slVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/MaasAlbumTemplateHelper$setupClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).getClass();
        vy0.g gVar = vy0.g.f441414a;
        boolean a17 = gVar.a("scene_finder_v2");
        com.tencent.mm.plugin.finder.ui.sl slVar = this.f129784d;
        if (a17) {
            com.tencent.mm.plugin.finder.ui.FinderAlbumUI finderAlbumUI = slVar.f129820a;
            finderAlbumUI.getClass();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(finderAlbumUI.f138528m.f247131g);
            if (!arrayList2.isEmpty()) {
                ut3.f.f431176c.f431177a = finderAlbumUI;
                finderAlbumUI.g8(arrayList2);
            }
            yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/MaasAlbumTemplateHelper$setupClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).getClass();
        boolean z17 = gVar.b().getBoolean("scene_finder_v2".concat("_requested"), false);
        com.tencent.mars.xlog.Log.i("MaasPermissionCheckHelp", "hasRequested for scene_finder_v2, hasRequestes: " + z17);
        if (z17) {
            com.tencent.mars.xlog.Log.i("MaasAlbumTemplateHelper", "requested maas permission and denied");
            com.tencent.mm.plugin.finder.ui.sl.a(slVar, true);
        } else {
            com.tencent.mm.plugin.finder.ui.sl.b(slVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/MaasAlbumTemplateHelper$setupClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
