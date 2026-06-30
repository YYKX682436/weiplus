package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class b3 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.StatusAlbumUI f173745d;

    public b3(com.tencent.mm.plugin.textstatus.ui.StatusAlbumUI statusAlbumUI) {
        this.f173745d = statusAlbumUI;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/StatusAlbumUI$longClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.ipp);
        fj4.a aVar = tag instanceof fj4.a ? (fj4.a) tag : null;
        if (aVar == null) {
            yj0.a.i(true, this, "com/tencent/mm/plugin/textstatus/ui/StatusAlbumUI$longClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
        com.tencent.mm.plugin.textstatus.ui.StatusAlbumUI statusAlbumUI = this.f173745d;
        android.app.Activity context = statusAlbumUI.getContext();
        if (context == null) {
            yj0.a.i(true, this, "com/tencent/mm/plugin/textstatus/ui/StatusAlbumUI$longClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
        android.view.LayoutInflater.from(context);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) context, 1, false);
        db5.g4 g4Var = new db5.g4(context);
        new db5.g4(context);
        com.tencent.mm.plugin.textstatus.ui.z2 z2Var = com.tencent.mm.plugin.textstatus.ui.z2.f174471d;
        mj4.h hVar = aVar.f263224e;
        if (hVar == null) {
            yj0.a.i(true, this, "com/tencent/mm/plugin/textstatus/ui/StatusAlbumUI$longClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
        com.tencent.mm.plugin.textstatus.ui.a3 a3Var = new com.tencent.mm.plugin.textstatus.ui.a3(statusAlbumUI, context, ((mj4.k) hVar).l());
        g4Var.clear();
        db5.g4 g4Var2 = new db5.g4(context);
        z2Var.onCreateMMMenu(g4Var2);
        if (g4Var2.z()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
        } else {
            k0Var.f211872n = z2Var;
            k0Var.f211881s = a3Var;
            k0Var.f211854d = null;
            k0Var.G = null;
            k0Var.v();
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/textstatus/ui/StatusAlbumUI$longClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
